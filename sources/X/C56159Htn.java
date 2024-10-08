package X;

/* renamed from: X.Htn  reason: case insensitive filesystem */
public final class C56159Htn {
    public int A00 = -1;
    public int A01 = -1;
    public int A02;
    public int A03;
    public final C54730HQk A04;

    public final char A00(int i) {
        String str;
        int i2;
        C54730HQk hQk = this.A04;
        C54723HQc hQc = hQk.A02;
        if (hQc == null || i < (i2 = hQk.A01)) {
            str = hQk.A03;
        } else {
            int i3 = hQc.A00;
            int i4 = hQc.A01;
            int i5 = hQc.A02;
            int i6 = i3 - (i4 - i5);
            if (i < i6 + i2) {
                int i7 = i - i2;
                char[] cArr = hQc.A03;
                if (i7 >= i5) {
                    i7 = (i7 - i5) + i4;
                }
                return cArr[i7];
            }
            str = hQk.A03;
            i -= (i6 - hQk.A00) + i2;
        }
        return str.charAt(i);
    }

    public final void A02(int i, int i2) {
        int A002;
        if (i < 0 || i > (A002 = this.A04.A00())) {
            throw C51969G9p.A0p("start (", ") offset is outside of text region ", i, this.A04.A00());
        } else if (i2 < 0 || i2 > A002) {
            throw C51969G9p.A0p("end (", ") offset is outside of text region ", i2, A002);
        } else if (i < i2) {
            this.A01 = i;
            this.A00 = i2;
        } else {
            throw C51971G9r.A0l("Do not set reversed or empty range: ", " > ", i, i2);
        }
    }

    public final void A03(int i, int i2) {
        int A002;
        if (i < 0 || i > (A002 = this.A04.A00())) {
            throw C51969G9p.A0p("start (", ") offset is outside of text region ", i, this.A04.A00());
        } else if (i2 < 0 || i2 > A002) {
            throw C51969G9p.A0p("end (", ") offset is outside of text region ", i2, A002);
        } else if (i <= i2) {
            this.A03 = i;
            this.A02 = i2;
        } else {
            throw C51971G9r.A0l("Do not set reversed range: ", " > ", i, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r3.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(int r4, int r5, java.lang.String r6) {
        /*
            r3 = this;
            java.lang.String r2 = ") offset is outside of text region "
            if (r4 < 0) goto L_0x003c
            X.HQk r0 = r3.A04
            int r1 = r0.A00()
            if (r4 > r1) goto L_0x003c
            if (r5 < 0) goto L_0x0035
            if (r5 > r1) goto L_0x0035
            if (r4 > r5) goto L_0x002c
            r0.A01(r4, r5, r6)
            int r1 = X.C51966G9m.A05(r6, r4)
            if (r1 < 0) goto L_0x0025
            r3.A03 = r1
            r3.A02 = r1
            r0 = -1
            r3.A01 = r0
            r3.A00 = r0
            return
        L_0x0025:
            java.lang.String r0 = "Cannot set selectionStart to a negative value: "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r1)
            throw r0
        L_0x002c:
            java.lang.String r1 = "Do not set reversed range: "
            java.lang.String r0 = " > "
            java.lang.IllegalArgumentException r0 = X.C51971G9r.A0l(r1, r0, r4, r5)
            throw r0
        L_0x0035:
            java.lang.String r0 = "end ("
            java.lang.IndexOutOfBoundsException r0 = X.C51969G9p.A0p(r0, r2, r5, r1)
            throw r0
        L_0x003c:
            java.lang.String r1 = "start ("
            X.HQk r0 = r3.A04
            int r0 = r0.A00()
            java.lang.IndexOutOfBoundsException r0 = X.C51969G9p.A0p(r1, r2, r4, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56159Htn.A04(int, int, java.lang.String):void");
    }

    public final String toString() {
        return this.A04.toString();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.HQk, java.lang.Object] */
    public C56159Htn(C286025Tq r6, long j) {
        int length;
        String str = r6.A00;
        ? obj = new Object();
        obj.A03 = str;
        obj.A01 = -1;
        obj.A00 = -1;
        this.A04 = obj;
        int A012 = C285965Tk.A01(j);
        this.A03 = A012;
        int A002 = C285965Tk.A00(j);
        this.A02 = A002;
        if (A012 < 0 || A012 > (length = r6.length())) {
            throw C51969G9p.A0p("start (", ") offset is outside of text region ", A012, r6.length());
        } else if (A002 < 0 || A002 > length) {
            throw C51969G9p.A0p("end (", ") offset is outside of text region ", A002, length);
        } else if (A012 > A002) {
            throw C51971G9r.A0l("Do not set reversed range: ", " > ", A012, A002);
        }
    }

    public final void A01(int i, int i2) {
        int A002;
        long A003 = C3026964x.A00(i, i2);
        this.A04.A01(i, i2, "");
        long A004 = C54753HRl.A00(C3026964x.A00(this.A03, this.A02), A003);
        int A012 = C285965Tk.A01(A004);
        if (A012 >= 0) {
            this.A03 = A012;
            int A005 = C285965Tk.A00(A004);
            if (A005 >= 0) {
                this.A02 = A005;
                int i3 = this.A01;
                if (i3 != -1) {
                    long A006 = C54753HRl.A00(C3026964x.A00(i3, this.A00), A003);
                    if (C285965Tk.A03(A006)) {
                        A002 = -1;
                        this.A01 = -1;
                    } else {
                        this.A01 = C285965Tk.A01(A006);
                        A002 = C285965Tk.A00(A006);
                    }
                    this.A00 = A002;
                    return;
                }
                return;
            }
            throw DbW.A0a("Cannot set selectionEnd to a negative value: ", A005);
        }
        throw DbW.A0a("Cannot set selectionStart to a negative value: ", A012);
    }
}
