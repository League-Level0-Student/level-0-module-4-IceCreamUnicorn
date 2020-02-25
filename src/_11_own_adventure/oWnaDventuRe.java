package _11_own_adventure;

import javax.swing.JOptionPane;

public class oWnaDventuRe {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "I am going to tell a story, and you are going to listen in to my story.");
String haha = JOptionPane.showInputDialog("You are a lowly pretzel, trying to be a mighty animal cracker. To do that, you have to fight the evil king pretzel. Will you cower or fight"  );
if(haha.equals("fight"))
{
String robber = JOptionPane.showInputDialog("You are a strong pretzel. Now you will walk through the woods. "
		+ "They are dangerous and there are many armed robbers."
		+ " You decide to go and as soon as you walk in, you get attacked by a gang. Will you fight or join.");	
if(robber.equals("fight"))
{
String heehee = JOptionPane.showInputDialog("You stab someone in the face, and he falls to the ground. You grab another person and throw him into a tree."
		+ "He falls to the ground, and doesn't get up again. The rest of them run away. You keep walking, and there is a fork in the road. Will you go right or left.");	
}
else
{
speak("It was a trap. You join them, and then they stab you and eat you for dinner.");
}
}
else
{
speak( "You cower, and stay as a peasant pretzel forever. You don't achieve anything and die.");
}	
	}
	static void speak(String c) {
		try {
			Runtime.getRuntime().exec("say " + c).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
