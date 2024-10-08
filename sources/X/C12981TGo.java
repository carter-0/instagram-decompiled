package X;

import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.GsonUtils;

/* renamed from: X.TGo  reason: case insensitive filesystem */
public final class C12981TGo implements Runnable {
    public final /* synthetic */ C12435SuM A00;
    public final /* synthetic */ String A01;

    public C12981TGo(C12435SuM suM, String str) {
        this.A00 = suM;
        this.A01 = str;
    }

    public final void run() {
        C12435SuM suM = this.A00;
        ((CheckoutHandler) suM.A07.getValue()).A0I(GsonUtils.INSTANCE.toOffsitePaymentUpdatedMsg(this.A01, suM.A01), false);
    }
}
