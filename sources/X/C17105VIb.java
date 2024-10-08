package X;

import android.graphics.Rect;
import java.io.IOException;

/* renamed from: X.VIb  reason: case insensitive filesystem */
public abstract class C17105VIb {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.Vc8] */
    public static C17677Vc8 parseFromJson(16F r4) {
        Integer num;
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("bounds_spec_type".equals(A17)) {
                    String A1Q = r4.A1Q();
                    if (A1Q.equals("BIAS")) {
                        num = AnonymousClass05K.A00;
                    } else if (A1Q.equals("NORMALIZED_CENTER")) {
                        num = AnonymousClass05K.A01;
                    } else if (A1Q.equals("GRAVITY")) {
                        num = AnonymousClass05K.A0C;
                    } else if (A1Q.equals("ABSOLUTE")) {
                        num = AnonymousClass05K.A0N;
                    } else if (A1Q.equals("NO_OVERLAP")) {
                        num = AnonymousClass05K.A0Y;
                    } else {
                        throw new IllegalArgumentException(A1Q);
                    }
                    obj.A08 = num;
                } else if ("bias_x".equals(A17)) {
                    obj.A00 = (float) r4.A0U();
                } else if ("bias_y".equals(A17)) {
                    obj.A01 = (float) r4.A0U();
                } else if ("normalized_center_x".equals(A17)) {
                    obj.A04 = (float) r4.A0U();
                } else if ("normalized_center_y".equals(A17)) {
                    obj.A05 = (float) r4.A0U();
                } else if ("gravity".equals(A17)) {
                    obj.A06 = r4.A1D();
                } else if ("gravity_offset_x".equals(A17)) {
                    obj.A02 = (float) r4.A0U();
                } else if ("gravity_offset_y".equals(A17)) {
                    obj.A03 = (float) r4.A0U();
                } else if ("rect".equals(A17)) {
                    obj.A07 = Rect.unflattenFromString(r4.A1Q());
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
