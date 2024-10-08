package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class D08 {
    public static C42107BHk parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            C15059UNc uNc = null;
            Boolean bool3 = null;
            String str = null;
            Boolean bool4 = null;
            String str2 = null;
            ArrayList arrayList = null;
            Integer num = null;
            Integer num2 = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("enable_indexing".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r13);
                } else if ("enable_navigation".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r13);
                } else if ("extra_question".equals(A17)) {
                    uNc = C18127Vlv.parseFromJson(r13);
                } else if ("has_submit".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r13);
                } else if (C41845B3m.A17(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("log_on_each_answer".equals(A17)) {
                    bool4 = AnonymousClass7TF.A0S(r13);
                } else if ("module_type".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("questions".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            C15059UNc parseFromJson = C18127Vlv.parseFromJson(r13);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("unlock_question".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r13);
                } else {
                    num2 = C41847B3o.A13(r13, num2, A17, "vertical_padding");
                }
                r13.A0z();
            }
            return new C42107BHk(uNc, bool, bool2, bool3, bool4, num, num2, str, str2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C42107BHk bHk) {
        r2.A0c();
        Boolean bool = bHk.A01;
        if (bool != null) {
            r2.A0S("enable_indexing", bool.booleanValue());
        }
        Boolean bool2 = bHk.A02;
        if (bool2 != null) {
            r2.A0S("enable_navigation", bool2.booleanValue());
        }
        C15059UNc uNc = bHk.A00;
        if (uNc != null) {
            r2.A0q("extra_question");
            C18127Vlv.A00(r2, uNc);
        }
        Boolean bool3 = bHk.A03;
        if (bool3 != null) {
            r2.A0S("has_submit", bool3.booleanValue());
        }
        C41846B3n.A0y(r2, bHk.A07);
        Boolean bool4 = bHk.A04;
        if (bool4 != null) {
            r2.A0S("log_on_each_answer", bool4.booleanValue());
        }
        String str = bHk.A08;
        if (str != null) {
            r2.A0R("module_type", str);
        }
        List list = bHk.A09;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r2, "questions", list);
            while (A0s.hasNext()) {
                C15059UNc uNc2 = (C15059UNc) A0s.next();
                if (uNc2 != null) {
                    C18127Vlv.A00(r2, uNc2);
                }
            }
            r2.A0Y();
        }
        Integer num = bHk.A05;
        if (num != null) {
            r2.A0P("unlock_question", num.intValue());
        }
        Integer num2 = bHk.A06;
        if (num2 != null) {
            r2.A0P("vertical_padding", num2.intValue());
        }
        r2.A0Z();
    }
}
