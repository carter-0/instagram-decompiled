package X;

import java.io.IOException;

/* renamed from: X.A0c  reason: case insensitive filesystem */
public abstract class C39560A0c {
    public static BBV parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            while (r6.A1J() != 16L.A09) {
                if ("msg".equals(AnonymousClass7TE.A17(r6))) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                }
                r6.A0z();
            }
            if (str != null || !(r6 instanceof 0c9)) {
                return new BBV(str, 26);
            }
            AnonymousClass7TF.A1L("msg", r6, "BusinessConversionReminder");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
