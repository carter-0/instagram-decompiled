package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import java.util.HashMap;

public final class U16 extends Drawable {
    public static final HashMap A0B;
    public long A00 = -1;
    public Integer A01 = AnonymousClass05K.A01;
    public String A02;
    public String A03;
    public C17880VhX A04;
    public Integer A05 = AnonymousClass05K.A00;
    public float[][] A06;
    public final Paint A07;
    public final Rect A08 = new Rect();
    public final RectF A09 = new RectF();
    public final DecelerateInterpolator A0A = new DecelerateInterpolator();

    public final int getOpacity() {
        return -3;
    }

    static {
        HashMap hashMap = new HashMap();
        A0B = hashMap;
        C66581MXm.A1S(C16526UwV.QR_VERSION, hashMap, 6);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:2|3|(2:5|6)|7|8|(5:11|(4:14|(2:16|27)(2:17|26)|18|12)|25|19|9)|24|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0021 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041 A[Catch:{ V1s -> 0x0079 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.U16 r11) {
        /*
            java.lang.String r2 = r11.A02
            if (r2 == 0) goto L_0x007f
            java.lang.Integer r1 = r11.A01     // Catch:{ V1s -> 0x0079 }
            r0 = 0
            X.VhX r0 = X.C18705VyW.A00(r1, r2, r0)     // Catch:{ V1s -> 0x0079 }
            r11.A04 = r0     // Catch:{ V1s -> 0x0079 }
            X.Vgd r0 = r0.A03     // Catch:{ V1s -> 0x0079 }
            int r1 = r0.A01     // Catch:{ V1s -> 0x0079 }
            r0 = 41
            if (r1 >= r0) goto L_0x0021
            java.lang.String r2 = r11.A02     // Catch:{ V1s -> 0x0021 }
            java.lang.Integer r1 = r11.A01     // Catch:{ V1s -> 0x0021 }
            java.util.HashMap r0 = A0B     // Catch:{ V1s -> 0x0021 }
            X.VhX r0 = X.C18705VyW.A00(r1, r2, r0)     // Catch:{ V1s -> 0x0021 }
            r11.A04 = r0     // Catch:{ V1s -> 0x0021 }
        L_0x0021:
            X.VhX r0 = r11.A04     // Catch:{ V1s -> 0x0079 }
            X.Vgd r7 = r0.A03     // Catch:{ V1s -> 0x0079 }
            int r3 = r7.A00     // Catch:{ V1s -> 0x0079 }
            int r2 = r7.A01     // Catch:{ V1s -> 0x0079 }
            r0 = 2
            int[] r1 = new int[r0]     // Catch:{ V1s -> 0x0079 }
            r0 = 1
            r1[r0] = r2     // Catch:{ V1s -> 0x0079 }
            r0 = 0
            r1[r0] = r3     // Catch:{ V1s -> 0x0079 }
            java.lang.Class r0 = java.lang.Float.TYPE     // Catch:{ V1s -> 0x0079 }
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r0, r1)     // Catch:{ V1s -> 0x0079 }
            float[][] r6 = (float[][]) r6     // Catch:{ V1s -> 0x0079 }
            r11.A06 = r6     // Catch:{ V1s -> 0x0079 }
            r5 = 0
        L_0x003d:
            int r0 = r7.A00     // Catch:{ V1s -> 0x0079 }
            if (r5 >= r0) goto L_0x0075
            r4 = 0
        L_0x0042:
            int r0 = r7.A01     // Catch:{ V1s -> 0x0079 }
            if (r4 >= r0) goto L_0x0072
            r3 = r6[r5]     // Catch:{ V1s -> 0x0079 }
            double r1 = java.lang.Math.random()     // Catch:{ V1s -> 0x0079 }
            float r0 = (float) r1     // Catch:{ V1s -> 0x0079 }
            r3[r4] = r0     // Catch:{ V1s -> 0x0079 }
            r9 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            r8 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0065
            r2 = r6[r5]     // Catch:{ V1s -> 0x0079 }
            r1 = r2[r4]     // Catch:{ V1s -> 0x0079 }
            r0 = 1056964608(0x3f000000, float:0.5)
            float r0 = X.0mi.A01(r1, r3, r8, r3, r0)     // Catch:{ V1s -> 0x0079 }
            r2[r4] = r0     // Catch:{ V1s -> 0x0079 }
            goto L_0x006f
        L_0x0065:
            r1 = r6[r5]     // Catch:{ V1s -> 0x0079 }
            r0 = r1[r4]     // Catch:{ V1s -> 0x0079 }
            float r0 = X.0mi.A01(r0, r3, r8, r3, r8)     // Catch:{ V1s -> 0x0079 }
            r1[r4] = r0     // Catch:{ V1s -> 0x0079 }
        L_0x006f:
            int r4 = r4 + 1
            goto L_0x0042
        L_0x0072:
            int r5 = r5 + 1
            goto L_0x003d
        L_0x0075:
            r11.invalidateSelf()     // Catch:{ V1s -> 0x0079 }
            return
        L_0x0079:
            r1 = move-exception
            java.lang.String r0 = "QRCodeDrawable#encoding failed"
            X.0wb.A07(r0, r1)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U16.A00(X.U16):void");
    }

    public final void draw(Canvas canvas) {
        float f;
        float A012;
        if (this.A04 != null) {
            Rect bounds = getBounds();
            int width = bounds.width();
            int height = bounds.height();
            int i = bounds.left;
            int i2 = bounds.top;
            C17824Vgd vgd = this.A04.A03;
            Canvas canvas2 = canvas;
            canvas2.save();
            float width2 = (float) bounds.width();
            int i3 = vgd.A01;
            float f2 = (float) i3;
            float f3 = width2 / f2;
            float height2 = (float) bounds.height();
            int i4 = vgd.A00;
            float f4 = (float) i4;
            float f5 = height2 / f4;
            float f6 = 0.08f * f3;
            Rect rect = this.A08;
            float f7 = f2 * 0.33333334f;
            float f8 = 0.33333334f * f4;
            float f9 = f2 / 2.0f;
            float f10 = f4 / 2.0f;
            float f11 = f7 / 2.0f;
            float f12 = f8 / 2.0f;
            rect.set((int) Math.ceil((double) (f9 - f11)), (int) Math.ceil((double) (f10 - f12)), (int) Math.floor((double) (f9 + f11)), (int) Math.floor((double) (f10 + f12)));
            for (int i5 = 0; i5 < i4; i5++) {
                for (int i6 = 0; i6 < i3; i6++) {
                    if (vgd.A02[i5][i6] > 0) {
                        int i7 = i3 - 1;
                        int i8 = i4 - 1;
                        if ((i6 >= 7 || i5 >= 7) && ((i6 <= i7 - 7 || i5 >= 7) && ((i6 >= 7 || i5 <= i8 - 7) && !rect.contains(i6, i5)))) {
                            float interpolation = this.A0A.getInterpolation(0.0f / 2000.0f);
                            float[][] fArr = this.A06;
                            fArr.getClass();
                            float f13 = fArr[i5][i6] + interpolation;
                            float floor = f13 - ((float) Math.floor((double) f13));
                            if (floor < 0.5f) {
                                A012 = 0mi.A01(floor, 0.0f, 0.5f, 0.75f, 1.0f);
                            } else {
                                A012 = 0mi.A01(floor, 0.5f, 1.0f, 1.0f, 0.75f);
                            }
                            float f14 = f3 / 2.0f;
                            canvas2.drawCircle((((float) i6) * f3) + f14 + ((float) i), (((float) i5) * f5) + (f5 / 2.0f) + ((float) i2), (f14 * A012) - f6, this.A07);
                        }
                    }
                }
            }
            int A052 = AnonymousClass7TE.A05(f3, 7.0f);
            int A053 = AnonymousClass7TE.A05(7.0f, f5);
            RectF rectF = this.A09;
            float f15 = (float) i;
            float f16 = (float) i2;
            float f17 = (float) (i + A052);
            float f18 = (float) (i2 + A053);
            rectF.set(f15, f16, f17, f18);
            int intValue = this.A05.intValue();
            Paint paint = this.A07;
            Canvas canvas3 = canvas2;
            if (intValue != 1) {
                W13.A00(canvas3, paint, rectF);
            } else {
                W13.A01(canvas3, paint, rectF);
            }
            int i9 = i + width;
            rectF.set((float) (i9 - A052), f16, (float) i9, f18);
            Canvas canvas4 = canvas2;
            if (intValue != 1) {
                W13.A00(canvas4, paint, rectF);
            } else {
                W13.A01(canvas4, paint, rectF);
            }
            int i10 = i2 + height;
            rectF.set(f15, (float) (i10 - A053), f17, (float) i10);
            Canvas canvas5 = canvas2;
            if (intValue != 1) {
                W13.A00(canvas5, paint, rectF);
            } else {
                W13.A01(canvas5, paint, rectF);
            }
            float width3 = ((float) rect.width()) * f3 * 0.06f;
            rectF.set((((float) rect.left) * f3) + f15 + width3, (((float) rect.top) * f5) + f16 + width3, (f15 + (((float) rect.right) * f3)) - width3, (f16 + (((float) rect.bottom) * f5)) - width3);
            0qQ.A0B(paint, 1);
            canvas2.save();
            Path path = W13.A00;
            if (intValue != 1) {
                path.reset();
                path.moveTo(39.0f, 26.0f);
                path.cubicTo(46.18f, 26.0f, 52.0f, 31.82f, 52.0f, 39.0f);
                Path path2 = path;
                path2.cubicTo(52.0f, 46.18f, 46.18f, 52.0f, 39.0f, 52.0f);
                path2.cubicTo(31.82f, 52.0f, 26.0f, 46.18f, 26.0f, 39.0f);
                path2.cubicTo(26.0f, 31.82f, 31.82f, 26.0f, 39.0f, 26.0f);
                path.lineTo(39.0f, 26.0f);
                path.close();
                path.moveTo(39.0f, 58.93f);
                path.cubicTo(50.01f, 58.93f, 58.93f, 50.01f, 58.93f, 39.0f);
                path2.cubicTo(58.93f, 27.99f, 50.01f, 19.07f, 39.0f, 19.07f);
                Path path3 = path;
                path3.cubicTo(27.99f, 19.07f, 19.07f, 27.99f, 19.07f, 39.0f);
                path3.cubicTo(19.07f, 50.01f, 27.99f, 58.93f, 39.0f, 58.93f);
                path.lineTo(39.0f, 58.93f);
                path.close();
                path.moveTo(60.23f, 22.53f);
                path.cubicTo(62.87f, 22.53f, 65.0f, 20.4f, 65.0f, 17.77f);
                path3.cubicTo(65.0f, 15.14f, 62.87f, 13.0f, 60.23f, 13.0f);
                path3.cubicTo(57.6f, 13.0f, 55.47f, 15.14f, 55.47f, 17.77f);
                path.cubicTo(55.47f, 20.4f, 57.6f, 22.53f, 60.23f, 22.53f);
                path.lineTo(60.23f, 22.53f);
                path.close();
                path.moveTo(7.16f, 23.19f);
                path.cubicTo(7.34f, 19.38f, 7.97f, 17.31f, 8.51f, 15.93f);
                path.cubicTo(9.22f, 14.11f, 10.06f, 12.8f, 11.43f, 11.43f);
                path.cubicTo(12.8f, 10.07f, 14.1f, 9.22f, 15.93f, 8.51f);
                Path path4 = path;
                path4.cubicTo(17.31f, 7.97f, 19.38f, 7.34f, 23.19f, 7.16f);
                path4.cubicTo(27.32f, 6.97f, 28.55f, 6.93f, 39.0f, 6.93f);
                path4.cubicTo(49.44f, 6.93f, 50.68f, 6.97f, 54.8f, 7.16f);
                path.cubicTo(58.62f, 7.34f, 60.69f, 7.97f, 62.07f, 8.51f);
                path.cubicTo(63.89f, 9.22f, 65.2f, 10.07f, 66.57f, 11.43f);
                path.cubicTo(67.93f, 12.8f, 68.78f, 14.11f, 69.49f, 15.93f);
                path.cubicTo(70.03f, 17.31f, 70.66f, 19.38f, 70.84f, 23.19f);
                path.cubicTo(71.03f, 27.32f, 71.07f, 28.56f, 71.07f, 39.0f);
                path.cubicTo(71.07f, 49.45f, 71.03f, 50.68f, 70.84f, 54.81f);
                path.cubicTo(70.66f, 58.62f, 70.03f, 60.69f, 69.49f, 62.07f);
                path.cubicTo(68.78f, 63.89f, 67.93f, 65.2f, 66.57f, 66.57f);
                path.cubicTo(65.2f, 67.93f, 63.89f, 68.78f, 62.07f, 69.49f);
                path.cubicTo(60.69f, 70.03f, 58.62f, 70.66f, 54.8f, 70.84f);
                path.cubicTo(50.68f, 71.03f, 49.45f, 71.07f, 39.0f, 71.07f);
                path.cubicTo(28.55f, 71.07f, 27.32f, 71.03f, 23.19f, 70.84f);
                path.cubicTo(19.38f, 70.66f, 17.31f, 70.03f, 15.93f, 69.49f);
                path.cubicTo(14.1f, 68.78f, 12.8f, 67.93f, 11.43f, 66.57f);
                path.cubicTo(10.06f, 65.2f, 9.22f, 63.89f, 8.51f, 62.07f);
                path.cubicTo(7.97f, 60.69f, 7.34f, 58.62f, 7.16f, 54.81f);
                path.cubicTo(6.97f, 50.68f, 6.93f, 49.45f, 6.93f, 39.0f);
                path.cubicTo(6.93f, 28.56f, 6.97f, 27.32f, 7.16f, 23.19f);
                path.lineTo(7.16f, 23.19f);
                path.close();
                path.moveTo(13.45f, 75.95f);
                path.cubicTo(15.93f, 76.92f, 18.77f, 77.58f, 22.92f, 77.76f);
                Path path5 = path;
                path5.cubicTo(27.08f, 77.96f, 28.41f, 78.0f, 39.0f, 78.0f);
                path.cubicTo(49.59f, 78.0f, 50.92f, 77.96f, 55.08f, 77.76f);
                path5.cubicTo(59.23f, 77.58f, 62.07f, 76.92f, 64.55f, 75.95f);
                path5.cubicTo(67.11f, 74.96f, 69.28f, 73.62f, 71.45f, 71.45f);
                path.cubicTo(73.62f, 69.29f, 74.96f, 67.11f, 75.95f, 64.55f);
                Path path6 = path;
                path6.cubicTo(76.92f, 62.07f, 77.58f, 59.23f, 77.76f, 55.08f);
                path.cubicTo(77.95f, 50.92f, 78.0f, 49.59f, 78.0f, 39.0f);
                path6.cubicTo(78.0f, 28.41f, 77.95f, 27.08f, 77.76f, 22.92f);
                path.cubicTo(77.58f, 18.77f, 76.92f, 15.93f, 75.95f, 13.45f);
                path.cubicTo(74.96f, 10.89f, 73.62f, 8.71f, 71.45f, 6.55f);
                path.cubicTo(69.28f, 4.38f, 67.11f, 3.04f, 64.55f, 2.05f);
                path.cubicTo(62.07f, 1.08f, 59.23f, 0.42f, 55.08f, 0.24f);
                path.cubicTo(50.92f, 0.05f, 49.59f, 0.0f, 39.0f, 0.0f);
                path.cubicTo(28.41f, 0.0f, 27.08f, 0.05f, 22.92f, 0.24f);
                path.cubicTo(18.77f, 0.42f, 15.93f, 1.08f, 13.45f, 2.05f);
                path.cubicTo(10.89f, 3.04f, 8.71f, 4.38f, 6.55f, 6.55f);
                path.cubicTo(4.38f, 8.71f, 3.04f, 10.89f, 2.05f, 13.45f);
                path.cubicTo(1.08f, 15.93f, 0.42f, 18.77f, 0.23f, 22.92f);
                path.cubicTo(0.05f, 27.08f, 0.0f, 28.41f, 0.0f, 39.0f);
                path.cubicTo(0.0f, 49.59f, 0.05f, 50.92f, 0.23f, 55.08f);
                path.cubicTo(0.42f, 59.23f, 1.08f, 62.07f, 2.05f, 64.55f);
                path.cubicTo(3.04f, 67.11f, 4.38f, 69.29f, 6.55f, 71.45f);
                path.cubicTo(8.71f, 73.62f, 10.89f, 74.96f, 13.45f, 75.95f);
                path.close();
                f = 78.0f;
            } else {
                path.reset();
                path.moveTo(30.36f, 54.0f);
                path.lineTo(30.34f, 54.0f);
                path.cubicTo(23.35f, 53.95f, 17.97f, 51.59f, 14.35f, 46.98f);
                path.cubicTo(11.14f, 42.88f, 9.48f, 37.17f, 9.42f, 30.02f);
                path.lineTo(9.42f, 29.99f);
                path.cubicTo(9.48f, 22.83f, 11.14f, 17.13f, 14.35f, 13.02f);
                path.cubicTo(17.97f, 8.41f, 23.35f, 6.05f, 30.34f, 6.0f);
                path.lineTo(30.36f, 6.0f);
                path.lineTo(30.37f, 6.0f);
                path.cubicTo(35.74f, 6.04f, 40.23f, 7.45f, 43.71f, 10.2f);
                path.cubicTo(46.99f, 12.78f, 49.3f, 16.45f, 50.57f, 21.13f);
                path.lineTo(46.58f, 22.27f);
                path.cubicTo(44.43f, 14.35f, 38.97f, 10.3f, 30.35f, 10.24f);
                path.cubicTo(24.67f, 10.28f, 20.37f, 12.11f, 17.57f, 15.67f);
                path.cubicTo(14.96f, 19.01f, 13.61f, 23.83f, 13.56f, 30.0f);
                path.cubicTo(13.61f, 36.17f, 14.96f, 40.99f, 17.58f, 44.33f);
                path.cubicTo(20.37f, 47.89f, 24.67f, 49.72f, 30.36f, 49.76f);
                path.cubicTo(35.49f, 49.72f, 38.88f, 48.5f, 41.7f, 45.67f);
                path.cubicTo(44.91f, 42.45f, 44.86f, 38.49f, 43.83f, 36.08f);
                path.cubicTo(43.22f, 34.66f, 42.12f, 33.48f, 40.63f, 32.58f);
                path.cubicTo(40.26f, 35.28f, 39.42f, 37.47f, 38.12f, 39.12f);
                path.cubicTo(36.39f, 41.32f, 33.94f, 42.53f, 30.83f, 42.7f);
                path.cubicTo(28.48f, 42.83f, 26.22f, 42.26f, 24.46f, 41.1f);
                path.cubicTo(22.38f, 39.72f, 21.17f, 37.62f, 21.04f, 35.17f);
                path.cubicTo(20.91f, 32.79f, 21.84f, 30.6f, 23.64f, 29.01f);
                path.cubicTo(25.36f, 27.48f, 27.78f, 26.59f, 30.64f, 26.42f);
                path.cubicTo(32.75f, 26.3f, 34.72f, 26.4f, 36.54f, 26.71f);
                path.cubicTo(36.3f, 25.22f, 35.81f, 24.04f, 35.08f, 23.19f);
                path.cubicTo(34.07f, 22.02f, 32.52f, 21.43f, 30.47f, 21.41f);
                path.cubicTo(30.45f, 21.41f, 30.43f, 21.41f, 30.41f, 21.41f);
                path.cubicTo(28.76f, 21.41f, 26.52f, 21.88f, 25.09f, 24.05f);
                path.lineTo(21.66f, 21.7f);
                path.cubicTo(23.57f, 18.79f, 26.68f, 17.18f, 30.41f, 17.18f);
                path.cubicTo(30.44f, 17.18f, 30.47f, 17.18f, 30.49f, 17.18f);
                path.cubicTo(36.74f, 17.22f, 40.46f, 21.13f, 40.83f, 27.96f);
                path.cubicTo(41.04f, 28.05f, 41.25f, 28.15f, 41.46f, 28.24f);
                path.cubicTo(44.37f, 29.64f, 46.5f, 31.77f, 47.62f, 34.38f);
                path.cubicTo(49.18f, 38.03f, 49.32f, 43.96f, 44.59f, 48.7f);
                path.cubicTo(40.98f, 52.32f, 36.59f, 53.96f, 30.37f, 54.0f);
                path.lineTo(30.36f, 54.0f);
                path.lineTo(30.36f, 54.0f);
                path.close();
                path.moveTo(32.32f, 30.62f);
                path.cubicTo(31.85f, 30.62f, 31.37f, 30.63f, 30.87f, 30.66f);
                Path path7 = path;
                path7.cubicTo(27.29f, 30.87f, 25.05f, 32.55f, 25.18f, 34.95f);
                path7.cubicTo(25.31f, 37.46f, 28.01f, 38.63f, 30.62f, 38.48f);
                path7.cubicTo(33.01f, 38.35f, 36.12f, 37.4f, 36.65f, 31.06f);
                path7.cubicTo(35.33f, 30.77f, 33.88f, 30.62f, 32.32f, 30.62f);
                path.close();
                f = 60.0f;
            }
            W13.A02(canvas2, paint, rectF, f);
            canvas2.restore();
            canvas2.restore();
        }
    }

    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }

    public U16() {
        Paint paint = new Paint(3);
        this.A07 = paint;
        C13988Tno.A0p(-16777216, paint);
    }
}
