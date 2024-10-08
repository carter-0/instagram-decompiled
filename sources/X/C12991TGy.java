package X;

import com.fbpay.w3c.FBPaymentServiceCardDetailsCallback;
import com.instagram.fbpay.w3c.ipc.FBPaymentServiceImpl;

/* renamed from: X.TGy  reason: case insensitive filesystem */
public final class C12991TGy implements Runnable {
    public final /* synthetic */ FBPaymentServiceCardDetailsCallback A00;
    public final /* synthetic */ FBPaymentServiceImpl A01;

    public C12991TGy(FBPaymentServiceCardDetailsCallback fBPaymentServiceCardDetailsCallback, FBPaymentServiceImpl fBPaymentServiceImpl) {
        this.A01 = fBPaymentServiceImpl;
        this.A00 = fBPaymentServiceCardDetailsCallback;
    }

    public final void run() {
        FBPaymentServiceImpl fBPaymentServiceImpl = this.A01;
        S7C s7c = fBPaymentServiceImpl.A02;
        if (s7c != null) {
            C9678Rew.A00(fBPaymentServiceImpl, s7c.A00(), new C66308MMr(this.A00, 9));
        }
    }
}
