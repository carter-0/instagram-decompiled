package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

public final class KJ8 extends 0ng {
    public final Bitmap A00;
    public final C227052iZ A01;
    public final UserSession A02;
    public final C66515MUt A03;
    public final String A04;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r21 = this;
            r6 = r21
            com.instagram.common.session.UserSession r2 = r6.A02
            boolean r0 = r2.hasEnded()
            if (r0 != 0) goto L_0x02c3
            X.1pJ r7 = X.AnonymousClass1pJ.A00
            if (r7 == 0) goto L_0x02b7
            r1 = r7
            X.1pI r1 = (X.AnonymousClass1pI) r1
            r1.A01 = r2
            X.02m r0 = X.02m.A0p
            r1.A00 = r0
            X.2iZ r0 = r6.A01
            if (r0 == 0) goto L_0x00f9
            byte[] r4 = r0.A02
        L_0x001d:
            int r0 = r4.length
            if (r0 == 0) goto L_0x02bc
            java.lang.String r1 = r6.A04
            X.MUt r0 = r6.A03
            X.1pI r7 = (X.AnonymousClass1pI) r7
            r5 = 0
            r8 = 1
            X.4Cq r2 = X.LNv.A02
            com.instagram.common.session.UserSession r2 = r7.A01
            java.lang.String r13 = "userSession"
            r20 = r13
            r6 = 0
            if (r2 == 0) goto L_0x00f4
            X.0xa r3 = X.AnonymousClass7TE.A0q(r2)
            r2 = 857(0x359, float:1.201E-42)
            java.lang.String r2 = X.C273654mx.A00(r2)
            java.lang.String r3 = r3.getString(r2, r6)
            if (r3 == 0) goto L_0x00f0
            int r2 = r3.length()
            if (r2 == 0) goto L_0x00f0
            boolean r2 = X.JTQ.A1Z(r3)
            if (r2 != 0) goto L_0x0065
            java.lang.String r4 = "model_missing"
        L_0x0051:
            r3 = 47
            X.JwJ r2 = new X.JwJ
            r2.<init>((java.lang.String) r4, (java.lang.Object) r6, (int) r3)
        L_0x0058:
            com.instagram.common.session.UserSession r7 = r7.A01
            r9 = 0
            if (r7 != 0) goto L_0x0149
            X.0qQ.A0F(r20)
        L_0x0060:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0065:
            X.5yu r2 = X.C301305yu.STRING
            com.facebook.mantle.common.mantledatavalue.MantleDataValue r9 = new com.facebook.mantle.common.mantledatavalue.MantleDataValue
            r9.<init>((X.C301305yu) r2, (java.lang.Object) r3)
            X.5yu r2 = X.C301305yu.BYTE_ARRAY
            com.facebook.mantle.common.mantledatavalue.MantleDataValue r15 = new com.facebook.mantle.common.mantledatavalue.MantleDataValue
            r15.<init>((X.C301305yu) r2, (java.lang.Object) r4)
            X.5yu r4 = X.C301305yu.INT
            r2 = 1800(0x708, double:8.893E-321)
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
            com.facebook.mantle.common.mantledatavalue.MantleDataValue r2 = new com.facebook.mantle.common.mantledatavalue.MantleDataValue
            r2.<init>((X.C301305yu) r4, (java.lang.Object) r3)
            java.lang.String r14 = "imageDataPtr"
            java.lang.String r16 = "modelPath"
            java.lang.String r18 = "cacheTTLSeconds"
            r19 = r2
            r17 = r9
            com.google.common.collect.ImmutableMap r14 = com.google.common.collect.ImmutableMap.of(r14, r15, r16, r17, r18, r19)
            com.instagram.common.session.UserSession r2 = r7.A01
            if (r2 == 0) goto L_0x00f4
            java.lang.String r3 = "{\"nodes\":{\"0\":{\"nodeType\":116,\"parents\":[],\"staticParams\":{\"11\":{\"boolean_val\":true}}},\"1\":{\"nodeType\":100,\"parents\":[0],\"staticParams\":{\"11\":{\"boolean_val\":true},\"25\":{\"int_val\":1}}}}}"
            X.9NX r2 = X.C59686JTs.A00(r2)
            X.1aU r2 = r2.A00
            X.1aU r12 = r2.A0H()
            X.0rm r11 = X.C51965G9l.A11()
            int r2 = r3.length()
            if (r2 != 0) goto L_0x00bf
            java.lang.String r4 = "mantle_inference_config_missing"
            r3 = 47
            X.JwJ r2 = new X.JwJ
            r2.<init>((java.lang.String) r4, (java.lang.Object) r6, (int) r3)
            r11.A00 = r2
        L_0x00b3:
            java.lang.Object r2 = r11.A00
            X.JwJ r2 = (X.C61081JwJ) r2
            if (r2 != 0) goto L_0x0058
            if (r0 == 0) goto L_0x02c3
            r0.DKR()
            return
        L_0x00bf:
            X.1a8 r15 = new X.1a8
            r15.<init>(r6)
            X.2SP r2 = X.2SP.A01
            int r10 = r2.A03()
            X.02m r2 = r7.A00
            java.lang.String r13 = "qpl"
            if (r2 == 0) goto L_0x00f4
            r9 = 426181758(0x1967047e, float:1.1943327E-23)
            r2.markerStart(r9, r10, r5)
            X.02m r4 = r7.A00
            if (r4 == 0) goto L_0x00f4
            java.lang.String r3 = "configId"
            java.lang.String r2 = "igd_nudity_detection"
            r4.markerAnnotate(r9, r10, r3, r2)
            X.M1S r13 = new X.M1S
            r16 = r7
            r17 = r11
            r18 = r10
            r13.<init>(r14, r15, r16, r17, r18)
            r15.A02(r12, r13)
            goto L_0x00b3
        L_0x00f0:
            java.lang.String r4 = "model_path_missing"
            goto L_0x0051
        L_0x00f4:
            X.0qQ.A0F(r13)
            goto L_0x0060
        L_0x00f9:
            android.graphics.Bitmap r3 = r6.A00
            if (r3 == 0) goto L_0x0111
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            r0 = 100
            X.0fO.A02(r1, r3, r2, r0)
            byte[] r4 = r2.toByteArray()
        L_0x010d:
            if (r4 == 0) goto L_0x02bc
            goto L_0x001d
        L_0x0111:
            java.lang.String r0 = r6.A04
            java.io.File r1 = X.AnonymousClass7TE.A0t(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x02bc
            java.io.FileInputStream r5 = new java.io.FileInputStream
            r5.<init>(r1)
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r3 = new byte[r4]     // Catch:{ all -> 0x02ad }
            int r0 = r5.available()     // Catch:{ all -> 0x02ad }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x02ad }
            r2.<init>(r0)     // Catch:{ all -> 0x02ad }
        L_0x012f:
            r1 = 0
            int r0 = r5.read(r3, r1, r4)     // Catch:{ all -> 0x02a3 }
            if (r0 >= 0) goto L_0x013e
            r2.flush()     // Catch:{ all -> 0x02a3 }
            byte[] r4 = r2.toByteArray()     // Catch:{ all -> 0x02a3 }
            goto L_0x0142
        L_0x013e:
            r2.write(r3, r1, r0)     // Catch:{ all -> 0x02a3 }
            goto L_0x012f
        L_0x0142:
            r2.close()     // Catch:{ all -> 0x02ad }
            r5.close()
            goto L_0x010d
        L_0x0149:
            java.lang.Object r10 = r2.A00
            com.google.common.collect.ImmutableMap r10 = (com.google.common.collect.ImmutableMap) r10
            if (r10 == 0) goto L_0x0261
            X.0Tu r4 = X.0Tu.A05
            r2 = 37170322017288714(0x840e360007020a, double:3.5699995443820095E-306)
            double r2 = X.182.A00(r4, r7, r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            double r4 = r2.doubleValue()
            java.lang.String r2 = "predictions"
            java.lang.Object r2 = r10.get(r2)
            com.facebook.mantle.common.mantledatavalue.MantleDataValue r2 = (com.facebook.mantle.common.mantledatavalue.MantleDataValue) r2
            if (r2 == 0) goto L_0x0178
            java.lang.Object r9 = r2.value
            if (r9 == 0) goto L_0x019b
            X.5yu r3 = r2.type
            X.5yu r2 = X.C301305yu.LIST_DOUBLE
            if (r3 != r2) goto L_0x019b
        L_0x0176:
            java.util.List r9 = (java.util.List) r9
        L_0x0178:
            r12 = 0
            if (r9 == 0) goto L_0x0195
            int r3 = r9.size()
            r2 = 2
            if (r3 != r2) goto L_0x0195
            java.lang.Object r2 = X.00k.A0O(r9, r8)
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0195
            double r2 = r2.doubleValue()
            int r2 = java.lang.Double.compare(r2, r4)
            if (r2 <= 0) goto L_0x0195
            r12 = 1
        L_0x0195:
            X.4wo r3 = X.C278384wn.A00(r7)
            monitor-enter(r3)
            goto L_0x01a0
        L_0x019b:
            com.google.common.collect.ImmutableList r9 = com.google.common.collect.ImmutableList.of()
            goto L_0x0176
        L_0x01a0:
            java.util.Map r2 = r3.A00     // Catch:{ all -> 0x02a0 }
            java.lang.Object r9 = r2.get(r1)     // Catch:{ all -> 0x02a0 }
            X.JuG r9 = (X.C60958JuG) r9     // Catch:{ all -> 0x02a0 }
            monitor-exit(r3)
            if (r9 == 0) goto L_0x025b
            java.lang.String r3 = r9.A03
            if (r3 == 0) goto L_0x0249
            java.lang.String r2 = r9.A05
            if (r2 != 0) goto L_0x0249
            java.lang.String r8 = java.lang.String.valueOf(r3)
            X.3t2 r5 = r9.A00
            if (r5 == 0) goto L_0x0236
            X.3t1 r2 = X.AnonymousClass6W3.A01(r5)
            com.instagram.model.direct.DirectThreadKey r3 = X.AnonymousClass6W4.A01(r2)
            X.2Dm r2 = X.2L2.A00(r7)
            X.3su r2 = r2.BRy(r3, r8)
            if (r2 == 0) goto L_0x0236
            java.lang.String r3 = r2.A0g()
            if (r3 == 0) goto L_0x0236
            int r2 = r3.length()
            if (r2 == 0) goto L_0x0236
            r10 = r12
        L_0x01da:
            java.lang.String r8 = java.lang.String.valueOf(r3)
            X.3t2 r11 = r9.A00
            if (r11 == 0) goto L_0x025b
            boolean r2 = r9.A07
            if (r2 == 0) goto L_0x0212
            X.3t1 r2 = X.AnonymousClass6W3.A01(r11)
            com.instagram.model.direct.DirectThreadKey r3 = X.AnonymousClass6W4.A01(r2)
            X.2Dm r2 = X.2L2.A00(r7)
            X.3su r10 = r2.BRz(r3, r8)
            java.lang.Long r3 = r9.A02
            if (r10 == 0) goto L_0x020c
            if (r3 == 0) goto L_0x020c
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r7)
            long r13 = r3.longValue()
            X.4yE r9 = new X.4yE
            r9.<init>(r10, r11, r12, r13)
            r2.A00(r9)
        L_0x020c:
            X.4wo r4 = X.C278384wn.A00(r7)
            monitor-enter(r4)
            goto L_0x0251
        L_0x0212:
            X.2Dm r5 = X.2L2.A00(r7)
            com.instagram.model.direct.messageid.DirectMessageIdentifier r4 = new com.instagram.model.direct.messageid.DirectMessageIdentifier
            r4.<init>(r6, r8, r6)
            java.lang.String r3 = r9.A04
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r5.Ed4(r4, r11, r2, r3)
            if (r10 == 0) goto L_0x022e
            X.Mbt r2 = new X.Mbt
            r2.<init>(r7)
            r2.A03(r11, r8)
        L_0x022e:
            X.7Zi r2 = X.C333527Zh.A00(r7)
            r2.A0J(r11, r8, r3, r12)
            goto L_0x020c
        L_0x0236:
            X.4wo r4 = X.C278384wn.A00(r7)
            java.lang.String r2 = r9.A04
            X.Drz r3 = new X.Drz
            r3.<init>(r5, r2, r8, r12)
            monitor-enter(r4)
            java.util.Set r2 = r4.A03     // Catch:{ all -> 0x0257 }
            r2.add(r3)     // Catch:{ all -> 0x0257 }
            monitor-exit(r4)
            goto L_0x020c
        L_0x0249:
            r10 = 0
            java.lang.String r2 = r9.A05
            r3 = r6
            if (r2 == 0) goto L_0x01da
            r3 = r2
            goto L_0x01da
        L_0x0251:
            java.util.Map r2 = r4.A00     // Catch:{ all -> 0x0257 }
            r2.remove(r1)     // Catch:{ all -> 0x0257 }
            goto L_0x025a
        L_0x0257:
            r1 = move-exception
            monitor-exit(r4)
            throw r1
        L_0x025a:
            monitor-exit(r4)
        L_0x025b:
            if (r0 == 0) goto L_0x02c3
            r0.Dol(r12)
            return
        L_0x0261:
            java.lang.String r2 = r2.A01
            if (r2 == 0) goto L_0x02c3
            X.4wo r3 = X.C278384wn.A00(r7)
            monitor-enter(r3)
            java.util.Map r2 = r3.A00     // Catch:{ all -> 0x02a0 }
            java.lang.Object r10 = r2.get(r1)     // Catch:{ all -> 0x02a0 }
            X.JuG r10 = (X.C60958JuG) r10     // Catch:{ all -> 0x02a0 }
            monitor-exit(r3)
            if (r10 == 0) goto L_0x029a
            X.3t2 r9 = r10.A00
            if (r9 == 0) goto L_0x028f
            X.2Dm r8 = X.2L2.A00(r7)
            java.lang.String r3 = r10.A05
            java.lang.String r2 = r10.A03
            com.instagram.model.direct.messageid.DirectMessageIdentifier r4 = new com.instagram.model.direct.messageid.DirectMessageIdentifier
            r4.<init>(r6, r3, r2)
            java.lang.String r3 = r10.A04
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r8.Ed4(r4, r9, r2, r3)
        L_0x028f:
            X.4wo r3 = X.C278384wn.A00(r7)
            monitor-enter(r3)
            java.util.Map r2 = r3.A01     // Catch:{ all -> 0x02a0 }
            r2.remove(r1)     // Catch:{ all -> 0x02a0 }
            monitor-exit(r3)
        L_0x029a:
            if (r0 == 0) goto L_0x02c3
            r0.DED()
            return
        L_0x02a0:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        L_0x02a3:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x02a8 }
            goto L_0x02ac
        L_0x02a8:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ all -> 0x02ad }
        L_0x02ac:
            throw r1     // Catch:{ all -> 0x02ad }
        L_0x02ad:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x02b2 }
            throw r1
        L_0x02b2:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
            throw r1
        L_0x02b7:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x02bc:
            java.lang.String r1 = "OnDeviceNudityInferencingWorker"
            java.lang.String r0 = "no data to process"
            X.0KC.A0C(r1, r0)
        L_0x02c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KJ8.run():void");
    }

    public KJ8(Bitmap bitmap, C227052iZ r5, UserSession userSession, C66515MUt mUt, String str) {
        super(866559011, 3, false, false);
        this.A02 = userSession;
        this.A04 = str;
        this.A01 = r5;
        this.A00 = bitmap;
        this.A03 = mUt;
    }
}
