package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vlt  reason: case insensitive filesystem */
public abstract class C18125Vlt {
    public static UNZ parseFromJson(16F r18) {
        16F r4 = r18;
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            String str2 = null;
            Boolean bool = null;
            String str3 = null;
            ArrayList arrayList = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            ArrayList arrayList2 = null;
            String str7 = null;
            Integer num2 = null;
            Boolean bool2 = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("correct_answer".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r4);
                } else if ("default_prompt".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                } else if ("end_background_color".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r4.A1P();
                    }
                } else if ("finished".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r4);
                } else if (C41845B3m.A17(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r4.A1P();
                    }
                } else if ("options".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C15057UNa parseFromJson = C18126Vlu.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("question".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r4.A1P();
                    }
                } else if ("quiz_id".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r4.A1P();
                    }
                } else if ("start_background_color".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r4.A1P();
                    }
                } else if ("tallies".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C15057UNa parseFromJson2 = C18126Vlu.parseFromJson(r4);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("text_color".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r4.A1P();
                    }
                } else if ("viewer_answer".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r4);
                } else if ("viewer_can_answer".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r4);
                }
                r4.A0z();
            }
            return new UNZ(bool, bool2, num, num2, str, str2, str3, str4, str5, str6, str7, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, UNZ unz, boolean z) {
        if (z) {
            r2.A0c();
        }
        Integer num = unz.A02;
        if (num != null) {
            r2.A0P("correct_answer", num.intValue());
        }
        String str = unz.A04;
        if (str != null) {
            r2.A0R("default_prompt", str);
        }
        String str2 = unz.A05;
        if (str2 != null) {
            r2.A0R("end_background_color", str2);
        }
        Boolean bool = unz.A00;
        if (bool != null) {
            r2.A0S("finished", bool.booleanValue());
        }
        C41846B3n.A0y(r2, unz.A06);
        List list = unz.A0B;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r2, "options", list);
            while (A0s.hasNext()) {
                C21026XAf xAf = (C21026XAf) A0s.next();
                if (xAf != null) {
                    C18126Vlu.A00(r2, xAf.FB5());
                }
            }
            r2.A0Y();
        }
        String str3 = unz.A07;
        if (str3 != null) {
            r2.A0R("question", str3);
        }
        String str4 = unz.A08;
        if (str4 != null) {
            r2.A0R("quiz_id", str4);
        }
        String str5 = unz.A09;
        if (str5 != null) {
            r2.A0R("start_background_color", str5);
        }
        List list2 = unz.A0C;
        if (list2 != null) {
            Iterator A0s2 = C41845B3m.A0s(r2, "tallies", list2);
            while (A0s2.hasNext()) {
                C21026XAf xAf2 = (C21026XAf) A0s2.next();
                if (xAf2 != null) {
                    C18126Vlu.A00(r2, xAf2.FB5());
                }
            }
            r2.A0Y();
        }
        C13988Tno.A1G(r2, unz.A0A);
        Integer num2 = unz.A03;
        if (num2 != null) {
            r2.A0P("viewer_answer", num2.intValue());
        }
        Boolean bool2 = unz.A01;
        if (bool2 != null) {
            r2.A0S("viewer_can_answer", bool2.booleanValue());
        }
        if (z) {
            r2.A0Z();
        }
    }
}
