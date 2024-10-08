package X;

import com.instagram.common.session.UserSession;

public final class LNM {
    public static final LNM A00 = new Object();

    public final 1NY A00(UserSession userSession, C279284yO r8, String str) {
        String str2;
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("media/sticker_tray_section/");
        if (r8 instanceof AnonymousClass80O) {
            str2 = "CLIPS";
        } else {
            str2 = "STORIES";
        }
        A0b.A9m("surface", str2);
        A0b.A9m("section_name", "custom_stickers");
        A0b.A9m("cutout_sticker_media_type_filter", (String) null);
        A0b.A0A = "media/sticker_tray_section/";
        A0b.A07(AnonymousClass05K.A01);
        A0b.A0Q(K1S.class, C63995LHv.class);
        if (str != null) {
            A0b.A9m("item_cursor", str);
        }
        return A0b;
    }
}
