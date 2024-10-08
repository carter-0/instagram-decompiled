package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.LeP  reason: case insensitive filesystem */
public final class C64583LeP implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "TypeaheadStickerFalcoLogger";
    public final 0wc A00;

    public final String getModuleName() {
        return "ig_typeahead_stickers";
    }

    public C64583LeP(UserSession userSession) {
        this.A00 = AnonymousClass0kN.A01(this, userSession);
    }

    public final void A00(String str, String str2, String str3, String str4, 0sn r9, List list, boolean z) {
        String str5;
        AnonymousClass7TG.A1O(str2, str3);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "avatar_stickers_measurement_typeahead_recommendations");
        if (A0e.isSampled()) {
            0bb r2 = new 0bb();
            r2.A05("result_size", DbS.A0j(r9.size()));
            r2.A06("referrer_surface", "message_thread");
            r2.A06("lexicon_version", str4);
            if (AnonymousClass7TE.A1b(list)) {
                r9 = 0sn.A00;
            }
            r2.A07("non_avatar_sticker_ids", r9);
            if (z) {
                str5 = "raw";
            } else {
                str5 = "filtered";
            }
            r2.A06(C273654mx.A00(91), str5);
            r2.A06(C273654mx.A00(627), str3);
            r2.A06(Pxd.A00(8), str2);
            r2.A07("intent", list);
            JTR.A1I(A0e, r2, str);
            JTQ.A15(A0e, "typeahead");
        }
    }
}
