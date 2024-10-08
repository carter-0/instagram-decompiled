package com.fbpay.auth.models;

import X.Pxg;
import java.util.Set;

public @interface AuthTicketType {
    public static final Set A00 = Pxg.A18(new String[]{"BIO_OR_PIN", "PIN", "BIO", "CSC", "PAYPAL_ACCESS_TOKEN", "TRUSTED_DEVICE", "SMS_OTP", "MFT_TRUSTED_DEVICE", "MFT_SMS_OTP", "MFT_RECOVERY_CODE"});
}
