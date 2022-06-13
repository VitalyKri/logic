package com.seflaccounting.mainaccount.dao;

import com.seflaccounting.mainaccount.entity.PositionPortfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionPortfolioDao  extends JpaRepository<PositionPortfolio, String> {
}
