package X;

import android.media.AudioDeviceCallback;
import java.util.Map;

/* renamed from: X.9Qy  reason: invalid class name and case insensitive filesystem */
public final class C378719Qy implements Runnable {
    public final /* synthetic */ C341427mr A00;

    public C378719Qy(C341427mr r1) {
        this.A00 = r1;
    }

    public final void run() {
        C341427mr r2 = this.A00;
        synchronized (r2) {
            C341457mv r3 = r2.A0I;
            C341467mw r4 = r3.A05;
            r4.A01("dAS");
            C344037rD r6 = r2.A0L;
            r6.ChD(AnonymousClass7TE.A0Q(r2), "audio_pipeline_destroying", "AudioPipelineController", (Map) null);
            C371238xr r0 = r2.A04;
            if (r0 != null) {
                r0.A00();
                r2.A04 = null;
            }
            C341477mx r02 = r2.A0G;
            r02.A00 = null;
            r02.A01 = null;
            C341487my r03 = r2.A0H;
            r03.A00 = null;
            r03.A02 = null;
            r03.A01 = null;
            C39894ADw aDw = r2.A00;
            if (aDw != null) {
                r2.A0J.A00(aDw);
                r2.A00 = null;
            }
            r2.A00 = null;
            r2.A0P = null;
            if (r2.A05 != null) {
                r2.A05 = null;
            }
            C3730593v r04 = r2.A03;
            if (r04 != null) {
                r04.release();
                r2.A03 = null;
            }
            if (r2.A01 != null) {
                r2.A01 = null;
            }
            if (r2.A02 != null) {
                r2.A02 = null;
            }
            Object obj = r2.A06;
            if (obj != null) {
                r2.A0A.unregisterAudioDeviceCallback((AudioDeviceCallback) obj);
            }
            r2.A07 = false;
            r4.A01("dAE");
            C341447mt.A02(r2.A0B, false, true);
            r6.ChD(AnonymousClass7TE.A0Q(r2), "audio_pipeline_destroyed", "AudioPipelineController", C341457mv.A00(r2.A0A, r3, r2.A03));
        }
    }
}
