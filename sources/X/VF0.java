package X;

import com.instagram.user.model.User;
import java.io.IOException;

public abstract class VF0 {
    /* JADX WARNING: type inference failed for: r1v2, types: [X.V3k, java.lang.Object] */
    public static C16727V3k parseFromJson(16F r10) {
        String A00;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            User user = null;
            String str = null;
            String str2 = null;
            while (true) {
                16L A1J = r10.A1J();
                16L r7 = 16L.A09;
                A00 = AnonymousClass000.A00(3899);
                if (A1J == r7) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r10);
                if ("merchant".equals(A17)) {
                    user = C41845B3m.A0a(r10, false);
                } else if (A00.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if (AnonymousClass000.A00(1773).equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (user == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("merchant", r10, "ContinueShoppingRow");
            } else if (str != null || !(r10 instanceof 0c9)) {
                ? obj = new Object();
                obj.A00 = user;
                obj.A02 = str;
                obj.A01 = str2;
                return obj;
            } else {
                AnonymousClass7TF.A1L(A00, r10, "ContinueShoppingRow");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
