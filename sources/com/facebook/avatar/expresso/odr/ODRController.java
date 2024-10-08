package com.facebook.avatar.expresso.odr;

import X.05D;
import X.0Tu;
import X.0V2;
import X.0eO;
import X.0qQ;
import X.0sP;
import X.182;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C19016WGr;
import X.C262094Cc;
import X.C60795JrQ;
import X.C61770pa;
import X.C64164LRf;
import X.C66222MJd;
import X.DbS;
import X.JTP;
import X.JTQ;
import X.L37;
import X.LGB;
import X.MTI;
import X.TY5;
import android.content.Context;
import com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl;
import com.facebook.avatar.expresso.odr.asset.ODRAssetManager;
import com.facebook.avatar.expresso.webp.WebPEncoderImpl;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class ODRController {
    public static final AtomicInteger A0H = new AtomicInteger(0);
    public MTI A00;
    public C60795JrQ A01;
    public C19016WGr A02;
    public C64164LRf A03;
    public final Context A04;
    public final AvatarStickerCacheImpl A05;
    public final L37 A06;
    public final ODRAssetManager A07;
    public final QuickPerformanceLogger A08;
    public final UserSession A09;
    public final Map A0A = AnonymousClass7TE.A1H();
    public final Map A0B = AnonymousClass7TE.A1H();
    public final AnonymousClass0eM A0C;
    public final C262094Cc A0D;
    public final 0sP A0E;
    public final 0V2 A0F;
    public final C61770pa A0G;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDY, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (((X.MDY) r6).A0D != 0) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0121, code lost:
        if ((r2 instanceof java.util.concurrent.CancellationException) == false) goto L_0x0123;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.facebook.avatar.expresso.odr.ODRController r15, X.C60787JrI r16, X.C60794JrP r17, X.C60795JrQ r18, java.io.File r19, X.AnonymousClass4D7 r20) {
        /*
            r2 = r15
            r7 = r19
            r11 = r16
            r9 = r18
            r8 = r17
            r4 = 0
            r6 = r20
            boolean r0 = r6 instanceof X.MDY
            if (r0 == 0) goto L_0x0018
            r0 = r6
            X.MDY r0 = (X.MDY) r0
            int r1 = r0.A0D
            r0 = 1
            if (r1 == r4) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            if (r0 == 0) goto L_0x005e
            r5 = r6
            X.MDY r5 = (X.MDY) r5
            int r3 = r5.A03
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x005e
            int r3 = r3 - r1
            r5.A03 = r3
        L_0x0029:
            java.lang.Object r0 = r5.A0C
            X.1Hj r10 = X.1Hj.A02
            int r1 = r5.A03
            r6 = 1
            r4 = 252654211(0xf0f3283, float:7.0601725E-30)
            if (r1 == 0) goto L_0x0064
            if (r1 != r6) goto L_0x0126
            int r12 = r5.A02
            int r10 = r5.A01
            int r3 = r5.A00
            java.lang.Object r15 = r5.A0B
            com.facebook.quicklog.QuickPerformanceLogger r15 = (com.facebook.quicklog.QuickPerformanceLogger) r15
            java.lang.Object r1 = r5.A0A
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r5.A09
            com.facebook.avatar.expresso.odr.ODRController r2 = (com.facebook.avatar.expresso.odr.ODRController) r2
            java.lang.Object r8 = r5.A08
            X.JrP r8 = (X.C60794JrP) r8
            java.lang.Object r9 = r5.A07
            X.JrQ r9 = (X.C60795JrQ) r9
            java.lang.Object r11 = r5.A06
            X.JrI r11 = (X.C60787JrI) r11
            java.lang.Object r7 = r5.A05
            java.io.File r7 = (java.io.File) r7
            java.lang.Object r5 = r5.A04
            com.facebook.avatar.expresso.odr.ODRController r5 = (com.facebook.avatar.expresso.odr.ODRController) r5
            goto L_0x00bb
        L_0x005e:
            X.MDY r5 = new X.MDY
            r5.<init>(r15, r6, r4)
            goto L_0x0029
        L_0x0064:
            X.0eS.A00(r0)
            if (r17 == 0) goto L_0x0123
            com.instagram.common.session.UserSession r12 = r15.A09
            X.0Tu r3 = X.0Tu.A05
            r0 = 36324458273386597(0x810ce7000b3065, double:3.035071906718401E-306)
            boolean r0 = X.182.A06(r3, r12, r0)
            if (r0 == 0) goto L_0x0123
            java.util.concurrent.atomic.AtomicInteger r0 = A0H
            int r3 = r0.getAndIncrement()
            com.facebook.quicklog.QuickPerformanceLogger r15 = r15.A08
            r15.markerStart(r4, r3)
            boolean r0 = r15.isMarkerOn(r4, r3)     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x00b9
            java.lang.String r1 = "file_size"
            X.4Cc r14 = r2.A0D     // Catch:{ all -> 0x00ff }
            r13 = 0
            r12 = 24
            X.JUv r0 = new X.JUv     // Catch:{ all -> 0x00ff }
            r0.<init>(r7, r13, r12)     // Catch:{ all -> 0x00ff }
            r5.A04 = r2     // Catch:{ all -> 0x00ff }
            r5.A05 = r7     // Catch:{ all -> 0x00ff }
            r5.A06 = r11     // Catch:{ all -> 0x00ff }
            r5.A07 = r9     // Catch:{ all -> 0x00ff }
            r5.A08 = r8     // Catch:{ all -> 0x00ff }
            r5.A09 = r2     // Catch:{ all -> 0x00ff }
            r5.A0A = r1     // Catch:{ all -> 0x00ff }
            r5.A0B = r15     // Catch:{ all -> 0x00ff }
            r5.A00 = r3     // Catch:{ all -> 0x00ff }
            r5.A01 = r3     // Catch:{ all -> 0x00ff }
            r5.A02 = r4     // Catch:{ all -> 0x00ff }
            r5.A03 = r6     // Catch:{ all -> 0x00ff }
            java.lang.Object r0 = X.1Eo.A00(r5, r14, r0)     // Catch:{ all -> 0x00ff }
            if (r0 == r10) goto L_0x0125
            r10 = r3
            r12 = 252654211(0xf0f3283, float:7.0601725E-30)
            r5 = r2
            goto L_0x00be
        L_0x00b9:
            r5 = r2
            goto L_0x00fc
        L_0x00bb:
            X.0eS.A00(r0)     // Catch:{ all -> 0x0102 }
        L_0x00be:
            long r19 = X.AnonymousClass7TE.A0R(r0)     // Catch:{ all -> 0x0102 }
            r18 = r1
            r16 = r12
            r17 = r10
            r15.markerAnnotate(r16, r17, r18, r19)     // Catch:{ all -> 0x0102 }
            com.facebook.quicklog.QuickPerformanceLogger r10 = r2.A08     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = "frames_count"
            int r0 = r11.A01     // Catch:{ all -> 0x0102 }
            r10.markerAnnotate(r4, r3, r1, r0)     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = "sticker_pack_name"
            java.lang.String r0 = r11.A0B     // Catch:{ all -> 0x0102 }
            r10.markerAnnotate(r4, r3, r1, r0)     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = "revision_id"
            java.lang.String r0 = r9.A07     // Catch:{ all -> 0x0102 }
            r10.markerAnnotate(r4, r3, r1, r0)     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = "stable_id"
            java.lang.String r0 = r8.A04     // Catch:{ all -> 0x0102 }
            r10.markerAnnotate(r4, r3, r1, r0)     // Catch:{ all -> 0x0102 }
            X.0eM r0 = r2.A0C     // Catch:{ all -> 0x0102 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x0102 }
            com.instagram.pdqhashing.PDQHashingBridge r2 = (com.instagram.pdqhashing.PDQHashingBridge) r2     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = r7.getCanonicalPath()     // Catch:{ all -> 0x0102 }
            java.lang.Integer r0 = X.JTO.A0w(r3)     // Catch:{ all -> 0x0102 }
            r2.getHashWithQuality(r1, r6, r0)     // Catch:{ all -> 0x0102 }
        L_0x00fc:
            X.0gF r2 = X.C60340gF.A00     // Catch:{ all -> 0x0102 }
            goto L_0x0107
        L_0x00ff:
            r0 = move-exception
            r5 = r2
            goto L_0x0103
        L_0x0102:
            r0 = move-exception
        L_0x0103:
            X.0eQ r2 = X.JTO.A1B(r0)
        L_0x0107:
            boolean r0 = r2 instanceof X.0eQ
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0113
            com.facebook.quicklog.QuickPerformanceLogger r1 = r5.A08
            r0 = 2
            r1.markerEnd(r4, r3, r0)
        L_0x0113:
            java.lang.Throwable r2 = X.0eR.A00(r2)
            if (r2 == 0) goto L_0x0123
            com.facebook.quicklog.QuickPerformanceLogger r1 = r5.A08
            r0 = 3
            r1.markerEnd(r4, r3, r0)
            boolean r0 = r2 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L_0x012a
        L_0x0123:
            X.0gF r10 = X.C60340gF.A00
        L_0x0125:
            return r10
        L_0x0126:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0x()
        L_0x012a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController.A01(com.facebook.avatar.expresso.odr.ODRController, X.JrI, X.JrP, X.JrQ, java.io.File, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.facebook.avatar.expresso.odr.ODRController r8, X.LG2 r9, java.io.File r10, java.lang.String r11, java.lang.String r12, X.AnonymousClass4D7 r13) {
        /*
            r3 = 3
            boolean r0 = X.ME0.A02(r3, r13)
            if (r0 == 0) goto L_0x00b4
            r6 = r13
            X.ME0 r6 = (X.ME0) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b4
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r6.A05
            X.1Hj r4 = X.1Hj.A02
            int r0 = r6.A00
            r7 = 2
            r5 = 1
            if (r0 == 0) goto L_0x003b
            if (r0 == r5) goto L_0x0053
            if (r0 != r7) goto L_0x00bb
            java.lang.Object r12 = r6.A01
            java.lang.String r12 = (java.lang.String) r12
            X.0eS.A00(r1)
        L_0x002a:
            java.lang.String r1 = "ODRController"
            java.lang.String r0 = "Failed to download animation asset for template id "
            java.lang.String r0 = X.002.A0R(r0, r12)
            X.0KC.A0C(r1, r0)
            r5 = 0
        L_0x0036:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            return r4
        L_0x003b:
            X.0eS.A00(r1)
            X.4Cc r0 = r8.A0D
            com.facebook.avatar.expresso.odr.network.ODRNetworkDownloader r1 = new com.facebook.avatar.expresso.odr.network.ODRNetworkDownloader
            r1.<init>(r0)
            com.instagram.common.session.UserSession r0 = r8.A09
            X.ME0.A00(r8, r10, r12, r9, r6)
            r6.A00 = r5
            java.lang.Object r1 = r1.A00(r0, r10, r11, r6)
            if (r1 != r4) goto L_0x0066
            return r4
        L_0x0053:
            java.lang.Object r9 = r6.A04
            X.LG2 r9 = (X.LG2) r9
            java.lang.Object r12 = r6.A03
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r10 = r6.A02
            java.io.File r10 = (java.io.File) r10
            java.lang.Object r8 = r6.A01
            com.facebook.avatar.expresso.odr.ODRController r8 = (com.facebook.avatar.expresso.odr.ODRController) r8
            X.0eS.A00(r1)
        L_0x0066:
            boolean r0 = X.AnonymousClass7TE.A1a(r1)
            if (r0 == 0) goto L_0x0097
            java.util.Map r4 = r8.A0A
            org.json.JSONObject r3 = X.DbS.A11()
            java.lang.String r2 = "lights"
            r0 = 0
            if (r9 == 0) goto L_0x0095
            org.json.JSONObject r1 = r9.A05
        L_0x0079:
            r3.put(r2, r1)
            java.lang.String r1 = "camera"
            if (r9 == 0) goto L_0x0082
            org.json.JSONObject r0 = r9.A04
        L_0x0082:
            r3.put(r1, r0)
            java.lang.String r1 = r10.getAbsolutePath()
            X.0qQ.A07(r1)
            X.LOn r0 = new X.LOn
            r0.<init>(r1, r3)
            r4.put(r12, r0)
            goto L_0x0036
        L_0x0095:
            r1 = r0
            goto L_0x0079
        L_0x0097:
            X.0V2 r3 = r8.A0F
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            java.lang.String r0 = "Template info asset download failure"
            X.JrG r1 = new X.JrG
            r1.<init>(r0, r2)
            r6.A01 = r12
            r0 = 0
            r6.A02 = r0
            r6.A03 = r0
            r6.A04 = r0
            r6.A00 = r7
            java.lang.Object r0 = r3.emit(r1, r6)
            if (r0 != r4) goto L_0x002a
            return r4
        L_0x00b4:
            X.ME0 r6 = new X.ME0
            r6.<init>(r8, r13, r3)
            goto L_0x0015
        L_0x00bb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController.A03(com.facebook.avatar.expresso.odr.ODRController, X.LG2, java.io.File, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r12v2, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(com.facebook.avatar.expresso.odr.ODRController r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, X.AnonymousClass4D7 r12, int r13) {
        /*
            r3 = 7
            r4 = r12
            boolean r0 = X.MED.A04(r3, r12)
            if (r0 == 0) goto L_0x00a0
            r12 = r4
            X.MED r12 = (X.MED) r12
            int r2 = r12.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a0
            int r2 = r2 - r1
            r12.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r12.A04
            X.1Hj r7 = X.1Hj.A02
            int r1 = r12.A00
            r6 = 3
            r0 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0051
            if (r1 == r5) goto L_0x0061
            if (r1 == r0) goto L_0x0083
            if (r1 != r6) goto L_0x00a7
            X.0eS.A00(r2)
        L_0x002a:
            boolean r0 = X.AnonymousClass7TE.A1a(r2)
            if (r0 != 0) goto L_0x00ad
            java.lang.String r4 = "ODRController"
            java.lang.String r3 = "cache"
            java.lang.String r2 = "Error in creating cache file"
            X.0wj r1 = X.0wj.A01
            r0 = 603982406(0x24000a46, float:2.7764278E-17)
            X.0f9 r0 = r1.AEf(r4, r0)
            r0.ABQ(r3, r2)
            r0.report()
            java.lang.String r0 = "unable to create cache file"
            X.0KC.A0C(r4, r0)
            java.lang.String r0 = "Unable to create cache file"
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x0051:
            X.0eS.A00(r2)
            r12.A01 = r8
            r12.A02 = r10
            r12.A00 = r5
            java.lang.Object r2 = A04(r8, r9, r10, r11, r12, r13)
            if (r2 != r7) goto L_0x006a
            return r7
        L_0x0061:
            java.lang.Object r10 = r12.A02
            java.lang.Object r8 = r12.A01
            com.facebook.avatar.expresso.odr.ODRController r8 = (com.facebook.avatar.expresso.odr.ODRController) r8
            X.0eS.A00(r2)
        L_0x006a:
            r1 = r2
            java.io.File r1 = (java.io.File) r1
            if (r1 == 0) goto L_0x00ac
            X.MED.A00(r8, r10, r1, r12, r0)
            X.4Cc r4 = r8.A0D
            r3 = 0
            r2 = 26
            X.JUv r0 = new X.JUv
            r0.<init>(r1, r3, r2)
            java.lang.Object r2 = X.1Eo.A00(r12, r4, r0)
            if (r2 != r7) goto L_0x008e
            return r7
        L_0x0083:
            java.lang.Object r1 = r12.A03
            java.io.File r1 = (java.io.File) r1
            java.lang.Object r8 = r12.A01
            com.facebook.avatar.expresso.odr.ODRController r8 = (com.facebook.avatar.expresso.odr.ODRController) r8
            X.0eS.A00(r2)
        L_0x008e:
            boolean r0 = X.AnonymousClass7TE.A1a(r2)
            if (r0 != 0) goto L_0x00ac
            com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r0 = r8.A05
            X.MED.A03(r12, r6)
            java.lang.Object r2 = com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A00(r0, r1, r12)
            if (r2 != r7) goto L_0x002a
            return r7
        L_0x00a0:
            X.MED r12 = new X.MED
            r12.<init>(r8, r4, r3)
            goto L_0x0016
        L_0x00a7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00ac:
            r5 = 0
        L_0x00ad:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController.A05(com.facebook.avatar.expresso.odr.ODRController, java.lang.String, java.lang.String, java.lang.String, X.4D7, int):java.lang.Object");
    }

    public /* synthetic */ ODRController(Context context, QuickPerformanceLogger quickPerformanceLogger, UserSession userSession, C262094Cc r8) {
        AvatarStickerCacheImpl avatarStickerCacheImpl = new AvatarStickerCacheImpl(context, r8);
        TY5 ty5 = new TY5(r8, 2);
        0qQ.A0B(context, 1);
        AnonymousClass7TF.A1C(userSession, 2, quickPerformanceLogger);
        this.A04 = context;
        this.A09 = userSession;
        this.A08 = quickPerformanceLogger;
        this.A0D = r8;
        this.A05 = avatarStickerCacheImpl;
        this.A0E = ty5;
        05D A0p = JTQ.A0p();
        this.A0F = A0p;
        this.A0G = JTP.A10(A0p);
        this.A07 = new ODRAssetManager(r8);
        this.A06 = new L37(userSession);
        this.A0C = AnonymousClass0eN.A00(0eO.A03, C66222MJd.A00);
    }

    private final LGB A00(File file, float f, int i, int i2, int i3) {
        QuickPerformanceLogger quickPerformanceLogger = this.A08;
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        UserSession userSession = this.A09;
        0Tu r3 = 0Tu.A05;
        return new LGB((WebPEncoderImpl) this.A0E.invoke(Float.valueOf(f)), quickPerformanceLogger, file, valueOf, valueOf2, i3, DbS.A04(r3, userSession, 36605933249762643L), DbS.A04(r3, userSession, 36605933249893717L), DbS.A04(r3, userSession, 36605933250221399L), 182.A06(0Tu.A06, userSession, 36324458273321060L));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: X.1Hj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: X.1Hj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: X.1Hj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: com.facebook.avatar.expresso.odr.rmv.ODRAvatarHandler} */
    /* JADX WARNING: type inference failed for: r20v0, types: [X.4D7] */
    /* JADX WARNING: type inference failed for: r10v7 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.facebook.avatar.expresso.odr.ODRController r22, X.C60787JrI r23, X.C60794JrP r24, X.C60795JrQ r25, java.lang.String r26, X.AnonymousClass4D7 r27, X.C262224Cq r28) {
        /*
            r2 = r22
            r4 = 21
            r5 = r27
            boolean r0 = X.C66144MDw.A02(r4, r5)
            if (r0 == 0) goto L_0x0155
            r7 = r5
            X.MDw r7 = (X.C66144MDw) r7
            int r3 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0155
            int r3 = r3 - r1
            r7.A00 = r3
        L_0x001a:
            java.lang.Object r10 = r7.A02
            X.1Hj r3 = X.1Hj.A02
            int r1 = r7.A00
            r0 = 1
            if (r1 == 0) goto L_0x0033
            if (r1 != r0) goto L_0x015c
            java.lang.Object r2 = r7.A01
            com.facebook.avatar.expresso.odr.ODRController r2 = (com.facebook.avatar.expresso.odr.ODRController) r2
            X.0eS.A00(r10)
        L_0x002c:
            X.MTI r10 = (X.MTI) r10
            r2.A00 = r10
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0033:
            X.0eS.A00(r10)
            r5 = 0
            com.facebook.avatar.expresso.odr.ODRController$initODRCDLHandlerOrODRAvatarHandler$callback$1 r21 = new com.facebook.avatar.expresso.odr.ODRController$initODRCDLHandlerOrODRAvatarHandler$callback$1
            r11 = r25
            r22 = r28
            r8 = r21
            r9 = r2
            r12 = r5
            r13 = r22
            r10 = r24
            r8.<init>(r9, r10, r11, r12, r13)
            r7.A01 = r2
            r7.A00 = r0
            java.lang.String r10 = r11.A07
            java.lang.String r12 = "Required value was null."
            if (r10 == 0) goto L_0x0182
            org.json.JSONObject r9 = r11.A08
            if (r9 == 0) goto L_0x0152
            java.util.LinkedHashMap r6 = X.RU3.A00(r9)
        L_0x005a:
            java.lang.String r8 = X.Pxd.A00(r4)
            X.0qQ.A0C(r6, r8)
            X.JrQ r0 = r2.A01
            if (r0 == 0) goto L_0x017d
            int r4 = r0.A01
            int r1 = r0.A02
            java.lang.String r0 = r11.A04
            if (r0 == 0) goto L_0x0178
            X.LG1 r14 = new X.LG1
            r15 = r10
            r16 = r0
            r17 = r6
            r18 = r4
            r19 = r1
            r14.<init>(r15, r16, r17, r18, r19)
            com.instagram.common.session.UserSession r4 = r2.A09
            X.0Tu r6 = X.0Tu.A05
            r0 = 36324458273321060(0x810ce7000a3064, double:3.035071906676955E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            java.lang.String r11 = "ig4aAvatarRichMediaViewerProvider"
            r16 = r23
            r10 = r26
            if (r0 != 0) goto L_0x00bc
            r0 = 36324458273452134(0x810ce7000c3066, double:3.035071906759847E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            if (r0 != 0) goto L_0x00bc
            com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler$Companion r13 = com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler.A0F
            X.LRf r5 = r2.A03
            if (r5 == 0) goto L_0x0170
            com.facebook.quicklog.QuickPerformanceLogger r1 = r2.A08
            java.util.Map r0 = r2.A0A
            java.lang.Object r15 = r0.get(r10)
            if (r15 == 0) goto L_0x0161
            X.LOn r15 = (X.C64120LOn) r15
            r17 = r5
            r18 = r1
            r19 = r4
            r20 = r7
            java.lang.Object r10 = r13.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x00b9:
            if (r10 != r3) goto L_0x002c
            return r3
        L_0x00bc:
            X.LRf r1 = r2.A03
            if (r1 == 0) goto L_0x0170
            com.facebook.quicklog.QuickPerformanceLogger r7 = r2.A08
            java.util.Map r0 = r2.A0A
            java.lang.Object r0 = r0.get(r10)
            if (r0 == 0) goto L_0x016b
            X.LOn r0 = (X.C64120LOn) r0
            com.facebook.avatar.expresso.odr.rmv.ODRAvatarHandler r10 = new com.facebook.avatar.expresso.odr.rmv.ODRAvatarHandler
            r13 = r10
            r14 = r0
            r15 = r16
            r16 = r1
            r17 = r7
            r18 = r21
            r19 = r22
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0 = 36324458273452134(0x810ce7000c3066, double:3.035071906759847E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            if (r0 == 0) goto L_0x00b9
            java.lang.String r6 = X.AnonymousClass7TG.A0j()
            r1 = 603995461(0x24003d45, float:2.7807473E-17)
            java.lang.String r0 = "ale_request_id"
            r7.markerAnnotate(r1, r0, r6)
            X.WGr r0 = r2.A02
            if (r0 != 0) goto L_0x0102
            java.lang.String r0 = "odrAleProviderImpl"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0102:
            if (r9 == 0) goto L_0x0166
            X.UIF r4 = r0.A00
            java.util.LinkedHashMap r9 = X.RU3.A00(r9)
            X.0qQ.A0C(r9, r8)
            java.lang.StringBuilder r8 = X.AnonymousClass7TE.A1A()
            java.util.Iterator r12 = X.AnonymousClass7TF.A0s(r9)
            r11 = 0
        L_0x0116:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0144
            int r7 = r11 + 1
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r12)
            java.lang.String r0 = X.DbT.A13(r1)
            r8.append(r0)
            java.lang.String r0 = ":"
            r8.append(r0)
            java.lang.String r0 = X.DbS.A0s(r1)
            r8.append(r0)
            int r0 = r9.size()
            int r0 = r0 + -1
            if (r11 == r0) goto L_0x0142
            java.lang.String r0 = ","
            r8.append(r0)
        L_0x0142:
            r11 = r7
            goto L_0x0116
        L_0x0144:
            java.lang.String r1 = X.DbT.A10(r8)
            X.GSY r0 = new X.GSY
            r0.<init>((X.C17653Vbj) r5, (java.lang.String) r6, (java.lang.String) r1)
            r4.A0E(r0)
            goto L_0x00b9
        L_0x0152:
            r6 = r5
            goto L_0x005a
        L_0x0155:
            X.MDw r7 = new X.MDw
            r7.<init>(r2, r5, r4)
            goto L_0x001a
        L_0x015c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0161:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x0166:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x016b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x0170:
            X.0qQ.A0F(r11)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0178:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x017d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x0182:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController.A02(com.facebook.avatar.expresso.odr.ODRController, X.JrI, X.JrP, X.JrQ, java.lang.String, X.4D7, X.4Cq):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MEC, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(com.facebook.avatar.expresso.odr.ODRController r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, X.AnonymousClass4D7 r12, int r13) {
        /*
            r3 = 21
            boolean r0 = X.MEC.A03(r3, r12)
            if (r0 == 0) goto L_0x0022
            r7 = r12
            X.MEC r7 = (X.MEC) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r7.A01
            X.1Hj r2 = X.1Hj.A02
            int r1 = r7.A00
            r0 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r0) goto L_0x002b
            goto L_0x0027
        L_0x0022:
            X.MEC r7 = X.MEC.A00(r8, r12, r3)
            goto L_0x0016
        L_0x0027:
            X.0eS.A00(r3)     // Catch:{ NullPointerException -> 0x0043 }
            return r3
        L_0x002b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0030:
            X.0eS.A00(r3)
            com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r3 = r8.A05     // Catch:{ NullPointerException -> 0x0043 }
            r7.A00 = r0     // Catch:{ NullPointerException -> 0x0043 }
            r4 = r9
            r5 = r10
            r6 = r11
            r8 = r13
            java.lang.Object r3 = r3.A04(r4, r5, r6, r7, r8)     // Catch:{ NullPointerException -> 0x0043 }
            if (r3 != r2) goto L_0x0042
            return r2
        L_0x0042:
            return r3
        L_0x0043:
            java.lang.String r4 = "ODRController"
            java.lang.String r3 = "File place holder name is null"
            X.0KC.A0C(r4, r3)
            java.lang.String r2 = "cache"
            X.0wj r1 = X.0wj.A01
            r0 = 603982406(0x24000a46, float:2.7764278E-17)
            X.0f9 r0 = r1.AEf(r4, r0)
            r0.ABQ(r2, r3)
            r0.report()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController.A04(com.facebook.avatar.expresso.odr.ODRController, java.lang.String, java.lang.String, java.lang.String, X.4D7, int):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MEC, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A06(com.facebook.avatar.expresso.odr.ODRController r8, java.lang.String r9, java.util.Map r10, X.AnonymousClass4D7 r11) {
        /*
            r3 = 20
            boolean r0 = X.MEC.A03(r3, r11)
            if (r0 == 0) goto L_0x004b
            r7 = r11
            X.MEC r7 = (X.MEC) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004b
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r7.A01
            X.1Hj r6 = X.1Hj.A02
            int r1 = r7.A00
            r5 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 != r5) goto L_0x0050
            X.0eS.A00(r0)
        L_0x0024:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
        L_0x0028:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L_0x002d:
            X.0eS.A00(r0)
            java.lang.Object r4 = r10.get(r9)
            if (r4 == 0) goto L_0x0049
            X.4Cc r3 = r8.A0D
            r2 = 0
            r1 = 25
            X.JUv r0 = new X.JUv
            r0.<init>(r4, r2, r1)
            r7.A00 = r5
            java.lang.Object r0 = X.1Eo.A00(r7, r3, r0)
            if (r0 != r6) goto L_0x0024
            return r6
        L_0x0049:
            r0 = 0
            goto L_0x0028
        L_0x004b:
            X.MEC r7 = X.MEC.A00(r8, r11, r3)
            goto L_0x0016
        L_0x0050:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController.A06(com.facebook.avatar.expresso.odr.ODRController, java.lang.String, java.util.Map, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A07(com.facebook.avatar.expresso.odr.ODRController r6, java.util.Map r7, X.AnonymousClass4D7 r8) {
        /*
            r3 = 9
            boolean r0 = X.C66146MDy.A02(r3, r8)
            if (r0 == 0) goto L_0x0058
            r5 = r8
            X.MDy r5 = (X.C66146MDy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0058
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A03
            X.1Hj r3 = X.1Hj.A02
            int r2 = r5.A00
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L_0x0028
            if (r2 == r0) goto L_0x0037
            if (r2 != r1) goto L_0x005e
            X.0eS.A00(r4)
        L_0x0027:
            return r4
        L_0x0028:
            X.0eS.A00(r4)
            X.C66146MDy.A00(r6, r7, r5, r0)
            java.lang.String r0 = "scene"
            java.lang.Object r4 = A06(r6, r0, r7, r5)
            if (r4 != r3) goto L_0x0042
            return r3
        L_0x0037:
            java.lang.Object r7 = r5.A02
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r6 = r5.A01
            com.facebook.avatar.expresso.odr.ODRController r6 = (com.facebook.avatar.expresso.odr.ODRController) r6
            X.0eS.A00(r4)
        L_0x0042:
            boolean r0 = X.AnonymousClass7TE.A1a(r4)
            if (r0 == 0) goto L_0x0063
            r0 = 0
            r5.A01 = r0
            r5.A02 = r0
            r5.A00 = r1
            java.lang.String r0 = "anim"
            java.lang.Object r4 = A06(r6, r0, r7, r5)
            if (r4 != r3) goto L_0x0027
            return r3
        L_0x0058:
            X.MDy r5 = new X.MDy
            r5.<init>(r6, r8, r3)
            goto L_0x0016
        L_0x005e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0063:
            java.lang.Boolean r3 = X.AnonymousClass7TE.A0u()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController.A07(com.facebook.avatar.expresso.odr.ODRController, java.util.Map, X.4D7):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r10v1, types: [X.MDt, X.4D7] */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c6, code lost:
        if (r15 == r9) goto L_0x00c8;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0103 A[SYNTHETIC, Splitter:B:33:0x0103] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012e A[Catch:{ FileNotFoundException | IOException -> 0x0150 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0180 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A08(com.facebook.avatar.expresso.odr.ODRController r17, java.util.Map r18, X.AnonymousClass4D7 r19) {
        /*
            r6 = r17
            r3 = r18
            r11 = 0
            r4 = r19
            boolean r0 = X.C66141MDt.A02(r11, r4)
            if (r0 == 0) goto L_0x0181
            r10 = r4
            X.MDt r10 = (X.C66141MDt) r10
            int r2 = r10.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0181
            int r2 = r2 - r1
            r10.A00 = r2
        L_0x001b:
            java.lang.Object r15 = r10.A08
            X.1Hj r9 = X.1Hj.A02
            int r1 = r10.A00
            java.lang.String r18 = "is_odr_asset_cache_hit"
            r17 = 603995461(0x24003d45, float:2.7807473E-17)
            r16 = 4
            r14 = 3
            r13 = 2
            r12 = 1
            r8 = 0
            if (r1 == 0) goto L_0x0063
            if (r1 == r12) goto L_0x00c9
            if (r1 == r13) goto L_0x0071
            if (r1 == r14) goto L_0x0047
            r0 = r16
            if (r1 != r0) goto L_0x0188
            java.lang.Object r1 = r10.A02
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r7 = r10.A01
            java.util.List r7 = (java.util.List) r7
            X.0eS.A00(r15)
        L_0x0043:
            r7.addAll(r1)
            return r7
        L_0x0047:
            java.lang.Object r1 = r10.A07
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r5 = r10.A06
            java.lang.Object r4 = r10.A05
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r2 = r10.A04
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r7 = r10.A03
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r3 = r10.A02
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r6 = r10.A01
            com.facebook.avatar.expresso.odr.ODRController r6 = (com.facebook.avatar.expresso.odr.ODRController) r6
            goto L_0x011d
        L_0x0063:
            java.util.ArrayList r7 = X.JTQ.A0e(r15)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = X.AnonymousClass7TF.A0u(r3)
            r2 = r1
            goto L_0x00a4
        L_0x0071:
            java.lang.Object r1 = r10.A07
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r5 = r10.A06
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r10.A05
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r2 = r10.A04
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r7 = r10.A03
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r3 = r10.A02
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r0 = r10.A01
            com.facebook.avatar.expresso.odr.ODRController r0 = (com.facebook.avatar.expresso.odr.ODRController) r0
            X.0eS.A00(r15)
            r6 = r0
        L_0x0091:
            boolean r15 = X.AnonymousClass7TE.A1a(r15)
            if (r15 != 0) goto L_0x00fb
            r7.add(r5)
            com.facebook.quicklog.QuickPerformanceLogger r5 = r0.A08
            r1 = r17
            r0 = r18
            r5.markerAnnotate(r1, r0, r11)
        L_0x00a3:
            r1 = r2
        L_0x00a4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0155
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r4)
            java.lang.String r5 = X.DbT.A13(r0)
            r0.getValue()
            com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r0 = r6.A05
            X.C66141MDt.A00(r6, r3, r7, r1, r10)
            r10.A05 = r4
            r10.A06 = r5
            r10.A07 = r8
            r10.A00 = r12
            java.lang.Object r15 = com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A02(r0, r5, r10)
            if (r15 != r9) goto L_0x00e4
        L_0x00c8:
            return r9
        L_0x00c9:
            java.lang.Object r5 = r10.A06
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r10.A05
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r2 = r10.A04
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r7 = r10.A03
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r3 = r10.A02
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r6 = r10.A01
            com.facebook.avatar.expresso.odr.ODRController r6 = (com.facebook.avatar.expresso.odr.ODRController) r6
            X.0eS.A00(r15)
        L_0x00e4:
            java.util.Map r15 = (java.util.Map) r15
            X.C66141MDt.A00(r6, r3, r7, r2, r10)
            r10.A05 = r4
            r10.A06 = r5
            r10.A07 = r15
            r10.A00 = r13
            java.lang.Object r0 = A07(r6, r15, r10)
            if (r0 == r9) goto L_0x00c8
            r1 = r15
            r15 = r0
            r0 = r6
            goto L_0x0091
        L_0x00fb:
            java.util.Map r15 = r0.A0A
            boolean r15 = r15.containsKey(r5)
            if (r15 != 0) goto L_0x0150
            com.facebook.avatar.expresso.odr.asset.ODRAssetManager r15 = r0.A07     // Catch:{ FileNotFoundException | IOException -> 0x0150 }
            r19 = r15
            com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r15 = r0.A05     // Catch:{ FileNotFoundException | IOException -> 0x0150 }
            X.C66141MDt.A00(r0, r3, r7, r2, r10)     // Catch:{ FileNotFoundException | IOException -> 0x0150 }
            r10.A05 = r4     // Catch:{ FileNotFoundException | IOException -> 0x0150 }
            r10.A06 = r5     // Catch:{ FileNotFoundException | IOException -> 0x0150 }
            r10.A07 = r1     // Catch:{ FileNotFoundException | IOException -> 0x0150 }
            r10.A00 = r14     // Catch:{ FileNotFoundException | IOException -> 0x0150 }
            r0 = r19
            java.lang.Object r15 = r0.A01(r15, r5, r10)     // Catch:{ FileNotFoundException | IOException -> 0x0150 }
            if (r15 != r9) goto L_0x0120
            goto L_0x018d
        L_0x011d:
            X.0eS.A00(r15)     // Catch:{ FileNotFoundException | IOException -> 0x0150 }
        L_0x0120:
            org.json.JSONObject r15 = (org.json.JSONObject) r15     // Catch:{ FileNotFoundException | IOException -> 0x0150 }
            java.util.Map r0 = r6.A0A     // Catch:{ FileNotFoundException | IOException -> 0x0150 }
            r19 = r0
            java.lang.String r0 = "anim"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ FileNotFoundException | IOException -> 0x0150 }
            if (r0 == 0) goto L_0x014b
            java.io.File r0 = (java.io.File) r0     // Catch:{ FileNotFoundException | IOException -> 0x0150 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ FileNotFoundException | IOException -> 0x0150 }
            X.0qQ.A07(r0)     // Catch:{ FileNotFoundException | IOException -> 0x0150 }
            X.LOn r1 = new X.LOn     // Catch:{ FileNotFoundException | IOException -> 0x0150 }
            r1.<init>(r0, r15)     // Catch:{ FileNotFoundException | IOException -> 0x0150 }
            r0 = r19
            r0.put(r5, r1)     // Catch:{ FileNotFoundException | IOException -> 0x0150 }
            com.facebook.quicklog.QuickPerformanceLogger r15 = r6.A08     // Catch:{ FileNotFoundException | IOException -> 0x0150 }
            r1 = r17
            r0 = r18
            r15.markerAnnotate(r1, r0, r12)     // Catch:{ FileNotFoundException | IOException -> 0x0150 }
            goto L_0x0150
        L_0x014b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ FileNotFoundException | IOException -> 0x0150 }
            throw r0     // Catch:{ FileNotFoundException | IOException -> 0x0150 }
        L_0x0150:
            r2.add(r5)
            goto L_0x00a3
        L_0x0155:
            r10.A01 = r7
            r10.A02 = r1
            r10.A03 = r8
            r10.A04 = r8
            r10.A05 = r8
            r10.A06 = r8
            r10.A07 = r8
            r0 = r16
            r10.A00 = r0
            com.facebook.avatar.expresso.odr.asset.ODRAssetManager r12 = r6.A07
            com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r13 = r6.A05
            X.InX r0 = new X.InX
            r0.<init>(r6, r11)
            r14 = r7
            r15 = r3
            r16 = r10
            r17 = r0
            java.lang.Object r0 = r12.A02(r13, r14, r15, r16, r17)
            if (r0 == r9) goto L_0x017e
            X.0gF r0 = X.C60340gF.A00
        L_0x017e:
            if (r0 != r9) goto L_0x0043
            return r9
        L_0x0181:
            X.MDt r10 = new X.MDt
            r10.<init>(r6, r4, r11)
            goto L_0x001b
        L_0x0188:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x018d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController.A08(com.facebook.avatar.expresso.odr.ODRController, java.util.Map, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDt, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v23, types: [com.facebook.avatar.expresso.odr.network.ExpressoTemplatePackAndUserInfo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006d, code lost:
        r0 = (X.C239803Ii) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0073, code lost:
        if ((r0 instanceof X.C297815sO) == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0075, code lost:
        r14.A08.markerPoint(603995461, "avatar_and_template_pack_info_query_end");
        X.0KC.A0C("ODRController", "Failed to fetch user avatar info and template pack data");
        r3 = r14.A0F;
        r2 = new X.C60785JrG("Failure in fetching Template pack data", X.AnonymousClass05K.A0Y);
        r5.A01 = null;
        r5.A02 = null;
        r5.A03 = null;
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0097, code lost:
        if ((r0 instanceof X.C239793Ih) == false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0099, code lost:
        r9 = r14.A08;
        r9.markerPoint(603995461, "avatar_and_template_pack_info_query_end");
        r2 = (X.C62698Kky) ((X.C239793Ih) r0).A00;
        X.0qQ.A0C(r2, "null cannot be cast to non-null type com.facebook.avatar.expresso.utils.ODRSuccess.UserAvatarAndTemplateData");
        r0 = (X.C60791JrM) r2;
        r11 = r0.A01;
        r10 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b2, code lost:
        if (r11.A09 != false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b4, code lost:
        r3 = r14.A0F;
        r2 = new X.C60785JrG("ODR is not enabled", X.AnonymousClass05K.A03);
        r5.A01 = null;
        r5.A02 = null;
        r5.A03 = null;
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c8, code lost:
        r9.markerAnnotate(603995461, "avatar_style", r11.A05);
        r9 = r11.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d1, code lost:
        if (r9 == null) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d3, code lost:
        r0 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d5, code lost:
        if (r0 == null) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d7, code lost:
        r3 = X.AnonymousClass7TE.A19(r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00db, code lost:
        if (r3 == null) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00dd, code lost:
        r14.A0B.put(r8.A00, r10);
        r14.A01 = r11;
        X.C66141MDt.A00(r14, r8, r7, r2, r5);
        r5.A05 = r3;
        r5.A06 = r9;
        r5.A07 = r10;
        r5.A00 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f3, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f9, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fe, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0103, code lost:
        throw X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r11 = r10.A00.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0127, code lost:
        if (r11 == null) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0129, code lost:
        r0 = r14.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012b, code lost:
        if (r0 == null) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012d, code lost:
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012f, code lost:
        X.C66141MDt.A00(r14, r8, r7, r2, r5);
        r5.A05 = r3;
        r5.A06 = r9;
        r5.A07 = r10;
        r5.A00 = 5;
        r0 = A05(r14, r9, r3, r11, r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0148, code lost:
        if (r0 != r4) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014b, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014d, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0152, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0176, code lost:
        if (X.AnonymousClass7TE.A1a(r0) != false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0178, code lost:
        r8 = r14.A0F;
        r7 = "Template already exists in cache";
        r2 = r10.A00.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0180, code lost:
        if (r2 == null) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0182, code lost:
        r0 = r14.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0184, code lost:
        if (r0 == null) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0186, code lost:
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0188, code lost:
        X.C66141MDt.A00(r14, r7, r8, (java.lang.Object) null, r5);
        r5.A05 = null;
        r5.A06 = null;
        r5.A07 = null;
        r5.A00 = 6;
        r0 = A04(r14, r9, r3, r2, r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a1, code lost:
        if (r0 != r4) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a4, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a6, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ab, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ae, code lost:
        if (r10.A02 == null) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b0, code lost:
        r1 = ((X.C60791JrM) r2).A00.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b7, code lost:
        if (r1 == null) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b9, code lost:
        X.C66141MDt.A00(r14, r8, r7, r2, r5);
        r5.A05 = r3;
        r5.A06 = null;
        r5.A07 = null;
        r5.A00 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ca, code lost:
        if (A08(r14, r1, r5) != r4) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01cc, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e4, code lost:
        r2 = (X.C60791JrM) r2;
        r15 = r2.A00;
        r2 = r2.A01;
        r1 = r8.A00;
        r5.A01 = null;
        r5.A02 = null;
        r5.A03 = null;
        r5.A04 = null;
        r5.A05 = null;
        r5.A00 = 10;
        r0 = r14.A0A(r15, r2, r3, r1, r14.A0A, r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0211, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0216, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r1 = new X.C60786JrH(r7, (java.io.File) r0);
        r5.A01 = r14;
        r5.A02 = null;
        r5.A03 = null;
        r5.A00 = 7;
        r0 = r8.emit(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x023b, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0270, code lost:
        if (r0 != r4) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0272, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0278, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0273  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(X.C64122LOq r23, X.AnonymousClass4D7 r24, X.C262224Cq r25) {
        /*
            r22 = this;
            r8 = r23
            r7 = r25
            r3 = 2
            r4 = r24
            boolean r0 = X.C66141MDt.A02(r3, r4)
            r10 = r22
            if (r0 == 0) goto L_0x0032
            r5 = r4
            X.MDt r5 = (X.C66141MDt) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0032
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x001d:
            java.lang.Object r0 = r5.A08
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 0
            r12 = 603995461(0x24003d45, float:2.7807473E-17)
            java.lang.String r13 = "Required value was null."
            r6 = 0
            switch(r1) {
                case 0: goto L_0x0038;
                case 1: goto L_0x005e;
                case 2: goto L_0x0273;
                case 3: goto L_0x0273;
                case 4: goto L_0x0104;
                case 5: goto L_0x0153;
                case 6: goto L_0x0217;
                case 7: goto L_0x023f;
                case 8: goto L_0x0273;
                case 9: goto L_0x01cd;
                case 10: goto L_0x0273;
                default: goto L_0x002d;
            }
        L_0x002d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0032:
            X.MDt r5 = new X.MDt
            r5.<init>(r10, r4, r3)
            goto L_0x001d
        L_0x0038:
            X.0eS.A00(r0)
            com.facebook.quicklog.QuickPerformanceLogger r1 = r10.A08
            java.lang.String r0 = "avatar_and_template_pack_info_query_start"
            r1.markerPoint(r12, r0)
            java.lang.String r9 = r8.A00
            r5.A01 = r10
            r5.A02 = r8
            r5.A03 = r7
            r0 = 1
            r5.A00 = r0
            com.facebook.avatar.expresso.odr.network.ExpressoTemplatePackAndUserInfo r2 = new com.facebook.avatar.expresso.odr.network.ExpressoTemplatePackAndUserInfo
            r2.<init>()
            com.instagram.common.session.UserSession r1 = r10.A09
            X.0sn r0 = X.0sn.A00
            java.lang.Object r0 = r2.A00(r1, r9, r0, r5)
            if (r0 == r4) goto L_0x0272
            r14 = r10
            goto L_0x006d
        L_0x005e:
            java.lang.Object r7 = r5.A03
            X.4Cq r7 = (X.C262224Cq) r7
            java.lang.Object r8 = r5.A02
            X.LOq r8 = (X.C64122LOq) r8
            java.lang.Object r14 = r5.A01
            com.facebook.avatar.expresso.odr.ODRController r14 = (com.facebook.avatar.expresso.odr.ODRController) r14
            X.0eS.A00(r0)
        L_0x006d:
            X.3Ii r0 = (X.C239803Ii) r0
            boolean r1 = r0 instanceof X.C297815sO
            java.lang.String r2 = "avatar_and_template_pack_info_query_end"
            if (r1 == 0) goto L_0x0095
            com.facebook.quicklog.QuickPerformanceLogger r0 = r14.A08
            r0.markerPoint(r12, r2)
            java.lang.String r1 = "ODRController"
            java.lang.String r0 = "Failed to fetch user avatar info and template pack data"
            X.0KC.A0C(r1, r0)
            X.0V2 r3 = r14.A0F
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            java.lang.String r0 = "Failure in fetching Template pack data"
            X.JrG r2 = new X.JrG
            r2.<init>(r0, r1)
            r5.A01 = r6
            r5.A02 = r6
            r5.A03 = r6
            r0 = 2
            goto L_0x026a
        L_0x0095:
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x00ff
            com.facebook.quicklog.QuickPerformanceLogger r9 = r14.A08
            r9.markerPoint(r12, r2)
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r2 = r0.A00
            X.Kky r2 = (X.C62698Kky) r2
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.avatar.expresso.utils.ODRSuccess.UserAvatarAndTemplateData"
            X.0qQ.A0C(r2, r0)
            r0 = r2
            X.JrM r0 = (X.C60791JrM) r0
            X.JrQ r11 = r0.A01
            X.JrO r10 = r0.A00
            boolean r0 = r11.A09
            if (r0 != 0) goto L_0x00c8
            X.0V2 r3 = r14.A0F
            java.lang.Integer r1 = X.AnonymousClass05K.A03
            java.lang.String r0 = "ODR is not enabled"
            X.JrG r2 = new X.JrG
            r2.<init>(r0, r1)
            r5.A01 = r6
            r5.A02 = r6
            r5.A03 = r6
            r0 = 3
            goto L_0x026a
        L_0x00c8:
            java.lang.String r1 = r11.A05
            java.lang.String r0 = "avatar_style"
            r9.markerAnnotate(r12, r0, r1)
            java.lang.String r9 = r11.A06
            if (r9 == 0) goto L_0x00fa
            java.util.List r0 = r10.A02
            if (r0 == 0) goto L_0x00f3
            java.lang.String r3 = X.AnonymousClass7TE.A19(r0, r3)
        L_0x00db:
            if (r3 == 0) goto L_0x00f5
            java.util.Map r1 = r14.A0B
            java.lang.String r0 = r8.A00
            r1.put(r0, r10)
            r14.A01 = r11
            X.C66141MDt.A00(r14, r8, r7, r2, r5)
            r5.A05 = r3
            r5.A06 = r9
            r5.A07 = r10
            r0 = 4
            r5.A00 = r0
            goto L_0x0123
        L_0x00f3:
            r3 = r6
            goto L_0x00db
        L_0x00f5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x00fa:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x00ff:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0104:
            java.lang.Object r10 = r5.A07
            X.JrO r10 = (X.C60793JrO) r10
            java.lang.Object r9 = r5.A06
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r3 = r5.A05
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r5.A04
            X.Kky r2 = (X.C62698Kky) r2
            java.lang.Object r7 = r5.A03
            X.4Cq r7 = (X.C262224Cq) r7
            java.lang.Object r8 = r5.A02
            X.LOq r8 = (X.C64122LOq) r8
            java.lang.Object r14 = r5.A01
            com.facebook.avatar.expresso.odr.ODRController r14 = (com.facebook.avatar.expresso.odr.ODRController) r14
            X.0eS.A00(r0)
        L_0x0123:
            X.JrN r0 = r10.A00     // Catch:{ IOException -> 0x023b }
            java.lang.String r11 = r0.A02     // Catch:{ IOException -> 0x023b }
            if (r11 == 0) goto L_0x014e
            X.JrQ r0 = r14.A01     // Catch:{ IOException -> 0x023b }
            if (r0 == 0) goto L_0x014b
            int r1 = r0.A00     // Catch:{ IOException -> 0x023b }
        L_0x012f:
            X.C66141MDt.A00(r14, r8, r7, r2, r5)     // Catch:{ IOException -> 0x023b }
            r5.A05 = r3     // Catch:{ IOException -> 0x023b }
            r5.A06 = r9     // Catch:{ IOException -> 0x023b }
            r5.A07 = r10     // Catch:{ IOException -> 0x023b }
            r0 = 5
            r5.A00 = r0     // Catch:{ IOException -> 0x023b }
            r15 = r9
            r16 = r3
            r17 = r11
            r18 = r5
            r19 = r1
            java.lang.Object r0 = A05(r14, r15, r16, r17, r18, r19)     // Catch:{ IOException -> 0x023b }
            if (r0 != r4) goto L_0x0172
            goto L_0x014d
        L_0x014b:
            r1 = 0
            goto L_0x012f
        L_0x014d:
            return r4
        L_0x014e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)     // Catch:{ IOException -> 0x023b }
            throw r0     // Catch:{ IOException -> 0x023b }
        L_0x0153:
            java.lang.Object r10 = r5.A07
            X.JrO r10 = (X.C60793JrO) r10
            java.lang.Object r9 = r5.A06
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r3 = r5.A05
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r5.A04
            X.Kky r2 = (X.C62698Kky) r2
            java.lang.Object r7 = r5.A03
            X.4Cq r7 = (X.C262224Cq) r7
            java.lang.Object r8 = r5.A02
            X.LOq r8 = (X.C64122LOq) r8
            java.lang.Object r14 = r5.A01
            com.facebook.avatar.expresso.odr.ODRController r14 = (com.facebook.avatar.expresso.odr.ODRController) r14
            X.0eS.A00(r0)     // Catch:{ IOException -> 0x023b }
        L_0x0172:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)     // Catch:{ IOException -> 0x023b }
            if (r0 != 0) goto L_0x01ac
            X.0V2 r8 = r14.A0F     // Catch:{ IOException -> 0x023b }
            java.lang.String r7 = "Template already exists in cache"
            X.JrN r0 = r10.A00     // Catch:{ IOException -> 0x023b }
            java.lang.String r2 = r0.A02     // Catch:{ IOException -> 0x023b }
            if (r2 == 0) goto L_0x01a7
            X.JrQ r0 = r14.A01     // Catch:{ IOException -> 0x023b }
            if (r0 == 0) goto L_0x01a4
            int r1 = r0.A00     // Catch:{ IOException -> 0x023b }
        L_0x0188:
            X.C66141MDt.A00(r14, r7, r8, r6, r5)     // Catch:{ IOException -> 0x023b }
            r5.A05 = r6     // Catch:{ IOException -> 0x023b }
            r5.A06 = r6     // Catch:{ IOException -> 0x023b }
            r5.A07 = r6     // Catch:{ IOException -> 0x023b }
            r0 = 6
            r5.A00 = r0     // Catch:{ IOException -> 0x023b }
            r15 = r9
            r16 = r3
            r17 = r2
            r18 = r5
            r19 = r1
            java.lang.Object r0 = A04(r14, r15, r16, r17, r18, r19)     // Catch:{ IOException -> 0x023b }
            if (r0 != r4) goto L_0x0226
            goto L_0x01a6
        L_0x01a4:
            r1 = 0
            goto L_0x0188
        L_0x01a6:
            return r4
        L_0x01a7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)     // Catch:{ IOException -> 0x023b }
            throw r0     // Catch:{ IOException -> 0x023b }
        L_0x01ac:
            java.util.List r0 = r10.A02
            if (r0 == 0) goto L_0x0212
            r0 = r2
            X.JrM r0 = (X.C60791JrM) r0
            X.JrO r0 = r0.A00
            java.util.Map r1 = r0.A03
            if (r1 == 0) goto L_0x020d
            X.C66141MDt.A00(r14, r8, r7, r2, r5)
            r5.A05 = r3
            r5.A06 = r6
            r5.A07 = r6
            r0 = 9
            r5.A00 = r0
            java.lang.Object r0 = A08(r14, r1, r5)
            if (r0 != r4) goto L_0x01e4
            return r4
        L_0x01cd:
            java.lang.Object r3 = r5.A05
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r5.A04
            X.Kky r2 = (X.C62698Kky) r2
            java.lang.Object r7 = r5.A03
            X.4Cq r7 = (X.C262224Cq) r7
            java.lang.Object r8 = r5.A02
            X.LOq r8 = (X.C64122LOq) r8
            java.lang.Object r14 = r5.A01
            com.facebook.avatar.expresso.odr.ODRController r14 = (com.facebook.avatar.expresso.odr.ODRController) r14
            X.0eS.A00(r0)
        L_0x01e4:
            X.JrM r2 = (X.C60791JrM) r2
            X.JrO r15 = r2.A00
            X.JrQ r2 = r2.A01
            java.lang.String r1 = r8.A00
            r5.A01 = r6
            r5.A02 = r6
            r5.A03 = r6
            r5.A04 = r6
            r5.A05 = r6
            r0 = 10
            r5.A00 = r0
            java.util.Map r0 = r14.A0A
            r19 = r0
            r20 = r5
            r21 = r7
            r16 = r2
            r17 = r3
            r18 = r1
            java.lang.Object r0 = r14.A0A(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0270
        L_0x020d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x0212:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x0217:
            java.lang.Object r8 = r5.A03
            X.0V2 r8 = (X.0V2) r8
            java.lang.Object r7 = r5.A02
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r14 = r5.A01
            com.facebook.avatar.expresso.odr.ODRController r14 = (com.facebook.avatar.expresso.odr.ODRController) r14
            X.0eS.A00(r0)     // Catch:{ IOException -> 0x023d }
        L_0x0226:
            java.io.File r0 = (java.io.File) r0     // Catch:{ IOException -> 0x023b }
            X.JrH r1 = new X.JrH     // Catch:{ IOException -> 0x023b }
            r1.<init>(r7, r0)     // Catch:{ IOException -> 0x023b }
            r5.A01 = r14     // Catch:{ IOException -> 0x023b }
            r5.A02 = r6     // Catch:{ IOException -> 0x023b }
            r5.A03 = r6     // Catch:{ IOException -> 0x023b }
            r0 = 7
            r5.A00 = r0     // Catch:{ IOException -> 0x023b }
            java.lang.Object r0 = r8.emit(r1, r5)     // Catch:{ IOException -> 0x023b }
            goto L_0x0270
        L_0x023b:
            r2 = move-exception
            goto L_0x0248
        L_0x023d:
            r2 = move-exception
            goto L_0x0248
        L_0x023f:
            java.lang.Object r14 = r5.A01
            com.facebook.avatar.expresso.odr.ODRController r14 = (com.facebook.avatar.expresso.odr.ODRController) r14
            X.0eS.A00(r0)     // Catch:{ IOException -> 0x0247 }
            goto L_0x0276
        L_0x0247:
            r2 = move-exception
        L_0x0248:
            java.lang.String r1 = "ODRController"
            java.lang.String r0 = "failed to create file in cache"
            X.0KC.A0F(r1, r0, r2)
            X.0V2 r3 = r14.A0F
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            java.lang.String r0 = "Unable to create file in cache"
            X.JrG r2 = new X.JrG
            r2.<init>(r0, r1)
            r5.A01 = r6
            r5.A02 = r6
            r5.A03 = r6
            r5.A04 = r6
            r5.A05 = r6
            r5.A06 = r6
            r5.A07 = r6
            r0 = 8
        L_0x026a:
            r5.A00 = r0
            java.lang.Object r0 = r3.emit(r2, r5)
        L_0x0270:
            if (r0 != r4) goto L_0x0276
        L_0x0272:
            return r4
        L_0x0273:
            X.0eS.A00(r0)
        L_0x0276:
            X.0gF r4 = X.C60340gF.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController.A09(X.LOq, X.4D7, X.4Cq):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [X.MDU, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f2, code lost:
        X.0qQ.A0B(r11, 1);
        r13 = r3.A09;
        r15 = X.182.A06(X.0Tu.A05, r13, 36324458273452134L);
        r3.A08.markerAnnotate(603995461, "ale_enabled", r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0210, code lost:
        if (r15 == false) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0212, code lost:
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0214, code lost:
        if (r0 == null) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0216, code lost:
        r14 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0218, code lost:
        if (r14 != null) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x021a, code lost:
        r14 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x021c, code lost:
        if (r0 == null) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x021e, code lost:
        r1 = r0.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0220, code lost:
        if (r1 != null) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0222, code lost:
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0224, code lost:
        if (r0 == null) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0226, code lost:
        r0 = r0.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0228, code lost:
        if (r0 == null) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x022a, code lost:
        r20 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x022c, code lost:
        r0 = new X.C19016WGr(new X.C17846Vgz(r4, r14, r1, r20), r3.A00(r8, r6, r35, r34, r7), r13, r11);
        r3.A02 = r0;
        r0 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x024c, code lost:
        if (r0 == null) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x024e, code lost:
        r3.A03 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0250, code lost:
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0252, code lost:
        if (r0 == null) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0254, code lost:
        r3.A03 = r0;
        r1 = A02(r3, r24, r2, r5, r12, r9, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0263, code lost:
        if (r1 != r23) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0265, code lost:
        return r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0266, code lost:
        r0 = new X.C64164LRf(r4, r3.A00(r8, r6, r35, r34, r7), new X.C61042Jvg(3, 0, false), r11);
        r3.A03 = r0;
        r0.A05(r13, r4);
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0288, code lost:
        if (r0 == null) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x028a, code lost:
        r0 = r0.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x028c, code lost:
        if (r0 == null) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x028e, code lost:
        r0.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0291, code lost:
        r1 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0293, code lost:
        if (r1 == null) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0295, code lost:
        r1.A04(r4, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02ab, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02b0, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02b1, code lost:
        X.0qQ.A0F("ig4aAvatarRichMediaViewerProvider");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02b8, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02bd, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f5, code lost:
        if (r0 == null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f9, code lost:
        if (r2 != null) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fb, code lost:
        r0 = r2.A04;
        r17 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ff, code lost:
        if (r0 != null) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0101, code lost:
        r17 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0103, code lost:
        if (r2 == null) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0105, code lost:
        r0 = r2.A02;
        r16 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0109, code lost:
        if (r0 != null) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010b, code lost:
        r16 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010d, code lost:
        if (r2 == null) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010f, code lost:
        r15 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0111, code lost:
        if (r15 != null) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0113, code lost:
        r15 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0115, code lost:
        if (r2 == null) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0117, code lost:
        r0 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0119, code lost:
        if (r0 != null) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011b, code lost:
        r0 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x011d, code lost:
        r24 = new X.C60787JrI(r25, r12, r6, r18, r17, r16, r15, r0, r7, r34, r35, r21);
        r9.A02 = null;
        r9.A03 = null;
        r9.A04 = null;
        r9.A05 = null;
        r9.A06 = null;
        r9.A07 = null;
        r9.A08 = null;
        r9.A00 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014a, code lost:
        if (r4 == null) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014c, code lost:
        r0 = (X.LG2) r4.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0152, code lost:
        if (r0 == null) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0154, code lost:
        r0 = X.C51965G9l.A0q((float) r0.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015b, code lost:
        r6 = 1.0f / X.AnonymousClass7TE.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0164, code lost:
        if (r3.A03 == null) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0166, code lost:
        r4 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0168, code lost:
        if (r4 == null) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016a, code lost:
        r1 = r13.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x016e, code lost:
        if (r1 == null) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0170, code lost:
        r4.FLh((X.C64120LOn) r1, r24, r6);
        r5 = (com.facebook.avatar.expresso.webp.WebPEncoderImpl) r3.A0E.invoke(X.C51965G9l.A0q(r6));
        r2 = r3.A03;
        r4 = "ig4aAvatarRichMediaViewerProvider";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0187, code lost:
        if (r2 == null) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0189, code lost:
        X.0qQ.A0B(r5, 2);
        r1 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0190, code lost:
        if (r1 != null) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0192, code lost:
        r4 = "odrSnapshotHelper";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0194, code lost:
        X.0qQ.A0F(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x019b, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x019c, code lost:
        r1.A03 = r8;
        r1.A01 = r7;
        r1.A02 = r5;
        r1.A05 = java.lang.Integer.valueOf(r35);
        r1.A04 = java.lang.Integer.valueOf(r34);
        r1.A00 = 0;
        r2 = r2.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b2, code lost:
        if (r2 != null) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b4, code lost:
        r4 = "richMediaViewerAr3d";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b9, code lost:
        if (r2.A04 == false) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01bf, code lost:
        if (r35 != r2.A02) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c5, code lost:
        if (r34 != r2.A01) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01c7, code lost:
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01c9, code lost:
        if (r0 == null) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01cb, code lost:
        r1 = r0.A02(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d1, code lost:
        r2.A02 = r35;
        r2.A01 = r34;
        X.AH4.A01(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01dd, code lost:
        r0 = X.JTO.A0w(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ea, code lost:
        r4 = r3.A04;
        r0 = r5.A03;
        r17 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f0, code lost:
        if (r0 == null) goto L_0x02b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0A(X.C60793JrO r38, X.C60795JrQ r39, java.lang.String r40, java.lang.String r41, java.util.Map r42, X.AnonymousClass4D7 r43, X.C262224Cq r44) {
        /*
            r37 = this;
            r4 = r38
            r11 = r44
            r5 = r39
            r12 = r40
            r6 = r41
            r13 = r42
            r10 = 0
            r7 = r43
            boolean r0 = r7 instanceof X.MDU
            r2 = r37
            if (r0 == 0) goto L_0x029b
            r9 = r7
            X.MDU r9 = (X.MDU) r9
            int r0 = r9.A0A
            if (r0 != r10) goto L_0x029b
            int r3 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x029b
            int r3 = r3 - r1
            r9.A00 = r3
        L_0x0027:
            java.lang.Object r8 = r9.A09
            X.1Hj r23 = X.1Hj.A02
            int r1 = r9.A00
            r22 = 2
            r14 = 1
            if (r1 == 0) goto L_0x003e
            if (r1 == r14) goto L_0x009f
            r0 = r22
            if (r1 != r0) goto L_0x02a2
            X.0eS.A00(r8)
        L_0x003b:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x003e:
            X.0eS.A00(r8)
            java.util.List r0 = r4.A02
            java.lang.String r8 = "Required value was null."
            if (r0 == 0) goto L_0x02c9
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x003b
            java.util.Map r0 = r4.A03
            if (r0 == 0) goto L_0x009d
            java.lang.Object r0 = r0.get(r12)
            X.LG2 r0 = (X.LG2) r0
            if (r0 == 0) goto L_0x009d
            int r7 = r0.A01
        L_0x005b:
            com.facebook.quicklog.QuickPerformanceLogger r3 = r2.A08
            r1 = 603995461(0x24003d45, float:2.7807473E-17)
            java.lang.String r0 = "frames_count"
            r3.markerAnnotate(r1, r0, r7)
            java.lang.String r0 = "is_odr_sticker_cache_hit"
            r3.markerAnnotate(r1, r0, r10)
            java.lang.String r3 = r5.A06
            if (r3 == 0) goto L_0x02c4
            X.JrN r0 = r4.A00
            java.lang.String r1 = r0.A02
            if (r1 == 0) goto L_0x02bf
            int r0 = r5.A00
            r9.A02 = r2
            r9.A03 = r4
            r9.A04 = r5
            r9.A05 = r11
            r9.A06 = r12
            r9.A07 = r6
            r9.A08 = r13
            r9.A01 = r7
            r9.A00 = r14
            r15 = r2
            r16 = r3
            r17 = r12
            r18 = r1
            r19 = r9
            r20 = r0
            java.lang.Object r8 = A04(r15, r16, r17, r18, r19, r20)
            r0 = r23
            if (r8 == r0) goto L_0x02be
            r3 = r2
            goto L_0x00c0
        L_0x009d:
            r7 = 1
            goto L_0x005b
        L_0x009f:
            int r7 = r9.A01
            java.lang.Object r13 = r9.A08
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r6 = r9.A07
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r12 = r9.A06
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r9.A05
            X.4Cq r11 = (X.C262224Cq) r11
            java.lang.Object r5 = r9.A04
            X.JrQ r5 = (X.C60795JrQ) r5
            java.lang.Object r4 = r9.A03
            X.JrO r4 = (X.C60793JrO) r4
            java.lang.Object r3 = r9.A02
            com.facebook.avatar.expresso.odr.ODRController r3 = (com.facebook.avatar.expresso.odr.ODRController) r3
            X.0eS.A00(r8)
        L_0x00c0:
            java.io.File r8 = (java.io.File) r8
            if (r8 == 0) goto L_0x003b
            java.util.Map r0 = r4.A04
            r1 = 0
            if (r0 == 0) goto L_0x01e7
            java.lang.Object r2 = r0.get(r12)
            X.JrP r2 = (X.C60794JrP) r2
        L_0x00cf:
            java.lang.String r25 = X.JTP.A0u(r8)
            X.JrN r15 = r4.A00
            int r0 = r15.A00
            r34 = r0
            int r0 = r15.A01
            r35 = r0
            java.util.Map r4 = r4.A03
            if (r4 == 0) goto L_0x01e3
            java.lang.Object r0 = r4.get(r12)
            X.LG2 r0 = (X.LG2) r0
            if (r0 == 0) goto L_0x01e3
            int r0 = r0.A00
            r21 = r0
        L_0x00ed:
            java.lang.String r20 = ""
            if (r2 == 0) goto L_0x00f7
            java.lang.String r0 = r2.A01
            r18 = r0
            if (r0 != 0) goto L_0x00fb
        L_0x00f7:
            r18 = r20
            if (r2 == 0) goto L_0x0101
        L_0x00fb:
            java.lang.String r0 = r2.A04
            r17 = r0
            if (r0 != 0) goto L_0x0105
        L_0x0101:
            r17 = r20
            if (r2 == 0) goto L_0x010b
        L_0x0105:
            java.lang.String r0 = r2.A02
            r16 = r0
            if (r0 != 0) goto L_0x010f
        L_0x010b:
            r16 = r20
            if (r2 == 0) goto L_0x0113
        L_0x010f:
            java.lang.String r15 = r2.A00
            if (r15 != 0) goto L_0x0117
        L_0x0113:
            r15 = r20
            if (r2 == 0) goto L_0x011b
        L_0x0117:
            java.lang.String r0 = r2.A03
            if (r0 != 0) goto L_0x011d
        L_0x011b:
            r0 = r20
        L_0x011d:
            X.JrI r19 = new X.JrI
            r29 = r17
            r30 = r16
            r31 = r15
            r32 = r0
            r33 = r7
            r36 = r21
            r24 = r19
            r26 = r12
            r27 = r6
            r28 = r18
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r9.A02 = r1
            r9.A03 = r1
            r9.A04 = r1
            r9.A05 = r1
            r9.A06 = r1
            r9.A07 = r1
            r9.A08 = r1
            r0 = r22
            r9.A00 = r0
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L_0x01dd
            java.lang.Object r0 = r4.get(r12)
            X.LG2 r0 = (X.LG2) r0
            if (r0 == 0) goto L_0x01dd
            int r0 = r0.A00
            float r0 = (float) r0
            java.lang.Float r0 = X.C51965G9l.A0q(r0)
        L_0x015b:
            float r0 = X.AnonymousClass7TE.A04(r0)
            float r6 = r6 / r0
            X.LRf r0 = r3.A03
            java.lang.String r18 = "Required value was null."
            if (r0 == 0) goto L_0x01ea
            X.MTI r4 = r3.A00
            if (r4 == 0) goto L_0x01ea
            java.lang.Object r1 = r13.get(r12)
            if (r1 == 0) goto L_0x02a7
            X.LOn r1 = (X.C64120LOn) r1
            r0 = r19
            r4.FLh(r1, r0, r6)
            X.0sP r1 = r3.A0E
            java.lang.Float r0 = X.C51965G9l.A0q(r6)
            java.lang.Object r5 = r1.invoke(r0)
            com.facebook.avatar.expresso.webp.WebPEncoderImpl r5 = (com.facebook.avatar.expresso.webp.WebPEncoderImpl) r5
            X.LRf r2 = r3.A03
            java.lang.String r4 = "ig4aAvatarRichMediaViewerProvider"
            if (r2 == 0) goto L_0x0194
            r0 = r22
            X.0qQ.A0B(r5, r0)
            com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r1 = r2.A01
            if (r1 != 0) goto L_0x019c
            java.lang.String r4 = "odrSnapshotHelper"
        L_0x0194:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x019c:
            r1.A03 = r8
            r1.A01 = r7
            r1.A02 = r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r35)
            r1.A05 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r34)
            r1.A04 = r0
            r1.A00 = r10
            X.AH4 r2 = r2.A04
            if (r2 != 0) goto L_0x01b7
            java.lang.String r4 = "richMediaViewerAr3d"
            goto L_0x0194
        L_0x01b7:
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x01c7
            int r1 = r2.A02
            r0 = r35
            if (r0 != r1) goto L_0x01d1
            int r1 = r2.A01
            r0 = r34
            if (r0 != r1) goto L_0x01d1
        L_0x01c7:
            X.LRf r0 = r3.A03
            if (r0 == 0) goto L_0x0194
            java.lang.Object r1 = r0.A02(r9)
            goto L_0x0261
        L_0x01d1:
            r0 = r35
            r2.A02 = r0
            r0 = r34
            r2.A01 = r0
            X.AH4.A01(r2)
            goto L_0x01c7
        L_0x01dd:
            java.lang.Integer r0 = X.JTO.A0w(r14)
            goto L_0x015b
        L_0x01e3:
            r21 = 1
            goto L_0x00ed
        L_0x01e7:
            r2 = r1
            goto L_0x00cf
        L_0x01ea:
            android.content.Context r4 = r3.A04
            java.lang.String r0 = r5.A03
            r17 = r0
            if (r0 == 0) goto L_0x02b9
            X.0qQ.A0B(r11, r14)
            com.instagram.common.session.UserSession r13 = r3.A09
            X.0Tu r14 = X.0Tu.A05
            r15 = 36324458273452134(0x810ce7000c3066, double:3.035071906759847E-306)
            r0 = r15
            boolean r15 = X.182.A06(r14, r13, r0)
            com.facebook.quicklog.QuickPerformanceLogger r0 = r3.A08
            r14 = r0
            r1 = 603995461(0x24003d45, float:2.7807473E-17)
            java.lang.String r0 = "ale_enabled"
            r14.markerAnnotate(r1, r0, r15)
            java.lang.String r16 = "ig4aAvatarRichMediaViewerProvider"
            if (r15 == 0) goto L_0x0266
            X.JrQ r0 = r3.A01
            if (r0 == 0) goto L_0x021a
            java.lang.String r14 = r0.A03
            if (r14 != 0) goto L_0x021e
        L_0x021a:
            r14 = r20
            if (r0 == 0) goto L_0x0222
        L_0x021e:
            java.lang.String r1 = r0.A07
            if (r1 != 0) goto L_0x0226
        L_0x0222:
            r1 = r20
            if (r0 == 0) goto L_0x022c
        L_0x0226:
            java.lang.String r0 = r0.A04
            if (r0 == 0) goto L_0x022c
            r20 = r0
        L_0x022c:
            X.Vgz r10 = new X.Vgz
            r0 = r20
            r10.<init>(r4, r14, r1, r0)
            r24 = r3
            r25 = r8
            r26 = r6
            r27 = r35
            r28 = r34
            r29 = r7
            X.LGB r1 = r24.A00(r25, r26, r27, r28, r29)
            X.WGr r0 = new X.WGr
            r0.<init>(r10, r1, r13, r11)
            r3.A02 = r0
            X.LRf r0 = r0.A01
            if (r0 == 0) goto L_0x02ac
            r3.A03 = r0
        L_0x0250:
            X.LRf r0 = r3.A03
            if (r0 == 0) goto L_0x02b1
            r3.A03 = r0
            r0 = r3
            r1 = r19
            r3 = r5
            r4 = r12
            r5 = r9
            r6 = r11
            java.lang.Object r1 = A02(r0, r1, r2, r3, r4, r5, r6)
        L_0x0261:
            r0 = r23
            if (r1 != r0) goto L_0x003b
            return r23
        L_0x0266:
            r0 = 3
            X.Jvg r14 = new X.Jvg
            r14.<init>((int) r0, (int) r10, (boolean) r10)
            r24 = r3
            r25 = r8
            r26 = r6
            r27 = r35
            r28 = r34
            r29 = r7
            X.LGB r1 = r24.A00(r25, r26, r27, r28, r29)
            X.LRf r0 = new X.LRf
            r0.<init>(r4, r1, r14, r11)
            r3.A03 = r0
            r0.A05(r13, r4)
            X.LRf r0 = r3.A03
            if (r0 == 0) goto L_0x02b1
            X.AH4 r0 = r0.A04
            if (r0 == 0) goto L_0x0291
            r0.A02()
        L_0x0291:
            X.LRf r1 = r3.A03
            if (r1 == 0) goto L_0x02b1
            r0 = r17
            r1.A04(r4, r0)
            goto L_0x0250
        L_0x029b:
            X.MDU r9 = new X.MDU
            r9.<init>(r2, r7, r10)
            goto L_0x0027
        L_0x02a2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02a7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x02ac:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x02b1:
            X.0qQ.A0F(r16)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02b9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x02be:
            return r23
        L_0x02bf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x02c4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x02c9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController.A0A(X.JrO, X.JrQ, java.lang.String, java.lang.String, java.util.Map, X.4D7, X.4Cq):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: X.0r1} */
    /* JADX WARNING: type inference failed for: r13v1, types: [X.MDt, X.4D7] */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0162, code lost:
        if (r1 == null) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x016c, code lost:
        if (r1 == null) goto L_0x016e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0106 A[Catch:{ NullPointerException -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0112 A[Catch:{ NullPointerException -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b5 A[Catch:{ NullPointerException -> 0x01c4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0B(java.lang.String r35, X.AnonymousClass4D7 r36) {
        /*
            r34 = this;
            r6 = r35
            r14 = 1
            r4 = r36
            boolean r0 = X.C66141MDt.A02(r14, r4)
            r2 = r34
            if (r0 == 0) goto L_0x0041
            r13 = r4
            X.MDt r13 = (X.C66141MDt) r13
            int r3 = r13.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0041
            int r3 = r3 - r1
            r13.A00 = r3
        L_0x001b:
            java.lang.Object r1 = r13.A08
            X.1Hj r12 = X.1Hj.A02
            int r0 = r13.A00
            r11 = 3
            r10 = 2
            r9 = 0
            if (r0 == 0) goto L_0x0087
            if (r0 == r14) goto L_0x006e
            if (r0 == r10) goto L_0x0050
            if (r0 != r11) goto L_0x004b
            java.lang.Object r4 = r13.A05
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r8 = r13.A04
            X.JrO r8 = (X.C60793JrO) r8
            java.lang.Object r7 = r13.A03
            X.0r1 r7 = (X.0r1) r7
            java.lang.Object r6 = r13.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r13.A01
            com.facebook.avatar.expresso.odr.ODRController r5 = (com.facebook.avatar.expresso.odr.ODRController) r5
            goto L_0x0047
        L_0x0041:
            X.MDt r13 = new X.MDt
            r13.<init>(r2, r4, r14)
            goto L_0x001b
        L_0x0047:
            X.0eS.A00(r1)     // Catch:{ NullPointerException -> 0x01c4 }
            goto L_0x00a8
        L_0x004b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0050:
            java.lang.Object r2 = r13.A07
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r3 = r13.A06
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r13.A05
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r8 = r13.A04
            X.JrO r8 = (X.C60793JrO) r8
            java.lang.Object r7 = r13.A03
            X.0r1 r7 = (X.0r1) r7
            java.lang.Object r6 = r13.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r13.A01
            com.facebook.avatar.expresso.odr.ODRController r5 = (com.facebook.avatar.expresso.odr.ODRController) r5
            goto L_0x0109
        L_0x006e:
            java.lang.Object r3 = r13.A06
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r13.A05
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r8 = r13.A04
            X.JrO r8 = (X.C60793JrO) r8
            java.lang.Object r7 = r13.A03
            X.0r1 r7 = (X.0r1) r7
            java.lang.Object r6 = r13.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r13.A01
            com.facebook.avatar.expresso.odr.ODRController r5 = (com.facebook.avatar.expresso.odr.ODRController) r5
            goto L_0x00e7
        L_0x0087:
            X.0eS.A00(r1)
            X.0r1 r7 = new X.0r1
            r7.<init>()
            java.util.Map r1 = r2.A0B
            boolean r0 = r1.containsKey(r6)
            if (r0 == 0) goto L_0x01e2
            java.lang.Object r8 = r1.get(r6)
            X.JrO r8 = (X.C60793JrO) r8
            if (r8 == 0) goto L_0x01e2
            java.util.List r0 = r8.A02
            if (r0 == 0) goto L_0x01e2
            java.util.Iterator r4 = r0.iterator()
            r5 = r2
        L_0x00a8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01e2
            java.lang.Object r3 = r4.next()
            java.lang.String r3 = (java.lang.String) r3
            com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r15 = r5.A05     // Catch:{ NullPointerException -> 0x01c4 }
            java.lang.String r2 = r8.A01     // Catch:{ NullPointerException -> 0x01c4 }
            java.lang.String r16 = "Required value was null."
            if (r2 == 0) goto L_0x01bf
            X.JrN r0 = r8.A00     // Catch:{ NullPointerException -> 0x01c4 }
            java.lang.String r1 = r0.A02     // Catch:{ NullPointerException -> 0x01c4 }
            if (r1 == 0) goto L_0x01ba
            X.JrQ r0 = r5.A01     // Catch:{ NullPointerException -> 0x01c4 }
            if (r0 == 0) goto L_0x00e5
            int r0 = r0.A00     // Catch:{ NullPointerException -> 0x01c4 }
        L_0x00c8:
            X.C66141MDt.A00(r5, r6, r7, r8, r13)     // Catch:{ NullPointerException -> 0x01c4 }
            r13.A05 = r4     // Catch:{ NullPointerException -> 0x01c4 }
            r13.A06 = r3     // Catch:{ NullPointerException -> 0x01c4 }
            r13.A07 = r9     // Catch:{ NullPointerException -> 0x01c4 }
            r13.A00 = r14     // Catch:{ NullPointerException -> 0x01c4 }
            r17 = r3
            r18 = r1
            r19 = r13
            r20 = r0
            r16 = r2
            java.lang.Object r1 = r15.A04(r16, r17, r18, r19, r20)     // Catch:{ NullPointerException -> 0x01c4 }
            if (r1 != r12) goto L_0x00ea
            goto L_0x01e0
        L_0x00e5:
            r0 = 0
            goto L_0x00c8
        L_0x00e7:
            X.0eS.A00(r1)     // Catch:{ NullPointerException -> 0x01c4 }
        L_0x00ea:
            java.io.File r1 = (java.io.File) r1     // Catch:{ NullPointerException -> 0x01c4 }
            X.C66141MDt.A00(r5, r6, r7, r8, r13)     // Catch:{ NullPointerException -> 0x01c4 }
            r13.A05 = r4     // Catch:{ NullPointerException -> 0x01c4 }
            r13.A06 = r3     // Catch:{ NullPointerException -> 0x01c4 }
            r13.A07 = r1     // Catch:{ NullPointerException -> 0x01c4 }
            r13.A00 = r10     // Catch:{ NullPointerException -> 0x01c4 }
            X.4Cc r15 = r5.A0D     // Catch:{ NullPointerException -> 0x01c4 }
            r2 = 26
            X.JUv r0 = new X.JUv     // Catch:{ NullPointerException -> 0x01c4 }
            r0.<init>(r1, r9, r2)     // Catch:{ NullPointerException -> 0x01c4 }
            java.lang.Object r0 = X.1Eo.A00(r13, r15, r0)     // Catch:{ NullPointerException -> 0x01c4 }
            if (r0 == r12) goto L_0x01e8
            r2 = r1
            r1 = r0
            goto L_0x010c
        L_0x0109:
            X.0eS.A00(r1)     // Catch:{ NullPointerException -> 0x01c4 }
        L_0x010c:
            boolean r0 = X.AnonymousClass7TE.A1a(r1)     // Catch:{ NullPointerException -> 0x01c4 }
            if (r0 == 0) goto L_0x01b5
            r2.getCanonicalPath()     // Catch:{ NullPointerException -> 0x01c4 }
            java.util.Map r0 = r8.A04     // Catch:{ NullPointerException -> 0x01c4 }
            if (r0 == 0) goto L_0x0130
            java.lang.Object r0 = r0.get(r3)     // Catch:{ NullPointerException -> 0x01c4 }
            X.JrP r0 = (X.C60794JrP) r0     // Catch:{ NullPointerException -> 0x01c4 }
        L_0x011f:
            java.util.Map r15 = r8.A03     // Catch:{ NullPointerException -> 0x01c4 }
            if (r15 == 0) goto L_0x0132
            java.lang.Object r1 = r15.get(r3)     // Catch:{ NullPointerException -> 0x01c4 }
            X.LG2 r1 = (X.LG2) r1     // Catch:{ NullPointerException -> 0x01c4 }
            if (r1 == 0) goto L_0x0132
            int r1 = r1.A01     // Catch:{ NullPointerException -> 0x01c4 }
            r20 = r1
            goto L_0x0134
        L_0x0130:
            r0 = r9
            goto L_0x011f
        L_0x0132:
            r20 = 1
        L_0x0134:
            if (r15 == 0) goto L_0x0137
            goto L_0x013a
        L_0x0137:
            r19 = 1
            goto L_0x0146
        L_0x013a:
            java.lang.Object r1 = r15.get(r3)     // Catch:{ NullPointerException -> 0x01c4 }
            X.LG2 r1 = (X.LG2) r1     // Catch:{ NullPointerException -> 0x01c4 }
            if (r1 == 0) goto L_0x0137
            int r1 = r1.A00     // Catch:{ NullPointerException -> 0x01c4 }
            r19 = r1
        L_0x0146:
            X.JrN r15 = r8.A00     // Catch:{ NullPointerException -> 0x01c4 }
            int r1 = r15.A00     // Catch:{ NullPointerException -> 0x01c4 }
            r30 = r1
            int r1 = r15.A01     // Catch:{ NullPointerException -> 0x01c4 }
            r31 = r1
            r7.A00 = r14     // Catch:{ NullPointerException -> 0x01c4 }
            X.0V2 r1 = r5.A0F     // Catch:{ NullPointerException -> 0x01c4 }
            r33 = r1
            java.lang.String r21 = X.JTP.A0u(r2)     // Catch:{ NullPointerException -> 0x01c4 }
            java.lang.String r18 = ""
            if (r0 == 0) goto L_0x0164
            java.lang.String r1 = r0.A01     // Catch:{ NullPointerException -> 0x01c4 }
            r17 = r1
            if (r1 != 0) goto L_0x0166
        L_0x0164:
            r17 = r18
        L_0x0166:
            if (r0 == 0) goto L_0x016e
            java.lang.String r1 = r0.A04     // Catch:{ NullPointerException -> 0x01c4 }
            r16 = r1
            if (r1 != 0) goto L_0x0170
        L_0x016e:
            r16 = r18
        L_0x0170:
            if (r0 == 0) goto L_0x0176
            java.lang.String r15 = r0.A02     // Catch:{ NullPointerException -> 0x01c4 }
            if (r15 != 0) goto L_0x0178
        L_0x0176:
            r15 = r18
        L_0x0178:
            if (r0 == 0) goto L_0x017e
            java.lang.String r2 = r0.A00     // Catch:{ NullPointerException -> 0x01c4 }
            if (r2 != 0) goto L_0x0180
        L_0x017e:
            r2 = r18
        L_0x0180:
            if (r0 == 0) goto L_0x0186
            java.lang.String r1 = r0.A03     // Catch:{ NullPointerException -> 0x01c4 }
            if (r1 != 0) goto L_0x0188
        L_0x0186:
            r1 = r18
        L_0x0188:
            X.JrI r0 = new X.JrI     // Catch:{ NullPointerException -> 0x01c4 }
            r22 = r3
            r23 = r6
            r24 = r17
            r25 = r16
            r26 = r15
            r27 = r2
            r28 = r1
            r29 = r20
            r32 = r19
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ NullPointerException -> 0x01c4 }
            X.C66141MDt.A00(r5, r6, r7, r8, r13)     // Catch:{ NullPointerException -> 0x01c4 }
            r13.A05 = r4     // Catch:{ NullPointerException -> 0x01c4 }
            r13.A06 = r9     // Catch:{ NullPointerException -> 0x01c4 }
            r13.A07 = r9     // Catch:{ NullPointerException -> 0x01c4 }
            r13.A00 = r11     // Catch:{ NullPointerException -> 0x01c4 }
            r1 = r33
            java.lang.Object r0 = r1.emit(r0, r13)     // Catch:{ NullPointerException -> 0x01c4 }
            if (r0 != r12) goto L_0x00a8
            goto L_0x01e1
        L_0x01b5:
            r2.getCanonicalPath()     // Catch:{ NullPointerException -> 0x01c4 }
            goto L_0x00a8
        L_0x01ba:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)     // Catch:{ NullPointerException -> 0x01c4 }
            throw r0     // Catch:{ NullPointerException -> 0x01c4 }
        L_0x01bf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)     // Catch:{ NullPointerException -> 0x01c4 }
            throw r0     // Catch:{ NullPointerException -> 0x01c4 }
        L_0x01c4:
            java.lang.String r15 = "ODRController"
            java.lang.String r0 = "File place holder name is null"
            X.0KC.A0C(r15, r0)
            java.lang.String r3 = "cache"
            java.lang.String r2 = "File place holder name is null in render"
            X.0wj r1 = X.0wj.A01
            r0 = 603982406(0x24000a46, float:2.7764278E-17)
            X.0f9 r0 = r1.AEf(r15, r0)
            r0.ABQ(r3, r2)
            r0.report()
            goto L_0x00a8
        L_0x01e0:
            return r12
        L_0x01e1:
            return r12
        L_0x01e2:
            boolean r0 = r7.A00
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
        L_0x01e8:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController.A0B(java.lang.String, X.4D7):java.lang.Object");
    }
}
