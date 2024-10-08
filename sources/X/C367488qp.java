package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluConfigHolder;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.basic.NativeConfigFactory;
import com.facebook.onecamera.components.mediagraph.iglu.nativegraph.IgluFilterNativeGraph;
import com.instagram.iglu.debug.DebugFilterIO;
import java.util.List;

/* renamed from: X.8qp  reason: invalid class name and case insensitive filesystem */
public final class C367488qp extends C361198fp {
    public FilterManagerImpl A00;
    public IgluFilterNativeGraph A01;
    public C40146ATm A02;
    public C40146ATm A03;
    public C365278mp A04;
    public final C366028o4 A05;
    public final C365998o1 A06;
    public final C367498qq A07 = new C367498qq();
    public final C345047sq A08 = new C345047sq();
    public final boolean A09;
    public final boolean A0A;

    public C367488qp(C366028o4 r2, C365998o1 r3, boolean z, boolean z2, boolean z3) {
        super((C344407ro) null);
        this.A06 = r3;
        this.A05 = r2;
        this.A0A = z2;
        this.A09 = z3;
        if (z) {
            DebugFilterIO.setDebugFilterIOEnabled(true);
        }
    }

    private synchronized void A00() {
        if (this.A01 == null || this.A00 == null) {
            C365998o1 r0 = this.A06;
            IgluConfigHolder createIgAssetConfig = NativeConfigFactory.createIgAssetConfig(r0.A00, r0.A01);
            0qQ.A07(createIgAssetConfig);
            IgluFilterNativeGraph igluFilterNativeGraph = new IgluFilterNativeGraph();
            this.A01 = igluFilterNativeGraph;
            igluFilterNativeGraph.attach(createIgAssetConfig);
            C366028o4 r2 = this.A05;
            if (r2 != null) {
                r2.attach(createIgAssetConfig);
            }
            this.A00 = new FilterManagerImpl(r2, (C40136ATc) null);
            createIgAssetConfig.release();
        }
    }

    public final synchronized C345137sz A03(C366548pF r15, C345137sz r16, C345097sv r17, C345057sr r18, C344697sH r19, Long l, List list, int i, int i2, boolean z, boolean z2) {
        synchronized (this) {
            C345137sz r3 = r16;
            if (!A02()) {
                return r16;
            }
            try {
                C349257zq.A03("IgluFilterMediaGraphRenderer.render");
                boolean z3 = false;
                C345097sv r4 = r17;
                if (r17 != null) {
                    z3 = true;
                }
                C345137sz A042 = A04(r15, r3, r4, r18, r19, l, list, i, i2, z, z2, z3);
                return A042;
            } finally {
                C349257zq.A01();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0047, code lost:
        if (r2 == null) goto L_0x0049;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0061 A[Catch:{ all -> 0x006d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A05(X.C366548pF r20, X.C345057sr r21, X.C344697sH r22, java.lang.Long r23, java.util.List r24, int r25, int r26, int r27, boolean r28, boolean r29) {
        /*
            r19 = this;
            r6 = r19
            r11 = r22
            monitor-enter(r6)
            boolean r0 = r6.A02()     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = "IgluFilterMediaGraphRenderer.render"
            X.C349257zq.A03(r0)     // Catch:{ all -> 0x006d }
            r0 = r27
            java.lang.Object r8 = r11.BHP(r0)     // Catch:{ all -> 0x006d }
            X.7sz r8 = (X.C345137sz) r8     // Catch:{ all -> 0x006d }
            r9 = 0
            boolean r0 = r6.A0A     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x0049
            r5 = 0
            java.util.List r4 = r11.B9R(r5)     // Catch:{ all -> 0x006d }
            monitor-enter(r4)     // Catch:{ all -> 0x006d }
            int r3 = r4.size()     // Catch:{ all -> 0x0041 }
            r2 = r9
        L_0x0028:
            if (r5 >= r3) goto L_0x003f
            java.lang.Object r1 = r4.get(r5)     // Catch:{ all -> 0x0041 }
            X.7sv r1 = (X.C345097sv) r1     // Catch:{ all -> 0x0041 }
            boolean r0 = r1.CSb(r8)     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x003a
            if (r2 == 0) goto L_0x0039
            goto L_0x003d
        L_0x0039:
            r2 = r1
        L_0x003a:
            int r5 = r5 + 1
            goto L_0x0028
        L_0x003d:
            monitor-exit(r4)     // Catch:{ all -> 0x0041 }
            goto L_0x0049
        L_0x003f:
            monitor-exit(r4)     // Catch:{ all -> 0x0041 }
            goto L_0x0044
        L_0x0041:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0041 }
            throw r0     // Catch:{ all -> 0x006d }
        L_0x0044:
            r9 = r2
            r18 = 1
            if (r2 != 0) goto L_0x004b
        L_0x0049:
            r18 = 0
        L_0x004b:
            r7 = r20
            r10 = r21
            r12 = r23
            r13 = r24
            r14 = r25
            r15 = r26
            r16 = r28
            r17 = r29
            X.7sz r2 = r6.A04(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x006d }
            if (r18 != 0) goto L_0x0069
            X.7sG r11 = (X.C344687sG) r11     // Catch:{ all -> 0x006d }
            X.7sJ r1 = r11.A07     // Catch:{ all -> 0x006d }
            r0 = 0
            r1.A01(r2, r0)     // Catch:{ all -> 0x006d }
        L_0x0069:
            X.C349257zq.A01()     // Catch:{ all -> 0x0074 }
            goto L_0x0072
        L_0x006d:
            r0 = move-exception
            X.C349257zq.A01()     // Catch:{ all -> 0x0074 }
            throw r0     // Catch:{ all -> 0x0074 }
        L_0x0072:
            monitor-exit(r6)
            return
        L_0x0074:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C367488qp.A05(X.8pF, X.7sr, X.7sH, java.lang.Long, java.util.List, int, int, int, boolean, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v73, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v74, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v81, resolved type: X.8qr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v82, resolved type: X.8qr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v85, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v86, resolved type: X.8qr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v87, resolved type: X.8qr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v88, resolved type: X.8qr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v89, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v15, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluIODescriptor, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v10, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluIODescriptor, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v76 */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x069e, code lost:
        return r48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x011d, code lost:
        r10 = r10;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0454 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0467  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04a5  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0536 A[SYNTHETIC, Splitter:B:242:0x0536] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x022c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized X.C345137sz A04(X.C366548pF r47, X.C345137sz r48, X.C345097sv r49, X.C345057sr r50, X.C344697sH r51, java.lang.Long r52, java.util.List r53, int r54, int r55, boolean r56, boolean r57, boolean r58) {
        /*
            r46 = this;
            r3 = r46
            r1 = r55
            r2 = r54
            r5 = r47
            r16 = r3
            monitor-enter(r16)
            if (r53 == 0) goto L_0x0023
            java.util.Iterator r4 = r53.iterator()     // Catch:{ all -> 0x069f }
        L_0x0011:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x069f }
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x069f }
            X.8oA r0 = (X.C366088oA) r0     // Catch:{ all -> 0x069f }
            r6 = r52
            r0.FK1(r6)     // Catch:{ all -> 0x069f }
            goto L_0x0011
        L_0x0023:
            r45 = r51
            if (r47 != 0) goto L_0x0031
            r4 = 1011(0x3f3, float:1.417E-42)
            r0 = r45
            java.lang.Object r5 = r0.BHP(r4)     // Catch:{ all -> 0x069f }
            X.8pF r5 = (X.C366548pF) r5     // Catch:{ all -> 0x069f }
        L_0x0031:
            r17 = r48
            X.7v0 r28 = r17.getTexture()     // Catch:{ all -> 0x069f }
            X.7ss r7 = r17.CFP()     // Catch:{ all -> 0x069f }
            if (r28 == 0) goto L_0x069d
            if (r7 == 0) goto L_0x069d
            r27 = -1
            r0 = r27
            if (r2 == r0) goto L_0x0695
            if (r1 == r0) goto L_0x0695
            if (r54 == 0) goto L_0x0683
            if (r55 == 0) goto L_0x0683
            r23 = r49
            r8 = r50
            if (r58 == 0) goto L_0x0092
            if (r49 == 0) goto L_0x069d
            if (r50 == 0) goto L_0x005e
            r4 = r23
            r0 = r17
            X.7ss r9 = r4.FL1(r0, r8)     // Catch:{ all -> 0x069f }
            goto L_0x0066
        L_0x005e:
            r4 = r23
            r0 = r17
            X.7ss r9 = r4.FL0(r0)     // Catch:{ all -> 0x069f }
        L_0x0066:
            if (r9 == 0) goto L_0x069d
            boolean r0 = r3.A09     // Catch:{ all -> 0x069f }
            if (r0 == 0) goto L_0x00b8
            int r2 = r9.A01     // Catch:{ all -> 0x069f }
            int r1 = r9.A00     // Catch:{ all -> 0x069f }
            if (r50 == 0) goto L_0x0078
            X.8qq r6 = r3.A07     // Catch:{ all -> 0x069f }
            r6.A00(r8, r7, r2, r1)     // Catch:{ all -> 0x069f }
            goto L_0x00b3
        L_0x0078:
            X.8qq r6 = r3.A07     // Catch:{ all -> 0x069f }
            X.7st r8 = r6.A00     // Catch:{ all -> 0x069f }
            int r4 = r7.A01     // Catch:{ all -> 0x069f }
            int r0 = r7.A00     // Catch:{ all -> 0x069f }
            r13 = 0
            r9 = r4
            r10 = r0
            r11 = r2
            r12 = r1
            r14 = r13
            r15 = r13
            r8.A09(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x069f }
            X.7ss r0 = r8.A08()     // Catch:{ all -> 0x069f }
            r6.A01(r7, r0)     // Catch:{ all -> 0x069f }
            goto L_0x00b3
        L_0x0092:
            if (r50 == 0) goto L_0x009a
            X.8qq r6 = r3.A07     // Catch:{ all -> 0x069f }
            r6.A00(r8, r7, r2, r1)     // Catch:{ all -> 0x069f }
            goto L_0x00b3
        L_0x009a:
            X.8qq r6 = r3.A07     // Catch:{ all -> 0x069f }
            X.7st r8 = r6.A00     // Catch:{ all -> 0x069f }
            int r4 = r7.A01     // Catch:{ all -> 0x069f }
            int r0 = r7.A00     // Catch:{ all -> 0x069f }
            r13 = 0
            r9 = r4
            r10 = r0
            r11 = r2
            r12 = r1
            r14 = r13
            r15 = r13
            r8.A09(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x069f }
            X.7ss r0 = r8.A08()     // Catch:{ all -> 0x069f }
            r6.A01(r7, r0)     // Catch:{ all -> 0x069f }
        L_0x00b3:
            r26 = r1
            r44 = r2
            goto L_0x00c6
        L_0x00b8:
            X.8qq r6 = r3.A07     // Catch:{ all -> 0x069f }
            r6.A01(r7, r9)     // Catch:{ all -> 0x069f }
            int r4 = r9.A01     // Catch:{ all -> 0x069f }
            int r0 = r9.A00     // Catch:{ all -> 0x069f }
            r26 = r0
            r44 = r2
            r2 = r4
        L_0x00c6:
            X.8mp r8 = r3.A04     // Catch:{ all -> 0x069f }
            r0 = 0
            if (r8 == 0) goto L_0x03f2
            int r10 = r7.A01     // Catch:{ all -> 0x069f }
            int r4 = r7.A00     // Catch:{ all -> 0x069f }
            X.8qr r9 = new X.8qr     // Catch:{ all -> 0x069f }
            r9.<init>(r10, r4)     // Catch:{ all -> 0x069f }
            X.8qr r7 = new X.8qr     // Catch:{ all -> 0x069f }
            r4 = r26
            r7.<init>(r2, r4)     // Catch:{ all -> 0x069f }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r4 = r5.B5t()     // Catch:{ all -> 0x069f }
            boolean r10 = r4 instanceof com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain     // Catch:{ all -> 0x069f }
            if (r10 == 0) goto L_0x03f2
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r4 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain) r4     // Catch:{ all -> 0x069f }
            r25 = 1
            java.lang.String r24 = "filterChain"
            r10 = 2
            X.0qQ.A0B(r4, r10)     // Catch:{ all -> 0x069f }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r10 = r4.A03     // Catch:{ all -> 0x069f }
            r43 = r10
            java.lang.Integer r10 = X.C366708pX.A00(r4)     // Catch:{ all -> 0x069f }
            if (r10 == 0) goto L_0x03f2
            int r15 = r10.intValue()     // Catch:{ all -> 0x069f }
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r10 = r8.A01     // Catch:{ all -> 0x069f }
            if (r10 != 0) goto L_0x018c
            r20 = r9
            android.util.SparseArray r14 = r4.A01     // Catch:{ all -> 0x069f }
            java.lang.Object r11 = r14.get(r15)     // Catch:{ all -> 0x069f }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r11 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel) r11     // Catch:{ all -> 0x069f }
            r10 = 0
            if (r11 == 0) goto L_0x0669
            boolean r12 = r11.isEnabled()     // Catch:{ all -> 0x069f }
            if (r12 == 0) goto L_0x0669
            android.util.SparseArray r11 = r4.A02     // Catch:{ all -> 0x069f }
            r19 = r11
            r13 = 0
            int r18 = r14.size()     // Catch:{ all -> 0x069f }
            goto L_0x011f
        L_0x011c:
            r10 = r7
        L_0x011d:
            int r13 = r13 + 1
        L_0x011f:
            r11 = r18
            if (r13 >= r11) goto L_0x0150
            int r12 = r14.keyAt(r13)     // Catch:{ all -> 0x069f }
            if (r12 > r15) goto L_0x0150
            java.lang.Object r11 = r14.get(r12)     // Catch:{ all -> 0x069f }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r11 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel) r11     // Catch:{ all -> 0x069f }
            if (r11 == 0) goto L_0x011d
            boolean r11 = r11.isEnabled()     // Catch:{ all -> 0x069f }
            if (r11 == 0) goto L_0x011d
            if (r10 == 0) goto L_0x013b
            r20 = r10
        L_0x013b:
            r10 = r19
            java.lang.Object r11 = r10.get(r12)     // Catch:{ all -> 0x069f }
            android.graphics.Point r11 = (android.graphics.Point) r11     // Catch:{ all -> 0x069f }
            if (r11 != 0) goto L_0x0146
            goto L_0x011c
        L_0x0146:
            X.8qr r10 = new X.8qr     // Catch:{ all -> 0x069f }
            int r12 = r11.x     // Catch:{ all -> 0x069f }
            int r11 = r11.y     // Catch:{ all -> 0x069f }
            r10.<init>(r12, r11)     // Catch:{ all -> 0x069f }
            goto L_0x011d
        L_0x0150:
            r10 = r20
            int r14 = r10.A01     // Catch:{ all -> 0x069f }
            int r13 = r10.A00     // Catch:{ all -> 0x069f }
            int r12 = r7.A01     // Catch:{ all -> 0x069f }
            int r10 = r7.A00     // Catch:{ all -> 0x069f }
            r33 = 1065353216(0x3f800000, float:1.0)
            r34 = 0
            java.lang.Integer r31 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x069f }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r30 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams     // Catch:{ all -> 0x069f }
            r32 = r31
            r35 = r34
            r36 = r34
            r37 = r0
            r30.<init>(r31, r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x069f }
            java.lang.String r31 = "TransformMatrixUpdater"
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r11 = new com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig     // Catch:{ all -> 0x069f }
            r29 = r11
            r32 = r14
            r33 = r13
            r34 = r0
            r35 = r12
            r36 = r10
            r38 = r0
            r39 = r25
            r40 = r0
            r41 = r25
            r42 = r0
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x069f }
            r8.A01 = r11     // Catch:{ all -> 0x069f }
        L_0x018c:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r11 = r8.A00     // Catch:{ all -> 0x069f }
            if (r11 == 0) goto L_0x019a
            r10 = r43
            boolean r10 = r11.equals(r10)     // Catch:{ all -> 0x069f }
            r10 = r10 ^ 1
            if (r10 == 0) goto L_0x03f2
        L_0x019a:
            java.lang.Integer r10 = X.C366708pX.A00(r4)     // Catch:{ all -> 0x069f }
            if (r10 == 0) goto L_0x01f5
            int r11 = r10.intValue()     // Catch:{ all -> 0x069f }
            android.util.SparseArray r10 = r4.A01     // Catch:{ all -> 0x069f }
            java.lang.Object r10 = r10.get(r11)     // Catch:{ all -> 0x069f }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r10 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel) r10     // Catch:{ all -> 0x069f }
            if (r10 == 0) goto L_0x03e9
            float[] r11 = r10.getTextureTransform()     // Catch:{ all -> 0x069f }
            int r10 = r11.length     // Catch:{ all -> 0x069f }
            float[] r12 = java.util.Arrays.copyOf(r11, r10)     // Catch:{ all -> 0x069f }
            X.0qQ.A07(r12)     // Catch:{ all -> 0x069f }
        L_0x01ba:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r11 = r8.A00     // Catch:{ all -> 0x069f }
            if (r11 == 0) goto L_0x01f2
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r22 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams     // Catch:{ all -> 0x069f }
            r10 = r22
            r10.<init>(r11)     // Catch:{ all -> 0x069f }
        L_0x01c5:
            r20 = 0
            java.lang.String r21 = ""
            if (r12 == 0) goto L_0x020e
            com.instagram.common.session.UserSession r14 = r8.A03     // Catch:{ all -> 0x069f }
            X.0Tu r13 = X.0Tu.A05     // Catch:{ all -> 0x069f }
            r10 = 36319476111515064(0x81085f000e1db8, double:3.031921167489288E-306)
            boolean r10 = X.182.A06(r13, r14, r10)     // Catch:{ all -> 0x069f }
            if (r10 == 0) goto L_0x020e
            r10 = 5
            r14 = r12[r10]     // Catch:{ all -> 0x069f }
            int r10 = r9.A01     // Catch:{ all -> 0x069f }
            float r13 = (float) r10     // Catch:{ all -> 0x069f }
            int r10 = r9.A00     // Catch:{ all -> 0x069f }
            float r10 = (float) r10     // Catch:{ all -> 0x069f }
            float r13 = r13 / r10
            int r10 = r7.A01     // Catch:{ all -> 0x069f }
            float r11 = (float) r10     // Catch:{ all -> 0x069f }
            int r10 = r7.A00     // Catch:{ all -> 0x069f }
            float r10 = (float) r10     // Catch:{ all -> 0x069f }
            float r11 = r11 / r10
            boolean r10 = r43.A01()     // Catch:{ all -> 0x069f }
            if (r10 == 0) goto L_0x0211
            goto L_0x01f7
        L_0x01f2:
            r22 = 0
            goto L_0x01c5
        L_0x01f5:
            r12 = 0
            goto L_0x01ba
        L_0x01f7:
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x0211
            float r13 = r13 / r11
            float r14 = r14 - r13
            float r10 = java.lang.Math.abs(r14)     // Catch:{ all -> 0x069f }
            double r10 = (double) r10     // Catch:{ all -> 0x069f }
            r14 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r13 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x0211
            r20 = 1
            goto L_0x0211
        L_0x020e:
            r11 = r21
            goto L_0x0219
        L_0x0211:
            java.lang.String r11 = "aspectRatio"
            r10 = r21
            java.lang.String r11 = X.002.A0R(r10, r11)     // Catch:{ all -> 0x069f }
        L_0x0219:
            com.instagram.common.session.UserSession r10 = r8.A03     // Catch:{ all -> 0x069f }
            r29 = r10
            X.0Tu r19 = X.0Tu.A05     // Catch:{ all -> 0x069f }
            r14 = 36319476111449527(0x81085f000d1db7, double:3.031921167447842E-306)
            r13 = r19
            boolean r10 = X.182.A06(r13, r10, r14)     // Catch:{ all -> 0x069f }
            if (r10 == 0) goto L_0x0240
            int r13 = r7.A01     // Catch:{ all -> 0x069f }
            r10 = 480(0x1e0, float:6.73E-43)
            if (r13 != r10) goto L_0x023a
            int r13 = r7.A00     // Catch:{ all -> 0x069f }
            r10 = 864(0x360, float:1.211E-42)
            if (r13 != r10) goto L_0x023a
            r20 = 1
        L_0x023a:
            java.lang.String r10 = "480x864"
            java.lang.String r11 = X.002.A0R(r11, r10)     // Catch:{ all -> 0x069f }
        L_0x0240:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r13 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams     // Catch:{ all -> 0x069f }
            r10 = r43
            r13.<init>(r10)     // Catch:{ all -> 0x069f }
            r8.A00 = r13     // Catch:{ all -> 0x069f }
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r10 = r8.A01     // Catch:{ all -> 0x069f }
            java.lang.String r18 = "transformMatrixConfig"
            if (r10 == 0) goto L_0x03e0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r13 = r10.A08     // Catch:{ all -> 0x069f }
            r10 = r43
            r13.A00(r10)     // Catch:{ all -> 0x069f }
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r10 = r8.A01     // Catch:{ all -> 0x069f }
            if (r10 == 0) goto L_0x03e0
            r10.A03()     // Catch:{ all -> 0x069f }
            if (r20 != 0) goto L_0x026a
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r10 = r8.A01     // Catch:{ all -> 0x069f }
            if (r10 == 0) goto L_0x03e0
            float[] r10 = r10.C5o()     // Catch:{ all -> 0x069f }
            X.C366708pX.A02(r4, r10)     // Catch:{ all -> 0x069f }
        L_0x026a:
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r10 = r8.A01     // Catch:{ all -> 0x069f }
            if (r10 == 0) goto L_0x03e0
            float[] r13 = r10.C5o()     // Catch:{ all -> 0x069f }
            boolean r10 = r8.A02     // Catch:{ all -> 0x069f }
            if (r10 != 0) goto L_0x03f2
            if (r12 == 0) goto L_0x03f2
            boolean r10 = java.util.Arrays.equals(r12, r13)     // Catch:{ all -> 0x069f }
            if (r10 != 0) goto L_0x03f2
            boolean r15 = X.C366708pX.A03(r12, r13)     // Catch:{ all -> 0x069f }
            X.1QJ r10 = X.AnonymousClass1QI.A00     // Catch:{ all -> 0x069f }
            X.1QM r10 = r10.A02     // Catch:{ all -> 0x069f }
            java.lang.String r10 = r10.A00     // Catch:{ all -> 0x069f }
            r20 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x069f }
            r10.<init>()     // Catch:{ all -> 0x069f }
            java.lang.String r14 = "TransformMatrixEncapsulationM1 mpInputWidth: "
            r10.append(r14)     // Catch:{ all -> 0x069f }
            int r14 = r9.A01     // Catch:{ all -> 0x069f }
            r10.append(r14)     // Catch:{ all -> 0x069f }
            java.lang.String r14 = "\nmpInputHeight: "
            r10.append(r14)     // Catch:{ all -> 0x069f }
            int r9 = r9.A00     // Catch:{ all -> 0x069f }
            r10.append(r9)     // Catch:{ all -> 0x069f }
            java.lang.String r9 = "\nmpOutputWidth: "
            r10.append(r9)     // Catch:{ all -> 0x069f }
            int r9 = r7.A01     // Catch:{ all -> 0x069f }
            r10.append(r9)     // Catch:{ all -> 0x069f }
            java.lang.String r9 = "\nmpOutputHeight: "
            r10.append(r9)     // Catch:{ all -> 0x069f }
            int r7 = r7.A00     // Catch:{ all -> 0x069f }
            r10.append(r7)     // Catch:{ all -> 0x069f }
            java.lang.String r7 = "\nfilterInputWidth: "
            r10.append(r7)     // Catch:{ all -> 0x069f }
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r9 = r8.A01     // Catch:{ all -> 0x069f }
            if (r9 == 0) goto L_0x03e0
            int r7 = r9.A05     // Catch:{ all -> 0x069f }
            r10.append(r7)     // Catch:{ all -> 0x069f }
            java.lang.String r7 = "\nfilterInputHeight: "
            r10.append(r7)     // Catch:{ all -> 0x069f }
            int r7 = r9.A03     // Catch:{ all -> 0x069f }
            r10.append(r7)     // Catch:{ all -> 0x069f }
            java.lang.String r7 = "\nlegacyTransformMatrix: "
            r10.append(r7)     // Catch:{ all -> 0x069f }
            java.lang.String r7 = java.util.Arrays.toString(r12)     // Catch:{ all -> 0x069f }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x069f }
            r10.append(r7)     // Catch:{ all -> 0x069f }
            java.lang.String r7 = "\nnewTransformMatrix: "
            r10.append(r7)     // Catch:{ all -> 0x069f }
            java.lang.String r7 = java.util.Arrays.toString(r13)     // Catch:{ all -> 0x069f }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x069f }
            r10.append(r7)     // Catch:{ all -> 0x069f }
            java.lang.String r7 = "\nprevious transform matrix params: "
            r10.append(r7)     // Catch:{ all -> 0x069f }
            r7 = r22
            r10.append(r7)     // Catch:{ all -> 0x069f }
            java.lang.String r7 = "\nupdated transform matrix params: "
            r10.append(r7)     // Catch:{ all -> 0x069f }
            r7 = r43
            r10.append(r7)     // Catch:{ all -> 0x069f }
            r7 = 10
            r10.append(r7)     // Catch:{ all -> 0x069f }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x069f }
            X.0wj r12 = X.0wj.A01     // Catch:{ all -> 0x069f }
            r10 = 817897553(0x30c02051, float:1.3979023E-9)
            java.lang.String r7 = "TransformMatrixUpdaterImpl"
            X.0f9 r13 = r12.AEf(r7, r10)     // Catch:{ all -> 0x069f }
            if (r15 == 0) goto L_0x0359
            java.lang.String r10 = "true"
        L_0x0319:
            java.lang.String r7 = "error_01_percent"
            r13.ABQ(r7, r10)     // Catch:{ all -> 0x069f }
            java.lang.String r10 = r8.A04     // Catch:{ all -> 0x069f }
            java.lang.String r7 = "igluPostCapGraphCreator"
            r13.ABQ(r7, r10)     // Catch:{ all -> 0x069f }
            java.lang.String r10 = "navChain"
            r7 = r20
            r13.ABQ(r10, r7)     // Catch:{ all -> 0x069f }
            r7 = r21
            boolean r7 = X.0qQ.A0K(r11, r7)     // Catch:{ all -> 0x069f }
            if (r7 == 0) goto L_0x0336
            java.lang.String r11 = "default"
        L_0x0336:
            java.lang.String r7 = "skipsEnabled"
            r13.ABQ(r7, r11)     // Catch:{ all -> 0x069f }
            java.lang.String r7 = "debugMessage"
            r13.ABQ(r7, r9)     // Catch:{ all -> 0x069f }
            r9 = 36319476111121842(0x81085f00081db2, double:3.0319211672406126E-306)
            r11 = r19
            r7 = r29
            boolean r7 = X.182.A06(r11, r7, r9)     // Catch:{ all -> 0x069f }
            if (r7 == 0) goto L_0x03d8
            android.util.SparseArray r15 = r4.A01     // Catch:{ all -> 0x069f }
            int r18 = r15.size()     // Catch:{ all -> 0x069f }
            java.lang.String r12 = "FilterChain:\n"
            r11 = 0
            goto L_0x035c
        L_0x0359:
            java.lang.String r10 = "false"
            goto L_0x0319
        L_0x035c:
            r7 = r18
            if (r11 >= r7) goto L_0x03d3
            int r10 = r15.keyAt(r11)     // Catch:{ all -> 0x069f }
            java.lang.Object r14 = r15.get(r10)     // Catch:{ all -> 0x069f }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r14 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel) r14     // Catch:{ all -> 0x069f }
            android.util.SparseArray r7 = r4.A02     // Catch:{ all -> 0x069f }
            java.lang.Object r9 = r7.get(r10)     // Catch:{ all -> 0x069f }
            android.graphics.Point r9 = (android.graphics.Point) r9     // Catch:{ all -> 0x069f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x069f }
            r7.<init>()     // Catch:{ all -> 0x069f }
            r7.append(r12)     // Catch:{ all -> 0x069f }
            r7.append(r10)     // Catch:{ all -> 0x069f }
            java.lang.String r10 = " : "
            r7.append(r10)     // Catch:{ all -> 0x069f }
            java.lang.String r10 = r14.getFilterName()     // Catch:{ all -> 0x069f }
            r7.append(r10)     // Catch:{ all -> 0x069f }
            r10 = 60
            r7.append(r10)     // Catch:{ all -> 0x069f }
            boolean r10 = r14.isEnabled()     // Catch:{ all -> 0x069f }
            if (r10 == 0) goto L_0x03b1
            java.lang.String r10 = "enabled"
        L_0x0396:
            r7.append(r10)     // Catch:{ all -> 0x069f }
            java.lang.String r10 = "> default transform<"
            r7.append(r10)     // Catch:{ all -> 0x069f }
            float[] r12 = r14.getTextureTransform()     // Catch:{ all -> 0x069f }
            float[] r10 = X.C366498p3.A01     // Catch:{ all -> 0x069f }
            boolean r10 = java.util.Arrays.equals(r12, r10)     // Catch:{ all -> 0x069f }
            r7.append(r10)     // Catch:{ all -> 0x069f }
            java.lang.String r10 = "> outputSize<"
            r7.append(r10)     // Catch:{ all -> 0x069f }
            goto L_0x03b4
        L_0x03b1:
            java.lang.String r10 = "disabled"
            goto L_0x0396
        L_0x03b4:
            if (r9 == 0) goto L_0x03b7
            goto L_0x03ba
        L_0x03b7:
            r9 = r21
            goto L_0x03c4
        L_0x03ba:
            int r12 = r9.x     // Catch:{ all -> 0x069f }
            r10 = 120(0x78, float:1.68E-43)
            int r9 = r9.y     // Catch:{ all -> 0x069f }
            java.lang.String r9 = X.002.A01(r10, r12, r9)     // Catch:{ all -> 0x069f }
        L_0x03c4:
            r7.append(r9)     // Catch:{ all -> 0x069f }
            java.lang.String r9 = ">\n"
            r7.append(r9)     // Catch:{ all -> 0x069f }
            java.lang.String r12 = r7.toString()     // Catch:{ all -> 0x069f }
            int r11 = r11 + 1
            goto L_0x035c
        L_0x03d3:
            r4 = r24
            r13.ABQ(r4, r12)     // Catch:{ all -> 0x069f }
        L_0x03d8:
            r13.report()     // Catch:{ all -> 0x069f }
            r4 = r25
            r8.A02 = r4     // Catch:{ all -> 0x069f }
            goto L_0x03f2
        L_0x03e0:
            X.0qQ.A0F(r18)     // Catch:{ all -> 0x069f }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x0682
        L_0x03e9:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x069f }
            r0.<init>(r1)     // Catch:{ all -> 0x069f }
            goto L_0x0682
        L_0x03f2:
            r3.A00()     // Catch:{ all -> 0x0667 }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl r7 = r3.A00     // Catch:{ all -> 0x0667 }
            r7.getClass()     // Catch:{ all -> 0x0667 }
            r5.AC0(r7)     // Catch:{ all -> 0x069f }
            r5.ACC(r7)     // Catch:{ all -> 0x069f }
            float[] r8 = r6.A02     // Catch:{ all -> 0x069f }
            float[] r4 = r6.A01     // Catch:{ all -> 0x069f }
            r5.ACB(r7, r8, r4)     // Catch:{ all -> 0x069f }
            r6 = 1012(0x3f4, float:1.418E-42)
            r4 = r45
            boolean r4 = r4.CVW(r6)     // Catch:{ all -> 0x069f }
            if (r4 == 0) goto L_0x0424
            r4 = r45
            java.lang.Object r4 = r4.BHP(r6)     // Catch:{ all -> 0x069f }
            X.7sz r4 = (X.C345137sz) r4     // Catch:{ all -> 0x069f }
            X.7v0 r6 = r4.getTexture()     // Catch:{ all -> 0x069f }
            if (r6 == 0) goto L_0x0424
            java.lang.String r4 = "dual"
            r5.ABv(r7, r6, r4)     // Catch:{ all -> 0x069f }
        L_0x0424:
            r3.A00()     // Catch:{ all -> 0x0667 }
            com.facebook.onecamera.components.mediagraph.iglu.nativegraph.IgluFilterNativeGraph r4 = r3.A01     // Catch:{ all -> 0x0667 }
            r4.getClass()     // Catch:{ all -> 0x0667 }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterWeakPtr r5 = r7.getFilterWeakPtr()     // Catch:{ all -> 0x069f }
            r4.updateFilter(r5)     // Catch:{ all -> 0x069f }
            X.8rB r5 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluIODescriptor.Companion     // Catch:{ all -> 0x069f }
            r5 = r28
            int r7 = r5.A00     // Catch:{ all -> 0x069f }
            int r8 = r5.A01     // Catch:{ all -> 0x069f }
            X.7v3 r5 = r5.A02     // Catch:{ all -> 0x069f }
            int r9 = r5.A01     // Catch:{ all -> 0x069f }
            int r6 = r5.A00     // Catch:{ all -> 0x069f }
            int r10 = r17.Ap3()     // Catch:{ all -> 0x069f }
            r5 = 36197(0x8d65, float:5.0723E-41)
            if (r8 == r5) goto L_0x0454
            java.lang.Integer r5 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x069f }
        L_0x044c:
            int r5 = r5.intValue()     // Catch:{ all -> 0x069f }
            switch(r5) {
                case 0: goto L_0x0467;
                case 1: goto L_0x046b;
                case 2: goto L_0x0469;
                default: goto L_0x0453;
            }     // Catch:{ all -> 0x069f }
        L_0x0453:
            goto L_0x046d
        L_0x0454:
            if (r57 == 0) goto L_0x0464
            r5 = r27
            if (r10 == r5) goto L_0x0464
            r5 = 6
            if (r10 == r5) goto L_0x0461
            r5 = 7
            if (r10 == r5) goto L_0x0461
            goto L_0x0464
        L_0x0461:
            java.lang.Integer r5 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x069f }
            goto L_0x044c
        L_0x0464:
            java.lang.Integer r5 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x069f }
            goto L_0x044c
        L_0x0467:
            r11 = 0
            goto L_0x046e
        L_0x0469:
            r11 = 2
            goto L_0x046e
        L_0x046b:
            r11 = 1
            goto L_0x046e
        L_0x046d:
            r11 = 3
        L_0x046e:
            if (r57 == 0) goto L_0x0481
            r5 = r27
            if (r10 == r5) goto L_0x047e
            r5 = 6
            if (r10 == r5) goto L_0x047b
            r5 = 7
            if (r10 != r5) goto L_0x0481
            goto L_0x0484
        L_0x047b:
            java.lang.Integer r5 = X.AnonymousClass05K.A1I     // Catch:{ all -> 0x069f }
            goto L_0x0486
        L_0x047e:
            java.lang.Integer r5 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x069f }
            goto L_0x0486
        L_0x0481:
            java.lang.Integer r5 = X.AnonymousClass05K.A15     // Catch:{ all -> 0x069f }
            goto L_0x0486
        L_0x0484:
            java.lang.Integer r5 = X.AnonymousClass05K.A0B     // Catch:{ all -> 0x069f }
        L_0x0486:
            int r12 = X.C367568rC.A00(r5)     // Catch:{ all -> 0x069f }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluIODescriptor r5 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluIODescriptor     // Catch:{ all -> 0x069f }
            r5.<init>()     // Catch:{ all -> 0x069f }
            r10 = r6
            com.facebook.jni.HybridData r6 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluIODescriptor.initHybrid(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x069f }
            r5.mHybridData = r6     // Catch:{ all -> 0x069f }
            r4.setInputTexture(r5)     // Catch:{ all -> 0x069f }
            r5 = r56
            r4.setClearFramebuffer(r5)     // Catch:{ all -> 0x069f }
            int r10 = r17.Ap3()     // Catch:{ all -> 0x069f }
            if (r49 != 0) goto L_0x04a5
            goto L_0x04aa
        L_0x04a5:
            int r9 = r23.BZU()     // Catch:{ all -> 0x069f }
            goto L_0x04ab
        L_0x04aa:
            r9 = 0
        L_0x04ab:
            if (r57 != 0) goto L_0x04b0
            java.lang.Integer r5 = X.AnonymousClass05K.A06     // Catch:{ all -> 0x069f }
            goto L_0x04c7
        L_0x04b0:
            r8 = 3
            r6 = 7
            if (r10 != r6) goto L_0x04b7
            if (r9 != r8) goto L_0x04bf
            goto L_0x04c2
        L_0x04b7:
            r5 = 6
            if (r10 != r5) goto L_0x04c2
            if (r9 == r8) goto L_0x04c2
            if (r9 == r6) goto L_0x04bf
            goto L_0x04c5
        L_0x04bf:
            java.lang.Integer r5 = X.AnonymousClass05K.A0B     // Catch:{ all -> 0x069f }
            goto L_0x04c7
        L_0x04c2:
            java.lang.Integer r5 = X.AnonymousClass05K.A15     // Catch:{ all -> 0x069f }
            goto L_0x04c7
        L_0x04c5:
            java.lang.Integer r5 = X.AnonymousClass05K.A1I     // Catch:{ all -> 0x069f }
        L_0x04c7:
            int r6 = X.C367568rC.A00(r5)     // Catch:{ all -> 0x069f }
            if (r58 == 0) goto L_0x0536
            if (r49 == 0) goto L_0x069d
            java.lang.Object r10 = r23.BNo()     // Catch:{ all -> 0x069f }
            monitor-enter(r10)     // Catch:{ all -> 0x069f }
            java.lang.Exception r5 = r23.ClT()     // Catch:{ all -> 0x0532 }
            if (r5 == 0) goto L_0x04dd
            monitor-exit(r10)     // Catch:{ all -> 0x0532 }
            goto L_0x069d
        L_0x04dd:
            if (r2 <= 0) goto L_0x0503
            if (r26 <= 0) goto L_0x0503
            r5 = r44
            if (r2 != r5) goto L_0x04e9
            r5 = r26
            if (r5 == r1) goto L_0x0503
        L_0x04e9:
            r5 = r44
            float r9 = (float) r5     // Catch:{ all -> 0x0532 }
            float r1 = (float) r1     // Catch:{ all -> 0x0532 }
            float r9 = r9 / r1
            float r8 = (float) r2     // Catch:{ all -> 0x0532 }
            r1 = r26
            float r7 = (float) r1     // Catch:{ all -> 0x0532 }
            float r1 = r8 / r7
            r5 = 1073741824(0x40000000, float:2.0)
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0509
            float r7 = r7 * r9
            float r8 = r8 - r7
            float r8 = r8 / r5
            int r0 = java.lang.Math.round(r8)     // Catch:{ all -> 0x0532 }
            r5 = 0
            goto L_0x0510
        L_0x0503:
            r2 = r44
            android.opengl.GLES20.glViewport(r0, r0, r2, r1)     // Catch:{ all -> 0x0532 }
            goto L_0x051c
        L_0x0509:
            float r8 = r8 / r9
            float r7 = r7 - r8
            float r7 = r7 / r5
            int r5 = java.lang.Math.round(r7)     // Catch:{ all -> 0x0532 }
        L_0x0510:
            int r1 = r0 * 2
            int r2 = r2 - r1
            int r1 = r5 * 2
            int r26 = r26 - r1
            r1 = r26
            android.opengl.GLES20.glViewport(r0, r5, r2, r1)     // Catch:{ all -> 0x0532 }
        L_0x051c:
            r4.useCurrentOutputFramebuffer(r6)     // Catch:{ all -> 0x0532 }
            java.lang.String r0 = "IgluFilterMediaGraphRenderer"
            r4.render(r0)     // Catch:{ all -> 0x0532 }
            monitor-exit(r10)     // Catch:{ all -> 0x0532 }
            r23.swapBuffers()     // Catch:{ all -> 0x069f }
            X.7uG r0 = r3.A00     // Catch:{ all -> 0x069f }
            r0.getClass()     // Catch:{ all -> 0x069f }
            r0.makeCurrent()     // Catch:{ all -> 0x069f }
            goto L_0x069d
        L_0x0532:
            r1 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0532 }
            goto L_0x069c
        L_0x0536:
            X.7sq r5 = r3.A08     // Catch:{ all -> 0x069f }
            r8 = r5
            r9 = r44
            r10 = r1
            r11 = r9
            r12 = r1
            r13 = r0
            r14 = r0
            r15 = r0
            r8.A09(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x069f }
            X.ATm r2 = r3.A02     // Catch:{ all -> 0x0667 }
            if (r2 != 0) goto L_0x055e
            java.lang.String r7 = "iglufilter1"
            X.ATm r2 = new X.ATm     // Catch:{ all -> 0x0667 }
            r2.<init>(r7)     // Catch:{ all -> 0x0667 }
            r3.A02 = r2     // Catch:{ all -> 0x0667 }
            X.7s4 r2 = r3.A01     // Catch:{ all -> 0x0667 }
            r2.getClass()     // Catch:{ all -> 0x0667 }
            X.7uG r2 = r3.A00     // Catch:{ all -> 0x0667 }
            r2.getClass()     // Catch:{ all -> 0x0667 }
            X.ATm r7 = r3.A02     // Catch:{ all -> 0x0667 }
            goto L_0x0588
        L_0x055e:
            X.7v0 r2 = r2.A06     // Catch:{ all -> 0x0667 }
            r2.getClass()     // Catch:{ all -> 0x0667 }
            int r2 = r2.A00     // Catch:{ all -> 0x0667 }
            if (r2 != r7) goto L_0x0586
            X.ATm r2 = r3.A03     // Catch:{ all -> 0x0667 }
            if (r2 != 0) goto L_0x057e
            java.lang.String r7 = "iglufilter2"
            X.ATm r2 = new X.ATm     // Catch:{ all -> 0x0667 }
            r2.<init>(r7)     // Catch:{ all -> 0x0667 }
            r3.A03 = r2     // Catch:{ all -> 0x0667 }
            X.7s4 r2 = r3.A01     // Catch:{ all -> 0x0667 }
            r2.getClass()     // Catch:{ all -> 0x0667 }
            X.7uG r2 = r3.A00     // Catch:{ all -> 0x0667 }
            r2.getClass()     // Catch:{ all -> 0x0667 }
        L_0x057e:
            X.ATm r7 = r3.A02     // Catch:{ all -> 0x0667 }
            X.ATm r2 = r3.A03     // Catch:{ all -> 0x0667 }
            r3.A02 = r2     // Catch:{ all -> 0x0667 }
            r3.A03 = r7     // Catch:{ all -> 0x0667 }
        L_0x0586:
            X.ATm r7 = r3.A02     // Catch:{ all -> 0x0667 }
        L_0x0588:
            boolean r8 = r7.A09     // Catch:{ all -> 0x069f }
            X.7v0 r9 = r7.A06     // Catch:{ all -> 0x069f }
            if (r9 == 0) goto L_0x05aa
            int r3 = r7.A04     // Catch:{ all -> 0x069f }
            if (r3 != r11) goto L_0x05aa
            int r2 = r7.A02     // Catch:{ all -> 0x069f }
            if (r2 != r1) goto L_0x05aa
        L_0x0596:
            X.7v0 r1 = r7.A06     // Catch:{ all -> 0x069f }
            r1.getClass()     // Catch:{ all -> 0x069f }
            int r10 = r1.A00     // Catch:{ all -> 0x069f }
            int r9 = r1.A01     // Catch:{ all -> 0x069f }
            X.7v3 r1 = r1.A02     // Catch:{ all -> 0x069f }
            int r8 = r1.A01     // Catch:{ all -> 0x069f }
            int r3 = r1.A00     // Catch:{ all -> 0x069f }
            boolean r1 = r1.A03     // Catch:{ all -> 0x069f }
            if (r1 != 0) goto L_0x060e
            goto L_0x060d
        L_0x05aa:
            r2 = r11
            r7.A04 = r11     // Catch:{ all -> 0x069f }
            r7.A02 = r1     // Catch:{ all -> 0x069f }
            r7.A09 = r8     // Catch:{ all -> 0x069f }
            java.lang.String r11 = r7.A0C     // Catch:{ all -> 0x069f }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x069f }
            if (r9 == 0) goto L_0x05ce
            X.7v3 r8 = r9.A02     // Catch:{ all -> 0x069f }
            int r3 = r8.A01     // Catch:{ all -> 0x069f }
            if (r3 != r2) goto L_0x05cb
            int r2 = r8.A00     // Catch:{ all -> 0x069f }
            if (r2 != r1) goto L_0x05cb
            boolean r3 = r8.A03     // Catch:{ all -> 0x069f }
            boolean r2 = r10.booleanValue()     // Catch:{ all -> 0x069f }
            if (r3 == r2) goto L_0x060a
        L_0x05cb:
            r9.A01()     // Catch:{ all -> 0x069f }
        L_0x05ce:
            X.7uz r8 = new X.7uz     // Catch:{ all -> 0x069f }
            r8.<init>(r11)     // Catch:{ all -> 0x069f }
            r2 = 3553(0xde1, float:4.979E-42)
            r8.A03 = r2     // Catch:{ all -> 0x069f }
            r2 = r44
            r8.A04 = r2     // Catch:{ all -> 0x069f }
            r8.A02 = r1     // Catch:{ all -> 0x069f }
            r1 = 6408(0x1908, float:8.98E-42)
            r8.A00 = r1     // Catch:{ all -> 0x069f }
            boolean r1 = r10.booleanValue()     // Catch:{ all -> 0x069f }
            r8.A09 = r1     // Catch:{ all -> 0x069f }
            r1 = 1
            r8.A08 = r1     // Catch:{ all -> 0x069f }
            r1 = 10241(0x2801, float:1.435E-41)
            r2 = 9729(0x2601, float:1.3633E-41)
            android.util.SparseIntArray r3 = r8.A0A     // Catch:{ all -> 0x069f }
            r3.put(r1, r2)     // Catch:{ all -> 0x069f }
            r1 = 10240(0x2800, float:1.4349E-41)
            r3.put(r1, r2)     // Catch:{ all -> 0x069f }
            r1 = 10242(0x2802, float:1.4352E-41)
            r2 = 33071(0x812f, float:4.6342E-41)
            r3.put(r1, r2)     // Catch:{ all -> 0x069f }
            r1 = 10243(0x2803, float:1.4354E-41)
            r3.put(r1, r2)     // Catch:{ all -> 0x069f }
            X.7v0 r9 = new X.7v0     // Catch:{ all -> 0x069f }
            r9.<init>(r8)     // Catch:{ all -> 0x069f }
        L_0x060a:
            r7.A06 = r9     // Catch:{ all -> 0x069f }
            goto L_0x0596
        L_0x060d:
            r6 = 7
        L_0x060e:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluIODescriptor r2 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluIODescriptor     // Catch:{ all -> 0x069f }
            r2.<init>()     // Catch:{ all -> 0x069f }
            r11 = r9
            r12 = r8
            r13 = r3
            r15 = r6
            com.facebook.jni.HybridData r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluIODescriptor.initHybrid(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x069f }
            r2.mHybridData = r1     // Catch:{ all -> 0x069f }
            r4.setOutputTexture(r2)     // Catch:{ all -> 0x069f }
            java.lang.String r1 = "IgluFilterMediaGraphRenderer"
            r4.render(r1)     // Catch:{ all -> 0x069f }
            X.7ss r1 = r17.CFP()     // Catch:{ all -> 0x069f }
            r7.A07 = r1     // Catch:{ all -> 0x069f }
            long r1 = r17.C7X()     // Catch:{ all -> 0x069f }
            r7.A05 = r1     // Catch:{ all -> 0x069f }
            boolean r1 = r17.CU4()     // Catch:{ all -> 0x069f }
            r7.A0A = r1     // Catch:{ all -> 0x069f }
            int r1 = r17.Awt()     // Catch:{ all -> 0x069f }
            r7.A01 = r1     // Catch:{ all -> 0x069f }
            int r1 = r17.BZX()     // Catch:{ all -> 0x069f }
            r7.A03 = r1     // Catch:{ all -> 0x069f }
            int r1 = r17.Ap3()     // Catch:{ all -> 0x069f }
            r7.A00 = r1     // Catch:{ all -> 0x069f }
            X.8ft r1 = r17.BCa()     // Catch:{ all -> 0x069f }
            r7.A08 = r1     // Catch:{ all -> 0x069f }
            boolean r1 = r17.Cc4()     // Catch:{ all -> 0x069f }
            r7.A0B = r1     // Catch:{ all -> 0x069f }
            X.7ss r1 = r5.A08()     // Catch:{ all -> 0x069f }
            r7.A07 = r1     // Catch:{ all -> 0x069f }
            r7.A01 = r0     // Catch:{ all -> 0x069f }
            r7.A03 = r0     // Catch:{ all -> 0x069f }
            r1 = 36160(0x8d40, float:5.0671E-41)
            android.opengl.GLES20.glBindFramebuffer(r1, r0)     // Catch:{ all -> 0x069f }
            monitor-exit(r16)
            return r7
        L_0x0667:
            r0 = move-exception
            goto L_0x0682
        L_0x0669:
            java.lang.String r2 = "TransformMatrixUpdaterImpl#getInputSizeOfFilterAtPosition requires transform filter "
            if (r11 == 0) goto L_0x0671
            java.lang.String r10 = r11.getFilterName()     // Catch:{ all -> 0x069f }
        L_0x0671:
            r0 = 1981(0x7bd, float:2.776E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x069f }
            java.lang.String r1 = " to be non null and enabled"
            java.lang.String r1 = X.002.A09(r15, r2, r10, r0, r1)     // Catch:{ all -> 0x069f }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x069f }
            r0.<init>(r1)     // Catch:{ all -> 0x069f }
        L_0x0682:
            throw r0     // Catch:{ all -> 0x069f }
        L_0x0683:
            java.lang.String r3 = "invalid output dimension - width: "
            r0 = 2020(0x7e4, float:2.83E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x069f }
            java.lang.String r0 = X.002.A02(r2, r1, r3, r0)     // Catch:{ all -> 0x069f }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x069f }
            r1.<init>(r0)     // Catch:{ all -> 0x069f }
            goto L_0x069c
        L_0x0695:
            java.lang.String r0 = "updatePipeline not called"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x069f }
            r1.<init>(r0)     // Catch:{ all -> 0x069f }
        L_0x069c:
            throw r1     // Catch:{ all -> 0x069f }
        L_0x069d:
            monitor-exit(r16)
            return r48
        L_0x069f:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C367488qp.A04(X.8pF, X.7sz, X.7sv, X.7sr, X.7sH, java.lang.Long, java.util.List, int, int, boolean, boolean, boolean):X.7sz");
    }
}
