package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.view.View;
import com.facebook.smartcapture.docauth.CaptureState;
import com.facebook.smartcapture.docauth.DocAuthResult;
import com.facebook.smartcapture.view.IdCaptureActivity;
import com.instagram.creation.video.widget.scrubber.IgScrubberProgressIndicator;
import com.instagram.neko.playables.activity.PlayableProgressBar;
import com.instagram.react.modules.base.IgReactQEModule;
import java.lang.ref.WeakReference;

/* renamed from: X.Oea  reason: case insensitive filesystem */
public final class C71161Oea implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;

    public C71161Oea(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Animator animator, Object obj, int i) {
        animator.addListener(new C71161Oea(obj, i));
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.NR1, android.view.View] */
    public final void onAnimationCancel(Animator animator) {
        switch (this.A00) {
            case 4:
                C72541P9y.A04 = false;
                return;
            case 5:
                ((C68634NQn) this.A01).A00 = 0.0f;
                return;
            case 9:
                ? r1 = (NR1) this.A01;
                r1.A00 = 0.0f;
                r1.invalidate();
                return;
            case 11:
                C68637NQq nQq = (C68637NQq) this.A01;
                int i = nQq.A02;
                nQq.A01 = i;
                C68637NQq.A01(nQq, i);
                nQq.A04 = false;
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                ((View) this.A01).setTag((Object) null);
                return;
            default:
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        C13583Td9 td9;
        switch (this.A00) {
            case 1:
                WeakReference weakReference = ((C7915Qcm) this.A01).A00;
                if (weakReference != null && (td9 = (C13583Td9) weakReference.get()) != null) {
                    C12166SoH soH = ((IdCaptureActivity) td9).A03;
                    if (soH == null) {
                        0qQ.A0F("presenter");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    soH.A04 = CaptureState.CAPTURING_AUTOMATIC;
                    C12166SoH.A01((DocAuthResult) null, soH, true);
                    return;
                }
                return;
            case 2:
                IgScrubberProgressIndicator igScrubberProgressIndicator = (IgScrubberProgressIndicator) this.A01;
                if (igScrubberProgressIndicator.A01) {
                    igScrubberProgressIndicator.post(igScrubberProgressIndicator.A03);
                    return;
                }
                return;
            case 3:
                ((Dialog) this.A01).dismiss();
                return;
            case 4:
                C51969G9p.A1M(this.A01);
                C72541P9y.A04 = false;
                return;
            case 6:
                ((C68634NQn) this.A01).A00 = 0.0f;
                return;
            case 8:
                PlayableProgressBar playableProgressBar = (PlayableProgressBar) this.A01;
                C51972G9s.A0I(playableProgressBar).setDuration(playableProgressBar.A02).start();
                return;
            case 10:
                NR1 nr1 = (NR1) this.A01;
                if (nr1.A00 == 0.0f) {
                    NR1.A00(nr1);
                    return;
                }
                return;
            case 11:
                C68637NQq nQq = (C68637NQq) this.A01;
                int i = nQq.A02;
                nQq.A01 = i;
                C68637NQq.A01(nQq, i);
                nQq.A04 = false;
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                ((View) this.A01).setTag((Object) null);
                return;
            default:
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        switch (this.A00) {
            case 0:
                ((Animator) this.A01).setStartDelay(367);
                return;
            case 11:
                C68637NQq nQq = (C68637NQq) this.A01;
                if (nQq.A03) {
                    int i = nQq.A02;
                    if (i > 0) {
                        C68637NQq.A01(nQq, i);
                        int i2 = nQq.A02;
                        nQq.A01 = i2;
                        int i3 = i2 - 1;
                        nQq.A02 = i3;
                        C306386Ly r1 = nQq.A0F;
                        r1.A0M(Integer.toString(i3));
                        C68637NQq.A02(nQq, r1, (float) (-nQq.A0A));
                        nQq.A00 = 0;
                        nQq.A04 = true;
                        return;
                    }
                    nQq.A02 = 0;
                    ValueAnimator valueAnimator = nQq.A0C;
                    valueAnimator.cancel();
                    nQq.A00 = 0;
                    nQq.invalidateSelf();
                    valueAnimator.setRepeatCount(0);
                    valueAnimator.setDuration(400);
                    nQq.A03 = false;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        if (7 - this.A00 == 0) {
            ((C68634NQn) this.A01).A00 = 0.0f;
        }
    }
}
