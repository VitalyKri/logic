package com.seflaccounting.mainaccount.dao;

import com.seflaccounting.mainaccount.entity.Instrument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstrumentDao extends JpaRepository<Instrument, String> {

}
