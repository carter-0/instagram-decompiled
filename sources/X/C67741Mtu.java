package X;

import android.os.Handler;

/* renamed from: X.Mtu  reason: case insensitive filesystem */
public final class C67741Mtu extends 2YL {
    public int A00;
    public C45208CsL A01;
    public final Handler A02 = AnonymousClass7TF.A0D();
    public final Runnable A03 = new PVI(this);
    public final 05G A04;
    public final AnonymousClass0Ud A05;

    public final boolean A00() {
        AnonymousClass0Ud r2 = this.A05;
        return 0qQ.A0K(((C68175N3q) r2.getValue()).A03, ((C68175N3q) r2.getValue()).A02);
    }

    public final boolean A01() {
        05G r2 = this.A04;
        if (((C68175N3q) r2.getValue()).A01 == HMC.Initial) {
            return true;
        }
        if (((C68175N3q) r2.getValue()).A01 == HMC.EditPrompt && !((C68175N3q) r2.getValue()).A05) {
            return true;
        }
        if (((C68175N3q) r2.getValue()).A01 != HMC.Failed || ((C68175N3q) r2.getValue()).A05) {
            return false;
        }
        return true;
    }

    public C67741Mtu() {
        02z A10 = DbS.A10(new C68175N3q((C45274Ctd) null, HMC.Initial, "", (String) null, (String) null, false, true));
        this.A04 = A10;
        this.A05 = 10b.A03(A10);
    }
}
