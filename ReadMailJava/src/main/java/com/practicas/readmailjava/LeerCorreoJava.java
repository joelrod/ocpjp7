package com.practicas.readmailjava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.InputStream;

import java.util.Properties;

import javax.mail.Address;

import javax.mail.BodyPart;

import javax.mail.Flags;

import javax.mail.Folder;

import javax.mail.Message;

import javax.mail.MessagingException;

import javax.mail.Multipart;

import javax.mail.NoSuchProviderException;

import javax.mail.Part;

import javax.mail.Session;

import javax.mail.Store;

import javax.mail.internet.MimeMultipart;

import javax.mail.search.FlagTerm;

@SuppressWarnings("all")


/**
 *
 * @author ihsa
 */
public class LeerCorreoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Properties props = System.getProperties();

        // Uncomment if you are using proxy server to access Internet

        /* props.setProperty("http.proxyHost", "192.168.0.1");

         props.setProperty("http.proxyPort", "8080"); */
        props.setProperty("mail.store.protocol", "imaps");

        try {

            Session session = Session.getDefaultInstance(props, null);

            session.setDebug(true);

            Store store = session.getStore("imaps");

            //Config connect to gmail test ok
            //store.connect("imap.gmail.com", "velocirraptor79.1@gmail.com", "aeiou123");
            
            //Config ok for hotmail imap connected
            store.connect("imap-mail.outlook.com", "velocirraptor79@hotmail.com", "@marylin**13");
            

            System.out.println(store);

            //Folder inbox = store.getFolder("Inbox");
            Folder inbox = store.getFolder("Notificaciones Bank");

            inbox.open(Folder.READ_ONLY);

            FlagTerm ft = new FlagTerm(new Flags(Flags.Flag.SEEN), false);

            Message messages[] = inbox.search(ft);

            for (Message message : messages) {   

            // message.setFlag(Flags.Flag.ANSWERED, true);
               // message.setFlag(Flags.Flag.SEEN, true);
                String subject = message.getSubject();

                String content = message.getContentType();

                MimeMultipart part = (MimeMultipart) message.getContent();

                BodyPart bodyPart = part.getBodyPart(0);

                part.getContentType();

                part.getCount();

                part.getPreamble();

                try {

                    printParts(message);

                } catch (Exception e) {

// TODO Auto-generated catch block
                    e.printStackTrace();

                }

                Flags flags = message.getFlags();

                Address[] form = message.getFrom();

            }

        } catch (NoSuchProviderException e) {

            e.printStackTrace();

            System.exit(1);

        } catch (MessagingException e) {

            e.printStackTrace();

            System.exit(2);

        } catch (IOException e) {

// TODO Auto-generated catch block
            e.printStackTrace();

        }

    }

    public static void printParts(Part p) throws Exception {

        Object o = p.getContent();

        if (o instanceof String) {

            System.out.println("esto es el string");

            System.out.println((String) o);

        } else if (o instanceof Multipart) {

            System.out.println("====================> multipart");

            Multipart mp = (Multipart) o;

            int count = mp.getCount();

            for (int i = 0; i < count; i++) {

                printParts(mp.getBodyPart(i));

            }

        } else if (o instanceof InputStream) {

            System.out.println("Thisust an input stream");

            InputStream is = (InputStream) o;

            int c;

// while ((c = is.read()) != -1)
// System.out.write(c);
        }

    }

}


