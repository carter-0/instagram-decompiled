package X;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;

/* renamed from: X.ViC  reason: case insensitive filesystem */
public final class C17921ViC {
    public float A00;
    public int A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final TextView A06;
    public final TextView A07;

    public final void A00(String str, boolean z) {
        ViewPropertyAnimator scaleX;
        int i;
        long j;
        if (0qQ.A0K(this.A02, str)) {
            return;
        }
        if (!this.A04) {
            this.A03 = str;
            this.A05 = z;
            return;
        }
        this.A02 = str;
        boolean equals = str.equals("top");
        TextView textView = this.A06;
        if (equals) {
            scaleX = textView.animate().translationY((float) this.A01).scaleY(this.A00).scaleX(this.A00);
            i = 20;
        } else {
            textView.setTranslationY((float) this.A01);
            textView.setScaleY(this.A00);
            textView.setScaleX(this.A00);
            scaleX = textView.animate().translationY(0.0f).scaleY(1.0f).scaleX(1.0f);
            i = 19;
        }
        ViewPropertyAnimator listener = scaleX.setListener(new U0N(this, i));
        0qQ.A07(listener);
        if (z) {
            j = 200;
        } else {
            j = 0;
        }
        listener.setDuration(j);
        listener.start();
    }

    public C17921ViC(TextView textView, TextView textView2) {
        this.A06 = textView;
        this.A07 = textView2;
    }
}
