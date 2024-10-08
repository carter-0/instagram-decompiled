package com.facebook.payments.dcp.xapp.controller;

import X.C13713Tfb;
import X.C2375037z;
import X.C262074Ca;
import X.C262094Cc;
import X.C8918RFl;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class InAppPurchaseControllerCoro$createQuoteAndPayment$$inlined$CoroutineExceptionHandler$1 extends C262074Ca implements CoroutineExceptionHandler {
    public final /* synthetic */ C13713Tfb $purchaseListener$inlined;
    public final /* synthetic */ InAppPurchaseControllerCoro this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppPurchaseControllerCoro$createQuoteAndPayment$$inlined$CoroutineExceptionHandler$1(C2375037z r1, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, C13713Tfb tfb) {
        super(r1);
        this.this$0 = inAppPurchaseControllerCoro;
        this.$purchaseListener$inlined = tfb;
    }

    public void handleException(C262094Cc r3, Throwable th) {
        C13713Tfb tfb = this.$purchaseListener$inlined;
        if (tfb != null) {
            tfb.Db0(C8918RFl.UNKNOWN_FAILURE);
        }
    }
}
