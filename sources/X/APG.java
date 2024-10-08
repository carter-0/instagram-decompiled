package X;

import android.text.Layout;
import android.text.Spannable;
import android.view.ViewTreeObserver;
import android.widget.TextView;

public final class APG implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ Spannable A05;
    public final /* synthetic */ TextView A06;
    public final /* synthetic */ boolean A07;

    public APG(Spannable spannable, TextView textView, float f, float f2, float f3, float f4, int i, boolean z) {
        this.A06 = textView;
        this.A05 = spannable;
        this.A04 = i;
        this.A02 = f;
        this.A03 = f2;
        this.A00 = f3;
        this.A01 = f4;
        this.A07 = z;
    }

    public final void onGlobalLayout() {
        TextView textView = this.A06;
        textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        Layout layout = textView.getLayout();
        if (layout != null) {
            Spannable spannable = this.A05;
            int i = this.A04;
            float f = this.A02;
            float f2 = this.A03;
            float f3 = this.A00;
            AnonymousClass6MO r1 = new AnonymousClass6MO(C306496Mj.A02(layout, f, f2, f2, f3, this.A01), f3, i);
            AnonymousClass7TG.A17(spannable, r1);
            r1.A03 = this.A07;
            textView.setText(spannable);
        }
    }
}
