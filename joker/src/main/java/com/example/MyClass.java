package com.example;

import java.util.ArrayList;
import java.util.Random;

public class MyClass {


    static ArrayList<String> jokes = new ArrayList<>();


    public static String getJoke(){

        if(jokes.isEmpty()){
            initJokes();
        }

        return jokes.get(new Random().nextInt(jokes.size()));
    }

    private static void initJokes(){
//        http://thoughtcatalog.com/christopher-hudspeth/2013/09/50-terrible-quick-jokes-thatll-get-you-a-laugh-on-demand/
        jokes.add("It’s hard to explain puns to kleptomaniacs because they always take things literally.");
        jokes.add("I used to think the brain was the most important organ. Then I thought, look what’s telling me that.");
        jokes.add("The midget fortune teller who kills his customers is a small medium at large.");
        jokes.add("A farmer in the field with his cows counted 196 of them, but when he rounded them up he had 200.");
        jokes.add("What does a nosey pepper do? Get jalapeño business.");
        jokes.add("What is Bruce Lee’s favorite drink? Wataaaaah!");
        jokes.add("The dyslexic devil worshipper sold his soul to Santa.");
        jokes.add("You kill vegetarian vampires with a steak to the heart.");
        jokes.add("There was a prison break and I saw a midget climb up the fence. As he jumped down her sneered at me and I thought, well that’s a little condescending.");
        jokes.add("If you want to catch a squirrel just climb a tree and act like a nut.");
        jokes.add("A magician was walking down the street and turned into a grocery store.");
        jokes.add("Why don’t you ever see hippopotamus hiding in trees? Because they’re really good at it.");
        jokes.add("Did you hear about the Mexican train killer? He had locomotives.");
        jokes.add("How does NASA organize their company parties? They planet.");
        jokes.add("Why can’t you hear a pterodactyl go to the bathroom? Because the “P” is silent.");
        jokes.add("What kind of shoes do ninjas wear? Sneakers.");
        jokes.add("Why does Snoop Dogg carry an umbrella? Fo’ drizzle.");
        jokes.add("Did you hear about the new corduroy pillows? They’re making headlines everywhere!");
        jokes.add("Why was six afraid of seven? Because seven was a well known six offender.");
        jokes.add("What time is it when you have to go to the dentist? Tooth-hurtie.");
        jokes.add("My friend recently got crushed by a pile of books, but he’s only got his shelf to blame.");
        jokes.add("What did Jay-Z call his girlfriend before they got married? Feyoncé.");
        jokes.add("Time flies like an arrow, fruit flies like banana.");
        jokes.add("How many kids with ADHD does it take to change a light bulb? Let’s go play on our bikes.");
        jokes.add("What do you call dangerous precipitation? A rain of terror.");
        jokes.add("What’s the best part about living in Switzerland? Not sure, but the flag is a big plus.");
        jokes.add("Two fish are in a tank. One turns to the other and asks “How do you drive this thing?”");
        jokes.add("Why can’t a bike stand on its own? It’s two tired.");
        jokes.add("Why didn’t the lifeguard save the hippie? Because he was too far out man!");
        jokes.add("Last night I almost had a threesome, I only needed two more people!");
        jokes.add("What do you call a big pile of kittens? A meowntain.");
        jokes.add("I wondered why the baseball was getting bigger. Then it hit me.");
        jokes.add("Atheism is a non-prophet organization.");
        jokes.add("Just went to an emotional wedding. Even the cake was in tiers.");
        jokes.add("When you get a bladder infection, urine trouble.");
        jokes.add("I wrote a song about a tortilla. Well actually, it’s more of a wrap.");
        jokes.add("What do you call a dinosaur with a extensive vocabulary? A thesaurus.");
        jokes.add("How did the hipster burn his tongue? He drank his coffee before it was cool.");
        jokes.add("Pampered cows produce spoiled milk.");
        jokes.add("Learn sign language, it’s very handy.");
        jokes.add("I started a band called 999 Megabytes — we haven’t gotten a gig yet.");
        jokes.add("You want to hear a pizza joke? Never mind, it’s pretty cheesy.");
        jokes.add("What is the difference between ignorance and apathy? I don’t know, and I don’t care.");
        jokes.add("Dry erase boards are remarkable.");
        jokes.add("Dwarfs and midgets have very little in common.");
        jokes.add("How do you make Holy water? Boil the hell out of it.");
    }

}
