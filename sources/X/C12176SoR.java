package X;

import com.facebook.papaya.client.ICallback;
import java.util.Map;

/* renamed from: X.SoR  reason: case insensitive filesystem */
public final class C12176SoR implements ICallback {
    public final /* synthetic */ S3J A00;
    public final /* synthetic */ S1l A01;

    public C12176SoR(S3J s3j, S1l s1l) {
        this.A00 = s3j;
        this.A01 = s1l;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final void onExecutorComplete(String str, Map map) {
        C10742RxL rxL;
        0qQ.A0B(str, 0);
        C249803kO A0J = C66580MXl.A0J(this.A00.A00());
        while (A0J.hasNext()) {
            C10673Rw8 rw8 = (C10673Rw8) A0J.next();
            if (str.equals("batch_mldw_falco_executor") && rw8.A00 && (rxL = this.A01.A02) != null) {
                rxL.A03.execute(new C13022TIe(rxL, rw8, new Object()));
            }
        }
    }
}
