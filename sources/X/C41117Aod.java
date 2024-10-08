package X;

import android.graphics.Point;

/* renamed from: X.Aod  reason: case insensitive filesystem */
public final class C41117Aod implements Runnable {
    public final /* synthetic */ C340827lt A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ float[] A02;

    public C41117Aod(C340827lt r1, Integer num, float[] fArr) {
        this.A00 = r1;
        this.A02 = fArr;
        this.A01 = num;
    }

    public final void run() {
        Point point;
        C365938nv r4 = this.A00.A02;
        if (r4 != null) {
            float[] fArr = this.A02;
            Integer num = this.A01;
            if (fArr != null) {
                point = new Point((int) fArr[0], (int) fArr[1]);
            } else {
                point = null;
            }
            r4.DGA(point, num);
        }
    }
}
