package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.business.promote.model.PromoteIntegrityCheckMessage;
import java.io.IOException;

public abstract class VAR {
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, com.instagram.business.promote.model.PromoteIntegrityCheckMessage] */
    public static PromoteIntegrityCheckMessage parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("display_text_with_entities".equals(A17)) {
                    obj.A01 = Ci4.parseFromJson(r3);
                } else if (C41845B3m.A1C(A17)) {
                    obj.A00 = PromoteIntegrityCheckMessage.Type.valueOf(r3.A1Q());
                } else if (TraceFieldType.ErrorCode.equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(599).equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
