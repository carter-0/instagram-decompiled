package X;

import android.os.Handler;
import java.util.Map;

/* renamed from: X.AoP  reason: case insensitive filesystem */
public final class C41103AoP implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C341427mr A01;
    public final /* synthetic */ C341687nM A02;

    public C41103AoP(Handler handler, C341427mr r2, C341687nM r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = handler;
    }

    public final void run() {
        C341427mr r5 = this.A01;
        C341687nM r4 = this.A02;
        Handler handler = this.A00;
        r5.A0I.A05.A01("rOAS");
        if (r5.A03 == null) {
            C341427mr.A01(handler, new C382299dT("Audio pipeline should not be null"), r4, "removeOutput");
            return;
        }
        r5.A0L.ChD(AnonymousClass7TE.A0Q(r5), "audio_pipeline_removing_output", "AudioPipelineController", (Map) null);
        r5.A0G.A00 = null;
        r5.A03.stopInput(new ATR(handler, r5, r4, 2), r5.A0B);
    }
}
