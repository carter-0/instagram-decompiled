package X;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;

public final class LZ3 implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LZ3(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final boolean onPreDraw() {
        TextView textView;
        CharSequence charSequence;
        CharSequence charSequence2;
        switch (this.A00) {
            case 0:
                View view = (View) this.A01;
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                AnonymousClass9QZ r3 = (AnonymousClass9QZ) this.A02;
                if (!r3.A01) {
                    return false;
                }
                view.setVisibility(0);
                float[] A1b = C51965G9l.A1b();
                // fill-array-data instruction
                A1b[0] = 0;
                A1b[1] = 1065353216;
                ObjectAnimator.ofFloat(view, "alpha", A1b).start();
                r3.A01 = false;
                return false;
            case 1:
                textView = (TextView) this.A02;
                textView.getViewTreeObserver().removeOnPreDrawListener(this);
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                MXT mxt = ((C60708Jpt) this.A01).A01;
                mxt.getClass();
                charSequence = C244273av.A01(textView, mxt.getUsername());
                break;
            case 2:
                View view2 = (View) this.A01;
                view2.setVisibility(8);
                view2.getViewTreeObserver().removeOnPreDrawListener(this);
                AnonymousClass9X0 r32 = (AnonymousClass9X0) this.A02;
                L6C l6c = r32.A05;
                AnonymousClass8BA r0 = l6c.A01;
                ((AnonymousClass8ME) r0.A1g.get()).A1H(r32, l6c.A00, l6c.A02);
                return true;
            case 3:
                textView = ((C60655Jp2) this.A01).A01;
                C61170JyM jyM = (C61170JyM) this.A02;
                textView.getViewTreeObserver().removeOnPreDrawListener(this);
                if (jyM.A08) {
                    charSequence2 = C244273av.A01(textView, jyM.A06);
                } else {
                    charSequence2 = jyM.A06;
                }
                charSequence = charSequence2;
                break;
            default:
                return false;
        }
        textView.setText(charSequence);
        return true;
    }
}
