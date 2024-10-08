package X;

import java.lang.ref.Reference;

/* renamed from: X.DHv  reason: case insensitive filesystem */
public final class C45992DHv implements Runnable {
    public final /* synthetic */ C45401Cvh A00;
    public final /* synthetic */ C253953rg A01;

    public C45992DHv(C45401Cvh cvh, C253953rg r2) {
        this.A01 = r2;
        this.A00 = cvh;
    }

    public final void run() {
        1Xj A02;
        AnonymousClass3W1 r1;
        C253953rg r3 = this.A01;
        C45401Cvh cvh = this.A00;
        if (r3.A01.containsKey(cvh.A03) && (A02 = 1E7.A00(r3.A00).A02(002.A0T(cvh.A03, cvh.A02.A00, '_'))) != null && !cvh.A04) {
            A02.A3u(cvh.A01.A00.intValue());
            A02.A0C.ESK(cvh.A00.A00);
            Reference reference = (Reference) r3.A02.get(A02.A30());
            if (reference != null && (r1 = (AnonymousClass3W1) reference.get()) != null) {
                AnonymousClass3W1.A00(r1, 12);
            }
        }
    }
}
