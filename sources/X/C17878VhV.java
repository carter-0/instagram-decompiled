package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* renamed from: X.VhV  reason: case insensitive filesystem */
public final class C17878VhV {
    public long A00;
    public final Paint A01;
    public final C17476VXd A02;
    public final C18619VvC A03;
    public final C18573VuP A04;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.VuP, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.VvC, java.lang.Object] */
    public C17878VhV(Paint paint, C17476VXd vXd, long j) {
        AnonymousClass7TG.A1O(vXd, paint);
        this.A02 = vXd;
        this.A01 = paint;
        this.A00 = j;
        ? obj = new Object();
        C18573VuP.A00(obj);
        this.A04 = obj;
        ? obj2 = new Object();
        obj2.A00 = 0.0f;
        obj2.A01 = 0.0f;
        C18619VvC.A00(obj2);
        this.A03 = obj2;
    }

    public final void A00(Canvas canvas) {
        int save = canvas.save();
        try {
            this.A04.A01(canvas);
            C17476VXd vXd = this.A02;
            Paint paint = this.A01;
            long j = this.A00;
            VR2 vr2 = vXd.A02;
            Rect rect = vXd.A01;
            0qQ.A0B(rect, 1);
            vr2.A00.AQN(canvas, paint, rect, vr2.A01[(int) ((((float) (j % 1000)) / 1000.0f) * 1.0f)]);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
