package X;

import android.os.Handler;
import java.util.Map;

/* renamed from: X.Apr  reason: case insensitive filesystem */
public final class C41193Apr implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C341427mr A01;
    public final /* synthetic */ C341617nF A02;
    public final /* synthetic */ C341687nM A03;

    public C41193Apr(Handler handler, C341427mr r2, C341617nF r3, C341687nM r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = handler;
    }

    public final void run() {
        C341427mr r5 = this.A01;
        C341617nF r2 = this.A02;
        C341687nM r4 = this.A03;
        Handler handler = this.A00;
        r5.A0I.A05.A01("aAS");
        if (r5.A03 == null) {
            C341427mr.A01(handler, new C382299dT("Audio pipeline should not be null"), r4, "addOutput");
            return;
        }
        r5.A0L.ChD(AnonymousClass7TE.A0Q(r5), "audio_pipeline_adding_output", "AudioPipelineController", (Map) null);
        r5.A0G.A00 = r2;
        r5.A03.startInput(new ATR(handler, r5, r4, 1), r5.A0B);
    }
}
