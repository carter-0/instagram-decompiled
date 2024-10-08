package X;

import android.content.Context;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicDataSource;

public final class LR8 {
    public final C284945Oz A00 = C51970G9q.A0S(AnonymousClass7TE.A0u());
    public final C234502xy A01;
    public final boolean A02;

    public LR8(Context context, UserSession userSession, AnonymousClass4DU r10, boolean z) {
        DbZ.A0t(1, r10, context, userSession);
        this.A02 = z;
        this.A01 = C234472xv.A00(context, userSession, r10, new C234462xu(context, userSession), "WallMusicPreview", true);
    }

    public static final void A00(AudioOverlayTrack audioOverlayTrack, LR8 lr8) {
        boolean z = lr8.A02;
        C234502xy r1 = lr8.A01;
        if (z) {
            r1.seekTo(audioOverlayTrack.A03);
            if (r1.CKF()) {
                r1.E2p();
            } else {
                A01(audioOverlayTrack, lr8);
            }
        } else {
            r1.EHu(false);
        }
    }

    public static final void A01(AudioOverlayTrack audioOverlayTrack, LR8 lr8) {
        C234502xy r3 = lr8.A01;
        if (!r3.CKF() || r3.isPlaying()) {
            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
            if (musicAssetModel != null) {
                int i = audioOverlayTrack.A03;
                r3.ETw(new MusicDataSource((Uri) null, AudioType.MUSIC, musicAssetModel.A0H, musicAssetModel.A0C, audioOverlayTrack.A0A, musicAssetModel.A0A), new C61986KUj(i, 1, audioOverlayTrack, lr8), (String) null, 0, -1, -1, false, false);
                r3.seekTo(i);
            } else {
                return;
            }
        }
        r3.E2p();
        C51967G9n.A16(lr8.A00, true);
    }

    public final void A02() {
        C234502xy r2 = this.A01;
        if (r2.isPlaying()) {
            C51967G9n.A16(this.A00, false);
            r2.pause();
            r2.release();
        }
    }
}
