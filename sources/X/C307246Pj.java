package X;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.6Pj  reason: invalid class name and case insensitive filesystem */
public final class C307246Pj {
    public TextView A00;
    public RoundedCornerFrameLayout A01;
    public final C252063oV A02;

    public final void A00(Context context, CharSequence charSequence, float f) {
        String str;
        TextView textView = this.A00;
        if (textView != null) {
            textView.setText(charSequence);
            Typeface A022 = AnonymousClass0qo.A00(context).A02(0qm.A0X);
            TextView textView2 = this.A00;
            if (textView2 != null) {
                textView2.setTypeface(A022);
                if (f < 1.0f) {
                    RoundedCornerFrameLayout roundedCornerFrameLayout = this.A01;
                    if (roundedCornerFrameLayout != null) {
                        roundedCornerFrameLayout.setScaleX(f);
                        RoundedCornerFrameLayout roundedCornerFrameLayout2 = this.A01;
                        if (roundedCornerFrameLayout2 != null) {
                            roundedCornerFrameLayout2.setScaleY(f);
                            return;
                        }
                    }
                    str = "chipView";
                } else {
                    return;
                }
            } else {
                str = "chipTextView";
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public C307246Pj(C252063oV r2) {
        this.A02 = r2;
        r2.EeU(new C307256Pk(this));
    }
}
