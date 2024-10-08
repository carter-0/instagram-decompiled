package X;

import android.animation.Animator;
import android.view.VelocityTracker;
import android.view.ViewGroup;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;

public final class W3z implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;

    public W3z(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.A00) {
            case 0:
                ((C20878X2f) ((ViewGroup) this.A01)).getReactScrollViewScrollState().A01 = true;
                return;
            case 2:
                C17564VaI vaI = (C17564VaI) this.A01;
                ViewGroup viewGroup = vaI.A02;
                viewGroup.removeView(vaI.A01);
                vaI.A01 = null;
                viewGroup.postInvalidate();
                return;
            default:
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        String str;
        switch (this.A00) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.A01;
                ((C20878X2f) viewGroup).getReactScrollViewScrollState().A02 = true;
                W3V.A04(viewGroup);
                return;
            case 1:
                C17714Vcj vcj = (C17714Vcj) this.A01;
                C17214VMs vMs = vcj.A03;
                if (vMs != null) {
                    VelocityTracker velocityTracker = vcj.A0B;
                    velocityTracker.computeCurrentVelocity(IgNetworkConsentStorage.MAX_ENTRIES);
                    velocityTracker.getYVelocity();
                    AnonymousClass80Q r2 = vMs.A00.A01;
                    if (r2 == null) {
                        0qQ.A0F("quickCaptureController");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    if (r2.A00.A01 == 28D.A1S) {
                        str = "back";
                    } else {
                        str = "button";
                    }
                    r2.A05(str, false);
                    return;
                }
                return;
            case 2:
                C17564VaI vaI = (C17564VaI) this.A01;
                ViewGroup viewGroup2 = vaI.A02;
                viewGroup2.removeView(vaI.A01);
                vaI.A01 = null;
                viewGroup2.postInvalidate();
                return;
            default:
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        if (3 - this.A00 == 0) {
            ((AnonymousClass61R) this.A01).FNX(0.42307693f, 1.0f);
        }
    }

    public final void onAnimationStart(Animator animator) {
        if (this.A00 == 0) {
            C17556VaA reactScrollViewScrollState = ((C20878X2f) ((ViewGroup) this.A01)).getReactScrollViewScrollState();
            reactScrollViewScrollState.A01 = false;
            reactScrollViewScrollState.A02 = false;
        }
    }
}
