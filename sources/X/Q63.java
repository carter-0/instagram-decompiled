package X;

import android.content.BroadcastReceiver;

public final class Q63 extends BroadcastReceiver {
    public final int A00;
    public final Object A01;

    public Q63(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0341, code lost:
        X.AnonymousClass0fD.A0E(r0, r5, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0344, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        X.AnonymousClass0fD.A0E(r0, r2, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0185, code lost:
        r5 = (X.C10961S2t) r13.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0059, code lost:
        r3 = (X.T7S) r13.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r14, android.content.Intent r15) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x01de;
                case 1: goto L_0x01c7;
                case 2: goto L_0x01b4;
                case 3: goto L_0x01a1;
                case 4: goto L_0x016d;
                case 5: goto L_0x0149;
                case 6: goto L_0x0315;
                case 7: goto L_0x02a2;
                case 8: goto L_0x01ff;
                case 9: goto L_0x00dc;
                case 10: goto L_0x00b3;
                case 11: goto L_0x0089;
                case 12: goto L_0x006e;
                case 13: goto L_0x0046;
                case 14: goto L_0x0027;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = -840250467(0xffffffffcdeacb9d, float:-4.92401568E8)
            int r2 = X.C66580MXl.A03(r13, r14, r15, r0)
            java.lang.Object r0 = r13.A01
            com.instagram.react.modules.product.IgReactBoostPostModule r0 = (com.instagram.react.modules.product.IgReactBoostPostModule) r0
            X.QZK r1 = r0.mReactContext
            java.lang.Class<com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter> r0 = com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter.class
            com.facebook.react.bridge.JavaScriptModule r3 = r1.A02(r0)
            com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter r3 = (com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter) r3
            java.lang.String r1 = "IGBoostPostRefreshPromotionInsights"
            r0 = 0
            r3.emit(r1, r0)
            r0 = -1849923389(0xffffffff91bc68c3, float:-2.9725734E-28)
        L_0x0023:
            X.AnonymousClass0fD.A0E(r0, r2, r15)
            return
        L_0x0027:
            r0 = 1161616192(0x453cdb40, float:3021.7031)
            int r2 = X.C66580MXl.A03(r13, r14, r15, r0)
            java.lang.Object r0 = r13.A01
            com.instagram.react.modules.product.IgReactBoostPostModule r0 = (com.instagram.react.modules.product.IgReactBoostPostModule) r0
            X.QZK r1 = r0.mReactContext
            java.lang.Class<com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter> r0 = com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter.class
            com.facebook.react.bridge.JavaScriptModule r3 = r1.A02(r0)
            com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter r3 = (com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter) r3
            java.lang.String r1 = "IGBoostPostSubmitSuccessNotification"
            r0 = 0
            r3.emit(r1, r0)
            r0 = -772744604(0xffffffffd1f0da64, float:-1.29307017E11)
            goto L_0x0023
        L_0x0046:
            r0 = 1372713328(0x51d1f170, float:1.12712352E11)
            int r2 = X.C66580MXl.A03(r13, r14, r15, r0)
            java.lang.String r1 = r15.getAction()
            java.lang.String r0 = "android.intent.action.LOCALE_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006a
            java.lang.Object r3 = r13.A01
            X.T7S r3 = (X.T7S) r3
            X.SSW r0 = r3.A01
            if (r0 == 0) goto L_0x006a
            java.lang.Integer r1 = r0.A0I
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x006a
            r3.A02()
        L_0x006a:
            r0 = -1570626769(0xffffffffa262232f, float:-3.0647337E-18)
            goto L_0x0023
        L_0x006e:
            r0 = -1722511978(0xffffffff99548d96, float:-1.0988736E-23)
            int r2 = X.C66580MXl.A03(r13, r14, r15, r0)
            if (r15 != 0) goto L_0x007b
            r0 = 727581135(0x2b5e01cf, float:7.8872754E-13)
            goto L_0x0023
        L_0x007b:
            java.lang.Object r0 = r13.A01
            X.ST9 r0 = (X.ST9) r0
            r15.getAction()
            X.ST9.A00(r15, r0)
            r0 = -543960326(0xffffffffdf93d2fa, float:-2.1303702E19)
            goto L_0x0023
        L_0x0089:
            r0 = 1023952170(0x3d08452a, float:0.033269085)
            int r2 = X.C66580MXl.A03(r13, r14, r15, r0)
            java.lang.Object r3 = r13.A01
            X.ST9 r3 = (X.ST9) r3
            if (r15 != 0) goto L_0x009a
            r0 = 584287127(0x22d38397, float:5.733099E-18)
            goto L_0x0023
        L_0x009a:
            java.lang.String r1 = r15.getAction()
            java.lang.String r0 = "android.os.action.POWER_SAVE_MODE_CHANGED"
            boolean r0 = X.C9556Rct.A00(r1, r0)
            if (r0 != 0) goto L_0x00ab
            r0 = -1641493495(0xffffffff9e28cc09, float:-8.9360394E-21)
            goto L_0x0023
        L_0x00ab:
            X.ST9.A00(r15, r3)
            r0 = 573007605(0x222766f5, float:2.2687225E-18)
            goto L_0x0023
        L_0x00b3:
            r0 = 1202724665(0x47b01f39, float:90174.445)
            int r2 = X.C66580MXl.A03(r13, r14, r15, r0)
            java.lang.String r3 = r15.getAction()
            java.lang.Object r1 = r13.A01
            X.SIg r1 = (X.C11269SIg) r1
            java.lang.String r0 = r1.A08
            boolean r0 = X.C9556Rct.A00(r3, r0)
            if (r0 != 0) goto L_0x00cf
            r0 = 1290445616(0x4ceaa330, float:1.230176E8)
            goto L_0x0023
        L_0x00cf:
            r15.getAction()
            java.lang.Runnable r0 = r1.A0C
            r0.run()
            r0 = -1004940787(0xffffffffc419d20d, float:-615.28204)
            goto L_0x0023
        L_0x00dc:
            r0 = 1313512656(0x4e4a9cd0, float:8.4981862E8)
            int r2 = X.C66580MXl.A03(r13, r14, r15, r0)
            java.lang.String r1 = r15.getAction()
            java.lang.Object r7 = r13.A01
            X.SSX r7 = (X.SSX) r7
            java.lang.String r0 = r7.A0I
            boolean r0 = X.C9556Rct.A00(r1, r0)
            if (r0 != 0) goto L_0x00f8
            r0 = 241978215(0xe6c4b67, float:2.912555E-30)
            goto L_0x0023
        L_0x00f8:
            monitor-enter(r7)
            r15.getAction()     // Catch:{ all -> 0x0385 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0385 }
            long r5 = r7.A00     // Catch:{ all -> 0x0385 }
            long r0 = r7.A05     // Catch:{ all -> 0x0385 }
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 >= 0) goto L_0x010d
            monitor-exit(r7)     // Catch:{ all -> 0x0385 }
            r0 = -93760644(0xfffffffffa69537c, float:-3.028746E35)
            goto L_0x0023
        L_0x010d:
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0385 }
            long r0 = r7.A01     // Catch:{ all -> 0x0385 }
            int r8 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r8 >= 0) goto L_0x011d
            monitor-exit(r7)     // Catch:{ all -> 0x0385 }
            r0 = 360025332(0x15758cf4, float:4.9588548E-26)
            goto L_0x0023
        L_0x011d:
            long r3 = r3 + r5
            r7.A01 = r3     // Catch:{ all -> 0x0385 }
            android.app.PendingIntent r3 = r7.A09     // Catch:{ all -> 0x0385 }
            if (r3 == 0) goto L_0x012b
            X.3RB r1 = r7.A0G     // Catch:{ all -> 0x0385 }
            android.app.AlarmManager r0 = r7.A06     // Catch:{ all -> 0x0385 }
            r1.A03(r0, r3)     // Catch:{ all -> 0x0385 }
        L_0x012b:
            boolean r0 = r7.A03     // Catch:{ all -> 0x0385 }
            if (r0 == 0) goto L_0x013e
            long r0 = r7.A01     // Catch:{ all -> 0x0385 }
            X.SSX.A02(r3, r7, r0)     // Catch:{ all -> 0x0385 }
            android.app.PendingIntent r5 = r7.A07     // Catch:{ all -> 0x0385 }
            long r3 = r7.A01     // Catch:{ all -> 0x0385 }
            r0 = 20000(0x4e20, double:9.8813E-320)
            long r3 = r3 + r0
            X.SSX.A01(r5, r7, r3)     // Catch:{ all -> 0x0385 }
        L_0x013e:
            monitor-exit(r7)     // Catch:{ all -> 0x0385 }
            java.lang.Runnable r0 = r7.A0P
            r0.run()
            r0 = 669769027(0x27ebdd43, float:6.5465495E-15)
            goto L_0x0023
        L_0x0149:
            r0 = 613356678(0x248f1486, float:6.205113E-17)
            int r2 = X.C66580MXl.A03(r13, r14, r15, r0)
            java.lang.String r3 = r15.getAction()
            java.lang.Object r1 = r13.A01
            X.TSd r1 = (X.C13262TSd) r1
            java.lang.String r0 = r1.A01
            boolean r0 = X.C9556Rct.A00(r3, r0)
            if (r0 != 0) goto L_0x0165
            r0 = 594548573(0x2370175d, float:1.30153734E-17)
            goto L_0x0023
        L_0x0165:
            X.C13262TSd.A01(r1)
            r0 = -395211788(0xffffffffe8718bf4, float:-4.562688E24)
            goto L_0x0023
        L_0x016d:
            r0 = 1476028079(0x57fa66af, float:5.50637859E14)
            int r2 = X.C66580MXl.A03(r13, r14, r15, r0)
            X.AnonymousClass7TG.A1N(r14, r15)
            java.lang.String r1 = r15.getAction()
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            if (r1 == 0) goto L_0x019c
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x019c
            java.lang.Object r5 = r13.A01
            X.S2t r5 = (X.C10961S2t) r5
            com.facebook.common.networkreachability.NetworkState r4 = r5.A00()
            com.facebook.common.networkreachability.NetworkState r0 = r5.A00
            if (r4 == r0) goto L_0x019c
            com.facebook.common.networkreachability.AndroidReachabilityListener r3 = r5.A03
            int r1 = r4.A00
            int r0 = r0.A00
            r3.networkStateChanged(r1, r0)
            r5.A00 = r4
        L_0x019c:
            r0 = 799322574(0x2fa4b1ce, float:2.9957764E-10)
            goto L_0x0023
        L_0x01a1:
            r0 = 359985466(0x1574f13a, float:4.9465702E-26)
            int r2 = X.C66580MXl.A03(r13, r14, r15, r0)
            java.lang.Object r0 = r13.A01
            androidx.test.core.app.InstrumentationActivityInvoker$EmptyFloatingActivity r0 = (androidx.test.core.app.InstrumentationActivityInvoker.EmptyFloatingActivity) r0
            r0.finish()
            r0 = 1421055347(0x54b39573, float:6.1704519E12)
            goto L_0x0023
        L_0x01b4:
            r0 = -253777063(0xfffffffff0dfab59, float:-5.5377843E29)
            int r2 = X.C66580MXl.A03(r13, r14, r15, r0)
            java.lang.Object r0 = r13.A01
            androidx.test.core.app.InstrumentationActivityInvoker$EmptyActivity r0 = (androidx.test.core.app.InstrumentationActivityInvoker.EmptyActivity) r0
            r0.finish()
            r0 = 726670825(0x2b501de9, float:7.3937953E-13)
            goto L_0x0023
        L_0x01c7:
            r0 = -718309746(0xffffffffd52f768e, float:-1.20577327E13)
            int r2 = X.C66580MXl.A03(r13, r14, r15, r0)
            java.lang.Object r1 = r13.A01
            androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity r1 = (androidx.test.core.app.InstrumentationActivityInvoker.BootstrapActivity) r1
            r0 = 0
            r1.finishActivity(r0)
            r1.finish()
            r0 = 1950869714(0x7447e8d2, float:6.3353835E31)
            goto L_0x0023
        L_0x01de:
            r0 = -112949807(0xfffffffff94485d1, float:-6.377527E34)
            int r2 = X.C66580MXl.A03(r13, r14, r15, r0)
            java.lang.Object r1 = r13.A01
            X.S5N r1 = (X.S5N) r1
            boolean r0 = r1 instanceof X.QAK
            if (r0 == 0) goto L_0x01fa
            X.QAK r1 = (X.QAK) r1
            X.2X4 r1 = r1.A01
        L_0x01f1:
            r0 = 1
            X.2X4.A0E(r1, r0, r0)
            r0 = -389097971(0xffffffffe8ced60d, float:-7.814048E24)
            goto L_0x0023
        L_0x01fa:
            X.QAJ r1 = (X.QAJ) r1
            X.2X4 r1 = r1.A01
            goto L_0x01f1
        L_0x01ff:
            r0 = 1654585752(0x629ef998, float:1.4662853E21)
            int r6 = X.C66580MXl.A03(r13, r14, r15, r0)
            java.lang.String r1 = r15.getAction()
            java.lang.Object r5 = r13.A01
            X.SSX r5 = (X.SSX) r5
            java.lang.String r0 = r5.A0K
            boolean r0 = X.C9556Rct.A00(r1, r0)
            if (r0 != 0) goto L_0x021d
            r0 = 1454019520(0x56aa93c0, float:9.3775779E13)
        L_0x0219:
            X.AnonymousClass0fD.A0E(r0, r6, r15)
            return
        L_0x021d:
            monitor-enter(r5)
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0299 }
            long r0 = r5.A01     // Catch:{ all -> 0x0299 }
            long r3 = r3 - r0
            r15.getAction()     // Catch:{ all -> 0x0299 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0244
            X.SRZ r2 = r5.A0H     // Catch:{ all -> 0x0299 }
            java.lang.String r1 = "keepalive_delay_ms"
            java.lang.String r0 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x0299 }
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}     // Catch:{ all -> 0x0299 }
            java.util.HashMap r1 = X.S9J.A01(r0)     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = "mqtt_keepalive_delay"
            r2.A06(r0, r1)     // Catch:{ all -> 0x0299 }
        L_0x0244:
            boolean r4 = r5.A0M     // Catch:{ all -> 0x0299 }
            if (r4 != 0) goto L_0x0253
            android.app.PendingIntent r2 = r5.A07     // Catch:{ all -> 0x0299 }
            if (r2 == 0) goto L_0x0253
            X.3RB r1 = r5.A0G     // Catch:{ all -> 0x0299 }
            android.app.AlarmManager r0 = r5.A06     // Catch:{ all -> 0x0299 }
            r1.A03(r0, r2)     // Catch:{ all -> 0x0299 }
        L_0x0253:
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0299 }
            long r0 = r5.A02     // Catch:{ all -> 0x0299 }
            long r10 = r10 + r0
            boolean r0 = r5.A03     // Catch:{ all -> 0x0299 }
            if (r0 == 0) goto L_0x0272
            int r1 = r5.A04     // Catch:{ all -> 0x0299 }
            r0 = 23
            if (r1 < r0) goto L_0x0272
            if (r4 == 0) goto L_0x0272
            android.app.PendingIntent r12 = r5.A09     // Catch:{ all -> 0x0299 }
            if (r12 == 0) goto L_0x0272
            X.3RB r7 = r5.A0G     // Catch:{ all -> 0x0299 }
            android.app.AlarmManager r8 = r5.A06     // Catch:{ all -> 0x0299 }
            r9 = 2
            r7.A02(r8, r9, r10, r12)     // Catch:{ all -> 0x0299 }
        L_0x0272:
            long r2 = r5.A00     // Catch:{ all -> 0x0299 }
            long r0 = r5.A05     // Catch:{ all -> 0x0299 }
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x027f
            monitor-exit(r5)     // Catch:{ all -> 0x0299 }
            r0 = -1367302429(0xffffffffae809ee3, float:-5.84899E-11)
            goto L_0x0219
        L_0x027f:
            r5.A01 = r10     // Catch:{ all -> 0x0299 }
            boolean r0 = r5.A03     // Catch:{ all -> 0x0299 }
            if (r0 == 0) goto L_0x028f
            if (r4 != 0) goto L_0x028f
            android.app.PendingIntent r2 = r5.A07     // Catch:{ all -> 0x0299 }
            r0 = 20000(0x4e20, double:9.8813E-320)
            long r10 = r10 + r0
            X.SSX.A01(r2, r5, r10)     // Catch:{ all -> 0x0299 }
        L_0x028f:
            monitor-exit(r5)     // Catch:{ all -> 0x0299 }
            java.lang.Runnable r0 = r5.A0P
            r0.run()
            r0 = 721822788(0x2b062444, float:4.765669E-13)
            goto L_0x0219
        L_0x0299:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0299 }
            r0 = 1475794416(0x57f6d5f0, float:5.4279743E14)
            X.AnonymousClass0fD.A0E(r0, r6, r15)
            throw r1
        L_0x02a2:
            r0 = 1323576756(0x4ee42db4, float:1.91410022E9)
            int r5 = X.C66580MXl.A03(r13, r14, r15, r0)
            java.lang.String r1 = r15.getAction()
            java.lang.Object r6 = r13.A01
            X.SSX r6 = (X.SSX) r6
            java.lang.String r0 = r6.A0J
            boolean r0 = X.C9556Rct.A00(r1, r0)
            if (r0 != 0) goto L_0x02be
            r0 = -1985198(0xffffffffffe1b552, float:NaN)
            goto L_0x0341
        L_0x02be:
            monitor-enter(r6)
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x030c }
            long r0 = r6.A01     // Catch:{ all -> 0x030c }
            long r3 = r3 - r0
            r15.getAction()     // Catch:{ all -> 0x030c }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x02e5
            X.SRZ r2 = r6.A0H     // Catch:{ all -> 0x030c }
            java.lang.String r1 = "keepalive_delay_ms"
            java.lang.String r0 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x030c }
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}     // Catch:{ all -> 0x030c }
            java.util.HashMap r1 = X.S9J.A01(r0)     // Catch:{ all -> 0x030c }
            java.lang.String r0 = "mqtt_keepalive_delay"
            r2.A06(r0, r1)     // Catch:{ all -> 0x030c }
        L_0x02e5:
            long r3 = r6.A00     // Catch:{ all -> 0x030c }
            long r1 = r6.A05     // Catch:{ all -> 0x030c }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x02f2
            monitor-exit(r6)     // Catch:{ all -> 0x030c }
            r0 = 997965508(0x3b7bbec4, float:0.0038413266)
            goto L_0x0341
        L_0x02f2:
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x030c }
            long r1 = r1 + r3
            r6.A01 = r1     // Catch:{ all -> 0x030c }
            boolean r0 = r6.A03     // Catch:{ all -> 0x030c }
            if (r0 == 0) goto L_0x0302
            android.app.PendingIntent r0 = r6.A08     // Catch:{ all -> 0x030c }
            X.SSX.A01(r0, r6, r1)     // Catch:{ all -> 0x030c }
        L_0x0302:
            monitor-exit(r6)     // Catch:{ all -> 0x030c }
            java.lang.Runnable r0 = r6.A0P
            r0.run()
            r0 = 1149037641(0x447cec49, float:1011.69196)
            goto L_0x0341
        L_0x030c:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x030c }
            r0 = 126072304(0x783b5f0, float:1.9817623E-34)
            X.AnonymousClass0fD.A0E(r0, r5, r15)
            throw r1
        L_0x0315:
            r0 = 2071197917(0x7b73f8dd, float:1.2667757E36)
            int r5 = X.C66580MXl.A03(r13, r14, r15, r0)
            java.lang.String r1 = r15.getAction()
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x037e
            java.lang.String r0 = "networkInfo"
            android.os.Parcelable r0 = r15.getParcelableExtra(r0)
            android.net.NetworkInfo r0 = (android.net.NetworkInfo) r0
            java.lang.Object r2 = r13.A01
            X.SJJ r2 = (X.SJJ) r2
            X.SJJ.A00(r0, r2)
            boolean r0 = r13.isInitialStickyBroadcast()
            if (r0 == 0) goto L_0x0345
            r0 = 893513987(0x3541f103, float:7.224882E-7)
        L_0x0341:
            X.AnonymousClass0fD.A0E(r0, r5, r15)
            return
        L_0x0345:
            X.S2M r0 = r2.A03()
            java.lang.String r4 = "com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED"
            android.content.Intent r3 = X.Pxe.A0G(r4)
            java.lang.String r1 = "com.facebook.mqtt.EXTRA_NETWORK_TYPE"
            int r0 = r0.A00
            r3.putExtra(r1, r0)
            monitor-enter(r2)
            java.util.Set r0 = r2.A04     // Catch:{ all -> 0x0382 }
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)     // Catch:{ all -> 0x0382 }
            monitor-exit(r2)     // Catch:{ all -> 0x0382 }
            java.util.Iterator r2 = r0.iterator()
        L_0x0362:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x037e
            java.lang.Object r1 = r2.next()
            X.Roq r1 = (X.C10230Roq) r1
            java.lang.String r0 = r3.getAction()
            boolean r0 = X.C9556Rct.A00(r0, r4)
            if (r0 == 0) goto L_0x0362
            X.ST9 r0 = r1.A00
            X.ST9.A00(r3, r0)
            goto L_0x0362
        L_0x037e:
            r0 = 856218682(0x3308dc3a, float:3.1865262E-8)
            goto L_0x0341
        L_0x0382:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0382 }
            throw r1
        L_0x0385:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0385 }
            r0 = -1176191247(0xffffffffb9e4bef1, float:-4.362981E-4)
            X.AnonymousClass0fD.A0E(r0, r2, r15)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q63.onReceive(android.content.Context, android.content.Intent):void");
    }
}
