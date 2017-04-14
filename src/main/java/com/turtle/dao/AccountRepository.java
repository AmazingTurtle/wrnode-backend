package com.turtle.dao;

import com.turtle.model.Account;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by AmazingTurtle on 13.04.2017.
 */
public interface AccountRepository extends ElasticsearchRepository<Account, String> {
}
