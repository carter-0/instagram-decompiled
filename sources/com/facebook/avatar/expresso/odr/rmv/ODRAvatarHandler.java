package com.facebook.avatar.expresso.odr.rmv;

import X.0qQ;
import X.0sK;
import X.136;
import X.1Hj;
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
import X.JTO;
import X.MTI;
import com.facebook.cameracore.mediapipeline.services.avatars.AvatarsNativeInputDelegate;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.CancellationException;

public final class ODRAvatarHandler implements MTI {
    public C60787JrI A00;
    public float A01 = 0.033f;
    public C64120LOn A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final 0sK A07;
    public final C64164LRf A08;
    public final QuickPerformanceLogger A09;
    public final C262204Co A0A;
    public final 136 A0B = new 136();

    public ODRAvatarHandler(C64120LOn lOn, C60787JrI jrI, C64164LRf lRf, QuickPerformanceLogger quickPerformanceLogger, 0sK r8, C262224Cq r9) {
        0qQ.A0B(r9, 1);
        AnonymousClass7TG.A1S(lOn, jrI);
        this.A08 = lRf;
        this.A09 = quickPerformanceLogger;
        this.A02 = lOn;
        this.A00 = jrI;
        this.A07 = r8;
        this.A0A = AnonymousClass11O.A03(r9, JTO.A1I(new C66200MIh(this, 0), lRf.A0I));
        C64120LOn.A00(this.A02, lRf);
    }

    public final void FLh(C64120LOn lOn, C60787JrI jrI, float f) {
        0qQ.A0B(lOn, 0);
        this.A02 = lOn;
        this.A01 = f;
        this.A00 = jrI;
        C64164LRf lRf = this.A08;
        AvatarsNativeInputDelegate avatarsNativeInputDelegate = lRf.A0E.A00;
        avatarsNativeInputDelegate.setFixedElapsedTimeForAnimation(f);
        C64120LOn.A00(lOn, lRf);
        String str = this.A03;
        if (str != null) {
            avatarsNativeInputDelegate.loadAnimationFromFile(str, lOn.A00);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final synchronized void onDestroy() {
        this.A0A.AG7((CancellationException) null);
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MED, java.lang.Object, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f A[Catch:{ all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010f A[Catch:{ all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.facebook.avatar.expresso.odr.rmv.ODRAvatarHandler r9, X.C62977KpT r10, X.AnonymousClass4D7 r11) {
        /*
            r3 = 8
            boolean r0 = X.MED.A04(r3, r11)
            if (r0 == 0) goto L_0x0026
            r7 = r11
            X.MED r7 = (X.MED) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r7.A04
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r8 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L_0x003c;
                case 1: goto L_0x002c;
                case 2: goto L_0x01af;
                case 3: goto L_0x01af;
                case 4: goto L_0x01af;
                case 5: goto L_0x01af;
                case 6: goto L_0x01af;
                case 7: goto L_0x01af;
                case 8: goto L_0x01af;
                case 9: goto L_0x01af;
                default: goto L_0x0021;
            }
        L_0x0021:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0026:
            X.MED r7 = new X.MED
            r7.<init>(r9, r11, r3)
            goto L_0x0016
        L_0x002c:
            java.lang.Object r4 = r7.A03
            X.136 r4 = (X.136) r4
            java.lang.Object r10 = r7.A02
            X.KpT r10 = (X.C62977KpT) r10
            java.lang.Object r9 = r7.A01
            com.facebook.avatar.expresso.odr.rmv.ODRAvatarHandler r9 = (com.facebook.avatar.expresso.odr.rmv.ODRAvatarHandler) r9
            X.0eS.A00(r1)
            goto L_0x004b
        L_0x003c:
            X.0eS.A00(r1)
            X.136 r4 = r9.A0B
            X.MED.A00(r9, r10, r4, r7, r8)
            java.lang.Object r0 = X.136.A00(r7, r4)
            if (r0 != r6) goto L_0x004b
            return r6
        L_0x004b:
            boolean r0 = r10 instanceof X.C60811Jrg     // Catch:{ all -> 0x01ad }
            if (r0 == 0) goto L_0x010f
            X.Jrg r10 = (X.C60811Jrg) r10     // Catch:{ all -> 0x01ad }
            java.lang.Integer r0 = r10.A00     // Catch:{ all -> 0x01ad }
            int r2 = r0.intValue()     // Catch:{ all -> 0x01ad }
            switch(r2) {
                case 2: goto L_0x00ac;
                case 3: goto L_0x005a;
                case 4: goto L_0x005a;
                case 5: goto L_0x005c;
                case 6: goto L_0x005a;
                case 7: goto L_0x00ac;
                case 8: goto L_0x005a;
                case 9: goto L_0x005a;
                case 10: goto L_0x005a;
                case 11: goto L_0x00ac;
                case 12: goto L_0x005a;
                case 13: goto L_0x005a;
                case 14: goto L_0x0079;
                case 15: goto L_0x009a;
                case 16: goto L_0x00e7;
                default: goto L_0x005a;
            }     // Catch:{ all -> 0x01ad }
        L_0x005a:
            goto L_0x01b6
        L_0x005c:
            X.LRf r0 = r9.A08     // Catch:{ all -> 0x01ad }
            float r1 = r9.A01     // Catch:{ all -> 0x01ad }
            X.Lab r0 = r0.A0E     // Catch:{ all -> 0x01ad }
            com.facebook.cameracore.mediapipeline.services.avatars.AvatarsNativeInputDelegate r0 = r0.A00     // Catch:{ all -> 0x01ad }
            r0.setFixedElapsedTimeForAnimation(r1)     // Catch:{ all -> 0x01ad }
            r9.A06 = r8     // Catch:{ all -> 0x01ad }
            r7.A01 = r4     // Catch:{ all -> 0x01ad }
            r7.A02 = r5     // Catch:{ all -> 0x01ad }
            r7.A03 = r5     // Catch:{ all -> 0x01ad }
            r0 = 2
            r7.A00 = r0     // Catch:{ all -> 0x01ad }
            java.lang.Object r0 = r9.A01(r7)     // Catch:{ all -> 0x01ad }
            if (r0 != r6) goto L_0x01b6
            return r6
        L_0x0079:
            r9.A05 = r8     // Catch:{ all -> 0x01ad }
            com.facebook.quicklog.QuickPerformanceLogger r2 = r9.A09     // Catch:{ all -> 0x01ad }
            java.lang.String r0 = "avatar_rendered_end"
            r1 = 603995461(0x24003d45, float:2.7807473E-17)
            r2.markerPoint(r1, r0)     // Catch:{ all -> 0x01ad }
            java.lang.String r0 = "avatar_ready_start"
            r2.markerPoint(r1, r0)     // Catch:{ all -> 0x01ad }
            r7.A01 = r4     // Catch:{ all -> 0x01ad }
            r7.A02 = r5     // Catch:{ all -> 0x01ad }
            r7.A03 = r5     // Catch:{ all -> 0x01ad }
            r0 = 4
            r7.A00 = r0     // Catch:{ all -> 0x01ad }
            java.lang.Object r0 = r9.A01(r7)     // Catch:{ all -> 0x01ad }
            if (r0 != r6) goto L_0x01b6
            return r6
        L_0x009a:
            r9.A04 = r8     // Catch:{ all -> 0x01ad }
            r7.A01 = r4     // Catch:{ all -> 0x01ad }
            r7.A02 = r5     // Catch:{ all -> 0x01ad }
            r7.A03 = r5     // Catch:{ all -> 0x01ad }
            r0 = 5
            r7.A00 = r0     // Catch:{ all -> 0x01ad }
            java.lang.Object r0 = r9.A01(r7)     // Catch:{ all -> 0x01ad }
            if (r0 != r6) goto L_0x01b6
            return r6
        L_0x00ac:
            java.lang.String r1 = "EffectRenderState error"
            r7.A01 = r4     // Catch:{ all -> 0x01ad }
            r7.A02 = r5     // Catch:{ all -> 0x01ad }
            r7.A03 = r5     // Catch:{ all -> 0x01ad }
            r0 = 3
            r7.A00 = r0     // Catch:{ all -> 0x01ad }
            java.lang.String r0 = "ODRAvatarHandler"
            X.0KC.A0C(r0, r1)     // Catch:{ all -> 0x01ad }
            java.lang.Integer r3 = X.AnonymousClass05K.A02     // Catch:{ all -> 0x01ad }
            r0 = 11
            if (r2 == r0) goto L_0x00ce
            r0 = 2
            if (r2 == r0) goto L_0x00cb
            r0 = 7
            if (r2 == r0) goto L_0x00d1
            java.lang.String r0 = ""
            goto L_0x00d3
        L_0x00cb:
            java.lang.String r0 = "effect_download_error"
            goto L_0x00d3
        L_0x00ce:
            java.lang.String r0 = "avatar_download_error"
            goto L_0x00d3
        L_0x00d1:
            java.lang.String r0 = "effect_render_error"
        L_0x00d3:
            X.0sK r2 = r9.A07     // Catch:{ all -> 0x01ad }
            X.JrG r1 = new X.JrG     // Catch:{ all -> 0x01ad }
            r1.<init>(r0, r3)     // Catch:{ all -> 0x01ad }
            X.JrI r0 = r9.A00     // Catch:{ all -> 0x01ad }
            java.lang.Object r0 = r2.invoke(r1, r0, r7)     // Catch:{ all -> 0x01ad }
            if (r0 == r6) goto L_0x00e4
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x01ad }
        L_0x00e4:
            if (r0 != r6) goto L_0x01b6
            return r6
        L_0x00e7:
            java.lang.String r1 = "Avatar load error"
            r7.A01 = r4     // Catch:{ all -> 0x01ad }
            r7.A02 = r5     // Catch:{ all -> 0x01ad }
            r7.A03 = r5     // Catch:{ all -> 0x01ad }
            r0 = 6
            r7.A00 = r0     // Catch:{ all -> 0x01ad }
            java.lang.String r0 = "ODRAvatarHandler"
            X.0KC.A0C(r0, r1)     // Catch:{ all -> 0x01ad }
            java.lang.Integer r3 = X.AnonymousClass05K.A0j     // Catch:{ all -> 0x01ad }
            java.lang.String r0 = "avatar_load_error"
            X.0sK r2 = r9.A07     // Catch:{ all -> 0x01ad }
            X.JrG r1 = new X.JrG     // Catch:{ all -> 0x01ad }
            r1.<init>(r0, r3)     // Catch:{ all -> 0x01ad }
            X.JrI r0 = r9.A00     // Catch:{ all -> 0x01ad }
            java.lang.Object r0 = r2.invoke(r1, r0, r7)     // Catch:{ all -> 0x01ad }
            if (r0 == r6) goto L_0x010c
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x01ad }
        L_0x010c:
            if (r0 != r6) goto L_0x01b6
            return r6
        L_0x010f:
            boolean r0 = r10 instanceof X.C60807Jrc     // Catch:{ all -> 0x01ad }
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x013f
            X.Jrc r10 = (X.C60807Jrc) r10     // Catch:{ all -> 0x01ad }
            java.lang.String r3 = r10.A00     // Catch:{ all -> 0x01ad }
            r9.A03 = r3     // Catch:{ all -> 0x01ad }
            X.LRf r2 = r9.A08     // Catch:{ all -> 0x01ad }
            if (r3 == 0) goto L_0x013a
            X.LOn r0 = r9.A02     // Catch:{ all -> 0x01ad }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x01ad }
            X.Lab r0 = r2.A0E     // Catch:{ all -> 0x01ad }
            com.facebook.cameracore.mediapipeline.services.avatars.AvatarsNativeInputDelegate r0 = r0.A00     // Catch:{ all -> 0x01ad }
            r0.loadAnimationFromFile(r3, r1)     // Catch:{ all -> 0x01ad }
            r7.A01 = r4     // Catch:{ all -> 0x01ad }
            r7.A02 = r5     // Catch:{ all -> 0x01ad }
            r7.A03 = r5     // Catch:{ all -> 0x01ad }
            r0 = 7
            r7.A00 = r0     // Catch:{ all -> 0x01ad }
            java.lang.Object r0 = r9.A01(r7)     // Catch:{ all -> 0x01ad }
            if (r0 != r6) goto L_0x01b6
            return r6
        L_0x013a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)     // Catch:{ all -> 0x01ad }
            goto L_0x01ac
        L_0x013f:
            boolean r0 = r10 instanceof X.C60812Jrh     // Catch:{ all -> 0x01ad }
            if (r0 != 0) goto L_0x01b6
            boolean r0 = r10 instanceof X.C60813Jri     // Catch:{ all -> 0x01ad }
            if (r0 == 0) goto L_0x0180
            X.Jri r10 = (X.C60813Jri) r10     // Catch:{ all -> 0x01ad }
            java.lang.Integer r2 = r10.A00     // Catch:{ all -> 0x01ad }
            java.lang.String r1 = r10.toString()     // Catch:{ all -> 0x01ad }
            X.MED.A02(r4, r7, r3)     // Catch:{ all -> 0x01ad }
            java.lang.String r0 = "ODRAvatarHandler"
            X.0KC.A0C(r0, r1)     // Catch:{ all -> 0x01ad }
            java.lang.Integer r3 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x01ad }
            if (r2 == 0) goto L_0x0176
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x01ad }
            if (r2 != r0) goto L_0x0171
            java.lang.Integer r3 = X.AnonymousClass05K.A15     // Catch:{ all -> 0x01ad }
            java.lang.String r0 = "output_validation_failure"
        L_0x0163:
            X.0sK r2 = r9.A07     // Catch:{ all -> 0x01ad }
            X.JrG r1 = new X.JrG     // Catch:{ all -> 0x01ad }
            r1.<init>(r0, r3)     // Catch:{ all -> 0x01ad }
            X.JrI r0 = r9.A00     // Catch:{ all -> 0x01ad }
            java.lang.Object r0 = r2.invoke(r1, r0, r7)     // Catch:{ all -> 0x01ad }
            goto L_0x0179
        L_0x0171:
            java.lang.Integer r3 = X.AnonymousClass05K.A0u     // Catch:{ all -> 0x01ad }
            java.lang.String r0 = "capture_error"
            goto L_0x0163
        L_0x0176:
            java.lang.String r0 = ""
            goto L_0x0163
        L_0x0179:
            if (r0 == r6) goto L_0x017d
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x01ad }
        L_0x017d:
            if (r0 != r6) goto L_0x01b6
            return r6
        L_0x0180:
            boolean r0 = r10 instanceof X.C60809Jre     // Catch:{ all -> 0x01ad }
            if (r0 != 0) goto L_0x01b6
            boolean r0 = r10 instanceof X.C60810Jrf     // Catch:{ all -> 0x01ad }
            if (r0 == 0) goto L_0x01b6
            X.0sK r3 = r9.A07     // Catch:{ all -> 0x01ad }
            X.Jrf r10 = (X.C60810Jrf) r10     // Catch:{ all -> 0x01ad }
            java.io.File r0 = r10.A00     // Catch:{ all -> 0x01ad }
            if (r0 == 0) goto L_0x01a8
            X.JrF r2 = new X.JrF     // Catch:{ all -> 0x01ad }
            r2.<init>(r0)     // Catch:{ all -> 0x01ad }
            X.JrI r1 = r9.A00     // Catch:{ all -> 0x01ad }
            r7.A01 = r4     // Catch:{ all -> 0x01ad }
            r7.A02 = r5     // Catch:{ all -> 0x01ad }
            r7.A03 = r5     // Catch:{ all -> 0x01ad }
            r0 = 9
            r7.A00 = r0     // Catch:{ all -> 0x01ad }
            java.lang.Object r0 = r3.invoke(r2, r1, r7)     // Catch:{ all -> 0x01ad }
            if (r0 != r6) goto L_0x01b6
            return r6
        L_0x01a8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)     // Catch:{ all -> 0x01ad }
        L_0x01ac:
            throw r0     // Catch:{ all -> 0x01ad }
        L_0x01ad:
            r0 = move-exception
            goto L_0x01bd
        L_0x01af:
            java.lang.Object r4 = r7.A01
            X.136 r4 = (X.136) r4
            X.0eS.A00(r1)     // Catch:{ all -> 0x01bc }
        L_0x01b6:
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x01bc }
            r4.A05(r5)
            return r0
        L_0x01bc:
            r0 = move-exception
        L_0x01bd:
            r4.A05(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.rmv.ODRAvatarHandler.A00(com.facebook.avatar.expresso.odr.rmv.ODRAvatarHandler, X.KpT, X.4D7):java.lang.Object");
    }

    private final Object A01(AnonymousClass4D7 r3) {
        Object A022;
        if (!this.A06 || !this.A05 || !this.A04 || (A022 = this.A08.A02(r3)) != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A022;
    }
}
