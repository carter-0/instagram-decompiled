package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.Cib  reason: case insensitive filesystem */
public abstract class C44657Cib {
    public static BB8 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            BB8 bb8 = new BB8();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("prompt".equals(A17)) {
                    bb8.A02 = AnonymousClass7TG.A0l(r3);
                } else if (TraceFieldType.ContentType.equals(A17)) {
                    bb8.A00 = AnonymousClass7TG.A0l(r3);
                } else if (C273654mx.A00(3032).equals(A17)) {
                    bb8.A01 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return bb8;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
