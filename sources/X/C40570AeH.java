package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.AeH  reason: case insensitive filesystem */
public final class C40570AeH implements C66496MTz {
    public final /* synthetic */ C357738Zk A00;
    public final /* synthetic */ AudioOverlayTrack A01;

    public final void DAG(MusicAssetModel musicAssetModel) {
        0qQ.A0B(musicAssetModel, 0);
        AudioOverlayTrack audioOverlayTrack = this.A01;
        audioOverlayTrack.A00(musicAssetModel);
        C357738Zk.A08(this.A00, audioOverlayTrack);
    }

    public C40570AeH(C357738Zk r1, AudioOverlayTrack audioOverlayTrack) {
        this.A01 = audioOverlayTrack;
        this.A00 = r1;
    }

    public final void DAH() {
        C357738Zk r3 = this.A00;
        C59689JTv.A0F(r3.A09.getContext(), "music_track_not_available", 2131967895);
        C357738Zk.A06(r3);
    }
}
