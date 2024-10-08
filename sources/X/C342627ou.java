package X;

import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* renamed from: X.7ou  reason: invalid class name and case insensitive filesystem */
public final class C342627ou {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public Rect A04;
    public Rect A05;
    public C342707p2 A06;
    public C342737p5 A07;
    public C342687p0 A08;
    public List A09;
    public List A0A;
    public boolean A0B;
    public MeteringRectangle[] A0C;
    public MeteringRectangle[] A0D;
    public final Handler A0E = new Handler(Looper.getMainLooper(), new C342637ov(this));
    public final C3496981j A0F = new C3496981j();

    private float A00(float f) {
        float floatValue;
        Object obj;
        List list = this.A0A;
        List list2 = this.A09;
        if (list == null || list2 == null) {
            return 0.0f;
        }
        float A012 = A01(f, -1.0f, 1.0f, (float) this.A03, (float) this.A02);
        double d = (double) A012;
        int floor = (int) Math.floor(d);
        int ceil = (int) Math.ceil(d);
        if (A012 >= 0.0f) {
            floatValue = ((Number) list.get(floor)).floatValue() / 100.0f;
            obj = list.get(ceil);
        } else {
            floatValue = ((Number) list2.get(-floor)).floatValue() / 100.0f;
            obj = list2.get(-ceil);
        }
        return A01(A012, (float) floor, (float) ceil, floatValue, ((Number) obj).floatValue() / 100.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0066, code lost:
        if (r2 == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r10 < r9) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        if (r10 == r9) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float A01(float r6, float r7, float r8, float r9, float r10) {
        /*
            int r0 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0009
            int r0 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            r1 = 0
            if (r0 >= 0) goto L_0x000a
        L_0x0009:
            r1 = 1
        L_0x000a:
            int r0 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0013
            int r0 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            r2 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            if (r1 != 0) goto L_0x002d
            if (r2 != 0) goto L_0x002d
            int r0 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x002c
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x002c
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0025
            return r10
        L_0x0025:
            float r6 = r6 - r7
            float r8 = r8 - r7
            float r6 = r6 / r8
            float r10 = r10 - r9
            float r6 = r6 * r10
            float r6 = r6 + r9
            return r6
        L_0x002c:
            return r9
        L_0x002d:
            java.lang.String r4 = ""
            if (r1 == 0) goto L_0x0064
            java.lang.String r1 = "invalid range bounds"
            if (r2 == 0) goto L_0x0065
            java.lang.String r0 = " & "
        L_0x0037:
            java.lang.String r4 = "zero source range"
        L_0x0039:
            java.lang.String r3 = "Camera2Device"
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Float r5 = java.lang.Float.valueOf(r6)
            java.lang.Float r6 = java.lang.Float.valueOf(r7)
            java.lang.Float r7 = java.lang.Float.valueOf(r8)
            java.lang.Float r8 = java.lang.Float.valueOf(r9)
            java.lang.Float r9 = java.lang.Float.valueOf(r10)
            java.lang.String r10 = X.002.A0g(r1, r0, r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r6, r7, r8, r9, r10}
            java.lang.String r0 = "Projecting zoom value %.3f from [%.2f, %.2f] to [%.2f, %.2f] failed - %s"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            X.C340577lU.A02(r3, r0)
            r6 = 0
            return r6
        L_0x0064:
            r1 = r4
        L_0x0065:
            r0 = r4
            if (r2 == 0) goto L_0x0039
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C342627ou.A01(float, float, float, float, float):float");
    }

    public static void A03(C340597lW r5, C340837lu r6) {
        float A062 = r5.A07.A06();
        C342627ou r1 = r5.A07;
        Rect rect = r1.A04;
        MeteringRectangle[] A042 = A04(r1, r1.A0D);
        C342627ou r12 = r5.A07;
        r6.A07(rect, A042, A04(r12, r12.A0C), A062);
    }

    public static MeteringRectangle[] A04(C342627ou r3, MeteringRectangle[] meteringRectangleArr) {
        C342687p0 r0 = r3.A08;
        C342707p2 r2 = r3.A06;
        Rect rect = r3.A04;
        if (r0 == null || !r3.A0B) {
            if (r2 == null || rect == null) {
                throw new IllegalStateException("Creating Metering Rects for zoom with mCameraSettings or mCropRectangle null.");
            }
            Object A022 = r2.A02(C342717p3.A11);
            A022.getClass();
            if (((Number) A022).intValue() != 0) {
                return new MeteringRectangle[]{new MeteringRectangle(new Rect(0, 0, rect.width(), rect.height()), 0)};
            }
        }
        return meteringRectangleArr;
    }

    public final float A05() {
        C342707p2 r1 = this.A06;
        if (r1 == null) {
            return -1.0f;
        }
        Object A022 = r1.A02(C342717p3.A0t);
        A022.getClass();
        return ((Number) A022).floatValue();
    }

    public final int A07() {
        C342707p2 r1 = this.A06;
        if (r1 == null) {
            return 0;
        }
        Object A022 = r1.A02(C342717p3.A11);
        A022.getClass();
        return ((Number) A022).intValue();
    }

    public final Rect A08(Rect rect) {
        Rect rect2 = this.A05;
        Rect rect3 = this.A04;
        if (rect2 == null || rect3 == null) {
            return rect;
        }
        float width = ((float) rect3.width()) / ((float) rect2.width());
        float height = ((float) rect3.height()) / ((float) rect2.height());
        int width2 = (rect2.width() - rect3.width()) / 2;
        int height2 = (rect2.height() - rect3.height()) / 2;
        int centerX = (int) ((((float) rect.centerX()) * width) + ((float) width2));
        int centerY = (int) ((((float) rect.centerY()) * height) + ((float) height2));
        Rect rect4 = new Rect(centerX, centerY, centerX, centerY);
        rect4.inset((-rect.width()) / 2, (-rect.height()) / 2);
        return rect4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0089, code lost:
        if (r2 >= r1) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A09(float r10, boolean r11) {
        /*
            r9 = this;
            X.7p0 r1 = r9.A08
            X.7p2 r0 = r9.A06
            X.7p5 r7 = r9.A07
            android.graphics.Rect r5 = r9.A05
            android.graphics.Rect r4 = r9.A04
            java.util.List r3 = r9.A0A
            r2 = 0
            if (r0 == 0) goto L_0x001d
            if (r7 == 0) goto L_0x001d
            if (r1 == 0) goto L_0x001d
            if (r3 == 0) goto L_0x001d
            boolean r0 = r9.A0B
            if (r0 == 0) goto L_0x001e
            java.util.List r0 = r9.A09
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            return r2
        L_0x001e:
            if (r4 == 0) goto L_0x001d
            if (r5 == 0) goto L_0x001d
            float r0 = r9.A05()
            float r0 = r10 - r0
            float r1 = java.lang.Math.abs(r0)
            float r0 = r9.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x001d
            float r2 = r9.A05()
            float r1 = r9.A01
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0082
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0082
            r8 = 1
        L_0x0041:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            int r0 = r3.size()
            r3 = 1
            int r0 = r0 - r3
            float r0 = (float) r0
            float r0 = A01(r10, r6, r2, r1, r0)
            int r6 = (int) r0
            X.7p4 r2 = X.C342717p3.A11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            X.7p7 r0 = r7.A00
            r0.A01(r2, r1)
            r7.A00()
            X.7p4 r2 = X.C342717p3.A0t
            java.lang.Float r1 = java.lang.Float.valueOf(r10)
            X.7p7 r0 = r7.A00
            r0.A01(r2, r1)
            r7.A00()
            boolean r0 = r9.A0B
            if (r0 == 0) goto L_0x008d
            if (r11 != 0) goto L_0x0081
            android.os.Handler r1 = r9.A0E
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            android.os.Message r0 = r1.obtainMessage(r3, r6, r3, r0)
            r1.sendMessage(r0)
        L_0x0081:
            return r3
        L_0x0082:
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x008b
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            r8 = 2
            if (r0 < 0) goto L_0x0041
        L_0x008b:
            r8 = 0
            goto L_0x0041
        L_0x008d:
            float r0 = r9.A00(r10)
            A02(r5, r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C342627ou.A09(float, boolean):boolean");
    }

    public static void A02(Rect rect, Rect rect2, float f) {
        int width = rect.width();
        int height = rect.height();
        double d = ((double) f) * 2.0d;
        int i = (int) (((double) width) / d);
        int i2 = (int) (((double) height) / d);
        int i3 = width / 2;
        int i4 = height / 2;
        rect2.set(i3 - i, i4 - i2, i3 + i, i4 + i2);
    }

    public final float A06() {
        return A00(A05()) * 100.0f;
    }
}
