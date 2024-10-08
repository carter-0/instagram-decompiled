package X;

/* renamed from: X.QwQ  reason: case insensitive filesystem */
public final class C8526QwQ extends C13131TMp {
    public int A00;
    public final Object A01;
    public final /* synthetic */ TS6 A02;

    public C8526QwQ(TS6 ts6, int i) {
        this.A02 = ts6;
        Object[] objArr = ts6.A04;
        objArr.getClass();
        this.A01 = objArr[i];
        this.A00 = i;
    }

    public static final void A00(C8526QwQ qwQ) {
        int i = qwQ.A00;
        if (i != -1) {
            TS6 ts6 = qwQ.A02;
            if (i < ts6.size()) {
                Object obj = qwQ.A01;
                int i2 = qwQ.A00;
                Object[] objArr = ts6.A04;
                objArr.getClass();
                if (C9718Rfb.A00(obj, objArr[i2])) {
                    return;
                }
            }
        }
        qwQ.A00 = TS6.A00(qwQ.A02, qwQ.A01);
    }
}
