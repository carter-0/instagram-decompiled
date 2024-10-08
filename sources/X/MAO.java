package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;

public final class MAO implements Runnable {
    public final /* synthetic */ C364988mL A00;
    public final /* synthetic */ LAM A01;
    public final /* synthetic */ C63927LDk A02;
    public final /* synthetic */ C64149LQm A03;

    public MAO(C364988mL r1, LAM lam, C63927LDk lDk, C64149LQm lQm) {
        this.A03 = lQm;
        this.A02 = lDk;
        this.A01 = lam;
        this.A00 = r1;
    }

    public static ValueMapFilterModel A00(Integer num, String str) {
        return C369418uZ.A00(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), str, (float[]) null, 46);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36325222777303791L) == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0126, code lost:
        if (r12 >= r14) goto L_0x0128;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r7 = r20
            X.LQm r5 = r7.A03     // Catch:{ Exception -> 0x02cc }
            X.0eK r0 = r5.A0J     // Catch:{ Exception -> 0x02cc }
            java.lang.Object r4 = r0.get()     // Catch:{ Exception -> 0x02cc }
            if (r4 == 0) goto L_0x02c7
            X.8my r4 = (X.C365358my) r4     // Catch:{ Exception -> 0x02cc }
            X.LAM r0 = r7.A01
            r19 = r0
            X.0eK r0 = r5.A0I
            java.lang.Object r0 = r0.get()
            X.8qi r0 = (X.C367418qi) r0
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            android.graphics.Point r11 = new android.graphics.Point
            r11.<init>(r1, r0)
            boolean r0 = r5.A0N
            r6 = 1
            r18 = 0
            if (r0 == 0) goto L_0x026c
            r0 = r19
            X.KgB r1 = r0.A02
            X.KgB r0 = X.C62461KgB.UPLOAD
            if (r1 != r0) goto L_0x026c
            com.instagram.common.session.UserSession r3 = r5.A09
            int r8 = r5.A05
            r0 = r19
            boolean r2 = r0.A06
            boolean r10 = r0.A05
            X.82r r0 = r5.A0B
            if (r0 == 0) goto L_0x0269
            X.514 r1 = r0.ANP()
        L_0x0048:
            X.514 r0 = X.AnonymousClass514.ORIGINAL
            if (r1 != r0) goto L_0x005b
            X.0Tu r9 = X.0Tu.A05
            r0 = 36325222777303791(0x810d99000732ef, double:3.0355553820740446E-306)
            boolean r0 = X.182.A06(r9, r3, r0)
            r16 = 1
            if (r0 != 0) goto L_0x005d
        L_0x005b:
            r16 = 0
        L_0x005d:
            java.lang.Integer r0 = r5.A0G
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            boolean r17 = X.C51969G9p.A1a(r0, r9)
            X.0qQ.A0B(r4, r6)
            int r1 = r8 % 180
            if (r1 != 0) goto L_0x0263
            int r13 = r4.getWidth()
        L_0x0070:
            r12 = r3
            r14 = r2
            r15 = r10
            android.graphics.Point r2 = X.LS5.A00(r11, r12, r13, r14, r15, r16, r17)
            int r15 = r2.x
            r5.A03 = r15
            int r14 = r2.y
            r5.A02 = r14
            if (r0 != r9) goto L_0x0179
            if (r1 != 0) goto L_0x0259
            int r13 = r4.getWidth()
            int r12 = r4.getHeight()
        L_0x008b:
            java.lang.String r17 = "featureMode"
            boolean r8 = X.AnonymousClass7TF.A1T(r13, r12)
            boolean r2 = X.AnonymousClass7TF.A1T(r15, r14)
            r1 = 1
            r0 = r14
            if (r8 != r2) goto L_0x009b
            r1 = 0
            r0 = r15
        L_0x009b:
            float r10 = (float) r0
            r0 = r14
            if (r1 == 0) goto L_0x00a0
            r0 = r15
        L_0x00a0:
            float r8 = (float) r0
            float r2 = (float) r13
            float r1 = (float) r12
            float r11 = r2 / r1
            float r0 = r10 / r8
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00e5
            boolean r0 = X.C366738pa.A00(r3)
            if (r0 != 0) goto L_0x00b9
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x00e5
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x00e5
        L_0x00b9:
            float r10 = r2 / r10
            float r8 = r1 / r8
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c2
            r10 = r8
        L_0x00c2:
            float r2 = r2 / r10
            float r1 = r1 / r10
            boolean r0 = X.C366738pa.A00(r3)
            r8 = 1159725056(0x45200000, float:2560.0)
            r10 = 1152647168(0x44b40000, float:1440.0)
            if (r0 == 0) goto L_0x0256
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x024b
            float r0 = r10 / r2
            float r1 = r1 * r0
        L_0x00d5:
            r8 = r1
        L_0x00d6:
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = r10 % r2
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01f8
            float r0 = r8 % r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01f8
        L_0x00e5:
            int r2 = (int) r10
            int r1 = (int) r8
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r2, r1)
            int r11 = r0.x
            int r10 = r0.y
            if (r13 != r11) goto L_0x00f4
            if (r12 == r10) goto L_0x0179
        L_0x00f4:
            r17 = 1
            if (r13 <= r11) goto L_0x01f4
            if (r12 <= r10) goto L_0x01f4
            X.0wX r0 = X.C61170le.A00
            X.0xm r0 = X.AnonymousClass0xl.A00(r0)
            X.0xa r1 = r0.A00
            r0 = 3620(0xe24, float:5.073E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r6)
            if (r0 == 0) goto L_0x01f4
        L_0x010e:
            r0 = 0
            X.0Tu r8 = X.0Tu.A05
            r1 = 36320171896021077(0x810901000b2055, double:3.03236118441259E-306)
            boolean r16 = X.182.A06(r8, r3, r1)
            r1 = 36320171896086614(0x810901000c2056, double:3.0323611844540356E-306)
            boolean r2 = X.182.A06(r8, r3, r1)
            if (r13 >= r15) goto L_0x0128
            r1 = 1
            if (r12 < r14) goto L_0x0129
        L_0x0128:
            r1 = 0
        L_0x0129:
            if (r17 == 0) goto L_0x01e0
            java.lang.String r2 = "lanczos"
        L_0x012d:
            r1 = 1342(0x53e, float:1.88E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r15 = r2.equals(r1)
            if (r15 == 0) goto L_0x0142
            r0 = 36320171895890003(0x81090100092053, double:3.032361184329698E-306)
            boolean r0 = X.182.A06(r8, r3, r0)
        L_0x0142:
            r1 = 1865(0x749, float:2.613E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r1)
            boolean r14 = r2.equals(r3)
            if (r14 == 0) goto L_0x0152
            int r11 = r13 * 2
            int r10 = r12 * 2
        L_0x0152:
            java.lang.String r8 = "lanczos"
            boolean r1 = r2.equals(r8)
            if (r1 == 0) goto L_0x01bf
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r3 = A00(r1, r8)
            java.lang.String r1 = "is_linear_space"
            r3.A02(r1, r0)
        L_0x0165:
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r5.A0F
            r2 = 5
            r0.EWj(r3, r2)
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r0 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r0 = r0.A02
            android.util.SparseArray r1 = r0.A02
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r11, r10)
            r1.put(r2, r0)
        L_0x0179:
            com.instagram.creation.base.CropInfo r2 = r5.A0A
            if (r2 == 0) goto L_0x01a2
            int r0 = r5.A05
            int r1 = r0 % 180
            android.graphics.Rect r0 = r2.A02
            if (r1 != 0) goto L_0x01b6
            int r1 = r0.width()
            int r0 = r0.height()
        L_0x018d:
            float r3 = (float) r1
            float r0 = (float) r0
            float r3 = r3 / r0
            int r0 = r5.A03
            float r2 = (float) r0
            int r0 = r5.A02
            float r1 = (float) r0
            float r0 = r2 / r1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01af
            int r0 = X.JTO.A05(r2, r3)
            r5.A02 = r0
        L_0x01a2:
            X.AR4 r3 = r5.A0E
            X.LDk r2 = r7.A02
            r1 = 1
            X.LaP r0 = new X.LaP
            r0.<init>(r2, r1)
            monitor-enter(r3)
            goto L_0x0283
        L_0x01af:
            int r0 = X.AnonymousClass7TE.A06(r1, r3)
            r5.A03 = r0
            goto L_0x01a2
        L_0x01b6:
            int r1 = r0.height()
            int r0 = r0.width()
            goto L_0x018d
        L_0x01bf:
            r0 = 1605(0x645, float:2.249E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x01d2
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r3 = A00(r0, r1)
            goto L_0x0165
        L_0x01d2:
            if (r15 == 0) goto L_0x01d9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r3 = X.C369408uY.A01(r6)
            goto L_0x0165
        L_0x01d9:
            if (r14 == 0) goto L_0x02c0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r3 = A00(r9, r3)
            goto L_0x0165
        L_0x01e0:
            if (r1 == 0) goto L_0x01f1
            if (r16 == 0) goto L_0x01f1
            if (r2 == 0) goto L_0x01ee
            r1 = 1865(0x749, float:2.613E-42)
        L_0x01e8:
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            goto L_0x012d
        L_0x01ee:
            r1 = 1342(0x53e, float:1.88E-42)
            goto L_0x01e8
        L_0x01f1:
            r1 = 1605(0x645, float:2.249E-42)
            goto L_0x01e8
        L_0x01f4:
            r17 = 0
            goto L_0x010e
        L_0x01f8:
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Resize input and output have different aspect ratios: input={"
            r2.append(r0)
            r2.append(r13)
            java.lang.String r1 = "}x"
            r2.append(r1)
            r2.append(r12)
            java.lang.String r0 = " output={"
            r2.append(r0)
            r2.append(r15)
            r2.append(r1)
            r2.append(r14)
            java.lang.String r0 = " resizeOutput={"
            r2.append(r0)
            r2.append(r10)
            r2.append(r1)
            r2.append(r8)
            java.lang.String r16 = r2.toString()
            X.0wj r2 = X.0wj.A01
            r1 = 817892527(0x30c00caf, float:1.3973444E-9)
            java.lang.String r11 = X.LS5.A01
            java.lang.String r0 = "_resize_"
            java.lang.String r0 = X.002.A0R(r11, r0)
            X.0f9 r2 = r2.AEf(r0, r1)
            java.lang.String r1 = "REEL"
            r0 = r17
            r2.ABQ(r0, r1)
            r0 = r16
            X.C51969G9p.A1K(r2, r0)
            goto L_0x00e5
        L_0x024b:
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0256
            float r8 = r8 / r1
            float r2 = r2 * r8
            r10 = r2
            r8 = 1159725056(0x45200000, float:2560.0)
            goto L_0x00d6
        L_0x0256:
            r10 = r2
            goto L_0x00d5
        L_0x0259:
            int r13 = r4.getHeight()
            int r12 = r4.getWidth()
            goto L_0x008b
        L_0x0263:
            int r13 = r4.getHeight()
            goto L_0x0070
        L_0x0269:
            r1 = 0
            goto L_0x0048
        L_0x026c:
            com.instagram.common.session.UserSession r2 = r5.A09
            java.lang.Integer r1 = r5.A0G
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0275
            r6 = 0
        L_0x0275:
            android.graphics.Point r1 = X.LS5.A01(r11, r2, r6)
            int r0 = r1.x
            r5.A03 = r0
            int r0 = r1.y
            r5.A02 = r0
            goto L_0x0179
        L_0x0283:
            r3.A00 = r0     // Catch:{ all -> 0x02bd }
            monitor-exit(r3)
            boolean r0 = r5.A0M
            if (r0 == 0) goto L_0x02a5
            X.8qj r0 = r4.B8o()
            if (r0 != 0) goto L_0x02a5
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r1 = r5.A0F
            r0 = 28
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r1 = r1.B5u(r0)
            if (r1 == 0) goto L_0x02a5
            boolean r0 = r1 instanceof com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter
            if (r0 == 0) goto L_0x02a5
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter r1 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter) r1
            r0 = r18
            r1.A01(r0)
        L_0x02a5:
            int r1 = r5.A03
            int r0 = r5.A02
            X.8mL r7 = r7.A00
            X.Lba r6 = new X.Lba
            r8 = r19
            r9 = r2
            r10 = r5
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            r8 = r5
            r9 = r4
            r10 = r1
            r11 = r0
            X.C64149LQm.A01(r6, r7, r8, r9, r10, r11)
            return
        L_0x02bd:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x02c0:
            java.lang.String r0 = "Unsupported filter: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r2)
            throw r0
        L_0x02c7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x02cc }
            throw r0     // Catch:{ Exception -> 0x02cc }
        L_0x02cc:
            r1 = move-exception
            X.LDk r0 = r7.A02
            r0.A00(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MAO.run():void");
    }
}
