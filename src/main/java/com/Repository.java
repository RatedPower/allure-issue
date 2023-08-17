package com;


import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<String, String>{


	@jakarta.transaction.Transactional(value = jakarta.transaction.Transactional.TxType.REQUIRES_NEW)
	default String getReferenceByIdNew(String s) {
		return getReferenceById(s);
	}
}
