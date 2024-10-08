package X;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;

public final class EB7 extends 1P0 {
    public final /* synthetic */ C47491E4v A00;

    public EB7(C47491E4v e4v) {
        this.A00 = e4v;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        int A03 = AnonymousClass0fD.A03(1983909327);
        Dw8 dw8 = (Dw8) obj;
        int A032 = AnonymousClass0fD.A03(1892449418);
        0qQ.A0B(dw8, 0);
        C47491E4v e4v = this.A00;
        C49225ErU.A00(DbT.A0X(e4v.A06), C46634DiE.A0f, (Boolean) null, (Long) null);
        String str = dw8.A03;
        if (!(str == null || str.length() == 0)) {
            TextView textView = e4v.A00;
            if (textView != null) {
                textView.setVisibility(0);
            }
            int integer = DbV.A05(e4v).getInteger(17694721);
            TextView textView2 = e4v.A00;
            if (textView2 != null) {
                textView2.setAlpha(0.0f);
            }
            TextView textView3 = e4v.A00;
            if (textView3 != null) {
                textView3.setText(dw8.A03);
            }
            TextView textView4 = e4v.A00;
            if (!(textView4 == null || (animate = textView4.animate()) == null || (alpha = animate.alpha(1.0f)) == null || (duration = alpha.setDuration((long) integer)) == null)) {
                duration.start();
            }
        }
        AnonymousClass0fD.A0A(1422744, A032);
        AnonymousClass0fD.A0A(751671816, A03);
    }
}
