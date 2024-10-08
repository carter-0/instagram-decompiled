package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.IbA  reason: case insensitive filesystem */
public final class C57466IbA implements C331117Pq, AudioManager.OnAudioFocusChangeListener, View.OnKeyListener {
    public C14044Tol A00;
    public C54508HGu A01;
    public final Context A02;
    public final Animation A03;
    public final 1vq A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final AudioManager A07;
    public final Animation A08;
    public final C56625I5d A09;

    public static final void A00(C57466IbA ibA, int i) {
        1GE.A00(ibA.A06).A00(false);
        C14044Tol tol = ibA.A00;
        if (tol != null) {
            tol.A03(0.0f, i);
        }
        ibA.A04.A03(ibA);
    }

    public final void DxV(C263754Nf r1) {
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

    public final void Dxx(C263754Nf r4) {
        C56625I5d i5d = this.A09;
        int i = i5d.A01 + 1;
        i5d.A01 = i;
        if (i == i5d.A08.size()) {
            C56625I5d.A02(i5d);
        }
    }

    public final void onAudioFocusChange(int i) {
        I6Y.A04(new MMH(this, 41), C59097J6f.A01(this, 30), i);
    }

    public final void onCompletion() {
        C56625I5d i5d = this.A09;
        Handler handler = i5d.A04;
        handler.removeCallbacks(i5d.A06);
        handler.removeCallbacks(i5d.A05);
        C56625I5d.A01(i5d);
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C14044Tol tol;
        if (this.A01 == null || (tol = this.A00) == null || !tol.A0F()) {
            return false;
        }
        return I6Y.A05(this.A07, keyEvent, new C58184Ino(this, i, 1), i);
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
        C53368Gms gms;
        C57465Ib9 ib9 = this.A09.A02;
        if (ib9 != null && (gms = ib9.A05.A09) != null) {
            gms.A00 = ib9.A01;
            gms.A01 = i;
        }
    }

    public final void onStopVideo(String str, boolean z) {
        C54508HGu hGu = this.A01;
        if (hGu != null) {
            IgImageView igImageView = hGu.A03.A00;
            if (igImageView != null) {
                igImageView.clearAnimation();
            }
            0qQ.A0F("imagePlaceholder");
            throw AnonymousClass00P.createAndThrow();
        }
        C54508HGu hGu2 = this.A01;
        if (hGu2 != null) {
            IgImageView igImageView2 = hGu2.A03.A00;
            if (igImageView2 != null) {
                igImageView2.setVisibility(0);
            }
            0qQ.A0F("imagePlaceholder");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A04.A03(this);
    }

    public C57466IbA(Context context, AnonymousClass0iw r4, UserSession userSession, C56625I5d i5d) {
        this.A02 = context;
        this.A06 = userSession;
        this.A05 = r4;
        this.A09 = i5d;
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.cover_photo_fade_out);
        0qQ.A07(loadAnimation);
        this.A03 = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.cover_photo_fade_in);
        0qQ.A07(loadAnimation2);
        this.A08 = loadAnimation2;
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        0qQ.A0C(systemService, AnonymousClass000.A00(4));
        AudioManager audioManager = (AudioManager) systemService;
        this.A07 = audioManager;
        this.A04 = new 1vq(audioManager, userSession);
    }
}
