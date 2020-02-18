package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String bigboi = JOptionPane.showInputDialog(null, "What pet do ya wanna buy.");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
		//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.


		for(int i = 0; i < 1000; i++) {
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to your pet?", "buttons", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"food", "cuddle", "water","walk","groom","cleanuppoop" }, null);

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if(task ==0) 
{
food();	
}
if(task ==1) 
{
cuddle();	
}
if(task ==2) 
{
water();	
}
if(task ==3) 
{
walk();	
}
if(task ==4) 
{
groom();	
}
if(task ==5) 
{
cleanuppoop();	
}
if(happinessLevel>=1000)
{
JOptionPane.showMessageDialog(null, "U love your pet");
break;
}
}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
static void food() {
	happinessLevel+=100;
	JOptionPane.showMessageDialog(null, "Yum!");
}
static void cuddle() {
	happinessLevel+=69;
	JOptionPane.showMessageDialog(null, "purr!");
}
static void water() {
	happinessLevel+=31;
	JOptionPane.showMessageDialog(null, "Slurp!");
}
static void walk() {
	happinessLevel+=420;
	JOptionPane.showMessageDialog(null, "I'm fat.");
}
static void groom() {
	happinessLevel+=123;
	JOptionPane.showMessageDialog(null, "Thanks!");
}
static void cleanuppoop() {
	happinessLevel+=696969420;
	JOptionPane.showMessageDialog(null, ":D");
}
}