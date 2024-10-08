package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cdg  reason: case insensitive filesystem */
public abstract class C44360Cdg {
    public static BGT parseFromJson(16F r19) {
        16F r6 = r19;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            String str2 = null;
            ArrayList arrayList2 = null;
            String str3 = null;
            Boolean bool = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Integer num = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("actions".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r6, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("category".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if ("context".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                } else if ("facepile".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C41846B3n.A1E(r6, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("group".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r6.A1P();
                    }
                } else if ("show_hashtag_icon".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r6);
                } else if (C41845B3m.A1L(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r6.A1P();
                    }
                } else if ("subtitle_button_text".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r6.A1P();
                    }
                } else if (!DialogModule.KEY_TITLE.equals(A17)) {
                    num = C41847B3o.A13(r6, num, A17, "user_count");
                } else if (r6.A11() == 16L.A0G) {
                    str6 = null;
                } else {
                    str6 = r6.A1P();
                }
                r6.A0z();
            }
            if (str2 == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L("context", r6, "SmartGroupSummary");
            } else if (arrayList2 == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L("facepile", r6, "SmartGroupSummary");
            } else if (str3 == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L("group", r6, "SmartGroupSummary");
            } else if (str6 != null || !(r6 instanceof 0c9)) {
                return new BGT(bool, num, str, str2, str3, str4, str5, str6, arrayList, arrayList2);
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r6, "SmartGroupSummary");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
