package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.smartcapture.ui.view.FaceCaptureProgressView;

/* renamed from: X.Q4x  reason: case insensitive filesystem */
public final class C7345Q4x extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;

    public C7345Q4x(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.A00) {
            case 0:
                C7300Q3a q3a = (C7300Q3a) this.A01;
                C7300Q3a.A00(q3a, new C66310MMt(q3a, 41));
                return;
            case 1:
                ((View) this.A01).setVisibility(8);
                return;
            case 2:
                C10563RuH ruH = (C10563RuH) this.A01;
                if (!ruH.A00) {
                    ruH.A02.post(new C12902TCq(ruH));
                    return;
                }
                return;
            case 3:
                Property property = FaceCaptureProgressView.A0K;
                ((FaceCaptureProgressView) this.A01).A01 = null;
                return;
            case 4:
                ViewGroup viewGroup = (ViewGroup) this.A01;
                viewGroup.removeAllViews();
                ViewParent parent = viewGroup.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(viewGroup);
                    return;
                }
                return;
            default:
                ((W1m) this.A01).A06();
                return;
        }
    }
}
