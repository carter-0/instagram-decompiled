package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Epm  reason: case insensitive filesystem */
public abstract class C49123Epm {
    public static C47157DrY parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            ArrayList arrayList = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if (TraceFieldType.ContentType.equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("footer".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if (DialogModule.KEY_ITEMS.equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            AnonymousClass9JM parseFromJson = C49122Epl.parseFromJson(r12);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("link_destination".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if ("link_text".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r12.A1P();
                    }
                } else if ("subtitle".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r12.A1P();
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r12.A1P();
                    }
                }
                r12.A0z();
            }
            if (arrayList != null || !(r12 instanceof 0c9)) {
                return new C47157DrY(str, str2, str3, str4, str5, str6, arrayList);
            }
            AnonymousClass7TF.A1L(DialogModule.KEY_ITEMS, r12, "NotificationSettingSection");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
