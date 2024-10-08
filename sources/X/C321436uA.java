package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.6uA  reason: invalid class name and case insensitive filesystem */
public final class C321436uA implements C250603lj {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final C294255m9 A03;
    public final AnonymousClass32Q A04;
    public final User A05;
    public final Set A06;

    public final void ATF(AnonymousClass30Y r11, C252093oY r12) {
        0xF r8;
        ArrayList arrayList;
        Long l;
        String Bmx;
        Integer Bd0;
        0qQ.A0B(r11, 0);
        0qQ.A0B(r12, 1);
        if (r12.CEk(r11) == AnonymousClass05K.A00) {
            1Xj r4 = (1Xj) r11.A03;
            Number number = (Number) r11.A04;
            Set set = this.A06;
            String id = r4.getId();
            if (id == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (set.add(id)) {
                AnonymousClass4DU r1 = this.A02;
                if (r1 instanceof C232682uF) {
                    r8 = ((C232682uF) r1).E4l(r4).A00();
                } else {
                    r8 = null;
                }
                UserSession userSession = this.A01;
                AnonymousClass0iw r13 = this.A00;
                User user = this.A05;
                0qQ.A0A(number);
                int intValue = number.intValue();
                int i = intValue / 3;
                int i2 = intValue % 3;
                C294255m9 r5 = this.A03;
                0wc A012 = AnonymousClass0kN.A01(r13, userSession);
                0Aj A002 = A012.A00(A012.A00, "instagram_thumbnail_impression");
                if (A002.isSampled()) {
                    A002.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r4.getId());
                    A002.AAJ("m_pk", r4.getId());
                    A002.AAJ("position", C320166rs.A01(i, i2));
                    A002.A8M(r4.BR7().A00(), "media_type");
                    A002.AAJ("entity_type", PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                    A002.AAe("product_ids", r4.A3g());
                    ArrayList A3C = r4.A3C();
                    Long l2 = null;
                    if (A3C != null) {
                        arrayList = new ArrayList(0Yv.A1E(A3C, 10));
                        Iterator it = A3C.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((C263944Ny) it.next()).A00);
                        }
                    } else {
                        arrayList = null;
                    }
                    A002.AAe("merchant_ids", arrayList);
                    A002.AAJ("ranking_info_token", r4.A0C.getLoggingInfoToken());
                    if (r4.A0C.Bd0() == null || (Bd0 = r4.A0C.Bd0()) == null) {
                        l = null;
                    } else {
                        l = Long.valueOf((long) Bd0.intValue());
                    }
                    A002.A9F("play_count", l);
                    if (user != null) {
                        A002.A9F("entity_id", 00y.A0n(10, user.getId()));
                        A002.AAJ("entity_name", user.getUsername());
                    }
                    if (r8 != null) {
                        A002.AAJ("media_thumbnail_section", r8.A05("media_thumbnail_section"));
                        A002.A9F("entity_page_id", r8.A04("entity_page_id"));
                        A002.AAJ("entity_page_name", r8.A05("entity_page_name"));
                    }
                    if (r5 == C294255m9.A0C && r4.A0C.Bmy() != null) {
                        C46300DUd Bmy = r4.A0C.Bmy();
                        if (!(Bmy == null || (Bmx = Bmy.Bmx()) == null)) {
                            l2 = 00y.A0n(10, Bmx);
                        }
                        A002.A9F("repost_id", l2);
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

    public C321436uA(AnonymousClass0iw r1, UserSession userSession, AnonymousClass4DU r3, C294255m9 r4, AnonymousClass32Q r5, User user, Set set) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = userSession;
        this.A05 = user;
        this.A04 = r5;
        this.A06 = set;
        this.A03 = r4;
    }
}
