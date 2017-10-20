package co.ceiba.service;


import domain.Person;

public class NotifyPersonService{

    private  EmailServices   emailServices;

    public NotifyPersonService(EmailServices emailServices ){
        this.emailServices=emailServices;

    }


    public String notify(Person person) {
        String message ="Welcome"+person.getName();
        return emailServices.sendMail(message);

    }
}
