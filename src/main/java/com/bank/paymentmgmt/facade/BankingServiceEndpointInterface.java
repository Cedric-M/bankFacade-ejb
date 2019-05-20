/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.paymentmgmt.facade;

/**
 *
 * @author ced
 */
public interface BankingServiceEndpointInterface {
    Boolean createPayment(String ccNumber, Double amount) ;
}
