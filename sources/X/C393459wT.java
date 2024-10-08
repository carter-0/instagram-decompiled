package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;

/* renamed from: X.9wT  reason: invalid class name and case insensitive filesystem */
public abstract class C393459wT {
    public static C342487og parseFromJson(16F r15) {
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (r15.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r15);
                if ("button_title_off".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                } else if ("button_title_on".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r15.A1P();
                    }
                } else if (AnonymousClass000.A00(3199).equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r15.A1P();
                    }
                } else if ("subtitle".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r15.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r15.A1P();
                    }
                }
                r15.A0z();
            }
            if (str == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("button_title_off", r15, "PreLiveUserPaySheetConfigImpl");
            } else if (str2 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("button_title_on", r15, "PreLiveUserPaySheetConfigImpl");
            } else if (str3 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DevServerEntity.COLUMN_DESCRIPTION, r15, "PreLiveUserPaySheetConfigImpl");
            } else if (str5 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("subtitle", r15, "PreLiveUserPaySheetConfigImpl");
            } else if (str6 != null || !(r15 instanceof 0c9)) {
                return new C342487og(str, str2, str3, str4, str5, str6);
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r15, "PreLiveUserPaySheetConfigImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
