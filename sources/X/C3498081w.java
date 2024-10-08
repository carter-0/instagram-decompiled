package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.Deprecated;

/* renamed from: X.81w  reason: invalid class name and case insensitive filesystem */
public interface C3498081w {
    boolean AJY(int i, int i2, boolean z);

    AnonymousClass8GF CrP();

    void EOX(float f);

    void ESF(int i);

    void EZd(Drawable drawable);

    @Deprecated(message = "This method should only be used from PreCaptureButtonManager, this is necessary so\n        to avoid conflicting with the animations to show and hide pre-capture buttons.")
    void Eql(boolean z, boolean z2);

    View getView();

    void setEnabled(boolean z);

    static void A00(C352888Fl r2) {
        r2.A0s.setEnabled(!C352888Fl.A0K(r2));
    }
}
