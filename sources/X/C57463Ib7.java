package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.List;

/* renamed from: X.Ib7  reason: case insensitive filesystem */
public final class C57463Ib7 implements C331117Pq {
    public UserSession A00;
    public C14044Tol A01;
    public C57457Ib1 A02;
    public C56132HtK A03;
    public boolean A04;
    public final AnonymousClass0iw A05;
    public final C54506HGs A06;
    public final boolean A07;

    public final void DxV(C263754Nf r1) {
    }

    public final void Dxy(C263754Nf r1) {
    }

    public final void Dyj(int i, int i2) {
    }

    public final void onCompletion() {
    }

    public final void onCues(List list) {
    }

    public final void onLoop(int i) {
    }

    public final void onPrepare(C263754Nf r1) {
    }

    public final void onProgressStateChanged(boolean z) {
    }

    public final void onStopVideo(String str, boolean z) {
    }

    public final void onVideoDownloading(C263754Nf r1) {
    }

    public final /* synthetic */ void onVideoStartedPlaying(C263754Nf r1) {
    }

    public final void onVideoViewPrepared(C263754Nf r1) {
    }

    public static final void A00(C57463Ib7 ib7) {
        C14044Tol tol;
        if (ib7.A07) {
            Boolean bool = 1GE.A00(ib7.A00).A01;
            if ((bool == null || bool.booleanValue()) && (tol = ib7.A01) != null) {
                tol.A03(1.0f, 0);
            }
        }
    }

    public static final void A01(C57463Ib7 ib7, boolean z) {
        IgSimpleImageView igSimpleImageView;
        int i;
        C57457Ib1 ib1 = ib7.A02;
        if (z) {
            ib1.EuZ();
            if (182.A06(0Tu.A06, ib7.A00, 36319480405630394L)) {
                igSimpleImageView = ib1.A02;
                i = 8;
            } else {
                return;
            }
        } else {
            ib1.CLR();
            if (182.A06(0Tu.A06, ib7.A00, 36319480405630394L)) {
                igSimpleImageView = ib1.A02;
                i = 0;
            } else {
                return;
            }
        }
        igSimpleImageView.setVisibility(i);
    }

    public final void A02() {
        C14044Tol tol = this.A01;
        if (tol != null) {
            AnonymousClass3OB r1 = ((AnonymousClass4M1) tol.A06).A0M;
            0qQ.A07(r1);
            if (!AnonymousClass7TF.A1W(r1, AnonymousClass3OB.PREPARED)) {
                A04(true);
                return;
            }
            tol.A05(0, false);
            tol.A0C("resume", true);
            A00(this);
            A01(this, false);
        }
    }

    public final void A03(float f) {
        if (C55262Her.A00(this.A00).booleanValue()) {
            View view = this.A02.A00;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{f});
            0qQ.A07(ofFloat);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{f});
            0qQ.A07(ofFloat2);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
            animatorSet.setDuration(150);
            animatorSet.start();
        }
    }

    public final void A04(boolean z) {
        this.A04 = z;
        C14044Tol tol = this.A01;
        if (tol == null) {
            tol = new C14044Tol(AnonymousClass7TE.A0S(this.A02.A07), this.A00, this.A06.A01, this, this.A05.getModuleName());
            this.A01 = tol;
        }
        C54506HGs hGs = this.A06;
        1Xj r0 = hGs.A00;
        String str = r0.A0M;
        AnonymousClass3WR CEL = r0.CEL();
        tol.A09(this.A02.A07, CEL, hGs, str, this.A05.getModuleName(), C51971G9r.A00(this.A07 ? 1 : 0), -1, 0, false, false);
    }

    public final void Dxx(C263754Nf r2) {
        if (this.A04) {
            A02();
            this.A04 = false;
        }
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
        C56132HtK htK = this.A03;
        if (htK != null && i >= 5000) {
            C57463Ib7 ib7 = htK.A02;
            if (ib7 != null) {
                C14044Tol tol = ib7.A01;
                if (tol != null) {
                    tol.A0A("user_paused_video");
                }
                A01(ib7, true);
            }
            htK.A02();
        }
    }

    public final void onVideoPlayerError(C263754Nf r4, String str) {
        0f9 AEf = 0wj.A01.AEf(C51968G9o.A16(this), 1001132810);
        AEf.ABQ("error_message", str);
        AEf.report();
    }

    public C57463Ib7(AnonymousClass0iw r4, UserSession userSession, C54506HGs hGs, C57457Ib1 ib1) {
        this.A00 = userSession;
        this.A02 = ib1;
        this.A06 = hGs;
        this.A05 = r4;
        this.A07 = 182.A06(0Tu.A06, userSession, 36319480405827005L);
    }
}
