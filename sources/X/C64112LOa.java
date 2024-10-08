package X;

import android.graphics.SurfaceTexture;
import android.view.View;

/* renamed from: X.LOa  reason: case insensitive filesystem */
public final class C64112LOa {
    public int A00 = Integer.MAX_VALUE;
    public int A01;
    public int A02 = Integer.MAX_VALUE;
    public int A03;
    public SurfaceTexture A04;
    public View A05;
    public AnonymousClass82X A06;
    public boolean A07;
    public final C340307l3 A08;

    public final void A01() {
        this.A07 = false;
        C340307l3 r2 = this.A08;
        r2.EI4(false);
        if (this.A04 != null) {
            if (r2.Esr()) {
                r2.Egd((SurfaceTexture) null, 0, 0);
            }
            r2.disconnect();
            this.A04 = null;
        }
    }

    public static final void A00(C343047pa r5, C18594Vul vul, C64112LOa lOa) {
        int i;
        int i2;
        int i3 = r5.A01;
        int i4 = r5.A02;
        if (lOa.A06 != null) {
            i = lOa.A03;
            i2 = lOa.A01;
        } else {
            i = i3;
            i2 = i4;
        }
        vul.A04(new L9N(i3, i4, i, i2, lOa.A08.CPy()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r14.A08.CJr() == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.graphics.SurfaceTexture r15, X.C18594Vul r16, int r17, int r18, boolean r19) {
        /*
            r14 = this;
            r14.A04 = r15
            int r0 = r14.A00
            r7 = r17
            int r3 = java.lang.Math.min(r7, r0)
            r6 = r18
            float r2 = (float) r6
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r2
            float r1 = (float) r7
            float r0 = r0 / r1
            X.AUu r8 = new X.AUu
            r8.<init>(r3, r0)
            r11 = 1
            if (r19 == 0) goto L_0x0023
            X.7l3 r0 = r14.A08
            boolean r0 = r0.CJr()
            r9 = 1
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r9 = 0
        L_0x0024:
            r4 = 0
            X.82X r13 = r14.A06
            if (r13 == 0) goto L_0x0062
            int r0 = r14.A02
            int r12 = java.lang.Math.min(r0, r7)
            r14.A03 = r12
            float r0 = (float) r12
            float r2 = r2 * r0
            float r2 = r2 / r1
            int r10 = (int) r2
            r14.A01 = r10
            android.graphics.SurfaceTexture r5 = r14.A04
            java.lang.String r0 = "Required value was null."
            if (r5 == 0) goto L_0x008b
            r5.setDefaultBufferSize(r12, r10)
            X.7l3 r3 = r14.A08
            r3.EdB(r11)
            android.view.View r4 = r14.A05
            if (r4 == 0) goto L_0x0086
            r0 = 4889(0x1319, float:6.851E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r1 = 0
            X.81b r0 = r13.A04
            X.7mF r4 = r0.A00(r4, r3, r2, r1)
            com.instagram.camera.effect.mq.IgCameraEffectsController r0 = r13.A05
            r0.A08 = r3
            if (r4 == 0) goto L_0x0062
            r4.Dh6(r5, r12, r10)
            r4.Dh5(r12, r10)
        L_0x0062:
            r14.A07 = r11
            X.7kp r1 = X.C340177kp.HIGH
            X.7l3 r3 = r14.A08
            X.9dk r0 = new X.9dk
            r0.<init>(r1, r1, r8)
            r3.Ej6(r0)
            r3.setInitialCameraFacing(r9)
            android.graphics.SurfaceTexture r0 = r14.A04
            r3.Egd(r0, r7, r6)
            X.80L r2 = X.AnonymousClass80L.A00
            r1 = 0
            X.K05 r0 = new X.K05
            r5 = r16
            r0.<init>(r1, r5, r14)
            r3.AJI(r0, r4, r2)
            return
        L_0x0086:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x008b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64112LOa.A02(android.graphics.SurfaceTexture, X.Vul, int, int, boolean):void");
    }

    public C64112LOa(C340307l3 r2) {
        this.A08 = r2;
    }
}
