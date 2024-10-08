package X;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import java.util.Random;

public final class WVS implements C20895X3m {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final Bitmap A05;
    public final Rect A06 = new Rect();
    public final AnonymousClass7EF A07;
    public final Random A08 = new Random();

    public final void AJ6(C17716Vcl vcl, int i, int i2, long j) {
        AnonymousClass7EF r0 = this.A07;
        Rect rect = this.A06;
        r0.CDN(rect);
        if (rect.left != 0 || rect.top != 0 || rect.right != 0 || rect.bottom != 0) {
            Random random = this.A08;
            float nextFloat = 0.65f + ((1.0f - 0.65f) * random.nextFloat());
            PointF pointF = vcl.A0A;
            float A012 = C13989Tnp.A01(rect.right, rect.left, random.nextFloat());
            pointF.x = A012;
            int i3 = rect.top;
            pointF.y = (float) i3;
            PointF pointF2 = vcl.A0C;
            pointF2.x = A012;
            float A013 = C13989Tnp.A01(rect.bottom, i3, 0.75f);
            C13989Tnp.A12(pointF2, random, this.A01, this.A04, A013);
            PointF pointF3 = vcl.A0D;
            float f = this.A02;
            float f2 = -f;
            pointF3.x = f2 + ((f - f2) * random.nextFloat());
            pointF3.y = 500.0f;
            float f3 = this.A03;
            vcl.A04 = f3 + ((this.A00 - f3) * vcl.A06);
            vcl.A06 = nextFloat * 3.0f;
            vcl.A05 = (float) (-0.3141592700403172d + ((0.3141592700403172d - -0.3141592700403172d) * ((double) random.nextFloat())));
            vcl.A07 = 1.0f;
            vcl.A03 = 1.0f;
            vcl.A09 = this.A05;
        }
    }

    public WVS(Bitmap bitmap, AnonymousClass7EF r3, float f, float f2, float f3, float f4, float f5) {
        this.A07 = r3;
        this.A05 = bitmap;
        this.A02 = f;
        this.A03 = f2;
        this.A00 = f3;
        this.A04 = f4;
        this.A01 = f5;
    }
}
