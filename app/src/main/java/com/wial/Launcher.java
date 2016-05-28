package com.wial;

import demkin.sports.api.AuthData;
import demkin.sports.api.Authenticator;
import demkin.sports.api.ClubPage;
import demkin.sports.api.MessageAPI;

/**
 * Description of com.wial
 *
 * @author evgen1000end
 * @since 28.05.2016
 */
public class Launcher {

    public static void main(String[] args) throws Exception {

       // Authenticator authenticator = new Authenticator("dubm.test@yandex.ru","Sobaka1");
       // AuthData authData = authenticator.auth();

       // MessageAPI messageAPI = new MessageAPI(authData);

       // messageAPI.addMessage("1040481645","что-то с кодировкой :(");

//        Comments comments = messageAPI.findAllMessage("1040285139");
//
//        comments.getData().getComments().forEach(comment -> {
//            System.out.println(comment.getRating().getPlus()+" "+ comment.getRating().getMinus());
//
//            String id =  comment.getUser().getId();
//        });

        ClubPage clubPage = new ClubPage();

        clubPage.findAllNews("real");



    }

}
