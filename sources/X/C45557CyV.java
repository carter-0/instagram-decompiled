package X;

import java.io.IOException;

/* renamed from: X.CyV  reason: case insensitive filesystem */
public abstract class C45557CyV {
    public static C257683xn parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Integer num = null;
            Long l = null;
            Boolean bool = null;
            String str = null;
            String str2 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("end_scene_length".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r8);
                } else if ("follower_count".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r8);
                } else if ("is_end_scene_permanent".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r8);
                } else if ("page_name".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if (C41845B3m.A1L(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            return new C257683xn(bool, num, l, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, C257683xn r4) {
        r3.A0c();
        Integer num = r4.A01;
        if (num != null) {
            r3.A0P("end_scene_length", num.intValue());
        }
        Long l = r4.A02;
        if (l != null) {
            r3.A0Q("follower_count", l.longValue());
        }
        Boolean bool = r4.A00;
        if (bool != null) {
            r3.A0S("is_end_scene_permanent", bool.booleanValue());
        }
        String str = r4.A03;
        if (str != null) {
            r3.A0R("page_name", str);
        }
        String str2 = r4.A04;
        if (str2 != null) {
            r3.A0R("subtitle", str2);
        }
        r3.A0Z();
    }
}
