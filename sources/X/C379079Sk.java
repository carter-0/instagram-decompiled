package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.9Sk  reason: invalid class name and case insensitive filesystem */
public final class C379079Sk implements C66496MTz {
    public final /* synthetic */ C353498Hw A00;
    public final /* synthetic */ AudioOverlayTrack A01;

    public final void DAG(MusicAssetModel musicAssetModel) {
        0qQ.A0B(musicAssetModel, 0);
        C353498Hw r3 = this.A00;
        r3.A1h.A0D("asset_download_complete");
        AudioOverlayTrack audioOverlayTrack = this.A01;
        audioOverlayTrack.A00(musicAssetModel);
        r3.A1n.A0b(new AnonymousClass8RJ(audioOverlayTrack), false);
        C353498Hw.A12(r3, audioOverlayTrack, false);
        C353498Hw.A0X(r3);
    }

    public C379079Sk(C353498Hw r1, AudioOverlayTrack audioOverlayTrack) {
        this.A00 = r1;
        this.A01 = audioOverlayTrack;
    }

    public final void DAH() {
        C353498Hw r3 = this.A00;
        C353498Hw.A0b(r3);
        if (r3.A0l) {
            C59689JTv.A0F(r3.A11, "music_track_not_available", 2131967895);
            if (r3.A0g) {
                r3.A1h.A03();
            }
            r3.A1h.A0C("music asset download failed");
            return;
        }
        r3.A1h.A0B("Asset DownloadFailed but ClipsCaptureContainer is hidden");
    }
}
