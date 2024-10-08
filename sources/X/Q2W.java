package X;

import com.google.common.util.concurrent.ListenableFuture;

public final class Q2W implements C303636Ad {
    public final /* synthetic */ Q2X A00;
    public final /* synthetic */ Q1l A01;
    public final /* synthetic */ AnonymousClass6OE A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C62320sa A04;

    public Q2W(Q2X q2x, Q1l q1l, AnonymousClass6OE r3, String str, C62320sa r5) {
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = str;
        this.A01 = q1l;
        this.A00 = q2x;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.1K2] */
    public final /* bridge */ /* synthetic */ ListenableFuture ABk(Object obj) {
        C52600GYz gYz = (C52600GYz) obj;
        if (gYz != null) {
            try {
                C62320sa r0 = this.A04;
                if (r0 != null) {
                    r0.invoke();
                }
                return C255183ti.A03(AnonymousClass6OE.A00(this.A00, gYz));
            } catch (RJZ e) {
                ? obj2 = new Object();
                obj2.setException(e);
                return obj2;
            }
        } else {
            0qQ.A0B("renderableModel is null", 1);
            throw new Exception("renderableModel is null", (Throwable) null);
        }
    }
}
