package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.8Gy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C353268Gy implements AnonymousClass2gO {
    public final /* synthetic */ C352888Fl A00;

    public /* synthetic */ C353268Gy(C352888Fl r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        Object obj2;
        Object obj3;
        C352888Fl r7 = this.A00;
        AnonymousClass34S r13 = (AnonymousClass34S) obj;
        ViewGroup viewGroup = r7.A0U;
        int height = viewGroup.getHeight();
        if (r7.A06 != null && (obj2 = r13.A00) != null && (obj3 = r13.A01) != null) {
            int intValue = ((Number) obj2).intValue();
            float floatValue = ((Number) obj3).floatValue();
            C3495780x r3 = r7.A1G;
            float max = Math.max(floatValue, 0.3f);
            C265674Vs r11 = r7.A03;
            if (r11 != null && AnonymousClass4W7.A00(r11) != null && AnonymousClass4WA.A01(r7.A0P) == AnonymousClass05K.A0C && AnonymousClass4W7.A01(r11) == AnonymousClass88T.TABLE_TOP) {
                View view = r7.A0S;
                float min = Math.min(1.0f, AnonymousClass4WA.A00(view, r11) / max);
                view.setScaleX(min);
                view.setScaleY(min);
                if (r3 != null) {
                    r3.A03.A0B(new AnonymousClass34S(Float.valueOf(min), false));
                }
            }
            viewGroup.setTranslationY(-(((float) intValue) - ((((float) height) / 2.0f) * (1.0f - floatValue))));
            viewGroup.setScaleX(max);
            viewGroup.setScaleY(max);
            float f = 1.0f / max;
            View view2 = ((C3497981v) r7.A0t).getView();
            view2.setScaleX(f);
            view2.setScaleY(f);
        }
    }
}
