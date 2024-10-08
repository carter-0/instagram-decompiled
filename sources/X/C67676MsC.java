package X;

import android.view.ScaleGestureDetector;
import android.widget.ImageView;

/* renamed from: X.MsC  reason: case insensitive filesystem */
public final class C67676MsC extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final int A00;
    public final Object A01;

    public C67676MsC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i = this.A00;
        0qQ.A0B(scaleGestureDetector, 0);
        if (i != 0) {
            OA5 oa5 = ((N1V) this.A01).A02;
            if (oa5 == null) {
                return false;
            }
            OK6 A002 = oa5.A00.A00();
            C69099Nee.A00(A002.A00, scaleGestureDetector.getScaleFactor());
            return true;
        }
        C7925Qcw qcw = (C7925Qcw) this.A01;
        float scaleFactor = qcw.A04 * scaleGestureDetector.getScaleFactor();
        qcw.A04 = scaleFactor;
        qcw.A04 = Math.max(1.0f, Math.min(scaleFactor, 5.0f));
        ImageView imageView = qcw.A0G;
        0qQ.A0A(imageView);
        imageView.setScaleX(qcw.A04);
        ImageView imageView2 = qcw.A0G;
        0qQ.A0A(imageView2);
        imageView2.setScaleY(qcw.A04);
        return true;
    }
}
