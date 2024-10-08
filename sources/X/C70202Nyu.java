package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.direct.model.DirectForwardingParams;
import java.io.IOException;

/* renamed from: X.Nyu  reason: case insensitive filesystem */
public abstract class C70202Nyu {
    public static C65701gB parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C65701gB r0 = new C65701gB();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (TraceFieldType.ContentType.equals(A17)) {
                    2FW A00 = 2FW.A0A.A00(r4.A1P());
                    0qQ.A0B(A00, 0);
                    r0.A03 = A00;
                } else if (C66580MXl.A1Z(A17)) {
                    r0.A02 = C66580MXl.A0h(r4);
                } else if ("pending_timestamp_us".equals(A17)) {
                    r0.A04 = AnonymousClass7TF.A0Z(r4);
                } else if ("timestamp_us".equals(A17)) {
                    r0.A00 = r4.A0y();
                } else if ("params".equals(A17)) {
                    DirectForwardingParams parseFromJson = C49753F5e.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A01 = parseFromJson;
                } else {
                    C66670Mad.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
