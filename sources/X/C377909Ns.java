package X;

import android.view.View;

/* renamed from: X.9Ns  reason: invalid class name and case insensitive filesystem */
public final class C377909Ns extends 0ng {
    public final /* synthetic */ AnonymousClass7FA A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377909Ns(AnonymousClass7FA r4) {
        super(703, 3, false, false);
        this.A00 = r4;
    }

    public final void run() {
        AnonymousClass2Ep r3;
        AnonymousClass7FA r5 = this.A00;
        C391979tz r1 = r5.A02;
        if (r1 != null) {
            C392289uY CrZ = r5.A0A.CrZ();
            if (CrZ != null) {
                if (r1 instanceof C388819oR) {
                    r3 = ((C388819oR) r1).A00;
                } else if (r1 instanceof C388829oS) {
                    r3 = null;
                } else {
                    throw new RuntimeException();
                }
                CrZ.A07(r5.A08, r5.A09, r3, r5.A05);
                return;
            }
            View view = r5.A00;
            if (view != null) {
                11Z.A02(new C41080Ao2(view, r5));
            }
        }
    }
}
