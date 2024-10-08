package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.5dV  reason: invalid class name and case insensitive filesystem */
public final class C289385dV extends View implements C289195dB {
    public static Field A0F;
    public static Method A0G;
    public static boolean A0H;
    public static boolean A0I;
    public static final ViewOutlineProvider A0J = new C289415dY();
    public static final C289395dW A0K = new Object();
    public static final 0sL A0L = C289405dX.A00;
    public boolean A00;
    public int A01;
    public long A02 = C285605Ry.A01;
    public Rect A03;
    public C62320sa A04;
    public 0sL A05;
    public boolean A06;
    public boolean A07;
    public boolean A08 = true;
    public final GSW A09 = new GSW();
    public final long A0A;
    public final AnonymousClass5R2 A0B = new AnonymousClass5R2();
    public final AndroidComposeView A0C;
    public final GSS A0D;
    public final GSU A0E = new GSU(A0L);

    public final void EJI(C62320sa r3, 0sL r4) {
        this.A0D.addView(this);
        this.A06 = false;
        this.A07 = false;
        this.A02 = C285605Ry.A01;
        this.A05 = r4;
        this.A04 = r3;
    }

    public final void destroy() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.A0C;
        androidComposeView.A09 = true;
        this.A05 = null;
        this.A04 = null;
        androidComposeView.A0K(this);
        this.A0D.removeViewInLayout(this);
    }

    public final void forceLayout() {
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    private final void A00() {
        Rect rect;
        if (this.A06) {
            Rect rect2 = this.A03;
            if (rect2 == null) {
                this.A03 = new Rect(0, 0, getWidth(), getHeight());
            } else {
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.A03;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void setInvalidated(boolean z) {
        if (z != this.A00) {
            this.A00 = z;
            this.A0C.A0L(this, z);
        }
    }

    public final void CNp(float[] fArr) {
        float[] A002 = this.A0E.A00(this);
        if (A002 != null) {
            AnonymousClass5S4.A05(fArr, A002);
        }
    }

    public final void Cld(C289445db r2, boolean z) {
        float[] fArr;
        GSU gsu = this.A0E;
        if (z) {
            fArr = gsu.A00(this);
            if (fArr == null) {
                r2.A01 = 0.0f;
                r2.A03 = 0.0f;
                r2.A02 = 0.0f;
                r2.A00 = 0.0f;
                return;
            }
        } else {
            fArr = gsu.A01(this);
        }
        AnonymousClass5S4.A01(r2, fArr);
    }

    public final long Cle(long j, boolean z) {
        float[] fArr;
        GSU gsu = this.A0E;
        if (z) {
            fArr = gsu.A00(this);
            if (fArr == null) {
                return 9187343241974906880L;
            }
        } else {
            fArr = gsu.A01(this);
        }
        return AnonymousClass5S4.A00(fArr, j);
    }

    public final void Cod(long j) {
        int i = (int) (j >> 32);
        if (i != getLeft()) {
            offsetLeftAndRight(i - getLeft());
            GSU gsu = this.A0E;
            gsu.A00 = true;
            gsu.A01 = true;
        }
        int i2 = (int) (j & 4294967295L);
        if (i2 != getTop()) {
            offsetTopAndBottom(i2 - getTop());
            GSU gsu2 = this.A0E;
            gsu2.A00 = true;
            gsu2.A01 = true;
        }
    }

    public final void EIP(long j) {
        ViewOutlineProvider viewOutlineProvider;
        int i = (int) (j >> 32);
        int A002 = C289005cr.A00(j);
        if (i != getWidth() || A002 != getHeight()) {
            long j2 = this.A02;
            long j3 = C285605Ry.A01;
            setPivotX(Float.intBitsToFloat((int) (j2 >> 32)) * ((float) i));
            setPivotY(Float.intBitsToFloat((int) (this.A02 & 4294967295L)) * ((float) A002));
            if (this.A09.A01() != null) {
                viewOutlineProvider = A0J;
            } else {
                viewOutlineProvider = null;
            }
            setOutlineProvider(viewOutlineProvider);
            layout(getLeft(), getTop(), getLeft() + i, getTop() + A002);
            A00();
            GSU gsu = this.A0E;
            gsu.A00 = true;
            gsu.A01 = true;
        }
    }

    public final void FHi(float[] fArr) {
        AnonymousClass5S4.A05(fArr, this.A0E.A01(this));
    }

    public final void FK9() {
        if (this.A00 && !A0I) {
            A0K.A00(this);
            setInvalidated(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a2, code lost:
        if (r14.A0I == X.AnonymousClass5S0.A00) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b0, code lost:
        if (r14.A0I != X.AnonymousClass5S0.A00) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FKg(X.AnonymousClass5RT r14) {
        /*
            r13 = this;
            int r2 = r14.A0B
            int r0 = r13.A01
            r2 = r2 | r0
            r0 = r2 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0036
            long r3 = r14.A0F
            r13.A02 = r3
            long r0 = X.C285605Ry.A01
            r0 = 32
            long r3 = r3 >> r0
            int r0 = (int) r3
            float r1 = java.lang.Float.intBitsToFloat(r0)
            int r0 = r13.getWidth()
            float r0 = (float) r0
            float r1 = r1 * r0
            r13.setPivotX(r1)
            long r3 = r13.A02
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
            int r0 = (int) r3
            float r1 = java.lang.Float.intBitsToFloat(r0)
            int r0 = r13.getHeight()
            float r0 = (float) r0
            float r1 = r1 * r0
            r13.setPivotY(r1)
        L_0x0036:
            r0 = r2 & 1
            if (r0 == 0) goto L_0x003f
            float r0 = r14.A05
            r13.setScaleX(r0)
        L_0x003f:
            r0 = r2 & 2
            if (r0 == 0) goto L_0x0048
            float r0 = r14.A06
            r13.setScaleY(r0)
        L_0x0048:
            r0 = r2 & 4
            if (r0 == 0) goto L_0x0051
            float r0 = r14.A00
            r13.setAlpha(r0)
        L_0x0051:
            r0 = r2 & 8
            if (r0 == 0) goto L_0x005a
            float r0 = r14.A08
            r13.setTranslationX(r0)
        L_0x005a:
            r0 = r2 & 16
            if (r0 == 0) goto L_0x0063
            float r0 = r14.A09
            r13.setTranslationY(r0)
        L_0x0063:
            r0 = r2 & 32
            if (r0 == 0) goto L_0x006c
            float r0 = r14.A07
            r13.setElevation(r0)
        L_0x006c:
            r0 = r2 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0075
            float r0 = r14.A04
            r13.setRotation(r0)
        L_0x0075:
            r0 = r2 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x007e
            float r0 = r14.A02
            r13.setRotationX(r0)
        L_0x007e:
            r0 = r2 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0087
            float r0 = r14.A03
            r13.setRotationY(r0)
        L_0x0087:
            r0 = r2 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0090
            float r0 = r14.A01
            r13.setCameraDistancePx(r0)
        L_0x0090:
            X.60d r0 = r13.getManualClipPath()
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x0099
            r4 = 1
        L_0x0099:
            boolean r5 = r14.A0L
            if (r5 == 0) goto L_0x00a4
            X.5S2 r1 = r14.A0I
            X.5S2 r0 = X.AnonymousClass5S0.A00
            r12 = 1
            if (r1 != r0) goto L_0x00a5
        L_0x00a4:
            r12 = 0
        L_0x00a5:
            r0 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r0 == 0) goto L_0x00bb
            if (r5 == 0) goto L_0x00b2
            X.5S2 r5 = r14.A0I
            X.5S2 r1 = X.AnonymousClass5S0.A00
            r0 = 1
            if (r5 == r1) goto L_0x00b3
        L_0x00b2:
            r0 = 0
        L_0x00b3:
            r13.A06 = r0
            r13.A00()
            r13.setClipToOutline(r12)
        L_0x00bb:
            X.GSW r6 = r13.A09
            X.5dO r7 = r14.A0G
            float r8 = r14.A00
            float r9 = r14.A07
            long r10 = r14.A0D
            boolean r5 = r6.A04(r7, r8, r9, r10, r12)
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x00d8
            android.graphics.Outline r0 = r6.A01()
            if (r0 == 0) goto L_0x0152
            android.view.ViewOutlineProvider r0 = A0J
        L_0x00d5:
            r13.setOutlineProvider(r0)
        L_0x00d8:
            X.60d r1 = r13.getManualClipPath()
            r0 = 0
            if (r1 == 0) goto L_0x00e0
            r0 = 1
        L_0x00e0:
            if (r4 != r0) goto L_0x00e6
            if (r0 == 0) goto L_0x00e9
            if (r5 == 0) goto L_0x00e9
        L_0x00e6:
            r13.invalidate()
        L_0x00e9:
            boolean r0 = r13.A07
            if (r0 != 0) goto L_0x00fd
            float r1 = r13.getElevation()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fd
            X.0sa r0 = r13.A04
            if (r0 == 0) goto L_0x00fd
            r0.invoke()
        L_0x00fd:
            r0 = r2 & 7963(0x1f1b, float:1.1159E-41)
            if (r0 == 0) goto L_0x0108
            X.GSU r1 = r13.A0E
            r0 = 1
            r1.A00 = r0
            r1.A01 = r0
        L_0x0108:
            r0 = r2 & 64
            if (r0 == 0) goto L_0x0115
            long r0 = r14.A0C
            int r0 = X.C285595Rx.A00(r0)
            r13.setOutlineAmbientShadowColor(r0)
        L_0x0115:
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0122
            long r0 = r14.A0E
            int r0 = X.C285595Rx.A00(r0)
            r13.setOutlineSpotShadowColor(r0)
        L_0x0122:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x0132
            r0 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0132
            X.HQg r0 = r14.A0H
            X.C54746HRe.A00(r13, r0)
        L_0x0132:
            r0 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0149
            int r2 = r14.A0A
            r1 = 1
            r0 = 0
            if (r2 != r1) goto L_0x013f
            r0 = 1
        L_0x013f:
            r1 = 0
            if (r0 == 0) goto L_0x014e
            r0 = 2
            r13.setLayerType(r0, r1)
        L_0x0146:
            r0 = 1
            r13.A08 = r0
        L_0x0149:
            int r0 = r14.A0B
            r13.A01 = r0
            return
        L_0x014e:
            r13.setLayerType(r3, r1)
            goto L_0x0146
        L_0x0152:
            r0 = 0
            goto L_0x00d5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C289385dV.FKg(X.5RT):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r7.isHardwareAccelerated() == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispatchDraw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            X.5R2 r0 = r6.A0B
            X.5R3 r5 = r0.A00
            android.graphics.Canvas r4 = r5.A00
            r5.A00 = r7
            X.60d r0 = r6.getManualClipPath()
            r3 = 0
            if (r0 != 0) goto L_0x0016
            boolean r0 = r7.isHardwareAccelerated()
            r2 = 0
            if (r0 != 0) goto L_0x001f
        L_0x0016:
            r2 = 1
            r5.EJt()
            X.GSW r0 = r6.A09
            r0.A02(r5)
        L_0x001f:
            X.0sL r1 = r6.A05
            if (r1 == 0) goto L_0x0027
            r0 = 0
            r1.invoke(r5, r0)
        L_0x0027:
            if (r2 == 0) goto L_0x002c
            r5.EIm()
        L_0x002c:
            r5.A00 = r4
            r6.setInvalidated(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C289385dV.dispatchDraw(android.graphics.Canvas):void");
    }

    public final GSS getContainer() {
        return this.A0D;
    }

    public long getLayerId() {
        return this.A0A;
    }

    public final AndroidComposeView getOwnerView() {
        return this.A0C;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return XU9.A00(this.A0C);
        }
        return -1;
    }

    public final boolean hasOverlappingRendering() {
        return this.A08;
    }

    public C289385dV(AndroidComposeView androidComposeView, GSS gss, C62320sa r5, 0sL r6) {
        super(androidComposeView.getContext());
        this.A0C = androidComposeView;
        this.A0D = gss;
        this.A05 = r6;
        this.A04 = r5;
        setWillNotDraw(false);
        gss.addView(this);
        this.A0A = (long) View.generateViewId();
    }

    private final C3018060d getManualClipPath() {
        if (!getClipToOutline()) {
            return null;
        }
        GSW gsw = this.A09;
        if (!gsw.A07) {
            return null;
        }
        GSW.A00(gsw);
        return gsw.A04;
    }

    public final void AQh(AnonymousClass5QA r4, GraphicsLayer graphicsLayer) {
        boolean z = false;
        if (getElevation() > 0.0f) {
            z = true;
        }
        this.A07 = z;
        if (z) {
            r4.ARm();
        }
        this.A0D.A00(this, r4, getDrawingTime());
        if (this.A07) {
            r4.APQ();
        }
    }

    public final boolean CV6(long j) {
        float A012 = C289295dM.A01(j);
        float A022 = C289295dM.A02(j);
        if (this.A06) {
            if (0.0f > A012 || A012 >= ((float) getWidth()) || 0.0f > A022 || A022 >= ((float) getHeight())) {
                return false;
            }
        } else if (getClipToOutline()) {
            return this.A09.A03(j);
        }
        return true;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / ((float) getResources().getDisplayMetrics().densityDpi);
    }

    public final void invalidate() {
        int A032 = AnonymousClass0fD.A03(-1441561288);
        if (!this.A00) {
            setInvalidated(true);
            super.invalidate();
            this.A0C.invalidate();
        }
        AnonymousClass0fD.A0A(-1432923878, A032);
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * ((float) getResources().getDisplayMetrics().densityDpi));
    }
}
