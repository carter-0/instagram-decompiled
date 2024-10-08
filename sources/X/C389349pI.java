package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9pI  reason: invalid class name and case insensitive filesystem */
public final class C389349pI extends AnonymousClass2xK {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public C389349pI(Object obj, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A03 = z;
        this.A01 = obj;
        this.A02 = z2;
    }

    public final boolean Ds8(AnonymousClass5Gv r2) {
        if (1 - this.A00 != 0) {
            return super.Ds8(r2);
        }
        0qQ.A0B(r2, 0);
        r2.A08(true);
        return true;
    }

    public final void DsC(AnonymousClass5Gv r3) {
        if (1 - this.A00 != 0) {
            super.DsC(r3);
        } else {
            ((C14076TpQ) this.A01).A0E = null;
        }
    }

    public final void DsH(AnonymousClass5Gv r6) {
        0xY AR4;
        0s0 r2;
        AnonymousClass0YZ[] r1;
        int i;
        boolean z;
        int i2;
        if (this.A00 != 0) {
            if (this.A02) {
                z = true;
                AR4 = AnonymousClass7TE.A0p(1Au.A00(((C14076TpQ) this.A01).A0R));
                i2 = 3078;
            } else if (this.A03) {
                z = true;
                AR4 = AnonymousClass7TE.A0p(1Au.A00(((C14076TpQ) this.A01).A0R));
                i2 = 3079;
            } else {
                return;
            }
            AR4.E5T(AnonymousClass000.A00(i2), z);
        } else if (this.A03) {
            UserSession userSession = ((AnonymousClass91N) this.A01).A03;
            boolean z2 = this.A02;
            1Av A002 = 1Au.A00(userSession);
            if (z2) {
                r2 = A002.A5L;
                r1 = 1Av.A8a;
                i = 57;
            } else {
                r2 = A002.A5M;
                r1 = 1Av.A8a;
                i = 58;
            }
            AnonymousClass7TF.A1J(A002, r2, r1, i, true);
            return;
        } else {
            0xa r22 = AnonymousClass0xl.A00(C61170le.A00).A00;
            AR4 = r22.AR4();
            AR4.E5Z("text_emphasis_button_tooltip_impressions", r22.getInt("text_emphasis_button_tooltip_impressions", 0) + 1);
        }
        AR4.apply();
    }
}
