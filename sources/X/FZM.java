package X;

import android.graphics.Rect;
import com.instagram.model.direct.DirectShareTarget;

public final class FZM implements C250603lj {
    public final C51899G6t A00;

    public FZM(C51899G6t g6t) {
        0qQ.A0B(g6t, 1);
        this.A00 = g6t;
    }

    public final void ATF(AnonymousClass30Y r8, C252093oY r9) {
        DirectShareTarget directShareTarget;
        AnonymousClass7TG.A1N(r8, r9);
        Integer CEk = r9.CEk(r8);
        0qQ.A07(CEk);
        if ((CEk == AnonymousClass05K.A00 || CEk == AnonymousClass05K.A01) && r9.CFe(r8) > 0.25f) {
            DirectShareTarget directShareTarget2 = (DirectShareTarget) r8.A03;
            if (directShareTarget2 != null) {
                Rect rect = new Rect();
                r9.B9Y(rect, r8);
                int i = rect.bottom;
                int i2 = rect.top;
                int i3 = i - i2;
                ExU exU = (ExU) r8.A04;
                if (exU != null) {
                    this.A00.Dbn(exU, directShareTarget2, ((float) i2) - (((float) i3) * 0.25f));
                }
            }
        } else if ((CEk == AnonymousClass05K.A0C || (CEk == AnonymousClass05K.A01 && r9.CFe(r8) < 0.25f)) && (directShareTarget = (DirectShareTarget) r8.A03) != null) {
            this.A00.Dbm(directShareTarget);
        }
    }
}
