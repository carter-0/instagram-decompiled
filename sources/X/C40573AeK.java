package X;

import android.net.Uri;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicDataSource;

/* renamed from: X.AeK  reason: case insensitive filesystem */
public final class C40573AeK implements B2D {
    public final /* synthetic */ C357738Zk A00;
    public final /* synthetic */ AudioOverlayTrack A01;

    public final void DAF(DownloadedTrack downloadedTrack) {
        0qQ.A0B(downloadedTrack, 0);
        C357738Zk r4 = this.A00;
        r4.A0I.setLoadingStatus(JY5.SUCCESS);
        r4.A0A.setVisibility(8);
        if (r4.A03 == null) {
            C357738Zk.A06(r4);
            return;
        }
        AudioOverlayTrack audioOverlayTrack = this.A01;
        audioOverlayTrack.A06 = downloadedTrack;
        Uri fromFile = Uri.fromFile(AnonymousClass7TE.A0t(downloadedTrack.A02));
        if (C357738Zk.A0E(r4)) {
            C357738Zk.A09(r4, audioOverlayTrack);
            return;
        }
        C349337zz r0 = r4.A03;
        if (r0 != null) {
            MusicDataSource A002 = C59670JTa.A00(r0.BUu());
            A002.A00 = fromFile;
            r4.A0J.Edj(A002, true);
        }
        r4.A0J.Edn(audioOverlayTrack.A02);
        C357738Zk.A05(r4);
    }

    public C40573AeK(C357738Zk r1, AudioOverlayTrack audioOverlayTrack) {
        this.A00 = r1;
        this.A01 = audioOverlayTrack;
    }

    public final void DAH() {
        C357738Zk r3 = this.A00;
        r3.A0I.setLoadingStatus(JY5.SUCCESS);
        r3.A0A.setVisibility(8);
        C59689JTv.A0F(r3.A09.getContext(), "music_track_download_failed", 2131967892);
        C357738Zk.A06(r3);
    }
}
