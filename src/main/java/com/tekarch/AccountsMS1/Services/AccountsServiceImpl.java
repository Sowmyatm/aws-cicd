package com.tekarch.AccountsMS1.Services;

import com.tekarch.AccountsMS1.Repository.AccountsRepository;
import com.tekarch.AccountsMS1.Services.AccountServiceInterface;
import com.tekarch.AccountsMS1.models.Accounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsServiceImpl implements AccountServiceInterface {

    @Autowired
    private AccountsRepository accountsRepository;

    @Override
    public List<Accounts> getAllAccounts() {
        return accountsRepository.findAll();
    }

    @Override
    public Accounts getAccountById(Long accountId) {
        return accountsRepository.findById(accountId).orElse(null);
    }

    @Override
    public Accounts addAccount(Accounts accounts) {
        return accountsRepository.save(accounts);
    }

    @Override
    public void deleteAccount(Long accountId) {
        accountsRepository.deleteById(accountId);
    }

    @Override
    public Accounts updateAccount(Accounts accounts) {
        return accountsRepository.save(accounts);
    }
}
