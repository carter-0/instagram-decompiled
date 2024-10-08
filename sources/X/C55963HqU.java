package X;

import android.content.Context;
import android.util.LruCache;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.HqU  reason: case insensitive filesystem */
public final class C55963HqU {
    public C353638Im A00;
    public final Context A01;
    public final LruCache A02 = new LruCache(10);
    public final UserSession A03;

    public C55963HqU(Context context, UserSession userSession) {
        AnonymousClass7TG.A1O(context, userSession);
        this.A01 = context;
        this.A03 = userSession;
    }

    public final Object A00(AudioOverlayTrack audioOverlayTrack, AnonymousClass4D7 r13) {
        1IW A0q = C51973G9u.A0q(r13);
        DownloadedTrack downloadedTrack = (DownloadedTrack) this.A02.get(audioOverlayTrack);
        if (downloadedTrack != null) {
            audioOverlayTrack.A06 = downloadedTrack;
            A0q.resumeWith(C41845B3m.A0d(audioOverlayTrack));
        } else {
            C353638Im r4 = new C353638Im(this.A01, this.A03, new AnonymousClass8Zq(), 0);
            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
            if (musicAssetModel != null) {
                String str = musicAssetModel.A0H;
                if (str != null) {
                    r4.A04(musicAssetModel, new IW6(this, audioOverlayTrack, A0q), str, audioOverlayTrack.A03, audioOverlayTrack.A02, false);
                    this.A00 = r4;
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        A0q.CO0(new J6O(this, 7));
        return A0q.A0E();
    }
}
