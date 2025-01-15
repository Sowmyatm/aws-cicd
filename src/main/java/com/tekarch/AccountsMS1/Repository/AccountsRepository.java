package com.tekarch.AccountsMS1.Repository;

import com.tekarch.AccountsMS1.models.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

}
