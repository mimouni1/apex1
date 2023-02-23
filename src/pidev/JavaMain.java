/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pidev;

import interfaces.Interface_IService;
import java.sql.Date;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.CodePromo;
import models.User;
import services.CodePromoService;
import services.UserService;

/**
 *
 * @author Firas
 */
public class JavaMain extends Application{
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         launch(args);
         
         Interface_IService ui= new UserService() ;
         Interface_IService cs= new CodePromoService() ;
         CodePromo c1= new CodePromo(123456, new Date(1920), new Date(2920));
         CodePromo c2= new CodePromo(7777, new Date(1479), new Date(1234));
         
         
         // add codepromo
         //cs.ajouter(c1);
         //cs.ajouter(c2);
         
         // Afficher All
         
         //System.out.println(cs.afficher());
         
         // modifier codepromo
         
         //c1.setId_codePromo(1);
         //c1.setCodePromo(111111);
         //cs.modifier(c1);
         
         // Supprimer code promo
         
         //cs.supprimer(3);
         
          User u1 = new User("ikbel", "yassine", new Date(2023 ,02 ,22), "yosri.ikbel@gamil.com", "yosriDOL123", 99229311, "Ariana", "chaffeur",c1);
          User u2 = new User("ikbel", "Chawki", new Date(1920), "chawki.ikbel@gamil.com", "chawkiDOL123", 24239040, "Ariana", "chaffeur",c1);
          User u4 = new User("abdeslem", "tounsi", new Date(2022), "slouma@gamil.com", "slouma120", 1231234, "franca", "chiffour",c2);
          
         //ui.ajouter(u1);
         //ui.ajouter(u2);
         //ui.ajouter(u4);
          //u.setNom("azouz");
          //System.out.println(u);
          //ui.modifier(u);
         // System.out.println(ui.afficher());
         // System.out.println(cs.afficher());
                  
          //ui.afficher("1");
   
          // read by id
          
          //System.out.println(ui.readById(1));
          
          
      }

    @Override
    public void start(Stage primaryStage) throws Exception {
 Parent root = FXMLLoader.load(getClass().getResource("../GUI/User.fxml"));
    Scene scene = new Scene(root);
    primaryStage.setTitle("BOOK IT");
    primaryStage.setScene(scene);
    primaryStage.show();   
    } 
    

}
