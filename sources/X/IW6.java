package X;

import android.util.LruCache;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;

public final class IW6 implements B2D {
    public final /* synthetic */ C55963HqU A00;
    public final /* synthetic */ AudioOverlayTrack A01;
    public final /* synthetic */ 1IX A02;

    public final void DAF(DownloadedTrack downloadedTrack) {
        0qQ.A0B(downloadedTrack, 0);
        LruCache lruCache = this.A00.A02;
        AudioOverlayTrack audioOverlayTrack = this.A01;
        lruCache.put(audioOverlayTrack, downloadedTrack);
        audioOverlayTrack.A06 = downloadedTrack;
        this.A02.resumeWith(C41845B3m.A0d(audioOverlayTrack));
    }

    public IW6(C55963HqU hqU, AudioOverlayTrack audioOverlayTrack, 1IX r3) {
        this.A00 = hqU;
        this.A01 = audioOverlayTrack;
        this.A02 = r3;
    }

    public final void DAH() {
        this.A02.resumeWith(DbU.A0f());
    }
}
