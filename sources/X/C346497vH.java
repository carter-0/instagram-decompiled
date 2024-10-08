package X;

import android.os.Handler;
import java.util.Map;

/* renamed from: X.7vH  reason: invalid class name and case insensitive filesystem */
public final class C346497vH implements Runnable {
    public final /* synthetic */ C341427mr A00;
    public final /* synthetic */ C341687nM A01;

    public C346497vH(C341427mr r1, C341687nM r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        C346507vI r1;
        C341427mr r6 = this.A00;
        C341687nM r4 = this.A01;
        Handler handler = r6.A0C;
        C341467mw r5 = r6.A0I.A05;
        r5.A01("pAS");
        if (r6.A04 == null || r6.A03 == null || !r6.A07) {
            r1 = new C346507vI(0, "", r4);
        } else {
            r6.A0L.ChD((long) r6.hashCode(), "audio_pipeline_pausing", "AudioPipelineController", (Map) null);
            int pause = r6.A03.pause();
            r6.A07 = false;
            r6.A04.A00();
            C39894ADw aDw = r6.A00;
            if (aDw != null) {
                r6.A0J.A00(aDw);
                r6.A00 = null;
            }
            r5.A01("pAE");
            r1 = new C346507vI(pause, "Failed to pause audio pipeline.", r4);
        }
        handler.post(r1);
    }
}
