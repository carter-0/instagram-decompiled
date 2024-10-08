package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.math.matrix.Matrix4;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filter.BaseFilter;
import com.instagram.filterkit.filter.GradientBackgroundVideoFilter;
import com.instagram.filterkit.filter.IdentityFilter;
import com.instagram.filterkit.filter.VideoFilter;
import com.instagram.filterkit.filter.resize.ResizeFilter;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

/* renamed from: X.Tsw  reason: case insensitive filesystem */
public final class C14273Tsw {
    public static final C14270Tst A0X = C14268Tsr.A00();
    public int A00;
    public int A01;
    public int A02;
    public SurfaceTexture A03;
    public ResizeFilter A04;
    public Tt4 A05;
    public Tt4 A06;
    public C365358my A07;
    public boolean A08;
    public float[] A09;
    public int A0A = -12345;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final C266624a2 A0F = new C14274Tsx(this);
    public final X98 A0G;
    public final XBw A0H;
    public final ClipInfo A0I;
    public final C14279TtC A0J;
    public final C17703VcY A0K;
    public final AnonymousClass0eM A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final float[] A0Q = C366498p3.A00();
    public final float[] A0R = C366498p3.A00();
    public final int A0S;
    public final UserSession A0T;
    public final C14275Tsy A0U;
    public final C17735Vd4 A0V;
    public final AnonymousClass0eM A0W;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x020f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14273Tsw(android.content.Context r31, android.opengl.EGLContext r32, com.instagram.common.session.UserSession r33, X.C14279TtC r34, X.C59783JYc r35, int r36, int r37, boolean r38) {
        /*
            r30 = this;
            r6 = r30
            r6.<init>()
            float[] r0 = X.C366498p3.A00()
            r6.A0Q = r0
            float[] r0 = X.C366498p3.A00()
            r6.A0R = r0
            X.Tsx r0 = new X.Tsx
            r0.<init>(r6)
            r6.A0F = r0
            r0 = -12345(0xffffffffffffcfc7, float:NaN)
            r6.A0A = r0
            X.Tsm r7 = new X.Tsm
            r29 = r31
            r0 = r29
            r7.<init>(r0)
            r6.A0G = r7
            r5 = r33
            r6.A0T = r5
            r0 = r34
            r6.A0J = r0
            r9 = r35
            java.util.List r4 = r9.A09
            java.lang.String r3 = r9.A08
            if (r4 != 0) goto L_0x022e
            r0 = 0
        L_0x0038:
            r6.A0V = r0
            boolean r0 = r9.A0A
            r6.A0O = r0
            r4 = r36
            r6.A0E = r4
            r3 = r37
            r6.A0D = r3
            int r13 = r9.A02
            r6.A0C = r13
            int r15 = r9.A01
            r6.A0B = r15
            com.instagram.pendingmedia.model.ClipInfo r2 = r9.A06
            int r1 = r2.A05
            int r0 = r2.A07
            int r1 = r1 - r0
            r6.A0S = r1
            r6.A0I = r2
            r12 = r38
            r6.A0N = r12
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r0 = r9.A05
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            r6.A0M = r0
            com.instagram.camera.effect.models.CameraAREffect r7 = r9.A04
            r10 = 1
            if (r7 != 0) goto L_0x006b
            r10 = 0
        L_0x006b:
            r6.A0P = r10
            r16 = 0
            r1 = 5
            X.Wqp r0 = new X.Wqp
            r0.<init>(r6, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r6.A0L = r0
            int r14 = java.lang.Math.min(r13, r15)
            float r11 = r9.A00
            r1 = 1065353216(0x3f800000, float:1.0)
            float r8 = X.AnonymousClass7TE.A00(r11, r1)
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0222
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x0090:
            int r0 = r0.intValue()
            r8 = 1
            r1 = 0
            if (r0 == r1) goto L_0x021d
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r0 == r8) goto L_0x0213
            r6.A01 = r13
            float r0 = (float) r13
            float r0 = r0 / r11
            float r0 = r0 + r14
            int r14 = (int) r0
        L_0x00a2:
            r6.A00 = r14
        L_0x00a4:
            r0 = 1280(0x500, float:1.794E-42)
            if (r13 >= r0) goto L_0x00a9
            r8 = 0
        L_0x00a9:
            r6.A08 = r8
            X.0wj r11 = X.0wj.A01
            r8 = 817895413(0x30c017f5, float:1.3976648E-9)
            java.lang.String r0 = "TranscodeTextureRenderer"
            X.0f9 r11 = r11.AEf(r0, r8)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r8 = android.util.Log.getStackTraceString(r0)
            java.lang.String r0 = "stackTrace"
            r11.ABQ(r0, r8)
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x020f
            java.lang.String r8 = "true"
        L_0x00ca:
            java.lang.String r0 = "useResizeFilter"
            r11.ABQ(r0, r8)
            r11.report()
            if (r10 == 0) goto L_0x020a
            r0 = 1
            X.9Tv r13 = new X.9Tv
            r13.<init>()
            X.WOv r11 = new X.WOv
            r8 = r29
            r11.<init>(r8, r5)
            X.8sn r10 = new X.8sn
            r14 = r10
            r15 = r8
            r17 = r11
            r18 = r5
            r19 = r0
            r14.<init>(r15, r16, r17, r18, r19)
            X.VcY r8 = new X.VcY
            r8.<init>(r13, r10, r5, r12)
            r6.A0K = r8
            com.instagram.pendingmedia.model.ClipInfo r9 = r9.A07
            int r12 = r9.A09
            int r11 = r2.A09
            if (r12 != r11) goto L_0x0109
            int r10 = r9.A06
            int r8 = r2.A06
            if (r10 != r8) goto L_0x0109
            java.lang.Integer r10 = r9.A0C
            java.lang.Integer r8 = r2.A0C
            if (r10 == r8) goto L_0x0134
        L_0x0109:
            java.lang.Integer r17 = java.lang.Integer.valueOf(r12)
            int r8 = r9.A06
            java.lang.Integer r18 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r10 = r9.A0C
            java.lang.Integer r20 = java.lang.Integer.valueOf(r11)
            int r8 = r2.A06
            java.lang.Integer r21 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r8 = r2.A0C
            r19 = r10
            r22 = r8
            java.lang.Object[] r10 = new java.lang.Object[]{r17, r18, r19, r20, r21, r22}
            java.lang.String r8 = "[%s,%s,%s] vs [%s,%s,%s]"
            java.lang.String r10 = X.0mp.A06(r8, r10)
            java.lang.String r8 = "cannot_use_stitched_clipinfo"
            X.0wb.A03(r8, r10)
        L_0x0134:
            int r8 = r9.A09
            float r10 = (float) r8
            int r8 = r9.A06
            float r8 = (float) r8
            float r10 = r10 / r8
            java.lang.Integer r8 = r9.A0C
            int r8 = X.C13988Tno.A0D(r8)
            int r8 = X.Q0X.A00(r8)
            int r8 = r8 % 180
            if (r8 != 0) goto L_0x0204
            int[] r8 = X.C367168qI.A00(r10, r4, r3)
        L_0x014d:
            r10 = r8[r1]
            r11 = r8[r0]
            java.lang.Integer r8 = r9.A0C
            int r8 = X.C13988Tno.A0D(r8)
            int r14 = X.Q0X.A00(r8)
            X.8mz r19 = new X.8mz
            r9 = r19
            r12 = r10
            r13 = r11
            r15 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15)
            X.8mz r13 = new X.8mz
            r20 = r13
            r21 = r4
            r22 = r3
            r23 = r4
            r24 = r3
            r25 = r1
            r26 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26)
            X.VcY r12 = r6.A0K
            r12.getClass()
            java.lang.Object r11 = X.C343747qj.A06
            X.ASV r10 = new X.ASV
            r8 = r32
            r10.<init>(r8, r11)
            r12.A00 = r13
            X.8n0 r18 = X.C365378n0.ENABLE
            X.8n1 r15 = r12.A04
            boolean r14 = r12.A0A
            java.lang.String r9 = "IG-CameraCoreRenderer"
            X.8n2 r8 = new X.8n2
            r24 = r0
            r25 = r0
            r26 = r14
            r27 = r1
            r28 = r1
            r17 = r8
            r20 = r15
            r21 = r16
            r22 = r11
            r23 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r12.A01 = r8
            X.WGC r14 = new X.WGC
            r14.<init>(r13, r11)
            r12.A02 = r14
            X.VU6 r1 = new X.VU6
            r1.<init>(r12)
            r14.A00 = r1
            X.8sn r8 = r12.A05
            X.8n2 r1 = r12.A01
            r8.A0C(r1, r10)
            X.8ql r1 = r8.A03
            if (r1 == 0) goto L_0x01c7
            r1.A9i(r14)
        L_0x01c7:
            X.8n2 r1 = r12.A01
            if (r1 != 0) goto L_0x01fb
            java.lang.String r0 = "mSharedTextureVideoInput is null."
            X.0wb.A03(r9, r0)
        L_0x01d0:
            r0 = 3
            X.AXN r1 = new X.AXN
            r1.<init>(r6, r0)
            java.util.Set r0 = r8.A0G
            r0.add(r1)
        L_0x01db:
            r7 = 1
            X.TPG r1 = new X.TPG
            r0 = r29
            r1.<init>(r7, r0, r5, r6)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r1)
            r6.A0W = r0
            X.Tsy r0 = new X.Tsy
            r0.<init>()
            r6.A0U = r0
            r0.A00(r2)
            X.TsU r0 = new X.TsU
            r0.<init>(r4, r3)
            r6.A0H = r0
            return
        L_0x01fb:
            r8.A0D(r7)
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.A09
            r1.set(r0)
            goto L_0x01d0
        L_0x0204:
            int[] r8 = X.C367168qI.A00(r10, r3, r4)
            goto L_0x014d
        L_0x020a:
            r0 = r16
            r6.A0K = r0
            goto L_0x01db
        L_0x020f:
            java.lang.String r8 = "false"
            goto L_0x00ca
        L_0x0213:
            r6.A00 = r15
            float r0 = (float) r15
            float r0 = r0 * r11
            float r0 = r0 + r14
            int r13 = (int) r0
            r6.A01 = r13
            goto L_0x00a4
        L_0x021d:
            r6.A01 = r14
            r13 = r14
            goto L_0x00a2
        L_0x0222:
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x022a
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0090
        L_0x022a:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0090
        L_0x022e:
            X.0wj r2 = X.0wj.A01
            r1 = 817899389(0x30c0277d, float:1.3981062E-9)
            java.lang.String r0 = "TranscodeTextureRenderer"
            X.DbT.A1Q(r2, r0, r1)
            X.Vd4 r0 = new X.Vd4
            r10 = r0
            r11 = r29
            r12 = r5
            r13 = r7
            r14 = r3
            r15 = r4
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14273Tsw.<init>(android.content.Context, android.opengl.EGLContext, com.instagram.common.session.UserSession, X.TtC, X.JYc, int, int, boolean):void");
    }

    private void A00(Bitmap bitmap, C266624a2 r7, C365358my r8, XBw xBw, float[] fArr, float[] fArr2, boolean z) {
        C14270Tst tst;
        AnonymousClass0eM r0 = this.A0W;
        r0.getClass();
        GradientBackgroundVideoFilter gradientBackgroundVideoFilter = (GradientBackgroundVideoFilter) r0.getValue();
        gradientBackgroundVideoFilter.A02(r7);
        if (!(fArr == null || fArr2 == null)) {
            gradientBackgroundVideoFilter.A05(fArr, fArr2);
        }
        ClipInfo clipInfo = this.A0I;
        if (clipInfo.A0K) {
            float f = ((float) this.A0C) / ((float) this.A0B);
            float f2 = ((float) this.A0E) / ((float) this.A0D);
            if (f < f2) {
                gradientBackgroundVideoFilter.A06(f, f2, z);
            }
        }
        if (clipInfo.A0N) {
            float f3 = ((float) this.A0C) / ((float) this.A0B);
            if (f3 < 1.0f) {
                gradientBackgroundVideoFilter.A06(f3, 1.0f, z);
            }
        }
        if (bitmap != null) {
            0f9 AEf = 0wj.A01.AEf("GRADIENT BACKGROUND BITMAP", 817895413);
            AEf.ABQ("use case", "TranscodeTextureRenderer");
            AEf.report();
            gradientBackgroundVideoFilter.A05 = bitmap;
        }
        if (this.A0M) {
            tst = A0X;
        } else {
            C14275Tsy tsy = this.A0U;
            tsy.getClass();
            tst = tsy.A01;
        }
        gradientBackgroundVideoFilter.A0E = tst;
        GLES20.glBindFramebuffer(36160, xBw.B86());
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        gradientBackgroundVideoFilter.EEs(this.A0G, r8, xBw);
    }

    private void A02(XBw xBw, long j) {
        C367508qr r11;
        IllegalStateException illegalStateException;
        C282765Eq r3;
        int i;
        C17735Vd4 vd4 = this.A0V;
        if (vd4 != null) {
            try {
                int round = Math.round((float) (j / 1000));
                int i2 = this.A0S;
                vd4.A01 = round;
                vd4.A00 = i2;
                X98 x98 = this.A0G;
                List<C282745Eo> list = vd4.A0F;
                C367508qr r13 = vd4.A03;
                XBw xBw2 = xBw;
                if (r13 == null || (r11 = vd4.A02) == null) {
                    int width = xBw2.getWidth();
                    int Blj = xBw2.Blj();
                    r13 = new C367508qr(width, Blj);
                    vd4.A03 = r13;
                    r11 = new C367508qr(xBw2.Blp(), Blj);
                    vd4.A02 = r11;
                }
                if (!vd4.A06) {
                    vd4.A06 = true;
                    Context context = vd4.A07;
                    UserSession userSession = vd4.A09;
                    X98 x982 = vd4.A0B;
                    A91 a91 = vd4.A0D;
                    vd4.A04 = new C17842Vgv(context, userSession, x982, a91);
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C282745Eo r1 = (C282745Eo) it.next();
                        TreeSet treeSet = new TreeSet(r1.A07);
                        vd4.A0G.put(r1, treeSet);
                        C282775Er r2 = r1.A03;
                        int ordinal = r2.ordinal();
                        if (ordinal != 0 && ordinal != 1 && ordinal != 3 && ordinal != 2) {
                            if (ordinal != 4) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(AnonymousClass000.A00(482));
                                sb.append(r2);
                                illegalStateException = new IllegalStateException(sb.toString());
                                break;
                            }
                            C39801A9w a9w = new C39801A9w(context, r13, r11, userSession, a91, vd4.A0E);
                            vd4.A05 = a9w;
                            Object floor = treeSet.floor(new Object());
                            floor.getClass();
                            a9w.A02(r1, (C282765Eq) floor);
                        } else {
                            vd4.A04.A00(r2).A8e(r1);
                        }
                    }
                }
                vd4.A04.getClass();
                for (C282745Eo r10 : list) {
                    C39687A5d a5d = r10.A02;
                    if (a5d == null || (a5d.A01 <= (i = vd4.A01) && i <= a5d.A00)) {
                        C282775Er r22 = r10.A03;
                        int ordinal2 = r22.ordinal();
                        if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 3 || ordinal2 == 2) {
                            C365358my C5l = vd4.A04.A00(r22).C5l(r10, (long) vd4.A01, (long) vd4.A00);
                            if (C5l != null) {
                                vd4.A03.getClass();
                                vd4.A02.getClass();
                                C282765Eq r12 = vd4.A0C;
                                r12.A0C = vd4.A01;
                                NavigableSet navigableSet = (NavigableSet) vd4.A0G.get(r10);
                                if (!(navigableSet == null || (r3 = (C282765Eq) navigableSet.floor(r12)) == null)) {
                                    C367508qr r23 = vd4.A03;
                                    C367508qr r0 = vd4.A02;
                                    Matrix4 matrix4 = vd4.A08;
                                    ABR.A00(r23, r0, matrix4, r3);
                                    IdentityFilter identityFilter = vd4.A0A;
                                    identityFilter.A03 = true;
                                    identityFilter.A04.A04(matrix4);
                                    boolean glIsEnabled = GLES20.glIsEnabled(3042);
                                    if (!glIsEnabled) {
                                        GLES20.glEnable(3042);
                                    }
                                    GLES20.glBlendFunc(1, 771);
                                    identityFilter.EEs(x98, C5l, xBw2);
                                    if (!glIsEnabled) {
                                        GLES20.glDisable(3042);
                                    }
                                }
                                C282775Er r14 = r10.A03;
                                if (r14 == C282775Er.A08 || r14 == C282775Er.A06 || r14 == C282775Er.A05) {
                                    C5l.cleanup();
                                }
                            }
                        } else if (ordinal2 == 4) {
                            C39801A9w a9w2 = vd4.A05;
                            if (a9w2 != null) {
                                a9w2.A01(r10, (long) vd4.A01);
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(AnonymousClass000.A00(482));
                            sb2.append(r22);
                            illegalStateException = new IllegalStateException(sb2.toString());
                            throw illegalStateException;
                        }
                    } else {
                        return;
                    }
                }
            } catch (C16690V1t e) {
                0KC.A0F("TranscodeTextureRenderer", "Region tracking filter failed", e);
                0wb.A07("TranscodeTextureRenderer render exception", e);
            }
        }
    }

    public final SurfaceTexture A03(UserSession userSession, BaseFilter baseFilter, VideoFilter videoFilter) {
        SurfaceTexture surfaceTexture;
        if (this.A03 != null) {
            0wb.A03("TranscodeTextureRenderer", "mSurfaceTexture has already been initialized");
        }
        C17703VcY vcY = this.A0K;
        if (vcY != null) {
            try {
                C365398n2 r1 = vcY.A01;
                if (r1 != null) {
                    surfaceTexture = r1.A01(false);
                    this.A03 = surfaceTexture;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } catch (InterruptedException e) {
                0KC.A0F("IG-CameraCoreRenderer", "SharedTextureVideoInput latch was interrupted", e);
                0wb.A07("SharedTextureVideoInput latch exception", e);
                surfaceTexture = null;
            }
        } else {
            C346327uz r12 = new C346327uz("TranscodeTextureRenderer");
            r12.A03 = 36197;
            r12.A00 = 6408;
            int i = new C346337v0(r12).A00;
            this.A0A = i;
            this.A03 = new SurfaceTexture(i);
            this.A07 = C365338mw.A01((C367428qj) null, this.A0A, this.A0C, this.A0B);
        }
        if (this.A08) {
            this.A04 = new ResizeFilter(userSession, true);
            this.A05 = new Tt4(this.A0E, this.A0D);
        }
        if (baseFilter != null) {
            this.A06 = new Tt4(this.A0E, this.A0D);
        }
        videoFilter.A01();
        SurfaceTexture surfaceTexture2 = this.A03;
        surfaceTexture2.getClass();
        return surfaceTexture2;
    }

    public final void A04() {
        C39801A9w a9w;
        C17703VcY vcY = this.A0K;
        if (vcY == null) {
            SurfaceTexture surfaceTexture = this.A03;
            surfaceTexture.getClass();
            surfaceTexture.release();
        } else {
            synchronized (vcY.A04) {
            }
            C368528sn r2 = vcY.A05;
            r2.A04 = null;
            C367448ql r0 = r2.A03;
            if (r0 != null) {
                r0.destroy();
                synchronized (r2) {
                    r2.A03 = null;
                }
            }
        }
        C17735Vd4 vd4 = this.A0V;
        if (vd4 != null) {
            vd4.A0A.AHH(this.A0G);
            if (vd4.A06) {
                for (C282775Er r22 : C282775Er.values()) {
                    int ordinal = r22.ordinal();
                    if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                        C17842Vgv vgv = vd4.A04;
                        vgv.getClass();
                        X85 A002 = vgv.A00(r22);
                        if (A002 != null) {
                            A002.cleanup();
                        }
                    } else if (ordinal == 4 && (a9w = vd4.A05) != null) {
                        a9w.A00();
                    }
                }
                vd4.A0D.A00.clear();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x020d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x020e, code lost:
        X.0wb.A07("SharedTextureVideoInput init exception", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (r5.A0I.A0N != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b0, code lost:
        if ((r0.intValue() % 2) == 0) goto L_0x01b2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(com.instagram.filterkit.filter.BaseFilter r23, com.instagram.filterkit.filter.VideoFilter r24, long r25) {
        /*
            r22 = this;
            r5 = r22
            int r0 = r5.A02
            int r0 = r0 + 1
            r5.A02 = r0
            java.lang.String r0 = "onDrawFrame start"
            X.AnonymousClass9S9.A05(r0)
            r4 = r24
            X.4a2 r0 = r4.A06
            float[] r15 = r0.C5o()
            boolean r1 = r5.A0P
            r21 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0029
            boolean r0 = X.C366718pY.A00(r15, r3)
            if (r0 != 0) goto L_0x0029
            com.instagram.pendingmedia.model.ClipInfo r0 = r5.A0I
            boolean r0 = r0.A0N
            r11 = 0
            if (r0 == 0) goto L_0x002a
        L_0x0029:
            r11 = 1
        L_0x002a:
            r12 = r25
            if (r1 == 0) goto L_0x0086
            X.VcY r2 = r5.A0K
            r2.getClass()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r25
            X.8n2 r6 = r2.A01
            if (r6 == 0) goto L_0x007a
            X.8n1 r7 = r2.A04
            java.lang.String r6 = "null cannot be cast to non-null type com.facebook.cameracore.mediapipeline.filterlib.input.PassThroughRenderClock"
            X.0qQ.A0C(r7, r6)
            X.9Tv r7 = (X.C379419Tv) r7
            monitor-enter(r7)
            r7.A00 = r0     // Catch:{ all -> 0x0077 }
            monitor-exit(r7)
            X.8n2 r1 = r2.A01     // Catch:{ IllegalStateException | InterruptedException -> 0x020d }
            X.0qQ.A0A(r1)     // Catch:{ IllegalStateException | InterruptedException -> 0x020d }
            r0 = 0
            r1.A02(r0)     // Catch:{ IllegalStateException | InterruptedException -> 0x020d }
            java.lang.Object r6 = r2.A08     // Catch:{ IllegalStateException | InterruptedException -> 0x020d }
            monitor-enter(r6)     // Catch:{ IllegalStateException | InterruptedException -> 0x020d }
        L_0x0054:
            boolean r0 = r2.A03     // Catch:{ all -> 0x0074 }
            if (r0 != 0) goto L_0x006f
            r0 = 5000(0x1388, double:2.4703E-320)
            r6.wait(r0)     // Catch:{ InterruptedException -> 0x0069 }
            boolean r0 = r2.A03     // Catch:{ InterruptedException -> 0x0069 }
            if (r0 != 0) goto L_0x0054
            java.lang.String r1 = "Timed out waiting for CameraCore frame."
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x0069 }
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x0069 }
            throw r0     // Catch:{ InterruptedException -> 0x0069 }
        L_0x0069:
            r1 = move-exception
            java.lang.String r0 = "IG-CameraCoreRenderer"
            X.0wb.A07(r0, r1)     // Catch:{ all -> 0x0074 }
        L_0x006f:
            r2.A03 = r3     // Catch:{ all -> 0x0074 }
            monitor-exit(r6)     // Catch:{ IllegalStateException | InterruptedException -> 0x020d }
            goto L_0x0213
        L_0x0074:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ IllegalStateException | InterruptedException -> 0x020d }
            throw r0     // Catch:{ IllegalStateException | InterruptedException -> 0x020d }
        L_0x0077:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x007a:
            r0 = 4877(0x130d, float:6.834E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0086:
            boolean r0 = r5.A0N
            if (r0 == 0) goto L_0x0092
            android.graphics.SurfaceTexture r0 = r5.A03
            r0.getClass()
            r0.updateTexImage()
        L_0x0092:
            android.graphics.SurfaceTexture r0 = r5.A03
            r0.getClass()
            float[] r6 = r5.A0Q
            r0.getTransformMatrix(r6)
            boolean r0 = r5.A0M
            if (r0 == 0) goto L_0x00d5
            r2 = r6[r21]
            double r0 = (double) r2
            r18 = 13
            r17 = 12
            r16 = 4
            r14 = 5
            r9 = 0
            int r7 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x01d3
            r0 = r6[r16]
            double r0 = (double) r0
            int r7 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x01d3
            r7 = r6[r3]
            double r0 = (double) r7
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c6
            r0 = r6[r17]
            float r0 = r0 + r7
            r6[r17] = r0
            float r0 = -r7
            r6[r3] = r0
        L_0x00c6:
            r7 = r6[r14]
            double r0 = (double) r7
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x00d5
            r0 = r6[r18]
            float r0 = r0 + r7
            r6[r18] = r0
            float r0 = -r7
            r6[r14] = r0
        L_0x00d5:
            boolean r14 = r5.A08
            if (r14 != 0) goto L_0x015e
            int r10 = r5.A0C
            int r0 = r5.A01
            if (r10 != r0) goto L_0x015e
            int r0 = r5.A0E
            if (r10 != r0) goto L_0x015e
            r0 = r6[r21]
            double r0 = (double) r0
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x015e
            r0 = 4
            r0 = r6[r0]
            double r0 = (double) r0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x015e
            float[] r0 = r5.A09
            if (r0 != 0) goto L_0x0158
            r1 = 16
            float[] r0 = new float[r1]
            r5.A09 = r0
            java.lang.System.arraycopy(r6, r3, r0, r3, r1)
            float[] r2 = r5.A09
            java.util.Arrays.toString(r2)
            r8 = r2[r3]
            float r0 = java.lang.Math.abs(r8)
            double r0 = (double) r0
            r9 = 2
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r18 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r7 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r7 == 0) goto L_0x012e
            if (r10 <= r9) goto L_0x012e
            double r7 = (double) r8
            double r0 = (double) r10
            double r0 = r0 - r18
            double r16 = r7 / r0
            double r0 = r16 * r18
            double r7 = r7 + r0
            float r0 = (float) r7
            r2[r3] = r0
            r8 = 12
            r0 = r2[r8]
            double r0 = (double) r0
            double r0 = r0 - r16
            float r7 = (float) r0
            r2[r8] = r7
        L_0x012e:
            r16 = 5
            r8 = r2[r16]
            float r0 = java.lang.Math.abs(r8)
            double r0 = (double) r0
            int r7 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r7 == 0) goto L_0x0155
            int r0 = r5.A0B
            if (r0 <= r9) goto L_0x0155
            double r7 = (double) r8
            double r0 = (double) r0
            double r0 = r0 - r18
            double r9 = r7 / r0
            double r18 = r18 * r9
            double r7 = r7 + r18
            float r0 = (float) r7
            r2[r16] = r0
            r8 = 13
            r0 = r2[r8]
            double r0 = (double) r0
            double r0 = r0 - r9
            float r7 = (float) r0
            r2[r8] = r7
        L_0x0155:
            java.util.Arrays.toString(r2)
        L_0x0158:
            float[] r1 = r5.A09
            int r0 = r1.length
            java.lang.System.arraycopy(r1, r3, r6, r3, r0)
        L_0x015e:
            r8 = 2
            if (r14 == 0) goto L_0x0193
            X.8my r0 = r5.A07
            r0.getClass()
            int r0 = r0.getWidth()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            X.8my r0 = r5.A07
            int r0 = r0.getHeight()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r5.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r5.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r7, r2, r1, r0}
            java.lang.String r0 = "Resizing is enabled but GradientFilter resized media input=%dx%d output=%dx%d"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.String r0 = "TranscodeTextureRenderer"
            X.0wb.A03(r0, r1)
        L_0x0193:
            float[] r0 = r5.A0R
            r16 = r0
            r17 = r3
            r18 = r6
            r19 = r3
            r20 = r15
            r21 = r3
            android.opengl.Matrix.multiplyMM(r16, r17, r18, r19, r20, r21)
            com.instagram.pendingmedia.model.ClipInfo r0 = r5.A0I
            java.lang.Integer r0 = r0.A0C
            if (r0 == 0) goto L_0x01b2
            int r0 = r0.intValue()
            int r0 = r0 % r8
            r9 = 1
            if (r0 != 0) goto L_0x01b3
        L_0x01b2:
            r9 = 0
        L_0x01b3:
            java.lang.String r0 = "GradientFilter is disabled and CC renderer is not used"
            X.17k.A0G(r11, r0)
            X.8my r7 = r5.A07
            r7.getClass()
            X.0eM r0 = r5.A0L
            r0.getClass()
            java.lang.Object r8 = r0.getValue()
            X.XBw r8 = (X.XBw) r8
            X.4a2 r6 = r5.A0F
            float[] r2 = r4.A0I
            float[] r1 = r4.A0H
            r21 = r9 ^ 1
            android.graphics.Bitmap r0 = r4.A05
            goto L_0x022b
        L_0x01d3:
            r0 = r6[r3]
            double r0 = (double) r0
            int r7 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x0204
            r0 = r6[r14]
            double r0 = (double) r0
            int r7 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x0204
            r8 = r6[r16]
            double r0 = (double) r8
            int r7 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x01ee
            r0 = r6[r17]
            float r0 = r0 + r8
            r6[r17] = r0
            float r8 = -r8
        L_0x01ee:
            r6[r3] = r8
            double r0 = (double) r2
            int r7 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x01fb
            r0 = r6[r18]
            float r0 = r0 + r2
            r6[r18] = r0
            float r2 = -r2
        L_0x01fb:
            r6[r14] = r2
            r0 = 0
            r6[r16] = r0
            r6[r21] = r0
            goto L_0x00d5
        L_0x0204:
            float[] r1 = X.C366498p3.A01
            r0 = 16
            java.lang.System.arraycopy(r1, r3, r6, r3, r0)
            goto L_0x00d5
        L_0x020d:
            r1 = move-exception
            java.lang.String r0 = "SharedTextureVideoInput init exception"
            X.0wb.A07(r0, r1)
        L_0x0213:
            X.WXO r7 = r2.A07
            if (r11 == 0) goto L_0x023e
            X.0eM r0 = r5.A0L
            r0.getClass()
            java.lang.Object r8 = r0.getValue()
            X.XBw r8 = (X.XBw) r8
            X.4a2 r6 = r4.A06
            float[] r2 = r4.A0I
            float[] r1 = r4.A0H
            android.graphics.Bitmap r0 = r4.A05
            r11 = 1
        L_0x022b:
            r15 = r0
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r2
            r20 = r1
            r14 = r5
            r14.A00(r15, r16, r17, r18, r19, r20, r21)
            r7 = r8
            X.8my r7 = (X.C365358my) r7
            goto L_0x023f
        L_0x023e:
            r11 = 0
        L_0x023f:
            boolean r0 = r5.A08     // Catch:{ V1t -> 0x026b }
            if (r0 == 0) goto L_0x0278
            int r1 = r7.getWidth()     // Catch:{ V1t -> 0x026b }
            X.XBw r0 = r5.A0H     // Catch:{ V1t -> 0x026b }
            int r0 = r0.getWidth()     // Catch:{ V1t -> 0x026b }
            if (r1 == r0) goto L_0x0278
            java.lang.String r0 = "TranscodeTextureRenderer"
            X.AnonymousClass9S9.A05(r0)     // Catch:{ V1t -> 0x026b }
            com.instagram.filterkit.filter.resize.ResizeFilter r2 = r5.A04     // Catch:{ V1t -> 0x026b }
            r2.getClass()     // Catch:{ V1t -> 0x026b }
            X.X98 r1 = r5.A0G     // Catch:{ V1t -> 0x026b }
            X.Tt4 r0 = r5.A05     // Catch:{ V1t -> 0x026b }
            r0.getClass()     // Catch:{ V1t -> 0x026b }
            r2.EEs(r1, r7, r0)     // Catch:{ V1t -> 0x026b }
            X.Tt4 r0 = r5.A05     // Catch:{ V1t -> 0x026b }
            r0.getClass()     // Catch:{ V1t -> 0x026b }
            X.Tt4 r7 = r5.A05     // Catch:{ V1t -> 0x026b }
            goto L_0x0278
        L_0x026b:
            r2 = move-exception
            java.lang.String r1 = "TranscodeTextureRenderer"
            java.lang.String r0 = "Video resize failed"
            X.0KC.A0F(r1, r0, r2)
            java.lang.String r0 = "TranscodeTextureRenderer render exception"
            X.0wb.A07(r0, r2)
        L_0x0278:
            r6 = r23
            if (r23 == 0) goto L_0x02d6
            X.Tt4 r2 = r5.A06
        L_0x027e:
            r1 = 36160(0x8d40, float:5.0671E-41)
            r2.getClass()
            int r0 = r2.B86()
            android.opengl.GLES20.glBindFramebuffer(r1, r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.opengl.GLES20.glClearColor(r0, r0, r0, r1)
            r0 = 16384(0x4000, float:2.2959E-41)
            android.opengl.GLES20.glClear(r0)
            r4.A0F = r3
            X.Tst r0 = A0X
            r4.A0E = r0
            r0 = r11 ^ 1
            r4.A04(r0)
            X.X98 r0 = r5.A0G
            r4.EEs(r0, r7, r2)
            boolean r0 = r5.A0O
            if (r0 == 0) goto L_0x02c4
            r5.A02(r2, r12)
            if (r23 == 0) goto L_0x02b9
            X.Tt4 r1 = r5.A06
            r1.getClass()
            X.XBw r0 = r5.A0H
            r5.A01(r6, r1, r0)
        L_0x02b9:
            X.TtC r1 = r5.A0J
            int r0 = r5.A02
            r1.DGz(r2, r0, r12)
            android.opengl.GLES20.glFlush()
            return
        L_0x02c4:
            if (r23 == 0) goto L_0x02d0
            X.Tt4 r1 = r5.A06
            r1.getClass()
            X.XBw r0 = r5.A0H
            r5.A01(r6, r1, r0)
        L_0x02d0:
            X.XBw r0 = r5.A0H
            r5.A02(r0, r12)
            goto L_0x02b9
        L_0x02d6:
            X.XBw r2 = r5.A0H
            goto L_0x027e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14273Tsw.A05(com.instagram.filterkit.filter.BaseFilter, com.instagram.filterkit.filter.VideoFilter, long):void");
    }

    private void A01(BaseFilter baseFilter, Tt4 tt4, XBw xBw) {
        try {
            GLES20.glBindFramebuffer(36160, this.A0H.B86());
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
            baseFilter.EEs(this.A0G, tt4, xBw);
            baseFilter.toString();
        } catch (C16690V1t e) {
            0KC.A0F("TranscodeTextureRenderer", "Secondary filter failed", e);
            0wb.A07("TranscodeTextureRenderer render exception", e);
        }
    }
}
