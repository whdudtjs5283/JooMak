package com.joomak.backend.exception;

import com.joomak.backend.domain.common.CommonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomControllerException {

    @ExceptionHandler(NotEnoughStockException.class)
    public CommonResponse<Void> notEnoughStock(final NotEnoughStockException e) {
        return CommonResponse.<Void>builder()
                .httpStatus(HttpStatus.BAD_REQUEST)
                .message(ErrorMessage.NOT_ENOUGH_STOCK.getErrorMessage())
                .build();
    }

    // 리팩토링 하는 법 알려주기

}
