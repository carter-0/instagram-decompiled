package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class D0D {
    public static C42117BHv parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            String str = null;
            Float f = null;
            String str2 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            ArrayList arrayList = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("emphasis_style".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("font_size".equals(A17)) {
                    f = AnonymousClass7TF.A0U(r13);
                } else if (C41845B3m.A17(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("is_animated".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r13);
                } else if ("is_flig_enabled".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r13);
                } else if (C41845B3m.A1A(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if ("text_alignment".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                } else if ("text_color".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r13.A1P();
                    }
                } else if ("text_format".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r13.A1P();
                    }
                } else if ("translated_text".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            C42119BHx parseFromJson = C44532CgS.parseFromJson(r13);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r13.A0z();
            }
            return new C42117BHv(bool, bool2, f, str, str2, str3, str4, str5, str6, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r4, C42117BHv bHv) {
        r4.A0c();
        String str = bHv.A03;
        if (str != null) {
            r4.A0R("emphasis_style", str);
        }
        Float f = bHv.A02;
        if (f != null) {
            r4.A0O("font_size", f.floatValue());
        }
        C41846B3n.A0y(r4, bHv.A04);
        Boolean bool = bHv.A00;
        if (bool != null) {
            r4.A0S("is_animated", bool.booleanValue());
        }
        Boolean bool2 = bHv.A01;
        if (bool2 != null) {
            r4.A0S("is_flig_enabled", bool2.booleanValue());
        }
        C41846B3n.A0z(r4, bHv.A05);
        String str2 = bHv.A06;
        if (str2 != null) {
            r4.A0R("text_alignment", str2);
        }
        String str3 = bHv.A07;
        if (str3 != null) {
            r4.A0R("text_color", str3);
        }
        String str4 = bHv.A08;
        if (str4 != null) {
            r4.A0R("text_format", str4);
        }
        List list = bHv.A09;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r4, "translated_text", list);
            while (A0s.hasNext()) {
                C46270DSz dSz = (C46270DSz) A0s.next();
                if (dSz != null) {
                    C42119BHx FCo = dSz.FCo();
                    r4.A0c();
                    String str5 = FCo.A00;
                    if (str5 != null) {
                        r4.A0R("language", str5);
                    }
                    String str6 = FCo.A01;
                    if (str6 != null) {
                        r4.A0R("translation", str6);
                    }
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        r4.A0Z();
    }
}
