package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;

public abstract class A0H {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.A6M] */
    public static A6M parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    obj.A02 = str;
                } else if (TraceFieldType.Duration.equals(A17)) {
                    obj.A01 = AnonymousClass7TF.A0U(r3);
                } else if ("assets".equals(A17)) {
                    obj.A00 = A0G.parseFromJson(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
