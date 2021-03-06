package com.gamesys.sample.reimbursement.core;

import java.math.BigDecimal;

public interface ReimbursementService {

    void reimburse(String itemName, BigDecimal amount, String receiptUrl);

}
