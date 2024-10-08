package X;

import android.content.Context;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

public final class KH4 extends 2Cl {
    public final Context A00;
    public final UserSession A01;
    public final 1GK A02;
    public final LBE A03;
    public final MTY A04;
    public final L83 A05;
    public final FilterGroupModel A06;
    public final C352218Cl A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final C62461KgB[] A0B;

    public final int getRunnableId() {
        return 263;
    }

    public KH4(Context context, UserSession userSession, 1GK r17, MS5 ms5, MTY mty, L83 l83, FilterGroupModel filterGroupModel, C352218Cl r22, C62461KgB[] kgBArr, boolean z, boolean z2, boolean z3) {
        FilterGroupModelImpl filterGroupModelImpl;
        FilterGroupModel filterGroupModel2 = filterGroupModel;
        this.A00 = context;
        this.A01 = userSession;
        this.A07 = r22;
        this.A05 = l83;
        this.A02 = r17;
        this.A04 = mty;
        this.A0B = kgBArr;
        this.A0A = z;
        this.A09 = z2;
        this.A08 = z3;
        if (z || z2) {
            FilterChain A002 = ((FilterGroupModelImpl) filterGroupModel2).A02.deepCopy();
            A002.A01((FilterModel) null, 6);
            if (z) {
                A002.A01((FilterModel) null, 8);
                float[] A092 = AJ8.A09();
                Integer num = AnonymousClass05K.A00;
                C366708pX.A01(A002, new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), A092);
                AJ8.A04(A002);
            }
            filterGroupModelImpl = new FilterGroupModelImpl(A002, (PhotoFilter) null, AnonymousClass05K.A01, -1, true);
        } else {
            filterGroupModelImpl = filterGroupModel2.E1g();
        }
        this.A06 = filterGroupModelImpl;
        this.A03 = ms5.AMm(new L0O(this), filterGroupModelImpl);
    }

    /* JADX WARNING: type inference failed for: r24v0, types: [X.AR4, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a4, code lost:
        if (X.C3495280s.A02(r3) == false) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r41 = this;
            java.lang.String r7 = "PhotoPrepareTask"
            r0 = r41
            X.1GK r6 = r0.A02
            r1 = 0
            if (r6 == 0) goto L_0x0041
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0116 }
            r3 = 15
            X.OTS r2 = new X.OTS     // Catch:{ InterruptedException -> 0x0116 }
            r2.<init>(r3, r5)     // Catch:{ InterruptedException -> 0x0116 }
            boolean r2 = X.OX4.A02(r6, r2)     // Catch:{ InterruptedException -> 0x0116 }
            if (r2 == 0) goto L_0x0027
            java.lang.Object r2 = r6.A07()     // Catch:{ InterruptedException -> 0x0116 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ InterruptedException -> 0x0116 }
            if (r2 == 0) goto L_0x0041
            java.lang.String r4 = r2.getAbsolutePath()     // Catch:{ InterruptedException -> 0x0116 }
            if (r4 == 0) goto L_0x0041
            goto L_0x002d
        L_0x0027:
            java.lang.String r0 = "Timed out while waiting for async decor image saving to finish."
            X.0kD.A0G(r7, r0, r1)     // Catch:{ InterruptedException -> 0x0116 }
            return r1
        L_0x002d:
            X.L83 r3 = r0.A05
            int r2 = r3.A01
            float r5 = (float) r2
            int r2 = r3.A00
            float r2 = (float) r2
            float r5 = r5 / r2
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r3 = r0.A06
            boolean r6 = r0.A0A
            boolean r7 = r0.A09
            boolean r8 = r0.A08
            X.C364978mK.A04(r3, r4, r5, r6, r7, r8)
        L_0x0041:
            X.8Cl r3 = r0.A07
            android.content.Context r2 = r0.A00
            X.8m2 r26 = X.C364788m0.A00(r2, r3)
            int r15 = r3.A07
            int r14 = r3.A01
            int r7 = r3.A09
            int r6 = r3.A06
            android.graphics.Rect r8 = r3.A00()
            X.L83 r5 = r0.A05
            boolean r4 = r5.A02
            int r2 = r5.A01
            float r3 = (float) r2
            int r2 = r5.A00
            float r2 = (float) r2
            float r3 = r3 / r2
            r9 = r3
            r10 = r7
            r11 = r6
            r12 = r15
            r13 = r4
            com.instagram.creation.base.CropInfo r20 = X.C364818m3.A00(r8, r9, r10, r11, r12, r13)
            X.LBE r5 = r0.A03
            X.AR4 r24 = new X.AR4
            r24.<init>()
            android.content.Context r4 = r5.A00
            com.instagram.common.session.UserSession r3 = r5.A01
            java.util.LinkedHashMap r6 = r5.A06
            r2 = 0
            boolean r31 = X.AnonymousClass7TF.A1U(r2, r4, r3)
            X.7qz r34 = new X.7qz
            r34.<init>()
            r7 = 991(0x3df, float:1.389E-42)
            java.lang.String r37 = X.AnonymousClass000.A00(r7)
            r32 = r4
            r33 = r24
            r35 = r3
            r36 = r1
            r38 = r6
            r39 = r2
            r40 = r2
            X.7rU r18 = X.C39823AAu.A01(r32, r33, r34, r35, r36, r37, r38, r39, r40)
            boolean r7 = r26.Cdi()
            if (r7 == 0) goto L_0x00a6
            boolean r7 = X.C3495280s.A02(r3)
            r37 = 1
            if (r7 != 0) goto L_0x00a8
        L_0x00a6:
            r37 = 0
        L_0x00a8:
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r13 = r5.A05
            java.lang.Integer r27 = X.AnonymousClass05K.A01
            X.KgB[] r12 = r5.A0B
            X.MV7 r11 = r5.A04
            boolean r10 = r5.A08
            X.L83 r9 = r5.A03
            boolean r8 = r5.A09
            boolean r7 = r5.A07
            boolean r5 = r5.A0A
            if (r6 == 0) goto L_0x0113
            int r32 = r6.size()
        L_0x00c0:
            X.LER r16 = new X.LER
            r33 = r10
            r34 = r8
            r35 = r2
            r36 = r7
            r38 = r2
            r39 = r31
            r40 = r5
            r25 = r13
            r28 = r12
            r29 = r15
            r30 = r14
            r21 = r1
            r22 = r9
            r23 = r11
            r19 = r3
            r17 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            boolean r2 = r16.A00()
            if (r2 != 0) goto L_0x011c
            X.KgB[] r6 = r0.A0B
            int r5 = r6.length
            r4 = 0
        L_0x00ef:
            if (r4 >= r5) goto L_0x011c
            r3 = r6[r4]
            X.KgB r2 = X.C62461KgB.UPLOAD
            if (r3 != r2) goto L_0x0110
            java.lang.String r3 = ""
            java.lang.String r2 = "Stories camera upload fail"
            X.0kD.A0G(r2, r3, r1)
            com.instagram.common.session.UserSession r2 = r0.A01
            X.27r r2 = X.27p.A01(r2)
            X.29K r2 = r2.A04
            r2.A0B(r3)
            X.MTY r2 = r0.A04
            if (r2 == 0) goto L_0x0110
            r2.Dvm()
        L_0x0110:
            int r4 = r4 + 1
            goto L_0x00ef
        L_0x0113:
            r32 = 0
            goto L_0x00c0
        L_0x0116:
            r2 = move-exception
            java.lang.String r0 = "An interrupted occurred while waiting for async decor image saving to finish."
            X.0kD.A0G(r7, r0, r2)
        L_0x011c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KH4.call():java.lang.Object");
    }
}
