package X;

/* renamed from: X.Nwd  reason: case insensitive filesystem */
public abstract class C70061Nwd {
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1  */
    public static final void A00(com.instagram.common.session.UserSession r18, com.instagram.direct.armadilloexpress.transportpayload.ReceiverFetchXma r19, X.C254703su r20, java.lang.Long r21, java.lang.String r22) {
        /*
            r0 = 1
            r13 = r18
            r4 = r19
            int r16 = X.DbW.A02(r0, r13, r4)
            int r1 = r4.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x01f5
            r1 = r20
            java.lang.String r9 = r1.A0f()
            r6 = 0
            r8 = r22
            if (r22 == 0) goto L_0x002b
            if (r9 == 0) goto L_0x002b
            long r10 = r1.C7c()
            boolean r12 = r1.A1d()
            X.N2l r6 = new X.N2l
            r7 = r21
            r6.<init>(r7, r8, r9, r10, r12)
        L_0x002b:
            java.lang.String r2 = r4.contentRef_     // Catch:{ JSONException -> 0x01eb }
            org.json.JSONObject r2 = X.C66580MXl.A17(r2)     // Catch:{ JSONException -> 0x01eb }
            X.N1Z r5 = new X.N1Z
            r5.<init>(r2)
            int r3 = r4.bitField0_
            r2 = r3 & 2
            if (r2 == 0) goto L_0x01b0
            java.lang.String r11 = r4.text_
        L_0x003e:
            r2 = r3 & 4
            if (r2 == 0) goto L_0x01ad
            com.instagram.direct.armadilloexpress.transportpayload.Media r10 = r4.media_
            if (r10 != 0) goto L_0x0048
            com.instagram.direct.armadilloexpress.transportpayload.Media r10 = com.instagram.direct.armadilloexpress.transportpayload.Media.DEFAULT_INSTANCE
        L_0x0048:
            X.Nl3 r7 = X.C69421Nl3.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r12 = "content_type"
            java.lang.Enum r4 = r5.A04(r12, r7)
            X.Nl3 r4 = (X.C69421Nl3) r4
            X.0qQ.A07(r4)
            X.OUd r17 = X.OUd.A00
            java.lang.String r2 = "target_url"
            java.lang.String r21 = r5.A05(r2)
            java.lang.String r8 = X.DcV.A01()
            java.lang.String r22 = r5.A05(r8)
            X.Nl2 r3 = X.C69420Nl2.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r2 = "action_type"
            java.lang.Enum r9 = r5.A04(r2, r3)
            X.Nl2 r9 = (X.C69420Nl2) r9
            X.0qQ.A07(r9)
            if (r10 == 0) goto L_0x01a9
            int r15 = r10.mediaCase_
            r14 = 6
            if (r15 != r14) goto L_0x01a9
            com.instagram.direct.armadilloexpress.transportpayload.AvatarSticker r14 = r10.A0L()
            int r14 = r14.nuxType_
            java.lang.Integer r20 = java.lang.Integer.valueOf(r14)
        L_0x0083:
            r18 = r4
            r19 = r9
            java.util.List r14 = r17.A00(r18, r19, r20, r21, r22)
            X.2FW r9 = X.2FW.A0y
            r1.A17(r9, r14)
            java.lang.Enum r9 = r5.A04(r2, r3)
            X.Nl2 r15 = X.C69420Nl2.REPLY
            if (r9 != r15) goto L_0x00cb
            if (r11 == 0) goto L_0x00cb
            X.2FW r6 = X.2FW.A1g
        L_0x009c:
            r1.A18(r6, r11)
        L_0x009f:
            if (r4 == r7) goto L_0x00c0
            java.lang.Class<X.N1Y> r6 = X.N1Y.class
            java.lang.String r4 = "fetch_params"
            X.3FZ r6 = r5.A00(r6, r4)
            java.lang.String r4 = "null cannot be cast to non-null type com.facebook.messaging.dataclasses.igxmacontentref.IgXmaContentRefDataclassImpl.FetchParams"
            X.0qQ.A0C(r6, r4)
            org.json.JSONObject r4 = r6.A00
            java.lang.String r6 = r4.toString()
            java.lang.String r4 = r1.A1o
            boolean r4 = X.2PP.A00(r6, r4)
            if (r4 != 0) goto L_0x00c0
            r1.A2C = r0
            r1.A1o = r6
        L_0x00c0:
            java.lang.Enum r2 = r5.A04(r2, r3)
            java.lang.String r3 = r2.toString()
            monitor-enter(r1)
            goto L_0x01b3
        L_0x00cb:
            java.lang.Enum r14 = r5.A04(r2, r3)
            r9 = 0
            if (r14 != r15) goto L_0x016b
            if (r11 != 0) goto L_0x016b
            r15 = 0
            if (r10 == 0) goto L_0x009f
            int r11 = r10.mediaCase_
            r14 = 5
            if (r11 != r14) goto L_0x012b
            java.lang.Object r11 = r10.media_
            com.instagram.direct.armadilloexpress.transportpayload.Gif r11 = (com.instagram.direct.armadilloexpress.transportpayload.Gif) r11
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r11 = r11.mediaTransport_
            if (r11 != 0) goto L_0x00e6
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r11 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE
        L_0x00e6:
            X.0qQ.A07(r11)
            android.net.Uri r6 = X.C66834MdS.A00(r6, r11, r9)
            java.lang.String r13 = X.DbT.A10(r6)
            int r6 = r10.mediaCase_
            if (r6 != r14) goto L_0x0128
            java.lang.Object r10 = r10.media_
            com.instagram.direct.armadilloexpress.transportpayload.Gif r10 = (com.instagram.direct.armadilloexpress.transportpayload.Gif) r10
        L_0x00f9:
            X.0qQ.A07(r10)
            int r6 = r10.width_
            float r14 = (float) r6
            int r6 = r10.height_
            float r6 = (float) r6
            com.instagram.model.mediasize.GifUrlImpl r11 = new com.instagram.model.mediasize.GifUrlImpl
            r11.<init>(r13, r14, r6)
            java.lang.String r18 = X.DbV.A0s()
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r15)
            boolean r10 = r10.isSticker_
            X.9IE r6 = new X.9IE
            r6.<init>((com.instagram.model.mediasize.GifUrlImpl) r11)
            X.53G r13 = new X.53G
            r17 = r16
            r19 = r10
            r14 = r6
            r15 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19)
            X.2FW r6 = X.2FW.A0K
        L_0x0123:
            r1.A18(r6, r13)
            goto L_0x009f
        L_0x0128:
            com.instagram.direct.armadilloexpress.transportpayload.Gif r10 = com.instagram.direct.armadilloexpress.transportpayload.Gif.DEFAULT_INSTANCE
            goto L_0x00f9
        L_0x012b:
            r14 = 6
            if (r11 != r14) goto L_0x013c
            com.instagram.direct.armadilloexpress.transportpayload.AvatarSticker r10 = r10.A0L()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r10 = r10.mediaTransport_
            if (r10 != 0) goto L_0x0138
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r10 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE
        L_0x0138:
            X.0qQ.A07(r10)
            goto L_0x0183
        L_0x013c:
            if (r11 == r0) goto L_0x0158
            r9 = 3
            if (r11 == r9) goto L_0x0158
            r9 = r16
            if (r11 != r9) goto L_0x009f
            X.ODs r9 = r1.A0M()
            X.Nkj r11 = r9.A00
            boolean r9 = r1.A1S()
            X.47v r13 = X.C71113Od4.A00(r13, r6, r10, r11, r9)
            if (r13 == 0) goto L_0x009f
            X.2FW r6 = X.2FW.A1k
            goto L_0x0123
        L_0x0158:
            X.ODs r9 = r1.A0M()
            X.Nkj r11 = r9.A00
            boolean r9 = r1.A1S()
            X.1Xj r13 = X.C71113Od4.A03(r13, r6, r10, r11, r9)
            if (r13 == 0) goto L_0x009f
            X.2FW r6 = X.2FW.A1A
            goto L_0x0123
        L_0x016b:
            java.lang.Enum r14 = r5.A04(r2, r3)
            X.Nl2 r13 = X.C69420Nl2.REACT
            if (r14 != r13) goto L_0x009f
            if (r10 == 0) goto L_0x01a3
            com.instagram.direct.armadilloexpress.transportpayload.AvatarSticker r10 = r10.A0L()
            if (r10 == 0) goto L_0x01a3
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r10 = r10.mediaTransport_
            if (r10 != 0) goto L_0x0183
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r10 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE
            if (r10 == 0) goto L_0x01a3
        L_0x0183:
            android.net.Uri r6 = X.C66834MdS.A00(r6, r10, r9)
            java.lang.String r18 = X.DbT.A10(r6)
            X.2FW r6 = X.2FW.A0N
            com.instagram.model.mediasize.ExtendedImageUrl r13 = new com.instagram.model.mediasize.ExtendedImageUrl
            r15 = r9
            r16 = r9
            r17 = r9
            r19 = r9
            r20 = r9
            r21 = r9
            r14 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r1.A18(r6, r13)
            goto L_0x009f
        L_0x01a3:
            if (r11 == 0) goto L_0x009f
            X.2FW r6 = X.2FW.A0m
            goto L_0x009c
        L_0x01a9:
            r20 = 0
            goto L_0x0083
        L_0x01ad:
            r10 = 0
            goto L_0x0048
        L_0x01b0:
            r11 = 0
            goto L_0x003e
        L_0x01b3:
            java.lang.String r2 = r1.A1l     // Catch:{ all -> 0x01e8 }
            boolean r2 = X.2PP.A00(r2, r3)     // Catch:{ all -> 0x01e8 }
            if (r2 != 0) goto L_0x01bf
            r1.A1l = r3     // Catch:{ all -> 0x01e8 }
            r1.A2C = r0     // Catch:{ all -> 0x01e8 }
        L_0x01bf:
            monitor-exit(r1)
            java.lang.Enum r2 = r5.A04(r12, r7)
            java.lang.String r3 = r2.toString()
            monitor-enter(r1)
            java.lang.String r2 = r1.A1n     // Catch:{ all -> 0x01e8 }
            boolean r2 = X.2PP.A00(r2, r3)     // Catch:{ all -> 0x01e8 }
            if (r2 != 0) goto L_0x01d5
            r1.A1n = r3     // Catch:{ all -> 0x01e8 }
            r1.A2C = r0     // Catch:{ all -> 0x01e8 }
        L_0x01d5:
            monitor-exit(r1)
            java.lang.String r3 = r5.A05(r8)
            monitor-enter(r1)
            java.lang.String r2 = r1.A1m     // Catch:{ all -> 0x01e8 }
            boolean r2 = X.2PP.A00(r2, r3)     // Catch:{ all -> 0x01e8 }
            if (r2 != 0) goto L_0x01f4
            r1.A1m = r3     // Catch:{ all -> 0x01e8 }
            r1.A2C = r0     // Catch:{ all -> 0x01e8 }
            goto L_0x01f4
        L_0x01e8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x01eb:
            r2 = move-exception
            java.lang.String r1 = "ReceiverFetchXmaDataGenerator"
            java.lang.String r0 = "Failed to parse receiver fetch content ref"
            X.0KC.A0J(r1, r0, r2)
            return
        L_0x01f4:
            monitor-exit(r1)
        L_0x01f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70061Nwd.A00(com.instagram.common.session.UserSession, com.instagram.direct.armadilloexpress.transportpayload.ReceiverFetchXma, X.3su, java.lang.Long, java.lang.String):void");
    }
}
