package X;

import java.io.IOException;

/* renamed from: X.CkN  reason: case insensitive filesystem */
public abstract class C44751CkN {
    public static AnonymousClass4JR parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if (AnonymousClass000.A00(626).equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r8);
                } else if ("is_open_carousel".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r8);
                } else if ("is_parent_media".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r8);
                } else if ("is_prompt_page".equals(A17)) {
                    bool4 = AnonymousClass7TF.A0S(r8);
                } else if (AnonymousClass000.A00(711).equals(A17)) {
                    bool5 = AnonymousClass7TF.A0S(r8);
                }
                r8.A0z();
            }
            return new AnonymousClass4JR(bool, bool2, bool3, bool4, bool5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
