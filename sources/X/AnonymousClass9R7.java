package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.pendingmedia.model.ClipInfo;

/* renamed from: X.9R7  reason: invalid class name */
public final class AnonymousClass9R7 implements C367398qg {
    public SurfaceTexture A00;
    public Surface A01;
    public C354078Ko A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final Surface A06;
    public final C368528sn A07;
    public final UserSession A08;
    public final AnonymousClass9R6 A09;
    public final FilterGroupModel A0A;
    public final boolean A0B;
    public final /* synthetic */ C367388qf A0C;

    public final void A02(ClipInfo clipInfo, boolean z) {
        int i;
        int i2;
        AnonymousClass9SN r0;
        0qQ.A0B(clipInfo, 0);
        int A002 = Q0X.A00(AnonymousClass7TG.A0A(clipInfo.A0C));
        boolean z2 = this.A0B;
        if (z2) {
            i = clipInfo.A09;
        } else {
            i = this.A05;
        }
        if (z2) {
            i2 = clipInfo.A06;
        } else {
            i2 = this.A04;
        }
        int i3 = clipInfo.A04;
        AnonymousClass9R6 r4 = this.A09;
        r4.A02 = i;
        r4.A01 = i2;
        AnonymousClass9R6.A02(r4);
        C379369To A003 = AnonymousClass9R6.A00(r4);
        if (A003 != null) {
            AnonymousClass9SN r02 = (AnonymousClass9SN) C343837qt.A02(A003);
            r02.A02 = A002;
            AnonymousClass9SN.A03(r02);
        }
        r4.A00 = A002;
        AnonymousClass9R6.A02(r4);
        if (z) {
            if (i3 == 6) {
                if (!182.A06(0Tu.A05, this.A08, 36319373031382198L)) {
                    C379369To A004 = AnonymousClass9R6.A00(r4);
                    if (A004 != null) {
                        r0 = (AnonymousClass9SN) C343837qt.A02(A004);
                        r0.A00 = 3;
                        AnonymousClass9SN.A03(r0);
                    }
                    return;
                }
            }
            C379369To A005 = AnonymousClass9R6.A00(r4);
            if (A005 != null) {
                r0 = (AnonymousClass9SN) C343837qt.A02(A005);
                r0.A00 = i3;
                AnonymousClass9SN.A03(r0);
            }
        }
    }

    public final void A9X(AnonymousClass82C r2) {
        this.A0C.A9X(r2);
    }

    public final EffectAttribution Azz() {
        return this.A0C.Azz();
    }

    public final void E22() {
        this.A0C.E22();
    }

    public final void EEG(AnonymousClass82C r2) {
        this.A0C.EEG(r2);
    }

    public final void EHv() {
        this.A0C.EHv();
    }

    public final void EJ2() {
        this.A0C.EJ2();
    }

    public final void ENO(CameraAREffect cameraAREffect) {
        this.A0C.ENO(cameraAREffect);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r0 == null) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.SurfaceTexture A00() {
        /*
            r5 = this;
            X.9R6 r1 = r5.A09
            boolean r0 = r1.A0H
            if (r0 == 0) goto L_0x0009
            android.graphics.SurfaceTexture r0 = r1.A06
            return r0
        L_0x0009:
            X.9To r0 = X.AnonymousClass9R6.A00(r1)
            if (r0 == 0) goto L_0x0075
            X.9Tp r4 = X.C343837qt.A02(r0)
            X.9SN r4 = (X.AnonymousClass9SN) r4
            X.7qb r0 = X.C343737qi.A08
            java.lang.Boolean r3 = X.AnonymousClass7TE.A0u()
            r1 = r3
            X.7qt r2 = r4.A00
            java.lang.Object r0 = r2.Apu(r0)
            if (r0 == 0) goto L_0x0025
            r1 = r0
        L_0x0025:
            boolean r1 = X.AnonymousClass7TE.A1a(r1)
            X.A3O r0 = r4.A07
            if (r1 == 0) goto L_0x004e
            if (r0 != 0) goto L_0x0041
            X.7qb r0 = X.C343737qi.A07
            java.lang.Object r0 = r2.Apu(r0)
            if (r0 == 0) goto L_0x0038
            r3 = r0
        L_0x0038:
            boolean r0 = X.AnonymousClass7TE.A1a(r3)
            if (r0 != 0) goto L_0x0050
            X.AnonymousClass9SN.A01(r4)
        L_0x0041:
            X.AnonymousClass9SN.A03(r4)
        L_0x0044:
            X.7mH r0 = r4.A06
            r0.getClass()
            android.graphics.SurfaceTexture r0 = r0.getSurfaceTexture()
            return r0
        L_0x004e:
            if (r0 != 0) goto L_0x0044
        L_0x0050:
            r0 = 1
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch
            r3.<init>(r0)
            X.7rv r0 = X.AnonymousClass9SN.A00(r4)
            android.os.Handler r1 = r0.getHandler()
            X.Am5 r0 = new X.Am5
            r0.<init>(r4, r3)
            r1.post(r0)
            r1 = 5
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x006e }
            r3.await(r1, r0)     // Catch:{ InterruptedException -> 0x006e }
            goto L_0x0044
        L_0x006e:
            java.lang.String r0 = "Timeout in getting input surface texture"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0075:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9R7.A00():android.graphics.SurfaceTexture");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r3 = (X.AnonymousClass9SN) X.C343837qt.A02(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r6 = this;
            X.9R6 r5 = r6.A09
            X.7rU r4 = r5.A07
            boolean r0 = r4.A08()
            if (r0 == 0) goto L_0x0029
            X.9To r0 = X.AnonymousClass9R6.A00(r5)
            if (r0 == 0) goto L_0x0029
            X.9Tp r3 = X.C343837qt.A02(r0)
            X.9SN r3 = (X.AnonymousClass9SN) r3
            X.7uT r2 = r3.A0F
            if (r2 == 0) goto L_0x0029
            X.7rv r0 = X.AnonymousClass9SN.A00(r3)
            X.7sH r1 = r0.BQ8()
            r0 = 0
            r1.EDi(r0, r2)
            r0 = 0
            r3.A0F = r0
        L_0x0029:
            boolean r0 = r4.A08()
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "disconnect"
            X.AnonymousClass9R6.A03(r5, r0)
            r4.A04()
            return
        L_0x0038:
            java.lang.String r0 = "duplicated-disconnect"
            X.AnonymousClass9R6.A03(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9R7.A01():void");
    }

    public AnonymousClass9R7(Surface surface, C368528sn r4, UserSession userSession, AnonymousClass9R6 r6, C354078Ko r7, FilterGroupModel filterGroupModel, int i, int i2, boolean z) {
        this.A0C = new C367388qf(r4, new C367378qe(r6.A07));
        this.A08 = userSession;
        this.A06 = surface;
        this.A05 = i;
        this.A04 = i2;
        this.A07 = r4;
        this.A02 = r7;
        this.A09 = r6;
        this.A0A = filterGroupModel;
        this.A0B = z;
    }
}
