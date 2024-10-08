package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Handler;
import java.util.concurrent.FutureTask;

/* renamed from: X.7lt  reason: invalid class name and case insensitive filesystem */
public final class C340827lt {
    public CameraDevice A00;
    public CameraManager A01;
    public C365938nv A02;
    public C343157pl A03;
    public C340837lu A04;
    public C342627ou A05;
    public C342707p2 A06;
    public C342687p0 A07;
    public FutureTask A08;
    public boolean A09;
    public final C340807lr A0A;
    public final C340757lm A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;

    public final synchronized void A00() {
        FutureTask futureTask = this.A08;
        if (futureTask != null) {
            this.A0B.A08(futureTask);
            this.A08 = null;
        }
    }

    public final synchronized void A02(CaptureRequest.Builder builder, C343187po r5, long j) {
        C3724790z r2 = new C3724790z(builder, this, r5);
        A00();
        this.A08 = this.A0B.A02(AnonymousClass000.A00(3888), r2, j);
    }

    public C340827lt(C340757lm r2) {
        C340807lr r0 = new C340807lr(r2);
        this.A0B = r2;
        this.A0A = r0;
    }

    public final void A01(CaptureRequest.Builder builder, C343187po r16) {
        C343297pz r1;
        this.A0A.A01("Can only reset focus on the Optic thread.");
        if (this.A04 != null && this.A05 != null) {
            CaptureRequest.Builder builder2 = builder;
            if (builder != null && this.A07 != null && this.A0D && (r1 = this.A04.A09) != null) {
                this.A0E = false;
                this.A0C = false;
                float A062 = this.A05.A06();
                C342627ou r3 = this.A05;
                Rect rect = r3.A04;
                MeteringRectangle[] A042 = C342627ou.A04(r3, r3.A0D);
                C342627ou r32 = this.A05;
                C340837lu.A01(rect, builder2, this.A07, A042, C342627ou.A04(r32, r32.A0C), A062);
                CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
                builder.set(key, 2);
                C343187po r6 = r16;
                r1.AGa(builder.build(), (Handler) null, r6);
                CameraManager cameraManager = this.A01;
                CameraDevice cameraDevice = this.A00;
                cameraDevice.getClass();
                String id = cameraDevice.getId();
                C342707p2 r10 = this.A06;
                r10.getClass();
                int A002 = C343587qS.A00(cameraManager, builder, r10, this.A07, id, 0);
                builder.set(key, 0);
                r1.Eia(builder.build(), (Handler) null, r6);
                if (A002 == 1) {
                    builder.set(key, 1);
                    r1.AGa(builder.build(), (Handler) null, r6);
                    builder.set(key, 0);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (((java.lang.Number) r6.A06.A02(r1)).intValue() == 1) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.hardware.camera2.CaptureRequest.Builder r7, X.C343187po r8, boolean r9) {
        /*
            r6 = this;
            X.7lm r1 = r6.A0B
            java.lang.String r0 = "Method setFocusModeForVideo() must run on the Optic Background Thread."
            r1.A06(r0)
            android.hardware.camera2.CameraManager r0 = r6.A01
            if (r0 == 0) goto L_0x0029
            android.hardware.camera2.CameraDevice r0 = r6.A00
            if (r0 == 0) goto L_0x0029
            X.7lu r1 = r6.A04
            if (r1 == 0) goto L_0x0029
            if (r7 == 0) goto L_0x0029
            X.7p0 r0 = r6.A07
            if (r0 == 0) goto L_0x0029
            if (r9 != 0) goto L_0x0029
            X.7pz r2 = r1.A09
            if (r2 == 0) goto L_0x0029
            r4 = 1
            r6.A0E = r4
            boolean r0 = r6.A0C
            if (r0 == 0) goto L_0x002a
            r6.A00()
        L_0x0029:
            return
        L_0x002a:
            X.7p0 r1 = r6.A07
            X.7p1 r0 = X.C342687p0.A0D
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0082
            r5 = 3
        L_0x003b:
            X.7p2 r0 = r6.A06
            r3 = 0
            if (r0 == 0) goto L_0x0056
            X.7p4 r1 = X.C342717p3.A0e
            java.lang.Object r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0056
            X.7p2 r0 = r6.A06
            java.lang.Object r0 = r0.A02(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r4) goto L_0x0067
        L_0x0056:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.set(r1, r0)
            android.hardware.camera2.CaptureRequest r0 = r7.build()
            r2.AGa(r0, r3, r8)
        L_0x0067:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r7.set(r1, r0)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.set(r1, r0)
            android.hardware.camera2.CaptureRequest r0 = r7.build()
            r2.Eia(r0, r3, r8)
            return
        L_0x0082:
            X.7p0 r1 = r6.A07
            X.7p1 r0 = X.C342687p0.A0C
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0029
            r5 = 4
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340827lt.A03(android.hardware.camera2.CaptureRequest$Builder, X.7po, boolean):void");
    }

    public final void A04(C343187po r3) {
        C342707p2 r1;
        C342687p0 r12 = this.A07;
        r12.getClass();
        if (((Boolean) r12.A01(C342687p0.A05)).booleanValue() && ((Boolean) this.A07.A01(C342687p0.A04)).booleanValue() && (r1 = this.A06) != null) {
            Object A022 = r1.A02(C342717p3.A0Q);
            A022.getClass();
            if (((Boolean) A022).booleanValue()) {
                this.A09 = true;
                r3.A06 = new C40173AUn(this);
                return;
            }
        }
        r3.A06 = null;
        this.A09 = false;
    }

    public final void A05(Integer num, float[] fArr) {
        if (this.A02 != null) {
            C342057ny.A00(new C41117Aod(this, num, fArr));
        }
    }
}
