package com.seflaccounting.mainaccount.dao;

import com.seflaccounting.mainaccount.entity.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationDao extends JpaRepository<Operation, String> {

}
