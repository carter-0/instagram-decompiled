package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.9Po  reason: invalid class name and case insensitive filesystem */
public final class C378379Po implements TextureView.SurfaceTextureListener, AnonymousClass8KG {
    public int A00;
    public int A01;
    public C3503284f A02;
    public ConstrainedTextureView A03;
    public C354078Ko A04;
    public C60263JiK A05;
    public B28 A06;
    public C379219Sz A07;
    public String A08;
    public final Context A09;
    public final C368028rx A0A;
    public final UserSession A0B;
    public final AnonymousClass80G A0C;
    public final FilterGroupModel A0D;
    public final Integer A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    public C378379Po(Context context, C368028rx r3, UserSession userSession, AnonymousClass80G r5, FilterGroupModel filterGroupModel, Integer num, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        0qQ.A0B(userSession, 2);
        this.A09 = context;
        this.A0B = userSession;
        this.A0F = z;
        this.A0C = r5;
        this.A0I = z2;
        this.A0M = z3;
        this.A0L = z4;
        this.A0D = filterGroupModel;
        this.A0K = z5;
        this.A0E = num;
        this.A0A = r3;
        this.A0J = z6;
        this.A0G = z7;
        this.A0H = z8;
        this.A08 = str;
    }

    public final void DpU(int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r18v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DpX(android.view.Surface r32, int r33, int r34) {
        /*
            r31 = this;
            r1 = 0
            r30 = r32
            r0 = r30
            X.0qQ.A0B(r0, r1)
            r11 = r31
            X.B28 r10 = r11.A06
            if (r10 == 0) goto L_0x011d
            android.content.Context r15 = r11.A09
            android.content.Context r17 = r15.getApplicationContext()
            X.0qQ.A07(r17)
            com.instagram.common.session.UserSession r14 = r11.A0B
            boolean r9 = r11.A0I
            boolean r13 = r11.A0M
            boolean r12 = r11.A0L
            boolean r8 = r11.A0F
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r7 = r11.A0D
            boolean r26 = X.AnonymousClass7TF.A1V(r7)
            java.lang.Integer r6 = r11.A0E
            X.8rx r5 = r11.A0A
            boolean r4 = r11.A0J
            boolean r3 = r11.A0G
            boolean r2 = r11.A0H
            java.lang.String r1 = r11.A08
            X.9R6 r0 = new X.9R6
            r22 = r9
            r23 = r13
            r24 = r12
            r25 = r8
            r27 = r4
            r28 = r3
            r29 = r2
            r20 = r6
            r21 = r1
            r18 = r5
            r19 = r14
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.String r1 = "connect"
            X.AnonymousClass9R6.A03(r0, r1)
            X.7rU r3 = r0.A07
            r3.A03()
            r2 = 0
            if (r8 == 0) goto L_0x0077
            X.1X6 r16 = X.1X6.A00
            if (r16 == 0) goto L_0x0113
            r21 = 1
            X.80G r1 = r11.A0C
            if (r1 == 0) goto L_0x006b
            android.view.View r2 = r1.A05()
        L_0x006b:
            r17 = r15
            r18 = r2
            r19 = r3
            r20 = r14
            X.8sn r2 = r16.A00(r17, r18, r19, r20, r21, r22)
        L_0x0077:
            int r9 = r11.A01
            int r5 = r11.A00
            X.8Ko r3 = r11.A04
            boolean r1 = r11.A0K
            X.9R7 r6 = new X.9R7
            r16 = r30
            r17 = r2
            r18 = r14
            r19 = r0
            r20 = r3
            r21 = r7
            r22 = r9
            r23 = r5
            r24 = r1
            r15 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.9RG r1 = new X.9RG
            r4 = r33
            r3 = r34
            r12 = r1
            r13 = r14
            r14 = r6
            r15 = r9
            r16 = r5
            r17 = r4
            r18 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.8Ko r0 = r11.A04
            X.9Sz r5 = new X.9Sz
            r5.<init>(r0, r10, r1, r6)
            X.84f r0 = r11.A02
            if (r0 == 0) goto L_0x00cb
            X.81C r0 = r0.A00
            X.81E r1 = r0.A00()
            X.84i r1 = (X.C3503584i) r1
            if (r1 == 0) goto L_0x00cb
            if (r8 == 0) goto L_0x00cb
            if (r2 == 0) goto L_0x00cb
            r1.ENP(r2)
            X.9R7 r0 = r5.A01
            r1.ENQ(r0)
        L_0x00cb:
            r11.A07 = r5
            X.9RG r1 = r5.A00
            if (r1 == 0) goto L_0x00fb
            android.os.Looper r0 = android.os.Looper.myLooper()
            X.0qQ.A0A(r0)
            android.os.Handler r5 = new android.os.Handler
            r5.<init>(r0)
            r0 = 5
            X.Ivs r2 = new X.Ivs
            r2.<init>(r1, r0)
            X.9R7 r1 = r1.A05
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.video.gl.AsyncRendererInitializer"
            X.0qQ.A0C(r1, r0)
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = r5.getLooper()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x010a
            r2.invoke()
        L_0x00fb:
            X.JiK r0 = r11.A05
            if (r0 == 0) goto L_0x0109
            X.0V2 r1 = r0.A02
            X.KPm r0 = new X.KPm
            r0.<init>(r4, r3)
            r1.FIA(r0)
        L_0x0109:
            return
        L_0x010a:
            X.AlG r0 = new X.AlG
            r0.<init>(r2)
            r5.post(r0)
            goto L_0x00fb
        L_0x0113:
            java.lang.String r0 = "instance"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x011d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378379Po.DpX(android.view.Surface, int, int):void");
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        0qQ.A0B(surfaceTexture, 0);
        DpX(new Surface(surfaceTexture), i, i2);
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void A00() {
        AnonymousClass9RG r2;
        C379219Sz r0 = this.A07;
        if (r0 != null && (r2 = r0.A00) != null) {
            Object obj = r2.A06;
            synchronized (obj) {
                r2.A0E = false;
                obj.notify();
            }
        }
    }

    public final void Dpb() {
        C379219Sz r3 = this.A07;
        if (r3 != null) {
            B28 b28 = this.A06;
            AnonymousClass9RG r2 = r3.A00;
            if (b28 != null && r2 != null) {
                b28.Ddk();
                r3.A01.A02 = null;
                r2.A00();
                r3.A00 = null;
            }
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C379219Sz r3 = this.A07;
        if (r3 == null) {
            return true;
        }
        B28 b28 = this.A06;
        AnonymousClass9RG r2 = r3.A00;
        if (b28 == null || r2 == null) {
            return true;
        }
        b28.Ddk();
        r3.A01.A02 = null;
        r2.A00();
        r3.A00 = null;
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C378379Po(android.content.Context r17, com.instagram.common.session.UserSession r18, java.lang.String r19) {
        /*
            r16 = this;
            r9 = 1
            r1 = r17
            r3 = r18
            X.AnonymousClass7TF.A1B(r1, r9, r3)
            r2 = 0
            r8 = 0
            r0 = r16
            r7 = r19
            r4 = r2
            r5 = r2
            r6 = r2
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r9
            r14 = r9
            r15 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378379Po.<init>(android.content.Context, com.instagram.common.session.UserSession, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C378379Po(android.content.Context r17, com.instagram.common.session.UserSession r18, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r19, java.lang.String r20, boolean r21, boolean r22) {
        /*
            r16 = this;
            r9 = 1
            r1 = r17
            r3 = r18
            X.AnonymousClass7TF.A1B(r1, r9, r3)
            r2 = 0
            r8 = 0
            r0 = r16
            r5 = r19
            r7 = r20
            r13 = r21
            r15 = r22
            r4 = r2
            r6 = r2
            r10 = r8
            r11 = r9
            r12 = r8
            r14 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378379Po.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel, java.lang.String, boolean, boolean):void");
    }
}
