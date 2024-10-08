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

/* renamed from: X.IbB  reason: case insensitive filesystem */
public final class C57467IbB implements C331117Pq, AudioManager.OnAudioFocusChangeListener, View.OnKeyListener {
    public C54507HGt A00;
    public C14044Tol A01;
    public final Animation A02;
    public final 1vq A03;
    public final UserSession A04;
    public final Context A05;
    public final AudioManager A06;
    public final Animation A07;
    public final AnonymousClass0iw A08;
    public final C313476gV A09;

    public static void A00(C57467IbB ibB) {
        ibB.A03(false, true);
    }

    public final void A02(C54507HGt hGt, boolean z) {
        C54507HGt hGt2 = hGt;
        this.A00 = hGt2;
        1Xj r2 = hGt2.A00;
        if (this.A01 == null) {
            this.A01 = new C14044Tol(this.A05, this.A04, hGt2.A01, this, this.A08.getModuleName());
        }
        try {
            C59614JQi jQi = hGt2.A02;
            jQi.CDv();
            C14044Tol tol = this.A01;
            if (tol != null) {
                String str = r2.A0M;
                AnonymousClass3WR A2D = r2.A2D();
                tol.A09(jQi.CDv(), A2D, hGt2, str, this.A08.getModuleName(), C51971G9r.A00(hGt2.A03 ? 1 : 0), -1, 0, z, false);
            }
        } catch (AnonymousClass0fC unused) {
            0wb.A03("MultipleClipsVideoPlayer", "failed to resume multiple players");
        }
    }

    public final void A03(boolean z, boolean z2) {
        IgImageView BGD;
        C14044Tol tol;
        if (z2 && (tol = this.A01) != null) {
            tol.A05(0, false);
        }
        C14044Tol tol2 = this.A01;
        if (tol2 == null || tol2.A06.getCurrentPositionMs() != 0) {
            C54507HGt hGt = this.A00;
            if (hGt != null) {
                hGt.A02.CLR();
            }
        } else {
            C54507HGt hGt2 = this.A00;
            if (!(hGt2 == null || (BGD = hGt2.A02.BGD()) == null)) {
                BGD.startAnimation(this.A07);
            }
        }
        C14044Tol tol3 = this.A01;
        if (tol3 != null) {
            tol3.A0C("resume", false);
        }
        Boolean bool = 1GE.A00(this.A04).A01;
        if (bool == null || bool.booleanValue()) {
            C54507HGt hGt3 = this.A00;
            if ((hGt3 != null && hGt3.A03) || z) {
                this.A03.A04(this);
                C14044Tol tol4 = this.A01;
                if (tol4 != null) {
                    tol4.A03(1.0f, 0);
                }
            }
        }
    }

    public final void DxV(C263754Nf r1) {
    }

    public final void Dxx(C263754Nf r3) {
        0qQ.A0B(r3, 0);
        this.A09.Dxv((1Xj) r3.A03);
    }

    public final void Dxy(C263754Nf r1) {
    }

    public final void Dyj(int i, int i2) {
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

    public final void A01() {
        C14044Tol tol = this.A01;
        if (tol != null) {
            tol.A0B("out_of_playback_range");
        }
        this.A01 = null;
    }

    public final void onAudioFocusChange(int i) {
        C250563lf.A0g(new C57045IMl(this, this, new MPC(this, 28)), i);
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C14044Tol tol;
        C54507HGt hGt = this.A00;
        if (hGt == null || (tol = this.A01) == null || !hGt.A03 || !tol.A0F()) {
            return false;
        }
        AudioManager audioManager = this.A06;
        C57044IMk iMk = new C57044IMk(this, i, 0);
        0qQ.A0B(audioManager, 2);
        return I6Y.A05(audioManager, keyEvent, new C58133Imz(iMk, 49), i);
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
        this.A09.onProgressUpdate(i, i2, z);
    }

    public final void onStopVideo(String str, boolean z) {
        IgImageView BGD;
        C54507HGt hGt = this.A00;
        if (!(hGt == null || (BGD = hGt.A02.BGD()) == null)) {
            BGD.clearAnimation();
        }
        C54507HGt hGt2 = this.A00;
        if (hGt2 != null) {
            hGt2.A02.EuZ();
        }
        this.A03.A03(this);
    }

    public C57467IbB(Context context, AnonymousClass0iw r4, UserSession userSession, C313476gV r6) {
        this.A05 = context;
        this.A04 = userSession;
        this.A08 = r4;
        this.A09 = r6;
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.cover_photo_fade_out);
        0qQ.A07(loadAnimation);
        this.A07 = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.cover_photo_fade_in);
        0qQ.A07(loadAnimation2);
        this.A02 = loadAnimation2;
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        0qQ.A0C(systemService, AnonymousClass000.A00(4));
        AudioManager audioManager = (AudioManager) systemService;
        this.A06 = audioManager;
        this.A03 = new 1vq(audioManager, userSession);
    }

    public final void onCompletion() {
        A00(this);
        this.A09.onCompletion();
    }
}
