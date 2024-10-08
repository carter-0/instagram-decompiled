package X;

import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.84p  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3504284p implements AnonymousClass2gO {
    public final /* synthetic */ C3503684j A00;

    public /* synthetic */ C3504284p(C3503684j r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        C3503684j r3 = this.A00;
        AnonymousClass34S r6 = (AnonymousClass34S) obj;
        C3503684j.A01(r3);
        TextView textView = r3.A05;
        if (!(textView == null || (obj4 = r6.A00) == null || (obj5 = r6.A01) == null)) {
            textView.setTranslationY(((float) (-((Number) obj4).intValue())) / 2.0f);
            TextView textView2 = r3.A05;
            float floatValue = ((Number) obj5).floatValue();
            textView2.setScaleX(floatValue);
            r3.A05.setScaleY(floatValue);
        }
        ImageView imageView = r3.A03;
        if (imageView != null && (obj2 = r6.A00) != null && (obj3 = r6.A01) != null) {
            imageView.setTranslationY(((float) (-((Number) obj2).intValue())) / 2.0f);
            ImageView imageView2 = r3.A03;
            float floatValue2 = ((Number) obj3).floatValue();
            imageView2.setScaleX(floatValue2);
            r3.A03.setScaleY(floatValue2);
        }
    }
}
