package X;

import androidx.compose.ui.Alignment;

public abstract class I74 {
    public static final C287965b7 A00 = C51965G9l.A0F((Object) null, 1.0f, 400.0f);
    public static final C287965b7 A01;
    public static final C287965b7 A02;
    public static final C287805an A03 = new C287795am(C58853Iye.A00, C58854Iyf.A00);

    public static /* synthetic */ C52879GeF A03(C287245Zp r5, int i) {
        Alignment alignment;
        C287965b7 r2 = null;
        boolean z = false;
        C58858Iyj iyj = null;
        if ((i & 1) != 0) {
            r2 = C51972G9s.A0K(new C289005cr(C51972G9s.A0F()));
        }
        if ((i & 2) != 0) {
            r5 = C287215Zl.A03;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            iyj = C58858Iyj.A00;
        }
        if (0qQ.A0K(r5, C287215Zl.A05)) {
            alignment = C287215Zl.A0C;
        } else if (0qQ.A0K(r5, C287215Zl.A03)) {
            alignment = C287215Zl.A06;
        } else {
            alignment = C287215Zl.A09;
        }
        return A02(r2, alignment, J6G.A00(iyj, 9), z);
    }

    static {
        long A0F = C51972G9s.A0F();
        A01 = C51965G9l.A0F(new C289165d8(A0F), 1.0f, 400.0f);
        A02 = C51965G9l.A0F(new C289005cr(A0F), 1.0f, 400.0f);
    }

    public static final C52879GeF A00(AnonymousClass5b8 r6, float f) {
        C56151Htd htd = C56151Htd.A00;
        return new C52879GeF(new C56560I1o((C56115Ht2) null, new C56068HsH(r6, f), (C56099Hsm) null, (C56069HsI) null, 0Yt.A0E(), false));
    }

    public static final C52879GeF A01(AnonymousClass5b8 r5, float f, long j) {
        C56151Htd htd = C56151Htd.A00;
        return new C52879GeF(new C56560I1o((C56115Ht2) null, (C56068HsH) null, new C56099Hsm(r5, f, j), (C56069HsI) null, 0Yt.A0E(), false));
    }

    public static final C52879GeF A02(AnonymousClass5b8 r4, Alignment alignment, 0sP r6, boolean z) {
        C56151Htd htd = C56151Htd.A00;
        return new C52879GeF(new C56560I1o(new C56115Ht2(r4, alignment, r6, z), (C56068HsH) null, (C56099Hsm) null, (C56069HsI) null, 0Yt.A0E(), false));
    }

    public static final C52880GeG A04(AnonymousClass5b8 r6, float f) {
        C56152Hte hte = C56152Hte.A00;
        return new C52880GeG(new C56560I1o((C56115Ht2) null, new C56068HsH(r6, f), (C56099Hsm) null, (C56069HsI) null, 0Yt.A0E(), false));
    }

    public static final C52880GeG A05(AnonymousClass5b8 r5, float f, long j) {
        C56152Hte hte = C56152Hte.A00;
        return new C52880GeG(new C56560I1o((C56115Ht2) null, (C56068HsH) null, new C56099Hsm(r5, f, j), (C56069HsI) null, 0Yt.A0E(), false));
    }

    public static final C52880GeG A06(AnonymousClass5b8 r4, Alignment alignment, 0sP r6, boolean z) {
        C56152Hte hte = C56152Hte.A00;
        return new C52880GeG(new C56560I1o(new C56115Ht2(r4, alignment, r6, z), (C56068HsH) null, (C56099Hsm) null, (C56069HsI) null, 0Yt.A0E(), false));
    }
}
