package com.facebook.avatar.expresso.odr.rmv;

import X.0qQ;
import X.0sK;
import X.136;
import X.182;
import X.1Hj;
import X.AnonymousClass00P;
import X.AnonymousClass11O;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C262204Co;
import X.C262224Cq;
import X.C60340gF;
import X.C60787JrI;
import X.C64120LOn;
import X.C64164LRf;
import X.C66200MIh;
import X.DbS;
import X.JTO;
import X.LG1;
import X.MH2;
import X.MTI;
import X.MTM;
import com.facebook.cameracore.mediapipeline.services.avatars.AvatarsNativeInputDelegate;
import com.facebook.cdl.gltfmemorypointerholder.GltfMemoryPointerWrapper;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;

public final class ODRCDLHandler implements MTI {
    public static MTM A0E;
    public static final Companion A0F = new Object();
    public C60787JrI A00;
    public GltfMemoryPointerWrapper A01;
    public float A02 = 0.033f;
    public C64120LOn A03;
    public String A04;
    public boolean A05;
    public final LG1 A06;
    public final QuickPerformanceLogger A07;
    public final String A08 = AnonymousClass7TG.A0j();
    public final 0sK A09;
    public final C262224Cq A0A;
    public final C64164LRf A0B;
    public final C262204Co A0C;
    public final 136 A0D = new 136();

    public final class Companion {
        /* JADX WARNING: type inference failed for: r11v1, types: [X.JUK, X.4D7] */
        /* JADX WARNING: type inference failed for: r11v5 */
        /* JADX WARNING: type inference failed for: r11v6 */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0069  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0030  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object A00(X.LG1 r39, X.C64120LOn r40, X.C60787JrI r41, X.C64164LRf r42, com.facebook.quicklog.QuickPerformanceLogger r43, com.instagram.common.session.UserSession r44, X.AnonymousClass4D7 r45, X.0sK r46, X.C262224Cq r47) {
            /*
                r38 = this;
                r1 = r44
                r2 = r47
                r3 = r39
                r4 = r42
                r5 = r43
                r6 = r40
                r7 = r41
                r8 = r46
                r12 = 2
                r13 = r45
                boolean r0 = X.JUK.A02(r12, r13)
                if (r0 == 0) goto L_0x00d8
                r11 = r13
                X.JUK r11 = (X.JUK) r11
                int r10 = r11.A00
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r10 & r9
                if (r0 == 0) goto L_0x00d8
                int r10 = r10 - r9
                r11.A00 = r10
            L_0x0027:
                java.lang.Object r12 = r11.A09
                X.1Hj r10 = X.1Hj.A02
                int r0 = r11.A00
                r9 = 1
                if (r0 == 0) goto L_0x0069
                if (r0 != r9) goto L_0x00e1
                java.lang.Object r8 = r11.A08
                X.0sK r8 = (X.0sK) r8
                java.lang.Object r7 = r11.A07
                X.JrI r7 = (X.C60787JrI) r7
                java.lang.Object r6 = r11.A06
                X.LOn r6 = (X.C64120LOn) r6
                java.lang.Object r5 = r11.A05
                com.facebook.quicklog.QuickPerformanceLogger r5 = (com.facebook.quicklog.QuickPerformanceLogger) r5
                java.lang.Object r4 = r11.A04
                X.LRf r4 = (X.C64164LRf) r4
                java.lang.Object r3 = r11.A03
                X.LG1 r3 = (X.LG1) r3
                java.lang.Object r2 = r11.A02
                X.4Cq r2 = (X.C262224Cq) r2
                java.lang.Object r1 = r11.A01
                com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
                X.0eS.A00(r12)
            L_0x0055:
                X.MTM r12 = (X.MTM) r12
                com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler.A0E = r12
            L_0x0059:
                com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler r9 = new com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler
                r16 = r8
                r17 = r2
                r10 = r3
                r11 = r6
                r12 = r7
                r13 = r4
                r14 = r5
                r15 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
                return r9
            L_0x0069:
                X.0eS.A00(r12)
                X.VLB r0 = new X.VLB
                r0.<init>(r1)
                java.lang.String r12 = r3.A03
                r19 = r12
                java.lang.String r12 = r3.A02
                r16 = r12
                X.UL7 r18 = X.UL7.A01
                boolean r15 = r3.A05
                r20 = 0
                int r13 = r3.A00
                int r12 = r3.A01
                X.Gms r14 = new X.Gms
                r14.<init>(r13, r12, r9)
                r33 = 0
                X.Uwl r17 = X.C16540Uwl.NORMAL_MODE
                X.UKz r12 = new X.UKz
                r21 = r20
                r22 = r20
                r23 = r20
                r24 = r20
                r25 = r20
                r26 = r20
                r27 = r20
                r28 = r19
                r29 = r16
                r30 = r20
                r31 = r20
                r32 = r15
                r34 = r33
                r35 = r33
                r36 = r33
                r37 = r33
                r16 = r12
                r19 = r14
                r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
                X.MTM r13 = com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler.A0E
                if (r13 != 0) goto L_0x0059
                com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder r13 = X.C62981KpX.A00(r0, r1)
                r0 = r15 ^ 1
                r11.A01 = r1
                r11.A02 = r2
                r11.A03 = r3
                r11.A04 = r4
                r11.A05 = r5
                r11.A06 = r6
                r11.A07 = r7
                r11.A08 = r8
                r11.A00 = r9
                java.lang.Object r12 = r13.A00(r12, r11, r0)
                if (r12 != r10) goto L_0x0055
                return r10
            L_0x00d8:
                X.JUK r11 = new X.JUK
                r0 = r38
                r11.<init>(r0, r13, r12)
                goto L_0x0027
            L_0x00e1:
                java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler.Companion.A00(X.LG1, X.LOn, X.JrI, X.LRf, com.facebook.quicklog.QuickPerformanceLogger, com.instagram.common.session.UserSession, X.4D7, X.0sK, X.4Cq):java.lang.Object");
        }
    }

    public final void FLh(C64120LOn lOn, C60787JrI jrI, float f) {
        0qQ.A0B(lOn, 0);
        this.A03 = lOn;
        this.A02 = f;
        this.A00 = jrI;
        C64164LRf lRf = this.A0B;
        AvatarsNativeInputDelegate avatarsNativeInputDelegate = lRf.A0E.A00;
        avatarsNativeInputDelegate.setFixedElapsedTimeForAnimation(f);
        C64120LOn.A00(lOn, lRf);
        String str = this.A04;
        if (str != null) {
            avatarsNativeInputDelegate.loadAnimationFromFile(str, lOn.A00);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final synchronized void onDestroy() {
        this.A01 = null;
        this.A0C.AG7((CancellationException) null);
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MED, java.lang.Object, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057 A[Catch:{ all -> 0x01b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00be A[Catch:{ all -> 0x01b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler r12, X.C62977KpT r13, X.AnonymousClass4D7 r14) {
        /*
            r3 = 9
            boolean r0 = X.MED.A04(r3, r14)
            if (r0 == 0) goto L_0x0027
            r7 = r14
            X.MED r7 = (X.MED) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0027
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r7.A04
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r2 = 1
            r10 = 5
            r4 = 0
            switch(r0) {
                case 0: goto L_0x003d;
                case 1: goto L_0x002d;
                case 2: goto L_0x01b9;
                case 3: goto L_0x01b9;
                case 4: goto L_0x01b9;
                case 5: goto L_0x01b9;
                case 6: goto L_0x01b9;
                case 7: goto L_0x01b9;
                default: goto L_0x0022;
            }
        L_0x0022:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0027:
            X.MED r7 = new X.MED
            r7.<init>(r12, r14, r3)
            goto L_0x0016
        L_0x002d:
            java.lang.Object r3 = r7.A03
            X.136 r3 = (X.136) r3
            java.lang.Object r13 = r7.A02
            X.KpT r13 = (X.C62977KpT) r13
            java.lang.Object r12 = r7.A01
            com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler r12 = (com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler) r12
            X.0eS.A00(r1)
            goto L_0x004c
        L_0x003d:
            X.0eS.A00(r1)
            X.136 r3 = r12.A0D
            X.MED.A00(r12, r13, r3, r7, r2)
            java.lang.Object r0 = X.136.A00(r7, r3)
            if (r0 != r6) goto L_0x004c
            return r6
        L_0x004c:
            boolean r0 = r13 instanceof X.C60811Jrg     // Catch:{ all -> 0x01b7 }
            r1 = 14
            r9 = 4
            r8 = 2
            r5 = 603995461(0x24003d45, float:2.7807473E-17)
            if (r0 == 0) goto L_0x00be
            X.Jrg r13 = (X.C60811Jrg) r13     // Catch:{ all -> 0x01b7 }
            java.lang.Integer r0 = r13.A00     // Catch:{ all -> 0x01b7 }
            int r11 = r0.intValue()     // Catch:{ all -> 0x01b7 }
            r9 = 11
            if (r11 == r10) goto L_0x00a7
            r0 = 3
            r2 = 7
            if (r11 == r9) goto L_0x0076
            if (r11 == r2) goto L_0x0076
            if (r11 == r8) goto L_0x0076
            if (r11 != r1) goto L_0x01c0
            com.facebook.quicklog.QuickPerformanceLogger r1 = r12.A07     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = "avatar_rendered_end"
            r1.markerPoint(r5, r0)     // Catch:{ all -> 0x01b7 }
            goto L_0x01c0
        L_0x0076:
            java.lang.String r1 = "EffectRenderState error"
            X.MED.A02(r3, r7, r0)     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = "ODRCDLHandler"
            X.0KC.A0C(r0, r1)     // Catch:{ all -> 0x01b7 }
            java.lang.Integer r5 = X.AnonymousClass05K.A02     // Catch:{ all -> 0x01b7 }
            if (r11 == r9) goto L_0x008e
            if (r11 == r8) goto L_0x008b
            if (r11 == r2) goto L_0x0091
            java.lang.String r0 = ""
            goto L_0x0093
        L_0x008b:
            java.lang.String r0 = "effect_download_error"
            goto L_0x0093
        L_0x008e:
            java.lang.String r0 = "avatar_download_error"
            goto L_0x0093
        L_0x0091:
            java.lang.String r0 = "effect_render_error"
        L_0x0093:
            X.0sK r2 = r12.A09     // Catch:{ all -> 0x01b7 }
            X.JrG r1 = new X.JrG     // Catch:{ all -> 0x01b7 }
            r1.<init>(r0, r5)     // Catch:{ all -> 0x01b7 }
            X.JrI r0 = r12.A00     // Catch:{ all -> 0x01b7 }
            java.lang.Object r0 = r2.invoke(r1, r0, r7)     // Catch:{ all -> 0x01b7 }
            if (r0 == r6) goto L_0x00a4
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x01b7 }
        L_0x00a4:
            if (r0 != r6) goto L_0x01c0
            return r6
        L_0x00a7:
            X.LRf r0 = r12.A0B     // Catch:{ all -> 0x01b7 }
            float r1 = r12.A02     // Catch:{ all -> 0x01b7 }
            X.Lab r0 = r0.A0E     // Catch:{ all -> 0x01b7 }
            com.facebook.cameracore.mediapipeline.services.avatars.AvatarsNativeInputDelegate r0 = r0.A00     // Catch:{ all -> 0x01b7 }
            r0.setFixedElapsedTimeForAnimation(r1)     // Catch:{ all -> 0x01b7 }
            r12.A05 = r2     // Catch:{ all -> 0x01b7 }
            X.MED.A02(r3, r7, r8)     // Catch:{ all -> 0x01b7 }
            java.lang.Object r0 = A01(r12, r7)     // Catch:{ all -> 0x01b7 }
            if (r0 != r6) goto L_0x01c0
            return r6
        L_0x00be:
            boolean r0 = r13 instanceof X.C60808Jrd     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x010d
            X.Jrd r13 = (X.C60808Jrd) r13     // Catch:{ all -> 0x01b7 }
            boolean r0 = r13.A01     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x00e5
            X.LRf r2 = r12.A0B     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = "complete"
            org.json.JSONObject r1 = X.C18668VwQ.A02(r0)     // Catch:{ all -> 0x01b7 }
            X.LaZ r0 = r2.A0D     // Catch:{ all -> 0x01b7 }
            X.82S r0 = r0.A02     // Catch:{ all -> 0x01b7 }
            r0.A00(r1)     // Catch:{ all -> 0x01b7 }
            com.facebook.quicklog.QuickPerformanceLogger r1 = r12.A07     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = "avatar_load_end"
            r1.markerPoint(r5, r0)     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = "avatar_rendered_start"
            r1.markerPoint(r5, r0)     // Catch:{ all -> 0x01b7 }
            goto L_0x01c0
        L_0x00e5:
            java.lang.String r1 = "Avatar load failed with error: "
            java.lang.String r0 = r13.A00     // Catch:{ all -> 0x01b7 }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x01b7 }
            X.MED.A02(r3, r7, r9)     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = "ODRCDLHandler"
            X.0KC.A0C(r0, r1)     // Catch:{ all -> 0x01b7 }
            java.lang.Integer r5 = X.AnonymousClass05K.A0j     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = "avatar_load_error"
            X.0sK r2 = r12.A09     // Catch:{ all -> 0x01b7 }
            X.JrG r1 = new X.JrG     // Catch:{ all -> 0x01b7 }
            r1.<init>(r0, r5)     // Catch:{ all -> 0x01b7 }
            X.JrI r0 = r12.A00     // Catch:{ all -> 0x01b7 }
            java.lang.Object r0 = r2.invoke(r1, r0, r7)     // Catch:{ all -> 0x01b7 }
            if (r0 == r6) goto L_0x010a
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x01b7 }
        L_0x010a:
            if (r0 != r6) goto L_0x01c0
            return r6
        L_0x010d:
            boolean r0 = r13 instanceof X.C60807Jrc     // Catch:{ all -> 0x01b7 }
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x0132
            X.Jrc r13 = (X.C60807Jrc) r13     // Catch:{ all -> 0x01b7 }
            java.lang.String r5 = r13.A00     // Catch:{ all -> 0x01b7 }
            r12.A04 = r5     // Catch:{ all -> 0x01b7 }
            X.LRf r2 = r12.A0B     // Catch:{ all -> 0x01b7 }
            if (r5 == 0) goto L_0x01b2
            X.LOn r0 = r12.A03     // Catch:{ all -> 0x01b7 }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x01b7 }
            X.Lab r0 = r2.A0E     // Catch:{ all -> 0x01b7 }
            com.facebook.cameracore.mediapipeline.services.avatars.AvatarsNativeInputDelegate r0 = r0.A00     // Catch:{ all -> 0x01b7 }
            r0.loadAnimationFromFile(r5, r1)     // Catch:{ all -> 0x01b7 }
            X.MED.A02(r3, r7, r10)     // Catch:{ all -> 0x01b7 }
            java.lang.Object r0 = A01(r12, r7)     // Catch:{ all -> 0x01b7 }
            if (r0 != r6) goto L_0x01c0
            return r6
        L_0x0132:
            boolean r0 = r13 instanceof X.C60812Jrh     // Catch:{ all -> 0x01b7 }
            if (r0 != 0) goto L_0x01c0
            boolean r0 = r13 instanceof X.C60813Jri     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x0179
            X.Jri r13 = (X.C60813Jri) r13     // Catch:{ all -> 0x01b7 }
            java.lang.Integer r2 = r13.A00     // Catch:{ all -> 0x01b7 }
            java.lang.String r1 = r13.toString()     // Catch:{ all -> 0x01b7 }
            r7.A01 = r3     // Catch:{ all -> 0x01b7 }
            r7.A02 = r4     // Catch:{ all -> 0x01b7 }
            r7.A03 = r4     // Catch:{ all -> 0x01b7 }
            r0 = 6
            r7.A00 = r0     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = "ODRCDLHandler"
            X.0KC.A0C(r0, r1)     // Catch:{ all -> 0x01b7 }
            java.lang.Integer r5 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x01b7 }
            if (r2 == 0) goto L_0x016f
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x01b7 }
            if (r2 != r0) goto L_0x016a
            java.lang.Integer r5 = X.AnonymousClass05K.A15     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = "output_validation_failure"
        L_0x015c:
            X.0sK r2 = r12.A09     // Catch:{ all -> 0x01b7 }
            X.JrG r1 = new X.JrG     // Catch:{ all -> 0x01b7 }
            r1.<init>(r0, r5)     // Catch:{ all -> 0x01b7 }
            X.JrI r0 = r12.A00     // Catch:{ all -> 0x01b7 }
            java.lang.Object r0 = r2.invoke(r1, r0, r7)     // Catch:{ all -> 0x01b7 }
            goto L_0x0172
        L_0x016a:
            java.lang.Integer r5 = X.AnonymousClass05K.A0u     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = "capture_error"
            goto L_0x015c
        L_0x016f:
            java.lang.String r0 = ""
            goto L_0x015c
        L_0x0172:
            if (r0 == r6) goto L_0x0176
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x01b7 }
        L_0x0176:
            if (r0 != r6) goto L_0x01c0
            return r6
        L_0x0179:
            boolean r0 = r13 instanceof X.C60809Jre     // Catch:{ all -> 0x01b7 }
            if (r0 != 0) goto L_0x01c0
            boolean r0 = r13 instanceof X.C60810Jrf     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x01a5
            X.0sK r5 = r12.A09     // Catch:{ all -> 0x01b7 }
            X.Jrf r13 = (X.C60810Jrf) r13     // Catch:{ all -> 0x01b7 }
            java.io.File r0 = r13.A00     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x01a0
            X.JrF r2 = new X.JrF     // Catch:{ all -> 0x01b7 }
            r2.<init>(r0)     // Catch:{ all -> 0x01b7 }
            X.JrI r1 = r12.A00     // Catch:{ all -> 0x01b7 }
            r7.A01 = r3     // Catch:{ all -> 0x01b7 }
            r7.A02 = r4     // Catch:{ all -> 0x01b7 }
            r7.A03 = r4     // Catch:{ all -> 0x01b7 }
            r0 = 7
            r7.A00 = r0     // Catch:{ all -> 0x01b7 }
            java.lang.Object r0 = r5.invoke(r2, r1, r7)     // Catch:{ all -> 0x01b7 }
            if (r0 != r6) goto L_0x01c0
            return r6
        L_0x01a0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)     // Catch:{ all -> 0x01b7 }
            goto L_0x01b6
        L_0x01a5:
            boolean r0 = r13 instanceof X.C60814Jrj     // Catch:{ all -> 0x01b7 }
            if (r0 != 0) goto L_0x01c0
            boolean r0 = r13 instanceof X.C60815Jrk     // Catch:{ all -> 0x01b7 }
            if (r0 != 0) goto L_0x01c0
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ all -> 0x01b7 }
            goto L_0x01b6
        L_0x01b2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)     // Catch:{ all -> 0x01b7 }
        L_0x01b6:
            throw r0     // Catch:{ all -> 0x01b7 }
        L_0x01b7:
            r0 = move-exception
            goto L_0x01c7
        L_0x01b9:
            java.lang.Object r3 = r7.A01
            X.136 r3 = (X.136) r3
            X.0eS.A00(r1)     // Catch:{ all -> 0x01c6 }
        L_0x01c0:
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x01c6 }
            r3.A05(r4)
            return r0
        L_0x01c6:
            r0 = move-exception
        L_0x01c7:
            r3.A05(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler.A00(com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler, X.KpT, X.4D7):java.lang.Object");
    }

    public static final Object A01(ODRCDLHandler oDRCDLHandler, AnonymousClass4D7 r6) {
        GltfMemoryPointerWrapper gltfMemoryPointerWrapper;
        String str;
        if (!(!oDRCDLHandler.A05 || (gltfMemoryPointerWrapper = oDRCDLHandler.A01) == null || (str = oDRCDLHandler.A04) == null)) {
            C64164LRf lRf = oDRCDLHandler.A0B;
            lRf.A0E.A00.loadAvatarFromMemory(str, oDRCDLHandler.A08, gltfMemoryPointerWrapper);
            oDRCDLHandler.A07.markerPoint(603995461, "avatar_load_start");
            Object A022 = lRf.A02(r6);
            if (A022 == 1Hj.A02) {
                return A022;
            }
        }
        return C60340gF.A00;
    }

    public ODRCDLHandler(LG1 lg1, C64120LOn lOn, C60787JrI jrI, C64164LRf lRf, QuickPerformanceLogger quickPerformanceLogger, UserSession userSession, 0sK r20, C262224Cq r21) {
        C262224Cq r3 = r21;
        this.A0A = r3;
        this.A06 = lg1;
        C64164LRf lRf2 = lRf;
        this.A0B = lRf2;
        this.A07 = quickPerformanceLogger;
        this.A03 = lOn;
        this.A00 = jrI;
        this.A09 = r20;
        this.A0C = AnonymousClass11O.A03(r3, JTO.A1I(new C66200MIh(this, 1), lRf2.A0I));
        Map map = lg1.A04;
        QuickPerformanceLogger quickPerformanceLogger2 = this.A07;
        quickPerformanceLogger2.markerPoint(603995461, "avatar_download_start");
        String str = this.A08;
        quickPerformanceLogger2.markerAnnotate(603995461, "cdl_request_id", str);
        LG1 lg12 = this.A06;
        quickPerformanceLogger2.markerAnnotate(603995461, "lod", lg12.A00);
        quickPerformanceLogger2.markerAnnotate(603995461, "texture_size", lg12.A01);
        UserSession userSession2 = userSession;
        long A012 = 182.A01(DbS.A0J(userSession2, 0), userSession2, 36605933249959254L);
        MTM mtm = A0E;
        if (mtm == null) {
            0qQ.A0F("cdlProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        mtm.AWc(false, Integer.valueOf((int) A012), str, new TreeMap(map), new MH2((Object) this, (AnonymousClass4D7) null, 45));
        C64120LOn.A00(this.A03, lRf2);
    }
}
