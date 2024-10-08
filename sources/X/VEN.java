package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class VEN {
    public static C68181N3w parseFromJson(16F r21) {
        16F r3 = r21;
        0qQ.A0B(r3, 0);
        try {
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            ArrayList arrayList4 = null;
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("customized_tokens".equals(A17)) {
                    if (r3.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r3.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r3, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("dependent_questions_dynamic_info".equals(A17)) {
                    if (r3.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r3.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r3, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("dependent_questions_static_info".equals(A17)) {
                    if (r3.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r3.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r3, arrayList3);
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("field_key".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                } else if ("field_type".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r3.A1P();
                    }
                } else if ("input_domain".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r3.A1P();
                    }
                } else if ("input_type".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r3.A1P();
                    }
                } else if (AnonymousClass000.A00(1505).equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r3);
                } else if ("is_editable".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r3);
                } else if ("is_required".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r3);
                } else if (C41845B3m.A19(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r3.A1P();
                    }
                } else if ("place_holder".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r3.A1P();
                    }
                } else if ("validation_spec".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r3.A1P();
                    }
                } else if ("values".equals(A17)) {
                    if (r3.A11() == 16L.A0C) {
                        arrayList4 = new ArrayList();
                        while (r3.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r3, arrayList4);
                        }
                    } else {
                        arrayList4 = null;
                    }
                }
                r3.A0z();
            }
            return new C68181N3w(bool, bool2, bool3, str, str2, str3, str4, str5, str6, str7, (List) arrayList, (List) arrayList2, (List) arrayList3, (List) arrayList4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
