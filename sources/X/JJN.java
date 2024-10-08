package X;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.drawable.Drawable;

public final class JJN extends 0Yg implements 0sK {
    public static final JJN A00 = new JJN();

    public JJN() {
        super(3);
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.H7q, android.view.View, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C277274um r7 = (C277274um) obj;
        ? r8 = (C54321H7q) obj2;
        float A04 = AnonymousClass7TE.A04(obj3);
        boolean A1Z = AnonymousClass7TG.A1Z(r7, r8);
        if (A04 >= 0.0f) {
            float f = r8.A00;
            if (A04 >= f) {
                r8.setBackground(r8.A04);
                r8.A03.reset();
            } else {
                float f2 = A04 / f;
                Path path = r8.A03;
                path.reset();
                PathMeasure pathMeasure = r8.A01;
                if (pathMeasure != null) {
                    pathMeasure.getSegment(0.0f, pathMeasure.getLength() * f2, path, A1Z);
                }
                r8.invalidate();
                r8.setBackground((Drawable) null);
            }
        }
        return r7.A00(C58602IuZ.A00);
    }
}
