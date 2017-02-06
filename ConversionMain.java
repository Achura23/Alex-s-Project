import java.awt.Color;
import java.io.Console;
import java.util.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.control.TextField;
import javafx.scene.control.ColorPicker;
public class ConversionMain extends Application
{
	static Scanner console=new Scanner(System.in);
	
	public static void main(String args[])
	{
		
		
		
			Conversion testConversion=new Conversion();
			ConversionMenu kobe=new ConversionMenu();
			FinanceMenu test=new FinanceMenu();
			
			
			
			
			
			int choice;
			
			
			do{
			
			testConversion.Box();
			System.out.println();
			
			System.out.println("0. Conversions");
			System.out.println("1. Test.");
			System.out.println("2. Financial Calculations");
			System.out.println("3. exit");
			
			System.out.println();
			testConversion.Box();
			choice=console.nextInt();
			System.out.println(" please enter you choice here: " + choice);
			
			
			
			System.out.println("\n");
			
			switch(choice)
			{
				case 0:
					kobe.subMenu1();
					break;
				case 1:
					launch(args);
					break;
				case 2:
					test.FinancialMenu();
					break;
				case 3:
					System.exit(0);
					break;
			default:
				System.out.println("selection not found.");
			}
			
			}while(choice!=3);
		}
           
		//the method below is practice I am working on in JavaFX to create a username and password. 
		public void start(Stage myStage)
		{
			myStage.setTitle("JavaFX Welcome");
			GridPane grid=new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25,25,25,25));
			
			Scene scene=new Scene(grid, 300,275);
			myStage.setScene(scene);
			
			Label scenetitle=new Label("Welcome");
			//scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL,20));
			grid.add(scenetitle,0,0,2,1);
			
			Label userName=new Label("Username");
			grid.add(userName,0,1);
			
			TextField userTextField=new TextField();
			grid.add(userTextField,1,1);
			
			Label pw=new Label ("Password");
			grid.add(pw,0,2);
			
			PasswordField pwBox=new PasswordField();
			grid.add(pwBox,1,2);
			
			Button btn=new Button("Sign in");
			HBox hbBtn=new HBox(10);
			hbBtn.getChildren().add(btn);
			grid.add(hbBtn,1,4);
			
			final Label actiontarget =new Label();
				grid.add(actiontarget,1,6);
				
				btn.setOnAction(new EventHandler<ActionEvent>(){
					public void handle(ActionEvent e){
						//actiontarget.setColor(Color.RED);
						actiontarget.setText("Sign in button pressed");
					}
				});
				pwBox.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) {
				        if (!pwBox.getText().equals("achura23")) {
				            pw.setText("Your password is incorrect!");
				            //pw.setTextFill(Color.rgb(210, 39, 30));
				        } else {
				            pw.setText("Your password has been confirmed");
				            //pw.setTextFill(Color.rgb(21, 117, 84));
				        }
				        pwBox.clear();
				    }
				});
				
			
			myStage.show();
	}
		
		
}
