package X;

import com.fbpay.w3c.FBPaymentServiceAddressCallback;
import com.instagram.fbpay.w3c.ipc.FBPaymentServiceImpl;

/* renamed from: X.TGx  reason: case insensitive filesystem */
public final class C12990TGx implements Runnable {
    public final /* synthetic */ FBPaymentServiceAddressCallback A00;
    public final /* synthetic */ FBPaymentServiceImpl A01;

    public C12990TGx(FBPaymentServiceAddressCallback fBPaymentServiceAddressCallback, FBPaymentServiceImpl fBPaymentServiceImpl) {
        this.A01 = fBPaymentServiceImpl;
        this.A00 = fBPaymentServiceAddressCallback;
    }

    public final void run() {
        FBPaymentServiceImpl fBPaymentServiceImpl = this.A01;
        S7C s7c = fBPaymentServiceImpl.A02;
        if (s7c != null) {
            C2818759x r2 = ((S3M) s7c.A01.get()).A01;
            0qQ.A0B(r2, 0);
            C9678Rew.A00(fBPaymentServiceImpl, AnonymousClass72Y.A01(new AnonymousClass5A6(r2), TXW.A00), new C66308MMr(this.A00, 7));
        }
    }
}
