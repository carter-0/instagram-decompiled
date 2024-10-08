package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.O2x  reason: case insensitive filesystem */
public abstract class C70345O2x {
    public static final void A00(C61057Jvv jvv, C67859Mw3 mw3) {
        AnonymousClass7TF.A1H(mw3, jvv);
        IgdsBanner igdsBanner = mw3.A00;
        DbT.A1U(igdsBanner, (CharSequence) jvv.A04, false);
        Number number = (Number) jvv.A00;
        if (number != null) {
            igdsBanner.setAction(number.intValue());
        } else {
            igdsBanner.setAction((CharSequence) null);
        }
        Number number2 = (Number) jvv.A05;
        if (number2 != null) {
            igdsBanner.setIcon(number2.intValue());
        } else {
            igdsBanner.setIcon((Drawable) null);
        }
        igdsBanner.A00 = (G76) jvv.A01;
        boolean z = jvv.A02;
        int i = 0;
        igdsBanner.A02.setVisibility(8);
        View view = igdsBanner.A01;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }
}
