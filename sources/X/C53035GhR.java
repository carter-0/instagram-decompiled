package X;

import android.util.Patterns;

/* renamed from: X.GhR  reason: case insensitive filesystem */
public final class C53035GhR extends 2YL {
    public final C56031Hrd A00;
    public final 05G A01;
    public final AnonymousClass0Ud A02;

    public static C53393GnQ A01(C53035GhR ghR) {
        return (C53393GnQ) ((C61083JwL) ghR.A01.getValue()).A00;
    }

    public C53035GhR(C56031Hrd hrd) {
        this.A00 = hrd;
        02z A10 = DbS.A10(new C61083JwL((C53393GnQ) hrd.A01.getValue()));
        this.A01 = A10;
        this.A02 = 10b.A03(A10);
        DbX.A1X(this, C318116oQ.A00(this), 49);
    }

    public static C53393GnQ A00(C54153H0x h0x) {
        return (C53393GnQ) ((C61083JwL) h0x.A05().A02.getValue()).A00;
    }

    public final HM6 A02() {
        HM6 hm6;
        String str = A01(this).A0D;
        if (str == null) {
            str = "";
        }
        String A12 = DbV.A12(str);
        if (A12.length() == 0) {
            hm6 = HM6.EMPTY;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(A12).matches()) {
            hm6 = HM6.INVALID;
        } else {
            hm6 = HM6.VALID;
        }
        this.A00.A01(hm6);
        return hm6;
    }
}
