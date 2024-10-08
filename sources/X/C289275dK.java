package X;

import android.graphics.Canvas;
import android.view.ViewParent;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.5dK  reason: invalid class name and case insensitive filesystem */
public final class C289275dK implements C289195dB {
    public C289315dO A00;
    public C3018060d A01;
    public GraphicsLayer A02;
    public C62320sa A03;
    public 0sL A04;
    public boolean A05;
    public int A06;
    public long A07 = C289155d7.A00(Integer.MAX_VALUE, Integer.MAX_VALUE);
    public long A08 = C285605Ry.A01;
    public AnonymousClass5S9 A09;
    public C268024cd A0A = new AnonymousClass5Q7(1.0f, 1.0f);
    public AnonymousClass5Q8 A0B = AnonymousClass5Q8.Ltr;
    public boolean A0C;
    public boolean A0D;
    public float[] A0E;
    public final AndroidComposeView A0F;
    public final float[] A0G = AnonymousClass5S4.A06();
    public final C285855Sz A0H;
    public final AnonymousClass5Q5 A0I = new AnonymousClass5Q5();
    public final 0sP A0J = new C377189Kw(this, 10);

    public final void destroy() {
        this.A04 = null;
        this.A03 = null;
        this.A0D = true;
        if (false != this.A05) {
            this.A05 = false;
            this.A0F.A0L(this, false);
        }
        C285855Sz r1 = this.A0H;
        if (r1 != null) {
            r1.ECb(this.A02);
            this.A0F.A0K(this);
        }
    }

    private final void A00() {
        GraphicsLayer graphicsLayer = this.A02;
        long j = graphicsLayer.A02;
        if ((j & 9223372034707292159L) == 9205357640488583168L) {
            j = C288015bE.A01(C289155d7.A01(this.A07));
        }
        float[] fArr = this.A0G;
        AnonymousClass5S4.A02(fArr);
        float[] A062 = AnonymousClass5S4.A06();
        float A012 = C289295dM.A01(j);
        float A022 = C289295dM.A02(j);
        AnonymousClass5S4.A04(A062, -A012, -A022);
        AnonymousClass5S4.A05(fArr, A062);
        float[] A063 = AnonymousClass5S4.A06();
        C289225dE r8 = graphicsLayer.A0J;
        AnonymousClass5S4.A04(A063, r8.C9c(), r8.C9d());
        double Boj = (((double) r8.Boj()) * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(Boj);
        float sin = (float) Math.sin(Boj);
        float f = A063[1];
        float f2 = A063[2];
        float f3 = (f * cos) - (f2 * sin);
        float f4 = (f * sin) + (f2 * cos);
        float f5 = A063[5];
        float f6 = A063[6];
        float f7 = (f5 * cos) - (f6 * sin);
        float f8 = (f5 * sin) + (f6 * cos);
        float f9 = A063[9];
        float f10 = A063[10];
        float f11 = (f9 * cos) - (f10 * sin);
        float f12 = A063[13];
        float f13 = A063[14];
        float f14 = (f12 * sin) + (f13 * cos);
        A063[1] = f3;
        A063[2] = f4;
        A063[5] = f7;
        A063[6] = f8;
        A063[9] = f11;
        A063[10] = (f9 * sin) + (f10 * cos);
        A063[13] = (f12 * cos) - (f13 * sin);
        A063[14] = f14;
        double Bok = (((double) r8.Bok()) * 3.141592653589793d) / 180.0d;
        float cos2 = (float) Math.cos(Bok);
        float sin2 = (float) Math.sin(Bok);
        float f15 = A063[0];
        float f16 = A063[2];
        float f17 = (f15 * cos2) + (f16 * sin2);
        float f18 = ((-f15) * sin2) + (f16 * cos2);
        float f19 = A063[4];
        float f20 = A063[6];
        float f21 = (f19 * cos2) + (f20 * sin2);
        float f22 = ((-f19) * sin2) + (f20 * cos2);
        float f23 = A063[8];
        float f24 = A063[10];
        float f25 = (f23 * cos2) + (f24 * sin2);
        float f26 = ((-f23) * sin2) + (f24 * cos2);
        float f27 = A063[12];
        A063[0] = f17;
        A063[2] = f18;
        A063[4] = f21;
        A063[6] = f22;
        A063[8] = f25;
        A063[10] = f26;
        A063[12] = (f27 * cos2) + (f14 * sin2);
        A063[14] = ((-f27) * sin2) + (f14 * cos2);
        double Bol = (((double) r8.Bol()) * 3.141592653589793d) / 180.0d;
        float cos3 = (float) Math.cos(Bol);
        float sin3 = (float) Math.sin(Bol);
        float f28 = A063[0];
        float f29 = A063[4];
        float f30 = (cos3 * f28) + (sin3 * f29);
        float f31 = -sin3;
        float f32 = (f28 * f31) + (f29 * cos3);
        float f33 = A063[1];
        float f34 = A063[5];
        float f35 = (cos3 * f33) + (sin3 * f34);
        float f36 = (f33 * f31) + (f34 * cos3);
        float f37 = A063[2];
        float f38 = A063[6];
        float f39 = (cos3 * f37) + (sin3 * f38);
        float f40 = (f37 * f31) + (f38 * cos3);
        float f41 = A063[3];
        float f42 = A063[7];
        A063[0] = f30;
        A063[1] = f35;
        A063[2] = f39;
        A063[3] = (cos3 * f41) + (sin3 * f42);
        A063[4] = f32;
        A063[5] = f36;
        A063[6] = f40;
        A063[7] = (f31 * f41) + (cos3 * f42);
        AnonymousClass5S4.A03(A063, r8.BpX(), r8.BpY());
        AnonymousClass5S4.A05(fArr, A063);
        float[] A064 = AnonymousClass5S4.A06();
        AnonymousClass5S4.A04(A064, A012, A022);
        AnonymousClass5S4.A05(fArr, A064);
    }

    public final void Cld(C289445db r2, boolean z) {
        float[] fArr;
        if (z) {
            fArr = A01();
            if (fArr == null) {
                r2.A01 = 0.0f;
                r2.A03 = 0.0f;
                r2.A02 = 0.0f;
                r2.A00 = 0.0f;
                return;
            }
        } else {
            A00();
            fArr = this.A0G;
        }
        AnonymousClass5S4.A01(r2, fArr);
    }

    public final long Cle(long j, boolean z) {
        float[] fArr;
        if (z) {
            fArr = A01();
            if (fArr == null) {
                return 9187343241974906880L;
            }
        } else {
            A00();
            fArr = this.A0G;
        }
        return AnonymousClass5S4.A00(fArr, j);
    }

    public final void Cod(long j) {
        GraphicsLayer graphicsLayer = this.A02;
        if (graphicsLayer.A06 != j) {
            graphicsLayer.A06 = j;
            graphicsLayer.A0J.Eg9((int) (j >> 32), (int) (j & 4294967295L), graphicsLayer.A05);
        }
        AndroidComposeView androidComposeView = this.A0F;
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }

    public final void EIP(long j) {
        if (j != this.A07) {
            this.A07 = j;
            invalidate();
        }
    }

    public final void EJI(C62320sa r4, 0sL r5) {
        C285855Sz r1 = this.A0H;
        if (r1 == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
        } else if (this.A02.A0E) {
            this.A02 = r1.AM9();
            this.A0D = false;
            this.A04 = r5;
            this.A03 = r4;
            this.A08 = C285605Ry.A01;
            this.A0C = false;
            this.A07 = C289155d7.A00(Integer.MAX_VALUE, Integer.MAX_VALUE);
            this.A00 = null;
            this.A06 = 0;
        } else {
            throw new IllegalArgumentException("layer should have been released before reuse");
        }
    }

    public final void FK9() {
        if (this.A05) {
            long j = this.A08;
            if (j != C285605Ry.A01) {
                GraphicsLayer graphicsLayer = this.A02;
                long j2 = graphicsLayer.A05;
                long j3 = this.A07;
                if (j2 != j3) {
                    long A002 = C289325dP.A00(Float.intBitsToFloat((int) (j >> 32)) * ((float) ((int) (j3 >> 32))), Float.intBitsToFloat((int) (j & 4294967295L)) * ((float) C289005cr.A00(j3)));
                    if (graphicsLayer.A02 != A002) {
                        graphicsLayer.A02 = A002;
                        graphicsLayer.A0J.Efm(A002);
                    }
                }
            }
            GraphicsLayer graphicsLayer2 = this.A02;
            C268024cd r8 = this.A0A;
            AnonymousClass5Q8 r7 = this.A0B;
            long j4 = this.A07;
            0sP r6 = this.A0J;
            if (graphicsLayer2.A05 != j4) {
                graphicsLayer2.A05 = j4;
                long j5 = graphicsLayer2.A06;
                graphicsLayer2.A0J.Eg9((int) (j5 >> 32), (int) (j5 & 4294967295L), j4);
                if (graphicsLayer2.A03 == 9205357640488583168L) {
                    graphicsLayer2.A0F = true;
                    GraphicsLayer.A00(graphicsLayer2);
                }
            }
            graphicsLayer2.A0B = r8;
            graphicsLayer2.A0C = r7;
            graphicsLayer2.A0D = r6;
            GraphicsLayer.A02(graphicsLayer2);
            if (false != this.A05) {
                this.A05 = false;
                this.A0F.A0L(this, false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x020a, code lost:
        r1 = r12.A0F;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FKg(X.AnonymousClass5RT r13) {
        /*
            r12 = this;
            int r6 = r13.A0B
            int r0 = r12.A06
            r6 = r6 | r0
            X.5Q8 r0 = r13.A0K
            r12.A0B = r0
            X.4cd r0 = r13.A0J
            r12.A0A = r0
            r3 = r6 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L_0x0015
            long r0 = r13.A0F
            r12.A08 = r0
        L_0x0015:
            r0 = r6 & 1
            if (r0 == 0) goto L_0x002a
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = r12.A02
            float r2 = r13.A05
            X.5dE r1 = r0.A0J
            float r0 = r1.BpX()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x002a
            r1.EjG(r2)
        L_0x002a:
            r0 = r6 & 2
            if (r0 == 0) goto L_0x003f
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = r12.A02
            float r2 = r13.A06
            X.5dE r1 = r0.A0J
            float r0 = r1.BpY()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x003f
            r1.EjH(r2)
        L_0x003f:
            r0 = r6 & 4
            if (r0 == 0) goto L_0x004a
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = r12.A02
            float r0 = r13.A00
            r1.A05(r0)
        L_0x004a:
            r0 = r6 & 8
            if (r0 == 0) goto L_0x005f
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = r12.A02
            float r2 = r13.A08
            X.5dE r1 = r0.A0J
            float r0 = r1.C9c()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x005f
            r1.EpG(r2)
        L_0x005f:
            r0 = r6 & 16
            if (r0 == 0) goto L_0x0074
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = r12.A02
            float r2 = r13.A09
            X.5dE r1 = r0.A0J
            float r0 = r1.C9d()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0074
            r1.EpH(r2)
        L_0x0074:
            r0 = r6 & 32
            if (r0 == 0) goto L_0x00b1
            androidx.compose.ui.graphics.layer.GraphicsLayer r7 = r12.A02
            float r5 = r13.A07
            X.5dE r4 = r7.A0J
            float r0 = r4.Bt8()
            r2 = 0
            r1 = 1
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x009f
            r4.Ek7(r5)
            boolean r0 = r4.Ank()
            if (r0 != 0) goto L_0x0096
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0097
        L_0x0096:
            r2 = 1
        L_0x0097:
            r4.ERg(r2)
            r7.A0F = r1
            androidx.compose.ui.graphics.layer.GraphicsLayer.A00(r7)
        L_0x009f:
            float r1 = r13.A07
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b1
            boolean r0 = r12.A0C
            if (r0 != 0) goto L_0x00b1
            X.0sa r0 = r12.A03
            if (r0 == 0) goto L_0x00b1
            r0.invoke()
        L_0x00b1:
            r0 = r6 & 64
            if (r0 == 0) goto L_0x00c8
            androidx.compose.ui.graphics.layer.GraphicsLayer r2 = r12.A02
            long r0 = r13.A0C
            X.5dE r9 = r2.A0J
            long r7 = r9.AbM()
            long r4 = X.AnonymousClass5RW.A01
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x00c8
            r9.EOc(r0)
        L_0x00c8:
            r0 = r6 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00df
            androidx.compose.ui.graphics.layer.GraphicsLayer r2 = r12.A02
            long r0 = r13.A0E
            X.5dE r9 = r2.A0J
            long r7 = r9.ByQ()
            long r4 = X.AnonymousClass5RW.A01
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x00df
            r9.Elm(r0)
        L_0x00df:
            r0 = r6 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00f4
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = r12.A02
            float r2 = r13.A04
            X.5dE r1 = r0.A0J
            float r0 = r1.Bol()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00f4
            r1.Ej5(r2)
        L_0x00f4:
            r0 = r6 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0109
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = r12.A02
            float r2 = r13.A02
            X.5dE r1 = r0.A0J
            float r0 = r1.Boj()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0109
            r1.Ej3(r2)
        L_0x0109:
            r0 = r6 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x011e
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = r12.A02
            float r2 = r13.A03
            X.5dE r1 = r0.A0J
            float r0 = r1.Bok()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x011e
            r1.Ej4(r2)
        L_0x011e:
            r0 = r6 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0133
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = r12.A02
            float r2 = r13.A01
            X.5dE r1 = r0.A0J
            float r0 = r1.Ajj()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0133
            r1.EQN(r2)
        L_0x0133:
            if (r3 == 0) goto L_0x0155
            long r4 = r12.A08
            long r2 = X.C285605Ry.A01
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x013f
            r0 = 1
        L_0x013f:
            androidx.compose.ui.graphics.layer.GraphicsLayer r8 = r12.A02
            if (r0 == 0) goto L_0x0252
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
        L_0x0148:
            long r2 = r8.A02
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x0155
            r8.A02 = r0
            X.5dE r2 = r8.A0J
            r2.Efm(r0)
        L_0x0155:
            r0 = r6 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x016e
            androidx.compose.ui.graphics.layer.GraphicsLayer r3 = r12.A02
            boolean r2 = r13.A0L
            X.5dE r1 = r3.A0J
            boolean r0 = r1.Ank()
            if (r0 == r2) goto L_0x016e
            r1.ERg(r2)
            r0 = 1
            r3.A0F = r0
            androidx.compose.ui.graphics.layer.GraphicsLayer.A00(r3)
        L_0x016e:
            r0 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r6
            if (r0 == 0) goto L_0x0186
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = r12.A02
            X.HQg r2 = r13.A0H
            X.5dE r1 = r0.A0J
            X.HQg r0 = r1.Bli()
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 != 0) goto L_0x0186
            r1.EiT(r2)
        L_0x0186:
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r6
            if (r0 == 0) goto L_0x019f
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = r12.A02
            int r0 = r13.A0A
            r2 = 0
            if (r0 == r2) goto L_0x0194
            r2 = 1
        L_0x0194:
            X.5dE r1 = r1.A0J
            int r0 = r1.Apj()
            if (r0 == r2) goto L_0x019f
            r1.ESX(r2)
        L_0x019f:
            r2 = 0
            X.5dO r1 = r12.A00
            X.5dO r0 = r13.A0G
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0202
            X.5dO r9 = r13.A0G
            r12.A00 = r9
            if (r9 == 0) goto L_0x0201
            androidx.compose.ui.graphics.layer.GraphicsLayer r8 = r12.A02
            boolean r0 = r9 instanceof X.C289305dN
            if (r0 == 0) goto L_0x0216
            r0 = r9
            X.5dN r0 = (X.C289305dN) r0
            X.5VN r3 = r0.A00
            float r0 = r3.A01
            float r2 = r3.A03
            long r4 = X.C289325dP.A00(r0, r2)
            float r1 = r3.A02
            float r1 = r1 - r0
            float r0 = r3.A00
            float r0 = r0 - r2
            long r2 = X.C288015bE.A00(r1, r0)
            r7 = 0
        L_0x01ce:
            long r0 = r8.A04
            int r10 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x01e4
            long r0 = r8.A03
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 != 0) goto L_0x01e4
            float r0 = r8.A00
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x01e4
            X.60d r0 = r8.A09
            if (r0 == 0) goto L_0x01f0
        L_0x01e4:
            androidx.compose.ui.graphics.layer.GraphicsLayer.A03(r8)
            r8.A04 = r4
            r8.A03 = r2
            r8.A00 = r7
        L_0x01ed:
            androidx.compose.ui.graphics.layer.GraphicsLayer.A00(r8)
        L_0x01f0:
            boolean r0 = r9 instanceof X.C289335dQ
            if (r0 == 0) goto L_0x0201
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 >= r0) goto L_0x0201
            X.0sa r0 = r12.A03
            if (r0 == 0) goto L_0x0201
            r0.invoke()
        L_0x0201:
            r2 = 1
        L_0x0202:
            int r0 = r13.A0B
            r12.A06 = r0
            if (r6 != 0) goto L_0x020a
            if (r2 == 0) goto L_0x0215
        L_0x020a:
            androidx.compose.ui.platform.AndroidComposeView r1 = r12.A0F
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x0215
            r0.onDescendantInvalidated(r1, r1)
        L_0x0215:
            return
        L_0x0216:
            boolean r0 = r9 instanceof X.C289335dQ
            if (r0 == 0) goto L_0x0225
            r0 = r9
            X.5dQ r0 = (X.C289335dQ) r0
            X.60d r1 = r0.A00
        L_0x021f:
            androidx.compose.ui.graphics.layer.GraphicsLayer.A03(r8)
            r8.A09 = r1
            goto L_0x01ed
        L_0x0225:
            boolean r0 = r9 instanceof X.C3018460h
            if (r0 == 0) goto L_0x01f0
            r0 = r9
            X.60h r0 = (X.C3018460h) r0
            X.60d r1 = r0.A01
            if (r1 != 0) goto L_0x021f
            X.6GT r7 = r0.A00
            float r0 = r7.A01
            float r2 = r7.A03
            long r4 = X.C289325dP.A00(r0, r2)
            float r1 = r7.A02
            float r1 = r1 - r0
            float r0 = r7.A00
            float r0 = r0 - r2
            long r2 = X.C288015bE.A00(r1, r0)
            long r0 = r7.A04
            long r10 = X.AnonymousClass6GS.A00
            r7 = 32
            long r0 = r0 >> r7
            int r7 = (int) r0
            float r7 = java.lang.Float.intBitsToFloat(r7)
            goto L_0x01ce
        L_0x0252:
            r9 = 32
            long r0 = r4 >> r9
            int r2 = (int) r0
            float r7 = java.lang.Float.intBitsToFloat(r2)
            long r2 = r12.A07
            long r0 = r2 >> r9
            int r9 = (int) r0
            float r0 = (float) r9
            float r7 = r7 * r0
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r0
            int r0 = (int) r4
            float r1 = java.lang.Float.intBitsToFloat(r0)
            int r0 = X.C289005cr.A00(r2)
            float r0 = (float) r0
            float r1 = r1 * r0
            long r0 = X.C289325dP.A00(r7, r1)
            goto L_0x0148
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C289275dK.FKg(X.5RT):void");
    }

    public final void invalidate() {
        if (!this.A05 && !this.A0D) {
            AndroidComposeView androidComposeView = this.A0F;
            androidComposeView.invalidate();
            if (true != this.A05) {
                this.A05 = true;
                androidComposeView.A0L(this, true);
            }
        }
    }

    public C289275dK(C285855Sz r3, GraphicsLayer graphicsLayer, AndroidComposeView androidComposeView, C62320sa r6, 0sL r7) {
        this.A02 = graphicsLayer;
        this.A0H = r3;
        this.A0F = androidComposeView;
        this.A04 = r7;
        this.A03 = r6;
    }

    private final float[] A01() {
        A00();
        float[] fArr = this.A0G;
        float[] fArr2 = this.A0E;
        if (fArr2 == null) {
            fArr2 = AnonymousClass5S4.A06();
            this.A0E = fArr2;
        }
        if (C298445tR.A00(fArr, fArr2)) {
            return fArr2;
        }
        return null;
    }

    public final void AQh(AnonymousClass5QA r14, GraphicsLayer graphicsLayer) {
        C3018060d r2;
        Canvas A002 = AnonymousClass5R4.A00(r14);
        if (A002.isHardwareAccelerated()) {
            FK9();
            GraphicsLayer graphicsLayer2 = this.A02;
            boolean z = false;
            if (graphicsLayer2.A0J.Bt8() > 0.0f) {
                z = true;
            }
            this.A0C = z;
            AnonymousClass5Q5 r1 = this.A0I;
            AnonymousClass5QD r0 = r1.A03;
            r0.ER3(r14);
            ((AnonymousClass5QC) r0).A00 = graphicsLayer;
            C289365dT.A00(r1, graphicsLayer2);
            return;
        }
        GraphicsLayer graphicsLayer3 = this.A02;
        long j = graphicsLayer3.A06;
        float f = (float) ((int) (j >> 32));
        float f2 = (float) ((int) (j & 4294967295L));
        long j2 = this.A07;
        float f3 = f + ((float) ((int) (j2 >> 32)));
        float A003 = f2 + ((float) C289005cr.A00(j2));
        if (graphicsLayer3.A0J.AbF() < 1.0f) {
            AnonymousClass5S9 r12 = this.A09;
            if (r12 == null) {
                r12 = new AnonymousClass5S8();
                this.A09 = r12;
            }
            r12.EOX(this.A02.A0J.AbF());
            A002.saveLayer(f, f2, f3, A003, ((AnonymousClass5S8) r12).A01);
        } else {
            r14.EJt();
        }
        r14.FHv(f, f2);
        A00();
        r14.AIt(this.A0G);
        if (this.A02.A0J.Ank() && this.A02.A0J.Ank()) {
            C289315dO A042 = this.A02.A04();
            if (A042 instanceof C289305dN) {
                r14.AHy(((C289305dN) A042).A00, 1);
            } else {
                if (A042 instanceof C3018460h) {
                    r2 = this.A01;
                    if (r2 == null) {
                        r2 = C3026864w.A00();
                        this.A01 = r2;
                    }
                    ((C3018160e) r2).A03.reset();
                    r2.AAA(((C3018460h) A042).A00, AnonymousClass05K.A00);
                } else if (A042 instanceof C289335dQ) {
                    r2 = ((C289335dQ) A042).A00;
                }
                r14.AHw(r2, 1);
            }
        }
        0sL r13 = this.A04;
        if (r13 != null) {
            r13.invoke(r14, (Object) null);
        }
        r14.EIm();
    }

    public final void CNp(float[] fArr) {
        float[] A012 = A01();
        if (A012 != null) {
            AnonymousClass5S4.A05(fArr, A012);
        }
    }

    public final boolean CV6(long j) {
        float A012 = C289295dM.A01(j);
        float A022 = C289295dM.A02(j);
        if (this.A02.A0J.Ank()) {
            return C52418GRv.A01(this.A02.A04(), A012, A022);
        }
        return true;
    }

    public final void FHi(float[] fArr) {
        A00();
        AnonymousClass5S4.A05(fArr, this.A0G);
    }
}
