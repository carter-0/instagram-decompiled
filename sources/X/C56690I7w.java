package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.I7w  reason: case insensitive filesystem */
public final class C56690I7w implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C254073rt A01;
    public final /* synthetic */ AnonymousClass3z3 A02;
    public final /* synthetic */ boolean A03;

    public C56690I7w(C254073rt r1, AnonymousClass3z3 r2, int i, boolean z) {
        this.A02 = r2;
        this.A03 = z;
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        IgTextView igTextView;
        float A002 = AnonymousClass7TH.A00(valueAnimator);
        AnonymousClass3z2 r6 = this.A02.A00;
        int A003 = 1sx.A00(A002, r6.A09, -1);
        boolean z = this.A03;
        C254073rt r4 = this.A01;
        if (z) {
            r4.A02.setTextColor(A003);
            igTextView = r4.A07;
        } else {
            r4.A01.setTextColor(A003);
            igTextView = r4.A06;
        }
        igTextView.setTextColor(A003);
        r4.A0L.setTextColor(A003);
        ((TextView) r4.A0Q.A01()).setTextColor(A003);
        TextSwitcher textSwitcher = r4.A0K;
        TextView textView = (TextView) textSwitcher.getCurrentView();
        if (textView != null) {
            textView.setTextColor(A003);
        }
        TextView textView2 = (TextView) textSwitcher.getNextView();
        if (textView2 != null) {
            textView2.setTextColor(A003);
        }
        ViewGroup viewGroup = r4.A0J;
        int i = this.A00;
        viewGroup.setBackgroundColor(1sx.A00(A002, r6.A01, i));
        r4.A0H.setBackgroundColor(1sx.A00(A002, r6.A04, i));
        TextView textView3 = r4.A0M;
        if (textView3.getVisibility() == 0) {
            textView3.setTextColor(1sx.A00(A002, r6.A06, r6.A05));
        }
        r4.A05.setColorFilter(A003);
        C282815Ev r0 = r4.A08;
        if (r0 != null && r0.A01 != null) {
            r4.A04.setColorFilter(A003);
        }
    }
}
