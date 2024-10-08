package com.facebookpay.offsite.models.message;

import com.facebookpay.expresscheckout.handler.ECPHandler;

public interface MessageHandler {
    ECPHandler getEcpHandler();

    void handleMessage(String str, String str2);
}
