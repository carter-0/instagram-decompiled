package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* renamed from: X.HRg  reason: case insensitive filesystem */
public abstract class C54748HRg {
    public static final C3018260f A00(C286575Wy r5, int i) {
        if (0fL.A02()) {
            0fL.A01(-1664502064, "androidx.compose.ui.res.imageResource (ImageResources.android.kt:52)");
        }
        Context A0I = C51968G9o.A0I(r5);
        Object ECw = r5.ECw();
        Object obj = AnonymousClass5XT.A00;
        if (ECw == obj) {
            ECw = new TypedValue();
            r5.FLL(ECw);
        }
        TypedValue typedValue = (TypedValue) ECw;
        A0I.getResources().getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        0qQ.A0A(charSequence);
        boolean AGu = r5.AGu(charSequence.toString());
        Object ECw2 = r5.ECw();
        if (AGu || ECw2 == obj) {
            Drawable drawable = A0I.getResources().getDrawable(i, (Resources.Theme) null);
            0qQ.A0C(drawable, C66579MXk.A00(145));
            ECw2 = new C3018360g(((BitmapDrawable) drawable).getBitmap());
            r5.FLL(ECw2);
        }
        C3018260f r1 = (C3018260f) ECw2;
        if (0fL.A02()) {
            0fL.A00(-281877112);
        }
        return r1;
    }
}
