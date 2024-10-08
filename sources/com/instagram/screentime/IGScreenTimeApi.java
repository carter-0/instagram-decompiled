package com.instagram.screentime;

import X.0qQ;
import X.C278974xp;
import X.C278984xq;
import com.instagram.common.session.UserSession;
import com.instagram.screentime.storage.ScreenTimeDatabase;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class IGScreenTimeApi {
    public final C278984xq A00;
    public final C278984xq A01;
    public final UserSession A02;
    public final AtomicLong A03;
    public final AtomicLong A04;
    public final AtomicReference A05;
    public final long A06 = (System.currentTimeMillis() / 1000);
    public final C278974xp A07;
    public final ScreenTimeDatabase A08;
    public final String A09;
    public final AtomicBoolean A0A;

    public IGScreenTimeApi(C278984xq r5, C278984xq r6, UserSession userSession, C278974xp r8, ScreenTimeDatabase screenTimeDatabase) {
        0qQ.A0B(r8, 1);
        0qQ.A0B(screenTimeDatabase, 3);
        0qQ.A0B(r5, 4);
        0qQ.A0B(r6, 5);
        this.A07 = r8;
        this.A02 = userSession;
        this.A08 = screenTimeDatabase;
        this.A00 = r5;
        this.A01 = r6;
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        this.A09 = obj;
        this.A03 = new AtomicLong(0);
        this.A04 = new AtomicLong(0);
        this.A0A = new AtomicBoolean(false);
        this.A05 = new AtomicReference((Object) null);
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ad A[PHI: r0 
      PHI: (r0v2 java.lang.Object) = (r0v10 java.lang.Object), (r0v1 java.lang.Object) binds: [B:21:0x0086, B:28:0x00aa] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r12, X.AnonymousClass4D7 r13) {
        /*
            r11 = this;
            r3 = 33
            boolean r0 = X.C376709Ja.A00(r3, r13)
            if (r0 == 0) goto L_0x002f
            r8 = r13
            X.9Ja r8 = (X.C376709Ja) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002f
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r8.A03
            X.1Hj r9 = X.1Hj.A02
            int r2 = r8.A00
            r10 = 3
            r5 = 2
            r1 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 == r1) goto L_0x0061
            if (r2 == r5) goto L_0x00aa
            if (r2 == r10) goto L_0x00aa
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x002f:
            X.9Ja r8 = new X.9Ja
            r8.<init>(r11, r13, r3)
            goto L_0x0016
        L_0x0035:
            X.0eS.A00(r0)
            com.instagram.screentime.storage.ScreenTimeDatabase r0 = r11.A08
            X.4xw r6 = r0.A00()
            r8.A01 = r11
            r8.A02 = r12
            r8.A00 = r1
            java.lang.String r1 = "SELECT * FROM screentime_sync limit 1"
            r4 = 0
            java.util.TreeMap r0 = X.1WY.A08
            X.1WY r3 = X.1Wa.A00(r1, r4)
            android.os.CancellationSignal r2 = new android.os.CancellationSignal
            r2.<init>()
            X.3oI r1 = r6.A01
            X.51o r0 = new X.51o
            r0.<init>(r3, r6)
            java.lang.Object r0 = X.1wR.A00(r2, r1, r0, r8, r4)
            if (r0 == r9) goto L_0x0088
            r7 = r11
            goto L_0x006c
        L_0x0061:
            java.lang.Object r12 = r8.A02
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r7 = r8.A01
            com.instagram.screentime.IGScreenTimeApi r7 = (com.instagram.screentime.IGScreenTimeApi) r7
            X.0eS.A00(r0)
        L_0x006c:
            X.5Iu r0 = (X.C283685Iu) r0
            r6 = 0
            if (r0 != 0) goto L_0x0089
            r8.A01 = r6
            r8.A02 = r6
            r8.A00 = r5
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r2 = 86400(0x15180, double:4.26873E-319)
            long r0 = r0 - r2
        L_0x0082:
            java.lang.Object r0 = r7.A01(r12, r8, r0)
            if (r0 != r9) goto L_0x00ad
        L_0x0088:
            return r9
        L_0x0089:
            java.lang.Long r0 = r0.A02
            if (r0 == 0) goto L_0x00a7
            long r4 = r0.longValue()
        L_0x0091:
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            r0 = 86400(0x15180, double:4.26873E-319)
            long r2 = r2 - r0
            long r0 = java.lang.Math.max(r4, r2)
            r8.A01 = r6
            r8.A02 = r6
            r8.A00 = r10
            goto L_0x0082
        L_0x00a7:
            r4 = 0
            goto L_0x0091
        L_0x00aa:
            X.0eS.A00(r0)
        L_0x00ad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.screentime.IGScreenTimeApi.A00(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v195, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: com.google.common.collect.ImmutableList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v198, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: X.4xw} */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.9Je, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x06e1, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x06e2, code lost:
        X.0KC.A0F("IGScreenTimeApi", "Error while processing response", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x06ee, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (((X.C376749Je) r4).A06 != 1) goto L_0x0010;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0639  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0652 A[SYNTHETIC, Splitter:B:149:0x0652] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0336 A[LOOP:3: B:65:0x0330->B:67:0x0336, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x036f A[LOOP:4: B:69:0x0369->B:71:0x036f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0398  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r44, X.AnonymousClass4D7 r45, long r46) {
        /*
            r43 = this;
            r27 = 1
            r4 = r45
            boolean r0 = r4 instanceof X.C376749Je
            if (r0 == 0) goto L_0x0010
            r0 = r4
            X.9Je r0 = (X.C376749Je) r0
            int r2 = r0.A06
            r1 = 1
            if (r2 == r1) goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            r15 = r43
            if (r1 == 0) goto L_0x0043
            r2 = r4
            X.9Je r2 = (X.C376749Je) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0043
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0023:
            java.lang.Object r4 = r2.A05
            X.1Hj r21 = X.1Hj.A02
            int r1 = r2.A00
            r26 = 2
            java.lang.String r25 = "IGScreenTimeApi"
            if (r1 == 0) goto L_0x0072
            r0 = r27
            if (r1 == r0) goto L_0x0053
            r0 = r26
            if (r1 != r0) goto L_0x004b
            long r0 = r2.A01
            java.lang.Object r5 = r2.A03
            X.3JC r5 = (X.AnonymousClass3JC) r5
            java.lang.Object r6 = r2.A02
            com.instagram.screentime.IGScreenTimeApi r6 = (com.instagram.screentime.IGScreenTimeApi) r6
            goto L_0x06a7
        L_0x0043:
            X.9Je r2 = new X.9Je
            r0 = r27
            r2.<init>(r15, r4, r0)
            goto L_0x0023
        L_0x004b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0053:
            long r0 = r2.A01
            java.lang.Object r3 = r2.A04
            r22 = r3
            r3 = r22
            com.google.common.collect.ImmutableList r3 = (com.google.common.collect.ImmutableList) r3
            r22 = r3
            java.lang.Object r3 = r2.A03
            r20 = r3
            r3 = r20
            X.4xw r3 = (X.C279014xw) r3
            r20 = r3
            java.lang.Object r6 = r2.A02
            com.instagram.screentime.IGScreenTimeApi r6 = (com.instagram.screentime.IGScreenTimeApi) r6
            X.0eS.A00(r4)
            goto L_0x0632
        L_0x0072:
            X.0eS.A00(r4)
            com.instagram.common.session.UserSession r0 = r15.A02
            r42 = r0
            boolean r0 = r42.hasEnded()
            if (r0 == 0) goto L_0x0085
            r3 = 0
        L_0x0080:
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r3)
            return r21
        L_0x0085:
            com.instagram.screentime.storage.ScreenTimeDatabase r0 = r15.A08
            X.4xw r20 = r0.A00()
            long r28 = java.lang.System.currentTimeMillis()
            r16 = 1000(0x3e8, double:4.94E-321)
            long r28 = r28 / r16
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r0 = r0.getTime()
            long r0 = r0 / r16
            X.2MJ r32 = X.2MJ.A01
            X.0qQ.A07(r32)
            r18 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r23 = r46
            r5 = r32
            r3 = r23
            com.google.common.collect.ImmutableList r22 = r5.A00(r3)
            X.0qQ.A07(r22)
            X.2IV r8 = new X.2IV
            r8.<init>()
            java.lang.String r13 = ""
            r7 = 0
            r12 = 9
            r3 = 17
            java.lang.String r11 = X.C46325Dbt.A00(r7, r12, r3)
            r8.A09(r13, r11)
            java.lang.String r10 = java.lang.String.valueOf(r0)
            java.lang.String r9 = "device_timestamp"
            r8.A09(r10, r9)
            java.util.TimeZone r3 = java.util.TimeZone.getDefault()
            java.lang.String r3 = r3.getID()
            java.lang.String r5 = "device_timezone"
            r8.A09(r3, r5)
            java.lang.String r4 = java.lang.String.valueOf(r28)
            java.lang.String r3 = "tia_clock_timestamp"
            r8.A09(r4, r3)
            long r28 = r28 - r46
            java.lang.String r4 = java.lang.String.valueOf(r28)
            java.lang.String r3 = "window_size_seconds"
            r8.A09(r4, r3)
            java.lang.String r6 = r15.A09
            r31 = 10
            r4 = 79
            r3 = r31
            java.lang.String r3 = X.C46325Dbt.A00(r12, r3, r4)
            r8.A09(r6, r3)
            java.util.ArrayList r28 = new java.util.ArrayList
            r28.<init>()
            r22.size()
            X.3kO r14 = r22.iterator()
            X.0qQ.A07(r14)
        L_0x0110:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x0170
            java.lang.Object r12 = r14.next()
            X.5Iw r12 = (X.C283695Iw) r12
            org.json.JSONObject r3 = r12.A00()
            r3.toString()
            X.2IV r6 = new X.2IV
            r6.<init>()
            long r3 = r12.A03
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "startEvent"
            r6.A09(r4, r3)
            long r3 = r12.A05
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "startWalltime"
            r6.A09(r4, r3)
            long r3 = r12.A04
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "startUptime"
            r6.A09(r4, r3)
            long r3 = r12.A00
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "endEvent"
            r6.A09(r4, r3)
            long r3 = r12.A01
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "endUptime"
            r6.A09(r4, r3)
            long r3 = r12.A02
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "endWallTime"
            r6.A09(r4, r3)
            r3 = r28
            r3.add(r6)
            goto L_0x0110
        L_0x0170:
            X.2IV r6 = new X.2IV
            r6.<init>()
            r6.A09(r13, r11)
            r6.A09(r10, r9)
            java.util.TimeZone r3 = java.util.TimeZone.getDefault()
            java.lang.String r3 = r3.getID()
            r6.A09(r3, r5)
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 / r16
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "device_mtime"
            r6.A09(r4, r3)
            java.lang.String r4 = "V3"
            java.lang.String r3 = "version"
            r6.A09(r4, r3)
            X.4xq r3 = r15.A00
            java.util.List r4 = r3.A01()
            r3 = r31
            int r3 = X.0Yv.A1E(r4, r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r3)
            java.util.Iterator r11 = r4.iterator()
        L_0x01b1:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x01f9
            java.lang.Object r10 = r11.next()
            X.9Hz r10 = (X.C376439Hz) r10
            X.2IV r9 = new X.2IV
            r9.<init>()
            long r3 = r10.A04
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "start_timestamp"
            r9.A09(r4, r3)
            long r3 = r10.A02
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "end_timestamp"
            r9.A09(r4, r3)
            long r3 = r10.A03
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "start_mtime"
            r9.A09(r4, r3)
            long r3 = r10.A01
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "end_mtime"
            r9.A09(r4, r3)
            java.lang.String r4 = "FOREGROUND"
            java.lang.String r3 = "type"
            r9.A09(r4, r3)
            r5.add(r9)
            goto L_0x01b1
        L_0x01f9:
            X.4xq r3 = r15.A01
            java.util.List r4 = r3.A01()
            r3 = r31
            int r3 = X.0Yv.A1E(r4, r3)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r3)
            java.util.Iterator r12 = r4.iterator()
        L_0x020e:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x0256
            java.lang.Object r11 = r12.next()
            X.9Hz r11 = (X.C376439Hz) r11
            X.2IV r9 = new X.2IV
            r9.<init>()
            long r3 = r11.A04
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "start_timestamp"
            r9.A09(r4, r3)
            long r3 = r11.A02
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "end_timestamp"
            r9.A09(r4, r3)
            long r3 = r11.A03
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "start_mtime"
            r9.A09(r4, r3)
            long r3 = r11.A01
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "end_mtime"
            r9.A09(r4, r3)
            java.lang.String r4 = "VOIP"
            java.lang.String r3 = "type"
            r9.A09(r4, r3)
            r10.add(r9)
            goto L_0x020e
        L_0x0256:
            java.util.ArrayList r3 = X.00k.A0S(r10, r5)
            java.lang.String r4 = "intervals"
            r6.A05(r4, r3)
            X.0K0 r30 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r35 = 0
            java.lang.String r3 = "trigger_reason"
            X.0Df r11 = r30.A02()
            r5 = r44
            X.0Df.A00(r11, r5, r3)
            r3 = r28
            r8.A05(r4, r3)
            java.lang.String r4 = "tia_payload"
            X.0Df r3 = r8.A02()
            r11.A0E(r3, r4)
            java.lang.String r4 = "ig_intervals_payload"
            X.0Df r3 = r6.A02()
            r11.A0E(r3, r4)
            X.0Tu r6 = X.0Tu.A05
            r3 = 36325038093709890(0x810d6e00073242, double:3.0354385874256004E-306)
            r5 = r42
            boolean r3 = X.182.A06(r6, r5, r3)
            if (r3 == 0) goto L_0x0429
            r4 = 40
            X.Iw0 r5 = new X.Iw0
            r3 = r42
            r5.<init>(r4, r15, r3)
            java.lang.Class<X.HlD> r29 = X.C55654HlD.class
            r4 = r3
            r3 = r29
            java.lang.Object r3 = r4.A01(r3, r5)
            X.HlD r3 = (X.C55654HlD) r3
            com.instagram.screentime.IGScreenTimeApi r4 = r3.A00
            java.util.concurrent.atomic.AtomicReference r3 = r4.A05
            java.lang.Object r14 = r3.get()
            X.3lr r14 = (X.C250663lr) r14
            java.util.concurrent.atomic.AtomicLong r3 = r4.A04
            long r8 = r3.get()
            if (r14 == 0) goto L_0x03c9
            java.lang.Class<X.5O9> r13 = X.AnonymousClass5O9.class
            java.lang.String r12 = "screen_time_sync(data:$data)"
            r3 = -993905351(0xffffffffc4c23539, float:-1553.6632)
            X.3lr r4 = r14.getOptionalTreeField(r7, r12, r13, r3)
            r10 = -1
            if (r4 == 0) goto L_0x03c9
            java.lang.Class<X.5OA> r6 = X.AnonymousClass5OA.class
            java.lang.String r5 = "aggs"
            r3 = -1135128144(0xffffffffbc5751b0, float:-0.013142034)
            X.3lr r3 = r4.getOptionalTreeField(r7, r5, r6, r3)
            if (r3 == 0) goto L_0x03c9
            java.lang.String r4 = "today_s"
            int r3 = r3.getCoercedIntField(r7, r4)
            if (r3 == r10) goto L_0x03c9
            r3 = -993905351(0xffffffffc4c23539, float:-1553.6632)
            X.3lr r10 = r14.getOptionalTreeField(r7, r12, r13, r3)
            if (r10 == 0) goto L_0x030c
            r3 = -1135128144(0xffffffffbc5751b0, float:-0.013142034)
            X.3lr r3 = r10.getOptionalTreeField(r7, r5, r6, r3)
            if (r3 == 0) goto L_0x030c
            int r28 = r3.getCoercedIntField(r7, r4)
        L_0x02f3:
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            long r3 = r3.getTime()
            long r3 = r3 / r16
            r5 = r32
            java.util.concurrent.atomic.AtomicReference r5 = r5.A00
            java.lang.Object r6 = r5.get()
            X.2ML r6 = (X.AnonymousClass2ML) r6
            if (r6 == 0) goto L_0x0313
            monitor-enter(r6)
            goto L_0x030f
        L_0x030c:
            r28 = 0
            goto L_0x02f3
        L_0x030f:
            com.facebook.wellbeing.timeinapp.jnibindings.TimeInAppControllerWrapper r5 = r6.A00     // Catch:{ all -> 0x064f }
            monitor-exit(r6)     // Catch:{ all -> 0x064f }
            goto L_0x0318
        L_0x0313:
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.of()
            goto L_0x031e
        L_0x0318:
            if (r5 == 0) goto L_0x0313
            com.google.common.collect.ImmutableList r4 = r5.queryIntervals(r8, r3)
        L_0x031e:
            X.0qQ.A07(r4)
            r3 = r31
            int r3 = X.0Yv.A1E(r4, r3)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r3)
            java.util.Iterator r13 = r4.iterator()
        L_0x0330:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x0351
            java.lang.Object r3 = r13.next()
            X.V3M r3 = (X.V3M) r3
            long r5 = r3.A01
            long r3 = r3.A00
            X.9c4 r10 = new X.9c4
            r36 = r10
            r37 = r5
            r39 = r3
            r41 = r7
            r36.<init>(r37, r39, r41)
            r12.add(r10)
            goto L_0x0330
        L_0x0351:
            X.ArF r3 = new X.ArF
            r3.<init>()
            java.util.List r4 = X.00k.A0g(r12, r3)
            r3 = r31
            int r3 = X.0Yv.A1E(r4, r3)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r3)
            java.util.Iterator r12 = r4.iterator()
        L_0x0369:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x0390
            java.lang.Object r5 = r12.next()
            X.9c4 r5 = (X.C381629c4) r5
            long r3 = r5.A01
            long r37 = java.lang.Math.max(r8, r3)
            long r5 = r5.A00
            r3 = r18
            long r39 = java.lang.Math.min(r3, r5)
            X.9c4 r3 = new X.9c4
            r36 = r3
            r41 = r7
            r36.<init>(r37, r39, r41)
            r10.add(r3)
            goto L_0x0369
        L_0x0390:
            boolean r3 = r10.isEmpty()
            r5 = 0
            if (r3 != 0) goto L_0x0402
            java.lang.Object r3 = r10.get(r7)
            X.9c4 r3 = (X.C381629c4) r3
            long r3 = r3.A01
            long r3 = java.lang.Math.max(r3, r8)
            java.util.Iterator r14 = r10.iterator()
        L_0x03a8:
            boolean r7 = r14.hasNext()
            if (r7 == 0) goto L_0x0402
            java.lang.Object r7 = r14.next()
            X.9c4 r7 = (X.C381629c4) r7
            long r9 = r7.A01
            long r7 = r7.A00
            long r12 = java.lang.Math.max(r3, r9)
            int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r9 <= 0) goto L_0x03a8
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 <= 0) goto L_0x03a8
            long r3 = r7 - r12
            long r5 = r5 + r3
            r3 = r7
            goto L_0x03a8
        L_0x03c9:
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            r3 = 14
            r4.set(r3, r7)
            r3 = 13
            r4.set(r3, r7)
            r3 = 12
            r4.set(r3, r7)
            r3 = 11
            r4.set(r3, r7)
            r4.getTimeInMillis()
            long r3 = r4.getTimeInMillis()
            long r3 = r3 / r16
            r5 = r32
            int[] r4 = r5.A03(r3)
            X.0qQ.A07(r4)
            int r3 = r4.length
            if (r3 != 0) goto L_0x03fb
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            goto L_0x0409
        L_0x03fb:
            r3 = r4[r7]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            goto L_0x0409
        L_0x0402:
            int r3 = (int) r5
            int r28 = r28 + r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r28)
        L_0x0409:
            java.lang.String r3 = "today_s"
            X.0Df r5 = r30.A02()
            X.0Df.A00(r5, r4, r3)
            int r3 = (int) r0
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r3)
            java.lang.String r3 = "last_sync_timestamp"
            X.0Df.A00(r5, r4, r3)
            java.lang.String r3 = "screentime_snapshot_payload"
            r11.A0E(r5, r3)
            r4 = r42
            r3 = r29
            r4.A03(r3)
        L_0x0429:
            long r5 = r15.A06
            r3 = r23
            long r3 = java.lang.Math.max(r3, r5)
            r5 = 2
            long r3 = r3 - r5
            X.5Ix r5 = X.C283705Ix.A01
            r6 = r42
            java.util.List r6 = r5.A00(r6, r3)
            if (r6 == 0) goto L_0x04db
            boolean r7 = r6.isEmpty()
            r7 = r7 ^ 1
            if (r7 == 0) goto L_0x04db
            X.2IV r8 = new X.2IV
            r8.<init>()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "from_timestamp"
            r8.A09(r4, r3)
            r3 = r31
            int r3 = X.0Yv.A1E(r6, r3)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r3)
            java.util.Iterator r10 = r6.iterator()
        L_0x0463:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x048a
            java.lang.Object r9 = r10.next()
            X.Gmt r9 = (X.C53369Gmt) r9
            X.2IV r6 = new X.2IV
            r6.<init>()
            long r3 = r9.A00
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "timestamp"
            r6.A09(r4, r3)
            java.lang.String r4 = r9.A01
            java.lang.String r3 = "type"
            r6.A09(r4, r3)
            r7.add(r6)
            goto L_0x0463
        L_0x048a:
            java.lang.String r3 = "events"
            r8.A05(r3, r7)
            java.util.concurrent.atomic.AtomicBoolean r9 = r15.A0A
            boolean r3 = r9.get()
            if (r3 != 0) goto L_0x04d2
            X.2IV r7 = new X.2IV
            r7.<init>()
            r3 = 60
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r3)
            java.lang.String r3 = "window_minutes"
            r7.A07(r4, r3)
            long r18 = java.lang.System.currentTimeMillis()
            long r18 = r18 / r16
            r28 = 3600(0xe10, double:1.7786E-320)
            long r18 = r18 / r28
            long r18 = r18 * r28
            r12 = 86400(0x15180, double:4.26873E-319)
            long r3 = r18 - r12
            r6 = r42
            java.util.List r3 = r5.A00(r6, r3)
            if (r3 != 0) goto L_0x0538
            X.0sn r12 = X.0sn.A00
        L_0x04c3:
            java.lang.String r3 = "items"
            r7.A05(r3, r12)
            java.lang.String r3 = "aggs"
            r8.A06(r7, r3)
            r3 = r27
            r9.set(r3)
        L_0x04d2:
            java.lang.String r4 = "android_usage_stats_payload"
            X.0Df r3 = r8.A02()
            r11.A0E(r3, r4)
        L_0x04db:
            X.2IS r4 = new X.2IS
            r4.<init>()
            X.2IS r6 = new X.2IS
            r6.<init>()
            java.lang.String r5 = "data"
            X.2IV r3 = r4.A00
            X.0Df r3 = r3.A02()
            r3.A0E(r11, r5)
            X.2IY r3 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r29 = X.AnonymousClass1vS.A00()
            java.util.Map r31 = r4.getParamsCopy()
            java.util.Map r32 = r6.getParamsCopy()
            java.lang.Class<X.5Iy> r33 = X.C283715Iy.class
            java.util.ArrayList r39 = new java.util.ArrayList
            r39.<init>()
            java.lang.String r30 = "ScreenTimeSyncMutation"
            r36 = 96
            java.lang.String r38 = "screen_time_sync"
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r28 = r3
            r34 = r27
            r37 = r35
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            java.util.concurrent.atomic.AtomicLong r4 = r15.A03
            r4.set(r0)
            X.1vn r5 = X.1vm.A01(r42)
            r2.A02 = r15
            r4 = r20
            r2.A03 = r4
            r4 = r22
            r2.A04 = r4
            r2.A01 = r0
            r4 = r27
            r2.A00 = r4
            java.lang.Object r4 = r5.A04(r3, r2)
            r3 = r21
            if (r4 != r3) goto L_0x0631
            return r21
        L_0x0538:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r12 = r3.iterator()
        L_0x0541:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x0558
            java.lang.Object r5 = r12.next()
            r3 = r5
            X.Gmt r3 = (X.C53369Gmt) r3
            long r3 = r3.A00
            int r10 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r10 >= 0) goto L_0x0541
            r6.add(r5)
            goto L_0x0541
        L_0x0558:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Iterator r10 = r6.iterator()
        L_0x0561:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x058c
            java.lang.Object r6 = r10.next()
            r3 = r6
            X.Gmt r3 = (X.C53369Gmt) r3
            long r3 = r3.A00
            long r3 = r3 / r28
            long r3 = r3 * r28
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r5.get(r4)
            if (r3 != 0) goto L_0x0586
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5.put(r4, r3)
        L_0x0586:
            java.util.List r3 = (java.util.List) r3
            r3.add(r6)
            goto L_0x0561
        L_0x058c:
            int r3 = r5.size()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r3)
            java.util.Set r3 = r5.entrySet()
            java.util.Iterator r19 = r3.iterator()
        L_0x059d:
            boolean r3 = r19.hasNext()
            if (r3 == 0) goto L_0x04c3
            java.lang.Object r5 = r19.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            X.2IV r10 = new X.2IV
            r10.<init>()
            java.lang.Object r3 = r5.getKey()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "start"
            r10.A09(r4, r3)
            java.lang.Object r3 = r5.getKey()
            java.lang.Number r3 = (java.lang.Number) r3
            long r23 = r3.longValue()
            java.lang.Object r3 = r5.getKey()
            java.lang.Number r3 = (java.lang.Number) r3
            long r17 = r3.longValue()
            long r17 = r17 + r28
            java.lang.Object r3 = r5.getValue()
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r16 = r3.iterator()
            r5 = 0
        L_0x05e3:
            r14 = r35
        L_0x05e5:
            boolean r3 = r16.hasNext()
            if (r3 == 0) goto L_0x0618
            java.lang.Object r13 = r16.next()
            X.Gmt r13 = (X.C53369Gmt) r13
            java.lang.String r4 = r13.A01
            java.lang.String r3 = "2"
            boolean r3 = X.0qQ.A0K(r4, r3)
            if (r3 == 0) goto L_0x0609
            long r3 = r13.A00
            if (r14 == 0) goto L_0x0606
            long r13 = r14.longValue()
        L_0x0603:
            long r3 = r3 - r13
            long r5 = r5 + r3
            goto L_0x05e3
        L_0x0606:
            r13 = r23
            goto L_0x0603
        L_0x0609:
            java.lang.String r3 = "1"
            boolean r3 = X.0qQ.A0K(r4, r3)
            if (r3 == 0) goto L_0x05e5
            long r3 = r13.A00
            java.lang.Long r14 = java.lang.Long.valueOf(r3)
            goto L_0x05e5
        L_0x0618:
            if (r14 == 0) goto L_0x0622
            long r3 = r14.longValue()
            long r17 = r17 - r3
            long r5 = r5 + r17
        L_0x0622:
            int r3 = (int) r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = "total_seconds"
            r10.A07(r4, r3)
            r12.add(r10)
            goto L_0x059d
        L_0x0631:
            r6 = r15
        L_0x0632:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r3 = r4 instanceof X.C239793Ih
            if (r3 == 0) goto L_0x0639
            goto L_0x0652
        L_0x0639:
            r3 = 0
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x06ef
            X.5sO r4 = (X.C297815sO) r4
            java.lang.Object r0 = r4.A00
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "GraphQl error"
            r0 = r25
            X.0KC.A0O(r0, r1, r2)
            goto L_0x0080
        L_0x064f:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x064f }
            throw r1
        L_0x0652:
            X.3Ih r4 = (X.C239793Ih) r4     // Catch:{ Exception -> 0x06e1 }
            java.lang.Object r5 = r4.A00     // Catch:{ Exception -> 0x06e1 }
            X.3JC r5 = (X.AnonymousClass3JC) r5     // Catch:{ Exception -> 0x06e1 }
            java.util.concurrent.atomic.AtomicReference r4 = r6.A05     // Catch:{ Exception -> 0x06e1 }
            java.lang.Object r3 = r5.A01     // Catch:{ Exception -> 0x06e1 }
            r4.set(r3)     // Catch:{ Exception -> 0x06e1 }
            java.lang.Object r3 = X.00k.A0L(r22)     // Catch:{ Exception -> 0x06e1 }
            X.5Iw r3 = (X.C283695Iw) r3     // Catch:{ Exception -> 0x06e1 }
            if (r3 == 0) goto L_0x0678
            long r3 = r3.A02     // Catch:{ Exception -> 0x06e1 }
            java.lang.Long r7 = new java.lang.Long     // Catch:{ Exception -> 0x06e1 }
            r7.<init>(r3)     // Catch:{ Exception -> 0x06e1 }
        L_0x066e:
            r3 = 0
            X.5Iu r8 = new X.5Iu     // Catch:{ Exception -> 0x06e1 }
            r8.<init>(r7, r3, r0)     // Catch:{ Exception -> 0x06e1 }
            X.4xq r4 = r6.A00     // Catch:{ Exception -> 0x06e1 }
            monitor-enter(r4)     // Catch:{ Exception -> 0x06e1 }
            goto L_0x067a
        L_0x0678:
            r7 = 0
            goto L_0x066e
        L_0x067a:
            java.util.List r3 = r4.A01     // Catch:{ all -> 0x06de }
            r3.clear()     // Catch:{ all -> 0x06de }
            monitor-exit(r4)     // Catch:{ Exception -> 0x06e1 }
            X.4xq r4 = r6.A01     // Catch:{ Exception -> 0x06e1 }
            monitor-enter(r4)     // Catch:{ Exception -> 0x06e1 }
            java.util.List r3 = r4.A01     // Catch:{ all -> 0x06de }
            r3.clear()     // Catch:{ all -> 0x06de }
            monitor-exit(r4)     // Catch:{ Exception -> 0x06e1 }
            r2.A02 = r6     // Catch:{ Exception -> 0x06e1 }
            r2.A03 = r5     // Catch:{ Exception -> 0x06e1 }
            r2.A04 = r8     // Catch:{ Exception -> 0x06e1 }
            r2.A01 = r0     // Catch:{ Exception -> 0x06e1 }
            r3 = r26
            r2.A00 = r3     // Catch:{ Exception -> 0x06e1 }
            r3 = r20
            X.3oI r7 = r3.A01     // Catch:{ Exception -> 0x06e1 }
            X.5O5 r4 = new X.5O5     // Catch:{ Exception -> 0x06e1 }
            r4.<init>(r3, r8)     // Catch:{ Exception -> 0x06e1 }
            java.lang.Object r3 = X.AnonymousClass1t4.A00(r7, r2, r4)     // Catch:{ Exception -> 0x06e1 }
            r2 = r21
            if (r3 != r2) goto L_0x06aa
            return r21
        L_0x06a7:
            X.0eS.A00(r4)     // Catch:{ Exception -> 0x06e1 }
        L_0x06aa:
            java.util.concurrent.atomic.AtomicLong r2 = r6.A04     // Catch:{ Exception -> 0x06e1 }
            r2.set(r0)     // Catch:{ Exception -> 0x06e1 }
            java.lang.Object r3 = r5.A01     // Catch:{ Exception -> 0x06e1 }
            X.5Iy r3 = (X.C283715Iy) r3     // Catch:{ Exception -> 0x06e1 }
            if (r3 == 0) goto L_0x06d9
            java.lang.Class<X.5O9> r2 = X.AnonymousClass5O9.class
            r4 = 0
            java.lang.String r1 = "screen_time_sync(data:$data)"
            r0 = -993905351(0xffffffffc4c23539, float:-1553.6632)
            X.3lr r3 = r3.getOptionalTreeField(r4, r1, r2, r0)     // Catch:{ Exception -> 0x06e1 }
            X.5O9 r3 = (X.AnonymousClass5O9) r3     // Catch:{ Exception -> 0x06e1 }
            if (r3 == 0) goto L_0x06d9
            java.lang.Class<X.5OA> r2 = X.AnonymousClass5OA.class
            java.lang.String r1 = "aggs"
            r0 = -1135128144(0xffffffffbc5751b0, float:-0.013142034)
            X.3lr r1 = r3.getOptionalTreeField(r4, r1, r2, r0)     // Catch:{ Exception -> 0x06e1 }
            X.5OA r1 = (X.AnonymousClass5OA) r1     // Catch:{ Exception -> 0x06e1 }
            if (r1 == 0) goto L_0x06d9
            java.lang.String r0 = "today_s"
            r1.getCoercedIntField(r4, r0)     // Catch:{ Exception -> 0x06e1 }
        L_0x06d9:
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r27)     // Catch:{ Exception -> 0x06e1 }
            return r21
        L_0x06de:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ Exception -> 0x06e1 }
            throw r0     // Catch:{ Exception -> 0x06e1 }
        L_0x06e1:
            r2 = move-exception
            java.lang.String r1 = "Error while processing response"
            r0 = r25
            X.0KC.A0F(r0, r1, r2)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x06ef:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.screentime.IGScreenTimeApi.A01(java.lang.String, X.4D7, long):java.lang.Object");
    }
}
