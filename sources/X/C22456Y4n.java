package X;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

/* renamed from: X.Y4n  reason: case insensitive filesystem */
public final class C22456Y4n implements YAz {
    public int A00 = 0;
    public long A01 = 262144;
    public C22023Xt4 A02;
    public final Y1U A03;
    public final Y7U A04;
    public final YCS A05;
    public final YCT A06;

    public static C22023Xt4 A00(C22456Y4n y4n) {
        C21971XoG xoG = new C21971XoG();
        while (true) {
            String E6q = y4n.A06.E6q(y4n.A01);
            long j = y4n.A01;
            int length = E6q.length();
            y4n.A01 = j - ((long) length);
            if (length == 0) {
                return new C22023Xt4(xoG);
            }
            int indexOf = E6q.indexOf(":", 1);
            if (indexOf != -1) {
                xoG.A02(E6q.substring(0, indexOf), E6q.substring(indexOf + 1));
            } else {
                if (E6q.startsWith(":")) {
                    E6q = E6q.substring(1);
                }
                xoG.A02("", E6q);
            }
        }
    }

    public final void A01(String str, C22023Xt4 xt4) {
        int i = this.A00;
        if (i == 0) {
            YCS ycs = this.A05;
            ycs.FOH(str);
            ycs.FOH("\r\n");
            String[] strArr = xt4.A00;
            int length = strArr.length / 2;
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                ycs.FOH(strArr[i3]);
                ycs.FOH(": ");
                ycs.FOH(strArr[i3 + 1]);
                ycs.FOH("\r\n");
            }
            ycs.FOH("\r\n");
            this.A00 = 1;
            return;
        }
        throw DbW.A0b("state: ", i);
    }

    public final C13972Tma AMs(C21464Xbw xbw, long j) {
        if ("chunked".equalsIgnoreCase(xbw.A02.A03("Transfer-Encoding"))) {
            int i = this.A00;
            if (i == 1) {
                this.A00 = 2;
                return new C22458Y4p(this);
            }
            throw DbW.A0b("state: ", i);
        }
        int i2 = this.A00;
        if (i2 == 1) {
            this.A00 = 2;
            return new C22459Y4q(this);
        }
        throw DbW.A0b("state: ", i2);
    }

    public final void AVZ() {
        this.A05.flush();
    }

    public final void AW5() {
        this.A05.flush();
    }

    public final Xny E6d(boolean z) {
        String str;
        int i = this.A00;
        int i2 = 3;
        if (i == 1 || i == 3) {
            try {
                String E6q = this.A06.E6q(this.A01);
                this.A01 -= (long) E6q.length();
                Xnu A002 = Xnu.A00(E6q);
                Xny xny = new Xny();
                xny.A06 = A002.A02;
                int i3 = A002.A00;
                xny.A00 = i3;
                xny.A03 = A002.A01;
                xny.A05 = C21971XoG.A00(A00(this));
                if (z && i3 == 100) {
                    return null;
                }
                if (i3 != 100) {
                    i2 = 4;
                }
                this.A00 = i2;
                return xny;
            } catch (EOFException e) {
                Y7U y7u = this.A04;
                if (y7u != null) {
                    str = y7u.A0E.A02.A0A.A0A();
                } else {
                    str = "unknown";
                }
                throw new IOException(002.A0R("unexpected end of stream on ", str), e);
            }
        } else {
            throw DbW.A0b("state: ", i);
        }
    }

    public final void FO2(C21464Xbw xbw) {
        Proxy.Type type = this.A04.A0E.A01.type();
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(xbw.A00);
        A1A.append(' ');
        C11427STm sTm = xbw.A03;
        if (sTm.A03.equals("https") || type != Proxy.Type.HTTP) {
            String A07 = sTm.A07();
            String A08 = sTm.A08();
            if (A08 != null) {
                A07 = 002.A0T(A07, A08, '?');
            }
            A1A.append(A07);
        } else {
            A1A.append(sTm);
        }
        A01(AnonymousClass7TF.A0l(" HTTP/1.1", A1A), xbw.A02);
    }

    public final void cancel() {
        Y7U y7u = this.A04;
        if (y7u != null) {
            SUS.A0A(y7u.A05);
        }
    }

    public C22456Y4n(Y1U y1u, Y7U y7u, YCS ycs, YCT yct) {
        this.A03 = y1u;
        this.A04 = y7u;
        this.A06 = yct;
        this.A05 = ycs;
    }

    public final Y7U AJK() {
        return this.A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        if (r3 != -1) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C13970TmY E1F(X.Y1H r6) {
        /*
            r5 = this;
            boolean r0 = X.SQZ.A02(r6)
            if (r0 != 0) goto L_0x0016
            r3 = 0
        L_0x0008:
            int r1 = r5.A00
            r0 = 4
            if (r1 != r0) goto L_0x0051
            r0 = 5
            r5.A00 = r0
            X.Y7R r0 = new X.Y7R
            r0.<init>(r5, r3)
            return r0
        L_0x0016:
            java.lang.String r0 = "Transfer-Encoding"
            r2 = 0
            X.Xt4 r1 = r6.A05
            java.lang.String r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0022
            r2 = r0
        L_0x0022:
            java.lang.String r0 = "chunked"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x003c
            X.Xbw r0 = r6.A07
            X.STm r2 = r0.A03
            int r1 = r5.A00
            r0 = 4
            if (r1 != r0) goto L_0x0058
            r0 = 5
            r5.A00 = r0
            X.Y7T r0 = new X.Y7T
            r0.<init>(r2, r5)
            return r0
        L_0x003c:
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r1.A03(r0)
            r3 = -1
            if (r0 == 0) goto L_0x005f
            long r3 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x004a }
        L_0x004a:
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x005f
            goto L_0x0008
        L_0x0051:
            java.lang.String r0 = "state: "
            java.lang.IllegalStateException r0 = X.DbW.A0b(r0, r1)
            throw r0
        L_0x0058:
            java.lang.String r0 = "state: "
            java.lang.IllegalStateException r0 = X.DbW.A0b(r0, r1)
            throw r0
        L_0x005f:
            int r1 = r5.A00
            r0 = 4
            if (r1 != r0) goto L_0x0072
            r0 = 5
            r5.A00 = r0
            X.Y7U r0 = r5.A04
            r0.A01()
            X.Y7S r0 = new X.Y7S
            r0.<init>(r5)
            return r0
        L_0x0072:
            java.lang.String r0 = "state: "
            java.lang.IllegalStateException r0 = X.DbW.A0b(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22456Y4n.E1F(X.Y1H):X.TmY");
    }

    public final long EHG(Y1H y1h) {
        String A032;
        if (!SQZ.A02(y1h)) {
            return 0;
        }
        String str = null;
        C22023Xt4 xt4 = y1h.A05;
        String A033 = xt4.A03("Transfer-Encoding");
        if (A033 != null) {
            str = A033;
        }
        if ("chunked".equalsIgnoreCase(str) || (A032 = xt4.A03("Content-Length")) == null) {
            return -1;
        }
        try {
            return Long.parseLong(A032);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
