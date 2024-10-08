package X;

import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CcU  reason: case insensitive filesystem */
public abstract class C44286CcU {
    public static C61062Jw0 parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            User user = null;
            ArrayList arrayList = null;
            String str3 = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if ("attribution_text".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("creation_edu_text".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if ("creator".equals(A17)) {
                    user = C41845B3m.A0a(r12, false);
                } else if ("notes".equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            C279864zZ parseFromJson = B5T.parseFromJson(r12);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("prompt_id".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                }
                r12.A0z();
            }
            if (arrayList == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("notes", r12, "PromptNotesResponseInfo");
            } else if (str3 != null || !(r12 instanceof 0c9)) {
                return new C61062Jw0(user, str, str2, str3, (List) arrayList);
            } else {
                AnonymousClass7TF.A1L("prompt_id", r12, "PromptNotesResponseInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
