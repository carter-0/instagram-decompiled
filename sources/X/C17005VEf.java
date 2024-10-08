package X;

import android.graphics.PointF;

/* renamed from: X.VEf  reason: case insensitive filesystem */
public abstract class C17005VEf {
    public static final C17523VZc A00(PointF pointF, C18541Vtt vtt, int i, int i2) {
        float f = ((float) i) / 2.0f;
        float f2 = ((float) i2) / 2.0f;
        return new C17523VZc(vtt.A00(pointF.x - f, pointF.y - f2), vtt.A00(pointF.x + f, pointF.y - f2), vtt.A00(pointF.x + f, pointF.y + f2), vtt.A00(pointF.x - f, pointF.y + f2), vtt.A00(pointF.x, pointF.y));
    }
}
