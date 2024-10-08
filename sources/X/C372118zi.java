package X;

/* renamed from: X.8zi  reason: invalid class name and case insensitive filesystem */
public final class C372118zi extends C372128zj {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C372118zi(android.content.Context r9, com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig r10) {
        /*
            r8 = this;
            r6 = 1
            int r1 = X.AnonymousClass0Ke.A00(r9)
            r0 = 2013(0x7dd, float:2.821E-42)
            r4 = 70
            if (r1 < r0) goto L_0x000d
            r4 = 100
        L_0x000d:
            int r1 = X.AnonymousClass0Ke.A00(r9)
            r0 = 2015(0x7df, float:2.824E-42)
            if (r1 < r0) goto L_0x0021
            r5 = 7
        L_0x0016:
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r0 = r8
            r1 = r10
            r7 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0021:
            r0 = 2014(0x7de, float:2.822E-42)
            r5 = 3
            if (r1 != r0) goto L_0x0016
            r5 = 5
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C372118zi.<init>(android.content.Context, com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C372118zi(android.content.Context r30) {
        /*
            r29 = this;
            r27 = 1
            int r1 = X.AnonymousClass0Ke.A00(r30)
            r0 = 2013(0x7dd, float:2.821E-42)
            r25 = 70
            if (r1 < r0) goto L_0x000e
            r25 = 100
        L_0x000e:
            int r1 = X.AnonymousClass0Ke.A00(r30)
            r0 = 2015(0x7df, float:2.824E-42)
            if (r1 < r0) goto L_0x0029
            r26 = 7
        L_0x0018:
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r3 = "Pixel"
            java.lang.String r10 = "GalaxyS8"
            java.lang.String r11 = "GalaxyS8Plus"
            java.lang.String r9 = "GalaxyS7Edge"
            java.lang.String r8 = "GalaxyS7"
            java.lang.String r7 = "GalaxyS6"
            java.lang.Class<com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.config.DeviceConfigCache> r6 = com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.config.DeviceConfigCache.class
            goto L_0x0032
        L_0x0029:
            r0 = 2014(0x7de, float:2.822E-42)
            r26 = 3
            if (r1 != r0) goto L_0x0018
            r26 = 5
            goto L_0x0018
        L_0x0032:
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ Exception -> 0x01b4 }
            r5.<init>()     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SM-G955U"
            r4 = 0
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r11, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SM-G955F"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r11, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SM-G950U"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r10, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SM-G950F"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r10, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r10 = "SM-G935FD"
            java.lang.String r2 = "GalaxyS7EdgeDual"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r10, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SM-G935V"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r9, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SM-G935T"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r9, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SM-G935P"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r9, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SM-G935F"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r9, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SAMSUNG-SM-G935A"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r9, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SM-G930V"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r8, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SM-G930T"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r8, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SM-G930S"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r8, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SM-G930P"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r8, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SM-G930F"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r8, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SAMSUNG-SM-G930A"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r8, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SAMSUNG-SM-G891A"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r8, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SM-G928F"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r7, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SM-G925I"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r7, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SM-G925F"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r7, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SM-G920W8"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r7, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SM-G920V"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r7, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SM-G920T"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r7, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SM-G920P"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r7, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SM-G920I"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r7, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SM-G920F"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r7, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SAMSUNG-SM-G920A"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r7, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r2 = "SAMSUNG-SM-G890A"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r7, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r3, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r3, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r3 = "Pixel 2"
            java.lang.String r2 = "Pixel2"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r3, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r3 = "Pixel XL"
            java.lang.String r2 = "PixelXL"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r3, r1)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r3 = "Pixel 2 XL"
            java.lang.String r2 = "Pixel2XL"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r1 = r6.getMethod(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            r5.put(r3, r1)     // Catch:{ Exception -> 0x01b4 }
            boolean r1 = r5.containsKey(r0)     // Catch:{ Exception -> 0x01b4 }
            if (r1 == 0) goto L_0x01b4
            java.lang.Object r3 = r5.get(r0)     // Catch:{ Exception -> 0x01b4 }
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch:{ Exception -> 0x01b4 }
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x01b4 }
            java.lang.Object r1 = r3.invoke(r2, r1)     // Catch:{ Exception -> 0x01b4 }
            com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig r1 = (com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig) r1     // Catch:{ Exception -> 0x01b4 }
            goto L_0x01dc
        L_0x01b4:
            java.lang.Boolean r18 = com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig.DEFAULT_SKIP_ATTITUDE_INPUT
            java.lang.Boolean r21 = com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig.DEFAULT_USE_VISION_ONLY_SLAM
            java.lang.Boolean r22 = com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig.DEFAULT_IS_SLAM_CAPABLE
            java.lang.Boolean r24 = com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig.DEFAULT_IS_CALIBRATED_DEVICE
            r2 = 0
            r6 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r12 = -4611187376568573212(0xc001c5831add62e4, double:-2.221441469079183)
            r14 = 4612184660286202596(0x4001c5831add62e4, double:2.221441469079183)
            java.lang.String r23 = ""
            com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig r1 = new com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig
            r4 = r2
            r10 = r8
            r16 = r2
            r19 = r2
            r1.<init>(r2, r4, r6, r8, r10, r12, r14, r16, r18, r19, r21, r22, r23, r24)
        L_0x01dc:
            java.lang.Integer r23 = X.AnonymousClass05K.A00
            r21 = r29
            r22 = r1
            r24 = r0
            r28 = r27
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C372118zi.<init>(android.content.Context):void");
    }
}
