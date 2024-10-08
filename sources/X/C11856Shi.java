package X;

import java.security.MessageDigest;

/* renamed from: X.Shi  reason: case insensitive filesystem */
public final class C11856Shi implements C13892TjF {
    public final 0yf A00 = new 01r(0);

    public final void FK7(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            0yf r1 = this.A00;
            if (i < r1.size()) {
                SJ8 sj8 = (SJ8) r1.A05(i);
                Object A06 = r1.A06(i);
                C13530Tc2 tc2 = sj8.A00;
                if (sj8.A03 == null) {
                    sj8.A03 = sj8.A02.getBytes(C13892TjF.A00);
                }
                tc2.FJU(A06, messageDigest, sj8.A03);
                i++;
            } else {
                return;
            }
        }
    }

    public final Object A00(SJ8 sj8) {
        0yf r1 = this.A00;
        if (r1.containsKey(sj8)) {
            return r1.get(sj8);
        }
        return sj8.A01;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11856Shi) {
            return this.A00.equals(((C11856Shi) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Options{values=");
        return Pxg.A0p(this.A00, A1A);
    }
}
