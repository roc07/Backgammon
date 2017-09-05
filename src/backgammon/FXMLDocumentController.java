/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backgammon;

import java.awt.Paint;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import java.util.concurrent.ThreadLocalRandom;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

/**
 *
 * @author john
 */
public class FXMLDocumentController implements Initializable {
  
  @FXML
  private ImageView StartBlueBigOne;
  @FXML
  private Circle Red;  
  @FXML
  private Circle Red1;    
  @FXML
  private TextField DiceResultOne;  
  @FXML
  private TextField DiceResultTwo;   
  @FXML
  private Button Starter; 
  @FXML
  private Button RollD;   
  @FXML
  private Circle Red2;
  @FXML
  private Circle Red3;
  @FXML
  private Circle Red4;
  @FXML
  private Circle Red5;
  @FXML
  private Circle Red6;
  @FXML
  private Circle Red7;
  @FXML
  private Circle Red8;
  @FXML
  private Circle Red9;
  @FXML
  private Circle Red10;
  @FXML
  private Circle Red11;
  @FXML
  private Circle Red12;
  @FXML
  private Circle Red13;
  @FXML
  private Circle Red14;
  @FXML
  private Circle blu;
  @FXML
  private Circle blu1;
  @FXML
  private Circle blu2;
  @FXML
  private Circle blu3;
  @FXML
  private Circle blu4;
  @FXML
  private Circle blu5;
  @FXML
  private Circle blu6;
  @FXML
  private Circle blu7;
  @FXML
  private Circle blu8;
  @FXML
  private Circle blu9;
  @FXML
  private Circle blu10;
  @FXML
  private Circle blu11;
  @FXML
  private Circle blu12;
  @FXML
  private Circle blu13;
  @FXML
  private Circle blu14;
  @FXML
  private ImageView StartBlueSmallTwo;
  @FXML
  private ImageView StartBlueSmallOne;
  @FXML
  private ImageView StartBlueBigTwo;
  @FXML
  private ImageView StartRedBigTwo;
  @FXML
  private ImageView StartRedBigOne;
  @FXML
  private ImageView StartRedSmallOne;
  @FXML
  private ImageView StartRedSmallTwo;
  
  private void SetBlueBigOne(double x, double y){
    blu.relocate(x + 8, y + 160);
    blu1.relocate(x + 8, y + 130);
    blu2.relocate(x + 8, y + 100);
    blu3.relocate(x + 8, y + 70);
    blu4.relocate(x + 8, y + 40); 
  }
  
  private void SetBlueSmallOne(double x, double y){
    blu5.relocate(x + 8, y + 160);
    blu6.relocate(x + 8, y + 130);
    blu8.relocate(x + 8, y + 100);
  }  
  
  private void SetBlueSmallTwo(double x, double y){
    blu9.relocate(x + 3, y + 20);
    blu7.relocate(x + 3, y + 50);
  }    
  
  private void SetBlueBigTwo(double x, double y){
    blu10.relocate(x + 8, y + 120);
    blu11.relocate(x + 8, y + 90);
    blu12.relocate(x + 8, y + 60);
    blu13.relocate(x + 8, y + 30);
    blu14.relocate(x + 8, y + 0); 
  }  

  private void SetRedBigOne(double x, double y){
    Red.relocate(x + 8, y + 120);
    Red1.relocate(x + 8, y + 90);
    Red2.relocate(x + 8, y + 60);
    Red3.relocate(x + 8, y + 30);
    Red4.relocate(x + 8, y + 00); 
  }
  
  private void SetRedSmallOne(double x, double y){
    Red5.relocate(x + 8, y + 0);
    Red6.relocate(x + 8, y + 30);
    Red8.relocate(x + 8, y + 60);
  }  
  
  private void SetRedSmallTwo(double x, double y){
    Red9.relocate(x + 8, y + 90);
    Red7.relocate(x + 8, y + 60);
  }    
  
  private void SetRedBigTwo(double x, double y){
    Red10.relocate(x + 6, y + 40);
    Red11.relocate(x + 6, y + 70);
    Red12.relocate(x + 6, y + 100);
    Red13.relocate(x + 6, y + 130);
    Red14.relocate(x + 6, y + 160); 
  }  
  
  @FXML
  private void StartGameA(ActionEvent event) {
    double x = StartBlueBigOne.getLayoutX();
    double y = StartBlueBigOne.getLayoutY(); 
    SetBlueBigOne(x, y);
    x = StartBlueSmallOne.getLayoutX();
    y = StartBlueSmallOne.getLayoutY();
    SetBlueSmallOne(x, y);
    x = StartBlueSmallTwo.getLayoutX();
    y = StartBlueSmallTwo.getLayoutY();
    SetBlueSmallTwo(x, y);    
    x = StartBlueBigTwo.getLayoutX();
    y = StartBlueBigTwo.getLayoutY();
    SetBlueBigTwo(x, y);     
    
    x = StartRedBigOne.getLayoutX();
    y = StartRedBigOne.getLayoutY();     
    SetRedBigOne(x, y);
    x = StartRedSmallOne.getLayoutX();
    y = StartRedSmallOne.getLayoutY();
    SetRedSmallOne(x, y);
    x = StartRedSmallTwo.getLayoutX();
    y = StartRedSmallTwo.getLayoutY();
    SetRedSmallTwo(x, y);    
    x = StartRedBigTwo.getLayoutX();
    y = StartRedBigTwo.getLayoutY();
    SetRedBigTwo(x, y);      
    
    
    Starter.setVisible(false);
  }

  @FXML
  private void RollDiceB(ActionEvent event){
    int min = 1;
    int max = 6;
    int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
    DiceResultOne.setText(Integer.toString(randomNum));
    randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
    DiceResultTwo.setText(Integer.toString(randomNum));
  }  
  
  
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  
  
}
