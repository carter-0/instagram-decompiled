package X;

import android.graphics.drawable.GradientDrawable;
import com.instagram.ui.text.TextColorScheme;

public final class A8V {
    public final /* synthetic */ AnonymousClass8BA A00;

    public A8V(AnonymousClass8BA r1) {
        this.A00 = r1;
    }

    public final void A00(TextColorScheme textColorScheme, TextColorScheme textColorScheme2, int i) {
        if (textColorScheme.A06 != null) {
            ((C355038Oi) this.A00.A1f.get()).ESJ(textColorScheme.A06);
            return;
        }
        AnonymousClass8BA r3 = this.A00;
        GradientDrawable.Orientation orientation = textColorScheme.A03;
        orientation.getClass();
        ((C355038Oi) r3.A1f.get()).ESI(orientation, textColorScheme.A01(), i);
        AnonymousClass8BA.A0C(r3, textColorScheme2);
    }
}
