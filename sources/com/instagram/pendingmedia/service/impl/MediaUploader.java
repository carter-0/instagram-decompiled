package com.instagram.pendingmedia.service.impl;

import X.C2373837k;
import X.C249523jv;
import X.C61410nE;
import X.DbW;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class MediaUploader {
    public final C249523jv A00;
    public final Context A01;
    public final UserSession A02;
    public final C61410nE A03 = C61410nE.A00;
    public final C2373837k A04;
    public final Map A05;

    public MediaUploader(Context context, UserSession userSession, C2373837k r4, Map map, C249523jv r6) {
        DbW.A1N(map, 3, r6);
        this.A01 = context;
        this.A02 = userSession;
        this.A05 = map;
        this.A04 = r4;
        this.A00 = r6;
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v1, types: [X.MU6, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0108 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.LP8 r7, com.instagram.pendingmedia.service.impl.MediaUploader r8, X.AnonymousClass4D7 r9) {
        /*
            r6 = r7
            r3 = 15
            boolean r0 = X.ME9.A03(r3, r9)
            if (r0 == 0) goto L_0x0025
            r7 = r9
            X.ME9 r7 = (X.ME9) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0025
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0017:
            java.lang.Object r0 = r7.A03
            X.1Hj r2 = X.1Hj.A02
            int r1 = r7.A00
            switch(r1) {
                case 0: goto L_0x002a;
                case 1: goto L_0x0046;
                case 2: goto L_0x0109;
                case 3: goto L_0x0109;
                case 4: goto L_0x0109;
                case 5: goto L_0x0109;
                case 6: goto L_0x0109;
                case 7: goto L_0x0109;
                case 8: goto L_0x0109;
                case 9: goto L_0x0109;
                case 10: goto L_0x0109;
                default: goto L_0x0020;
            }
        L_0x0020:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0025:
            X.ME9 r7 = X.ME9.A00(r8, r9, r3)
            goto L_0x0017
        L_0x002a:
            X.0eS.A00(r0)
            X.3Q2 r0 = r6.A0D
            boolean r0 = r0.A5w
            if (r0 == 0) goto L_0x0051
            com.instagram.pendingmedia.service.impl.ShareStoryTemplateHelper r1 = new com.instagram.pendingmedia.service.impl.ShareStoryTemplateHelper
            r1.<init>(r8)
            r7.A01 = r8
            r7.A02 = r6
            r0 = 1
            r7.A00 = r0
            java.lang.Object r0 = r1.A00(r6, r7)
            if (r0 != r2) goto L_0x0051
            return r2
        L_0x0046:
            java.lang.Object r6 = r7.A02
            X.LP8 r6 = (X.LP8) r6
            java.lang.Object r8 = r7.A01
            com.instagram.pendingmedia.service.impl.MediaUploader r8 = (com.instagram.pendingmedia.service.impl.MediaUploader) r8
            X.0eS.A00(r0)
        L_0x0051:
            X.3Q2 r5 = r6.A0D
            X.1iA r1 = r5.A1G
            int r0 = r1.ordinal()
            r4 = 0
            switch(r0) {
                case 0: goto L_0x00f9;
                case 1: goto L_0x00eb;
                case 4: goto L_0x00cc;
                case 7: goto L_0x00dd;
                case 12: goto L_0x00a0;
                case 17: goto L_0x00ae;
                case 26: goto L_0x008f;
                case 27: goto L_0x00a0;
                case 28: goto L_0x006c;
                case 29: goto L_0x00f9;
                case 30: goto L_0x00f9;
                case 31: goto L_0x007e;
                default: goto L_0x005d;
            }
        L_0x005d:
            X.37k r3 = r8.A04
            java.lang.String r7 = r1.name()
            java.lang.String r6 = "UNKNOWN_MEDIA_TYPE_ERROR"
            r8 = r4
            r3.Cji(r4, r5, r6, r7, r8)
            X.KVl r0 = X.C62012KVl.A00
        L_0x006b:
            return r0
        L_0x006c:
            com.instagram.pendingmedia.service.impl.ShareClipsTemplateHelper r3 = com.instagram.pendingmedia.service.impl.ShareClipsTemplateHelper.A00
            X.3jv r1 = r8.A00
            r7.A01 = r4
            r7.A02 = r4
            r0 = 10
            r7.A00 = r0
            java.lang.Object r0 = r3.A00(r6, r7, r1)
            goto L_0x0106
        L_0x007e:
            com.instagram.pendingmedia.service.impl.ShareSpinnableClipHelper r3 = com.instagram.pendingmedia.service.impl.ShareSpinnableClipHelper.A00
            X.3jv r1 = r8.A00
            r7.A01 = r4
            r7.A02 = r4
            r0 = 9
            r7.A00 = r0
            java.lang.Object r0 = r3.A00(r6, r7, r1)
            goto L_0x0106
        L_0x008f:
            com.instagram.pendingmedia.service.impl.SharePostThreadHelper r3 = com.instagram.pendingmedia.service.impl.SharePostThreadHelper.A00
            X.3jv r1 = r8.A00
            r7.A01 = r4
            r7.A02 = r4
            r0 = 8
            r7.A00 = r0
            java.lang.Object r0 = r3.A00(r6, r7, r1)
            goto L_0x0106
        L_0x00a0:
            com.instagram.pendingmedia.service.impl.ShareTextPostHelper r1 = com.instagram.pendingmedia.service.impl.ShareTextPostHelper.A00
            r7.A01 = r4
            r7.A02 = r4
            r0 = 7
            r7.A00 = r0
            java.lang.Object r0 = r1.A00(r6, r7)
            goto L_0x0106
        L_0x00ae:
            r7.A01 = r4
            r7.A02 = r4
            r0 = 6
            r7.A00 = r0
            X.3QD r1 = r6.A05
            X.3QD r0 = X.AnonymousClass3QD.NOT_UPLOADED
            if (r1 != r0) goto L_0x00c9
            com.instagram.pendingmedia.service.common.IngestionStepDebugLogger r4 = com.instagram.pendingmedia.service.common.IngestionStepDebugLogger.A00
            com.instagram.pendingmedia.service.upload.UploadFileStep r5 = new com.instagram.pendingmedia.service.upload.UploadFileStep
            r5.<init>()
            r8 = 0
            java.lang.Object r0 = r4.A01(r5, r6, r7, r8)
            goto L_0x0106
        L_0x00c9:
            X.KVl r0 = X.C62012KVl.A00
            goto L_0x0106
        L_0x00cc:
            com.instagram.pendingmedia.service.impl.ShareAlbumHelper r1 = new com.instagram.pendingmedia.service.impl.ShareAlbumHelper
            r1.<init>(r8)
            r7.A01 = r4
            r7.A02 = r4
            r0 = 5
            r7.A00 = r0
            java.lang.Object r0 = r1.A00(r6, r7)
            goto L_0x0106
        L_0x00dd:
            com.instagram.pendingmedia.service.impl.ShareAudioHelper r1 = com.instagram.pendingmedia.service.impl.ShareAudioHelper.A00
            r7.A01 = r4
            r7.A02 = r4
            r0 = 4
            r7.A00 = r0
            java.lang.Object r0 = r1.A00(r6, r7)
            goto L_0x0106
        L_0x00eb:
            com.instagram.pendingmedia.service.impl.ShareVideoHelper r1 = com.instagram.pendingmedia.service.impl.ShareVideoHelper.A00
            r7.A01 = r4
            r7.A02 = r4
            r0 = 3
            r7.A00 = r0
            java.lang.Object r0 = r1.A00(r6, r7)
            goto L_0x0106
        L_0x00f9:
            com.instagram.pendingmedia.service.impl.SharePhotoHelper r1 = com.instagram.pendingmedia.service.impl.SharePhotoHelper.A00
            r7.A01 = r4
            r7.A02 = r4
            r0 = 2
            r7.A00 = r0
            java.lang.Object r0 = r1.A00(r6, r7)
        L_0x0106:
            if (r0 != r2) goto L_0x006b
            return r2
        L_0x0109:
            X.0eS.A00(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.impl.MediaUploader.A00(X.LP8, com.instagram.pendingmedia.service.impl.MediaUploader, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDY, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r7v16 */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ed  */
    public final java.lang.Object A01(X.AnonymousClass3Q2 r22, X.1Cn r23, java.lang.String r24, X.AnonymousClass4D7 r25) {
        /*
            r21 = this;
            r1 = r22
            r3 = 1
            r5 = r25
            boolean r0 = r5 instanceof X.MDY
            r9 = r21
            if (r0 == 0) goto L_0x004c
            r7 = r5
            X.MDY r7 = (X.MDY) r7
            int r0 = r7.A0D
            if (r0 != r3) goto L_0x004c
            int r4 = r7.A03
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto L_0x004c
            int r4 = r4 - r2
            r7.A03 = r4
        L_0x001d:
            java.lang.Object r14 = r7.A0C
            X.1Hj r6 = X.1Hj.A02
            int r2 = r7.A03
            r0 = 2
            if (r2 == 0) goto L_0x0057
            if (r2 == r3) goto L_0x01ef
            if (r2 != r0) goto L_0x0052
            int r10 = r7.A01
            int r9 = r7.A00
            java.lang.Object r11 = r7.A0A
            X.0rm r11 = (X.0rm) r11
            java.lang.Object r8 = r7.A09
            X.3QD r8 = (X.AnonymousClass3QD) r8
            java.lang.Object r2 = r7.A08
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r0 = r7.A07
            X.LP8 r0 = (X.LP8) r0
            java.lang.Object r5 = r7.A06
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r1 = r7.A05
            X.3Q2 r1 = (X.AnonymousClass3Q2) r1
            java.lang.Object r4 = r7.A04
            com.instagram.pendingmedia.service.impl.MediaUploader r4 = (com.instagram.pendingmedia.service.impl.MediaUploader) r4
            goto L_0x024d
        L_0x004c:
            X.MDY r7 = new X.MDY
            r7.<init>(r9, r5, r3)
            goto L_0x001d
        L_0x0052:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0057:
            X.0eS.A00(r14)
            long r4 = java.lang.System.currentTimeMillis()
            monitor-enter(r1)
            r1.A0Y = r4     // Catch:{ all -> 0x04e0 }
            monitor-exit(r1)
            r0 = 0
            r1.A0M = r0
            r0 = 4165(0x1045, float:5.836E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10 = r24
            boolean r0 = X.0qQ.A0K(r10, r0)
            if (r0 == 0) goto L_0x007d
            r1.A0E()     // Catch:{ all -> 0x0077 }
            goto L_0x007d
        L_0x0077:
            r2 = move-exception
            X.0eQ r0 = new X.0eQ
            r0.<init>(r2)
        L_0x007d:
            android.content.Context r8 = r9.A01
            com.instagram.common.session.UserSession r4 = r9.A02
            X.Lv8 r11 = new X.Lv8
            r11.<init>(r8, r4)
            X.Lv5 r5 = new X.Lv5
            r5.<init>(r4)
            X.AeX r2 = new X.AeX
            r2.<init>(r8, r4)
            X.AeW r0 = new X.AeW
            r0.<init>(r8, r4)
            X.MU6[] r0 = new X.MU6[]{r11, r5, r2, r0}
            java.util.List r5 = X.0sr.A1P(r0)
            X.37k r11 = r9.A04
            X.LvI r17 = X.C65543LvI.A00
            java.util.Map r2 = r9.A05
            X.LP8 r0 = new X.LP8
            r18 = r23
            r14 = r4
            r15 = r1
            r16 = r11
            r19 = r10
            r20 = r2
            r12 = r0
            r13 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            X.3QD r4 = r1.A1f
            X.3QD r2 = X.AnonymousClass3QD.NOT_UPLOADED
            if (r4 != r2) goto L_0x011c
            X.37j r11 = (X.C2373737j) r11
            r1.A0E()
            java.lang.Class<X.1us> r2 = X.1us.class
            r12 = 0
            r1.A0K(r12, r2)
            boolean r2 = r1.A11()
            if (r2 != 0) goto L_0x011c
            boolean r2 = r1.A0u()
            if (r2 != 0) goto L_0x011c
            X.0wc r2 = r11.A01
            java.lang.String r10 = "ig_media_ingest_start"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r2, r10)
            boolean r2 = r8.isSampled()
            if (r2 == 0) goto L_0x0119
            android.content.Context r2 = r11.A00
            com.instagram.common.session.UserSession r14 = r11.A02
            X.JbW r13 = new X.JbW
            r13.<init>(r2, r14, r1)
            X.3Q2 r2 = r13.A02
            X.JTS.A1B(r8, r2)
            java.lang.String r4 = r13.A0H()
            java.lang.String r2 = "ingest_id"
            r8.AAJ(r2, r4)
            java.lang.String r4 = X.C59906JbV.A01(r14, r1)
            java.lang.String r2 = "ingest_surface"
            X.C59908JbX.A05(r8, r13, r2, r4)
            X.C59908JbX.A06(r8, r13)
            java.lang.String r4 = X.C59906JbV.A03(r14, r1, r12, r3)
            java.lang.String r2 = "target_surface"
            r8.AAJ(r2, r4)
            X.C59908JbX.A03(r8, r13)
            boolean r2 = r1.A5D
            if (r2 == 0) goto L_0x039f
            r2 = r12
        L_0x0113:
            X.JTS.A1C(r8, r2)
            r8.Cgf()
        L_0x0119:
            r11.Cjm(r1, r10, r12)
        L_0x011c:
            X.0rm r2 = X.C51965G9l.A11()
            X.KVl r4 = X.C62012KVl.A00
            r2.A00 = r4
            r4 = r9
            r9 = 0
        L_0x0126:
            r11 = 0
        L_0x0127:
            java.lang.String r10 = r1.A3t
            X.3Q2 r8 = r0.A0D
            java.lang.String r8 = r8.A3t
            boolean r8 = X.0qQ.A0K(r10, r8)
            if (r8 == 0) goto L_0x03a5
            boolean r8 = r1.A14()
            if (r8 == 0) goto L_0x03a5
            if (r11 != 0) goto L_0x0140
            r8 = 0
            r0.A01 = r8
            r0.A02 = r8
        L_0x0140:
            X.3Q2 r9 = r0.A0D
            X.3QD r8 = r9.A1f
            r0.A05 = r8
            X.3QD r8 = r9.A6J
            r0.A06 = r8
            long r8 = android.os.SystemClock.elapsedRealtime()
            r0.A03 = r8
            r15 = 0
            r0.A04 = r15
            X.Lb3 r8 = new X.Lb3
            r8.<init>()
            r0.A07 = r8
            X.1Cn r8 = r0.A0H
            r8.A04()
            r1.A0P()
            X.3QD r8 = r0.A05
            int r10 = r1.A02()
            X.3QD r14 = r1.A1f
            X.3QD r13 = r1.A6J
            monitor-enter(r1)
            X.3QD r12 = r1.A1e     // Catch:{ all -> 0x04e0 }
            r1.A1e = r15     // Catch:{ all -> 0x04e0 }
            monitor-exit(r1)
            boolean r9 = r1.A12()
            if (r9 == 0) goto L_0x01ac
            X.3QD r9 = X.AnonymousClass3QD.NOT_UPLOADED
            if (r12 != r9) goto L_0x01ac
            java.lang.String r9 = r1.A3V
            if (r9 == 0) goto L_0x0189
            r1.A0i(r15)
            r1.A0h(r15)
            r1.A0P()
        L_0x0189:
            r13 = r12
        L_0x018a:
            boolean r9 = r13.A00(r14)
            if (r9 == 0) goto L_0x01b5
            r1.A0b(r13)
            X.37k r11 = r0.A0E
            X.37j r11 = (X.C2373737j) r11
            java.lang.String r8 = "pending_media_process"
            X.0xI r10 = X.C2373737j.A01(r11, r0, r8)
            java.lang.String r9 = r0.A0I
            java.lang.String r8 = "reason"
            r10.A0C(r8, r9)
            X.3QD r8 = r0.A06
            X.C2373737j.A06(r10, r8, r11)
            r9 = 1
            goto L_0x0126
        L_0x01ac:
            if (r12 != 0) goto L_0x0189
            boolean r9 = r13.A00(r14)
            if (r9 == 0) goto L_0x01b5
            goto L_0x018a
        L_0x01b5:
            java.util.Iterator r12 = r5.iterator()
            r9 = 1
        L_0x01ba:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x022d
            java.lang.Object r13 = r12.next()
            X.MU6 r13 = (X.MU6) r13
            com.instagram.pendingmedia.service.common.IngestionStepDebugLogger r14 = com.instagram.pendingmedia.service.common.IngestionStepDebugLogger.A00
            r7.A04 = r4
            r7.A05 = r1
            r7.A06 = r5
            r7.A07 = r0
            r7.A08 = r2
            r7.A09 = r8
            r7.A0A = r12
            r7.A0B = r2
            r7.A00 = r11
            r7.A01 = r9
            r7.A02 = r10
            r7.A03 = r3
            r18 = 0
            r15 = r13
            r16 = r0
            r17 = r7
            java.lang.Object r14 = r14.A01(r15, r16, r17, r18)
            if (r14 == r6) goto L_0x04aa
            r13 = r2
            goto L_0x0218
        L_0x01ef:
            int r10 = r7.A02
            int r9 = r7.A01
            int r11 = r7.A00
            java.lang.Object r13 = r7.A0B
            X.0rm r13 = (X.0rm) r13
            java.lang.Object r12 = r7.A0A
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r8 = r7.A09
            X.3QD r8 = (X.AnonymousClass3QD) r8
            java.lang.Object r2 = r7.A08
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r0 = r7.A07
            X.LP8 r0 = (X.LP8) r0
            java.lang.Object r5 = r7.A06
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r1 = r7.A05
            X.3Q2 r1 = (X.AnonymousClass3Q2) r1
            java.lang.Object r4 = r7.A04
            com.instagram.pendingmedia.service.impl.MediaUploader r4 = (com.instagram.pendingmedia.service.impl.MediaUploader) r4
            X.0eS.A00(r14)
        L_0x0218:
            r13.A00 = r14
            java.lang.Object r14 = r2.A00
            boolean r13 = r14 instanceof X.C62013KVm
            if (r13 != 0) goto L_0x0127
            boolean r13 = r14 instanceof X.C62011KVk
            if (r13 != 0) goto L_0x03a5
            boolean r13 = r14 instanceof X.C62012KVl
            if (r13 != 0) goto L_0x01ba
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x022d:
            r7.A04 = r4     // Catch:{ all -> 0x0255 }
            r7.A05 = r1     // Catch:{ all -> 0x0255 }
            r7.A06 = r5     // Catch:{ all -> 0x0255 }
            r7.A07 = r0     // Catch:{ all -> 0x0255 }
            r7.A08 = r2     // Catch:{ all -> 0x0255 }
            r7.A09 = r8     // Catch:{ all -> 0x0255 }
            r7.A0A = r2     // Catch:{ all -> 0x0255 }
            r11 = 0
            r7.A0B = r11     // Catch:{ all -> 0x0255 }
            r7.A00 = r9     // Catch:{ all -> 0x0255 }
            r7.A01 = r10     // Catch:{ all -> 0x0255 }
            r11 = 2
            r7.A03 = r11     // Catch:{ all -> 0x0255 }
            java.lang.Object r14 = A00(r0, r4, r7)     // Catch:{ all -> 0x0255 }
            if (r14 == r6) goto L_0x04aa
            r11 = r2
            goto L_0x0250
        L_0x024d:
            X.0eS.A00(r14)     // Catch:{ all -> 0x0255 }
        L_0x0250:
            r11.A00 = r14     // Catch:{ all -> 0x0255 }
            X.0gF r11 = X.C60340gF.A00     // Catch:{ all -> 0x0255 }
            goto L_0x025a
        L_0x0255:
            r11 = move-exception
            X.0eQ r11 = X.JTO.A1B(r11)
        L_0x025a:
            java.lang.Throwable r11 = X.0eR.A00(r11)
            if (r11 == 0) goto L_0x0285
            java.lang.Class<com.instagram.pendingmedia.service.impl.MediaUploader> r14 = com.instagram.pendingmedia.service.impl.MediaUploader.class
            r12 = 0
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.String r12 = "media uploader err"
            X.0KC.A07(r14, r12, r11, r13)
            boolean r12 = r11 instanceof java.util.concurrent.CancellationException
            if (r12 != 0) goto L_0x02e1
            X.37k r13 = r4.A04
            X.3Q2 r12 = r0.A0D
            java.lang.String r17 = r11.getMessage()
            if (r17 != 0) goto L_0x027c
            java.lang.String r17 = r11.toString()
        L_0x027c:
            r14 = 0
            java.lang.String r16 = "Something went wrong in MediaUploader"
            r15 = r12
            r18 = r11
            r13.Cji(r14, r15, r16, r17, r18)
        L_0x0285:
            X.55U r15 = r0.A04
            if (r15 == 0) goto L_0x02b8
            java.util.LinkedHashMap r11 = X.C63564KzD.A01
            java.lang.String r12 = r1.A3t
            r11 = 0
            X.0qQ.A0B(r12, r11)
            java.util.LinkedHashMap r11 = X.C63564KzD.A01
            java.lang.Object r14 = r11.get(r12)
            if (r14 != 0) goto L_0x02a0
            java.util.LinkedHashMap r14 = X.AnonymousClass7TE.A1H()
            r11.put(r12, r14)
        L_0x02a0:
            java.util.LinkedHashMap r14 = (java.util.LinkedHashMap) r14
            java.text.SimpleDateFormat r16 = X.C63564KzD.A00
            long r11 = java.lang.System.currentTimeMillis()
            java.util.Date r13 = new java.util.Date
            r13.<init>(r11)
            r11 = r16
            java.lang.String r12 = r11.format(r13)
            java.lang.String r11 = r15.A02
            r14.put(r12, r11)
        L_0x02b8:
            X.3QD r12 = r1.A1f
            int r16 = r1.A02()
            r11 = 0
            r1.A5g = r11
            X.37k r14 = r0.A0E
            X.37j r14 = (X.C2373737j) r14
            java.lang.String r11 = "pending_media_process"
            X.0xI r13 = X.C2373737j.A01(r14, r0, r11)
            java.lang.String r15 = r0.A0I
            java.lang.String r11 = "reason"
            r13.A0C(r11, r15)
            X.3QD r11 = r0.A06
            X.C2373737j.A06(r13, r11, r14)
            if (r8 == 0) goto L_0x02fa
            boolean r11 = r8.A00(r12)
            if (r11 != r3) goto L_0x02fa
            goto L_0x0126
        L_0x02e1:
            X.55S r14 = X.AnonymousClass55S.A0C
            java.lang.String r13 = r11.getMessage()
            if (r13 != 0) goto L_0x02ed
            java.lang.String r13 = r11.toString()
        L_0x02ed:
            r12 = 0
            X.55U r12 = X.AnonymousClass55V.A01(r14, r13, r12, r11)
            X.KVk r11 = new X.KVk
            r11.<init>(r12)
            r2.A00 = r11
            goto L_0x0285
        L_0x02fa:
            X.3QD r11 = X.AnonymousClass3QD.CONFIGURING_MULTIPLE_TARGETS
            if (r12 != r11) goto L_0x0304
            r11 = r16
            if (r11 <= r10) goto L_0x0304
            goto L_0x0126
        L_0x0304:
            boolean r14 = r12.A00(r8)
            X.55U r8 = r0.A04
            if (r8 == 0) goto L_0x03a5
            X.55S r8 = r8.A01
            boolean r8 = r8.A03
            if (r8 != r3) goto L_0x03a5
            android.content.Context r8 = r0.A0B
            boolean r8 = X.C61970qY.A0E(r8)
            if (r8 == 0) goto L_0x03a5
            X.55U r8 = r0.A04
            if (r8 == 0) goto L_0x037c
            X.55S r8 = r8.A01
            boolean r8 = r8.A02
            if (r8 != r3) goto L_0x037c
            java.lang.Integer r10 = r0.A08
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            if (r10 != r8) goto L_0x0376
            com.instagram.common.session.UserSession r8 = r0.A0C
            X.1Pq r10 = X.JTS.A0I(r8)
            java.lang.String r8 = "http://instagram.com/p-ng"
            r10.A02(r8)
            X.1QS r13 = r10.A00()
            r11 = 0
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            r0.A08 = r8
            X.1QT r10 = new X.1QT     // Catch:{ all -> 0x0365 }
            r10.<init>()     // Catch:{ all -> 0x0365 }
            X.1CE r8 = X.1CE.A08     // Catch:{ all -> 0x0365 }
            r10.A04 = r8     // Catch:{ all -> 0x0365 }
            X.1QU r12 = r10.A00()     // Catch:{ all -> 0x0365 }
            X.1C7 r10 = X.AnonymousClass1C7.A00()     // Catch:{ all -> 0x0365 }
            X.1QX r8 = new X.1QX     // Catch:{ all -> 0x0365 }
            r8.<init>(r13, r12)     // Catch:{ all -> 0x0365 }
            X.2ZL r11 = r10.A01(r8)     // Catch:{ all -> 0x0365 }
            if (r11 == 0) goto L_0x0376
            int r10 = r11.A02     // Catch:{ all -> 0x0365 }
            r8 = 200(0xc8, float:2.8E-43)
            if (r10 != r8) goto L_0x036d
            java.lang.Integer r8 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0365 }
            r0.A08 = r8     // Catch:{ all -> 0x0365 }
            goto L_0x036d
        L_0x0365:
            r10 = move-exception
            X.0eQ r8 = new X.0eQ
            r8.<init>(r10)
            if (r11 == 0) goto L_0x0376
        L_0x036d:
            X.1Qb r8 = r11.A00()
            if (r8 == 0) goto L_0x0376
            r8.AI7()
        L_0x0376:
            java.lang.Integer r10 = r0.A08
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            if (r10 != r8) goto L_0x03a5
        L_0x037c:
            if (r14 == 0) goto L_0x0390
            int r8 = r0.A00
            int r10 = r8 + 1
            r0.A00 = r10
            r8 = 2
            if (r10 > r8) goto L_0x03a5
            int r8 = r1.A0P
            int r8 = r8 + 1
            r1.A0P = r8
        L_0x038d:
            r11 = 1
            goto L_0x0127
        L_0x0390:
            int r8 = r0.A01
            int r8 = r8 + 1
            r0.A01 = r8
            if (r8 > r3) goto L_0x03a5
            int r8 = r1.A0O
            int r8 = r8 + 1
            r1.A0O = r8
            goto L_0x038d
        L_0x039f:
            java.util.Map r2 = r13.A07()
            goto L_0x0113
        L_0x03a5:
            if (r9 != 0) goto L_0x04db
            X.3QD r6 = r1.A1f
            X.3QD r5 = X.AnonymousClass3QD.CONFIGURED
            if (r6 == r5) goto L_0x03f4
            X.3QD r5 = r1.A6J
            if (r6 != r5) goto L_0x03b7
            X.3QD r6 = r1.A6J
            X.3QD r5 = X.AnonymousClass3QD.NOT_UPLOADED
            if (r6 != r5) goto L_0x03f4
        L_0x03b7:
            java.lang.StringBuilder r6 = X.AnonymousClass7TE.A1A()
            java.lang.String r5 = "serverStatus: "
            r6.append(r5)
            X.3QD r5 = r1.A1f
            r6.append(r5)
            java.lang.String r5 = " targetStatus: "
            r6.append(r5)
            X.3QD r5 = r1.A6J
            r6.append(r5)
            java.lang.String r5 = " allowMultipleConfigures: "
            r6.append(r5)
            boolean r5 = r1.A4w
            r6.append(r5)
            java.lang.String r5 = " hasMultiConfigTargetsThatNeedConfiguration: "
            r6.append(r5)
            boolean r5 = r1.A0s()
            r6.append(r5)
            java.lang.String r9 = r6.toString()
            X.37k r5 = r4.A04
            X.3Q2 r7 = r0.A0D
            r6 = 0
            java.lang.String r8 = "MediaUploader did nothing"
            r10 = r6
            r5.Cji(r6, r7, r8, r9, r10)
        L_0x03f4:
            java.lang.Object r12 = r2.A00
            X.L28 r12 = (X.L28) r12
            X.0qQ.A0B(r0, r3)
            boolean r6 = r12 instanceof X.C62011KVk
            r5 = 0
            if (r6 == 0) goto L_0x04d8
            r6 = r12
            X.KVk r6 = (X.C62011KVk) r6
            if (r6 == 0) goto L_0x04d8
            X.55U r9 = r6.A00
        L_0x0407:
            X.55U r8 = r0.A04
            if (r8 == 0) goto L_0x04d5
            X.55S r7 = r8.A01
        L_0x040d:
            if (r9 == 0) goto L_0x04d2
            X.55S r6 = r9.A01
        L_0x0411:
            if (r7 == r6) goto L_0x0471
            if (r9 == 0) goto L_0x04cf
            X.55S r7 = r9.A01
        L_0x0417:
            X.55S r6 = X.AnonymousClass55S.A0C
            if (r7 == r6) goto L_0x0471
            if (r9 == 0) goto L_0x04cc
            X.55S r7 = r9.A01
        L_0x041f:
            X.55S r6 = X.AnonymousClass55S.A0D
            if (r7 != r6) goto L_0x04c9
            java.lang.String r11 = r9.A03
        L_0x0425:
            X.37k r13 = r0.A0E
            X.3Q2 r7 = r0.A0D
            java.lang.StringBuilder r10 = X.AnonymousClass7TE.A1A()
            java.lang.String r6 = "FailureInterpreter("
            r10.append(r6)
            if (r8 == 0) goto L_0x04c6
            X.55S r6 = r8.A01
        L_0x0436:
            r10.append(r6)
            java.lang.String r6 = ") != "
            r10.append(r6)
            if (r12 == 0) goto L_0x04c3
            java.lang.String r6 = r12.A00
        L_0x0442:
            r10.append(r6)
            r6 = 40
            r10.append(r6)
            if (r9 == 0) goto L_0x04c1
            X.55S r6 = r9.A01
        L_0x044e:
            r10.append(r6)
            java.lang.String r6 = "), errorMessage:"
            r10.append(r6)
            java.lang.String r17 = X.AnonymousClass7TF.A0l(r11, r10)
            if (r8 == 0) goto L_0x0460
            java.lang.Throwable r6 = r8.A08
            if (r6 != 0) goto L_0x0464
        L_0x0460:
            if (r9 == 0) goto L_0x04bf
            java.lang.Throwable r6 = r9.A08
        L_0x0464:
            if (r8 == 0) goto L_0x04ba
            X.55S r5 = r8.A01
        L_0x0468:
            java.lang.String r16 = "validateIngestionStepResult"
            r14 = r5
            r15 = r7
            r18 = r6
            r13.Cji(r14, r15, r16, r17, r18)
        L_0x0471:
            X.2Q9 r5 = r0.A0A
            if (r5 == 0) goto L_0x04b8
            boolean r5 = r5.isActive()
            if (r5 != r3) goto L_0x04b8
            X.2Q9 r5 = r0.A0A
            if (r5 == 0) goto L_0x04b8
            r6 = 0
            r5.AG7(r6)
        L_0x0483:
            com.instagram.common.session.UserSession r5 = r4.A02
            X.1iA r4 = r1.A1G
            X.0qQ.A0B(r4, r3)
            X.1iA r1 = X.1iA.A09
            if (r4 != r1) goto L_0x049b
            X.0Tu r1 = X.0Tu.A05
            r3 = 36330183464141311(0x81121c000141ff, double:3.038692540405175E-306)
            boolean r1 = X.182.A06(r1, r5, r3)
            if (r1 != 0) goto L_0x04ab
        L_0x049b:
            X.0Tu r1 = X.0Tu.A05
            r3 = 36330183464075774(0x81121c000041fe, double:3.038692540363729E-306)
            boolean r1 = X.182.A06(r1, r5, r3)
            if (r1 != 0) goto L_0x04ab
            X.55U r6 = r0.A04
        L_0x04aa:
            return r6
        L_0x04ab:
            java.lang.Object r1 = r2.A00
            boolean r0 = r1 instanceof X.C62011KVk
            if (r0 == 0) goto L_0x04aa
            X.KVk r1 = (X.C62011KVk) r1
            if (r1 == 0) goto L_0x04aa
            X.55U r6 = r1.A00
            return r6
        L_0x04b8:
            r6 = 0
            goto L_0x0483
        L_0x04ba:
            if (r9 == 0) goto L_0x0468
            X.55S r5 = r9.A01
            goto L_0x0468
        L_0x04bf:
            r6 = r5
            goto L_0x0464
        L_0x04c1:
            r6 = r5
            goto L_0x044e
        L_0x04c3:
            r6 = r5
            goto L_0x0442
        L_0x04c6:
            r6 = r5
            goto L_0x0436
        L_0x04c9:
            r11 = r5
            goto L_0x0425
        L_0x04cc:
            r7 = r5
            goto L_0x041f
        L_0x04cf:
            r7 = r5
            goto L_0x0417
        L_0x04d2:
            r6 = r5
            goto L_0x0411
        L_0x04d5:
            r7 = r5
            goto L_0x040d
        L_0x04d8:
            r9 = r5
            goto L_0x0407
        L_0x04db:
            r1.A0P()
            goto L_0x03f4
        L_0x04e0:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.impl.MediaUploader.A01(X.3Q2, X.1Cn, java.lang.String, X.4D7):java.lang.Object");
    }
}
