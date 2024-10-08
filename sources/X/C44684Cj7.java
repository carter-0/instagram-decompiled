package X;

import java.io.IOException;

/* renamed from: X.Cj7  reason: case insensitive filesystem */
public abstract class C44684Cj7 {
    public static C45213CsR parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45213CsR csR = new C45213CsR();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("is_hidden_in_messages_primary_tab".equals(AnonymousClass7TE.A17(r3))) {
                    csR.A00 = r3.A0d();
                }
                r3.A0z();
            }
            return csR;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
