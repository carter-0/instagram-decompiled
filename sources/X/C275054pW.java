package X;

import android.os.Debug;
import android.os.SystemClock;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.4pW  reason: invalid class name and case insensitive filesystem */
public final class C275054pW implements C275064pX {
    public long A00;
    public long A01 = -1;
    public C274844pB A02;
    public String A03;
    public final long A04;
    public final long A05;
    public final LinkedList A06 = new LinkedList();
    public final long A07;
    public final C275094pa A08;
    public final List A09;
    public final boolean A0A;
    public final Class[] A0B;
    public final Class[] A0C;

    public final synchronized C274844pB AuB() {
        return this.A02;
    }

    public final void CoE(C274844pB r9) {
        synchronized (this) {
            this.A02 = null;
        }
        LinkedList linkedList = this.A06;
        synchronized (linkedList) {
            if (!r9.A06(this.A05)) {
                int i = 0;
                Class cls = this.A0C[0];
                if (cls == null || r9.A09 != cls || r9.A07 != null) {
                    Class[] clsArr = this.A0B;
                    while (true) {
                        Class cls2 = clsArr[i];
                        if (cls2 != null && r9.A07 == cls2) {
                            break;
                        }
                        i++;
                        if (i >= 4) {
                            if (r9.A02 == 0 && r9.A00 == 0 && r9.A02 - this.A01 < 500) {
                                r9.A08();
                                linkedList.removeFirst();
                            }
                        }
                    }
                }
            }
            this.A01 = r9.A05;
            if (!linkedList.isEmpty()) {
                long uptimeMillis = SystemClock.uptimeMillis() - this.A04;
                do {
                    C274844pB r3 = (C274844pB) linkedList.peekLast();
                    if (r3 != null) {
                        if (r3.A05 > uptimeMillis) {
                            break;
                        }
                        r3.A08();
                    }
                    linkedList.removeLast();
                } while (!linkedList.isEmpty());
            }
        }
    }

    public final void CoJ(C274844pB r1) {
    }

    public final void CoK(C274844pB r3) {
        synchronized (this) {
            this.A02 = r3;
        }
        LinkedList linkedList = this.A06;
        synchronized (linkedList) {
            r3.A01++;
            linkedList.addFirst(r3);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:166|167|168|169|(4:171|(1:173)|278|174)|175|(1:177)|178|(1:180)(1:184)|181|(1:183)|185|186|277) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:185:0x03a8 */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0257 A[Catch:{ all -> 0x03b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0290 A[Catch:{ all -> 0x03b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0293 A[Catch:{ all -> 0x03b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02a3 A[Catch:{ all -> 0x03b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02ee A[Catch:{ all -> 0x03b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0300 A[Catch:{ all -> 0x03b8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String Bz8(long r27) {
        /*
            r26 = this;
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x04f3 }
            r8 = r26
            java.lang.String r1 = r8.A03     // Catch:{ all -> 0x04f3 }
            if (r1 == 0) goto L_0x0014
            java.lang.String r0 = "interceptor_mode"
            r14.put(r0, r1)     // Catch:{ all -> 0x04f3 }
        L_0x0014:
            java.lang.String r2 = "history_start_uptime"
            long r0 = r8.A00     // Catch:{ all -> 0x04f3 }
            r14.put(r2, r0)     // Catch:{ all -> 0x04f3 }
            java.lang.String r0 = "current_uptime_ms"
            r14.put(r0, r4)     // Catch:{ all -> 0x04f3 }
            java.lang.String r0 = "anr_received_uptime_ms"
            r6 = r27
            r14.put(r0, r6)     // Catch:{ all -> 0x04f3 }
            java.lang.String r2 = "from_anr_time_to_current"
            long r0 = r4 - r27
            r14.put(r2, r0)     // Catch:{ all -> 0x04f3 }
            java.lang.String r2 = "config_duration_ms"
            long r0 = r8.A04     // Catch:{ all -> 0x04f3 }
            r23 = r0
            r14.put(r2, r0)     // Catch:{ all -> 0x04f3 }
            java.lang.String r2 = "config_threshold_ms"
            long r0 = r8.A05     // Catch:{ all -> 0x04f3 }
            r14.put(r2, r0)     // Catch:{ all -> 0x04f3 }
            java.util.List r0 = r8.A09     // Catch:{ all -> 0x04f3 }
            r25 = r0
            java.util.Iterator r21 = r25.iterator()     // Catch:{ all -> 0x04f3 }
        L_0x0046:
            boolean r0 = r21.hasNext()     // Catch:{ all -> 0x04f3 }
            if (r0 == 0) goto L_0x0184
            java.lang.Object r1 = r21.next()     // Catch:{ all -> 0x04f3 }
            X.4pH r1 = (X.C274904pH) r1     // Catch:{ all -> 0x04f3 }
            boolean r0 = r1 instanceof X.C274894pG     // Catch:{ all -> 0x04f3 }
            if (r0 != 0) goto L_0x0046
            boolean r0 = r1 instanceof X.C274914pI     // Catch:{ all -> 0x04f3 }
            if (r0 == 0) goto L_0x00f1
            X.4pI r1 = (X.C274914pI) r1     // Catch:{ all -> 0x04f3 }
            long[][] r12 = r1.A01     // Catch:{ all -> 0x04f3 }
            int r11 = r12.length     // Catch:{ all -> 0x04f3 }
            if (r11 == 0) goto L_0x0046
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ all -> 0x0046 }
            r10.<init>()     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "gc_history"
            r14.put(r0, r10)     // Catch:{ all -> 0x0046 }
            int r13 = r1.A00     // Catch:{ all -> 0x0046 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0046 }
            r3.<init>()     // Catch:{ all -> 0x0046 }
            r0 = 60000(0xea60, double:2.9644E-319)
            long r19 = r4 - r0
            r0 = r13
        L_0x0078:
            int r18 = r0 + 1
            r17 = r12[r0]     // Catch:{ all -> 0x0046 }
            r9 = 0
            r0 = r17[r9]     // Catch:{ all -> 0x0046 }
            r15 = 0
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 == 0) goto L_0x00eb
            int r2 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r2 < 0) goto L_0x00eb
            r3.append(r0)     // Catch:{ all -> 0x0046 }
            r2 = 44
            r3.append(r2)     // Catch:{ all -> 0x0046 }
            r0 = 1
            r0 = r17[r0]     // Catch:{ all -> 0x0046 }
            r3.append(r0)     // Catch:{ all -> 0x0046 }
            r3.append(r2)     // Catch:{ all -> 0x0046 }
            r0 = 2
            r0 = r17[r0]     // Catch:{ all -> 0x0046 }
            r3.append(r0)     // Catch:{ all -> 0x0046 }
            r3.append(r2)     // Catch:{ all -> 0x0046 }
            r0 = 3
            r0 = r17[r0]     // Catch:{ all -> 0x0046 }
            r3.append(r0)     // Catch:{ all -> 0x0046 }
            r3.append(r2)     // Catch:{ all -> 0x0046 }
            r0 = 4
            r0 = r17[r0]     // Catch:{ all -> 0x0046 }
            r3.append(r0)     // Catch:{ all -> 0x0046 }
            r3.append(r2)     // Catch:{ all -> 0x0046 }
            r0 = 5
            r0 = r17[r0]     // Catch:{ all -> 0x0046 }
            r3.append(r0)     // Catch:{ all -> 0x0046 }
            r3.append(r2)     // Catch:{ all -> 0x0046 }
            r0 = 6
            r0 = r17[r0]     // Catch:{ all -> 0x0046 }
            r3.append(r0)     // Catch:{ all -> 0x0046 }
            r3.append(r2)     // Catch:{ all -> 0x0046 }
            r0 = 7
            r0 = r17[r0]     // Catch:{ all -> 0x0046 }
            r3.append(r0)     // Catch:{ all -> 0x0046 }
            r3.append(r2)     // Catch:{ all -> 0x0046 }
            r0 = 8
            r0 = r17[r0]     // Catch:{ all -> 0x0046 }
            r3.append(r0)     // Catch:{ all -> 0x0046 }
            r3.append(r2)     // Catch:{ all -> 0x0046 }
            r0 = 9
            r0 = r17[r0]     // Catch:{ all -> 0x0046 }
            r3.append(r0)     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0046 }
            r10.put(r0)     // Catch:{ all -> 0x0046 }
            r3.setLength(r9)     // Catch:{ all -> 0x0046 }
        L_0x00eb:
            int r0 = r18 % r11
            if (r0 != r13) goto L_0x0078
            goto L_0x0046
        L_0x00f1:
            boolean r0 = r1 instanceof X.C275124pd     // Catch:{ all -> 0x04f3 }
            if (r0 == 0) goto L_0x0131
            X.4pd r1 = (X.C275124pd) r1     // Catch:{ all -> 0x04f3 }
            long[] r2 = r1.A01     // Catch:{ all -> 0x0046 }
            int r11 = r2.length     // Catch:{ all -> 0x0046 }
            long[] r10 = new long[r11]     // Catch:{ all -> 0x0046 }
            monitor-enter(r2)     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = "is_currently_fg"
            X.4p6 r0 = X.C274794p6.A02     // Catch:{ all -> 0x012e }
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A01     // Catch:{ all -> 0x012e }
            boolean r0 = r0.get()     // Catch:{ all -> 0x012e }
            r14.put(r1, r0)     // Catch:{ all -> 0x012e }
            r9 = 0
            java.lang.System.arraycopy(r2, r9, r10, r9, r11)     // Catch:{ all -> 0x012e }
            monitor-exit(r2)     // Catch:{ all -> 0x012e }
            java.util.Arrays.sort(r10)     // Catch:{ all -> 0x0046 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ all -> 0x0046 }
            r3.<init>()     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "app_status_history"
            r14.put(r0, r3)     // Catch:{ all -> 0x0046 }
        L_0x011c:
            if (r9 >= r11) goto L_0x0046
            r12 = r10[r9]     // Catch:{ all -> 0x0046 }
            r1 = 0
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x012b
            long r0 = r4 - r12
            r3.put(r0)     // Catch:{ all -> 0x0046 }
        L_0x012b:
            int r9 = r9 + 1
            goto L_0x011c
        L_0x012e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x012e }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0131:
            X.56I r1 = (X.AnonymousClass56I) r1     // Catch:{ all -> 0x04f3 }
            long[][] r12 = r1.A01     // Catch:{ all -> 0x04f3 }
            int r11 = r12.length     // Catch:{ all -> 0x04f3 }
            if (r11 == 0) goto L_0x0046
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ all -> 0x0046 }
            r10.<init>()     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "io_history"
            r14.put(r0, r10)     // Catch:{ all -> 0x0046 }
            int r13 = r1.A00     // Catch:{ all -> 0x0046 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0046 }
            r9.<init>()     // Catch:{ all -> 0x0046 }
            r0 = 60000(0xea60, double:2.9644E-319)
            long r19 = r4 - r0
            r0 = r13
        L_0x014f:
            int r18 = r0 + 1
            r3 = r12[r0]     // Catch:{ all -> 0x0046 }
            r2 = 0
            r0 = r3[r2]     // Catch:{ all -> 0x0046 }
            r16 = 0
            int r15 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r15 == 0) goto L_0x017e
            int r15 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r15 < 0) goto L_0x017e
            r9.append(r0)     // Catch:{ all -> 0x0046 }
            r15 = 1
        L_0x0164:
            int r0 = r3.length     // Catch:{ all -> 0x0046 }
            if (r15 >= r0) goto L_0x0174
            r0 = 44
            r9.append(r0)     // Catch:{ all -> 0x0046 }
            r0 = r3[r15]     // Catch:{ all -> 0x0046 }
            r9.append(r0)     // Catch:{ all -> 0x0046 }
            int r15 = r15 + 1
            goto L_0x0164
        L_0x0174:
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x0046 }
            r10.put(r0)     // Catch:{ all -> 0x0046 }
            r9.setLength(r2)     // Catch:{ all -> 0x0046 }
        L_0x017e:
            int r0 = r18 % r11
            if (r0 != r13) goto L_0x014f
            goto L_0x0046
        L_0x0184:
            boolean r0 = r8.A0A     // Catch:{ all -> 0x04f3 }
            if (r0 == 0) goto L_0x018f
            java.lang.String r2 = "exec_monitor_threshold_ms"
            long r0 = r8.A07     // Catch:{ all -> 0x04f3 }
            r14.put(r2, r0)     // Catch:{ all -> 0x04f3 }
        L_0x018f:
            org.json.JSONArray r22 = new org.json.JSONArray     // Catch:{ all -> 0x04f3 }
            r22.<init>()     // Catch:{ all -> 0x04f3 }
            java.lang.String r1 = "history"
            r0 = r22
            r14.put(r1, r0)     // Catch:{ all -> 0x04f3 }
            java.util.LinkedList r8 = r8.A06     // Catch:{ all -> 0x04f3 }
            monitor-enter(r8)     // Catch:{ all -> 0x04f3 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x04f0 }
            r3.<init>(r8)     // Catch:{ all -> 0x04f0 }
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x04f0 }
        L_0x01a7:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x04f0 }
            if (r0 == 0) goto L_0x01ba
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x04f0 }
            X.4pB r1 = (X.C274844pB) r1     // Catch:{ all -> 0x04f0 }
            int r0 = r1.A01     // Catch:{ all -> 0x04f0 }
            int r0 = r0 + 1
            r1.A01 = r0     // Catch:{ all -> 0x04f0 }
            goto L_0x01a7
        L_0x01ba:
            monitor-exit(r8)     // Catch:{ all -> 0x04f0 }
            long r17 = r4 - r23
            java.util.Iterator r16 = r3.iterator()     // Catch:{ all -> 0x04f3 }
        L_0x01c1:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x04f3 }
            if (r0 == 0) goto L_0x03c2
            java.lang.Object r11 = r16.next()     // Catch:{ all -> 0x04f3 }
            X.4pB r11 = (X.C274844pB) r11     // Catch:{ all -> 0x04f3 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ all -> 0x04f3 }
            r10.<init>()     // Catch:{ all -> 0x04f3 }
            java.lang.String r9 = "msg"
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ all -> 0x03b8 }
            r8.<init>()     // Catch:{ all -> 0x03b8 }
            boolean r0 = r11.A0A     // Catch:{ all -> 0x03b8 }
            java.lang.String r1 = "msg_what"
            java.lang.String r2 = "msg_target"
            if (r0 != 0) goto L_0x023d
            java.lang.Class r0 = r11.A09     // Catch:{ all -> 0x03b8 }
            if (r0 == 0) goto L_0x01ec
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x03b8 }
            r8.put(r2, r0)     // Catch:{ all -> 0x03b8 }
        L_0x01ec:
            java.lang.Class r0 = r11.A07     // Catch:{ all -> 0x03b8 }
            if (r0 == 0) goto L_0x01f9
            java.lang.String r2 = r0.getName()     // Catch:{ all -> 0x03b8 }
            java.lang.String r0 = "msg_callback"
            r8.put(r0, r2)     // Catch:{ all -> 0x03b8 }
        L_0x01f9:
            int r0 = r11.A00     // Catch:{ all -> 0x03b8 }
            r8.put(r1, r0)     // Catch:{ all -> 0x03b8 }
            java.lang.Class r0 = r11.A08     // Catch:{ all -> 0x03b8 }
            if (r0 == 0) goto L_0x020b
            java.lang.String r1 = r0.getName()     // Catch:{ all -> 0x03b8 }
            java.lang.String r0 = "msg_obj"
            r8.put(r0, r1)     // Catch:{ all -> 0x03b8 }
        L_0x020b:
            long r2 = r11.A06     // Catch:{ all -> 0x03b8 }
            r12 = 0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0223
            long r0 = r11.A02     // Catch:{ all -> 0x03b8 }
            long r0 = r0 - r2
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x0223
            r2 = 4214(0x1076, float:5.905E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)     // Catch:{ all -> 0x03b8 }
            r8.put(r2, r0)     // Catch:{ all -> 0x03b8 }
        L_0x0223:
            long r0 = r11.A05     // Catch:{ all -> 0x03b8 }
            r12 = -1
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x0230
            java.lang.String r2 = "msg_sequence"
            r8.put(r2, r0)     // Catch:{ all -> 0x03b8 }
        L_0x0230:
            r10.put(r9, r8)     // Catch:{ all -> 0x03b8 }
            int r0 = r11.A02     // Catch:{ all -> 0x03b8 }
            if (r0 != 0) goto L_0x0254
            int r1 = r11.A00     // Catch:{ all -> 0x03b8 }
            r0 = 0
            if (r1 == 0) goto L_0x0255
            goto L_0x0254
        L_0x023d:
            java.lang.Integer r3 = r11.A07     // Catch:{ all -> 0x03b8 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x03b8 }
            if (r3 != r0) goto L_0x0251
            r0 = 807(0x327, float:1.131E-42)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ all -> 0x03b8 }
        L_0x0249:
            r8.put(r2, r0)     // Catch:{ all -> 0x03b8 }
            r0 = 0
            r8.put(r1, r0)     // Catch:{ all -> 0x03b8 }
            goto L_0x0223
        L_0x0251:
            java.lang.String r0 = "nativePollOnce"
            goto L_0x0249
        L_0x0254:
            r0 = 1
        L_0x0255:
            if (r0 == 0) goto L_0x0281
            java.lang.String r8 = "touch"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x03b8 }
            r3.<init>()     // Catch:{ all -> 0x03b8 }
            int r1 = r11.A02     // Catch:{ all -> 0x03b8 }
            if (r1 == 0) goto L_0x026e
            java.lang.String r0 = "touch_count"
            r3.put(r0, r1)     // Catch:{ all -> 0x03b8 }
            long r0 = r11.A04     // Catch:{ all -> 0x03b8 }
            java.lang.String r2 = "max_touch_delay"
            r3.put(r2, r0)     // Catch:{ all -> 0x03b8 }
        L_0x026e:
            int r1 = r11.A00     // Catch:{ all -> 0x03b8 }
            if (r1 == 0) goto L_0x027e
            java.lang.String r0 = "key_count"
            r3.put(r0, r1)     // Catch:{ all -> 0x03b8 }
            long r0 = r11.A04     // Catch:{ all -> 0x03b8 }
            java.lang.String r2 = "max_key_delay"
            r3.put(r2, r0)     // Catch:{ all -> 0x03b8 }
        L_0x027e:
            r10.put(r8, r3)     // Catch:{ all -> 0x03b8 }
        L_0x0281:
            long r0 = r11.A02     // Catch:{ all -> 0x03b8 }
            long r8 = r4 - r0
            long r2 = r27 - r0
            long r12 = r11.A05     // Catch:{ all -> 0x03b8 }
            r0 = -1
            int r15 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r12 = 0
            if (r15 == 0) goto L_0x0291
            r12 = 1
        L_0x0291:
            if (r12 == 0) goto L_0x02a3
            java.lang.String r0 = "current-from_ms_ago"
            r10.put(r0, r8)     // Catch:{ all -> 0x03b8 }
            long r0 = r11.A02     // Catch:{ all -> 0x03b8 }
            int r8 = (r27 > r0 ? 1 : (r27 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x02d6
            int r0 = (r27 > r17 ? 1 : (r27 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x02d6
            goto L_0x02d1
        L_0x02a3:
            java.lang.String r12 = "current-running_ms"
            r10.put(r12, r8)     // Catch:{ all -> 0x03b8 }
            long r8 = r11.A02     // Catch:{ all -> 0x03b8 }
            int r12 = (r27 > r8 ? 1 : (r27 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x02b3
            java.lang.String r8 = "sigquit-running_ms"
            r10.put(r8, r2)     // Catch:{ all -> 0x03b8 }
        L_0x02b3:
            java.lang.String r8 = "current-running_cpu_ms"
            X.4pP r2 = X.C274984pP.A03     // Catch:{ all -> 0x03b8 }
            if (r2 == 0) goto L_0x02cd
            X.4pS r9 = r2.A00     // Catch:{ all -> 0x03b8 }
            long[] r3 = r9.A06     // Catch:{ all -> 0x03b8 }
            boolean r2 = X.C275014pS.A00(r9, r3)     // Catch:{ all -> 0x03b8 }
            if (r2 == 0) goto L_0x02cd
            r0 = 0
            r0 = r3[r0]     // Catch:{ all -> 0x03b8 }
            long r2 = r9.A01     // Catch:{ all -> 0x03b8 }
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            long r0 = r0 / r2
        L_0x02cd:
            r10.put(r8, r0)     // Catch:{ all -> 0x03b8 }
            goto L_0x02e8
        L_0x02d1:
            java.lang.String r0 = "sigquit-from_ms_ago"
            r10.put(r0, r2)     // Catch:{ all -> 0x03b8 }
        L_0x02d6:
            java.lang.String r2 = "duration_ms"
            long r0 = r11.A01()     // Catch:{ all -> 0x03b8 }
            r10.put(r2, r0)     // Catch:{ all -> 0x03b8 }
            java.lang.String r2 = "duration_cpu_ms"
            long r0 = r11.A00()     // Catch:{ all -> 0x03b8 }
            r10.put(r2, r0)     // Catch:{ all -> 0x03b8 }
        L_0x02e8:
            java.lang.Integer r2 = r11.A06     // Catch:{ all -> 0x03b8 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x03b8 }
            if (r2 == r0) goto L_0x02fc
            java.lang.String r1 = "app_finishing_status"
            int r0 = r2.intValue()     // Catch:{ all -> 0x03b8 }
            switch(r0) {
                case 0: goto L_0x030f;
                case 1: goto L_0x0312;
                default: goto L_0x02f7;
            }     // Catch:{ all -> 0x03b8 }
        L_0x02f7:
            java.lang.String r0 = "fg"
        L_0x02f9:
            r10.put(r1, r0)     // Catch:{ all -> 0x03b8 }
        L_0x02fc:
            java.util.List r0 = r11.A0A     // Catch:{ all -> 0x03b8 }
            if (r0 == 0) goto L_0x03b8
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ all -> 0x03b8 }
            r12.<init>()     // Catch:{ all -> 0x03b8 }
            long r0 = r11.A05     // Catch:{ all -> 0x03b8 }
            r8 = -1
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r0 = 0
            if (r2 == 0) goto L_0x0316
            goto L_0x0315
        L_0x030f:
            java.lang.String r0 = "unknown"
            goto L_0x02f9
        L_0x0312:
            java.lang.String r0 = "bg"
            goto L_0x02f9
        L_0x0315:
            r0 = 1
        L_0x0316:
            if (r0 == 0) goto L_0x031d
            long r19 = r11.A01()     // Catch:{ all -> 0x03b8 }
            goto L_0x0321
        L_0x031d:
            long r0 = r11.A02     // Catch:{ all -> 0x03b8 }
            long r19 = r4 - r0
        L_0x0321:
            java.util.List r0 = r11.A0A     // Catch:{ all -> 0x03b8 }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x03b8 }
        L_0x0327:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x03b8 }
            if (r0 == 0) goto L_0x03ad
            java.lang.Object r8 = r15.next()     // Catch:{ all -> 0x03b8 }
            X.RyP r8 = (X.C10803RyP) r8     // Catch:{ all -> 0x03b8 }
            long r2 = r11.A02     // Catch:{ all -> 0x03b8 }
            long r0 = r8.A02     // Catch:{ all -> 0x03b8 }
            long r0 = r0 - r2
            int r9 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            r0 = 0
            if (r9 >= 0) goto L_0x033e
            r0 = 1
        L_0x033e:
            if (r0 == 0) goto L_0x0327
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ all -> 0x03b8 }
            r9.<init>()     // Catch:{ all -> 0x03b8 }
            java.lang.String r13 = "start_time"
            long r0 = r8.A02     // Catch:{ all -> 0x03a8 }
            long r0 = r0 - r2
            r9.put(r13, r0)     // Catch:{ all -> 0x03a8 }
            java.lang.String r2 = "start_time_delay"
            long r0 = r8.A00     // Catch:{ all -> 0x03a8 }
            r9.put(r2, r0)     // Catch:{ all -> 0x03a8 }
            java.lang.String r13 = "time_spent_in_capture"
            long r0 = r8.A01     // Catch:{ all -> 0x03a8 }
            long r2 = r8.A02     // Catch:{ all -> 0x03a8 }
            long r0 = r0 - r2
            r9.put(r13, r0)     // Catch:{ all -> 0x03a8 }
            java.lang.String r1 = "is_capture_interrupted"
            boolean r0 = r8.A05     // Catch:{ all -> 0x03a8 }
            r9.put(r1, r0)     // Catch:{ all -> 0x03a8 }
            java.lang.StackTraceElement[] r0 = r8.A07     // Catch:{ all -> 0x03a8 }
            if (r0 == 0) goto L_0x0389
            org.json.JSONArray r13 = new org.json.JSONArray     // Catch:{ all -> 0x03a8 }
            r13.<init>()     // Catch:{ all -> 0x03a8 }
            java.lang.StackTraceElement[] r3 = r8.A07     // Catch:{ all -> 0x03a8 }
            int r2 = r3.length     // Catch:{ all -> 0x03a8 }
            r1 = 0
        L_0x0372:
            if (r1 >= r2) goto L_0x0380
            r0 = r3[r1]     // Catch:{ all -> 0x03a8 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x03a8 }
            r13.put(r0)     // Catch:{ all -> 0x03a8 }
            int r1 = r1 + 1
            goto L_0x0372
        L_0x0380:
            r0 = 4032(0xfc0, float:5.65E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x03a8 }
            r9.put(r0, r13)     // Catch:{ all -> 0x03a8 }
        L_0x0389:
            java.lang.String r1 = r8.A04     // Catch:{ all -> 0x03a8 }
            if (r1 == 0) goto L_0x0392
            java.lang.String r0 = "thread_state"
            r9.put(r0, r1)     // Catch:{ all -> 0x03a8 }
        L_0x0392:
            java.lang.String r1 = "app_status"
            boolean r0 = r8.A06     // Catch:{ all -> 0x03a8 }
            if (r0 == 0) goto L_0x03a5
            java.lang.String r0 = "fg"
        L_0x039a:
            r9.put(r1, r0)     // Catch:{ all -> 0x03a8 }
            X.S3X r0 = r8.A03     // Catch:{ all -> 0x03a8 }
            if (r0 == 0) goto L_0x03a8
            r0.A00(r9)     // Catch:{ all -> 0x03a8 }
            goto L_0x03a8
        L_0x03a5:
            java.lang.String r0 = "bg"
            goto L_0x039a
        L_0x03a8:
            r12.put(r9)     // Catch:{ all -> 0x03b8 }
            goto L_0x0327
        L_0x03ad:
            int r0 = r12.length()     // Catch:{ all -> 0x03b8 }
            if (r0 <= 0) goto L_0x03b8
            java.lang.String r0 = "exec_record"
            r10.put(r0, r12)     // Catch:{ all -> 0x03b8 }
        L_0x03b8:
            r0 = r22
            r0.put(r10)     // Catch:{ all -> 0x04f3 }
            r11.A08()     // Catch:{ all -> 0x04f3 }
            goto L_0x01c1
        L_0x03c2:
            java.util.Iterator r21 = r25.iterator()     // Catch:{ all -> 0x04f3 }
        L_0x03c6:
            boolean r0 = r21.hasNext()     // Catch:{ all -> 0x04f3 }
            if (r0 == 0) goto L_0x04f3
            java.lang.Object r0 = r21.next()     // Catch:{ all -> 0x04f3 }
            X.4pH r0 = (X.C274904pH) r0     // Catch:{ all -> 0x04f3 }
            boolean r0 = r0 instanceof X.C274894pG     // Catch:{ all -> 0x04f3 }
            if (r0 == 0) goto L_0x03c6
            X.0wX r16 = X.C61170le.A00     // Catch:{ all -> 0x04f3 }
            X.18g r0 = X.C638918c.A01(r16)     // Catch:{ all -> 0x04f3 }
            X.0eM r0 = r0.A0H     // Catch:{ all -> 0x04f3 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x04f3 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x04f3 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x04f3 }
            r12.<init>(r0)     // Catch:{ all -> 0x04f3 }
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x04f3 }
            if (r0 != 0) goto L_0x03c6
            r19 = 0
            int r0 = (r27 > r19 ? 1 : (r27 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x03f6
            goto L_0x03f8
        L_0x03f6:
            r8 = r4
            goto L_0x03fc
        L_0x03f8:
            long r8 = java.lang.Math.min(r4, r6)     // Catch:{ all -> 0x04f3 }
        L_0x03fc:
            int r0 = r12.size()     // Catch:{ all -> 0x04f3 }
            int r0 = r0 + -1
            java.lang.Object r0 = r12.get(r0)     // Catch:{ all -> 0x04f3 }
            X.9Iq r0 = (X.C376609Iq) r0     // Catch:{ all -> 0x04f3 }
            long r0 = r0.A02     // Catch:{ all -> 0x04f3 }
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0417
            long r8 = r8 - r0
            r1 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0417
            goto L_0x03c6
        L_0x0417:
            int r0 = r12.size()     // Catch:{ all -> 0x03c6 }
            int r11 = r0 + -1
        L_0x041d:
            if (r11 < 0) goto L_0x0477
            java.lang.Object r13 = r12.get(r11)     // Catch:{ all -> 0x03c6 }
            X.9Iq r13 = (X.C376609Iq) r13     // Catch:{ all -> 0x03c6 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ all -> 0x03c6 }
            r10.<init>()     // Catch:{ all -> 0x03c6 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x046f }
            r2.<init>()     // Catch:{ all -> 0x046f }
            java.lang.String r1 = "msg_target"
            java.lang.String r0 = "(NeedInit)"
            r2.put(r1, r0)     // Catch:{ all -> 0x046f }
            java.lang.String r1 = "msg_callback"
            java.lang.String r0 = r13.A04     // Catch:{ all -> 0x046f }
            r2.put(r1, r0)     // Catch:{ all -> 0x046f }
            java.lang.String r1 = "msg_what"
            r0 = 0
            r2.put(r1, r0)     // Catch:{ all -> 0x046f }
            java.lang.String r0 = "msg"
            r10.put(r0, r2)     // Catch:{ all -> 0x046f }
            long r8 = r13.A03     // Catch:{ all -> 0x046f }
            long r2 = r4 - r8
            long r0 = r27 - r8
            java.lang.String r15 = "current-from_ms_ago"
            r10.put(r15, r2)     // Catch:{ all -> 0x046f }
            int r2 = (r27 > r8 ? 1 : (r27 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0460
            int r2 = (r27 > r17 ? 1 : (r27 == r17 ? 0 : -1))
            if (r2 <= 0) goto L_0x0460
            java.lang.String r2 = "sigquit-from_ms_ago"
            r10.put(r2, r0)     // Catch:{ all -> 0x046f }
        L_0x0460:
            java.lang.String r2 = "duration_ms"
            long r0 = r13.A02     // Catch:{ all -> 0x046f }
            long r0 = r0 - r8
            r10.put(r2, r0)     // Catch:{ all -> 0x046f }
            java.lang.String r2 = "duration_cpu_ms"
            long r0 = r13.A01     // Catch:{ all -> 0x046f }
            r10.put(r2, r0)     // Catch:{ all -> 0x046f }
        L_0x046f:
            r0 = r22
            r0.put(r10)     // Catch:{ all -> 0x03c6 }
            int r11 = r11 + -1
            goto L_0x041d
        L_0x0477:
            X.18g r0 = X.C638918c.A01(r16)     // Catch:{ all -> 0x03c6 }
            X.0eM r0 = r0.A0I     // Catch:{ all -> 0x03c6 }
            java.lang.Object r10 = r0.getValue()     // Catch:{ all -> 0x03c6 }
            long[] r10 = (long[]) r10     // Catch:{ all -> 0x03c6 }
            int r1 = r10.length     // Catch:{ all -> 0x03c6 }
            r0 = 5
            if (r1 != r0) goto L_0x03c6
            r1 = 0
        L_0x0488:
            r11 = 1
        L_0x0489:
            r8 = r10[r11]     // Catch:{ all -> 0x03c6 }
            int r0 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r0 < 0) goto L_0x04e7
            r15 = r10[r1]     // Catch:{ all -> 0x03c6 }
            java.lang.String r2 = X.C274894pG.A00(r1)     // Catch:{ all -> 0x03c6 }
            java.lang.String r1 = "-"
            java.lang.String r0 = X.C274894pG.A00(r11)     // Catch:{ all -> 0x03c6 }
            java.lang.String r3 = X.002.A0g(r2, r1, r0)     // Catch:{ all -> 0x03c6 }
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ all -> 0x03c6 }
            r12.<init>()     // Catch:{ all -> 0x03c6 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x04e1 }
            r2.<init>()     // Catch:{ all -> 0x04e1 }
            java.lang.String r1 = "msg_target"
            java.lang.String r0 = "(Pre-NeedInit)"
            r2.put(r1, r0)     // Catch:{ all -> 0x04e1 }
            java.lang.String r0 = "msg_callback"
            r2.put(r0, r3)     // Catch:{ all -> 0x04e1 }
            java.lang.String r1 = "msg_what"
            r0 = 0
            r2.put(r1, r0)     // Catch:{ all -> 0x04e1 }
            java.lang.String r0 = "msg"
            r12.put(r0, r2)     // Catch:{ all -> 0x04e1 }
            long r2 = r4 - r15
            long r0 = r27 - r15
            java.lang.String r13 = "current-from_ms_ago"
            r12.put(r13, r2)     // Catch:{ all -> 0x04e1 }
            int r2 = (r27 > r15 ? 1 : (r27 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x04d6
            int r2 = (r27 > r17 ? 1 : (r27 == r17 ? 0 : -1))
            if (r2 <= 0) goto L_0x04d6
            java.lang.String r2 = "sigquit-from_ms_ago"
            r12.put(r2, r0)     // Catch:{ all -> 0x04e1 }
        L_0x04d6:
            java.lang.String r0 = "duration_ms"
            long r8 = r8 - r15
            r12.put(r0, r8)     // Catch:{ all -> 0x04e1 }
            java.lang.String r0 = "duration_cpu_ms"
            r12.put(r0, r8)     // Catch:{ all -> 0x04e1 }
        L_0x04e1:
            r0 = r22
            r0.put(r12)     // Catch:{ all -> 0x03c6 }
            r1 = r11
        L_0x04e7:
            int r11 = r11 + 1
            r0 = 4
            if (r11 <= r0) goto L_0x0489
            r0 = 3
            if (r1 > r0) goto L_0x03c6
            goto L_0x0488
        L_0x04f0:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x04f0 }
            throw r0     // Catch:{ all -> 0x04f3 }
        L_0x04f3:
            java.lang.String r0 = r14.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C275054pW.Bz8(long):java.lang.String");
    }

    public final void CwF(String str) {
        this.A03 = str;
        C275094pa r3 = this.A08;
        if (r3 != null && !Debug.isDebuggerConnected()) {
            r3.A00(0, false);
        }
        this.A00 = SystemClock.uptimeMillis();
    }

    public final String getName() {
        return "anr_looper_history";
    }

    public C275054pW(C274884pF r5, C275044pV r6, List list) {
        C275094pa r0;
        this.A04 = r5.A01();
        this.A05 = r5.A02();
        boolean A062 = r5.A06();
        this.A0A = A062;
        this.A07 = r5.A00();
        List A042 = r5.A04();
        this.A09 = A042;
        C275084pZ r1 = C275084pZ.A03;
        Class<?> cls = r1.A00;
        if (cls == null) {
            try {
                cls = Class.forName("android.app.ActivityThread$H");
            } catch (Throwable unused) {
                cls = null;
            }
            r1.A00 = cls;
        }
        this.A0C = new Class[]{cls};
        this.A0B = r1.A00();
        if (A062) {
            r0 = new C275094pa(this, r5, r6, list);
        } else {
            r0 = null;
        }
        this.A08 = r0;
        A042.add(new C275124pd());
    }
}
