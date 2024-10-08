package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import java.util.Random;

public final class WVT implements C20895X3m {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final Context A04;
    public final Bitmap A05;
    public final Rect A06;
    public final AnonymousClass7EF A07;
    public final Random A08 = new Random();

    public final void AJ6(C17716Vcl vcl, int i, int i2, long j) {
        Rect rect = this.A06;
        if (rect.left != 0 || rect.top != 0 || rect.right != 0 || rect.bottom != 0) {
            Random random = this.A08;
            float nextFloat = 0.3f + ((1.0f - 0.3f) * random.nextFloat());
            PointF pointF = vcl.A0A;
            pointF.x = C13989Tnp.A01(rect.right, rect.left, (random.nextFloat() * 0.7f) + 0.15f);
            pointF.y = C13989Tnp.A01(rect.bottom, rect.top, (random.nextFloat() * 0.6f) + 0.33f);
            PointF pointF2 = vcl.A0C;
            pointF2.x = ((float) 0nA.A06(this.A04)) * random.nextFloat();
            float A012 = C13989Tnp.A01(rect.bottom, rect.top, 0.75f);
            C13989Tnp.A12(pointF2, random, this.A01, this.A03, A012);
            PointF pointF3 = vcl.A0D;
            pointF3.x = 0.0f;
            pointF3.y = 0.0f;
            float f = this.A02;
            vcl.A04 = f + ((this.A00 - f) * vcl.A06);
            vcl.A06 = nextFloat * 1.2f;
            vcl.A05 = C13990Tnq.A03(random);
            vcl.A07 = 1.0f;
            vcl.A03 = 1.0f;
            vcl.A09 = this.A05;
        }
    }

    public WVT(Context context, Bitmap bitmap, AnonymousClass7EF r5, float f, float f2, float f3, float f4) {
        this.A04 = context;
        this.A07 = r5;
        this.A05 = bitmap;
        this.A02 = f;
        this.A00 = f2;
        this.A03 = f3;
        this.A01 = f4;
        Rect rect = new Rect();
        this.A06 = rect;
        r5.CDN(rect);
    }
}
