
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Bot extends JFrame {

	//Typing Area:
	private JTextField txtEnter = new JTextField();
	
	//Chat Area:
	private JTextArea txtChat = new JTextArea();
	
	public Bot() {
            String arr[]={"ahmed","ali","islam"};
		//Frame Attributes:
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(null);
		this.setTitle("Java AI");
                this.setBackground(Color.yellow);
                
		
		//txtEnter Attributes:
		txtEnter.setLocation(2, 520);
		txtEnter.setSize(590, 30);
		
		//txtEnter Action Event:
		txtEnter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {//implement the methode
				String uText = txtEnter.getText();
				txtChat.append("You : " + uText + "\n");
                                
                                
				if(uText.contains("bot")){
                                    //times();
                                     botSay("yes  Iam her !!");
                                      botSay("can I help you?");
                                }else if(uText.contains("ok")){
                                    //times();
                                     botSay("ask me ../n");
                  
			     }else if(uText.contains("whats your name?")){
                                    //times();
                                     botSay("my name ChatBot /n ");
                         
                                        botSay("whats your name?");
                                        
                                   
				}else if(uText.contains("ali")){
                                    //times();
                                     botSay("Good Name /n");
                         
                                       
                                        
                                   
				}else if(uText.contains("can you learn me English")){
                                    //times();
                                     botSay("I Try with you");
                         
                                        botSay("You know English characters ");
                                        
                                   
				}else if(uText.contains("yes")){
                                    //times();
                                     botSay("Its Good");
                         
                                    botSay("I will start with you now /n ");
                                         botSay("you are ready ");
                                   
				}else if(uText.contains("hi")){
                                    //times();
                                     botSay("Hello there!/n");
                         
                                        botSay("whats your name?");
                                        
                                   
				}else 
                                    for (int i = 0; i <arr.length; i++) 
                                         if(uText.contains(arr[i])){
                                      botSay("good name");
                                }
                                    
                                   
				else if(uText.contains("how are you")){
					int decider = (int) (Math.random()*2+1);
					if(decider == 1){
						botSay("I'm doing well, thanks");
					}
					else if(decider == 2){
						botSay("Not too bad");
					}
				}
				else{
					int decider = (int) (Math.random()*3+1);
					if(decider == 1){
						botSay("I didn't get that");
					}
					else if(decider == 2){
						botSay("Please rephrase that");
					}
					else if(decider == 3){
						botSay("???");
					}
				}
				txtEnter.setText("");
			}
		});
		
		//txtChat Attributes:
		txtChat.setLocation(15, 5);
		txtChat.setSize(560, 510);
		txtChat.setEditable(false);
		
		//Add Items To Frame:
		this.add(txtEnter);
		this.add(txtChat);
	}
	
	public void botSay(String s){
		txtChat.append("AI: " + s + "\n");
	}
	
	public static void main(String[] args){
		new Bot();
	}
        
        public static void times() {
            try {
                Thread.sleep(2500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Bot.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

}