package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.3km  reason: invalid class name and case insensitive filesystem */
public abstract class C250023km {
    public static C250033kn parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C250033kn r0 = new C250033kn();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("reel".equals(A0q)) {
                    AnonymousClass3HX parseFromJson = AnonymousClass3HR.parseFromJson(r5);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A01 = parseFromJson;
                } else if ("delivered_at".equals(A0q)) {
                    r0.A00 = r5.A0y();
                } else {
                    String str = null;
                    if (TraceFieldType.RequestID.equals(A0q)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        0qQ.A0B(str, 0);
                        r0.A02 = str;
                    } else if ("request_uuid".equals(A0q)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        0qQ.A0B(str, 0);
                        r0.A03 = str;
                    }
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
