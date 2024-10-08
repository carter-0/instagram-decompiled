package X;

import android.content.Context;
import com.facebook.mqtt.service.ConnectionConfig;
import com.facebook.xanalytics.XAnalyticsAdapter;
import com.instagram.distribgw.client.DGWClientHolder;

/* renamed from: X.450  reason: invalid class name */
public final class AnonymousClass450 extends AnonymousClass451 {
    public ConnectionConfig A00;
    public boolean A01;
    public final Context A02;
    public final AnonymousClass4Uw A03;
    public final AnonymousClass459 A04;
    public final C270604h0 A05;
    public final XAnalyticsAdapter A06;
    public final DGWClientHolder A07;
    public final String A08;

    public AnonymousClass450(Context context, AnonymousClass4Uw r8, C270604h0 r9, XAnalyticsAdapter xAnalyticsAdapter, DGWClientHolder dGWClientHolder, String str, String str2, String str3, String str4) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        A01();
        this.A02 = context;
        this.A07 = dGWClientHolder;
        this.A05 = r9;
        this.A06 = xAnalyticsAdapter;
        this.A08 = str4;
        this.A03 = r8;
        Integer num = AnonymousClass05K.A00;
        this.A04 = new AnonymousClass459(context, ((AnonymousClass3RX) AnonymousClass3RD.A00).A02(), AnonymousClass458.A00, this, num);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f A[Catch:{ NumberFormatException -> 0x028f }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b A[Catch:{ NumberFormatException -> 0x028f }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053 A[Catch:{ NumberFormatException -> 0x028f }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0177 A[Catch:{ NumberFormatException -> 0x028f }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x022a A[SYNTHETIC, Splitter:B:69:0x022a] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x027a A[SYNTHETIC, Splitter:B:94:0x027a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.facebook.mqtt.service.ConnectionConfig A05(X.C2596342l r68, X.C2602044r r69, X.C2602144s r70, java.util.concurrent.Executor r71) {
        /*
            r67 = this;
            r1 = r67
            monitor-enter(r1)
            r32 = 0
            r4 = 3
            r37 = r71
            r0 = r37
            X.0qQ.A0B(r0, r4)     // Catch:{ all -> 0x029a }
            java.util.Map r21 = r68.getAppSpecificInfo()     // Catch:{ all -> 0x029a }
            r38 = 0
            X.453 r2 = r1.A00     // Catch:{ all -> 0x029a }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x029a }
            java.lang.String r36 = ""
            r7 = r36
            java.lang.String r11 = "XplatMqttConfigManager"
            android.content.Context r0 = r1.A02     // Catch:{ IOException -> 0x0029, SecurityException -> 0x002d }
            java.io.File r0 = r0.getCacheDir()     // Catch:{ IOException -> 0x0029, SecurityException -> 0x002d }
            java.lang.String r36 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x0029, SecurityException -> 0x002d }
            goto L_0x0033
        L_0x0029:
            r3 = move-exception
            java.lang.String r0 = "IOException getting cache dir"
            goto L_0x0030
        L_0x002d:
            r3 = move-exception
            java.lang.String r0 = "SecurityException getting cache dir"
        L_0x0030:
            X.0KC.A0G(r11, r0, r3)     // Catch:{ all -> 0x029a }
        L_0x0033:
            java.lang.String r3 = "User-Agent"
            r0 = r21
            java.lang.Object r10 = r0.get(r3)     // Catch:{ all -> 0x029a }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x029a }
            if (r10 != 0) goto L_0x0041
            java.lang.String r10 = "Instagram"
        L_0x0041:
            android.content.Context r0 = r1.A02     // Catch:{ all -> 0x029a }
            boolean r0 = X.AnonymousClass45S.A00(r0)     // Catch:{ all -> 0x029a }
            r25 = 2
            if (r0 == 0) goto L_0x004d
            r25 = 1
        L_0x004d:
            com.instagram.distribgw.client.DGWClientHolder r3 = r1.A07     // Catch:{ all -> 0x029a }
            r0 = r69
            if (r3 == 0) goto L_0x0177
            com.facebook.distribgw.client.DGWClient r3 = r3.client     // Catch:{ all -> 0x029a }
            r24 = r3
            X.4h0 r6 = r1.A05     // Catch:{ all -> 0x029a }
            java.lang.String r3 = r1.A08     // Catch:{ all -> 0x029a }
            r20 = r3
            if (r3 != 0) goto L_0x0061
            r20 = r7
        L_0x0061:
            X.0nl r3 = X.C61560nl.A00()     // Catch:{ all -> 0x029a }
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = r3.A00     // Catch:{ all -> 0x029a }
            r23 = r3
            X.0qQ.A07(r23)     // Catch:{ all -> 0x029a }
            com.facebook.xanalytics.XAnalyticsAdapterHolder r3 = com.facebook.xanalytics.XAnalyticsAdapterHolder.$redex_init_class     // Catch:{ all -> 0x029a }
            com.facebook.xanalytics.XAnalyticsAdapter r5 = r1.A06     // Catch:{ all -> 0x029a }
            com.facebook.xanalytics.XAnalyticsAdapterHolder r19 = new com.facebook.xanalytics.XAnalyticsAdapterHolder     // Catch:{ all -> 0x029a }
            r3 = r19
            r3.<init>(r5)     // Catch:{ all -> 0x029a }
            r3 = r24
            X.0qQ.A0B(r3, r4)     // Catch:{ all -> 0x029a }
            X.42j r3 = r0.A0A     // Catch:{ all -> 0x029a }
            java.lang.Object r14 = r3.first     // Catch:{ all -> 0x029a }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x029a }
            X.0qQ.A07(r14)     // Catch:{ all -> 0x029a }
            X.42j r3 = r0.A0A     // Catch:{ all -> 0x029a }
            java.lang.Object r12 = r3.second     // Catch:{ all -> 0x029a }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x029a }
            X.0qQ.A07(r12)     // Catch:{ all -> 0x029a }
            X.0qQ.A0A(r10)     // Catch:{ all -> 0x029a }
            java.lang.String r3 = r0.A08     // Catch:{ all -> 0x029a }
            r18 = r3
            if (r3 != 0) goto L_0x0099
            r18 = r7
        L_0x0099:
            java.lang.String r48 = r68.getRequestRoutingRegion()     // Catch:{ all -> 0x029a }
            boolean r3 = r1.A01     // Catch:{ all -> 0x029a }
            r22 = r3
            java.util.Map r4 = r68.getAppSpecificInfo()     // Catch:{ all -> 0x029a }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>"
            X.0qQ.A0C(r4, r3)     // Catch:{ all -> 0x029a }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x029a }
            r3.<init>(r4)     // Catch:{ all -> 0x029a }
            java.lang.String r66 = r3.toString()     // Catch:{ all -> 0x029a }
            X.0qQ.A07(r66)     // Catch:{ all -> 0x029a }
            r42 = 6
            if (r6 != 0) goto L_0x00bd
            r5 = 0
            goto L_0x0179
        L_0x00bd:
            java.lang.String r7 = "MqttBypass"
            java.lang.String r15 = r6.A05     // Catch:{ all -> 0x0175 }
            java.lang.String r13 = r6.A04     // Catch:{ all -> 0x0175 }
            java.util.HashSet r17 = new java.util.HashSet     // Catch:{ all -> 0x0175 }
            r17.<init>()     // Catch:{ all -> 0x0175 }
            java.util.HashSet r16 = new java.util.HashSet     // Catch:{ all -> 0x0175 }
            r16.<init>()     // Catch:{ all -> 0x0175 }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00e8 }
            r5.<init>(r15)     // Catch:{ JSONException -> 0x00e8 }
            int r9 = r5.length()     // Catch:{ JSONException -> 0x00e8 }
            r4 = 0
        L_0x00d7:
            if (r4 >= r9) goto L_0x00f2
            java.lang.String r8 = r5.getString(r4)     // Catch:{ JSONException -> 0x00e8 }
            X.0qQ.A07(r8)     // Catch:{ JSONException -> 0x00e8 }
            r3 = r17
            r3.add(r8)     // Catch:{ JSONException -> 0x00e8 }
            int r4 = r4 + 1
            goto L_0x00d7
        L_0x00e8:
            r5 = move-exception
            java.lang.String r4 = "MqttBypass unable to parse enabled publish topics %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r15}     // Catch:{ all -> 0x0175 }
            X.0KC.A0L(r7, r4, r5, r3)     // Catch:{ all -> 0x0175 }
        L_0x00f2:
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x010d }
            r5.<init>(r13)     // Catch:{ JSONException -> 0x010d }
            int r9 = r5.length()     // Catch:{ JSONException -> 0x010d }
            r4 = 0
        L_0x00fc:
            if (r4 >= r9) goto L_0x0117
            java.lang.String r8 = r5.getString(r4)     // Catch:{ JSONException -> 0x010d }
            X.0qQ.A07(r8)     // Catch:{ JSONException -> 0x010d }
            r3 = r16
            r3.add(r8)     // Catch:{ JSONException -> 0x010d }
            int r4 = r4 + 1
            goto L_0x00fc
        L_0x010d:
            r5 = move-exception
            java.lang.String r4 = "MqttBypass unable to parse enabled subscribe topics %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r15}     // Catch:{ all -> 0x0175 }
            X.0KC.A0L(r7, r4, r5, r3)     // Catch:{ all -> 0x0175 }
        L_0x0117:
            boolean r3 = r6.A0A     // Catch:{ all -> 0x0175 }
            r15 = r3
            int r13 = r6.A00     // Catch:{ all -> 0x0175 }
            int r9 = r6.A03     // Catch:{ all -> 0x0175 }
            int r8 = r6.A02     // Catch:{ all -> 0x0175 }
            int r7 = r6.A01     // Catch:{ all -> 0x0175 }
            boolean r5 = r6.A09     // Catch:{ all -> 0x0175 }
            boolean r4 = r6.A06     // Catch:{ all -> 0x0175 }
            boolean r3 = r6.A08     // Catch:{ all -> 0x0175 }
            r64 = 0
            if (r3 != 0) goto L_0x012e
            r64 = 1
        L_0x012e:
            boolean r3 = r6.A07     // Catch:{ all -> 0x0175 }
            r46 = 23
            com.facebook.mqttbypass.implementation.MqttBypassConfig r39 = new com.facebook.mqttbypass.implementation.MqttBypassConfig     // Catch:{ all -> 0x0175 }
            r40 = r14
            r41 = r12
            r43 = r10
            r44 = r18
            r45 = r20
            r49 = r17
            r50 = r16
            r51 = r24
            r52 = r23
            r53 = r19
            r54 = r38
            r55 = r15
            r56 = r13
            r57 = r9
            r58 = r8
            r59 = r7
            r60 = r25
            r61 = r22
            r62 = r5
            r63 = r4
            r65 = r3
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)     // Catch:{ all -> 0x0175 }
            com.facebook.jni.HybridData r3 = com.facebook.mqttbypass.implementation.MqttBypassClientHolder.initHybrid(r39)     // Catch:{ all -> 0x0175 }
            if (r3 == 0) goto L_0x016d
            com.facebook.mqttbypass.implementation.MqttBypassClientHolder r5 = new com.facebook.mqttbypass.implementation.MqttBypassClientHolder     // Catch:{ all -> 0x0175 }
            r5.<init>(r3)     // Catch:{ all -> 0x0175 }
            goto L_0x0179
        L_0x016d:
            java.lang.String r2 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0175 }
            r0.<init>(r2)     // Catch:{ all -> 0x0175 }
            throw r0     // Catch:{ all -> 0x0175 }
        L_0x0175:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x029a }
        L_0x0177:
            r5 = r38
        L_0x0179:
            X.42j r3 = r0.A0A     // Catch:{ all -> 0x029a }
            java.lang.Object r4 = r3.first     // Catch:{ all -> 0x029a }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x029a }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x029a }
            X.42j r3 = r0.A0A     // Catch:{ all -> 0x029a }
            java.lang.Object r3 = r3.second     // Catch:{ all -> 0x029a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x029a }
            java.lang.String r6 = r2.A0T     // Catch:{ all -> 0x029a }
            r20 = r6
            X.0qQ.A06(r20)     // Catch:{ all -> 0x029a }
            r6 = r68
            X.42k r6 = (X.C2596242k) r6     // Catch:{ all -> 0x029a }
            java.lang.String r6 = r6.mFallbackHostName     // Catch:{ all -> 0x029a }
            r18 = r6
            int r6 = r2.A0N     // Catch:{ all -> 0x029a }
            r19 = r6
            java.lang.String r6 = r0.A08     // Catch:{ all -> 0x029a }
            r65 = r6
            java.lang.String r22 = "cookie_auth"
            java.lang.String r2 = r2.A0U     // Catch:{ all -> 0x029a }
            r17 = r2
            java.lang.String r24 = "567067343352427"
            r28 = 0
            java.lang.String r30 = r68.getRequestRoutingRegion()     // Catch:{ all -> 0x029a }
            r6 = r70
            boolean r2 = r6.A07     // Catch:{ all -> 0x029a }
            r16 = r2
            boolean r15 = r1.A01     // Catch:{ all -> 0x029a }
            java.util.List r0 = r0.A09     // Catch:{ all -> 0x029a }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x029a }
            r2.<init>(r0)     // Catch:{ all -> 0x029a }
            int r14 = r6.A02     // Catch:{ all -> 0x029a }
            int r13 = r6.A01     // Catch:{ all -> 0x029a }
            int r12 = r6.A03     // Catch:{ all -> 0x029a }
            int r9 = r6.A00     // Catch:{ all -> 0x029a }
            int r8 = r6.A06     // Catch:{ all -> 0x029a }
            int r7 = r6.A05     // Catch:{ all -> 0x029a }
            int r6 = r6.A04     // Catch:{ all -> 0x029a }
            r58 = 0
            r62 = -134217728(0xfffffffff8000000, float:-1.0384594E34)
            r63 = 923(0x39b, float:1.293E-42)
            r26 = 23
            com.facebook.mqtt.service.ConnectionConfig r0 = new com.facebook.mqtt.service.ConnectionConfig     // Catch:{ all -> 0x029a }
            r23 = r17
            r31 = r16
            r33 = r15
            r34 = r2
            r35 = r21
            r39 = r14
            r40 = r13
            r41 = r12
            r42 = r9
            r43 = r8
            r44 = r7
            r45 = r32
            r46 = r32
            r47 = r32
            r48 = r32
            r49 = r38
            r50 = r32
            r51 = r32
            r52 = r5
            r53 = r32
            r54 = r38
            r55 = r18
            r56 = r6
            r57 = r32
            r60 = r58
            r64 = r38
            r16 = r4
            r17 = r3
            r18 = r20
            r20 = r10
            r21 = r65
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r60, r62, r63, r64)     // Catch:{ all -> 0x029a }
            java.lang.String r2 = r0.userId     // Catch:{ NumberFormatException -> 0x028f }
            if (r2 == 0) goto L_0x027a
            boolean r2 = X.00l.A0W(r2)     // Catch:{ NumberFormatException -> 0x028f }
            if (r2 != 0) goto L_0x027a
            java.lang.String r2 = r0.userId     // Catch:{ NumberFormatException -> 0x028f }
            long r3 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x028f }
            int r2 = (r3 > r28 ? 1 : (r3 == r28 ? 0 : -1))
            if (r2 == 0) goto L_0x027a
            java.lang.String r2 = r0.deviceId     // Catch:{ all -> 0x029a }
            if (r2 == 0) goto L_0x0265
            boolean r2 = X.00l.A0W(r2)     // Catch:{ all -> 0x029a }
            if (r2 != 0) goto L_0x0265
            java.lang.String r2 = r0.appId     // Catch:{ all -> 0x029a }
            if (r2 == 0) goto L_0x0265
            boolean r2 = X.00l.A0W(r2)     // Catch:{ all -> 0x029a }
            if (r2 != 0) goto L_0x0265
            java.lang.String r2 = r0.userAgent     // Catch:{ all -> 0x029a }
            if (r2 == 0) goto L_0x0265
            boolean r2 = X.00l.A0W(r2)     // Catch:{ all -> 0x029a }
            if (r2 != 0) goto L_0x0265
            java.lang.String r2 = r0.password     // Catch:{ all -> 0x029a }
            if (r2 == 0) goto L_0x0265
            boolean r2 = X.00l.A0W(r2)     // Catch:{ all -> 0x029a }
            if (r2 != 0) goto L_0x0265
            java.lang.String r2 = r0.cacheDir     // Catch:{ all -> 0x029a }
            if (r2 == 0) goto L_0x0265
            boolean r2 = X.00l.A0W(r2)     // Catch:{ all -> 0x029a }
            if (r2 != 0) goto L_0x0265
            com.facebook.mqtt.service.ConnectionConfig r2 = r1.A00     // Catch:{ all -> 0x029a }
            boolean r2 = X.AnonymousClass45T.A00(r0, r2)     // Catch:{ all -> 0x029a }
            if (r2 != 0) goto L_0x0265
            goto L_0x0296
        L_0x0265:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x029a }
            r3.<init>()     // Catch:{ all -> 0x029a }
            java.lang.String r2 = "Connection config is invalid "
            r3.append(r2)     // Catch:{ all -> 0x029a }
            r3.append(r0)     // Catch:{ all -> 0x029a }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x029a }
            X.0KC.A0C(r11, r0)     // Catch:{ all -> 0x029a }
            goto L_0x0298
        L_0x027a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x028f }
            r3.<init>()     // Catch:{ NumberFormatException -> 0x028f }
            java.lang.String r2 = "Connection config have invalid user id "
            r3.append(r2)     // Catch:{ NumberFormatException -> 0x028f }
            r3.append(r0)     // Catch:{ NumberFormatException -> 0x028f }
            java.lang.String r0 = r3.toString()     // Catch:{ NumberFormatException -> 0x028f }
            X.0KC.A0C(r11, r0)     // Catch:{ NumberFormatException -> 0x028f }
            goto L_0x0298
        L_0x028f:
            r2 = move-exception
            java.lang.String r0 = "Error converting user id to number for xplat client"
            X.0KC.A0G(r11, r0, r2)     // Catch:{ all -> 0x029a }
            goto L_0x0298
        L_0x0296:
            r38 = r0
        L_0x0298:
            monitor-exit(r1)
            return r38
        L_0x029a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass450.A05(X.42l, X.44r, X.44s, java.util.concurrent.Executor):com.facebook.mqtt.service.ConnectionConfig");
    }
}
