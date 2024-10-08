package X;

import android.widget.TextView;

/* renamed from: X.7kD  reason: invalid class name and case insensitive filesystem */
public abstract class C339817kD {
    public static final void A00(C339807kC r4, C62320sa r5, boolean z) {
        TextView textView;
        C252063oV r1 = r4.A09;
        int i = 8;
        if (z) {
            i = 0;
        }
        r1.setVisibility(i);
        if (z && (textView = (TextView) r1.getView()) != null) {
            float f = 1.0f;
            if (0mk.A02(textView.getContext())) {
                f = -1.0f;
            }
            textView.setRotation(-4.9f * f);
            float f2 = (float) r4.A03;
            textView.setTranslationX(f * -1.8f * f2);
            textView.setTranslationY(f2 * -1.3f);
            textView.setGravity(17);
            0oe.A02(textView, AnonymousClass05K.A00, false);
            r5.invoke();
        }
    }
}
