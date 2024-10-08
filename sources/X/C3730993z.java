package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.93z  reason: invalid class name and case insensitive filesystem */
public final class C3730993z {
    public final /* synthetic */ C341427mr A00;

    public C3730993z(C341427mr r1) {
        this.A00 = r1;
    }

    public final void A00(long j, HashMap hashMap) {
        String str;
        C341427mr r2 = this.A00;
        if (!hashMap.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : hashMap.entrySet()) {
                sb.append(C392429un.A00(((Number) entry.getKey()).intValue()));
                sb.append("(");
                sb.append(entry.getValue());
                sb.append(");");
            }
            C382299dT r5 = new C382299dT("Failures during input capture");
            r5.A00("input_capture_error_codes", sb.toString());
            r5.A00("input_capture_total_frames", String.valueOf(j));
            C344037rD r4 = r2.A0L;
            long hashCode = (long) r2.hashCode();
            Map map = r5.A00;
            if (map != null) {
                str = (String) map.get("fba_error_code");
            } else {
                str = null;
            }
            r4.ChC(r5, "audio_pipeline_error", "AudioPipelineController", "debug", "InputCaptureErrors", str, hashCode);
        }
    }

    public final void A01(C39897ADz aDz, boolean z) {
        int i;
        C341427mr r2 = this.A00;
        HashMap hashMap = new HashMap(6);
        if (aDz.A06 > 30) {
            hashMap.put(Pxd.A00(861), String.valueOf(aDz.A01()));
            long j = aDz.A01;
            if (j > -1) {
                hashMap.put(Pxd.A00(862), String.valueOf(j));
            }
            hashMap.put("render_audio_was_recording", String.valueOf(aDz.A0A));
            hashMap.put("render_audio_frame_size_ms", String.valueOf(Math.round(((float) aDz.A0C) / 1000000.0f)));
            hashMap.put("render_audio_num_frames", String.valueOf(aDz.A06));
            hashMap.put("render_audio_samples_per_frame", String.valueOf(aDz.A0B));
            hashMap.put("render_fba_profile_info", aDz.A08);
            C344037rD r1 = r2.A0L;
            if (z) {
                i = 646;
            } else {
                i = 645;
            }
            r1.ChD((long) r2.hashCode(), Pxd.A00(i), "AudioPipelineController", hashMap);
        }
    }
}
