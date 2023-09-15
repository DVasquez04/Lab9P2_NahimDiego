/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import com.healthmarketscience.jackcess.Database;
import java.sql.SQLException;

/**
 *
 * @author nahim
 */
public class BotonAgregar {
    
    Dba database= new Dba("./TENRECORD1.aacbd");
            public void AgregarRegistro(){
                
                database.conectar();
        try {
            database.query.execute("INSERT INTO TenRecord VALUES ('"+jt_OrderId.getText()+"','"+jt_OrderDate.getText()+"','"+jt_ShipDate.getText()+"','"+jt_ShipMode.getText()+"','"+jt_CostumerId.getText()+"','"+jt_CostumerName.getText()+
                    "','"+jt_Segment.getText()+"','"+jt_Country.getText()+"','"+jt_City.getText()+"','"+jt_State.getText()+"','"+jt_PostalCode.getText()+"','"+jt_Region.getText()+"','"+jt_ProductId.getText()+"','"+jt_Category.getText()+
                    "','"+jt_SubCategory.getText()+"','"+jt_ProductName.getText()+"','"+jt_Sales.getText()+"','"+jt_Quantity.getText()+"','"+jt_Discount.getText()+"','"+jt_Profit.getText()+"')");
                    database.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        database.desconectar();
            }
}
