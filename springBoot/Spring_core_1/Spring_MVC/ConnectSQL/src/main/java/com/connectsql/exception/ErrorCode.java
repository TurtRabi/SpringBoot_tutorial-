package com.connectsql.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {
    //LIET KE TAT CA CAC EXCEP TION
    UNCATEGORIZED_EXCEPTION("9999","Uncategory exception"),
    USER_EXISTED("1001","User existed"),
    USERNAME_INVALID("1002","Username is invalid"),
    INVALID_PASSWORD("1003","Password is invalid"),
    ;
    //KHAI BAO CONTRUCTOR
    ErrorCode(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    //KHAI BAO GIA TRI

    private String errorCode;
    private String errorMessage;

}
