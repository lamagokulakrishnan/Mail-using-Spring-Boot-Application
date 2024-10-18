package com.example.SpringMail;

import com.example.SpringMail.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.Scanner;

@SpringBootApplication
public class SpringMailApplication {
	@Autowired
	private EmailSenderService senderService;

	public static void main(String[] args) {

		SpringApplication.run(SpringMailApplication.class, args);
	}

		@EventListener(ApplicationReadyEvent.class)
		public void sendMail(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mail Id : ");
		String toEmail = sc.nextLine();
		System.out.println("Enter the Subject : ");
		String subject = sc.nextLine();
		System.out.println("Enter the Body Message : ");
		String bodyMessage = sc.nextLine();

			senderService.sendEmail(toEmail,subject,bodyMessage);
	}

}
