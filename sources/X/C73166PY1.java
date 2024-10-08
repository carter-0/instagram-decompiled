package X;

import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.AudioOutputRoute;

/* renamed from: X.PY1  reason: case insensitive filesystem */
public final class C73166PY1 implements Runnable {
    public final /* synthetic */ AudioOutputRoute A00;
    public final /* synthetic */ NCR A01;

    public C73166PY1(AudioOutputRoute audioOutputRoute, NCR ncr) {
        this.A01 = ncr;
        this.A00 = audioOutputRoute;
    }

    public final void run() {
        C74295PsU psU;
        NCR ncr = this.A01;
        AudioApi audioApi = ncr.A00;
        if (audioApi != null) {
            audioApi.setAudioOutputRoute(this.A00);
        }
        if (0qQ.A0K(AudioOutputRoute.UNKNOWN, this.A00) && (psU = ncr.A01) != null) {
            psU.Cwl();
        }
    }
}
