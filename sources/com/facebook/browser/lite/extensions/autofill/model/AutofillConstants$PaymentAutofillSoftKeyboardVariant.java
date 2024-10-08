package com.facebook.browser.lite.extensions.autofill.model;

import com.google.common.collect.ImmutableSet;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;

@Retention(RetentionPolicy.SOURCE)
public @interface AutofillConstants$PaymentAutofillSoftKeyboardVariant {
    public static final Set A00 = ImmutableSet.A01("PAYMENT_ONLY", "ANY_PAYMENT", "PERSISTENT");
}
