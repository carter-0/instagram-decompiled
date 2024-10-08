package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.AeI  reason: case insensitive filesystem */
public final class C40571AeI implements C66496MTz {
    public final /* synthetic */ C353498Hw A00;
    public final /* synthetic */ AudioOverlayTrack A01;

    public final void DAG(MusicAssetModel musicAssetModel) {
        0qQ.A0B(musicAssetModel, 0);
        AudioOverlayTrack audioOverlayTrack = this.A01;
        audioOverlayTrack.A00(musicAssetModel);
        C353498Hw r2 = this.A00;
        r2.A1n.A0b(new AnonymousClass8Y4(audioOverlayTrack), false);
        C353498Hw.A0X(r2);
    }

    public C40571AeI(C353498Hw r1, AudioOverlayTrack audioOverlayTrack) {
        this.A01 = audioOverlayTrack;
        this.A00 = r1;
    }

    public final void DAH() {
        C353498Hw r3 = this.A00;
        if (r3.A0l) {
            C59689JTv.A0F(r3.A11, "music_track_not_available", 2131967895);
            C353498Hw.A0b(r3);
            r3.A1h.A03();
        }
    }
}
