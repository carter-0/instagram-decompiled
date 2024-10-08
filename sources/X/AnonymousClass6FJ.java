package X;

/* renamed from: X.6FJ  reason: invalid class name */
public final class AnonymousClass6FJ extends AnonymousClass6F6 {
    public final 1aO A00;

    public final void DUK(Object obj) {
        if (this.A00 == 0) {
            try {
                if (this.A00.test(obj)) {
                    this.A04.DUK(obj);
                }
            } catch (Throwable th) {
                A00(th);
            }
        } else {
            this.A04.DUK((Object) null);
        }
    }

    public final int EHR(int i) {
        AnonymousClass66o r1 = this.A01;
        if (r1 == null || (i & 4) != 0) {
            return 0;
        }
        int EHR = r1.EHR(i);
        if (EHR != 0) {
            this.A00 = EHR;
        }
        return EHR;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final java.lang.Object poll() {
        /*
            r2 = this;
        L_0x0000:
            X.66o r0 = r2.A01
            java.lang.Object r1 = r0.poll()
            if (r1 == 0) goto L_0x0010
            X.1aO r0 = r2.A00
            boolean r0 = r0.test(r1)
            if (r0 == 0) goto L_0x0000
        L_0x0010:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6FJ.poll():java.lang.Object");
    }

    public AnonymousClass6FJ(1aL r1, 1aO r2) {
        super(r1);
        this.A00 = r2;
    }
}
