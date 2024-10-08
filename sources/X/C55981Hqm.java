package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;

/* renamed from: X.Hqm  reason: case insensitive filesystem */
public final class C55981Hqm {
    public final PointF A00;
    public final RectF A01;
    public final View A02;
    public final String A03;
    public final String A04;

    public C55981Hqm(PointF pointF, RectF rectF, View view, String str, String str2) {
        this.A03 = str;
        this.A04 = str2;
        this.A00 = pointF;
        this.A01 = rectF;
        this.A02 = view;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("\n      ShowreelInteractivityListenerData(\n      action: ");
        A1A.append(this.A03);
        A1A.append(", \n      value: ");
        A1A.append(this.A04);
        A1A.append(",\n      interactionPoint: ");
        A1A.append(this.A00);
        A1A.append(",\n      bounds: ");
        A1A.append(this.A01);
        A1A.append(",\n      view: ");
        A1A.append(this.A02.getClass());
        return 0rw.A0t(AnonymousClass7TF.A0l("\n      )\n    ", A1A));
    }
}
