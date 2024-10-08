package X;

import java.io.IOException;

/* renamed from: X.Czy  reason: case insensitive filesystem */
public abstract class C45648Czy {
    public static BHJ parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Boolean bool = null;
            String str3 = null;
            String str4 = null;
            Float f = null;
            Integer num = null;
            String str5 = null;
            Boolean bool2 = null;
            Float f2 = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("background_color".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("emoji".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("is_interactive_music_sticker".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r13);
                } else if ("question".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if ("slider_id".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                } else if ("slider_vote_average".equals(A17)) {
                    f = AnonymousClass7TF.A0U(r13);
                } else if ("slider_vote_count".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r13);
                } else if ("text_color".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r13.A1P();
                    }
                } else if ("viewer_can_vote".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r13);
                } else if ("viewer_vote".equals(A17)) {
                    f2 = AnonymousClass7TF.A0U(r13);
                }
                r13.A0z();
            }
            return new BHJ(bool, bool2, f, f2, num, str, str2, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, BHJ bhj, boolean z) {
        if (z) {
            r2.A0c();
        }
        String str = bhj.A05;
        if (str != null) {
            r2.A0R("background_color", str);
        }
        String str2 = bhj.A06;
        if (str2 != null) {
            r2.A0R("emoji", str2);
        }
        Boolean bool = bhj.A00;
        if (bool != null) {
            r2.A0S("is_interactive_music_sticker", bool.booleanValue());
        }
        String str3 = bhj.A07;
        if (str3 != null) {
            r2.A0R("question", str3);
        }
        String str4 = bhj.A08;
        if (str4 != null) {
            r2.A0R("slider_id", str4);
        }
        Float f = bhj.A02;
        if (f != null) {
            r2.A0O("slider_vote_average", f.floatValue());
        }
        Integer num = bhj.A04;
        if (num != null) {
            r2.A0P("slider_vote_count", num.intValue());
        }
        String str5 = bhj.A09;
        if (str5 != null) {
            r2.A0R("text_color", str5);
        }
        Boolean bool2 = bhj.A01;
        if (bool2 != null) {
            r2.A0S("viewer_can_vote", bool2.booleanValue());
        }
        Float f2 = bhj.A03;
        if (f2 != null) {
            r2.A0O("viewer_vote", f2.floatValue());
        }
        if (z) {
            r2.A0Z();
        }
    }
}
