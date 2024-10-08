package X;

import com.instagram.common.session.UserSession;

public final class JY2 {
    public static final /* synthetic */ AnonymousClass0YZ[] A05;
    public final UserSession A00;
    public final AnonymousClass0eM A01;
    public final 0s0 A02;
    public final 0s0 A03;
    public final 0s0 A04;

    static {
        Class<JY2> cls = JY2.class;
        A05 = new AnonymousClass0YZ[]{new 015(cls, "suggestionsACRUpdatedMs", "getSuggestionsACRUpdatedMs()J", 0), new 015(cls, "suggestionsSmartAlbumsUpdatedMs", "getSuggestionsSmartAlbumsUpdatedMs()J", 0), new 015(cls, "suggestionsMagicMediaUpdatedMs", "getSuggestionsMagicMediaUpdatedMs()J", 0)};
    }

    public JY2(UserSession userSession) {
        this.A00 = userSession;
        0t0 A012 = AnonymousClass0eN.A01(new C73662Phb(this, 34));
        this.A01 = A012;
        1An r6 = 1An.A0c;
        Class<?> cls = getClass();
        this.A02 = 0xW.A02(((1Am) A012.getValue()).A04(r6, cls), "suggestions_acr_last_updated_key", 0, false);
        this.A04 = 0xW.A02(((1Am) this.A01.getValue()).A04(r6, cls), "suggestions_smart_album_last_updated_key", 0, false);
        this.A03 = 0xW.A02(((1Am) this.A01.getValue()).A04(r6, cls), "suggestions_magic_media_last_updated_key", 0, false);
    }

    public final 0eP A00() {
        0xa A0V = JTS.A0V(this);
        if (!A0V.contains("suggestions_home_latitude_prefs_key")) {
            return null;
        }
        return AnonymousClass7TE.A1L(Float.valueOf(A0V.getFloat("suggestions_home_latitude_prefs_key", 0.0f)), Float.valueOf(A0V.getFloat("suggestions_home_longitude_prefs_key", 0.0f)));
    }
}
