package X;

import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CXl  reason: case insensitive filesystem */
public abstract class C44146CXl {
    public static C15039UKs parseFromJson(16F r18) {
        16F r4 = r18;
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            ArrayList arrayList = null;
            String str2 = null;
            C250533lb r7 = null;
            String str3 = null;
            ArrayList arrayList2 = null;
            Boolean bool = null;
            User user = null;
            String str4 = null;
            String str5 = null;
            Integer num2 = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("disclaimer_content".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                } else if (C41845B3m.A1Y(A17)) {
                    num = AnonymousClass7TF.A0X(r4);
                } else if ("hide_reasons_v2".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C250263lA parseFromJson = C250253l9.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C41845B3m.A17(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r4.A1P();
                    }
                } else if ("item_client_gap_rules".equals(A17)) {
                    r7 = C250523la.parseFromJson(r4);
                } else if ("learn_more_url".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r4.A1P();
                    }
                } else if ("questions".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C15059UNc parseFromJson2 = C18127Vlv.parseFromJson(r4);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("show_learn_more".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r4);
                } else if ("sponsor".equals(A17)) {
                    user = C41845B3m.A0a(r4, false);
                } else if (C41845B3m.A1L(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r4.A1P();
                    }
                } else if (!C41845B3m.A1W(A17)) {
                    num2 = C41847B3o.A13(r4, num2, A17, "view_state_item_type");
                } else if (r4.A11() == 16L.A0G) {
                    str5 = null;
                } else {
                    str5 = r4.A1P();
                }
                r4.A0z();
            }
            return new C15039UKs(r7, user, bool, num, num2, str, str2, str3, str4, str5, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
