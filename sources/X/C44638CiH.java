package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CiH  reason: case insensitive filesystem */
public abstract class C44638CiH {
    public static C47184Drz parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            ArrayList arrayList = null;
            String str2 = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("index".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r13);
                } else if ("themed_image_url".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            N49 parseFromJson = C44643CiN.parseFromJson(r13);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            if (str == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DevServerEntity.COLUMN_DESCRIPTION, r13, "InspirationComponent");
            } else if (num == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("index", r13, "InspirationComponent");
            } else if (arrayList == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("themed_image_url", r13, "InspirationComponent");
            } else if (str2 != null || !(r13 instanceof 0c9)) {
                return new C47184Drz(str, str2, (List) arrayList, num.intValue(), 3);
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r13, "InspirationComponent");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
