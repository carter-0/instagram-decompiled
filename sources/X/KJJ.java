package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class KJJ extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C66478MTg A04;
    public final /* synthetic */ AudioOverlayTrack A05;
    public final /* synthetic */ 2Nn A06;
    public final /* synthetic */ File A07;
    public final /* synthetic */ ExecutorService A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KJJ(Context context, UserSession userSession, C66478MTg mTg, AudioOverlayTrack audioOverlayTrack, 2Nn r8, File file, ExecutorService executorService, int i, int i2) {
        super(578, 3, false, false);
        this.A02 = context;
        this.A03 = userSession;
        this.A06 = r8;
        this.A08 = executorService;
        this.A07 = file;
        this.A05 = audioOverlayTrack;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = mTg;
    }

    public final void run() {
        IOException iOException;
        Runnable m6w;
        2Nn r7 = this.A06;
        File file = this.A07;
        AudioOverlayTrack audioOverlayTrack = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        C66478MTg mTg = this.A04;
        DownloadedTrack downloadedTrack = audioOverlayTrack.A06;
        if (downloadedTrack == null) {
            iOException = JTO.A0u("Downloaded track not found for Audio Overlay");
        } else {
            int A002 = (downloadedTrack.A00(audioOverlayTrack.A03) + i) - i2;
            File A0s = JTO.A0s(r7.C4W(), "audio_overlay_video.mp4");
            try {
                C9824Rhm.A00(r7, file, AnonymousClass7TE.A0t(downloadedTrack.A02), A0s, A002);
                m6w = new C65985M6w(mTg, A0s);
            } catch (Throwable th) {
                if (th instanceof IOException) {
                    iOException = th;
                } else {
                    iOException = new IOException(th);
                }
            }
            11Z.A02(m6w);
        }
        m6w = new C65986M6x(mTg, iOException);
        11Z.A02(m6w);
    }
}
