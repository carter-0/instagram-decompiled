package X;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;

public final class I5R {
    public static final I5R A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r3 != null) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C52672Gak A00(X.AnonymousClass0iw r4, com.instagram.common.session.UserSession r5, X.C255773uh r6) {
        /*
            X.3OA r3 = r6.A0g
            r1 = 0
            if (r3 == 0) goto L_0x001b
            X.1Xj r0 = r3.A0K
            if (r0 == 0) goto L_0x001b
            X.3lZ r0 = X.C51966G9m.A0w(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = r0.BM9()
        L_0x0013:
            java.lang.String r1 = r3.A0S
        L_0x0015:
            X.Gak r0 = new X.Gak
            r0.<init>(r4, r5, r2, r1)
            return r0
        L_0x001b:
            r2 = r1
            if (r3 == 0) goto L_0x0015
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I5R.A00(X.0iw, com.instagram.common.session.UserSession, X.3uh):X.Gak");
    }

    public static final void A01(View view, View view2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        try {
            Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.button_slide_down_100_to_20);
            loadAnimation.setAnimationListener(new IE6(view2, view, constraintLayout, constraintLayout2));
            constraintLayout2.startAnimation(loadAnimation);
        } catch (Resources.NotFoundException unused) {
        }
    }
}
