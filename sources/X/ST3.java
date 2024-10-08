package X;

import android.net.NetworkInfo;
import android.os.SystemClock;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public final class ST3 {
    public static final EnumSet A0c = EnumSet.of(C8908RFb.ACKNOWLEDGED_DELIVERY, new C8908RFb[]{C8908RFb.PROCESSING_LASTACTIVE_PRESENCEINFO, C8908RFb.EXACT_KEEPALIVE, C8908RFb.DELTA_SENT_MESSAGE_ENABLED, C8908RFb.USE_THRIFT_FOR_INBOX, C8908RFb.USE_ENUM_TOPIC});
    public static final HashSet A0d = Pxf.A0s(new String[]{"/t_rtc", RealtimeConstants.MQTT_TOPIC_RTC_MULTI});
    public static final AtomicInteger A0e = new AtomicInteger(1);
    public int A00;
    public List A01;
    public final C9554Rcr A02;
    public final AnonymousClass3RQ A03;
    public final RealtimeSinceBootClock A04;
    public final C13575Td0 A05;
    public final C13575Td0 A06;
    public final SBV A07;
    public final S3C A08;
    public final SRZ A09;
    public final C11267SIe A0A;
    public final ST2 A0B;
    public final SJJ A0C;
    public final C13803ThS A0D;
    public final SRA A0E;
    public final S5H A0F;
    public final C10859RzK A0G;
    public final Long A0H;
    public final Map A0I = AnonymousClass7TE.A1E();
    public final ExecutorService A0J;
    public final AtomicInteger A0K;
    public final boolean A0L;
    public final C10233Rot A0M;
    public final Rd1 A0N;
    public final Rd2 A0O;
    public volatile long A0P;
    public volatile long A0Q = Long.MAX_VALUE;
    public volatile long A0R = Long.MAX_VALUE;
    public volatile long A0S = Long.MAX_VALUE;
    public volatile long A0T = Long.MAX_VALUE;
    public volatile long A0U = Long.MAX_VALUE;
    public volatile long A0V;
    public volatile NetworkInfo A0W;
    public volatile C10416Rrs A0X;
    public volatile Integer A0Y = AnonymousClass05K.A0N;
    public volatile String A0Z;
    public volatile String A0a = NetInfoModule.CONNECTION_TYPE_NONE;
    public volatile Map A0b;

    public static void A02(ST3 st3) {
        long j = (long) (st3.A0G.A03 * IgNetworkConsentStorage.MAX_ENTRIES);
        synchronized (st3) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            while (true) {
                Integer num = st3.A0Y;
                if (num != AnonymousClass05K.A00 && num != AnonymousClass05K.A01) {
                    break;
                }
                long A0C2 = j - Pxe.A0C(elapsedRealtime);
                if (A0C2 <= 0) {
                    break;
                }
                st3.wait(A0C2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02a8, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0048, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r1.hasNext() == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        throw X.AnonymousClass7TE.A11("onMqttNetworkDisconnect");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005e, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005f, code lost:
        r3.A00.A02.set(android.os.SystemClock.elapsedRealtime());
        ((java.util.concurrent.atomic.AtomicLong) ((X.C12249Sq3) r3.A05(X.C7865Qbp.class)).A01(X.RJ2.MqttTotalDurationMs)).addAndGet(android.os.SystemClock.elapsedRealtime() - r8.A0V);
        r9 = r8.A09;
        r21 = r8.A00(r8.A0Q);
        r20 = r8.A00(r8.A0U);
        r19 = r8.A00(r8.A0T);
        r11 = r8.A00(r8.A0S);
        r4 = r7.toString();
        r4.getClass();
        r3 = r26.toString();
        r3.getClass();
        r6 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ae, code lost:
        if (r28 != null) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b0, code lost:
        r2 = X.C7860Qbk.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b2, code lost:
        r24 = r8.A0V;
        r16 = r8.A0C.A06.get();
        r23 = r8.A0W;
        r0 = r8.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c4, code lost:
        if (r0 != null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c6, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c8, code lost:
        r10 = X.AnonymousClass7TE.A1E();
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00da, code lost:
        if (android.provider.Settings.Global.getInt(r9.A00.getContentResolver(), "airplane_mode_on", 0) != 0) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00dc, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00dd, code lost:
        r10.put("is_airplane_mode_on", java.lang.String.valueOf(r13));
        r1 = r9.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e9, code lost:
        r18 = X.AnonymousClass7TE.A1a(r0.get());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f2, code lost:
        r2 = new X.C7861Qbl(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r15 = X.0DH.A00((android.content.BroadcastReceiver) null, r1.A00, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0106, code lost:
        if (r15 != null) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0108, code lost:
        r12 = X.C7860Qbk.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010b, code lost:
        r1 = r15.getIntExtra(com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, -1);
        r13 = true;
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0117, code lost:
        if (r1 == 2) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0119, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011b, code lost:
        if (r1 != 5) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011e, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011f, code lost:
        r1 = r15.getIntExtra("level", -1);
        r0 = r15.getIntExtra("scale", -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012c, code lost:
        if (r1 == -1) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012e, code lost:
        if (r0 == -1) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0130, code lost:
        r12 = new X.C7861Qbl(new X.C10557RuB(X.C7861Qbl.A00(java.lang.Integer.valueOf((int) ((((float) r1) / ((float) r0)) * 100.0f))), r12, r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014a, code lost:
        r12 = new X.C7861Qbl(new X.C10557RuB(X.C7860Qbk.A00, r12, r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0157, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x015e, code lost:
        if ((r1.getCause() instanceof android.os.DeadSystemException) != false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0160, code lost:
        r12 = X.C7860Qbk.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0163, code lost:
        r12 = X.C7860Qbk.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        r3 = r8.A0B;
        r4 = X.C7862Qbm.class;
        r2 = X.RJ1.A08;
        ((X.C12249Sq3) r3.A05(r4)).A03(r2, r7.name());
        r1 = r3.A01;
        ((X.C12249Sq3) r3.A05(r4)).A01(r2).toString();
        r2 = r1.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.ST3 r25, X.C8889REg r26, X.C8947RGw r27, java.lang.Throwable r28) {
        /*
            java.lang.String r2 = "MqttClient"
            java.lang.String r1 = "connection/disconnecting; reason=%s, operation=%s"
            r22 = 2
            r7 = r27
            r0 = r26
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r0}
            X.0KC.A0P(r2, r1, r0)
            r8 = r25
            monitor-enter(r8)
            boolean r0 = r8.A04()     // Catch:{ all -> 0x02a6 }
            if (r0 != 0) goto L_0x001c
            monitor-exit(r8)     // Catch:{ all -> 0x02a6 }
            return
        L_0x001c:
            X.Rrs r5 = r8.A0X     // Catch:{ all -> 0x02a6 }
            X.SRA r0 = r8.A0E     // Catch:{ all -> 0x02a6 }
            r0.A03()     // Catch:{ all -> 0x02a6 }
            monitor-exit(r8)     // Catch:{ all -> 0x02a6 }
            X.ST2 r3 = r8.A0B
            java.lang.Class<X.Qbm> r4 = X.C7862Qbm.class
            X.TaT r1 = r3.A05(r4)
            X.Sq3 r1 = (X.C12249Sq3) r1
            X.RJ1 r2 = X.RJ1.A08
            java.lang.String r0 = r7.name()
            r1.A03(r2, r0)
            X.RqX r1 = r3.A01
            X.TaT r0 = r3.A05(r4)
            X.Sq3 r0 = (X.C12249Sq3) r0
            java.lang.Object r0 = r0.A01(r2)
            r0.toString()
            java.util.List r2 = r1.A00
            monitor-enter(r2)
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x02a3 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x005e
            r1.next()     // Catch:{ all -> 0x02a3 }
            java.lang.String r0 = "onMqttNetworkDisconnect"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)     // Catch:{ all -> 0x02a3 }
            throw r0     // Catch:{ all -> 0x02a3 }
        L_0x005e:
            monitor-exit(r2)
            X.S3D r0 = r3.A00
            java.util.concurrent.atomic.AtomicLong r2 = r0.A02
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.set(r0)
            java.lang.Class<X.Qbp> r0 = X.C7865Qbp.class
            X.TaT r1 = r3.A05(r0)
            X.Sq3 r1 = (X.C12249Sq3) r1
            X.RJ2 r0 = X.RJ2.MqttTotalDurationMs
            java.lang.Object r4 = r1.A01(r0)
            java.util.concurrent.atomic.AtomicLong r4 = (java.util.concurrent.atomic.AtomicLong) r4
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r8.A0V
            long r2 = r2 - r0
            r4.addAndGet(r2)
            X.SRZ r9 = r8.A09
            long r0 = r8.A0Q
            X.T9D r21 = r8.A00(r0)
            long r0 = r8.A0U
            X.T9D r20 = r8.A00(r0)
            long r0 = r8.A0T
            X.T9D r19 = r8.A00(r0)
            long r0 = r8.A0S
            X.T9D r11 = r8.A00(r0)
            java.lang.String r4 = r7.toString()
            r4.getClass()
            java.lang.String r3 = r26.toString()
            r3.getClass()
            r6 = r28
            if (r28 != 0) goto L_0x00f2
            X.Qbk r2 = X.C7860Qbk.A00
        L_0x00b2:
            long r0 = r8.A0V
            r24 = r0
            X.SJJ r0 = r8.A0C
            java.util.concurrent.atomic.AtomicLong r0 = r0.A06
            long r16 = r0.get()
            android.net.NetworkInfo r0 = r8.A0W
            r23 = r0
            X.Td0 r0 = r8.A05
            if (r0 != 0) goto L_0x00e9
            r18 = 0
        L_0x00c8:
            java.util.HashMap r10 = X.AnonymousClass7TE.A1E()
            android.content.Context r0 = r9.A00
            r13 = 1
            java.lang.String r12 = "airplane_mode_on"
            r1 = 0
            android.content.ContentResolver r0 = r0.getContentResolver()
            int r0 = android.provider.Settings.Global.getInt(r0, r12, r1)
            if (r0 != 0) goto L_0x00dd
            r13 = 0
        L_0x00dd:
            java.lang.String r1 = java.lang.String.valueOf(r13)
            java.lang.String r0 = "is_airplane_mode_on"
            r10.put(r0, r1)
            X.Roo r1 = r9.A02
            goto L_0x00f8
        L_0x00e9:
            java.lang.Object r0 = r0.get()
            boolean r18 = X.AnonymousClass7TE.A1a(r0)
            goto L_0x00c8
        L_0x00f2:
            X.Qbl r2 = new X.Qbl
            r2.<init>(r6)
            goto L_0x00b2
        L_0x00f8:
            java.lang.String r0 = "android.intent.action.BATTERY_CHANGED"
            android.content.IntentFilter r12 = new android.content.IntentFilter     // Catch:{ IllegalArgumentException | SecurityException -> 0x0163, RuntimeException -> 0x0157 }
            r12.<init>(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0163, RuntimeException -> 0x0157 }
            android.content.Context r1 = r1.A00     // Catch:{ IllegalArgumentException | SecurityException -> 0x0163, RuntimeException -> 0x0157 }
            r0 = 0
            android.content.Intent r15 = X.0DH.A00(r0, r1, r12)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0163, RuntimeException -> 0x0157 }
            if (r15 != 0) goto L_0x010b
            X.Qbk r12 = X.C7860Qbk.A00     // Catch:{ IllegalArgumentException | SecurityException -> 0x0163, RuntimeException -> 0x0157 }
            goto L_0x0165
        L_0x010b:
            java.lang.String r0 = "status"
            r14 = -1
            int r1 = r15.getIntExtra(r0, r14)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0163, RuntimeException -> 0x0157 }
            r13 = 1
            r12 = 1
            r0 = r22
            if (r1 == r0) goto L_0x011e
            r12 = 0
            r0 = 5
            if (r1 != r0) goto L_0x011e
            goto L_0x011f
        L_0x011e:
            r13 = 0
        L_0x011f:
            java.lang.String r0 = "level"
            int r1 = r15.getIntExtra(r0, r14)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0163, RuntimeException -> 0x0157 }
            java.lang.String r0 = "scale"
            int r0 = r15.getIntExtra(r0, r14)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0163, RuntimeException -> 0x0157 }
            if (r1 == r14) goto L_0x014a
            if (r0 == r14) goto L_0x014a
            float r1 = (float) r1     // Catch:{ IllegalArgumentException | SecurityException -> 0x0163, RuntimeException -> 0x0157 }
            float r0 = (float) r0     // Catch:{ IllegalArgumentException | SecurityException -> 0x0163, RuntimeException -> 0x0157 }
            float r1 = r1 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            int r0 = (int) r1     // Catch:{ IllegalArgumentException | SecurityException -> 0x0163, RuntimeException -> 0x0157 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0163, RuntimeException -> 0x0157 }
            X.Qbl r1 = X.C7861Qbl.A00(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0163, RuntimeException -> 0x0157 }
            X.RuB r0 = new X.RuB     // Catch:{ IllegalArgumentException | SecurityException -> 0x0163, RuntimeException -> 0x0157 }
            r0.<init>(r1, r12, r13)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0163, RuntimeException -> 0x0157 }
            X.Qbl r12 = new X.Qbl     // Catch:{ IllegalArgumentException | SecurityException -> 0x0163, RuntimeException -> 0x0157 }
            r12.<init>(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0163, RuntimeException -> 0x0157 }
            goto L_0x0165
        L_0x014a:
            X.Qbk r1 = X.C7860Qbk.A00     // Catch:{ IllegalArgumentException | SecurityException -> 0x0163, RuntimeException -> 0x0157 }
            X.RuB r0 = new X.RuB     // Catch:{ IllegalArgumentException | SecurityException -> 0x0163, RuntimeException -> 0x0157 }
            r0.<init>(r1, r12, r13)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0163, RuntimeException -> 0x0157 }
            X.Qbl r12 = new X.Qbl     // Catch:{ IllegalArgumentException | SecurityException -> 0x0163, RuntimeException -> 0x0157 }
            r12.<init>(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0163, RuntimeException -> 0x0157 }
            goto L_0x0165
        L_0x0157:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.DeadSystemException
            if (r0 == 0) goto L_0x02a8
            X.Qbk r12 = X.C7860Qbk.A00
            goto L_0x0165
        L_0x0163:
            X.Qbk r12 = X.C7860Qbk.A00
        L_0x0165:
            boolean r0 = r12 instanceof X.C7860Qbk
            if (r0 != 0) goto L_0x019e
            java.lang.Object r0 = r12.A01()
            X.RuB r0 = (X.C10557RuB) r0
            boolean r0 = r0.A01
            java.lang.String r1 = "bat"
            if (r0 != 0) goto L_0x029f
            java.lang.Object r0 = r12.A01()
            X.RuB r0 = (X.C10557RuB) r0
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x029f
            java.lang.Object r0 = r12.A01()
            X.RuB r0 = (X.C10557RuB) r0
            X.T9D r0 = r0.A00
            boolean r0 = r0 instanceof X.C7860Qbk
            if (r0 != 0) goto L_0x019e
            java.lang.Object r0 = r12.A01()
            X.RuB r0 = (X.C10557RuB) r0
            X.T9D r0 = r0.A00
            java.lang.Object r0 = r0.A01()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x019b:
            r10.put(r1, r0)
        L_0x019e:
            r0 = r21
            boolean r0 = r0 instanceof X.C7860Qbk
            if (r0 != 0) goto L_0x01b1
            java.lang.Object r0 = r21.A01()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "connected_duration_ms"
            r10.put(r0, r1)
        L_0x01b1:
            r0 = r20
            boolean r0 = r0 instanceof X.C7860Qbk
            if (r0 != 0) goto L_0x01c4
            java.lang.Object r0 = r20.A01()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "last_ping_ms_ago"
            r10.put(r0, r1)
        L_0x01c4:
            r0 = r19
            boolean r0 = r0 instanceof X.C7860Qbk
            if (r0 != 0) goto L_0x01d7
            java.lang.Object r0 = r19.A01()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "last_sent_ms_ago"
            r10.put(r0, r1)
        L_0x01d7:
            boolean r0 = r11 instanceof X.C7860Qbk
            if (r0 != 0) goto L_0x01e8
            java.lang.Object r0 = r11.A01()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "last_received_ms_ago"
            r10.put(r0, r1)
        L_0x01e8:
            java.lang.String r13 = "reason"
            r10.put(r13, r4)
            java.lang.String r12 = "operation"
            r10.put(r12, r3)
            boolean r0 = r2 instanceof X.C7860Qbk
            if (r0 == 0) goto L_0x029c
            r14 = 0
        L_0x01f9:
            java.lang.String r11 = "exception"
            if (r14 == 0) goto L_0x0217
            java.lang.Object r0 = r2.A01()
            java.lang.String r0 = X.C51968G9o.A16(r0)
            r10.put(r11, r0)
            java.lang.Object r0 = r2.A01()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "error_message"
            r10.put(r0, r1)
        L_0x0217:
            java.lang.String r1 = java.lang.String.valueOf(r18)
            java.lang.String r0 = "fs"
            r10.put(r0, r1)
            java.lang.String r1 = java.lang.Long.toString(r24)
            java.lang.String r0 = "mqtt_session_id"
            r10.put(r0, r1)
            r0 = r16
            X.SRZ.A00(r0, r10)
            r0 = r23
            X.SRZ.A01(r0, r9, r10)
            java.lang.String r1 = "mqtt_disconnection_on_failure"
            r9.A06(r1, r10)
            X.TjG r10 = r9.A01
            if (r10 == 0) goto L_0x025e
            java.util.HashMap r4 = X.Dba.A0f(r13, r4)
            r4.put(r12, r3)
            if (r14 == 0) goto L_0x0252
            java.lang.Object r0 = r2.A01()
            java.lang.String r0 = X.C51968G9o.A16(r0)
            r4.put(r11, r0)
        L_0x0252:
            X.SJJ r0 = r9.A03
            android.net.NetworkInfo r0 = r0.A02()
            X.SRZ.A01(r0, r9, r4)
            r10.Cgl(r1, r4)
        L_0x025e:
            if (r5 == 0) goto L_0x028c
            X.ST9 r2 = r5.A01
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A0t = r0
            r0 = r26
            android.util.Pair r0 = X.Pxe.A0K(r7, r0)
            r2.A0u = r0
            android.os.Handler r1 = r2.A05
            X.TCZ r0 = new X.TCZ
            r0.<init>(r5)
            r1.post(r0)
            X.RGw r0 = X.C8947RGw.READ_FAILURE_UNCLASSIFIED
            if (r7 == r0) goto L_0x0282
            X.RGw r0 = X.C8947RGw.WRITE_FAILURE_UNCLASSIFIED
            if (r7 != r0) goto L_0x028c
        L_0x0282:
            android.os.Handler r1 = r2.A05
            X.TGK r0 = new X.TGK
            r0.<init>(r5, r6)
            r1.post(r0)
        L_0x028c:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8.A0Q = r0
            r8.A0U = r0
            r8.A0T = r0
            r8.A0S = r0
            r8.A0R = r0
            return
        L_0x029c:
            r14 = 1
            goto L_0x01f9
        L_0x029f:
            java.lang.String r0 = "crg"
            goto L_0x019b
        L_0x02a3:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x02a6:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x02a6 }
        L_0x02a8:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ST3.A03(X.ST3, X.REg, X.RGw, java.lang.Throwable):void");
    }

    public final boolean A04() {
        Integer num = this.A0Y;
        if (num == AnonymousClass05K.A0C || num == AnonymousClass05K.A00 || num == AnonymousClass05K.A01) {
            return true;
        }
        return false;
    }

    private T9D A00(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j > elapsedRealtime) {
            return C7860Qbk.A00;
        }
        return C7861Qbl.A00(Long.valueOf(elapsedRealtime - j));
    }

    public static String A01(ST3 st3, long j) {
        T9D A002 = st3.A00(j);
        if (A002 instanceof C7860Qbk) {
            return "N/A";
        }
        return new Date(System.currentTimeMillis() - AnonymousClass7TE.A0R(A002.A01())).toString();
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("[MqttClient (");
        C10859RzK rzK = this.A0G;
        A1A.append(rzK.A00);
        A1A.append(":");
        A1A.append(this.A00);
        if (rzK.A0N) {
            A1A.append(" +ssl");
        }
        A1A.append(") ");
        Integer num = this.A0Y;
        if (num != null) {
            str = C9561Rcy.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        return AnonymousClass7TF.A0l("]", A1A);
    }

    public ST3(C9554Rcr rcr, AnonymousClass3RQ r8, RealtimeSinceBootClock realtimeSinceBootClock, C13575Td0 td0, C13575Td0 td02, SBV sbv, S3C s3c, SRZ srz, C11267SIe sIe, ST2 st2, SJJ sjj, C13803ThS thS, SRA sra, Rd1 rd1, C10859RzK rzK, Rd2 rd2, Long l, ExecutorService executorService) {
        String str;
        C10233Rot rot = new C10233Rot(this);
        this.A0M = rot;
        S5H s5h = new S5H(this);
        this.A0F = s5h;
        boolean z = false;
        this.A0K = new AtomicInteger(0);
        this.A0C = sjj;
        this.A07 = sbv;
        this.A09 = srz;
        this.A0B = st2;
        C10859RzK rzK2 = rzK;
        this.A0G = rzK2;
        this.A04 = realtimeSinceBootClock;
        this.A0J = executorService;
        this.A0A = sIe;
        this.A02 = rcr;
        this.A0N = rd1;
        this.A0O = rd2;
        C13803ThS thS2 = thS;
        this.A0D = thS2;
        this.A08 = s3c;
        SRA sra2 = sra;
        this.A0E = sra2;
        this.A06 = td0;
        sra2.A0I = s5h;
        sra2.A0H = rot;
        if ("".equals(thS2.Anh()) && (str = rzK2.A0G) != null && "".equals(str)) {
            z = true;
        }
        this.A0L = z;
        this.A05 = td02;
        this.A03 = r8;
        this.A0H = l;
        this.A0b = new C58044Ikc(0);
    }
}
