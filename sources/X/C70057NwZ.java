package X;

import java.io.IOException;

/* renamed from: X.NwZ  reason: case insensitive filesystem */
public abstract class C70057NwZ {
    /* JADX WARNING: type inference failed for: r1v1, types: [X.OFF, java.lang.Object] */
    public static OFF parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if (AnonymousClass000.A00(663).equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("interactive_user_id".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if (AnonymousClass000.A00(3050).equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r7.A1P();
                    }
                } else if ("poll_vote_string".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r7.A1P();
                    }
                }
                r7.A0z();
            }
            ? obj = new Object();
            if (str != null) {
                obj.A01 = str;
            }
            if (str2 != null) {
                obj.A02 = str2;
            }
            if (str3 != null) {
                obj.A00 = str3;
            }
            if (str4 != null) {
                obj.A03 = str4;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
