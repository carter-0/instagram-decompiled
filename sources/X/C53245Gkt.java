package X;

import android.graphics.Bitmap;

/* renamed from: X.Gkt  reason: case insensitive filesystem */
public final class C53245Gkt extends UIR {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1IX A01;

    public C53245Gkt(1IX r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void A03(1TY r3) {
        this.A01.resumeWith((Object) null);
    }

    public final void A04(Bitmap bitmap) {
        Bitmap bitmap2;
        1IX r5 = this.A01;
        if (bitmap != null) {
            float max = ((float) Math.max(bitmap.getWidth(), bitmap.getHeight())) / ((float) this.A00);
            if (max < 1.0f) {
                max = 1.0f;
            }
            float ceil = (float) Math.ceil((double) max);
            if (ceil > 1.0f) {
                ceil = 1.0f;
            }
            bitmap2 = C51976G9y.A05(bitmap, ceil);
            0qQ.A07(bitmap2);
        } else {
            bitmap2 = null;
        }
        r5.resumeWith(bitmap2);
    }
}
