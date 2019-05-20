/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.paymentmgmt.facade;

import javax.ejb.Stateless;

/**
 *
 * @author ced
 */
@Stateless

public class BankingServiceBean implements BankingServiceEndpointInterface{

    @Override
    public Boolean createPayment(String ccNumber, Double amount) {
        
        if(ccNumber.length()== 10 ){
            System.out.println("Montant payé : "+amount +" €");
            return true;
        } else {
            return false;
        }
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
