package X;

import com.instagram.common.session.UserSession;
import com.instagram.music.search.MusicOverlayResultsListController;

/* renamed from: X.KUi  reason: case insensitive filesystem */
public final class C61985KUi extends C65502LuQ {
    public final /* synthetic */ C66569MWx A00;
    public final /* synthetic */ MusicOverlayResultsListController A01;

    public C61985KUi(C66569MWx mWx, MusicOverlayResultsListController musicOverlayResultsListController) {
        this.A01 = musicOverlayResultsListController;
        this.A00 = mWx;
    }

    public final void onCurrentTrackPlayTimeUpdated(int i) {
        C66453MSh mSh;
        MusicOverlayResultsListController musicOverlayResultsListController = this.A01;
        C66569MWx mWx = this.A00;
        int A002 = MusicOverlayResultsListController.A00(mWx, musicOverlayResultsListController);
        if (A002 >= 0 && (mSh = (C66453MSh) musicOverlayResultsListController.A05().A0W(A002)) != null) {
            float f = (((float) i) - ((float) musicOverlayResultsListController.A02)) / ((float) musicOverlayResultsListController.A01);
            if (f >= 1.0f) {
                musicOverlayResultsListController.A0C.EHu(false);
            } else {
                mSh.FM3(mWx, f);
            }
        }
    }

    public final void onCurrentTrackPrepared(int i) {
        MusicOverlayResultsListController musicOverlayResultsListController = this.A01;
        C66569MWx mWx = this.A00;
        int A002 = MusicOverlayResultsListController.A00(mWx, musicOverlayResultsListController);
        if (A002 >= 0) {
            int A003 = C63348KvV.A00(i, 30000, mWx.BDX());
            musicOverlayResultsListController.A02 = A003;
            musicOverlayResultsListController.A01 = Math.min(30000, i - A003);
            C234502xy r0 = musicOverlayResultsListController.A0C;
            r0.seekTo(A003);
            r0.E2p();
        }
        musicOverlayResultsListController.A0E.notifyItemChanged(A002);
    }

    public final void onCurrentTrackStartedPlaying() {
        UserSession userSession = this.A01.A0B;
        0qQ.A0B(userSession, 0);
        29H r4 = 27p.A01(userSession).A03;
        r4.A04 = r4.A0E.A02(17645025, r4.A04);
    }

    public final void onCurrentTrackStopped() {
        MusicOverlayResultsListController musicOverlayResultsListController = this.A01;
        musicOverlayResultsListController.A05().post(new C65999M7k(this.A00, musicOverlayResultsListController));
    }
}
