package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;

/* renamed from: X.58u  reason: invalid class name and case insensitive filesystem */
public abstract class C2816358u {
    public static C2816458v parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (r14.A1J() != 16L.A09) {
                String A0q = r14.A0q();
                r14.A1J();
                if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if ("privacy_disclaimer".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if ("privacy_disclaimer_link".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if ("privacy_disclaimer_link_text".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r14.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r14.A1P();
                    }
                }
                r14.A0z();
            }
            if (str == null && (r14 instanceof 0c9)) {
                ((0c9) r14).A03.A00(DevServerEntity.COLUMN_DESCRIPTION, "LiveUserPayConsumptionSheetConfig");
            } else if (str2 == null && (r14 instanceof 0c9)) {
                ((0c9) r14).A03.A00("privacy_disclaimer", "LiveUserPayConsumptionSheetConfig");
            } else if (str3 == null && (r14 instanceof 0c9)) {
                ((0c9) r14).A03.A00("privacy_disclaimer_link", "LiveUserPayConsumptionSheetConfig");
            } else if (str4 == null && (r14 instanceof 0c9)) {
                ((0c9) r14).A03.A00("privacy_disclaimer_link_text", "LiveUserPayConsumptionSheetConfig");
            } else if (str5 != null || !(r14 instanceof 0c9)) {
                return new C2816458v(str, str2, str3, str4, str5);
            } else {
                ((0c9) r14).A03.A00(DialogModule.KEY_TITLE, "LiveUserPayConsumptionSheetConfig");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
