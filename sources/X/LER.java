package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

public final class LER {
    public AnonymousClass0eK A00;
    public final int A01;
    public final int A02;
    public final Context A03;
    public final UserSession A04;
    public final CropInfo A05;
    public final C3499782r A06;
    public final L6Q A07;
    public final L83 A08;
    public final L4D A09;
    public final MV7 A0A;
    public final C364808m2 A0B;
    public final AnonymousClass0eM A0C = AnonymousClass0eN.A01(C59917Jbg.A00(this, 17));
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final C62461KgB[] A0G;
    public final int A0H;
    public final int A0I;
    public final C344207rU A0J;
    public final AR4 A0K;
    public final FilterGroupModel A0L;
    public final Integer A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;

    public LER(Context context, C344207rU r5, UserSession userSession, CropInfo cropInfo, C3499782r r8, L83 l83, MV7 mv7, AR4 ar4, FilterGroupModel filterGroupModel, C364808m2 r13, Integer num, C62461KgB[] kgBArr, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        0qQ.A0B(userSession, 2);
        C51973G9u.A0u(5, filterGroupModel, kgBArr, mv7);
        0qQ.A0B(l83, 14);
        this.A03 = context;
        this.A04 = userSession;
        this.A0K = ar4;
        this.A0J = r5;
        this.A0L = filterGroupModel;
        this.A0M = num;
        this.A0B = r13;
        this.A05 = cropInfo;
        this.A0G = kgBArr;
        this.A0A = mv7;
        this.A01 = i;
        this.A0H = i2;
        this.A0P = z;
        this.A08 = l83;
        this.A0Q = z2;
        this.A0R = z3;
        boolean z9 = z4;
        this.A0O = z9;
        this.A0E = z5;
        this.A0N = z6;
        this.A0D = z7;
        this.A02 = i3;
        this.A0F = z8;
        this.A0I = i4;
        this.A06 = r8;
        this.A07 = new L6Q(userSession, false, z9);
        this.A09 = new L4D(userSession, z9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r12.A0B.Cdi() == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00() {
        /*
            r35 = this;
            r12 = r35
            boolean r11 = r12.A0E
            r9 = 0
            if (r11 == 0) goto L_0x0011
            X.8m2 r0 = r12.A0B
            boolean r0 = r0.Cdi()
            r20 = 1
            if (r0 != 0) goto L_0x0013
        L_0x0011:
            r20 = 0
        L_0x0013:
            android.content.Context r0 = r12.A03
            r34 = r0
            com.instagram.common.session.UserSession r10 = r12.A04
            X.L6Q r5 = r12.A07
            X.L4D r4 = r12.A09
            r8 = 1
            boolean r3 = r12.A0F
            int r2 = r12.A02
            X.KgB[] r1 = r12.A0G
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            X.KgB[] r0 = (X.C62461KgB[]) r0
            r13 = r34
            r14 = r10
            r15 = r5
            r16 = r4
            r17 = r0
            r18 = r2
            r19 = r8
            r21 = r3
            java.util.ArrayList r22 = X.C63202Kt9.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r0 = r22.isEmpty()
            if (r0 == 0) goto L_0x004c
            X.M3Y r0 = new X.M3Y
            r0.<init>(r12)
            X.11Z.A02(r0)
            return r9
        L_0x004c:
            X.MV7 r0 = r12.A0A
            r33 = r0
            r33.Ddn()
            X.7rU r7 = r12.A0J
            X.AR4 r0 = r12.A0K
            r19 = r0
            if (r11 == 0) goto L_0x0191
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326777555007452(0x810f03000037dc, double:3.036538629754427E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x0191
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r12.A0L
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r14 = r0.E1g()
        L_0x006e:
            java.lang.Integer r0 = r12.A0M
            r18 = r0
            int r0 = r12.A01
            r17 = r0
            int r0 = r12.A0H
            r16 = r0
            boolean r15 = r12.A0P
            r0 = 4
            X.MBH r13 = new X.MBH
            r13.<init>(r12, r0)
            r0 = 5
            X.MBH r6 = new X.MBH
            r6.<init>(r12, r0)
            boolean r5 = r12.A0Q
            boolean r4 = r12.A0R
            boolean r3 = r12.A0O
            boolean r0 = r12.A0N
            if (r0 == 0) goto L_0x018e
            com.instagram.creation.base.CropInfo r2 = r12.A05
        L_0x0094:
            int r1 = r12.A0I
            X.82r r12 = r12.A06
            X.LQm r0 = new X.LQm
            r20 = r14
            r21 = r18
            r23 = r13
            r24 = r6
            r25 = r17
            r26 = r16
            r27 = r1
            r28 = r15
            r29 = r5
            r30 = r4
            r31 = r3
            r32 = r11
            r13 = r34
            r14 = r7
            r15 = r10
            r16 = r2
            r17 = r12
            r18 = r33
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            if (r7 == 0) goto L_0x01cb
            r7.A03()
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.util.List r1 = r0.A0H
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r11 = r1.iterator()
        L_0x00d3:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x019f
            java.lang.Object r14 = r11.next()
            X.LAM r14 = (X.LAM) r14
            X.7rU r2 = r0.A08
            if (r2 == 0) goto L_0x019a
            X.7rc r1 = X.C345807u7.A00
            X.7rb r1 = r2.A02(r1)
            X.7u7 r1 = (X.C345807u7) r1
            X.8mL r13 = r1.Avx()
            X.0qQ.A07(r13)
            int r1 = r0.A06
            int r1 = r1 + 1
            java.util.concurrent.CountDownLatch r6 = new java.util.concurrent.CountDownLatch
            r6.<init>(r1)
            java.util.concurrent.atomic.AtomicReference r17 = new java.util.concurrent.atomic.AtomicReference
            r17.<init>()
            X.LDk r12 = new X.LDk
            r15 = r0
            r16 = r6
            r12.<init>(r13, r14, r15, r16, r17)
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r3 = r0.A0F
            r1 = r3
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r1 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r1
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r1 = r1.A02
            r13.A07(r1)
            boolean r1 = r0.A0M
            if (r1 == 0) goto L_0x014c
            r1 = 8
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r2 = r3.B5u(r1)
            if (r2 == 0) goto L_0x0126
            boolean r1 = r2 instanceof com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter
            if (r1 == 0) goto L_0x0174
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter r2 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter) r2
            r2.A05 = r9
        L_0x0126:
            r1 = 3
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r2 = r3.B5u(r1)
            if (r2 == 0) goto L_0x0137
            boolean r1 = r2 instanceof com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel
            if (r1 == 0) goto L_0x0137
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel r2 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel) r2
            java.lang.String r1 = "gainmap_alpha"
            r2.A08 = r1
        L_0x0137:
            r1 = 28
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r2 = r3.B5u(r1)
            if (r2 == 0) goto L_0x014c
            boolean r1 = r2 instanceof com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter
            if (r1 == 0) goto L_0x014c
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter r2 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter) r2
            r2.A0A = r8
            r2.A09 = r9
            r2.A01(r8)
        L_0x014c:
            X.MAO r1 = new X.MAO
            r1.<init>(r13, r14, r12, r0)
            r13.A0C(r1)
            r6.await()     // Catch:{ InterruptedException -> 0x0158 }
            goto L_0x0166
        L_0x0158:
            r6 = move-exception
            java.lang.String r3 = "OneCameraImageRenderer"
            X.KgB r1 = r14.A02
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            java.lang.String r1 = "InterruptedException for %s"
            X.0KC.A0L(r3, r1, r6, r2)
        L_0x0166:
            java.lang.Object r1 = r17.get()
            if (r1 == 0) goto L_0x0195
            r4.put(r14, r1)
            r5.add(r1)
            goto L_0x00d3
        L_0x0174:
            boolean r1 = r2 instanceof com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel
            if (r1 == 0) goto L_0x0126
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r2 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) r2
            java.lang.String r10 = r2.A03
            r1 = 1392(0x570, float:1.95E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = X.0qQ.A0K(r10, r1)
            if (r1 == 0) goto L_0x0126
            java.lang.String r1 = "u_isGainmapEnabled"
            r2.A02(r1, r9)
            goto L_0x0126
        L_0x018e:
            r2 = 0
            goto L_0x0094
        L_0x0191:
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r14 = r12.A0L
            goto L_0x006e
        L_0x0195:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x019a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x019f:
            android.os.Handler r2 = r0.A07
            X.M7C r1 = new X.M7C
            r1.<init>(r0, r5)
            r2.post(r1)
            X.LO5 r3 = r0.A0D
            X.0nO r2 = X.0nY.A00()
            X.KIk r1 = new X.KIk
            r1.<init>(r3, r5)
            r2.ATE(r1)
            boolean r1 = r0.A0O
            if (r1 == 0) goto L_0x01c8
            com.instagram.common.session.UserSession r1 = r0.A09
            boolean r1 = X.2Ht.A04(r1)
            if (r1 == 0) goto L_0x01c8
            X.MV7 r0 = r0.A0C
            r0.Dgg(r4)
        L_0x01c8:
            r7.A04()
        L_0x01cb:
            r9 = 1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LER.A00():boolean");
    }
}
