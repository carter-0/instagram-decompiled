package X;

import android.media.AudioManager;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.7mv  reason: invalid class name and case insensitive filesystem */
public final class C341457mv {
    public long A00;
    public long A01;
    public Integer A02 = null;
    public Integer A03 = null;
    public boolean A04;
    public final C341467mw A05 = new C341467mw();

    public static HashMap A00(AudioManager audioManager, C341457mv r10, C3730593v r11) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap(6);
        if (r11 != null) {
            hashMap.put("AP_Hash", String.valueOf(r11.hashCode()));
        }
        Integer num = r10.A03;
        if (num != null) {
            hashMap.put("AP_AudioMixModeRec", String.format((Locale) null, "%d_%d_ms", new Object[]{num, Long.valueOf(elapsedRealtime - r10.A01)}));
        }
        Integer num2 = r10.A02;
        if (num2 != null) {
            hashMap.put("AP_AudioDeviceChanged", String.format((Locale) null, "%d_%d_%d_ms", new Object[]{Integer.valueOf(r10.A04 ? 1 : 0), num2, Long.valueOf(elapsedRealtime - r10.A00)}));
        }
        String property = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property != null) {
            hashMap.put("AP_OutputFramesPerBuffer", property);
        }
        String property2 = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property2 != null) {
            hashMap.put("AP_OutputSampleRate", property2);
        }
        hashMap.put("AP_AMMode", String.valueOf(audioManager.getMode()));
        if (r11 != null) {
            String debugInfo = r11.getDebugInfo();
            if (!debugInfo.isEmpty()) {
                hashMap.put("AP_FBADebugInfo", debugInfo);
            }
            String snapshot = r11.snapshot();
            if (snapshot != null) {
                hashMap.put("AP_FBACalls", snapshot);
            }
        }
        String A002 = r10.A05.A00();
        if (A002 != null) {
            hashMap.put("AP_CallsSinceSnapshot", A002);
        }
        return hashMap;
    }
}
