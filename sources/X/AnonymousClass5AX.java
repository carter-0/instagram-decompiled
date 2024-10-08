package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.5AX  reason: invalid class name */
public abstract class AnonymousClass5AX {
    public static AnonymousClass5AY parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            while (r10.A1J() != 16L.A09) {
                String A0q = r10.A0q();
                r10.A1J();
                if (TraceFieldType.ContentType.equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("matcher".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("replacer".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00(TraceFieldType.ContentType, "ZeroRewriteRuleImpl");
            } else if (str2 == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00("matcher", "ZeroRewriteRuleImpl");
            } else if (str3 != null || !(r10 instanceof 0c9)) {
                return new AnonymousClass5AY(str, str2, str3);
            } else {
                ((0c9) r10).A03.A00("replacer", "ZeroRewriteRuleImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
