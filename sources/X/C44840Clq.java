package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Clq  reason: case insensitive filesystem */
public abstract class C44840Clq {
    public static BIX parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if (AnonymousClass000.A00(1464).equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("quality_features".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r8, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("review_screen_edit_text".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("review_screen_section_title".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                } else if ("review_screen_title".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            return new BIX(str, str2, str3, str4, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
