package X;

import com.fbpay.w3c.FBPaymentServiceContactCallback;
import com.instagram.fbpay.w3c.ipc.FBPaymentServiceImpl;

/* renamed from: X.TGz  reason: case insensitive filesystem */
public final class C12992TGz implements Runnable {
    public final /* synthetic */ FBPaymentServiceContactCallback A00;
    public final /* synthetic */ FBPaymentServiceImpl A01;

    public C12992TGz(FBPaymentServiceContactCallback fBPaymentServiceContactCallback, FBPaymentServiceImpl fBPaymentServiceImpl) {
        this.A01 = fBPaymentServiceImpl;
        this.A00 = fBPaymentServiceContactCallback;
    }

    public final void run() {
        FBPaymentServiceImpl fBPaymentServiceImpl = this.A01;
        S7C s7c = fBPaymentServiceImpl.A02;
        if (s7c != null) {
            C2818759x r2 = ((S3M) s7c.A01.get()).A02;
            0qQ.A0B(r2, 0);
            C9678Rew.A00(fBPaymentServiceImpl, AnonymousClass72Y.A01(new AnonymousClass5A6(r2), TXY.A00), new C66308MMr(this.A00, 10));
        }
    }
}
