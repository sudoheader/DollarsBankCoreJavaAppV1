package com.dollarsbank.controller;

import com.dollarsbank.model.Account;
import com.dollarsbank.model.Customer;

//FIXME: needs edits
@Path("account")
@Controller
public class DollarsBankController {
    @Inject
    private Customer customer;

    @Inject
    private Account account;

    @GET
    public String getAccounts(@QueryParam("id") long productId) {
        Account account = this.account.getDepositAmount(depositAmount);
        customer.put("account", account);
        return "/WEB-INF/jsp/accountDetailPage.jsp";
    }
}