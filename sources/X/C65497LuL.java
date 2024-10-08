package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;

/* renamed from: X.LuL  reason: case insensitive filesystem */
public final class C65497LuL implements B2D {
    public final int A00;
    public final Object A01;

    public C65497LuL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DAF(DownloadedTrack downloadedTrack) {
        int i = this.A00;
        0qQ.A0B(downloadedTrack, 0);
        if (i != 0) {
            ((AudioOverlayTrack) this.A01).A06 = downloadedTrack;
            return;
        }
        C63924LDf lDf = (C63924LDf) this.A01;
        lDf.A03.A06 = downloadedTrack;
        lDf.A02.DSp();
    }

    public final void DAH() {
        if (this.A00 == 0) {
            ((C63924LDf) this.A01).A02.DSo("download track failed");
        }
    }
}
