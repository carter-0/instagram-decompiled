package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.Y4j  reason: case insensitive filesystem */
public final class C22452Y4j implements C22552Y9f {
    public final YBQ A00;

    public final Y1H CNe(C21469Xc1 xc1) {
        C21469Xc1 xc12 = xc1;
        C21464Xbw xbw = xc12.A04;
        C21985Xog xog = new C21985Xog(xbw);
        if (xbw.A04 != null) {
            xog.A02("Content-Length", Long.toString(0));
            xog.A02.A01("Transfer-Encoding");
        }
        C22023Xt4 xt4 = xbw.A02;
        boolean z = false;
        if (xt4.A03("Host") == null) {
            xog.A02("Host", SUS.A05(xbw.A03, false));
        }
        if (xt4.A03("Connection") == null) {
            xog.A02("Connection", "Keep-Alive");
        }
        String A002 = AnonymousClass000.A00(2098);
        if (xt4.A03(A002) == null && xt4.A03("Range") == null) {
            z = true;
            xog.A02(A002, "gzip");
        }
        YBQ ybq = this.A00;
        C11427STm sTm = xbw.A03;
        List emptyList = Collections.emptyList();
        if (!emptyList.isEmpty()) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            int size = emptyList.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    A1A.append("; ");
                }
                SP8 sp8 = (SP8) emptyList.get(i);
                A1A.append(sp8.A02);
                A1A.append('=');
                A1A.append(sp8.A04);
            }
            xog.A02("Cookie", A1A.toString());
        }
        if (xt4.A03("User-Agent") == null) {
            xog.A02("User-Agent", "okhttp/3.14.9");
        }
        Y1H A003 = xc12.A00(xog.A00(), xc12.A05, xc12.A06);
        C22023Xt4 xt42 = A003.A05;
        SQZ.A01(ybq, xt42, sTm);
        Xny xny = new Xny(A003);
        xny.A07 = xbw;
        if (z) {
            String A004 = AnonymousClass000.A00(2179);
            String str = null;
            String A03 = xt42.A03(A004);
            if (A03 != null) {
                str = A03;
            }
            if ("gzip".equalsIgnoreCase(str) && SQZ.A02(A003)) {
                C13206TPm tPm = new C13206TPm(A003.A0B.A01());
                C21971XoG A005 = C21971XoG.A00(xt42);
                A005.A01(A004);
                A005.A01("Content-Length");
                xny.A05 = C21971XoG.A00(new C22023Xt4(A005));
                xny.A0B = new Y7B(new C13197TPd(tPm), -1);
            }
        }
        return xny.A00();
    }

    public C22452Y4j(YBQ ybq) {
        this.A00 = ybq;
    }
}
