package X;

/* renamed from: X.Oyn  reason: case insensitive filesystem */
public final class C72219Oyn implements 1NU {
    public final int A00;
    public final 02m A01;
    public final 1NU A02;
    public final String A03;

    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        0qQ.A0B(obj, 0);
        02m r4 = this.A01;
        int i = this.A00;
        r4.markerStart(1001455617, i, "event", this.A03);
        try {
            Object then = this.A02.then(obj);
            r4.markerEnd(1001455617, i, 2);
            return then;
        } catch (Exception e) {
            r4.markerEnd(1001455617, i, 3);
            throw e;
        }
    }

    public C72219Oyn(02m r2, 1NU r3, String str) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = str;
        this.A00 = str.hashCode();
    }
}
