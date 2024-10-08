package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;

/* renamed from: X.Ge3  reason: case insensitive filesystem */
public final class C52870Ge3 extends FrameLayout {
    public final C56119Ht6 A00;
    public final C52878GeD A01;

    public final C56119Ht6 getBodyParametricStyleParameters() {
        return this.A00;
    }

    public final void setInitialProgress(int i) {
        C52878GeD.A01(this.A01, i, 0);
    }

    public final void setProgress(int i) {
        this.A01.setProgress(i);
    }

    public C52870Ge3(Context context, C56119Ht6 ht6) {
        super(context);
        int i;
        this.A00 = ht6;
        float f = ht6.A00;
        if (f > 0.0f) {
            i = (int) (1.0f / f);
        } else {
            i = 100;
        }
        C52878GeD geD = new C52878GeD(context);
        geD.setThumb(context.getDrawable(R.drawable.body_parametric_slider_thumb));
        geD.getThumb().setTint(ht6.A02);
        geD.A00 = ht6.A01;
        geD.A01 = ht6.A03;
        geD.setThumbOffset(0);
        geD.setMax(i);
        this.A01 = geD;
        addView(geD, new ViewGroup.MarginLayoutParams(-1, -2));
    }
}
