package X;

import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Ib8  reason: case insensitive filesystem */
public final class C57464Ib8 implements C331117Pq, AudioManager.OnAudioFocusChangeListener, View.OnKeyListener {
    public C14044Tol A00;
    public C54506HGs A01;
    public final 1vq A02;
    public final UserSession A03;
    public final Context A04;
    public final AudioManager A05;
    public final Animation A06;
    public final AnonymousClass0iw A07;
    public final C313506gY A08;
    public final boolean A09;

    public final void A00(C54506HGs hGs) {
        C54506HGs hGs2 = hGs;
        this.A01 = hGs2;
        1Xj r1 = hGs2.A00;
        C14044Tol tol = this.A00;
        if (tol == null) {
            tol = new C14044Tol(this.A04, this.A03, hGs2.A01, this, this.A07.getModuleName());
            this.A00 = tol;
        }
        String str = r1.A0M;
        tol.A09(hGs2.A02.CDv(), r1.A2D(), hGs2, str, this.A07.getModuleName(), 1.0f, -1, 0, false, false);
    }

    public final void A01(boolean z) {
        C14044Tol tol;
        IgImageView BGD;
        C14044Tol tol2;
        if (z && (tol2 = this.A00) != null) {
            tol2.A05(0, false);
        }
        if (!this.A09 || (tol = this.A00) == null || tol.A06.getCurrentPositionMs() != 0) {
            C54506HGs hGs = this.A01;
            if (hGs != null) {
                hGs.A02.CLR();
            }
        } else {
            C54506HGs hGs2 = this.A01;
            if (!(hGs2 == null || (BGD = hGs2.A02.BGD()) == null)) {
                BGD.startAnimation(this.A06);
            }
        }
        C14044Tol tol3 = this.A00;
        if (tol3 != null) {
            tol3.A0C("resume", false);
        }
        C14044Tol tol4 = this.A00;
        if (tol4 != null && tol4.A0E()) {
            this.A02.A04(this);
            C14044Tol tol5 = this.A00;
            if (tol5 != null) {
                tol5.A03(1.0f, 0);
            }
        }
    }

    public final void DxV(C263754Nf r1) {
    }

    public final void Dxx(C263754Nf r3) {
        0qQ.A0B(r3, 0);
        this.A08.Dxv((1Xj) r3.A03);
    }

    public final void Dxy(C263754Nf r1) {
    }

    public final void Dyj(int i, int i2) {
    }

    public final void onCompletion() {
        A01(true);
    }

    public final void onCues(List list) {
    }

    public final void onLoop(int i) {
    }

    public final void onPrepare(C263754Nf r1) {
    }

    public final void onProgressStateChanged(boolean z) {
    }

    public final void onVideoDownloading(C263754Nf r1) {
    }

    public final void onVideoPlayerError(C263754Nf r1, String str) {
    }

    public final /* synthetic */ void onVideoStartedPlaying(C263754Nf r1) {
    }

    public final void onVideoViewPrepared(C263754Nf r1) {
    }

    public final void onAudioFocusChange(int i) {
        C250563lf.A0g(new C57043IMj(this, this), i);
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C14044Tol tol;
        if (this.A01 == null || (tol = this.A00) == null || !tol.A0F()) {
            return false;
        }
        AudioManager audioManager = this.A05;
        C57044IMk iMk = new C57044IMk(this, i, 1);
        0qQ.A0B(audioManager, 2);
        return I6Y.A05(audioManager, keyEvent, new C58133Imz(iMk, 49), i);
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
        this.A08.onProgressUpdate(i, i2, z);
    }

    public final void onStopVideo(String str, boolean z) {
        IgImageView BGD;
        C54506HGs hGs = this.A01;
        if (!(hGs == null || (BGD = hGs.A02.BGD()) == null)) {
            BGD.clearAnimation();
        }
        C54506HGs hGs2 = this.A01;
        if (hGs2 != null) {
            hGs2.A02.EuZ();
        }
        this.A02.A03(this);
    }

    public C57464Ib8(Context context, AnonymousClass0iw r4, UserSession userSession, C313506gY r6, boolean z) {
        this.A04 = context;
        this.A03 = userSession;
        this.A07 = r4;
        this.A08 = r6;
        this.A09 = z;
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.cover_photo_fade_out);
        0qQ.A07(loadAnimation);
        this.A06 = loadAnimation;
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        0qQ.A0C(systemService, AnonymousClass000.A00(4));
        AudioManager audioManager = (AudioManager) systemService;
        this.A05 = audioManager;
        this.A02 = new 1vq(audioManager, userSession);
    }
}
