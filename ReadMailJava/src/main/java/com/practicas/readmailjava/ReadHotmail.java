/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practicas.readmailjava;

import java.util.Properties;
import javax.mail.*;
import javax.mail.search.FlagTerm;

/**
 *
 * @author ihsa
 */
public class ReadHotmail {

    public static void main(String[] args) {

        // Create properties (disable security checks on server)
        Properties props = new Properties();

        // Get session
        Session session = Session.getDefaultInstance(props, null);

        try {
            // Get the store
            System.out.println("Conectandome");
            Store store = session.getStore("pop3");
            store.connect("smtp.live.com", "velocirraptor79@hotmail.com", "@marylin**13");
            
            //connection configuration
            Folder folder = store.getFolder("Notificaciones Bank");
            folder.open(Folder.READ_WRITE);

            //get all unread messages in the inbox
            FlagTerm ft = new FlagTerm(new Flags(Flags.Flag.SEEN), true);
            Message[] messages = folder.search(ft);

            for (int i = messages.length - 1; i >= 0; i--) {
                messages[i].setFlag(Flags.Flag.SEEN, true);
            }

            // Close connection 
            folder.close(false);
            store.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}