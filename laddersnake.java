package javaapplication8;
import java.applet.*;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.util.*;
import java.awt.event.*;
public class NewApplet extends Applet implements ActionListener
{
Button btnGen;
int array[];
Panel btnpanel;
Color charColor[];
String msg1="Player1's Score";
String msg2="Player2's Score";
int player1_score=0,player2_score=0;
int turn=0;
String win=" ";
String win1=" ";
String win2=" ";
public void init()
{
      Font f=new Font("SansSerif",Font.BOLD,12);
      setFont(f);
           setBackground(Color.white);
     btnGen = new Button("ROLL THE DICE");	
     btnGen.addActionListener(this);
     setLayout(new BorderLayout());
     btnpanel=new Panel();
     btnpanel.add(btnGen);

     add(btnpanel, BorderLayout.SOUTH);

     //Array to store lucky numbers
     array = new int[] {0,0,0,0,0,0};

     //Color for each lucky number
     charColor=new Color[] {Color.red, Color.orange, Color.green, Color.pink, Color.blue, Color.black };

}

public void paint(Graphics g)
{
setBackground(Color.cyan);
FontMetrics fm=g.getFontMetrics();
g.drawString(msg1,660,230);
g.drawString(msg2,660,260);
g.setColor(Color.red);
g.fillRect(10,10,64,64);
g.setColor(Color.green);
g.fillRect(74,10,64,64);
g.setColor(Color.blue);
g.fillRect(138,10,64,64);
g.setColor(Color.yellow);
g.fillRect(202,10,64,64);
g.setColor(Color.red);
g.fillRect(266,10,64,64);
g.setColor(Color.green);
g.fillRect(330,10,64,64);
g.setColor(Color.blue);
g.fillRect(394,10,64,64);
g.setColor(Color.yellow);
g.fillRect(458,10,64,64);
g.setColor(Color.red);
g.fillRect(512,10,64,64);
g.setColor(Color.green);
g.fillRect(576,10,64,64);
g.setColor(Color.yellow);

g.fillRect(10,74,64,64);
g.setColor(Color.red);
g.fillRect(74,74,64,64);
g.setColor(Color.green);
g.fillRect(138,74,64,64);

g.setColor(Color.blue);
g.fillRect(202,74,64,64);
g.setColor(Color.yellow);
g.fillRect(266,74,64,64);
g.setColor(Color.red);
g.fillRect(330,74,64,64);
g.setColor(Color.green);
g.fillRect(394,74,64,64);
g.setColor(Color.blue);
g.fillRect(458,74,64,64);
g.setColor(Color.yellow);
g.fillRect(512,74,64,64);
g.setColor(Color.red);
g.fillRect(576,74,64,64);
g.setColor(Color.blue);

g.fillRect(10,138,64,64);
g.setColor(Color.yellow);
g.fillRect(74,138,64,64);
g.setColor(Color.red);
g.fillRect(138,138,64,64);
g.setColor(Color.green);
g.fillRect(202,138,64,64);
g.setColor(Color.blue);
g.fillRect(266,138,64,64);
g.setColor(Color.yellow);
g.fillRect(330,138,64,64);
g.setColor(Color.red);
g.fillRect(394,138,64,64);
g.setColor(Color.green);
g.fillRect(458,138,64,64);
g.setColor(Color.blue);
g.fillRect(512,138,64,64);
g.setColor(Color.yellow);
g.fillRect(576,138,64,64);
g.setColor(Color.green);

g.fillRect(10,202,64,64);
g.setColor(Color.blue);

g.fillRect(74,202,64,64);
g.setColor(Color.yellow);
g.fillRect(138,202,64,64);
g.setColor(Color.red);
g.fillRect(202,202,64,64);
g.setColor(Color.green);
g.fillRect(266,202,64,64);
g.setColor(Color.blue);
g.fillRect(330,202,64,64);
g.setColor(Color.yellow);
g.fillRect(394,202,64,64);
g.setColor(Color.red);
g.fillRect(458,202,64,64);
g.setColor(Color.green);
g.fillRect(512,202,64,64);
g.setColor(Color.blue);
g.fillRect(576,202,64,64);
g.setColor(Color.red);
g.fillRect(10,266,64,64);
g.setColor(Color.green);
g.fillRect(74,266,64,64);
g.setColor(Color.blue);
g.fillRect(138,266,64,64);
g.setColor(Color.yellow);
g.fillRect(202,266,64,64);
g.setColor(Color.red);
g.fillRect(266,266,64,64);
g.setColor(Color.green);
g.fillRect(330,266,64,64);
g.setColor(Color.blue);
g.fillRect(394,266,64,64);
g.setColor(Color.yellow);
g.fillRect(458,266,64,64);
g.setColor(Color.red);
g.fillRect(512,266,64,64);
g.setColor(Color.green);
g.fillRect(576,266,64,64);
g.setColor(Color.yellow);


g.fillRect(10,330,64,64);
g.setColor(Color.red);
g.fillRect(74,330,64,64);
g.setColor(Color.green);
g.fillRect(138,330,64,64);
g.setColor(Color.blue);
g.fillRect(202,330,64,64);
g.setColor(Color.yellow);
g.fillRect(266,330,64,64);
g.setColor(Color.red);
g.fillRect(330,330,64,64);
g.setColor(Color.green);
g.fillRect(394,330,64,64);
g.setColor(Color.blue);
g.fillRect(458,330,64,64);
g.setColor(Color.yellow);
g.fillRect(512,330,64,64);
g.setColor(Color.red);
g.fillRect(576,330,64,64);
g.setColor(Color.blue);

g.fillRect(10,394,64,64);
g.setColor(Color.yellow);
g.fillRect(74,394,64,64);
g.setColor(Color.red);
g.fillRect(138,394,64,64);
g.setColor(Color.green);
g.fillRect(202,394,64,64);
g.setColor(Color.blue);
g.fillRect(266,394,64,64);
g.setColor(Color.yellow);
g.fillRect(330,394,64,64);
g.setColor(Color.red);
g.fillRect(394,394,64,64);
g.setColor(Color.green);
g.fillRect(458,394,64,64);
g.setColor(Color.blue);
g.fillRect(512,394,64,64);


g.setColor(Color.yellow);

g.fillRect(576,394,64,64);
g.setColor(Color.green);
g.fillRect(10,458,64,64);
g.setColor(Color.blue);
g.fillRect(74,458,64,64);
g.setColor(Color.yellow);
g.fillRect(138,458,64,64);
g.setColor(Color.red);
g.fillRect(202,458,64,64);
g.setColor(Color.green);
g.fillRect(266,458,64,64);
g.setColor(Color.blue);
g.fillRect(330,458,64,64);
g.setColor(Color.yellow);
g.fillRect(394,458,64,64);
g.setColor(Color.red);
g.fillRect(458,458,64,64);
g.setColor(Color.green);
g.fillRect(512,458,64,64);
g.setColor(Color.blue);
g.fillRect(576,458,64,64);
g.setColor(Color.red);

g.fillRect(10,512,64,64);
g.setColor(Color.green);
g.fillRect(74,512,64,64);
g.setColor(Color.blue);
g.fillRect(138,512,64,64);
g.setColor(Color.yellow);
g.fillRect(202,512,64,64);
g.setColor(Color.red);
g.fillRect(266,512,64,64);
g.setColor(Color.green);
g.fillRect(330,512,64,64);
g.setColor(Color.blue);
g.fillRect(394,512,64,64);


g.setColor(Color.yellow);

g.fillRect(458,512,64,64);
g.setColor(Color.red);
g.fillRect(512,512,64,64);
g.setColor(Color.green);
g.fillRect(576,512,64,64);
g.setColor(Color.blue);

g.fillRect(10,576,64,64);
g.setColor(Color.red);
g.fillRect(74,576,64,64);
g.setColor(Color.green);
g.fillRect(138,576,64,64);
g.setColor(Color.blue);
g.fillRect(202,576,64,64);
g.setColor(Color.yellow);
g.fillRect(266,576,64,64);
g.setColor(Color.red);
g.fillRect(330,576,64,64);
g.setColor(Color.green);
g.fillRect(394,576,64,64);
g.setColor(Color.blue);
g.fillRect(458,576,64,64);
g.setColor(Color.yellow);
g.fillRect(512,576,64,64);
g.setColor(Color.red);
g.fillRect(576,576,64,64);
g.setColor(Color.black);
g.drawString("100",20,20);
g.drawString("HOME",30,30);
g.drawString("99",84,20);
g.drawString("98",148,20);
g.drawString("97",212,20);
g.drawString("DANGER",216,40);
g.drawString("96",276,20);
g.drawString("95",340,20);
g.drawString("94",404,20);


g.drawString("93",468,20);

g.drawString("92",522,20);
g.drawString("91",586,20);
g.drawString("81",20,84);
g.drawString("82",84,84);
g.drawString("83",148,84);
g.drawString("84",212,84);
g.drawString("85",276,84);
g.drawString("86",340,84);
g.drawString("87",404,84);
g.drawString("88",468,84);
g.drawString("89",522,84);
g.drawString("90",586,84);
g.drawString("80",20,148);
g.drawString("79",84,148);
g.drawString("78",148,148);
g.drawString("77",212,148);
g.drawString("76",276,148);
g.drawString("75",340,148);
g.drawString("74",404,148);
g.drawString("73",468,148);
g.drawString("72",522,148);
g.drawString("71",586,148);
g.drawString("61",20,212);
g.drawString("62",84,212);
g.drawString("63",148,212);
g.drawString("64",212,212);
g.drawString("65",276,212);
g.drawString("66",340,212);
g.drawString("67",404,212);
g.drawString("68",468,212);
g.drawString("69",522,212);
g.drawString("70",586,212);
g.drawString("60",20,276);
g.drawString("59",84,276);
g.drawString("58",148,276);
g.drawString("57",212,276);


g.drawString("56",276,276);
g.drawString("55",340,276);
g.drawString("54",404,276);
g.drawString("53",468,276);
g.drawString("DANGER",462,296);
g.drawString("52",522,276);
g.drawString("51",586,276);
g.drawString("41",20,340);
g.drawString("42",84,340);
g.drawString("43",148,340);
g.drawString("44",212,340);
g.drawString("45",276,340);
g.drawString("46",340,340);
g.drawString("47",404,340);
g.drawString("48",468,340);
g.drawString("49",522,340);
g.drawString("50",586,340);
g.drawString("40",20,404);
g.drawString("39",84,404);
g.drawString("38",148,404);
g.drawString("37",212,404);
g.drawString("36",276,404);
g.drawString("35",340,404);
g.drawString("34",404,404);
g.drawString("33",468,404);
g.drawString("32",522,404);
g.drawString("31",586,404);
g.drawString("21",20,468);
g.drawString("22",84,468);
g.drawString("23",148,468);
g.drawString("24",212,468);
g.drawString("25",276,468);
g.drawString("26",340,468);
g.drawString("27",404,468);
g.drawString("28",468,468);
g.drawString("29",522,468);
g.drawString("30",586,468);
g.drawString("20",20,522);


g.drawString("19",84,522);
g.drawString("18",148,522);
g.drawString("17",212,522);
g.drawString("16",276,522);
g.drawString("15",340,522);
g.drawString("14",404,522);
g.drawString("13",468,522);
g.drawString("12",522,522);
g.drawString("11",586,522);
g.drawString("1 ",20,586);
g.drawString("START",32,608);
g.drawString("2",84,586);
g.drawString("3",148,586);
g.drawString("4",212,586);
g.drawString("5",276,586);
g.drawString("6",340,586);
g.drawString("7",404,586);
g.drawString("8",468,586);
g.drawString("9",522,586);
g.drawString("10",586,586);
g.drawLine(45,99,173,45);
g.drawLine(59,113,187,59);
g.drawLine(237,547,429,173);
g.drawLine(251,561,443,187);
g.drawLine(173,429,109,301);
g.drawLine(123,315,187,443);
/*g.drawLine();
g.drawLine();
g.drawLine();
g.drawLine();*/
g.drawArc(30, 40, 300, 300, 0, 75);
g.drawArc(30, 40, 300, 300, 0, -75);
g.drawArc(100,100,400,400,0,-75);
g.drawArc(305,486,160,130,190,-75);
   

     int h = 30;
     
     
Font f=new Font("SansSerif",Font.BOLD,15);
     g.drawString("SNAKES & LADDERS",150,680);
     //Fonts for title
   Font font = new Font("Verdana", Font.BOLD , 15);

     g.setFont(font);
     g.setColor(Color.red);
     g.drawString("CURRENT NUMBER ON THE DICE", 670, h);

     //lines to draw borders
     g.drawLine(660,10,960 ,10);
     g.drawLine(660,10,660,210);
     g.drawLine(960,10,960,210);

     //Vertical distance from title to numbers
     h= h + 100;

     //Fonts for numbers
     Font font1 = new Font("Verdana", Font.BOLD , 19);
     g.setFont(font1);

     //Drawing numbers
     for(int n=0;n<1;n++)
     {
        g.setColor(charColor[n]);
        Integer I = new Integer(array[n]);
        g.drawString(I.toString(), 680, h);
        
     }

     //Drawing bottom border
        g.setColor(Color.red);
        g.drawLine(660,210,960,210);
        g.drawString(" "+player1_score,760,230);
        g.drawString(" "+player2_score,760,260);
        g.drawString(" " +win,760,300);
        g.drawString(" "+win1,760,330);
        g.drawString(" "+win2,760,360);

}


public void actionPerformed(ActionEvent ev)
{

       int exist=0;
       int n =1;
       turn++;
     //initialize rnd with current system time
       Random rnd = new Random();

       //generate the first number

       int i = Math.abs(rnd.nextInt() % 7);

     //If number is 0 keep generate numbers until it is not 0; there is no 0 in Lottery
 while(i==0)
       i = Math.abs(rnd.nextInt() % 7);

       //add number to array
       array[0]= i;
        current_score(i,turn);
             repaint();
  }
     public void current_score(int i,int turn)
{
//player1
if (turn%2==0 && (player1_score+i)<=100 && win!="GAME OVER")
{
//to enter the board
if(i==6&& player1_score==0)
player1_score=player1_score+i;
else if(i<=6 && player1_score>0)
player1_score=player1_score+i;
if(player1_score==17)


player1_score=player1_score+57;
if (player1_score==38)
player1_score=player1_score+21;
if (player1_score==81)
player1_score=player1_score+16;
turn--;
if (player1_score==53)
player1_score=player1_score-16;
if (player1_score==97)
player1_score=player1_score-53;

}
//player2
else if(turn%2!=0 &&(player2_score+i)<=100 && win!="GAME OVER") 
{
//to enter the board
if(i==6&& player2_score==0)
player2_score=player2_score+i;
else if(i<=6 && player2_score>0)
player2_score=player2_score+i;
if(player2_score==17)
player2_score=player2_score+57;
if (player2_score==38)
player2_score=player2_score+21;
if (player2_score==81)
player2_score=player2_score+16;
turn--;
if (player2_score==53)
player2_score=player2_score-16;
if (player2_score==97)
player2_score=player2_score-53;

//snakes_ladders(player2_score);
}
if(player1_score==100||player2_score==100)
{ 
win="GAME OVER";


if(player1_score==100)
win1=" CONGRATULATIONS!!!!!!!          PLAYER1 WINS";
else
win2="  CONGRATULATIONS!!!!!!          PLAYER2 WINS";
}
}
}
