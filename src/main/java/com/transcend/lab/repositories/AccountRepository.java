package com.transcend.lab.repositories;

import com.transcend.lab.domain.Account;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;

@Profile("middle")
public interface AccountRepository extends CrudRepository<Account, Long> {
}
