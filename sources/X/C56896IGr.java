package X;

/* renamed from: X.IGr  reason: case insensitive filesystem */
public final class C56896IGr implements JNY {
    public final int A00;
    public final C286025Tq A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56896IGr) {
                C56896IGr iGr = (C56896IGr) obj;
                if (!0qQ.A0K(this.A01.A00, iGr.A01.A00) || this.A00 != iGr.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C56896IGr(java.lang.String r3, int r4) {
        /*
            r2 = this;
            X.0sn r1 = X.0sn.A00
            X.5Tq r0 = new X.5Tq
            r0.<init>(r1, r1, r3)
            r2.<init>((X.C286025Tq) r0, (int) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56896IGr.<init>(java.lang.String, int):void");
    }

    public final void AC8(C56159Htn htn) {
        int i;
        int length;
        int i2 = htn.A01;
        if (i2 != -1) {
            i = htn.A00;
        } else {
            i2 = htn.A03;
            i = htn.A02;
        }
        String str = this.A01.A00;
        htn.A04(i2, i, str);
        int i3 = htn.A03;
        int i4 = htn.A02;
        if (i3 != i4) {
            i4 = -1;
        }
        int i5 = this.A00;
        int i6 = i4 + i5;
        if (i5 > 0) {
            length = i6 - 1;
        } else {
            length = i6 - str.length();
        }
        int A03 = C229632nm.A03(length, 0, htn.A04.A00());
        htn.A03(A03, A03);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01.A00) + this.A00;
    }

    public final String toString() {
        return 002.A0l("CommitTextCommand(text='", this.A01.A00, "', newCursorPosition=", ')', this.A00);
    }

    public C56896IGr(C286025Tq r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
