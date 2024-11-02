package com.aman.AmanWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


@SpringBootApplication
@RestController
public class AmanWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmanWebApplication.class, args);
	}

	@GetMapping("/")
	public String index(){
		return "Hey";
	}

	@GetMapping("/isJava")
	public String javacheck(){
		return "I dont know";

	}
	@GetMapping("/cd/{hero}")
	public String whom(String hero){
		Document dc = Jsoup.connect("https://anime-world.in/page/1/?s="+hero).get();
		
		
	}



}

