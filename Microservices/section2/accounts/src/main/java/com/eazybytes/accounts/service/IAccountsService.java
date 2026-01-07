package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * 
     * @param customerDto - CustomerDto object
     */
    void createAccount(CustomerDto customerDto);

    /**
     * 
     * @param mobileNumber
     * @return Accounts details based on a given mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);

}
