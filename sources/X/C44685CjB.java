package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CjB  reason: case insensitive filesystem */
public abstract class C44685CjB {
    public static C68272N8j parseFromJson(16F r14) {
        String A00;
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            String str2 = null;
            ArrayList arrayList2 = null;
            String str3 = null;
            while (true) {
                16L A1J = r14.A1J();
                16L r1 = 16L.A09;
                A00 = C273654mx.A00(3142);
                if (A1J == r1) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r14);
                if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if ("members".equals(A17)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r14.A1J() != 16L.A08) {
                            C41846B3n.A1E(r14, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("context_line".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if (A00.equals(A17)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r14.A1J() != 16L.A08) {
                            C41847B3o.A1L(r14, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("preset_type".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                }
                r14.A0z();
            }
            if (str == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r14, "DirectChannelsThreadCategories");
            } else if (arrayList == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("members", r14, "DirectChannelsThreadCategories");
            } else if (str2 == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("context_line", r14, "DirectChannelsThreadCategories");
            } else if (arrayList2 == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r14, "DirectChannelsThreadCategories");
            } else if (str3 != null || !(r14 instanceof 0c9)) {
                return new C68272N8j(str, str2, str3, arrayList, arrayList2);
            } else {
                AnonymousClass7TF.A1L("preset_type", r14, "DirectChannelsThreadCategories");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
