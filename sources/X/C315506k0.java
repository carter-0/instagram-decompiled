package X;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.music.external.pulseanimation.PulseAnimation;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6k0  reason: invalid class name and case insensitive filesystem */
public final class C315506k0 implements C315516k1 {
    public ViewGroup A00;
    public C255773uh A01;
    public PulseAnimation A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final UserSession A06;
    public final C315536k3 A07;
    public final C234502xy A08;
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(new AnonymousClass9LF(this, 9));
    public final C234462xu A0A;
    public final ReelViewerFragment A0B;

    public final void D7Q(C255773uh r2, C250973mM r3, C316026kz r4, C309426Yf r5) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r5, 2);
        if (!r2.equals(this.A01) || r5.A0m) {
            A01();
        }
    }

    public final /* synthetic */ void DLs(Reel reel) {
    }

    public final /* synthetic */ void DMq(int i) {
    }

    public final /* synthetic */ void DNx() {
    }

    public final /* synthetic */ void DNy() {
    }

    public final /* synthetic */ void DVL() {
    }

    public final /* synthetic */ void DiL(int i) {
    }

    public final /* synthetic */ void DiM(int i, int i2) {
    }

    public final /* synthetic */ void DiO(int i, int i2) {
    }

    public final /* synthetic */ void DiP() {
    }

    public final /* synthetic */ void DxL() {
    }

    public final /* synthetic */ void DxN() {
    }

    public final /* synthetic */ void DxU() {
    }

    public final /* synthetic */ void DyN(C255773uh r1, C316036l0 r2) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public static final void A00(C315506k0 r5, boolean z) {
        C255773uh r1;
        AnonymousClass0eM r2 = r5.A09;
        AudioManager audioManager = (AudioManager) r2.getValue();
        0qQ.A0B(audioManager, 0);
        int streamVolume = audioManager.getStreamVolume(3);
        AudioManager audioManager2 = (AudioManager) r2.getValue();
        0qQ.A0B(audioManager2, 0);
        int streamMaxVolume = audioManager2.getStreamMaxVolume(3);
        if (z && (r1 = r5.A01) != null) {
            r5.A0B.A0R(r1, streamVolume, streamMaxVolume);
        }
        boolean A002 = C255613uQ.A00(r5.A06, Integer.valueOf(streamVolume), r5.A04, false);
        C234502xy r12 = r5.A08;
        float f = 0.001f;
        if (A002) {
            f = 1.0f;
        }
        r12.Eqq(f);
    }

    public final void A01() {
        if (this.A01 != null) {
            if (this.A03) {
                this.A03 = false;
                PulseAnimation pulseAnimation = this.A02;
                if (pulseAnimation != null) {
                    pulseAnimation.A02();
                }
                this.A08.pause();
            }
            PulseAnimation pulseAnimation2 = this.A02;
            if (pulseAnimation2 != null) {
                ViewGroup viewGroup = this.A00;
                if (viewGroup != null) {
                    viewGroup.removeView(pulseAnimation2);
                }
                this.A02 = null;
            }
            C234502xy r0 = this.A08;
            r0.AHY();
            r0.release();
            this.A01 = null;
        }
    }

    public final /* synthetic */ boolean BVb() {
        return false;
    }

    public final /* synthetic */ int BrB() {
        return 0;
    }

    public final /* synthetic */ boolean Bu3() {
        return false;
    }

    public final /* synthetic */ boolean Cau() {
        return false;
    }

    public final void DWT(String str) {
        if (this.A01 != null && this.A03) {
            this.A03 = false;
            PulseAnimation pulseAnimation = this.A02;
            if (pulseAnimation != null) {
                pulseAnimation.A02();
            }
            this.A08.pause();
        }
    }

    public final void Dfe() {
        if (this.A01 != null && !this.A03) {
            this.A03 = true;
            PulseAnimation pulseAnimation = this.A02;
            if (pulseAnimation != null) {
                pulseAnimation.A01();
            }
            this.A08.E2p();
        }
    }

    public final /* synthetic */ boolean Dpr() {
        return false;
    }

    public final /* synthetic */ boolean Dq0() {
        return false;
    }

    public final /* synthetic */ boolean Dqd() {
        return false;
    }

    public C315506k0(Context context, UserSession userSession, ReelViewerFragment reelViewerFragment) {
        this.A06 = userSession;
        this.A0B = reelViewerFragment;
        this.A05 = context;
        C234462xu r5 = new C234462xu(context, userSession);
        this.A0A = r5;
        this.A08 = C234472xv.A01(context, userSession, (AnonymousClass4DU) null, r5, "ExternalShareAudioManagerImpl", false, C234472xv.A02(userSession), false, false);
        this.A07 = new C315526k2(this);
    }

    public final void onDestroyView() {
        A01();
    }
}
