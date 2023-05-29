package org.example;
import jdk.jfr.Percentage;
import org.junit.jupiter.api.*;


import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void everybranch() {
        List<User> users = new ArrayList<>();

        //Test1
        String us1="Andrej";
        String ps1=null;
        String eml1="andrej.damceski@gmail.com";
        User user1= new User(us1, ps1, eml1);
        users.add(user1);
        RuntimeException e;
        e=assertThrows(RuntimeException.class, ()-> SILab2.function(user1, users));
        assertTrue(e.getMessage().contains("Mandatory information missing!"));

        //Test2
        String us2=null;
        String ps2="1234?";
        String eml2="marija.stojanova@gmail.com";
        User user2= new User(us2, ps2, eml2);
        users.add(user2);
        assertEquals(false, SILab2.function(user2,users));

        //Test3
        String us3="Angel";
        String ps3="123456789";
        String eml3="angelStojkov@gmail.com";
        User user3= new User(us3, ps3, eml3);
        users.add(user3);
        assertEquals(false, SILab2.function(user3,users));

        //Test4
        String us4="Stefan";
        String ps4="25673429 1";
        String eml4="stefan.kostov@gmail.com";
        User user4= new User(us4, ps4, eml4);
        assertEquals(false, SILab2.function(user4,users));

        //Test5
        String us5="Mila";
        String ps5="25673 429";
        String eml5="mila.ristovska@gmail.com";
        User user5= new User(us5,ps5,eml5);
        assertEquals(false, SILab2.function(user5,users));

    }
    @Test
    void multiplecondition(){
        List<User> users=new ArrayList<>();

        //test1
        User u1=null;
        RuntimeException ex;
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(u1,users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //test2
        String username2="Nikola";
        String password2 = null;
        String email2 = "NikolA@gmailcomus1";
        User u2 = new User(username2, password2, email2);
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(u2,users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //test3
        String username3="Stefan";
        String password3 = "stef45*2";
        String email3 = null;
        User u3 = new User(username3, password3, email3);
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(u3,users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //test4
        String username4="Mila";
        String password4 = "leo3345";
        String email4= "mila.h@gmail.com";
        User u4 = new User(username4, password4, email4);
        assertFalse(SILab2.function(u4,users));
    }
}