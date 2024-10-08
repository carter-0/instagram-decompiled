package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Hx0  reason: case insensitive filesystem */
public abstract class C56349Hx0 {
    public static C257903y9 parseFromJson(16F r21) {
        16F r5 = r21;
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            Integer num = null;
            String str2 = null;
            Integer num2 = null;
            String str3 = null;
            ArrayList arrayList2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str4 = null;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            String str5 = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("body_list".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("card_background_color".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                } else if ("delay_in_ms".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r5);
                } else if ("format".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                } else if ("image_height".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r5);
                } else if ("image_url".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r5.A1P();
                    }
                } else if ("image_url_list".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("image_width".equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r5);
                } else if ("mid_scene_card_height".equals(A17)) {
                    num4 = AnonymousClass7TF.A0X(r5);
                } else if ("style".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r5.A1P();
                    }
                } else if ("subtitle_list".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList3 = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList3);
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("title_list".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList4 = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList4);
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("title_option".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r5.A1P();
                    }
                }
                r5.A0z();
            }
            if (str2 != null || !(r5 instanceof 0c9)) {
                return new C257903y9(num, num2, num3, num4, str, str2, str3, str4, str5, arrayList, arrayList2, arrayList3, arrayList4);
            }
            AnonymousClass7TF.A1L("format", r5, "ClipsAdMidSceneInfo");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C257903y9 r3) {
        r2.A0c();
        List list = r3.A09;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r2, "body_list", list);
            while (A0s.hasNext()) {
                C41846B3n.A18(r2, A0s);
            }
            r2.A0Y();
        }
        String str = r3.A04;
        if (str != null) {
            r2.A0R("card_background_color", str);
        }
        Integer num = r3.A00;
        if (num != null) {
            r2.A0P("delay_in_ms", num.intValue());
        }
        String str2 = r3.A05;
        if (str2 != null) {
            r2.A0R("format", str2);
        }
        Integer num2 = r3.A01;
        if (num2 != null) {
            r2.A0P("image_height", num2.intValue());
        }
        String str3 = r3.A06;
        if (str3 != null) {
            r2.A0R("image_url", str3);
        }
        List list2 = r3.A0A;
        if (list2 != null) {
            Iterator A0s2 = C41845B3m.A0s(r2, "image_url_list", list2);
            while (A0s2.hasNext()) {
                C41846B3n.A18(r2, A0s2);
            }
            r2.A0Y();
        }
        Integer num3 = r3.A02;
        if (num3 != null) {
            r2.A0P("image_width", num3.intValue());
        }
        Integer num4 = r3.A03;
        if (num4 != null) {
            r2.A0P("mid_scene_card_height", num4.intValue());
        }
        String str4 = r3.A07;
        if (str4 != null) {
            r2.A0R("style", str4);
        }
        List list3 = r3.A0B;
        if (list3 != null) {
            Iterator A0s3 = C41845B3m.A0s(r2, "subtitle_list", list3);
            while (A0s3.hasNext()) {
                C41846B3n.A18(r2, A0s3);
            }
            r2.A0Y();
        }
        List list4 = r3.A0C;
        if (list4 != null) {
            Iterator A0s4 = C41845B3m.A0s(r2, "title_list", list4);
            while (A0s4.hasNext()) {
                C41846B3n.A18(r2, A0s4);
            }
            r2.A0Y();
        }
        String str5 = r3.A08;
        if (str5 != null) {
            r2.A0R("title_option", str5);
        }
        r2.A0Z();
    }
}
