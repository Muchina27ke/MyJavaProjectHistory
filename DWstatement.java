/*Online Java Paper Test*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class OnlinePhpDbTest extends JFrame implements ActionListener
{
	JLabel l,lk;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;
	ButtonGroup bg;
	int count=0,current=0,x=1,y=1,now=0,results;
    String grade;
	int m[]=new int[10];	
	OnlinePhpDbTest(String s)
	{
		super(s);
		l=new JLabel();
        lk=new JLabel();
		add(l);add(lk);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");
		b2=new JButton("Bookmark");
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(b1);add(b2);
		set();
        lk.setBounds(30,10,1200,100);
		l.setBounds(30,40,1200,20);
		jb[0].setBounds(50,80,800,20);
		jb[1].setBounds(50,110,800,20);
		jb[2].setBounds(50,140,800,20);
		jb[3].setBounds(50,170,800,20);
		b1.setBounds(100,240,100,30);
		b2.setBounds(270,240,100,30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250,100);
		setVisible(true);
		setSize(1300,450);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
				count=count+1;
			current++;
			set();	
			if(current==49)
			{
				b1.setEnabled(false);
				b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Bookmark"))
		{
			JButton bk=new JButton("Bookmark"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);
			bk.addActionListener(this);
			m[x]=current;
			x++;
			current++;
			set();	
			if(current==49)
				b2.setText("Result");
			setVisible(false);
			setVisible(true);
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		if(e.getActionCommand().equals("Bookmark"+y))
		{
			if(check())
				count=count+1;
			now=current;
			current=m[y];
			set();
			((JButton)e.getSource()).setEnabled(false);
			current=now;
		}
		}
	
		if(e.getActionCommand().equals("Result"))
		{
			if(check())
				count=count+1;
			current++;
            results=count*2;
            //creating the grading system
            if(results>=0 && results<20)
            {
                grade="Fail";

            }
            else if(results>=20 && results<30)
            {
                grade="E";
            }
            else if(results>=30 && results<35)
            {
                grade="D-";
            }
            else if(results>=35 && results<40)
            {
                grade="D";
            }
            else if(results>=40 && results<45)
            {
                grade="D+";
            }
            else if(results>=45 && results<50)
            {
                grade="C-";
            }
            else if(results>=50 && results<55)
            {
                grade="C";
            }
            else if(results>=55 && results<60)
           {
            grade="C+";
           }
           else if(results>=60 && results<65)
           {
            grade="B-";
           }
           else if(results>=65 && results<70)
           {
            grade="B";
           }
           else if(results>=70 && results<75)
           {
            grade="B+";
           }
           else if(results>=75 && results<80)
           {
            grade="A-";
           }
           else if(results>=80 && results<=100)
           {
            grade="A";
           }
           else{
            System.out.println("Invalid Grades!!");
           }

			//System.out.println("correct ans="+count);
			JOptionPane.showMessageDialog(this,"Hello, this is your results!"+"\n Your Score="+results+"%"+"\n Your Grade:"+grade);
			System.exit(0);
		}
	}
	void set()
	{
		jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1: HTML stands for __________");
			jb[0].setText("HyperText Markup Language");jb[1].setText("HyperText Machine Language");jb[2].setText("HyperText Marking Language");jb[3].setText("HighText Marking Language");	
		}
		if(current==1)
		{
			l.setText("Que2: What is the correct HTML element for inserting a line break?");
			jb[0].setText("<b>");jb[1].setText("<lb>");jb[2].setText("<break>");jb[3].setText("<br>");
		}
		if(current==2)
		{
			l.setText("Que3: Which element is used for creating links?");
			jb[0].setText("<a>");jb[1].setText("<p>");jb[2].setText("<li>");jb[3].setText("<ol>");
		}
		if(current==3)
		{
			l.setText("Que4: What is the correct HTML for  adding background color?");
			jb[0].setText("<body background=”yellow”>");jb[1].setText("<body bg=”yello”>");jb[2].setText(" <background>yellow</background>");jb[3].setText("<body style=”background-color:yellow;”>");
		}
		if(current==4)
		{
			l.setText("Que5: What is the path for an image located in same folder as the current page?");
			jb[0].setText("<img src= “pic.jpg”>");jb[1].setText("<img src= “../pic.jpg”>");jb[2].setText("<img src= “images/pic.jpg”>");jb[3].setText("<img src= “/images/pic.jpg”>");
		}
		if(current==5)
		{
			l.setText("Que6: Which of the following is used to read an HTML page and render it?");
			jb[0].setText("Web server");jb[1].setText("Web network");jb[2].setText("Web browser");jb[3].setText("Web matrix");
		}
		if(current==6)
		{
			l.setText("Que7: Which element is used for or styling HTML5 layout? ");
			jb[0].setText("CSS");jb[1].setText("jQuery");jb[2].setText("JavaScript");jb[3].setText("PHP");
		}
		if(current==7)
		{
			l.setText("Que8: Which HTML tag is used for making character appearance bold?");
			jb[0].setText("<u>content</u>");jb[1].setText("<b>content</b>");jb[2].setText("<br>content</br>");jb[3].setText("<i>content</i>");		
		}
		if(current==8)
		{
			l.setText("Que9: Which character is used to represent when a tag is closed in HTML?");
			jb[0].setText("#");jb[1].setText("!");jb[2].setText("/");jb[3].setText("\\");
		}
		if(current==9)
		{
			l.setText("Que10: In HTML, which attribute is used to create a link that opens in a new window tab?");
			jb[0].setText("src='_blank'");jb[1].setText("alt='_blank'");jb[2].setText("target='_self'");jb[3].setText("target='_blank'");
		}
		if(current==10)
		{
			l.setText("Que11: Which of the following HTML tag is used to create an unordered list?");
			jb[0].setText("<ol>");jb[1].setText("<ul>");jb[2].setText("<li>");jb[3].setText("<ll>");
		}
		if(current==11)
		{
			l.setText("Que12: Which of the following HTML tag is used to add a row in a table?");
			jb[0].setText("<th> ");jb[1].setText("<td> ");jb[2].setText("<tr> ");jb[3].setText("<tt> ");
		}
		if(current==12)
		{
			l.setText("Que13: Which of the following tag is used to create a text area in HTML Form? ");
			jb[0].setText("<textarea> </textarea> ");jb[1].setText("<text></text> ");jb[2].setText("<input type=”text” /> ");jb[3].setText("<input type=”textarea” />");
		}
		if(current==13)
		{
			l.setText("Que14: Which tag is used to create a dropdown in HTML Form?");
			jb[0].setText("<input>");jb[1].setText("<select>");jb[2].setText("<text>");jb[3].setText("<textarea>");
		}
		if(current==14)
		{
			l.setText("Que15: Which tag is used to create a numbered list in HTML?");
			jb[0].setText("<ol>");jb[1].setText("<ul>");jb[2].setText("<li>");jb[3].setText("<ll>");
		}
		if(current==15)
		{
			l.setText("Que16: How to insert Hyperlink in HTML Page?");
			jb[0].setText("<a href=\"https://www.html.com/\">HTML MCQ</a>");jb[1].setText("<a target=\"https://www.html.com /\" HTML Quiz />");jb[2].setText(" <a src=\"https://www.sanfouhtml.com/\">HTML Test</a>");jb[3].setText("<a>https://www.html.com/</a>");
		}
		if(current==16)
		{
			l.setText("Que17: What is the use of <hr/> tag in HTML?");
			jb[0].setText(" For making content appearance italics");jb[1].setText("To create vertical rule between sections");jb[2].setText("To create a line break");jb[3].setText("To create horizontal rule between sections");
		}
		if(current==17)
		{
			l.setText("Que18: Which HTML element is used for YouTube videos?");
			jb[0].setText("<samp>");jb[1].setText("<small>");jb[2].setText("<frame>");jb[3].setText("<iframe>");
		}
		if(current==18)
		{
			l.setText("Que19: Analyze the following CSS for a webpage: What is the resulting background color of the paragraph element?");
			jb[0].setText(" Pink");jb[1].setText("Blue");jb[2].setText(" Yellow");jb[3].setText("Green");
		}
		if(current==19)
		{
			l.setText("Que20: <input > is –");
			jb[0].setText(" A format tag");jb[1].setText(" An empty tag");jb[2].setText("All of the above");jb[3].setText("None of the above");
		}
		if(current==20)
		{
			l.setText("Que21: The correct sequence of HTML tags for starting a webpage is ");
			jb[0].setText(" Head, Title, HTML, body");jb[1].setText("HTML, Body, Title, Head");jb[2].setText("HTML, Head, Title, Body");jb[3].setText("HTML, Head, Title, Body");
		}
		if(current==21)
		{
			l.setText("Que22: Which of the following HTML is used to display the text with scrolling effect");
			jb[0].setText("<marquee>");jb[1].setText("<scroll>");jb[2].setText("<div>");jb[3].setText("None of the above");
		}
		if(current==22)
		{
			l.setText("Que23: Which of the following is the container for <tr>,<th> and <td>?");
			jb[0].setText("<data>");jb[1].setText("<table>");jb[2].setText("<group>");jb[3].setText("All of the above");
		}
		if(current==23)
		{
			l.setText("Que24: What are the types of unordered or bulleted list in HTML?");
			jb[0].setText(" disc, square, triangle");jb[1].setText(" polygon, triangle, circle");jb[2].setText(" disc, circle, square");jb[3].setText(" All of the above");
		}
		if(current==24)
		{
			l.setText("Que25: Which of the following is the correct way to create a list using the lowercase letters");
			jb[0].setText(" <ol alpha=”a”>");jb[1].setText("<ol type=”a”>");jb[2].setText("<ol letter=”a”>");jb[3].setText("None of the above");
		}
		if(current==25)
		{
			l.setText("Que26: Which of the following HTML attribute is used to define inline styles");
			jb[0].setText("style");jb[1].setText("type");jb[2].setText("class");jb[3].setText("None of the above");
		}
		if(current==26)
		{
			l.setText("Que27: Which HTML tag is used to display the power in expression, i.e. (x2-y2)?");
			jb[0].setText("<sup>");jb[1].setText("<sub>");jb[2].setText("<p squared>");jb[3].setText("None of the above");
		}
		if(current==27)
		{
			l.setText("Que28: Which is an example of purely presentational HTML markup?");
			jb[0].setText("<p> Paragraph content</>");jb[1].setText("<b> Bold Text</b>");jb[2].setText("<div id=”pagetitle”> My Website</div>");jb[3].setText("<img class=”playerphoto” src=”Jordan.jpg”  title=”Michael Jordan”>");
		}
		if(current==28)
		{
			l.setText("Que29: CSS");
			jb[0].setText("is a markup language");jb[1].setText("stands for Core Style Sheet");jb[2].setText("defines the presentational layer of a web page");jb[3].setText("none of the above are true");
		}
		if(current==29)
		{
			l.setText("Que30: In this CSS code, what is being set? Body{color:#990000;}");
			jb[0].setText("Text color of only paragraphs");jb[1].setText("Background color of the entire web page");jb[2].setText("Text color of the entire web page");jb[3].setText("Background color of the body element");
		}
		if(current==30)
		{
			l.setText("Que31: What does PHP stands for");
			jb[0].setText("Preprocessed Hypertext Page");jb[1].setText("Hypertext Markup Language");jb[2].setText("Hypertext Preprocessor");jb[3].setText("Hypertext Transfer Protocol");
		}
		if(current==31)
		{
			l.setText("Que32: How do you define a function in PHP?");
			jb[0].setText("functionName(parameters){function body}");jb[1].setText("function{function body}");jb[2].setText("function functionName(parameters){function body}");jb[3].setText("data type functionName(parameters){function body}");
		}
		if(current==32)
		{
			l.setText("Que33: Which of the looping statetments is/are supported by PHP? i.\tfor loop ii.\twhile loop iii.\tdo-while loop iv.\tfor each loop");
			jb[0].setText("only  iv");jb[1].setText("i and ii");jb[2].setText("i, ii and iii");jb[3].setText("i, ii, iii and iv");
		}
		if(current==33)
		{
			l.setText("Que34:Which of the following must be true in order to use PHP code in a web page?");
			jb[0].setText("$_FORM");jb[1].setText("$_FILES");jb[2].setText("$_GET");jb[3].setText("$_POST");
		}
		if(current==34)
		{
			l.setText("Que35: What is the purpose of the script tag in HTML?");
			jb[0].setText("To define the page’s structure");jb[1].setText("To include external CSS styles");jb[2].setText("To include external Javascript code");jb[3].setText("To create hyperlinks");
		}
		if(current==35)
		{
			l.setText("Que36: Which of the following s used to store and query data in tabular format in web development?");
			jb[0].setText("API");jb[1].setText("Database");jb[2].setText("JSON");jb[3].setText("XML");
		}
		if(current==36)
		{
			l.setText("Que37: Which operator is used to concatenate two strings in PHP?");
			jb[0].setText("&");jb[1].setText("|");jb[2].setText("^");jb[3].setText(".");
		}
		if(current==37)
		{
			l.setText("Que38: What will be the output of the following PHP program?");
			jb[0].setText("Error");jb[1].setText("1HTML");jb[2].setText("1Javascript");jb[3].setText("1CSS");
		}
		if(current==38)
		{
			l.setText("Que39: What will be the output of the following PHP code?");
			jb[0].setText("Hello there");jb[1].setText("No output");jb[2].setText("Error");jb[3].setText("Coding is logic");
		}
		if(current==39)
		{
			l.setText("Que40: What will be the output of the following PHP code?");
			jb[0].setText("True");jb[1].setText("False");jb[2].setText("Error");jb[3].setText("No output");
		}
		if(current==40)
		{
			l.setText("Que41:What type of database management system is MySQL?");
			jb[0].setText("Relational");jb[1].setText("Object Oriented");jb[2].setText("Hierarchical");jb[3].setText("Hierarchical");
		}
		if(current==41)
		{
			l.setText("Que42: How do you define a variable in PHP?");
			jb[0].setText("$variable_name=value");jb[1].setText("$variable_name==value;");jb[2].setText("$variable_name=value;");jb[3].setText("$variable_name as value;");
		}
		if(current==42)
		{
			l.setText("Que43: Consider the following code: What will be the possible output when successfully executed?");
			jb[0].setText("I love Arsenal");jb[1].setText("I love Manc");jb[2].setText("Kindly join Premium League");jb[3].setText("I love ArsenalI love MancKindly join Premium League");
		}
		if(current==43)
		{
			l.setText("Que44: Which of the following is NOT a key in MySQL");
			jb[0].setText("Primary Key");jb[1].setText("Secondary Key");jb[2].setText("Foreign Key");jb[3].setText("Unique Key");
		}
		if(current==44)
		{
			l.setText("Que45: What Data Type do you use to store the data of birth for a user in  MySQL Database?");
			jb[0].setText("int");jb[1].setText("char");jb[2].setText("varchar");jb[3].setText("Date");
		}
		if(current==45)
		{
			l.setText("Que46: Which of the following is a Database Language");
			jb[0].setText("Data Control Language");jb[1].setText("Data Writing Language");jb[2].setText("Data User Language");jb[3].setText("Data Delivery Language");
		}
		if(current==46)
		{
			l.setText("Que47: Which MySQL command is used to add a new record into a database table?");
			jb[0].setText("Update");jb[1].setText("Add Record");jb[2].setText("Insert record");jb[3].setText("insert into");
		}
		if(current==47)
		{
			l.setText("Que48: which MySQL commands is used to change existing data in a table?");
			jb[0].setText("modify");jb[1].setText("change");jb[2].setText("alter");jb[3].setText("update");
		}
		if(current==48)
		{
			l.setText("Que49: What will be the output of the following PHP code?");
			jb[0].setText("hi");jb[1].setText("hihellohi");jb[2].setText("hihi");jb[3].setText("no output");
		}
		if(current==49)
		{
			l.setText("Que50: What will be the output of the following PHP code?");
			jb[0].setText("0");jb[1].setText("1");jb[2].setText("Nothing");jb[3].setText("Error");
		}
		l.setBounds(30,40,1100,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,1000,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[0].isSelected());
		if(current==1)
			return(jb[3].isSelected());
		if(current==2)
			return(jb[0].isSelected());
		if(current==3)
			return(jb[3].isSelected());
		if(current==4)
			return(jb[0].isSelected());
		if(current==5)
			return(jb[2].isSelected());
		if(current==6)
			return(jb[0].isSelected());
		if(current==7)
			return(jb[1].isSelected());
		if(current==8)
			return(jb[2].isSelected());
		if(current==9)
			return(jb[3].isSelected());
		if(current==10)
			return(jb[1].isSelected());
		if(current==11)
			return(jb[2].isSelected());
		if(current==12)
			return(jb[0].isSelected());
		if(current==13)
			return(jb[1].isSelected());
		if(current==14)
			return(jb[0].isSelected());
		if(current==15)
			return(jb[0].isSelected());
		if(current==16)
			return(jb[3].isSelected());
		if(current==17)
			return(jb[3].isSelected());
		if(current==18)
			return(jb[0].isSelected());
		if(current==19)
			return(jb[1].isSelected());
		if(current==20)
			return(jb[2].isSelected());
		if(current==21)
			return(jb[0].isSelected());
		if(current==22)
			return(jb[1].isSelected());
		if(current==23)
			return(jb[2].isSelected());
		if(current==24)
			return(jb[1].isSelected());
		if(current==25)
			return(jb[0].isSelected());
		if(current==26)
			return(jb[0].isSelected());
		if(current==27)
			return(jb[0].isSelected());
		if(current==28)
			return(jb[0].isSelected());
		if(current==29)
			return(jb[3].isSelected());
		if(current==30)
			return(jb[2].isSelected());
		if(current==31)
			return(jb[2].isSelected());
		if(current==32)
			return(jb[3].isSelected());
		if(current==33)
			return(jb[2].isSelected());
		if(current==34)
			return(jb[2].isSelected());
		if(current==35)
			return(jb[1].isSelected());
		if(current==36)
			return(jb[3].isSelected());
		if(current==37)
			return(jb[3].isSelected());
		if(current==38)
			return(jb[3].isSelected());
		if(current==39)
			return(jb[3].isSelected());
		if(current==40)
			return(jb[0].isSelected());
		if(current==41)
			return(jb[2].isSelected());
		if(current==42)
			return(jb[3].isSelected());
		if(current==43)
			return(jb[1].isSelected());
		if(current==44)
			return(jb[3].isSelected());
		if(current==45)
			return(jb[0].isSelected());
		if(current==46)
			return(jb[3].isSelected());
		if(current==47)
			return(jb[3].isSelected());
		if(current==48)
			return(jb[0].isSelected());
		if(current==49)
			return(jb[2].isSelected());
		return false;
		
	}
	public static void main(String s[])
	{
		new OnlinePhpDbTest("Kenswed TVTC Online HTMLPHPDB Test");
	}


}