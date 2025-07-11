
package com.demo.example.student_library_management_system.converter;

import com.demo.example.student_library_management_system.model.Transaction;
import com.demo.example.student_library_management_system.requestdto.TransactionRequestDto;

public class TransactionConverter {

    public static Transaction convertTransactionRequestDtoIntoTransaction(TransactionRequestDto transactionRequestDto){
        Transaction transaction = new Transaction();
        transaction.setTransactionType(transactionRequestDto.getTransactionType());
        transaction.setDueDate(transactionRequestDto.getDueDate());
        transaction.setFine(transactionRequestDto.getFine());
        return transaction;
    }
}
