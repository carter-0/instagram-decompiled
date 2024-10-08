package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.3dT  reason: invalid class name and case insensitive filesystem */
public final class C245783dT {
    public static final boolean A01(C251263mp r2) {
        if (!(r2 instanceof C251253mo)) {
            return false;
        }
        2V5[] A19 = ((C251253mo) r2).A19();
        0qQ.A07(A19);
        if (A19.length != 0) {
            return true;
        }
        return false;
    }

    public static final void A00(View view, 2V5 r3, int i) {
        switch (i) {
            case 1:
                view.setAlpha(((Number) r3.A00).floatValue());
                return;
            case 2:
                view.setTranslationX(((Number) r3.A00).floatValue());
                return;
            case 3:
                view.setTranslationY(((Number) r3.A00).floatValue());
                return;
            case 4:
                view.setTranslationZ(((Number) r3.A00).floatValue());
                return;
            case 5:
                view.setScaleX(((Number) r3.A00).floatValue());
                return;
            case 6:
                view.setScaleY(((Number) r3.A00).floatValue());
                return;
            case 7:
                view.setElevation(((Number) r3.A00).floatValue());
                return;
            case 8:
                view.setBackgroundColor(((Number) r3.A00).intValue());
                return;
            case 9:
                view.setRotation(((Number) r3.A00).floatValue());
                return;
            case 10:
                view.setRotationX(((Number) r3.A00).floatValue());
                return;
            case 11:
                view.setRotationY(((Number) r3.A00).floatValue());
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                view.setBackground((Drawable) r3.A00);
                return;
            case 13:
                int intValue = ((Number) r3.A00).intValue();
                0qQ.A0B(view, 0);
                view.setForeground(new ColorDrawable(intValue));
                return;
            default:
                return;
        }
    }
}
