package X;

import android.util.Log;
import android.util.SparseArray;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.onecamera.components.logging.xlogger.cppimpl.OneCameraXLoggerCpp;
import com.facebook.proxygen.TraceFieldType;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.7rA  reason: invalid class name and case insensitive filesystem */
public final class C344007rA extends C344017rB {
    public static final AtomicLong A03 = new AtomicLong(0);
    public final SparseArray A00;
    public final 0J6 A01;
    public final C344087rI A02;

    public static boolean A01(C344007rA r7, Throwable th) {
        if (th == null) {
            return false;
        }
        int hashCode = th.toString().hashCode();
        long currentTimeMillis = System.currentTimeMillis();
        SparseArray sparseArray = r7.A00;
        Number number = (Number) sparseArray.get(hashCode, 0L);
        number.getClass();
        sparseArray.put(hashCode, Long.valueOf(currentTimeMillis));
        return currentTimeMillis - number.longValue() <= 300;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C344007rA(X.C343837qt r6, X.C343997r9 r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            if (r8 == 0) goto L_0x002d
            X.7rE r0 = new X.7rE
            r0.<init>()
        L_0x0007:
            X.7rI r4 = new X.7rI
            r4.<init>(r7)
            r5.<init>(r6, r7, r0)
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r5.A00 = r0
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            com.facebook.common.time.AwakeTimeSinceBootClock r2 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE
            X.7rS r1 = new X.7rS
            r1.<init>(r5)
            if (r2 == 0) goto L_0x0042
            X.0J6 r0 = new X.0J6
            r0.<init>(r1, r2, r3)
            r5.A01 = r0
            r5.A02 = r4
            X.7qb r0 = X.C344197rT.A00
            goto L_0x0033
        L_0x002d:
            com.facebook.onecamera.components.logging.xlogger.cppimpl.OneCameraXLoggerCpp r0 = new com.facebook.onecamera.components.logging.xlogger.cppimpl.OneCameraXLoggerCpp
            r0.<init>(r9)
            goto L_0x0007
        L_0x0033:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ RuntimeException -> 0x003e }
            java.lang.Object r0 = r6.Apu(r0)     // Catch:{ RuntimeException -> 0x003e }
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x003e }
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            r5.A00 = r0
            return
        L_0x0042:
            java.lang.String r1 = "Must add a clock to the object pool builder"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344007rA.<init>(X.7qt, X.7r9, boolean, boolean):void");
    }

    public static C344657sD A00(C391719tX r7, C344007rA r8, String str, String str2, String str3, String str4, Map map, long j) {
        Map map2;
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        0qQ.A07(awakeTimeSinceBootClock);
        long nowNanos = awakeTimeSinceBootClock.nowNanos();
        String str5 = null;
        C344057rF r5 = r8.A01;
        if (r5.getActiveSessionId() != null) {
            str5 = "pre_capture";
        }
        0bb r4 = new 0bb();
        r4.A06("product_name", r8.A00);
        r4.A06("component_name", str);
        r4.A06("component_instance_id", String.valueOf(j));
        r4.A06("logger_instance_id", r8.A09);
        r4.A04("client_time_ms", Double.valueOf(((double) nowNanos) / 1000000.0d));
        r4.A06("product_session_id", r8.A01);
        C344097rJ r2 = r8.A06;
        r4.A07("effect_ids", r2.A05);
        r4.A06("video_recording_state", r2.A04);
        r4.A06("stage", str5);
        r4.A06("active_session_id", r5.getActiveSessionId());
        r4.A06("custom_session_id", str4);
        if (!(r7 == null || str2 == null || str3 == null)) {
            0bb r22 = new 0bb();
            r22.A05(TraceFieldType.ErrorCode, Long.valueOf((long) r7.A01));
            r22.A06(TraceFieldType.Error, r7.getMessage());
            r22.A06("error_severity", str2);
            r22.A06("error_source", str3);
            r22.A06("error_stacktrace", Log.getStackTraceString(r7));
            r4.A02(r22, "error");
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!(r7 == null || (map2 = r7.A00) == null)) {
            hashMap.putAll(map2);
        }
        hashMap.put("event_counter", String.valueOf(A03.getAndIncrement()));
        r4.A08("extra_data", hashMap);
        return r4;
    }

    public final Map A7G() {
        return (Map) this.A01.A01();
    }

    public final void ECg(Map map) {
        this.A01.A02(map);
    }

    @Deprecated
    public C344007rA(C343997r9 r5, String str, String str2) {
        super(r5, new OneCameraXLoggerCpp(false), str, str2);
        this.A00 = new SparseArray();
        Class<Map> cls = Map.class;
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C344187rS r1 = new C344187rS(this);
        if (awakeTimeSinceBootClock != null) {
            this.A01 = new 0J6(r1, awakeTimeSinceBootClock, cls);
            this.A02 = new C344087rI(r5);
            return;
        }
        throw new IllegalArgumentException("Must add a clock to the object pool builder");
    }
}
