package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.Set;

/* renamed from: X.6uB  reason: invalid class name and case insensitive filesystem */
public final class C321446uB implements C250603lj {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final AnonymousClass32Q A03;
    public final User A04;
    public final Set A05;

    public final void ATF(AnonymousClass30Y r11, C252093oY r12) {
        0xF r3;
        Long l;
        String str;
        0qQ.A0B(r11, 0);
        0qQ.A0B(r12, 1);
        if (r12.CEk(r11) == AnonymousClass05K.A00) {
            Reel reel = (Reel) r11.A03;
            Number number = (Number) r11.A04;
            Set set = this.A05;
            String id = reel.getId();
            0qQ.A07(id);
            if (set.add(id)) {
                AnonymousClass4DU r1 = this.A02;
                if (r1 instanceof C232682uF) {
                    r3 = ((C232682uF) r1).E4k().A00();
                } else {
                    r3 = null;
                }
                UserSession userSession = this.A01;
                AnonymousClass0iw r13 = this.A00;
                User user = this.A04;
                0qQ.A0A(number);
                int intValue = number.intValue();
                int i = intValue / 3;
                int i2 = intValue % 3;
                0wc A012 = AnonymousClass0kN.A01(r13, userSession);
                0Aj A002 = A012.A00(A012.A00, "instagram_thumbnail_impression");
                if (A002.isSampled()) {
                    String id2 = reel.getId();
                    if (id2 == null || (str = (String) 00l.A0R(id2, new String[]{"highlight:"}, 0).get(1)) == null) {
                        l = null;
                    } else {
                        l = 00y.A0n(10, str);
                    }
                    A002.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_ID, reel.getId());
                    A002.AAJ("position", C320166rs.A01(i, i2));
                    A002.AAJ("entity_type", PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                    A002.A9F("highlight_id", l);
                    if (user != null) {
                        A002.A9F("entity_id", 00y.A0n(10, user.getId()));
                        A002.AAJ("entity_name", user.getUsername());
                    }
                    if (r3 != null) {
                        A002.AAJ("media_thumbnail_section", r3.A05("media_thumbnail_section"));
                        A002.A9F("entity_page_id", r3.A04("entity_page_id"));
                        A002.AAJ("entity_page_name", r3.A05("entity_page_name"));
                    }
                    A002.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
                    A002.AAJ("device_aspect_ratio_category", C254473sX.A00);
                    A002.AAJ("device_fold_orientation", C254483sY.A00);
                    A002.AAJ("device_fold_state", C254493sZ.A00);
                    A002.A7p("device_is_in_multi_window_mode", C254503sa.A00);
                    A002.Cgf();
                }
            }
        }
    }

    public C321446uB(AnonymousClass0iw r1, UserSession userSession, AnonymousClass4DU r3, AnonymousClass32Q r4, User user, Set set) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = userSession;
        this.A04 = user;
        this.A03 = r4;
        this.A05 = set;
    }
}
