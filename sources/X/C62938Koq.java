package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.Koq  reason: case insensitive filesystem */
public final class C62938Koq {
    public final void A00(C61057Jvv jvv, AnonymousClass0iw r7, L9A l9a) {
        AnonymousClass7TG.A1T(l9a, jvv, r7);
        DbZ.A14(l9a.A03, jvv.A05);
        IgSimpleImageView igSimpleImageView = l9a.A01;
        C61074JwC jwC = (C61074JwC) jvv.A00;
        Context A0S = AnonymousClass7TE.A0S(l9a.A00);
        igSimpleImageView.setImageDrawable((Drawable) ((0sL) jwC.A00).invoke(A0S, r7.getModuleName()));
        DbZ.A14(l9a.A02, ((0sP) jwC.A01).invoke(A0S));
        if (jvv.A02) {
            C271284ib.A00((C247273g4) jvv.A01, l9a.A04, (AnonymousClass3W1) jvv.A04);
        }
    }
}
