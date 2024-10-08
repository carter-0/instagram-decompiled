package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.Cpm  reason: case insensitive filesystem */
public abstract class C45069Cpm {
    public static C45250CtD parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C45250CtD ctD = new C45250CtD();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                String str = null;
                if (!C41845B3m.A1J(A17)) {
                    if (!"pinned_content_token".equals(A17)) {
                        if ("pinned_content".equals(A17)) {
                            ctD.A00 = C45079Cpw.parseFromJson(r5);
                        } else if ("channel_type".equals(A17)) {
                            if (r5.A11() != 16L.A0G) {
                                str = r5.A1P();
                            }
                        } else if (TraceFieldType.ContentType.equals(A17)) {
                            if (r5.A11() != 16L.A0G) {
                                str = r5.A1P();
                            }
                        } else if ("pagination_token".equals(A17)) {
                            if (r5.A11() == 16L.A0G) {
                            }
                        }
                        r5.A0z();
                    } else if (r5.A11() == 16L.A0G) {
                        r5.A0z();
                    }
                    r5.A1P();
                    r5.A0z();
                } else if (r5.A11() != 16L.A0G) {
                    str = r5.A1P();
                }
                0qQ.A0B(str, 0);
                r5.A0z();
            }
            return ctD;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
