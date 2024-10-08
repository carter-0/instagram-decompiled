package X;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import com.facebook.audiofiltercore.interfaces.AudioInput;

public final class TR2 extends Thread {
    public final /* synthetic */ C10772Rxq A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TR2(C10772Rxq rxq) {
        super("AudioTrackThread");
        this.A00 = rxq;
    }

    public final void run() {
        Process.setThreadPriority(-19);
        while (true) {
            C10772Rxq rxq = this.A00;
            if (rxq.A05) {
                try {
                    rxq.A02.getClass();
                    rxq.A00.getClass();
                    rxq.A04.getClass();
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    AudioInput audioInput = rxq.A02;
                    short[] sArr = rxq.A04;
                    if (audioInput.read(sArr, sArr.length) > 0) {
                        C39897ADz aDz = rxq.A03;
                        aDz.A07 += SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
                        aDz.A06++;
                    }
                    AudioTrack audioTrack = rxq.A00;
                    short[] sArr2 = rxq.A04;
                    audioTrack.write(sArr2, 0, sArr2.length);
                } catch (Exception e) {
                    0KC.A05(C10772Rxq.class, "Exception", e);
                    return;
                }
            } else {
                return;
            }
        }
    }
}
