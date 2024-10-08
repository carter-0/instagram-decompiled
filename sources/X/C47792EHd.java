package X;

import android.util.Pair;
import android.view.View;

/* renamed from: X.EHd  reason: case insensitive filesystem */
public final class C47792EHd extends AnonymousClass3NK {
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ FV7 A01;

    public C47792EHd(Pair pair, FV7 fv7) {
        this.A01 = fv7;
        this.A00 = pair;
    }

    public final boolean Dqe(View view) {
        AnonymousClass37E r1 = AnonymousClass37D.A00;
        FV7 fv7 = this.A01;
        AnonymousClass37D A012 = r1.A01(fv7.A02);
        if (A012 == null) {
            return true;
        }
        DbU.A1U(new FmJ(4, this.A00, fv7), A012, A012);
        return true;
    }
}
