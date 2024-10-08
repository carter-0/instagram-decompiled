package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.LuK  reason: case insensitive filesystem */
public final class C65496LuK implements C66496MTz {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C65498LuM A01;
    public final /* synthetic */ LO4 A02;
    public final /* synthetic */ AudioOverlayTrack A03;
    public final /* synthetic */ 0rk A04;

    public final void DAG(MusicAssetModel musicAssetModel) {
        0qQ.A0B(musicAssetModel, 0);
        AudioOverlayTrack audioOverlayTrack = this.A03;
        audioOverlayTrack.A00(musicAssetModel);
        LO4 lo4 = this.A02;
        C65498LuM luM = this.A01;
        new C353638Im(lo4.A01, lo4.A02, new AnonymousClass8Zq(), 0).A03(audioOverlayTrack, this, luM, lo4.A00, false, false);
    }

    public C65496LuK(C65498LuM luM, LO4 lo4, AudioOverlayTrack audioOverlayTrack, 0rk r4, int i) {
        this.A03 = audioOverlayTrack;
        this.A02 = lo4;
        this.A01 = luM;
        this.A04 = r4;
        this.A00 = i;
    }

    public final void DAH() {
        0rk r1 = this.A04;
        int i = r1.A00 + 1;
        r1.A00 = i;
        LO4.A00(this.A02, i, this.A00);
    }
}
