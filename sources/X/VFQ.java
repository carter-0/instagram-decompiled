package X;

import java.util.Locale;

public abstract class VFQ {
    public static final 0xI A00(AnonymousClass0iw r2, String str, String str2, String str3, String str4, String str5) {
        0xI A00 = 0xI.A00(r2, "profile_tagging_bio_link_click");
        A00.A0C("link_type", str);
        A00.A0C("link_id", str3);
        A00.A0C("link_text", str4);
        A00.A0C(AnonymousClass000.A00(750), str5);
        A00.A07(C297705sC.A01, str3);
        A00.A07(C297705sC.A02, str4);
        0j9 r1 = C297705sC.A06;
        Locale locale = Locale.ENGLISH;
        0qQ.A08(locale);
        A00.A07(r1, DbT.A12(locale, str2));
        return A00;
    }
}
