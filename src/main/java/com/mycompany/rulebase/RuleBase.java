/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rulebase;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Buhrkall
 */
@WebService(serviceName = "RuleBase")
@Stateless()
public class RuleBase {
    
    

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getBanks")
    public String getBanks(
            @WebParam(name = "ssn") String ssn, 
            @WebParam(name = "creditScore") int creditScore, 
            @WebParam(name = "loanAmount") double loanAmount, 
            @WebParam(name = "loanDuration") int loanDuration) {
        
        
        if(creditScore <= 400){
        return "DreamTeamJSONQueue,DreamTeamXMLQueue";
        }
        return "cphbusiness,bankXML,cphbusiness.bankJSON";
    }

    /**
     * This is a sample web service operation
     */
    
}
