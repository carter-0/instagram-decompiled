package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.CVw  reason: case insensitive filesystem */
public abstract class C44105CVw {
    public static N3B parseFromJson(16F r17) {
        16F r5 = r17;
        0qQ.A0B(r5, 0);
        try {
            16L A11 = r5.A11();
            16L r3 = 16L.A0D;
            if (A11 != r3) {
                r5.A0z();
                return null;
            }
            Integer num = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str = null;
            N37 n37 = null;
            HashMap hashMap = null;
            N59 n59 = null;
            Long l = null;
            User user = null;
            String str2 = null;
            while (true) {
                16L A1J = r5.A1J();
                16L r2 = 16L.A09;
                if (A1J == r2) {
                    return new N3B(n37, n59, user, bool, bool2, num, l, str, str2, hashMap);
                }
                String A17 = AnonymousClass7TE.A17(r5);
                if (TraceFieldType.ContentType.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r5);
                } else if ("is_liked_by_creator".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r5);
                } else if ("is_top_response".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r5);
                } else if ("item_id".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                } else if ("media_info".equals(A17)) {
                    n37 = C44104CVv.parseFromJson(r5);
                } else if ("reactions".equals(A17)) {
                    if (r5.A11() == r3) {
                        hashMap = AnonymousClass7TE.A1E();
                        while (r5.A1J() != r2) {
                            C41847B3o.A1N(r5, hashMap);
                        }
                    } else {
                        hashMap = null;
                    }
                } else if ("text_info".equals(A17)) {
                    n59 = C69751Nra.parseFromJson(r5);
                } else if ("timestamp".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r5);
                } else if (C41845B3m.A1B(A17)) {
                    user = C41845B3m.A0a(r5, false);
                } else if ("viewer_reaction".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                }
                r5.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
