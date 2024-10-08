package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.UUID;

/* renamed from: X.6i4  reason: invalid class name and case insensitive filesystem */
public final class C314356i4 {
    public C61294K1h A00;
    public String A01;
    public boolean A02;
    public final 0wc A03;
    public final HashSet A04 = new HashSet();
    public final UserSession A05;

    public final void A00(String str) {
        Long l;
        if (!this.A02) {
            0wc r2 = this.A03;
            0Aj A002 = r2.A00(r2.A00, "avatar_stickers_measurement_avatar_sticker_tray_launch");
            0bb r3 = new 0bb();
            r3.A06("referrer_surface", "quick_reaction");
            r3.A06(AnonymousClass000.A00(1906), "story_view");
            if (A002.isSampled()) {
                A002.AAK(r3, "event_data");
                A002.AAJ("avatar_session_id", this.A01);
                if (str != null) {
                    l = 00y.A0n(10, str);
                } else {
                    l = null;
                }
                A002.A9F("avatar_id", l);
                A002.AAJ("product", "navigation");
                A002.Cgf();
                this.A02 = true;
            }
        }
    }

    public C314356i4(0wc r2, UserSession userSession) {
        this.A05 = userSession;
        this.A03 = r2;
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        this.A01 = obj;
    }
}
