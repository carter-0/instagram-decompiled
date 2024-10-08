package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.93c  reason: invalid class name and case insensitive filesystem */
public final class C3728993c {
    public static final C3728993c A00 = new Object();

    public static final Map A00(0lg r8) {
        boolean z;
        Context context = C60960kU.A00;
        0qQ.A07(context);
        1Cn r5 = new 1Cn(context);
        0Ym r4 = new 0Ym();
        long nanoTime = System.nanoTime();
        long j = AnonymousClass49C.A00;
        long j2 = nanoTime - j;
        1Cn.A00(r5);
        r4.put("battery_level", Integer.valueOf(r5.A00));
        r4.put("is_charging", Boolean.valueOf(r5.A06()));
        r4.put("screen_brightness", Integer.valueOf(r5.A01()));
        r4.put("on_wifi", Boolean.valueOf(r5.A07(true)));
        r4.put("thermal_status", Integer.valueOf(r5.A02()));
        PowerManager powerManager = (PowerManager) r5.A09.getValue();
        if (powerManager != null) {
            z = powerManager.isPowerSaveMode();
        } else {
            z = false;
        }
        r4.put("is_powersave", Boolean.valueOf(z));
        AnonymousClass49C r52 = AnonymousClass49C.A01;
        AnonymousClass30M.A07(r52.A00(j2));
        r4.put("hw_av1_dec", C290525fS.A02.getValue());
        r4.put("hw_vp9_dec", C290525fS.A04.getValue());
        r4.put("hw_avc_dec", C290525fS.A03.getValue());
        r4.put("10bit_hw_av1_dec", C290525fS.A05.getValue());
        r4.put("10bit_hw_vp9_dec", C290525fS.A06.getValue());
        AnonymousClass30M.A07(r52.A00(System.nanoTime() - j));
        r4.put("is_hlg_supported", C290595fZ.A01.getValue());
        AnonymousClass30M.A07(r52.A00(System.nanoTime() - j));
        if (182.A06(0Tu.A05, r8, 36325995871548873L)) {
            r4.put("chip_vendor", C3729193f.A01.getValue());
            r4.put("chip_name", C3729193f.A00.getValue());
            AnonymousClass30M.A07(r52.A00(System.nanoTime() - j));
            r4.put("mips_sum", Float.valueOf(((Number) C3729193f.A06.getValue()).floatValue()));
            r4.put("core_count", Integer.valueOf(((Number) C3729193f.A02.getValue()).intValue()));
            AnonymousClass30M.A07(r52.A00(System.nanoTime() - j));
            r4.put("max_ghz_sum", Float.valueOf(((Number) C3729193f.A04.getValue()).floatValue()));
            r4.put("min_ghz_sum", Float.valueOf(((Number) C3729193f.A05.getValue()).floatValue()));
            AnonymousClass30M.A07(r52.A00(System.nanoTime() - j));
        }
        return 0se.A0N(r4);
    }

    public final JSONObject A01(0lg r5) {
        Map map;
        if (182.A06(0Tu.A05, r5, 36325995871417800L)) {
            synchronized (C3729093d.A00) {
                if (!C3729093d.A02) {
                    C3729093d.A02 = true;
                    HandlerThread handlerThread = new HandlerThread("DeviceStatusCache", 19);
                    AnonymousClass0fe.A00(handlerThread);
                    handlerThread.start();
                    Handler handler = new Handler(handlerThread.getLooper());
                    handler.post(new AnonymousClass93e(handler, r5));
                }
                map = C3729093d.A01;
            }
        } else {
            map = A00(r5);
        }
        return new JSONObject(map);
    }
}
