package X;

import java.util.Map;

/* renamed from: X.940  reason: invalid class name */
public final class AnonymousClass940 {
    public final /* synthetic */ C341427mr A00;

    public final void A00(C382299dT r13) {
        Object obj;
        String str;
        C382299dT r4 = r13;
        Map map = r13.A00;
        if (map != null) {
            obj = map.get("fba_error_code");
        } else {
            obj = "null";
        }
        0KC.A0L("AudioPipelineController", "PlatformOutputError %s", r13, new Object[]{obj});
        C341427mr r0 = this.A00;
        C344037rD r3 = r0.A0L;
        long hashCode = (long) r0.hashCode();
        Map map2 = r13.A00;
        if (map2 != null) {
            str = (String) map2.get("fba_error_code");
        } else {
            str = null;
        }
        r3.ChC(r4, "audio_pipeline_error", "AudioPipelineController", "debug", "PlatformOutputError", str, hashCode);
    }

    public AnonymousClass940(C341427mr r1) {
        this.A00 = r1;
    }
}
