package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.PointF;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;
import com.instagram.friendmap.view.customview.FriendMapAnimatedLikeView;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.I7i  reason: case insensitive filesystem */
public final class C56678I7i implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public C56678I7i(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Animator animator, Object obj, int i) {
        animator.addListener(new C56678I7i(obj, i));
    }

    public final void onAnimationCancel(Animator animator) {
        if (6 - this.A00 == 0) {
            0qQ.A0B(animator, 0);
            animator.removeAllListeners();
        }
    }

    public final void onAnimationEnd(Animator animator) {
        long j;
        C62320sa r0;
        switch (this.A00) {
            case 0:
                FBPayAnimationButton fBPayAnimationButton = (FBPayAnimationButton) this.A01;
                fBPayAnimationButton.getButtonView().setVisibility(4);
                fBPayAnimationButton.getProgressBarView().setVisibility(0);
                fBPayAnimationButton.getProgressMsgView().setVisibility(0);
                ViewPropertyAnimator A0G = DbY.A0G(fBPayAnimationButton.getProgressMsgView());
                boolean z = FBPayAnimationButton.A0D;
                long j2 = 3000;
                if (z) {
                    j = 3000;
                } else {
                    j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
                }
                fBPayAnimationButton.A03 = A0G.setStartDelay(j).setDuration(400).withStartAction(new C57711IfE(fBPayAnimationButton)).withEndAction(new C57712IfF(fBPayAnimationButton));
                fBPayAnimationButton.getProgressBarView().setPivotY(0.0f);
                fBPayAnimationButton.getProgressMsgView().setPivotX(fBPayAnimationButton.getButtonView().getPivotX());
                ViewPropertyAnimator scaleY = fBPayAnimationButton.getProgressBarView().animate().scaleX(0.5f).scaleY(0.5f);
                if (!z) {
                    j2 = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
                }
                scaleY.setStartDelay(j2).setDuration(400);
                return;
            case 1:
                C52798Gcp gcp = (C52798Gcp) this.A01;
                if (gcp.A0J) {
                    gcp.A02 = 255;
                    ((2cs) gcp.A0F.getValue()).A08(0.0d, true);
                    return;
                }
                return;
            case 2:
            case 13:
                C51971G9r.A1I((2Wa) this.A01);
                return;
            case 3:
                FriendMapAnimatedLikeView.A01((PointF) null, (FriendMapAnimatedLikeView) this.A01);
                return;
            case 4:
                AnimatorSet animatorSet = ((FriendMapAnimatedLikeView) this.A01).A00;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 5:
                ((GAM) this.A01).A00 = 0.0f;
                return;
            case 6:
                C51969G9p.A1M(this.A01);
                return;
            case 7:
                C67757MuC A07 = ((C15286UZq) this.A01).A07();
                AnonymousClass7TE.A1Z(new C66160MFx(A07, (AnonymousClass4D7) null, 19), C318116oQ.A00(A07));
                return;
            case 9:
                C52646GaK gaK = (C52646GaK) this.A01;
                OvershootInterpolator overshootInterpolator = C52646GaK.A0u;
                if (gaK.A02 != null) {
                    r0 = gaK.A09;
                    break;
                } else {
                    return;
                }
            case 10:
                C57452Iaw iaw = (C57452Iaw) this.A01;
                iaw.A01 = true;
                iaw.A05.dismiss();
                return;
            case 11:
                ((2Wa) this.A01).A02(AnonymousClass7TE.A0v());
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                ((2V5) this.A01).A00(AnonymousClass7TE.A0v());
                return;
            case 15:
                C53928GwY gwY = (C53928GwY) this.A01;
                OvershootInterpolator overshootInterpolator2 = C53928GwY.A0r;
                if (gwY.A02 != null) {
                    r0 = gwY.A09;
                    break;
                } else {
                    return;
                }
            default:
                ((C243673Zt) this.A01).A00(AnonymousClass7TE.A0v());
                return;
        }
        if (r0 != null) {
            r0.invoke();
        }
    }
}
