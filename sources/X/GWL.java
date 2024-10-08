package X;

import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewParent;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;

public final class GWL implements C289195dB {
    public static final 0sL A0D = GWM.A00;
    public int A00;
    public long A01 = C285605Ry.A01;
    public AnonymousClass5S9 A02;
    public C62320sa A03;
    public 0sL A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final AndroidComposeView A08;
    public final JRP A09;
    public final GSW A0A = new GSW();
    public final AnonymousClass5R2 A0B = new AnonymousClass5R2();
    public final GSU A0C = new GSU(A0D);

    public final void EJI(C62320sa r3, 0sL r4) {
        A00(false);
        this.A06 = false;
        this.A05 = false;
        this.A01 = C285605Ry.A01;
        this.A04 = r4;
        this.A03 = r3;
    }

    private final void A00(boolean z) {
        if (z != this.A07) {
            this.A07 = z;
            this.A08.A0L(this, z);
        }
    }

    public final void CNp(float[] fArr) {
        float[] A002 = this.A0C.A00(this.A09);
        if (A002 != null) {
            AnonymousClass5S4.A05(fArr, A002);
        }
    }

    public final void Cld(C289445db r3, boolean z) {
        float[] fArr;
        GSU gsu = this.A0C;
        JRP jrp = this.A09;
        if (z) {
            fArr = gsu.A00(jrp);
            if (fArr == null) {
                r3.A01 = 0.0f;
                r3.A03 = 0.0f;
                r3.A02 = 0.0f;
                r3.A00 = 0.0f;
                return;
            }
        } else {
            fArr = gsu.A01(jrp);
        }
        AnonymousClass5S4.A01(r3, fArr);
    }

    public final long Cle(long j, boolean z) {
        float[] fArr;
        GSU gsu = this.A0C;
        JRP jrp = this.A09;
        if (z) {
            fArr = gsu.A00(jrp);
            if (fArr == null) {
                return 9187343241974906880L;
            }
        } else {
            fArr = gsu.A01(jrp);
        }
        return AnonymousClass5S4.A00(fArr, j);
    }

    public final void Cod(long j) {
        JRP jrp = this.A09;
        int left = jrp.getLeft();
        int C8J = jrp.C8J();
        int A042 = C51965G9l.A04(j);
        int A022 = C51968G9o.A02(j);
        if (left != A042 || C8J != A022) {
            if (left != A042) {
                jrp.Csl(A042 - left);
            }
            if (C8J != A022) {
                jrp.Cso(A022 - C8J);
            }
            AndroidComposeView androidComposeView = this.A08;
            ViewParent parent = androidComposeView.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(androidComposeView, androidComposeView);
            }
            GSU gsu = this.A0C;
            gsu.A00 = true;
            gsu.A01 = true;
        }
    }

    public final void EIP(long j) {
        int i = (int) (j >> 32);
        int A002 = C289005cr.A00(j);
        JRP jrp = this.A09;
        long j2 = this.A01;
        long j3 = C285605Ry.A01;
        jrp.Efn(C51968G9o.A00(j2) * ((float) i));
        jrp.Efo(C51972G9s.A00(this.A01) * ((float) A002));
        if (jrp.Eg8(jrp.getLeft(), jrp.C8J(), jrp.getLeft() + i, jrp.C8J() + A002)) {
            jrp.Ef4(this.A0A.A01());
            invalidate();
            GSU gsu = this.A0C;
            gsu.A00 = true;
            gsu.A01 = true;
        }
    }

    public final void FHi(float[] fArr) {
        AnonymousClass5S4.A05(fArr, this.A0C.A01(this.A09));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FK9() {
        /*
            r5 = this;
            boolean r0 = r5.A07
            if (r0 != 0) goto L_0x000c
            X.JRP r0 = r5.A09
            boolean r0 = r0.BAw()
            if (r0 != 0) goto L_0x0034
        L_0x000c:
            X.JRP r4 = r5.A09
            boolean r0 = r4.Anp()
            if (r0 == 0) goto L_0x0035
            X.GSW r1 = r5.A0A
            boolean r0 = r1.A07
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0035
            X.GSW.A00(r1)
            X.60d r3 = r1.A04
        L_0x0021:
            X.0sL r2 = r5.A04
            if (r2 == 0) goto L_0x0030
            X.5R2 r1 = r5.A0B
            r0 = 39
            X.J6M r0 = X.J6M.A00(r2, r0)
            r4.EAh(r1, r3, r0)
        L_0x0030:
            r0 = 0
            r5.A00(r0)
        L_0x0034:
            return
        L_0x0035:
            r3 = 0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GWL.FK9():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bf, code lost:
        if (r14.A0I == X.AnonymousClass5S0.A00) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d2, code lost:
        if (r14.A0I != X.AnonymousClass5S0.A00) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if ((!r13.A0A.A07) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FKg(X.AnonymousClass5RT r14) {
        /*
            r13 = this;
            int r4 = r14.A0B
            int r0 = r13.A00
            r4 = r4 | r0
            r6 = r4 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x000d
            long r0 = r14.A0F
            r13.A01 = r0
        L_0x000d:
            X.JRP r3 = r13.A09
            boolean r0 = r3.Anp()
            r2 = 0
            if (r0 == 0) goto L_0x001f
            X.GSW r0 = r13.A0A
            boolean r0 = r0.A07
            r0 = r0 ^ 1
            r5 = 1
            if (r0 == 0) goto L_0x0020
        L_0x001f:
            r5 = 0
        L_0x0020:
            r0 = r4 & 1
            if (r0 == 0) goto L_0x0029
            float r0 = r14.A05
            r3.EjG(r0)
        L_0x0029:
            r0 = r4 & 2
            if (r0 == 0) goto L_0x0032
            float r0 = r14.A06
            r3.EjH(r0)
        L_0x0032:
            r0 = r4 & 4
            if (r0 == 0) goto L_0x003b
            float r0 = r14.A00
            r3.EOX(r0)
        L_0x003b:
            r0 = r4 & 8
            if (r0 == 0) goto L_0x0044
            float r0 = r14.A08
            r3.EpG(r0)
        L_0x0044:
            r0 = r4 & 16
            if (r0 == 0) goto L_0x004d
            float r0 = r14.A09
            r3.EpH(r0)
        L_0x004d:
            r0 = r4 & 32
            if (r0 == 0) goto L_0x0056
            float r0 = r14.A07
            r3.EUx(r0)
        L_0x0056:
            r0 = r4 & 64
            if (r0 == 0) goto L_0x0063
            long r0 = r14.A0C
            int r0 = X.C285595Rx.A00(r0)
            r3.EOb(r0)
        L_0x0063:
            r0 = r4 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0070
            long r0 = r14.A0E
            int r0 = X.C285595Rx.A00(r0)
            r3.Ell(r0)
        L_0x0070:
            r0 = r4 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0079
            float r0 = r14.A04
            r3.Ej5(r0)
        L_0x0079:
            r0 = r4 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0082
            float r0 = r14.A02
            r3.Ej3(r0)
        L_0x0082:
            r0 = r4 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x008b
            float r0 = r14.A03
            r3.Ej4(r0)
        L_0x008b:
            r0 = r4 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0094
            float r0 = r14.A01
            r3.EQN(r0)
        L_0x0094:
            if (r6 == 0) goto L_0x00b6
            long r0 = r13.A01
            long r6 = X.C285605Ry.A01
            float r1 = X.C51971G9r.A01(r0)
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r1 = r1 * r0
            r3.Efn(r1)
            long r0 = r13.A01
            float r1 = X.C51972G9s.A00(r0)
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r1 = r1 * r0
            r3.Efo(r1)
        L_0x00b6:
            boolean r0 = r14.A0L
            if (r0 == 0) goto L_0x00c1
            X.5S2 r1 = r14.A0I
            X.5S2 r0 = X.AnonymousClass5S0.A00
            r12 = 1
            if (r1 != r0) goto L_0x00c2
        L_0x00c1:
            r12 = 0
        L_0x00c2:
            r0 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r0 == 0) goto L_0x00d8
            r3.ERj(r12)
            boolean r0 = r14.A0L
            if (r0 == 0) goto L_0x00d4
            X.5S2 r6 = r14.A0I
            X.5S2 r1 = X.AnonymousClass5S0.A00
            r0 = 1
            if (r6 == r1) goto L_0x00d5
        L_0x00d4:
            r0 = 0
        L_0x00d5:
            r3.ERi(r0)
        L_0x00d8:
            r0 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r4
            if (r0 == 0) goto L_0x00e2
            X.HQg r0 = r14.A0H
            r3.EiT(r0)
        L_0x00e2:
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r4
            if (r0 == 0) goto L_0x00ed
            int r0 = r14.A0A
            r3.ESY(r0)
        L_0x00ed:
            X.GSW r6 = r13.A0A
            X.5dO r7 = r14.A0G
            float r8 = r14.A00
            float r9 = r14.A07
            long r10 = r14.A0D
            boolean r1 = r6.A04(r7, r8, r9, r10, r12)
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x0106
            android.graphics.Outline r0 = r6.A01()
            r3.Ef4(r0)
        L_0x0106:
            if (r12 == 0) goto L_0x010f
            boolean r0 = r6.A07
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x010f
            r2 = 1
        L_0x010f:
            if (r5 != r2) goto L_0x0115
            if (r2 == 0) goto L_0x013c
            if (r1 == 0) goto L_0x013c
        L_0x0115:
            r13.invalidate()
        L_0x0118:
            boolean r0 = r13.A05
            if (r0 != 0) goto L_0x012c
            float r1 = r3.B0b()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x012c
            X.0sa r0 = r13.A03
            if (r0 == 0) goto L_0x012c
            r0.invoke()
        L_0x012c:
            r0 = r4 & 7963(0x1f1b, float:1.1159E-41)
            if (r0 == 0) goto L_0x0137
            X.GSU r1 = r13.A0C
            r0 = 1
            r1.A00 = r0
            r1.A01 = r0
        L_0x0137:
            int r0 = r14.A0B
            r13.A00 = r0
            return
        L_0x013c:
            androidx.compose.ui.platform.AndroidComposeView r1 = r13.A08
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x0118
            r0.onDescendantInvalidated(r1, r1)
            goto L_0x0118
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GWL.FKg(X.5RT):void");
    }

    public final void destroy() {
        JRP jrp = this.A09;
        if (jrp.BAw()) {
            jrp.APS();
        }
        this.A04 = null;
        this.A03 = null;
        this.A06 = true;
        A00(false);
        AndroidComposeView androidComposeView = this.A08;
        androidComposeView.A09 = true;
        androidComposeView.A0K(this);
    }

    public final void invalidate() {
        if (!this.A07 && !this.A06) {
            this.A08.invalidate();
            A00(true);
        }
    }

    public GWL(AndroidComposeView androidComposeView, C62320sa r4, 0sL r5) {
        JRP xfg;
        this.A08 = androidComposeView;
        this.A04 = r5;
        this.A03 = r4;
        if (Build.VERSION.SDK_INT >= 29) {
            xfg = new C56883IGe(androidComposeView);
        } else {
            xfg = new XFG(androidComposeView);
        }
        JRP jrp = xfg;
        jrp.EYb(true);
        jrp.ERi(false);
        this.A09 = jrp;
    }

    public final void AQh(AnonymousClass5QA r11, GraphicsLayer graphicsLayer) {
        Canvas A002 = AnonymousClass5R4.A00(r11);
        boolean z = false;
        if (A002.isHardwareAccelerated()) {
            FK9();
            JRP jrp = this.A09;
            if (jrp.B0b() > 0.0f) {
                z = true;
            }
            this.A05 = z;
            if (z) {
                r11.ARm();
            }
            jrp.AQg(A002);
            if (this.A05) {
                r11.APQ();
                return;
            }
            return;
        }
        JRP jrp2 = this.A09;
        float left = (float) jrp2.getLeft();
        float C8J = (float) jrp2.C8J();
        float right = (float) jrp2.getRight();
        float AhC = (float) jrp2.AhC();
        if (jrp2.AbF() < 1.0f) {
            AnonymousClass5S9 r1 = this.A02;
            if (r1 == null) {
                r1 = new AnonymousClass5S8();
                this.A02 = r1;
            }
            r1.EOX(jrp2.AbF());
            A002.saveLayer(left, C8J, right, AhC, ((AnonymousClass5S8) r1).A01);
        } else {
            r11.EJt();
        }
        r11.FHv(left, C8J);
        r11.AIt(this.A0C.A01(jrp2));
        if (jrp2.Anp() || jrp2.Ano()) {
            this.A0A.A02(r11);
        }
        0sL r12 = this.A04;
        if (r12 != null) {
            r12.invoke(r11, (Object) null);
        }
        r11.EIm();
        A00(false);
    }

    public final boolean CV6(long j) {
        float A012 = C289295dM.A01(j);
        float A022 = C289295dM.A02(j);
        JRP jrp = this.A09;
        if (jrp.Ano()) {
            if (0.0f > A012 || A012 >= ((float) jrp.getWidth()) || 0.0f > A022 || A022 >= ((float) jrp.getHeight())) {
                return false;
            }
        } else if (jrp.Anp()) {
            return this.A0A.A03(j);
        }
        return true;
    }
}
