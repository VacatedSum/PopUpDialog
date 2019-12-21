import javafx.application.Application;
import javafx.stage.Stage;

public class Tester extends Application {
	public static void main(String[] args) {
		launch(args);
		
		
		
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		boolean sure = PopUpDialog.ConfirmationBox("Are you sure?", "Title");
		
		
		if(sure) {
			PopUpDialog.MessageBox("You are sure.", "Add TITLE Here");
		} else {
			PopUpDialog.MessageBox("I guess you're not so sure.", "add title");
		}
		
		
		String test = PopUpDialog.GetInput("Type some stuff.", "Title goes here", "saddasdas");
		
		
		
		PopUpDialog.MessageBox(test, "title");
		
		
		
		String[] checkboxes = {"Pepperoni", "Meatball", "Mushrooms", "A", "B", "C"};
		String[] choices = PopUpDialog.CheckBox(checkboxes, "Pick some toppings", "Pizza title");
		
		for (int i = 0; i < choices.length; i++) {
			System.out.println(choices[i]);
		}
		
		
		
		String[] radioList = {"Pepperoni", "Meatball", "Mushrooms", "A", "34", "%$#$j9J","", " ", null};
		
		String choice = PopUpDialog.Radio(radioList, "Pick One", "Radio Example");
		
		System.out.println(choice);
		
		String choice2 = PopUpDialog.ChoiceBox(radioList, "Pick a something", "Picker");
		
		System.out.println(choice2);
		
		
	}
	
}
