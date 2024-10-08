package X;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* renamed from: X.43W  reason: invalid class name */
public final class AnonymousClass43W extends Handler {
    public final WeakReference A00;
    public final /* synthetic */ 1bO A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass43W(Looper looper, AnonymousClass43N r3, 1bO r4) {
        super(looper);
        this.A01 = r4;
        this.A00 = new WeakReference(r3);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0363, code lost:
        r1.A00 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r24) {
        /*
            r23 = this;
            r9 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r9)
            r3 = r24
            if (r0 == 0) goto L_0x003b
            java.lang.String r2 = "IrisSyncManager.handleMessage."
            int r1 = r3.what
            java.nio.charset.Charset r0 = X.1bO.A0w
            switch(r1) {
                case 1: goto L_0x0020;
                case 2: goto L_0x0013;
                case 3: goto L_0x0023;
                case 4: goto L_0x0026;
                case 5: goto L_0x0029;
                case 6: goto L_0x0013;
                case 7: goto L_0x002c;
                case 8: goto L_0x002f;
                case 9: goto L_0x0032;
                case 10: goto L_0x0035;
                case 11: goto L_0x0038;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.lang.String r0 = "UNKNOWN"
        L_0x0015:
            java.lang.String r1 = X.002.A0R(r2, r0)
            r0 = 2020223535(0x786a2a2f, float:1.8997704E34)
            X.0fS.A01(r1, r0)
            goto L_0x003b
        L_0x0020:
            java.lang.String r0 = "STORE_LOADED"
            goto L_0x0015
        L_0x0023:
            java.lang.String r0 = "MQTT_CHANNEL_STATE_CHANGED"
            goto L_0x0015
        L_0x0026:
            java.lang.String r0 = "SUBSCRIBE_RESPONSE_MESSAGE"
            goto L_0x0015
        L_0x0029:
            java.lang.String r0 = "SUBSCRIBE_REQUEST_TIMEOUT"
            goto L_0x0015
        L_0x002c:
            java.lang.String r0 = "CONNECTIVITY_STATE_CHANGED"
            goto L_0x0015
        L_0x002f:
            java.lang.String r0 = "SNAPSHOT_REQUEST"
            goto L_0x0015
        L_0x0032:
            java.lang.String r0 = "SNAPSHOT_REQUEST_CANCELED"
            goto L_0x0015
        L_0x0035:
            java.lang.String r0 = "DEFERRED_INITIALIZATION"
            goto L_0x0015
        L_0x0038:
            java.lang.String r0 = "WHAT_SESSION_LOADED"
            goto L_0x0015
        L_0x003b:
            int r0 = r3.what     // Catch:{ all -> 0x03ab }
            r5 = r23
            switch(r0) {
                case 1: goto L_0x0056;
                case 2: goto L_0x0042;
                case 3: goto L_0x0068;
                case 4: goto L_0x008b;
                case 5: goto L_0x0316;
                case 6: goto L_0x0042;
                case 7: goto L_0x034a;
                case 8: goto L_0x0367;
                case 9: goto L_0x0376;
                case 10: goto L_0x0384;
                case 11: goto L_0x0397;
                default: goto L_0x0042;
            }     // Catch:{ all -> 0x03ab }
        L_0x0042:
            X.1bO r0 = r5.A01     // Catch:{ all -> 0x03ab }
            X.1bO.A04(r0)     // Catch:{ all -> 0x03ab }
            java.lang.ref.WeakReference r0 = r5.A00     // Catch:{ all -> 0x03ab }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x03ab }
            X.43N r0 = (X.AnonymousClass43N) r0     // Catch:{ all -> 0x03ab }
            if (r0 == 0) goto L_0x039e
            r0.A08()     // Catch:{ all -> 0x03ab }
            goto L_0x039e
        L_0x0056:
            X.1bO r1 = r5.A01     // Catch:{ all -> 0x03ab }
            java.nio.charset.Charset r0 = X.1bO.A0w     // Catch:{ all -> 0x03ab }
            boolean r0 = r1.A0D     // Catch:{ all -> 0x03ab }
            if (r0 != 0) goto L_0x0042
            r0 = 1
            r1.A0D = r0     // Catch:{ all -> 0x03ab }
            X.1bO.A05(r1)     // Catch:{ all -> 0x03ab }
            X.1bO.A03(r1)     // Catch:{ all -> 0x03ab }
            goto L_0x0042
        L_0x0068:
            X.1bO r4 = r5.A01     // Catch:{ all -> 0x03ab }
            java.lang.Object r1 = r3.obj     // Catch:{ all -> 0x03ab }
            r1.getClass()     // Catch:{ all -> 0x03ab }
            X.46J r1 = (X.AnonymousClass46J) r1     // Catch:{ all -> 0x03ab }
            java.nio.charset.Charset r0 = X.1bO.A0w     // Catch:{ all -> 0x03ab }
            java.lang.Integer r1 = r1.A00     // Catch:{ all -> 0x03ab }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x03ab }
            if (r1 != r0) goto L_0x0080
            X.433 r1 = r4.A0S     // Catch:{ all -> 0x03ab }
            r0 = 0
            r1.A01 = r0     // Catch:{ all -> 0x03ab }
            goto L_0x0363
        L_0x0080:
            r3 = 0
            r2 = 0
            r0 = -1
            X.1bO.A06(r4, r2, r0, r3)     // Catch:{ all -> 0x03ab }
            X.1bO.A02(r4)     // Catch:{ all -> 0x03ab }
            goto L_0x0042
        L_0x008b:
            X.1bO r4 = r5.A01     // Catch:{ all -> 0x03ab }
            java.lang.Object r2 = r3.obj     // Catch:{ all -> 0x03ab }
            r2.getClass()     // Catch:{ all -> 0x03ab }
            X.5gV r2 = (X.C291085gV) r2     // Catch:{ all -> 0x03ab }
            X.1bO.A02(r4)     // Catch:{ all -> 0x03ab }
            boolean r0 = r2.A05     // Catch:{ all -> 0x03ab }
            r3 = 1
            java.lang.String r7 = "IrisSyncManager"
            if (r0 == 0) goto L_0x01d7
            X.433 r0 = r4.A0S     // Catch:{ all -> 0x03ab }
            r8 = 0
            r0.A01 = r8     // Catch:{ all -> 0x03ab }
            r0.A00 = r8     // Catch:{ all -> 0x03ab }
            long r6 = r2.A02     // Catch:{ all -> 0x03ab }
            long r0 = r4.A01     // Catch:{ all -> 0x03ab }
            int r11 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r11 != 0) goto L_0x0143
            long r0 = r2.A03     // Catch:{ all -> 0x03ab }
            java.lang.Long r6 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x03ab }
            long r0 = r2.A01     // Catch:{ all -> 0x03ab }
            X.1bO.A06(r4, r6, r0, r3)     // Catch:{ all -> 0x03ab }
            long r15 = r2.A02     // Catch:{ all -> 0x03ab }
            long r0 = r2.A01     // Catch:{ all -> 0x03ab }
            X.9IV r2 = r4.A0L     // Catch:{ all -> 0x03ab }
            java.lang.Integer r6 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x03ab }
            r2.A01 = r6     // Catch:{ all -> 0x03ab }
            X.AnonymousClass43Z.A03 = r6     // Catch:{ all -> 0x03ab }
            X.AnonymousClass43Z.A00 = r0     // Catch:{ all -> 0x03ab }
            X.AnonymousClass43Z.A01 = r15     // Catch:{ all -> 0x03ab }
            X.5gP r3 = new X.5gP     // Catch:{ all -> 0x03ab }
            r3.<init>(r6)     // Catch:{ all -> 0x03ab }
            X.0eM r7 = r4.A0a     // Catch:{ all -> 0x03ab }
            java.lang.Object r2 = r7.getValue()     // Catch:{ all -> 0x03ab }
            X.1Ng r2 = (X.1Ng) r2     // Catch:{ all -> 0x03ab }
            r2.A00(r3)     // Catch:{ all -> 0x03ab }
            X.5gQ r3 = new X.5gQ     // Catch:{ all -> 0x03ab }
            r17 = r3
            r18 = r15
            r20 = r0
            r22 = r6
            r17.<init>(r18, r20, r22)     // Catch:{ all -> 0x03ab }
            java.lang.Object r2 = r7.getValue()     // Catch:{ all -> 0x03ab }
            X.1Ng r2 = (X.1Ng) r2     // Catch:{ all -> 0x03ab }
            r2.A05(r3)     // Catch:{ all -> 0x03ab }
            X.0eM r2 = r4.A0g     // Catch:{ all -> 0x03ab }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x03ab }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x03ab }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x03ab }
            if (r2 == 0) goto L_0x01ad
            r4.A03 = r0     // Catch:{ all -> 0x03ab }
            long r0 = r4.A02     // Catch:{ all -> 0x03ab }
            r2 = -1
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x01ad
            X.0eM r0 = r4.A0b     // Catch:{ all -> 0x03ab }
            r0.getValue()     // Catch:{ all -> 0x03ab }
            long r19 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x03ab }
            long r0 = r4.A02     // Catch:{ all -> 0x03ab }
            long r13 = r19 - r0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x03ab }
            X.0eM r0 = r4.A0c     // Catch:{ all -> 0x03ab }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x03ab }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x03ab }
            long r0 = r0.longValue()     // Catch:{ all -> 0x03ab }
            long r11 = r8.toMillis(r0)     // Catch:{ all -> 0x03ab }
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x01ab
            long r0 = r4.A03     // Catch:{ all -> 0x03ab }
            long r0 = r0 - r15
            X.0eM r8 = r4.A0Y     // Catch:{ all -> 0x03ab }
            java.lang.Object r8 = r8.getValue()     // Catch:{ all -> 0x03ab }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x03ab }
            long r11 = r8.longValue()     // Catch:{ all -> 0x03ab }
            int r8 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            r0 = 0
            if (r8 <= 0) goto L_0x013e
            r0 = 1
        L_0x013e:
            r4.A0A = r0     // Catch:{ all -> 0x03ab }
            if (r0 != 0) goto L_0x0183
            goto L_0x0181
        L_0x0143:
            long r0 = r4.A04     // Catch:{ all -> 0x03ab }
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x01ad
            X.0eM r0 = r4.A0Z     // Catch:{ all -> 0x03ab }
            java.lang.Object r3 = r0.getValue()     // Catch:{ all -> 0x03ab }
            X.1Zn r3 = (X.1Zn) r3     // Catch:{ all -> 0x03ab }
            java.lang.Integer r1 = X.AnonymousClass05K.A03     // Catch:{ all -> 0x03ab }
            r0 = 817891655(0x30c00947, float:1.3972475E-9)
            X.1Zp r3 = r3.A00(r1, r0, r8, r8)     // Catch:{ all -> 0x03ab }
            java.lang.String r11 = "Unexpected subscription response: seqId="
            long r13 = r2.A02     // Catch:{ all -> 0x03ab }
            java.lang.String r12 = " expected="
            long r0 = r4.A04     // Catch:{ all -> 0x03ab }
            r15 = r0
            java.lang.String r1 = X.002.A0f(r11, r12, r13, r15)     // Catch:{ all -> 0x03ab }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x03ab }
            r0.<init>(r1)     // Catch:{ all -> 0x03ab }
            r3.A05(r0)     // Catch:{ all -> 0x03ab }
            long r0 = r2.A02     // Catch:{ all -> 0x03ab }
            java.lang.String r2 = "response.seqId"
            r3.A02(r2, r0)     // Catch:{ all -> 0x03ab }
            long r1 = r4.A04     // Catch:{ all -> 0x03ab }
            java.lang.String r0 = "expected.seqId"
            r3.A02(r0, r1)     // Catch:{ all -> 0x03ab }
            r3.A00()     // Catch:{ all -> 0x03ab }
            goto L_0x01ad
        L_0x0181:
            java.lang.Integer r6 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x03ab }
        L_0x0183:
            java.lang.Object r1 = r7.getValue()     // Catch:{ all -> 0x03ab }
            X.1Ng r1 = (X.1Ng) r1     // Catch:{ all -> 0x03ab }
            X.Osm r0 = new X.Osm     // Catch:{ all -> 0x03ab }
            r0.<init>(r6)     // Catch:{ all -> 0x03ab }
            r1.A00(r0)     // Catch:{ all -> 0x03ab }
            com.instagram.common.session.UserSession r13 = r4.A0M     // Catch:{ all -> 0x03ab }
            int r0 = r6.intValue()     // Catch:{ all -> 0x03ab }
            switch(r0) {
                case 0: goto L_0x01d0;
                case 1: goto L_0x01c9;
                default: goto L_0x019a;
            }     // Catch:{ all -> 0x03ab }
        L_0x019a:
            r0 = 2486(0x9b6, float:3.484E-42)
            java.lang.String r14 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x03ab }
        L_0x01a0:
            long r6 = r4.A03     // Catch:{ all -> 0x03ab }
            long r0 = r4.A02     // Catch:{ all -> 0x03ab }
            long r19 = r19 - r0
            r17 = r6
            X.C3265677h.A0p(r13, r14, r15, r17, r19)     // Catch:{ all -> 0x03ab }
        L_0x01ab:
            r4.A02 = r2     // Catch:{ all -> 0x03ab }
        L_0x01ad:
            X.432 r3 = r4.A0O     // Catch:{ all -> 0x03ab }
            X.0wc r2 = r3.A01     // Catch:{ all -> 0x03ab }
            java.lang.String r1 = "ig_direct_iris_subscription"
            X.0kJ r0 = r2.A00     // Catch:{ all -> 0x03ab }
            X.0Aj r2 = r2.A00(r0, r1)     // Catch:{ all -> 0x03ab }
            java.lang.String r1 = "success"
            java.lang.String r0 = "action"
            r2.AAJ(r0, r1)     // Catch:{ all -> 0x03ab }
            r2.Cgf()     // Catch:{ all -> 0x03ab }
            r0 = -1
            r3.A00 = r0     // Catch:{ all -> 0x03ab }
            goto L_0x0042
        L_0x01c9:
            r0 = 2314(0x90a, float:3.243E-42)
            java.lang.String r14 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x03ab }
            goto L_0x01a0
        L_0x01d0:
            r0 = 2247(0x8c7, float:3.149E-42)
            java.lang.String r14 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x03ab }
            goto L_0x01a0
        L_0x01d7:
            r12 = 2
            r6 = 0
            int r0 = r2.A00     // Catch:{ all -> 0x03ab }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03ab }
            java.lang.String r0 = r2.A04     // Catch:{ all -> 0x03ab }
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}     // Catch:{ all -> 0x03ab }
            java.lang.String r0 = "Failed iris subscription %d %s"
            X.0KC.A0P(r7, r0, r1)     // Catch:{ all -> 0x03ab }
            X.432 r13 = r4.A0O     // Catch:{ all -> 0x03ab }
            int r8 = r2.A00     // Catch:{ all -> 0x03ab }
            java.lang.String r7 = r2.A04     // Catch:{ all -> 0x03ab }
            X.0qQ.A0B(r7, r3)     // Catch:{ all -> 0x03ab }
            X.0wc r11 = r13.A01     // Catch:{ all -> 0x03ab }
            java.lang.String r1 = "ig_direct_iris_subscription"
            X.0kJ r0 = r11.A00     // Catch:{ all -> 0x03ab }
            X.0Aj r11 = r11.A00(r0, r1)     // Catch:{ all -> 0x03ab }
            java.lang.String r1 = "error"
            java.lang.String r0 = "action"
            r11.AAJ(r0, r1)     // Catch:{ all -> 0x03ab }
            java.lang.String r1 = "serverside"
            java.lang.String r0 = "error_kind"
            r11.AAJ(r0, r1)     // Catch:{ all -> 0x03ab }
            if (r8 == r3) goto L_0x0218
            if (r8 == r12) goto L_0x0215
            r0 = 3
            if (r8 == r0) goto L_0x021b
            java.lang.String r1 = "unknown"
            goto L_0x021d
        L_0x0215:
            java.lang.String r1 = "retry"
            goto L_0x021d
        L_0x0218:
            java.lang.String r1 = "resnapshot"
            goto L_0x021d
        L_0x021b:
            java.lang.String r1 = "resnapshotTakedown"
        L_0x021d:
            java.lang.String r0 = "error_type"
            r11.AAJ(r0, r1)     // Catch:{ all -> 0x03ab }
            java.lang.Long r1 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x03ab }
            java.lang.String r0 = "error_retryable"
            r11.A9F(r0, r1)     // Catch:{ all -> 0x03ab }
            java.lang.String r0 = "error_message"
            r11.AAJ(r0, r7)     // Catch:{ all -> 0x03ab }
            java.lang.String r0 = "IrisQueueTooLargeException"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x03ab }
            if (r0 == 0) goto L_0x0251
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x03ab }
            long r0 = r13.A00     // Catch:{ all -> 0x03ab }
            r15 = -1
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 == 0) goto L_0x024f
            long r14 = r7 - r0
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x03ab }
            java.lang.String r0 = "time_elapsed_since_last_error_ms"
            r11.A9F(r0, r1)     // Catch:{ all -> 0x03ab }
        L_0x024f:
            r13.A00 = r7     // Catch:{ all -> 0x03ab }
        L_0x0251:
            r11.Cgf()     // Catch:{ all -> 0x03ab }
            int r1 = r2.A00     // Catch:{ all -> 0x03ab }
            if (r1 == r3) goto L_0x030e
            if (r1 == r12) goto L_0x0307
            r0 = 3
            if (r1 == r0) goto L_0x025e
            goto L_0x02cd
        L_0x025e:
            r4.A0B()     // Catch:{ all -> 0x03ab }
            r4.A0A()     // Catch:{ all -> 0x03ab }
            com.instagram.common.session.UserSession r4 = r4.A0M     // Catch:{ all -> 0x03ab }
            boolean r0 = X.2Aj.A02(r4)     // Catch:{ all -> 0x03ab }
            if (r0 == 0) goto L_0x0042
            X.1bc r0 = X.C370748x0.A00()     // Catch:{ all -> 0x03ab }
            r0.A00(r4)     // Catch:{ all -> 0x03ab }
            X.0qQ.A0B(r4, r6)     // Catch:{ all -> 0x03ab }
            X.1NK r7 = X.1NK.A00()     // Catch:{ all -> 0x03ab }
            X.1Nu r0 = r7.A0F     // Catch:{ all -> 0x03ab }
            X.1JI r3 = r0.A00()     // Catch:{ all -> 0x03ab }
            if (r3 == 0) goto L_0x02ba
            boolean r0 = r3 instanceof X.AnonymousClass2jH     // Catch:{ all -> 0x03ab }
            if (r0 == 0) goto L_0x02b5
            r0 = r3
            X.2jH r0 = (X.AnonymousClass2jH) r0     // Catch:{ all -> 0x03ab }
            X.2jB r0 = r0.A00     // Catch:{ all -> 0x03ab }
            java.util.Set r0 = r0.getAllKeys()     // Catch:{ all -> 0x03ab }
        L_0x028f:
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x03ab }
        L_0x0293:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x03ab }
            if (r0 == 0) goto L_0x02ba
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x03ab }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x03ab }
            X.0qQ.A0B(r1, r6)     // Catch:{ IllegalStateException | NoSuchElementException -> 0x0293 }
            java.lang.String r0 = "msys"
            boolean r0 = X.00p.A0k(r1, r0, r6)     // Catch:{ IllegalStateException | NoSuchElementException -> 0x0293 }
            if (r0 == 0) goto L_0x0293
            r3.ED4(r1)     // Catch:{ IllegalStateException | NoSuchElementException -> 0x0293 }
            X.1Mn r0 = r7.A0J     // Catch:{ IllegalStateException | NoSuchElementException -> 0x0293 }
            X.1Ne r0 = r0.A03     // Catch:{ IllegalStateException | NoSuchElementException -> 0x0293 }
            r0.A00(r1)     // Catch:{ IllegalStateException | NoSuchElementException -> 0x0293 }
            goto L_0x0293
        L_0x02b5:
            java.util.HashSet r0 = r3.BKB()     // Catch:{ all -> 0x03ab }
            goto L_0x028f
        L_0x02ba:
            X.OaK r0 = X.OyP.A08     // Catch:{ all -> 0x03ab }
            X.OyP r0 = X.C71042OaK.A01(r4)     // Catch:{ all -> 0x03ab }
            java.io.File r1 = r0.A03     // Catch:{ all -> 0x03ab }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x03ab }
            if (r0 == 0) goto L_0x0042
            X.AnonymousClass5Kg.A07(r1)     // Catch:{ all -> 0x03ab }
            goto L_0x0042
        L_0x02cd:
            X.0eM r0 = r4.A0Z     // Catch:{ all -> 0x03ab }
            java.lang.Object r3 = r0.getValue()     // Catch:{ all -> 0x03ab }
            X.1Zn r3 = (X.1Zn) r3     // Catch:{ all -> 0x03ab }
            java.lang.Integer r1 = X.AnonymousClass05K.A03     // Catch:{ all -> 0x03ab }
            r0 = 817891655(0x30c00947, float:1.3972475E-9)
            X.1Zp r7 = r3.A00(r1, r0, r6, r6)     // Catch:{ all -> 0x03ab }
            java.lang.String r6 = "Unexpected error: errorType="
            int r3 = r2.A00     // Catch:{ all -> 0x03ab }
            r0 = 418(0x1a2, float:5.86E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ all -> 0x03ab }
            java.lang.String r1 = r2.A04     // Catch:{ all -> 0x03ab }
            java.lang.String r1 = X.002.A05(r3, r6, r0, r1)     // Catch:{ all -> 0x03ab }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x03ab }
            r0.<init>(r1)     // Catch:{ all -> 0x03ab }
            r7.A05(r0)     // Catch:{ all -> 0x03ab }
            int r1 = r2.A00     // Catch:{ all -> 0x03ab }
            java.lang.String r0 = "response.errorType"
            r7.A01(r0, r1)     // Catch:{ all -> 0x03ab }
            java.lang.String r1 = r2.A04     // Catch:{ all -> 0x03ab }
            java.lang.String r0 = "response.errorMessage"
            r7.A03(r0, r1)     // Catch:{ all -> 0x03ab }
            r7.A00()     // Catch:{ all -> 0x03ab }
        L_0x0307:
            X.433 r0 = r4.A0S     // Catch:{ all -> 0x03ab }
            r0.A00()     // Catch:{ all -> 0x03ab }
            goto L_0x0042
        L_0x030e:
            r4.A0B()     // Catch:{ all -> 0x03ab }
            r4.A0A()     // Catch:{ all -> 0x03ab }
            goto L_0x0042
        L_0x0316:
            X.1bO r1 = r5.A01     // Catch:{ all -> 0x03ab }
            java.nio.charset.Charset r0 = X.1bO.A0w     // Catch:{ all -> 0x03ab }
            r0 = 0
            r1.A0E = r0     // Catch:{ all -> 0x03ab }
            X.433 r0 = r1.A0S     // Catch:{ all -> 0x03ab }
            r0.A00()     // Catch:{ all -> 0x03ab }
            X.432 r0 = r1.A0O     // Catch:{ all -> 0x03ab }
            X.0wc r2 = r0.A01     // Catch:{ all -> 0x03ab }
            java.lang.String r1 = "ig_direct_iris_subscription"
            X.0kJ r0 = r2.A00     // Catch:{ all -> 0x03ab }
            X.0Aj r2 = r2.A00(r0, r1)     // Catch:{ all -> 0x03ab }
            java.lang.String r1 = "error"
            java.lang.String r0 = "action"
            r2.AAJ(r0, r1)     // Catch:{ all -> 0x03ab }
            java.lang.String r1 = "timeout"
            java.lang.String r0 = "error_kind"
            r2.AAJ(r0, r1)     // Catch:{ all -> 0x03ab }
            java.lang.Long r1 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x03ab }
            java.lang.String r0 = "error_retryable"
            r2.A9F(r0, r1)     // Catch:{ all -> 0x03ab }
            r2.Cgf()     // Catch:{ all -> 0x03ab }
            goto L_0x0042
        L_0x034a:
            X.1bO r2 = r5.A01     // Catch:{ all -> 0x03ab }
            java.lang.Object r1 = r3.obj     // Catch:{ all -> 0x03ab }
            android.net.NetworkInfo r1 = (android.net.NetworkInfo) r1     // Catch:{ all -> 0x03ab }
            java.nio.charset.Charset r0 = X.1bO.A0w     // Catch:{ all -> 0x03ab }
            if (r1 == 0) goto L_0x0042
            boolean r1 = r1.isConnected()     // Catch:{ all -> 0x03ab }
            boolean r0 = r2.A0C     // Catch:{ all -> 0x03ab }
            if (r1 == r0) goto L_0x0042
            r2.A0C = r1     // Catch:{ all -> 0x03ab }
            X.433 r1 = r2.A0S     // Catch:{ all -> 0x03ab }
            r0 = 0
            r1.A01 = r0     // Catch:{ all -> 0x03ab }
        L_0x0363:
            r1.A00 = r0     // Catch:{ all -> 0x03ab }
            goto L_0x0042
        L_0x0367:
            X.1bO r2 = r5.A01     // Catch:{ all -> 0x03ab }
            java.lang.Object r1 = r3.obj     // Catch:{ all -> 0x03ab }
            X.7BP r1 = (X.AnonymousClass7BP) r1     // Catch:{ all -> 0x03ab }
            java.nio.charset.Charset r0 = X.1bO.A0w     // Catch:{ all -> 0x03ab }
            java.util.List r0 = r2.A0U     // Catch:{ all -> 0x03ab }
            r0.add(r1)     // Catch:{ all -> 0x03ab }
            goto L_0x0042
        L_0x0376:
            java.lang.Object r1 = r3.obj     // Catch:{ all -> 0x03ab }
            r1.getClass()     // Catch:{ all -> 0x03ab }
            X.7BP r1 = (X.AnonymousClass7BP) r1     // Catch:{ all -> 0x03ab }
            java.nio.charset.Charset r0 = X.1bO.A0w     // Catch:{ all -> 0x03ab }
            r1.A01()     // Catch:{ all -> 0x03ab }
            goto L_0x0042
        L_0x0384:
            X.1bO r1 = r5.A01     // Catch:{ all -> 0x03ab }
            java.nio.charset.Charset r0 = X.1bO.A0w     // Catch:{ all -> 0x03ab }
            X.0eM r0 = r1.A0h     // Catch:{ all -> 0x03ab }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x03ab }
            X.2Dm r1 = (X.2Dm) r1     // Catch:{ all -> 0x03ab }
            java.lang.String r0 = "IrisManagerDeferredInit"
            r1.CnE(r0)     // Catch:{ all -> 0x03ab }
            goto L_0x0042
        L_0x0397:
            X.1bO r0 = r5.A01     // Catch:{ all -> 0x03ab }
            X.1bO.A05(r0)     // Catch:{ all -> 0x03ab }
            goto L_0x0042
        L_0x039e:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r9)
            if (r0 == 0) goto L_0x03aa
            r0 = -455316391(0xffffffffe4dc6c59, float:-3.2528728E22)
            X.0fS.A00(r0)
        L_0x03aa:
            return
        L_0x03ab:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r9)
            if (r0 == 0) goto L_0x03b8
            r0 = -822418647(0xffffffffcefae329, float:-2.10459558E9)
            X.0fS.A00(r0)
        L_0x03b8:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass43W.handleMessage(android.os.Message):void");
    }
}
