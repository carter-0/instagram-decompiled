package X;

import com.instagram.model.keyword.Keyword;
import java.io.IOException;

/* renamed from: X.Mn3  reason: case insensitive filesystem */
public abstract class C67386Mn3 {
    public static C67387Mn4 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C67387Mn4 mn4 = new C67387Mn4();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("keyword".equals(A0q)) {
                    Keyword parseFromJson = C67385Mn1.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    mn4.A01 = parseFromJson;
                } else if ("position".equals(A0q)) {
                    mn4.A00 = r4.A1D();
                } else {
                    C66941Mfa.A01(r4, mn4, A0q);
                }
                r4.A0z();
            }
            return mn4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C67387Mn4 mn4) {
        r2.A0c();
        if (mn4.A01 != null) {
            r2.A0q("keyword");
            C67385Mn1.A00(r2, mn4.A01);
        }
        r2.A0P("position", mn4.A00);
        C66941Mfa.A00(r2, mn4);
        r2.A0Z();
    }
}
