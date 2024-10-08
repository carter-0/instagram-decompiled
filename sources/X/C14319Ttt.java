package X;

import android.content.Context;
import com.instagram.autoplay.models.AutoplayPlaybackState;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ttt  reason: case insensitive filesystem */
public final class C14319Ttt extends C14312Ttm {
    public AutoplayPlaybackState A00;
    public final UserSession A01;
    public final C14077TpR A02;
    public final C14336TuJ A03;

    public final void onStopVideo(String str, boolean z) {
        0qQ.A0B(str, 0);
        A00(this, AutoplayPlaybackState.PAUSED, A07(), "onStopVideo");
        super.onStopVideo(str, z);
    }

    public final void onVideoPlayerError(C263754Nf r4, String str) {
        0qQ.A0B(r4, 0);
        A00(this, AutoplayPlaybackState.FAILURE, (1Xj) r4.A03, "onVideoPlayerError");
        super.onVideoPlayerError(r4, str);
    }

    public final void onVideoStartedPlaying(C263754Nf r4) {
        0qQ.A0B(r4, 0);
        A00(this, AutoplayPlaybackState.PLAYING, (1Xj) r4.A03, "onVideoStartedPlaying");
        super.onVideoStartedPlaying(r4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14319Ttt(Context context, C14077TpR tpR, C14336TuJ tuJ, UserSession userSession, AnonymousClass4DU r12, String str) {
        super(context, userSession, r12, str, 0);
        0qQ.A0B(tuJ, 2);
        this.A02 = tpR;
        this.A03 = tuJ;
        this.A01 = userSession;
    }

    public static final void A00(C14319Ttt ttt, AutoplayPlaybackState autoplayPlaybackState, 1Xj r6, String str) {
        AutoplayPlaybackState autoplayPlaybackState2 = ttt.A00;
        if (autoplayPlaybackState2 == autoplayPlaybackState) {
            return;
        }
        if ((autoplayPlaybackState2 != AutoplayPlaybackState.PLAYING_AND_LOOPED_ONCE || autoplayPlaybackState != AutoplayPlaybackState.PLAYING) && r6 != null) {
            0qQ.A0B(002.A0g(str, ": ", r6.getId()), 0);
            C14077TpR tpR = ttt.A02;
            StringBuilder sb = new StringBuilder();
            sb.append("onPlaybackStateChanged: ");
            sb.append(r6.getId());
            0qQ.A0B(AnonymousClass7TG.A0m(autoplayPlaybackState, ", state ", sb), 0);
            tpR.A03.A02(autoplayPlaybackState, r6);
            ((C46551Dgt) tpR.A04.getValue()).A00();
            ttt.A00 = autoplayPlaybackState;
        }
    }

    public final void A0C(String str, boolean z) {
        A00(this, AutoplayPlaybackState.PAUSED, A07(), "stopVideo");
        super.A0C(str, z);
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
        AutoplayPlaybackState autoplayPlaybackState;
        if (A0G() && this.A00 != (autoplayPlaybackState = AutoplayPlaybackState.PLAYING)) {
            A00(this, autoplayPlaybackState, A07(), "onProgressUpdate");
        }
        super.onProgressUpdate(i, i2, z);
    }
}
