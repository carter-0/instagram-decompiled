package X;

import android.os.SystemClock;
import com.instagram.creation.capture.quickcapture.cameracountdown.CountdownView;

/* renamed from: X.Mgj  reason: case insensitive filesystem */
public final class C67011Mgj implements Runnable {
    public final /* synthetic */ C67010Mgi A00;

    public C67011Mgj(C67010Mgi mgi) {
        this.A00 = mgi;
    }

    public final void run() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C67010Mgi mgi = this.A00;
        float A01 = 0mi.A01((float) (elapsedRealtime - mgi.A01), 0.0f, (float) C353608Ij.A00(mgi.A0E), 0.0f, 1.0f);
        CountdownView countdownView = mgi.A0F;
        countdownView.setProgress(A01);
        countdownView.postOnAnimation(mgi.A0G);
    }
}
