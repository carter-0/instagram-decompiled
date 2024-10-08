package X;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import java.util.Random;

public final class WZj implements X4M {
    public final Bitmap A00;
    public final Rect A01;
    public final Random A02 = new Random();

    public WZj(Bitmap bitmap, Rect rect) {
        0qQ.A0B(rect, 1);
        this.A01 = rect;
        this.A00 = bitmap;
    }

    public final void AJ7(C17726Vcv vcv, int i, int i2, long j) {
        Rect rect = this.A01;
        if (rect.left != 0 || rect.top != 0 || rect.right != 0 || rect.bottom != 0) {
            Random random = this.A02;
            float nextFloat = 0.2f + ((0.5f - 0.2f) * random.nextFloat());
            PointF pointF = vcv.A0A;
            pointF.x = C13989Tnp.A01(rect.right, rect.left, random.nextFloat());
            pointF.y = C13989Tnp.A01(rect.bottom, rect.top, random.nextFloat());
            PointF pointF2 = vcv.A0C;
            pointF2.x = C13989Tnp.A01(rect.right, rect.left, random.nextFloat());
            pointF2.y = C13989Tnp.A01(rect.bottom, rect.top, random.nextFloat());
            PointF pointF3 = vcv.A0D;
            pointF3.x = 0.0f;
            pointF3.y = 0.0f;
            vcv.A04 = ((0.0f - 0.0f) * vcv.A06) + 0.0f;
            vcv.A06 = nextFloat;
            vcv.A05 = C13990Tnq.A03(random);
            vcv.A07 = 1.0f;
            vcv.A03 = 0.0f;
            vcv.A09 = this.A00;
        }
    }
}
