package X;

import android.graphics.RectF;
import android.view.View;

/* renamed from: X.FeQ  reason: case insensitive filesystem */
public final class C50555FeQ implements G7C {
    public final Dd4 A00;

    public C50555FeQ(Dd4 dd4) {
        this.A00 = dd4;
    }

    public final boolean AFM(C48087EVf eVf, C283155Gi r4, int i) {
        AnonymousClass7TG.A1N(r4, eVf);
        if (eVf != C48087EVf.START_AVATAR || !(!C253833rU.A02(r4.A04.A0E))) {
            return false;
        }
        return true;
    }

    public final void AJS(View view, JV7 jv7, C48087EVf eVf, C283155Gi r7, int i) {
        RectF rectF;
        AnonymousClass7TG.A1N(r7, eVf);
        if (view != null) {
            RectF rectF2 = 0nA.A01;
            rectF = new RectF();
            0nA.A0L(rectF, view);
        } else {
            rectF = null;
        }
        this.A00.Da5(rectF, C47179Dru.A00(jv7, eVf, i), r7, i);
    }
}
