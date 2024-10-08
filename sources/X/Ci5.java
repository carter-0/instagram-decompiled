package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Ci5 {
    public static C61062Jw0 parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if ("category_type".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if ("preview_items".equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            JZC parseFromJson = C44955Cnp.parseFromJson(r12);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r12.A0z();
            }
            if (str == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r12, "ClipsSfxCategory");
            } else if (str2 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r12, "ClipsSfxCategory");
            } else if (str3 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("category_type", r12, "ClipsSfxCategory");
            } else if (arrayList != null || !(r12 instanceof 0c9)) {
                return new C61062Jw0(str, str2, str3, (List) arrayList);
            } else {
                AnonymousClass7TF.A1L("preview_items", r12, "ClipsSfxCategory");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
