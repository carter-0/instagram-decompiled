package X;

import android.graphics.DashPathEffect;
import android.graphics.Paint;

/* renamed from: X.KwT  reason: case insensitive filesystem */
public abstract class C63407KwT {
    public static final Paint A00() {
        Paint A0D = JTP.A0D();
        A0D.setColor(-1);
        float[] A1b = C51965G9l.A1b();
        // fill-array-data instruction
        A1b[0] = 1107296256;
        A1b[1] = 1101703851;
        A0D.setPathEffect(new DashPathEffect(A1b, 0.0f));
        JTO.A1N(A0D);
        A0D.setStrokeWidth(8.0f);
        A0D.setStrokeCap(Paint.Cap.ROUND);
        return A0D;
    }
}
