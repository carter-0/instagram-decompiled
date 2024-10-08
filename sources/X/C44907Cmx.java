package X;

import java.io.IOException;

/* renamed from: X.Cmx  reason: case insensitive filesystem */
public abstract class C44907Cmx {
    public static C42129BIh parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            C269814fj r3 = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("caption_info".equals(A17)) {
                    r3 = C45678D1d.parseFromJson(r8);
                } else if (C41845B3m.A1G(A17)) {
                    num = AnonymousClass7TF.A0X(r8);
                } else if ("start_x_position".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r8);
                } else if ("start_y_position".equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r8);
                } else if (C41845B3m.A1F(A17)) {
                    num4 = AnonymousClass7TF.A0X(r8);
                }
                r8.A0z();
            }
            return new C42129BIh(r3, num, num2, num3, num4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
