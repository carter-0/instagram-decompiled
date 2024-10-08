package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.LimitedInteractionsVersions;
import java.io.IOException;

/* renamed from: X.928  reason: invalid class name */
public final class AnonymousClass928 {
    public static AnonymousClass927 parseFromJson(16F r6) {
        String str;
        0qQ.A0B(r6, 0);
        try {
            1XQ r5 = new 1XQ();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if (TraceFieldType.Duration.equals(A0q)) {
                    r5.A04 = Integer.valueOf(r6.A1D());
                } else if ("limited_categories".equals(A0q)) {
                    r5.A00 = C54799HTg.parseFromJson(r6);
                } else if ("show_limited_interactions_reminder".equals(A0q)) {
                    r5.A03 = Boolean.valueOf(r6.A0d());
                } else if ("version".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                    LimitedInteractionsVersions limitedInteractionsVersions = (LimitedInteractionsVersions) LimitedInteractionsVersions.A01.get(str);
                    if (limitedInteractionsVersions == null) {
                        limitedInteractionsVersions = LimitedInteractionsVersions.UNRECOGNIZED;
                    }
                    r5.A02 = limitedInteractionsVersions;
                } else {
                    1XY.A01(r6, r5, A0q);
                }
                r6.A0z();
            }
            Integer num = r5.A04;
            0qQ.A0A(num);
            int intValue = num.intValue();
            C294475mW r3 = r5.A00;
            Boolean bool = r5.A03;
            0qQ.A0A(bool);
            r5.A01 = new C294455mU(r3, r5.A02, intValue, bool.booleanValue());
            return r5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
