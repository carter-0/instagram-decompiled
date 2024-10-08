package X;

/* renamed from: X.5Tl  reason: invalid class name and case insensitive filesystem */
public final class C285975Tl {
    public static final C286015Tp A03 = new C286005To(C285995Tn.A00, C285985Tm.A00);
    public final long A00;
    public final C286025Tq A01;
    public final C285965Tk A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C285975Tl(java.lang.String r4, long r5) {
        /*
            r3 = this;
            r2 = 0
            X.0sn r1 = X.0sn.A00
            X.5Tq r0 = new X.5Tq
            r0.<init>(r1, r1, r4)
            r3.<init>(r0, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C285975Tl.<init>(java.lang.String, long):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C285975Tl)) {
            return false;
        }
        C285975Tl r7 = (C285975Tl) obj;
        return this.A00 == r7.A00 && 0qQ.A0K(this.A02, r7.A02) && 0qQ.A0K(this.A01, r7.A01);
    }

    public final int hashCode() {
        int i;
        long j = this.A00;
        int hashCode = ((this.A01.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        C285965Tk r0 = this.A02;
        if (r0 != null) {
            long j2 = r0.A00;
            i = (int) (j2 ^ (j2 >>> 32));
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextFieldValue(text='");
        sb.append(this.A01);
        sb.append("', selection=");
        sb.append(C285965Tk.A02(this.A00));
        sb.append(", composition=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C285975Tl(C286025Tq r13, C285965Tk r14, long j) {
        C285965Tk r0;
        this.A01 = r13;
        int length = r13.A00.length();
        int i = (int) (j >> 32);
        int A032 = C229632nm.A03(i, 0, length);
        int i2 = (int) (j & 4294967295L);
        int A033 = C229632nm.A03(i2, 0, length);
        this.A00 = (A032 == i && A033 == i2) ? j : C3026964x.A00(A032, A033);
        if (r14 != null) {
            long j2 = r14.A00;
            int i3 = (int) (j2 >> 32);
            int A034 = C229632nm.A03(i3, 0, length);
            int i4 = (int) (j2 & 4294967295L);
            int A035 = C229632nm.A03(i4, 0, length);
            r0 = new C285965Tk((A034 == i3 && A035 == i4) ? j2 : C3026964x.A00(A034, A035));
        } else {
            r0 = null;
        }
        this.A02 = r0;
    }
}
