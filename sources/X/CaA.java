package X;

import java.io.IOException;

public abstract class CaA {
    public static BFP parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            Boolean bool = null;
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Boolean bool2 = null;
            Integer num = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("num_earned_achievements".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r8);
                } else if ("show_achievements".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r8);
                } else {
                    bool2 = C41847B3o.A0z(r8, bool2, A17, "show_challenges_toast");
                }
                r8.A0z();
            }
            if (bool == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("show_achievements", r8, "MediaAchievementsInfo");
            } else if (bool2 != null || !(r8 instanceof 0c9)) {
                return new BFP(num, bool.booleanValue(), bool2.booleanValue());
            } else {
                AnonymousClass7TF.A1L("show_challenges_toast", r8, "MediaAchievementsInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
