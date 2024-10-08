package X;

import android.os.Handler;
import java.util.List;

/* renamed from: X.IFl  reason: case insensitive filesystem */
public final class C56864IFl implements AnonymousClass2DP {
    public Handler A00;
    public boolean A01 = true;
    public final AnonymousClass5TE A02 = new AnonymousClass5TE(J6M.A00(this, 48));
    public final C55961HqS A03;
    public final List A04 = AnonymousClass7TE.A1C();
    public final 0sP A05 = J6M.A00(this, 49);

    public C56864IFl(C55961HqS hqS) {
        this.A03 = hqS;
    }

    public final void Csx() {
    }

    public final void DGg() {
        AnonymousClass5TE r1 = this.A02;
        C285105Ps r0 = r1.A00;
        if (r0 != null) {
            r0.dispose();
        }
        r1.A01();
    }

    public final void DdA() {
        AnonymousClass5TE r1 = this.A02;
        r1.A00 = AnonymousClass5PH.A01(r1.A08);
    }
}
