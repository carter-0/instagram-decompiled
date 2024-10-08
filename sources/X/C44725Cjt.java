package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cjt  reason: case insensitive filesystem */
public abstract class C44725Cjt {
    public static N3M parseFromJson(16F r23) {
        16F r4 = r23;
        0qQ.A0B(r4, 0);
        try {
            Boolean bool = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Boolean bool2 = null;
            ArrayList arrayList = null;
            String str6 = null;
            Integer num = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            String str7 = null;
            String str8 = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("action_emphasized".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r4);
                } else if ("action_link".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                } else if ("action_text".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r4.A1P();
                    }
                } else if ("body_text".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r4.A1P();
                    }
                } else if ("category_id".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r4.A1P();
                    }
                } else if ("category_name".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r4.A1P();
                    }
                } else if ("enable_sensitivity_screen".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r4);
                } else if ("inform_module_actions".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            UNB parseFromJson = C44191CZe.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("inform_module_actions_title".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r4.A1P();
                    }
                } else if ("inform_module_behavior".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r4);
                } else if ("priority_inform_module_actions".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            UNP parseFromJson2 = C44250Cbl.parseFromJson(r4);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("resources".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList3 = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1E(r4, arrayList3);
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("see_results_button_text".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r4.A1P();
                    }
                } else if ("title_text".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r4.A1P();
                    }
                }
                r4.A0z();
            }
            if (bool == null && (r4 instanceof 0c9)) {
                AnonymousClass7TF.A1L("action_emphasized", r4, "InformMessage");
            } else if (str3 != null || !(r4 instanceof 0c9)) {
                return new N3M(bool2, num, str, str2, str3, str4, str5, str6, str7, str8, arrayList, arrayList2, arrayList3, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("body_text", r4, "InformMessage");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
