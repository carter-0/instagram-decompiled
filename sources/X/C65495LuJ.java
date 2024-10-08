package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.List;

/* renamed from: X.LuJ  reason: case insensitive filesystem */
public final class C65495LuJ implements C66496MTz {
    public final /* synthetic */ int A00;
    public final /* synthetic */ LO4 A01;
    public final /* synthetic */ AudioOverlayTrack A02;
    public final /* synthetic */ 0rk A03;

    public final void DAG(MusicAssetModel musicAssetModel) {
        0qQ.A0B(musicAssetModel, 0);
        LO4 lo4 = this.A01;
        List list = lo4.A03;
        AudioOverlayTrack audioOverlayTrack = this.A02;
        list.add(audioOverlayTrack);
        0rk r2 = this.A03;
        int i = r2.A00 + 1;
        r2.A00 = i;
        audioOverlayTrack.A00(musicAssetModel);
        LO4.A00(lo4, i, this.A00);
    }

    public C65495LuJ(LO4 lo4, AudioOverlayTrack audioOverlayTrack, 0rk r3, int i) {
        this.A01 = lo4;
        this.A02 = audioOverlayTrack;
        this.A03 = r3;
        this.A00 = i;
    }

    public final void DAH() {
        0rk r1 = this.A03;
        int i = r1.A00 + 1;
        r1.A00 = i;
        LO4.A00(this.A01, i, this.A00);
    }
}
