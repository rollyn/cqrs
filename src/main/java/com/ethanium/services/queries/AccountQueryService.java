package com.ethanium.services.queries;

import com.ethanium.entities.AccountQueryEntity;

import java.util.List;

public interface AccountQueryService {
    public List<Object> listEventsForAccount(String accountNumber);
    public AccountQueryEntity getAccount(String accountNumber);
}
