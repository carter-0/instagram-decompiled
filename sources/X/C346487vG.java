package X;

import java.util.Map;

/* renamed from: X.7vG  reason: invalid class name and case insensitive filesystem */
public final class C346487vG implements C341687nM {
    public final /* synthetic */ C341427mr A00;

    public final void onSuccess() {
    }

    public C346487vG(C341427mr r1) {
        this.A00 = r1;
    }

    public final void DCg(C391719tX r12) {
        String str;
        C341427mr r0 = this.A00;
        C344037rD r2 = r0.A0L;
        long hashCode = (long) r0.hashCode();
        C391719tX r3 = r12;
        Map map = r12.A00;
        if (map != null) {
            str = (String) map.get("fba_error_code");
        } else {
            str = null;
        }
        r2.ChC(r3, "audio_pipeline_pause_failed", "AudioPipelineController", "low", "AudioPipelineController", str, hashCode);
    }
}
