package androidx.compose.ui.graphics.layer;

import X.0sP;
import X.0vq;
import X.AnonymousClass01q;
import X.AnonymousClass5Q6;
import X.AnonymousClass5Q8;
import X.AnonymousClass5S9;
import X.AnonymousClass5VN;
import X.AnonymousClass6GR;
import X.AnonymousClass6GU;
import X.C268024cd;
import X.C288025bF;
import X.C289155d7;
import X.C289225dE;
import X.C289235dG;
import X.C289245dH;
import X.C289255dI;
import X.C289265dJ;
import X.C289295dM;
import X.C289305dN;
import X.C289315dO;
import X.C289335dQ;
import X.C3018060d;
import X.C3018460h;
import android.graphics.Outline;

public final class GraphicsLayer {
    public static final C289245dH A0K = C289235dG.A00;
    public float A00;
    public int A01;
    public long A02;
    public long A03 = 9205357640488583168L;
    public long A04 = 0;
    public long A05;
    public long A06;
    public Outline A07;
    public AnonymousClass5S9 A08;
    public C3018060d A09;
    public C3018060d A0A;
    public C268024cd A0B = AnonymousClass5Q6.A00;
    public AnonymousClass5Q8 A0C = AnonymousClass5Q8.Ltr;
    public 0sP A0D = C289255dI.A00;
    public boolean A0E;
    public boolean A0F = true;
    public boolean A0G;
    public C289315dO A0H;
    public final C289265dJ A0I = new Object();
    public final C289225dE A0J;

    public static final void A03(GraphicsLayer graphicsLayer) {
        graphicsLayer.A0H = null;
        graphicsLayer.A09 = null;
        graphicsLayer.A03 = 9205357640488583168L;
        graphicsLayer.A04 = 0;
        graphicsLayer.A00 = 0.0f;
        graphicsLayer.A0F = true;
        graphicsLayer.A0G = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(androidx.compose.ui.graphics.layer.GraphicsLayer r17) {
        /*
            r5 = r17
            boolean r0 = r5.A0F
            r4 = 0
            if (r0 == 0) goto L_0x001c
            X.5dE r3 = r5.A0J
            boolean r0 = r3.Ank()
            if (r0 != 0) goto L_0x001f
            float r1 = r3.Bt8()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x001f
            r12 = 0
        L_0x0019:
            r3.Ef4(r12)
        L_0x001c:
            r5.A0F = r4
            return
        L_0x001f:
            X.60d r1 = r5.A09
            android.graphics.Outline r12 = r5.A07
            if (r1 == 0) goto L_0x0070
            if (r12 != 0) goto L_0x002e
            android.graphics.Outline r12 = new android.graphics.Outline
            r12.<init>()
            r5.A07 = r12
        L_0x002e:
            int r6 = android.os.Build.VERSION.SDK_INT
            r2 = 1
            r0 = 28
            if (r6 > r0) goto L_0x0053
            r0 = r1
            X.60e r0 = (X.C3018160e) r0
            android.graphics.Path r0 = r0.A03
            boolean r0 = r0.isConvex()
            if (r0 != 0) goto L_0x0063
            android.graphics.Outline r0 = r5.A07
            if (r0 == 0) goto L_0x0047
            r0.setEmpty()
        L_0x0047:
            r5.A0G = r2
        L_0x0049:
            r5.A09 = r1
        L_0x004b:
            float r0 = r3.AbF()
            r12.setAlpha(r0)
            goto L_0x0019
        L_0x0053:
            r0 = 30
            if (r6 <= r0) goto L_0x0063
            X.HRO.A00(r12, r1)
        L_0x005a:
            boolean r0 = r12.canClip()
            r0 = r0 ^ 1
            r5.A0G = r0
            goto L_0x0049
        L_0x0063:
            boolean r0 = r1 instanceof X.C3018160e
            if (r0 == 0) goto L_0x00b7
            r0 = r1
            X.60e r0 = (X.C3018160e) r0
            android.graphics.Path r0 = r0.A03
            r12.setConvexPath(r0)
            goto L_0x005a
        L_0x0070:
            if (r12 != 0) goto L_0x0079
            android.graphics.Outline r12 = new android.graphics.Outline
            r12.<init>()
            r5.A07 = r12
        L_0x0079:
            long r0 = r5.A05
            long r10 = X.C289155d7.A01(r0)
            long r0 = r5.A04
            long r6 = r5.A03
            r8 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x008d
            r10 = r6
        L_0x008d:
            float r2 = X.C289295dM.A01(r0)
            int r13 = java.lang.Math.round(r2)
            float r1 = X.C289295dM.A02(r0)
            int r14 = java.lang.Math.round(r1)
            float r0 = X.C288025bF.A02(r10)
            float r2 = r2 + r0
            int r15 = java.lang.Math.round(r2)
            float r0 = X.C288025bF.A00(r10)
            float r1 = r1 + r0
            int r16 = java.lang.Math.round(r1)
            float r0 = r5.A00
            r17 = r0
            r12.setRoundRect(r13, r14, r15, r16, r17)
            goto L_0x004b
        L_0x00b7:
            java.lang.String r1 = "Unable to obtain android.graphics.Path"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.A00(androidx.compose.ui.graphics.layer.GraphicsLayer):void");
    }

    public static final void A01(GraphicsLayer graphicsLayer) {
        if (graphicsLayer.A0E && graphicsLayer.A01 == 0) {
            C289265dJ r2 = graphicsLayer.A0I;
            GraphicsLayer graphicsLayer2 = r2.A02;
            if (graphicsLayer2 != null) {
                graphicsLayer2.A01--;
                A01(graphicsLayer2);
                r2.A02 = null;
            }
            0vq r10 = r2.A00;
            if (r10 != null) {
                Object[] objArr = r10.A03;
                long[] jArr = r10.A02;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((-1 ^ j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i2 = 8 - (((i - length) ^ -1) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    GraphicsLayer graphicsLayer3 = (GraphicsLayer) objArr[(i << 3) + i3];
                                    graphicsLayer3.A01--;
                                    A01(graphicsLayer3);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                r10.A05();
            }
            graphicsLayer.A0J.APS();
        }
    }

    public static final void A02(GraphicsLayer graphicsLayer) {
        C289265dJ r4 = graphicsLayer.A0I;
        r4.A03 = r4.A02;
        0vq r2 = r4.A00;
        if (!(r2 == null || r2.A01 == 0)) {
            0vq r1 = r4.A01;
            if (r1 == null) {
                0vq r0 = AnonymousClass01q.A00;
                r1 = new 0vq(6);
                r4.A01 = r1;
            }
            r1.A07(r2);
            r2.A05();
        }
        r4.A04 = true;
        graphicsLayer.A0J.EAi(graphicsLayer.A0B, graphicsLayer.A0C, graphicsLayer, graphicsLayer.A0D);
        r4.A04 = false;
        GraphicsLayer graphicsLayer2 = r4.A03;
        if (graphicsLayer2 != null) {
            graphicsLayer2.A01--;
            A01(graphicsLayer2);
        }
        0vq r10 = r4.A01;
        if (r10 != null && r10.A01 != 0) {
            Object[] objArr = r10.A03;
            long[] jArr = r10.A02;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((-1 ^ j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i2 = 8 - (((i - length) ^ -1) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                GraphicsLayer graphicsLayer3 = (GraphicsLayer) objArr[(i << 3) + i3];
                                graphicsLayer3.A01--;
                                A01(graphicsLayer3);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            r10.A05();
        }
    }

    public final C289315dO A04() {
        C289315dO r1 = this.A0H;
        C3018060d r0 = this.A09;
        if (r1 == null) {
            if (r0 != null) {
                r1 = new C289335dQ(r0);
            } else {
                long A012 = C289155d7.A01(this.A05);
                long j = this.A04;
                long j2 = this.A03;
                if (j2 != 9205357640488583168L) {
                    A012 = j2;
                }
                float A013 = C289295dM.A01(j);
                float A022 = C289295dM.A02(j);
                float A023 = A013 + C288025bF.A02(A012);
                float A002 = A022 + C288025bF.A00(A012);
                float f = this.A00;
                if (f > 0.0f) {
                    r1 = new C3018460h(AnonymousClass6GU.A00(A013, A022, A023, A002, AnonymousClass6GR.A00(f, f)));
                } else {
                    r1 = new C289305dN(new AnonymousClass5VN(A013, A022, A023, A002));
                }
            }
            this.A0H = r1;
        }
        return r1;
    }

    public final void A05(float f) {
        C289225dE r1 = this.A0J;
        if (r1.AbF() != f) {
            r1.EOX(f);
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.5dJ, java.lang.Object] */
    public GraphicsLayer(C289225dE r6) {
        this.A0J = r6;
        r6.ERg(false);
        this.A06 = 0;
        this.A05 = 0;
        this.A02 = 9205357640488583168L;
    }
}
