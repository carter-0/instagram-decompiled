package X;

import java.io.IOException;

public abstract class LIP {
    public static C61015JvF parseFromJson(16F r10) {
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
                String A17 = AnonymousClass7TE.A17(r10);
                if ("target".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("action".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("surface_element".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("target", r10, "StackedTimelineAction");
            } else if (str2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("action", r10, "StackedTimelineAction");
            } else if (str3 != null || !(r10 instanceof 0c9)) {
                return new C61015JvF(str, str2, str3);
            } else {
                AnonymousClass7TF.A1L("surface_element", r10, "StackedTimelineAction");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C61015JvF jvF) {
        r2.A0c();
        String str = jvF.A02;
        if (str != null) {
            r2.A0R("target", str);
        }
        String str2 = jvF.A00;
        if (str2 != null) {
            r2.A0R("action", str2);
        }
        String str3 = jvF.A01;
        if (str3 != null) {
            r2.A0R("surface_element", str3);
        }
        r2.A0Z();
    }
}
