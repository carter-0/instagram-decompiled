package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.9y7  reason: invalid class name and case insensitive filesystem */
public abstract class C394439y7 {
    public static final void A00(View view) {
        Context context = view.getContext();
        0qQ.A0A(context);
        float A01 = (((float) AnonymousClass0nB.A01(context)) - (((float) Math.ceil(2.8499999046325684d)) * ((float) AnonymousClass7TG.A03(context)))) / 2.85f;
        int i = (int) A01;
        0nA.A0g(view, i, i);
        float f = -A01;
        view.requireViewById(R.id.label).setTranslationY(0.1333f * f);
        View requireViewById = view.requireViewById(R.id.icon_background);
        float f2 = f * 0.4f;
        requireViewById.setTranslationY(f2);
        float f3 = 0.4f * A01;
        int i2 = (int) f3;
        0nA.A0g(requireViewById, i2, i2);
        View requireViewById2 = view.requireViewById(R.id.icon);
        requireViewById2.setTranslationY(f2 - (f3 * 0.25f));
        int i3 = (int) (A01 * 0.2f);
        0nA.A0g(requireViewById2, i3, i3);
    }
}
