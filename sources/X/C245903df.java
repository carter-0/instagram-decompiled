package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.3df  reason: invalid class name and case insensitive filesystem */
public abstract class C245903df {
    public static C245913dg parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Boolean bool = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            while (r13.A1J() != 16L.A09) {
                String A0q = r13.A0q();
                r13.A1J();
                if ("actor_id".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("explanation".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("explore_internal_debug_log".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if ("interest".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                } else if ("interest_id".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r13.A1P();
                    }
                } else if ("is_explanation_clickable".equals(A0q)) {
                    bool = Boolean.valueOf(r13.A0d());
                } else if ("source_token".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r13.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r13.A1P();
                    }
                } else if ("title_id".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r13.A1P();
                    }
                } else if ("topic".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            return new C245913dg(bool, str, str2, str3, str4, str5, str6, str7, str8, str9);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
