package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cyx  reason: case insensitive filesystem */
public abstract class C45585Cyx {
    public static BFH parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            ArrayList arrayList = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("background_color".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("emphasis_style".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if (C41845B3m.A17(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                } else if ("original_caption_uri".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r10.A1P();
                    }
                } else if ("sticker_style".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r10.A1P();
                    }
                } else if ("text_color".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r10.A1P();
                    }
                } else if ("translated_captions".equals(A17)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r10.A1J() != 16L.A08) {
                            BFJ parseFromJson = C44201CZo.parseFromJson(r10);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r10.A0z();
            }
            return new BFH(str, str2, str3, str4, str5, str6, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r4, BFH bfh) {
        r4.A0c();
        String str = bfh.A00;
        if (str != null) {
            r4.A0R("background_color", str);
        }
        String str2 = bfh.A01;
        if (str2 != null) {
            r4.A0R("emphasis_style", str2);
        }
        C41846B3n.A0y(r4, bfh.A02);
        String str3 = bfh.A03;
        if (str3 != null) {
            r4.A0R("original_caption_uri", str3);
        }
        String str4 = bfh.A04;
        if (str4 != null) {
            r4.A0R("sticker_style", str4);
        }
        String str5 = bfh.A05;
        if (str5 != null) {
            r4.A0R("text_color", str5);
        }
        List list = bfh.A06;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r4, "translated_captions", list);
            while (A0s.hasNext()) {
                C46250DSf dSf = (C46250DSf) A0s.next();
                if (dSf != null) {
                    BFJ F5M = dSf.F5M();
                    r4.A0c();
                    String str6 = F5M.A00;
                    if (str6 != null) {
                        r4.A0R("language", str6);
                    }
                    String str7 = F5M.A01;
                    if (str7 != null) {
                        r4.A0R("uri", str7);
                    }
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        r4.A0Z();
    }
}
