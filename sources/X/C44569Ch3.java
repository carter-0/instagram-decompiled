package X;

import java.io.IOException;

/* renamed from: X.Ch3  reason: case insensitive filesystem */
public abstract class C44569Ch3 {
    public static BI9 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            Boolean bool = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if (C41846B3n.A1b(r5, "is_eligible_for_creator_settings_review")) {
                    bool = AnonymousClass7TF.A0S(r5);
                }
                r5.A0z();
            }
            if (bool != null || !(r5 instanceof 0c9)) {
                return new BI9(bool.booleanValue());
            }
            AnonymousClass7TF.A1L("is_eligible_for_creator_settings_review", r5, "UserSettingBundlesInfoImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
