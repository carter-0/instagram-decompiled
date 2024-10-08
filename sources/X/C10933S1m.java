package X;

/* renamed from: X.S1m  reason: case insensitive filesystem */
public final class C10933S1m {
    public final C60870jn A00;
    public final C60870jn A01;
    public final C13563Tcc A02;

    public final void A00(QYK qyk) {
        Integer num;
        19i r0 = qyk.A00;
        if (r0 == null || r0.A01 == null) {
            num = AnonymousClass05K.A0Y;
        } else {
            C60870jn r7 = this.A00;
            19i A002 = r7.A00();
            if (A002 != null) {
                19i r3 = qyk.A00;
                long j = r3.A00;
                long j2 = A002.A00;
                if (j >= j2) {
                    if (j != j2 || !r3.A01.equals(A002.A01)) {
                        num = AnonymousClass05K.A1F;
                    } else {
                        num = AnonymousClass05K.A0j;
                    }
                }
            }
            19i r1 = qyk.A00;
            synchronized (r7) {
                0qQ.A0B(r1, 0);
                r7.A00.A02(r1);
            }
            qyk.A01 = AnonymousClass05K.A0u;
            this.A02.Dvb(A002, qyk.A00, AnonymousClass05K.A01, qyk.A02);
            return;
        }
        qyk.A01 = num;
    }

    public C10933S1m(C13563Tcc tcc, C60870jn r2, C60870jn r3) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = tcc;
    }
}
