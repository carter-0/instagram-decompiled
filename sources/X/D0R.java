package X;

import android.text.TextUtils;
import java.io.IOException;

public final class D0R {
    public static CGA parseFromJson(16F r4) {
        String str;
        String str2;
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C41845B3m.A1B(A17)) {
                    r3.A02 = C41845B3m.A0a(r4, false);
                } else if ("confidence".equals(A17)) {
                    r4.A0U();
                } else if ("failure_code".equals(A17)) {
                    r3.A00 = r4.A1D();
                } else if (Dbg.A01().equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r4.A1P();
                    }
                    r3.A04 = str2;
                } else if ("deeplink".equals(A17)) {
                    r3.A01 = C44593ChR.parseFromJson(r4);
                } else {
                    1XY.A01(r4, r3, A17);
                }
                r4.A0z();
            }
            StringBuilder sb = new StringBuilder();
            int i = r3.A00;
            if (i > 0) {
                sb.append("[");
                sb.append(i);
                sb.append("]");
            }
            if (!TextUtils.isEmpty(r3.mErrorMessage)) {
                sb.append(" ");
                str = r3.mErrorMessage;
            } else {
                if (!TextUtils.isEmpty(r3.A04)) {
                    sb.append(" ");
                    str = r3.A04;
                }
                r3.A03 = sb.toString();
                return r3;
            }
            sb.append(str);
            r3.A03 = sb.toString();
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
