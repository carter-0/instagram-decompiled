package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LGd  reason: case insensitive filesystem */
public abstract class C63973LGd {
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(new C73912Pln(this, 29));

    public abstract int A00();

    public abstract Integer A04();

    public abstract String A05();

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r1 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r1 = X.00k.A0K(X.JTO.A15(r4));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(int r6) {
        /*
            r5 = this;
            X.0eM r4 = r5.A00
            java.util.List r3 = X.JTO.A15(r4)
            java.lang.Object r0 = r4.getValue()
            java.util.Iterator r2 = X.C51966G9m.A1H(r0)
        L_0x000e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.QOx r0 = (X.QOx) r0
            X.2HY r0 = r0.A06
            int r0 = r0.A00
            if (r0 > r6) goto L_0x000e
            if (r1 != 0) goto L_0x002b
        L_0x0023:
            java.util.List r0 = X.JTO.A15(r4)
            java.lang.Object r1 = X.00k.A0K(r0)
        L_0x002b:
            int r0 = r3.indexOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63973LGd.A01(int):int");
    }

    public final ULY A03() {
        QOx qOx = (QOx) AnonymousClass7TE.A13(JTO.A15(this.A00));
        return C9615Rdt.A00(qOx, A04(), qOx.A06.A01);
    }

    public final List A06(boolean z) {
        String str;
        int i;
        int i2;
        String A12;
        String A122;
        if (!z) {
            str = A05();
        } else {
            str = "720,1280,1000000-1000000,30|504,896,500000-1000000,30|432,768,270000-500000,30|360,640,200000-270000,30";
        }
        C363068j2 r6 = C363058j1.A02;
        r6.A03("sup:BaseBitrateLadderProvider", 002.A0R("Parsing bitrate ladder string: ", str));
        try {
            int i3 = 0;
            List A0R = 00l.A0R(str, new String[]{"|"}, 0);
            ArrayList A0r = AnonymousClass7TG.A0r(A0R);
            int i4 = 0;
            for (Object next : A0R) {
                i3++;
                if (i4 < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                List A0R2 = 00l.A0R((String) next, new String[]{","}, 0);
                List A0R3 = 00l.A0R((CharSequence) A0R2.get(2), new String[]{"-"}, 0);
                Integer num = AnonymousClass05K.A00(4)[i4];
                int parseInt = Integer.parseInt(DbV.A12(AnonymousClass7TE.A19(A0R2, 0)));
                int parseInt2 = Integer.parseInt(DbV.A12(AnonymousClass7TE.A19(A0R2, 1)));
                int parseInt3 = Integer.parseInt(DbV.A12(AnonymousClass7TE.A19(A0R2, 3)));
                2HY r0 = new 2HY(Integer.parseInt(DbV.A12(AnonymousClass7TE.A19(A0R3, 0))), Integer.parseInt(DbV.A12(AnonymousClass7TE.A19(A0R3, 1))));
                String A1G = C51966G9m.A1G(A0R2, 4);
                if (A1G == null || (A122 = DbV.A12(A1G)) == null) {
                    i = 0;
                } else {
                    i = Integer.parseInt(A122);
                }
                String A1G2 = C51966G9m.A1G(A0R2, 5);
                if (A1G2 == null || (A12 = DbV.A12(A1G2)) == null) {
                    i2 = 3;
                } else {
                    i2 = Integer.parseInt(A12);
                }
                QOx qOx = new QOx(num, r0, parseInt, parseInt2, parseInt3, i, i2);
                r6.A03("sup:BaseBitrateLadderProvider", AnonymousClass7TG.A0m(qOx, "Adding Bitrate Rung To Ladder: ", AnonymousClass7TE.A1A()));
                A0r.add(qOx);
                i4 = i3;
            }
            return A0r;
        } catch (IndexOutOfBoundsException e) {
            r6.A04("sup:BaseBitrateLadderProvider", 002.A0g("Exception parsing ladder config ", str, ". Attempt with fallback"), e);
            if (!z) {
                return A06(true);
            }
            r6.A04("sup:BaseBitrateLadderProvider", "Failed to parse ladder config AND Default Value Format(??) - Returning empty list", (Throwable) null);
            return AnonymousClass7TE.A1C();
        }
    }

    public final ULY A02() {
        if (A00() <= 0 || A00() > A03().A00) {
            return A03();
        }
        return C9615Rdt.A00((QOx) AnonymousClass7TE.A13(JTO.A15(this.A00)), A04(), A00());
    }
}
