package com.example.drinkingbottle;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

import androidx.core.content.res.TypedArrayUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Pop extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        setContentView(R.layout.popup);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        mTextView = findViewById(R.id.textView);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width*1),(int)(height*.4));

        showRandomDrink();

    }

    public void showRandomDrink() {





        shuffleDrink();
        int min = 0;
        int max = 5;
        Random n = new Random();
        int randomInt = n.nextInt((max - min) + min);


        mTextView.setText(drinkArray[randomInt].getmDrink());



    }

    Drink d01 = new Drink("KISS A PLAYER A GROUP VOTES ON. IF EITHER OF YOU REFUSES, YOU BOTH TAKE A SHOT.");
    Drink d02 = new Drink("SUCK ON A PLAYER'S EAR IF IT WAS A BABY'S BOTTLE OR DRINK 3 TIMES.");
    Drink d03 = new Drink("LET A PLAYER A GROUP VOTES ON TAKE YOUR PHONE AND LOOK THROUGH YOUR GALLERY OR TAKE TWO SHOTS.");
    Drink d04 = new Drink("GO AN ENTIRE MINUTE WITHOUT BLINKING OR DRINK TWICE.");
    Drink d05 = new Drink("SLOWLY STICK YOUR LEG KNEE-DEEP INTO THE TRASH CAN OR TAKE A SHOT.");
    Drink d06 = new Drink("CALL YOUR MOM AND TELL HER YOU'RE GAY OR DRINK TWO SHOTS.");
    Drink d07 = new Drink("JUMP IN A SHOWER WITH ALL YOUR CLOTHES ON OR TAKE THREE SHOTS.");
    Drink d08 = new Drink("CALL A FAMILY MEMBER AND TELL THEM YOU AND YOUR EX ARE GETTING BACK TOGETHER OR FINISH YOUR DRINK.");
    Drink d09 = new Drink("EAT A SHEET OF TOILET PAPER OR TAKE A SHOT.");
    Drink d10 = new Drink("YOU ARE NOT ALLOWED TO CURSE UNTIL YOUR NEXT MOVE. IF YOU CURSE, FINISH YOUR DRINK.");
    Drink d11 = new Drink("CLENCH A PEN BETWEEN YOUR BUTT CRACK AND DO FIVE JUMPING JACKS. IF IT FALLS OUT DRINK 3 TIMES.");
    Drink d12 = new Drink("IF YOU'RE SINGLE DRINK ONCE.");
    Drink d13 = new Drink("TELL EVERYONE IN THE ROOM THEIR MOST ATTRACTIVE FEATURE OR DRINK.");
    Drink d14 = new Drink("MOON EVERYONE IN THE ROOM OR TAKE A SHOT.");
    Drink d15 = new Drink("CHALLENGE AN OPPONENT TO A ONE-LEGGED RACE. LOSER DRINKS.");
    Drink d16 = new Drink("SHOW EVERYONE IN THE ROOM YOUR BANK ACCOUNT OR TAKE TWO SHOTS.");
    Drink d18 = new Drink("GUESS WHICH PLAYER HAS A CONDOM ON THEM. IF YOU GUESS CORRECTLY, THEY DRINK. IF YOU GUESS WRONG, YOU DRINK.");
    Drink d19 = new Drink("PICK A PLAYER AND GUESS A COLOR OF THEIR UNDERWEAR. IF YOU'RE CORRECT THEY DRINK, IF YOU'RE WRONG, YOU DRINK.");
    Drink d20 = new Drink("FART IN THE NEXT 30 SECONDS OR DRINK TWICE.");
    Drink d23 = new Drink("BURP IN THE NEXT 30 SECONDS OR DRINK TWICE.");
    Drink d21 = new Drink("MAKE SOMEONE IN THE ROOM CRACK A SMILE IN UNDER 30 SECONDS OR DRINK THREE TIMES.");
    Drink d22 = new Drink("CONVINCE A PLAYER TO TAKE A SHOT WITH YOU. IF NO ONE AGREES TAKE BOTH SHOTS ALONE.");
    Drink d24 = new Drink("CALL YOUR MOM AND TELL HER SHE'S GOING TO BE A GRANDMA OR FINISH YOUR DRINK.");
    Drink d26 = new Drink("DESCRIBE THE BEST SEX OF YOUR LIFE IN DETAIL OR DRINK.");
    Drink d25 = new Drink("CONFESS WHO IN THE ROOM YOU WOULD MOST LIKELY SLEEP WITH OR DRINK.");
    Drink d27 = new Drink("TAKE OFF ONE ARTICLE OF CLOTHES EVERY TIME YOU CURSE. DO THIS OR DRINK A KING'S COCKTAIL.");
    Drink d28 = new Drink("DRINK ONCE.");
    Drink d29 = new Drink("DRINK TWO SHOTS.");
    Drink d30 = new Drink("FINISH YOUR DRINK.");
    Drink d31 = new Drink("DRINK TWICE.");
    Drink d32 = new Drink("DRINK THREE SHOTS.");
    Drink d33 = new Drink("DRINK THREE TIMES.");
    Drink d34 = new Drink("MAKE OUT WITH YOUR HAND OR DRINK TWICE.");
    Drink d35 = new Drink("MAKE OUT WITH YOUR HAND OR DRINK TWICE.");
    Drink d36 = new Drink("BURP THE ALPHABET OR DRINK.");
    Drink d37 = new Drink("ONLY SPEAK IN RHYMES FOR THE REST OF THE GAME OR FINISH YOUR DRINK.");
    Drink d38 = new Drink("CALL YOUR EX DOR 5 MINUTES OR UNTIL THEY HANG UP, OR CHUG AN ENTIRE BEER IN LESS THAN 20 SECONDS");
    Drink d39 = new Drink("TAKE YOUR SHIRT OFF, ONLY USING YOUR TEETH OR DRINK A SHOT FOR EVERY PERSON PLAYING");
    Drink d40 = new Drink("LET THE REST OF THE GROUP DM SOMEONE FROM YOUR INSTAGRAM ACCOUNT, OR DRINK 5 TIMES");
    Drink d41 = new Drink("DRINK A KING'S COCKTAIL!");
    Drink d42 = new Drink("LET SOMEONE SHAVE A PART OF YOUR BODY OR FINISH YOU DRINK!");
    Drink d43 = new Drink("TELL EVERYONE AN EMBARRASSING STORY ABOUT YOURSELF, OR DRINK 4 TIMES.");
    Drink d44 = new Drink("POST THE OLDEST SELFIE ON YOUR PHONE ON INSTAGRAM STORIES OR DRINK 3 SHOTS.");
    Drink d45 = new Drink("BREAK TWO EGGS ON YOUR HEAD OR DRINK 5 TIMES.");
    Drink d46 = new Drink("CALL THE PIZZERIA AND ASK THEM DO THEY SELL PIZZAS, THEN HANG UP, OR FINISH YOUR DRINK.");
    Drink d47 = new Drink("GET SLAPPED ON THE FACE BY THE PERSON OF YOUR CHOOSING, OR DRINK 5 SHOTS");
    Drink d48 = new Drink("SEDUCE A MEMBER OF THE SAME GENDER IN THE GROUP, OR DRINK 5 TIMES");
    Drink d49 = new Drink("CHOOSE SOMEONE FROM THE GROUP TO GIVE YOU A SPANKING, OR FINISH YOUR DRINK.");
    Drink d50 = new Drink("DO PUSHUPS UNTIL YOU CAN'T DO ANY MORE, OR FINISH YOUR DRINK.");
    Drink d51 = new Drink("TELL THE GROUP WHO WAS THE LAST PERSON YOU KISSED, OR DRINK 4 TIMES.");
    Drink d52 = new Drink("TELL THE GROUP WHAT IS SOMETHING EVERYONE THINKS IS TRUE ABOUT YOU, BUT ISN'T, OR TAKE A SHOT");
    Drink d53 = new Drink("TELL THE GROUP WHAT IS THE NAUGHTIEST THING YOU'VE DONE IN PUBLIC, OR TAKE 3 SHOTS.");
    Drink d54 = new Drink("SHOW OFF YOUR ORGASM FACE, OR DRINK 5 TIMES");
    Drink d55 = new Drink("LET THE GROUP GIVE YOU A NEW HAIRSTYLE, OR TAKE 3 SHOTS.");
    Drink d56 = new Drink("GO TO THE BATHROOM, TAKE OFF YOUR UNDERWEAR AND PUT IT ON YOUR HEAD. WEAR IT ON YOUR HEAD FOR THE REST OF THE GAME, OR DRINK 5 TIMES.");
    Drink d57 = new Drink("CALL THE 3RD CONTACT ON YOUR PHONE AND SING THEM 30 SECONDS OF A SONG THAT THE GROUP CHOOSES. NO TALKING. OR TAKE 3 SHOTS.");
    Drink d58 = new Drink("SEDUCTIVELY EAT A BANANA, OR DRINK 3 TIMES.");
    Drink d59 = new Drink("TWERK FOR A MINUTE, OR DRINK 5 TIMES.");
    Drink d60 = new Drink("DO YOUR BEST CELEBRITY IMPRESSION, OR DRINK 5 TIMES.");
    Drink d61 = new Drink("SPEAK IN RUSSIAN ACCENT FOR 5 MINUTES, OR TAKE 2 SHOTS (PREFERABLY OF VODKA).");
    Drink d62 = new Drink("CALL A RESTAURANT AND TRY TO ORDER FOOD IN FOREIGN LANGUAGE, OR DRINK 4 TIMES.");



    Drink [] drinkArray = new Drink[]{
      d01,d02,d03,d04,d05,d06,d07,d08,d09,d10,d11,d12,d13,d14,d15,d16,d20,d18,d19,d21,d22,d23,d24,d25,d26,d27,d28,d29,d30,d31,d32,d33,d34,d35,d36,d37,d38,d39,d40,d41,d42,d43,d44,d45,d46,d47,d48,d49,d50,d51,d52,
     d53,d54,d55,d56,d57,d58,d59,d60,d61,d62
    };

    public void shuffleDrink(){
        Collections.shuffle(Arrays.asList(drinkArray));

    }
}
