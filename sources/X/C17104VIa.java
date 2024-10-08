package X;

import android.graphics.PointF;
import java.io.IOException;

/* renamed from: X.VIa  reason: case insensitive filesystem */
public abstract class C17104VIa {
    public static C18735VzF parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C18735VzF vzF = new C18735VzF();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("position".equals(A17)) {
                    PointF pointF = new PointF();
                    if (r4.A11() == 16L.A0C) {
                        r4.A1J();
                        Number A0p = r4.A0p();
                        A0p.getClass();
                        float floatValue = A0p.floatValue();
                        r4.A1J();
                        float floatValue2 = r4.A0p().floatValue();
                        r4.A1J();
                        pointF.x = floatValue;
                        pointF.y = floatValue2;
                    }
                    vzF.A04 = pointF;
                } else if ("time".equals(A17)) {
                    vzF.A03 = r4.A0y();
                } else if ("pressure".equals(A17)) {
                    vzF.A00 = (float) r4.A0U();
                } else if ("radius".equals(A17)) {
                    vzF.A01 = (float) r4.A0U();
                } else if ("pos".equals(A17)) {
                    vzF.A02 = r4.A1D();
                }
                r4.A0z();
            }
            return vzF;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
