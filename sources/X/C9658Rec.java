package X;

import android.content.res.TypedArray;
import android.widget.Button;

/* renamed from: X.Rec  reason: case insensitive filesystem */
public abstract class C9658Rec {
    public static final void A00(Button button, int i) {
        TypedArray obtainStyledAttributes = button.getContext().obtainStyledAttributes(AnonymousClass2E0.A0A().A02(i), C71382cm.A0j);
        0qQ.A07(obtainStyledAttributes);
        button.setGravity(obtainStyledAttributes.getInt(0, 0));
        obtainStyledAttributes.recycle();
    }
}
