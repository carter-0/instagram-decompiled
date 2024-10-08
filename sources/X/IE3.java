package X;

import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;

public final class IE3 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ SpannableStringBuilder A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C3254872q A02;
    public final /* synthetic */ C232712uI A03;
    public final /* synthetic */ 1Xj A04;
    public final /* synthetic */ Venue A05;
    public final /* synthetic */ boolean A06;

    public IE3(SpannableStringBuilder spannableStringBuilder, UserSession userSession, C3254872q r3, C232712uI r4, 1Xj r5, Venue venue, boolean z) {
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = userSession;
        this.A06 = z;
        this.A05 = venue;
        this.A00 = spannableStringBuilder;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v11, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final boolean onPreDraw() {
        int right;
        int right2;
        C3254872q r4 = this.A02;
        TextView textView = r4.A0C;
        textView.getViewTreeObserver().removeOnPreDrawListener(this);
        C232712uI r11 = this.A03;
        if (0mk.A02(r11.A07)) {
            right = r4.A0B.getLeft();
            right2 = r4.A0D.getWidth();
        } else {
            ? r2 = r4.A0D;
            right = r2.getRight();
            right2 = (r4.A02.getRight() - textView.getRight()) - r2.getRight();
        }
        1Xj r5 = this.A04;
        TextView textView2 = r4.A0A;
        if (textView2 == null) {
            textView2 = (TextView) r4.A04.inflate();
            r4.A0A = textView2;
        }
        boolean z = this.A06;
        Venue venue = this.A05;
        SpannableStringBuilder spannableStringBuilder = this.A00;
        int i = r11.A06;
        int i2 = r11.A02;
        int bottom = textView.getBottom();
        AnonymousClass7TF.A1F(textView2, 4, spannableStringBuilder);
        if (!z || venue == null) {
            0nA.A0O(textView2);
            return false;
        }
        if (AnonymousClass7TE.A02(textView) < textView.getPaint().measureText(002.A0g(DbT.A10(spannableStringBuilder), " • ", venue.A00.getName()))) {
            textView2.setVisibility(0);
            SpannableStringBuilder A0E = C51965G9l.A0E();
            boolean A4m = r5.A4m();
            Integer A2M = r5.A2M();
            String name = venue.A00.getName();
            C253153qI.A0B(A0E, (C242813Wa) null, new AnonymousClass3ZT(r5), A2M, name, i, i2, A4m);
            textView2.setText(A0E);
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(right, bottom, right2, 0);
            textView2.setLayoutParams(marginLayoutParams);
            return false;
        }
        0nA.A0O(textView2);
        boolean A4m2 = r5.A4m();
        C253153qI.A0B(spannableStringBuilder, (C242813Wa) null, new AnonymousClass3ZT(r5), r5.A2M(), venue.A00.getName(), i, i2, A4m2);
        textView.setText(spannableStringBuilder);
        return false;
    }
}
