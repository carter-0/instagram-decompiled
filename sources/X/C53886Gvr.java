package X;

import java.util.List;

/* renamed from: X.Gvr  reason: case insensitive filesystem */
public final class C53886Gvr extends C251343mx {
    public final 0sL A00;
    public final List A01;

    public C53886Gvr(List list, 0sL r3) {
        0qQ.A0B(r3, 2);
        this.A01 = list;
        this.A00 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [X.2VW, java.lang.Object] */
    public final C251263mp A0X(AnonymousClass3Y5 r10) {
        C53860GvR A002;
        0qQ.A0B(r10, 0);
        0sL A02 = AnonymousClass3j0.A02(r10, C59346JFy.A00(this, 38));
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A003 = AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A01, 0, C51970G9q.A0C()), AnonymousClass05K.A0F, 0, C51970G9q.A0H());
        2Wb A0Q = C51972G9s.A0Q(r10);
        for (C55839HoM hoM : this.A01) {
            if (hoM.A04) {
                J6T j6t = new J6T(46, (Object) hoM, (Object) A02);
                String str = hoM.A02;
                if (str != null) {
                    C56091Hse hse = new C56091Hse(new Object(), str);
                    AnonymousClass2VW r1 = hse.A00;
                    A002 = A00(A0Q, hoM, C58688Ivx.A00(hse, j6t, 2));
                    AnonymousClass56V.A00(A002, r1);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                A002 = A00(A0Q, hoM, C58688Ivx.A00(hoM, A02, 3));
            }
            A0Q.A00(A002);
        }
        return C243563Zg.A0E(A0Q, r10, A003);
    }

    public static final C53860GvR A00(C70832Wc r15, C55839HoM hoM, C62320sa r17) {
        2WX A002;
        C55839HoM hoM2 = hoM;
        String A0E = C244013aV.A0E(r15, hoM2.A00);
        boolean z = hoM2.A05;
        boolean z2 = !z;
        AnonymousClass3XV r0 = 2WX.A02;
        long doubleToRawLongBits = Double.doubleToRawLongBits(36.0d);
        Integer num = AnonymousClass05K.A01;
        2WX A003 = AnonymousClass9JR.A00((2WX) null, num, 0, doubleToRawLongBits);
        if (z2) {
            A002 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(A003, AnonymousClass05K.A00, 0, doubleToRawLongBits), AnonymousClass05K.A0E, 0, C51970G9q.A0H());
        } else {
            A002 = AnonymousClass9JR.A00(A003, AnonymousClass05K.A0E, 0, C51970G9q.A0H());
        }
        String str = hoM2.A02;
        if (str != null) {
            A002 = G9t.A10(A002, AnonymousClass05K.A0D, str);
        }
        String str2 = null;
        if (z) {
            str2 = A0E;
        }
        return new C53860GvR(AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num, 0, I61.A02(r15, AnonymousClass05K.A0S)), AnonymousClass05K.A00, 0, I61.A02(r15, AnonymousClass05K.A0T)), A002, hoM2.A01, (HNO) null, (HNO) null, str2, A0E, r17, 536, I61.A02(r15, AnonymousClass05K.A0W), hoM2.A03);
    }
}
