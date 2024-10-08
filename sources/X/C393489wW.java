package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9wW  reason: invalid class name and case insensitive filesystem */
public abstract class C393489wW {
    public static C369348uP parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            ArrayList arrayList = null;
            String str = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("should_display_postcap_overlay".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r7);
                } else if ("show_tooltip".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r7);
                } else if ("sticker_bundle_ids".equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r7.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r7, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AnonymousClass000.A00(4044).equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                }
                r7.A0z();
            }
            return new C369348uP(bool, bool2, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
