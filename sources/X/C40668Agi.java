package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.Agi  reason: case insensitive filesystem */
public final class C40668Agi implements AnonymousClass88G {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public C369658v7 A04;
    public B3f A05;
    public boolean A06;
    public final InteractiveDrawableContainer A07;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final Sensor A0B;
    public final SensorEventListener A0C;
    public final SensorManager A0D;
    public final Handler A0E = AnonymousClass7TF.A0D();

    public C40668Agi(InteractiveDrawableContainer interactiveDrawableContainer) {
        SensorManager sensorManager;
        this.A07 = interactiveDrawableContainer;
        Context A0S = AnonymousClass7TE.A0S(interactiveDrawableContainer);
        this.A0A = A0S;
        this.A09 = interactiveDrawableContainer.getWidth();
        this.A08 = interactiveDrawableContainer.getHeight();
        Object systemService = A0S.getSystemService("sensor");
        Sensor sensor = null;
        if (systemService instanceof SensorManager) {
            sensorManager = (SensorManager) systemService;
        } else {
            sensorManager = null;
        }
        this.A0D = sensorManager;
        this.A0B = sensorManager != null ? sensorManager.getDefaultSensor(1) : sensor;
        this.A0C = new ALC(this, 2);
    }

    public final void A01() {
        this.A04 = null;
        this.A05 = null;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 0.0f;
        this.A06 = false;
        this.A01 = 0.0f;
        SensorManager sensorManager = this.A0D;
        if (sensorManager != null) {
            C60240fb.A00(this.A0C, sensorManager);
        }
        this.A07.A0z(this);
        this.A0E.removeCallbacksAndMessages((Object) null);
    }

    public final void CtK(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        if (drawable instanceof C369658v7) {
            this.A06 = true;
        }
    }

    public final void CtX() {
        this.A06 = false;
    }

    public final /* synthetic */ void CtY() {
    }

    public final void CuV(Drawable drawable, int i) {
        0qQ.A0B(drawable, 1);
        if (drawable instanceof C369658v7) {
            C369658v7 r5 = (C369658v7) drawable;
            this.A04 = r5;
            this.A05 = this.A07.A0P(i);
            int i2 = r5.A01;
            this.A03 = i2;
            this.A02 = i2;
            SensorManager sensorManager = this.A0D;
            if (sensorManager != null) {
                C60240fb.A01(this.A0B, this.A0C, sensorManager, 3);
            }
            A00(this);
        }
    }

    public final /* synthetic */ void DAq(Drawable drawable, int i) {
    }

    public final /* synthetic */ void DAr(float f, float f2) {
    }

    public final /* synthetic */ void DAs(Drawable drawable) {
    }

    public final /* synthetic */ void DP7(Drawable drawable, int i, float f, float f2) {
    }

    public final /* synthetic */ void DPH() {
    }

    public final void DdI(Drawable drawable, int i, boolean z) {
        0qQ.A0B(drawable, 1);
        if (drawable instanceof C369658v7) {
            A01();
        }
    }

    public final /* synthetic */ void DhH(Drawable drawable, float f, float f2, float f3, float f4) {
    }

    public final /* synthetic */ void DlC(Drawable drawable, int i, float f, float f2) {
    }

    public final /* synthetic */ void DlE(Drawable drawable, float f, float f2, float f3, float f4, int i) {
    }

    public final /* synthetic */ void Dsb() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C40668Agi r14) {
        /*
            X.B3f r0 = r14.A05
            if (r0 == 0) goto L_0x012d
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r6 = r14.A07
            boolean r0 = r6.isAttachedToWindow()
            if (r0 == 0) goto L_0x012d
            boolean r0 = r14.A06
            if (r0 != 0) goto L_0x0121
            X.B3f r0 = r14.A05
            r13 = 0
            if (r0 == 0) goto L_0x013c
            X.9Qs r0 = (X.C378669Qs) r0
            float r10 = r0.A01
        L_0x0019:
            float r1 = r14.A00
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = r1 * r0
            r4 = -1054867456(0xffffffffc1200000, float:-10.0)
            r3 = 1092616192(0x41200000, float:10.0)
            float r12 = X.C229632nm.A02(r1, r4, r3)
            float r0 = java.lang.Math.abs(r12)
            r11 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0031
            r12 = 0
        L_0x0031:
            float r5 = r10 + r12
            int r2 = r14.A09
            int r0 = -r2
            float r8 = (float) r0
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r9
            int r0 = r14.A03
            float r0 = (float) r0
            float r0 = r0 / r9
            float r1 = r8 + r0
            float r7 = (float) r2
            float r7 = r7 / r9
            float r0 = r7 - r0
            float r5 = X.C229632nm.A02(r5, r1, r0)
            r2 = 1
            int r0 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0065
            int r0 = r14.A03
            float r1 = (float) r0
            float r1 = r1 / r9
            float r8 = r8 + r1
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x005b
            float r7 = r7 - r1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x005e
        L_0x005b:
            r6.performHapticFeedback(r2)
        L_0x005e:
            X.B3f r0 = r14.A05
            if (r0 == 0) goto L_0x0065
            r0.EeI(r5)
        L_0x0065:
            int r0 = r14.A08
            float r8 = (float) r0
            float r8 = r8 / r9
            int r0 = r14.A02
            float r0 = (float) r0
            float r0 = r0 / r9
            float r8 = r8 - r0
            X.B3f r0 = r14.A05
            if (r0 == 0) goto L_0x0139
            X.9Qs r0 = (X.C378669Qs) r0
            float r7 = r0.A02
        L_0x0076:
            float r5 = r8 - r7
            r1 = -1027080192(0xffffffffc2c80000, float:-100.0)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = X.C229632nm.A02(r5, r1, r0)
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0093
            float r7 = r7 + r1
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x008c
            r6.performHapticFeedback(r2)
        L_0x008c:
            X.B3f r0 = r14.A05
            if (r0 == 0) goto L_0x0093
            r0.EeJ(r7)
        L_0x0093:
            X.B3f r0 = r14.A05
            if (r0 == 0) goto L_0x0136
            X.9Qs r0 = (X.C378669Qs) r0
            float r6 = r0.A04
            float r0 = r0.A00
            float r6 = r6 * r0
        L_0x009e:
            float r5 = r11 - r6
            r1 = -1110651699(0xffffffffbdcccccd, float:-0.1)
            r0 = 1036831949(0x3dcccccd, float:0.1)
            float r1 = X.C229632nm.A02(r5, r1, r0)
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x00b6
            X.B3f r0 = r14.A05
            if (r0 == 0) goto L_0x00b6
            float r6 = r6 + r1
            r0.EjE(r6)
        L_0x00b6:
            X.B3f r0 = r14.A05
            if (r0 == 0) goto L_0x0134
            X.9Qs r0 = (X.C378669Qs) r0
            float r5 = r0.A03
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c7
            r0 = 1135869952(0x43b40000, float:360.0)
            float r5 = r5 + r0
        L_0x00c7:
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d0
            r0 = 1135869952(0x43b40000, float:360.0)
            float r5 = r5 - r0
        L_0x00d0:
            float r0 = r13 - r5
            float r1 = X.C229632nm.A02(r0, r4, r3)
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x00e2
            X.B3f r0 = r14.A05
            if (r0 == 0) goto L_0x00e2
            float r5 = r5 + r1
            r0.Ej2(r5)
        L_0x00e2:
            float r5 = java.lang.Math.abs(r12)
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x012e
            float r1 = r14.A01
            float r1 = r1 + r5
            r14.A01 = r1
            X.8v7 r4 = r14.A04
            if (r4 == 0) goto L_0x010b
            r0 = 1112014848(0x42480000, float:50.0)
            float r1 = r1 / r0
            int r0 = (int) r1
            int r0 = r0 % 2
            int r3 = r0 + 1
        L_0x00fb:
            android.graphics.drawable.LevelListDrawable r1 = r4.A02
            if (r1 == 0) goto L_0x0108
            int r0 = r1.getLevel()
            if (r3 == r0) goto L_0x010b
            r1.setLevel(r3)
        L_0x0108:
            r4.invalidateSelf()
        L_0x010b:
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0121
            X.8v7 r1 = r14.A04
            if (r1 == 0) goto L_0x0121
            int r0 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x0118
            r2 = 0
        L_0x0118:
            boolean r0 = r1.A00
            if (r0 == r2) goto L_0x0121
            r1.A00 = r2
            r1.invalidateSelf()
        L_0x0121:
            android.os.Handler r3 = r14.A0E
            X.Ajt r2 = new X.Ajt
            r2.<init>(r14)
            r0 = 16
            r3.postDelayed(r2, r0)
        L_0x012d:
            return
        L_0x012e:
            X.8v7 r4 = r14.A04
            if (r4 == 0) goto L_0x010b
            r3 = 0
            goto L_0x00fb
        L_0x0134:
            r5 = 0
            goto L_0x00d0
        L_0x0136:
            r6 = 0
            goto L_0x009e
        L_0x0139:
            r7 = 0
            goto L_0x0076
        L_0x013c:
            r10 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40668Agi.A00(X.Agi):void");
    }
}
