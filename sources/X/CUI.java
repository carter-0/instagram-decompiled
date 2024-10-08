package X;

import java.io.IOException;

public abstract class CUI {
    /* JADX WARNING: type inference failed for: r0v7, types: [X.CU2, java.lang.Object] */
    public static CU2 parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            Float f = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("key".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("time".equals(A17)) {
                    f = AnonymousClass7TF.A0V(r8);
                }
                r8.A0z();
            }
            if (str == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("key", r8, "SystemMessage");
            } else if (f != null || !(r8 instanceof 0c9)) {
                float floatValue = f.floatValue();
                0qQ.A0B(str, 1);
                ? obj = new Object();
                obj.A01 = str;
                obj.A00 = floatValue;
                return obj;
            } else {
                AnonymousClass7TF.A1L("time", r8, "SystemMessage");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
