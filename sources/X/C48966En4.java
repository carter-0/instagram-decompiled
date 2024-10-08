package X;

import java.io.IOException;

/* renamed from: X.En4  reason: case insensitive filesystem */
public abstract class C48966En4 {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.Eyz] */
    public static C49590Eyz parseFromJson(16F r7) {
        C48085EVd eVd;
        0qQ.A0B(r7, 0);
        try {
            ? obj = new Object();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if (C41845B3m.A1E(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r7);
                } else if ("action".equals(A17)) {
                    String A1Q = r7.A1Q();
                    C48085EVd[] values = C48085EVd.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            0wb.A03("LoginFailureButton.parseActionStringError", String.format("Error parsing action string %s", new Object[]{A1Q}));
                            eVd = C48085EVd.DEFAULT;
                            break;
                        }
                        eVd = values[i];
                        if (A1Q.equalsIgnoreCase(eVd.name())) {
                            break;
                        }
                        i++;
                    }
                    obj.A00 = eVd;
                } else if ("helper_url".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r7);
                } else if ("stop_deletion_token".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r7);
                }
                r7.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
