package X;

import com.instagram.music.common.model.DownloadedTrack;

/* renamed from: X.9UY  reason: invalid class name */
public final class AnonymousClass9UY implements Runnable {
    public final /* synthetic */ DownloadedTrack A00;
    public final /* synthetic */ B2D A01;
    public final /* synthetic */ C353638Im A02;

    public AnonymousClass9UY(DownloadedTrack downloadedTrack, B2D b2d, C353638Im r3) {
        this.A02 = r3;
        this.A00 = downloadedTrack;
        this.A01 = b2d;
    }

    public final void run() {
        C353638Im r1 = this.A02;
        if (r1.A00) {
            C349257zq.A00();
            r1.A00 = false;
            DownloadedTrack downloadedTrack = this.A00;
            B2D b2d = this.A01;
            if (downloadedTrack != null) {
                b2d.DAF(downloadedTrack);
                for (B2D DAF : r1.A03) {
                    DAF.DAF(downloadedTrack);
                }
                return;
            }
            b2d.DAH();
            for (B2D DAH : r1.A03) {
                DAH.DAH();
            }
        }
    }
}
