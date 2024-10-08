package X;

import android.graphics.RectF;
import android.view.View;

/* renamed from: X.FeZ  reason: case insensitive filesystem */
public final class C50564FeZ implements G7C {
    public final Dd4 A00;

    public C50564FeZ(Dd4 dd4) {
        this.A00 = dd4;
    }

    public final boolean AFM(C48087EVf eVf, C283155Gi r4, int i) {
        AnonymousClass7TG.A1N(r4, eVf);
        if (r4.A05 != C283195Gm.USER_REEL) {
            return false;
        }
        if (eVf == C48087EVf.CONTAINER || eVf == C48087EVf.END_IMAGE) {
            return true;
        }
        return false;
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
        this.A00.DcN(rectF, C47179Dru.A00(jv7, eVf, i), r7, i);
    }
}
