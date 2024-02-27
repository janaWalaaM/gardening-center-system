/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.gardening_center;

/**
 *
 * @author janawalaa
 */
public class Visa extends PaymentMethod{
    
    @Override
    public void cardNumber(long number){
        super.setCardNumber(number);
    }; 

    @Override
    public void expirationDate(Date date) {
        super.setExpirationDate(date);
    }

    @Override
    public void CVC(int number) {
        super.setCvc(number);
    }
}
