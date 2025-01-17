package com.tekarch.AccountsMS1.Services;

import com.tekarch.AccountsMS1.models.Accounts;

import java.util.List;

public interface AccountServiceInterface {
    List<Accounts> getAllAccounts();
    Accounts getAccountById(Long accountId);
    Accounts addAccount(Accounts accounts);
    void deleteAccount(Long accountId);
    Accounts updateAccount(Accounts accounts);
}

