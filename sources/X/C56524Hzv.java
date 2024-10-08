package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Hzv  reason: case insensitive filesystem */
public final class C56524Hzv {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final JPM A02;
    public final String A03;
    public final C17266VOt A04;

    public static final void A00(C296935qt r4, C56524Hzv hzv, 1Xj r6, int i, int i2) {
        0xF r3;
        ArrayList arrayList;
        Long l;
        0Aj A0N = C51972G9s.A0N(hzv.A00, hzv.A01);
        if (A0N.isSampled()) {
            String str = hzv.A03;
            if (str != null) {
                C51967G9n.A18(A0N, str);
            }
            JPM jpm = hzv.A02;
            if (jpm != null) {
                r3 = jpm.E4v(r4, r6);
            } else {
                r3 = null;
            }
            G9t.A1I(A0N, r6, PublicKeyCredentialControllerUtility.JSON_KEY_ID, r6.getId());
            A0N.AAJ("position", C320166rs.A01(i, i2));
            G9t.A1H(A0N, r6);
            A0N.A9F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C51971G9r.A0m());
            A0N.AAe("product_ids", r6.A3g());
            ArrayList A3C = r6.A3C();
            if (A3C != null) {
                arrayList = AnonymousClass7TG.A0r(A3C);
                Iterator it = A3C.iterator();
                while (it.hasNext()) {
                    C51972G9s.A1H(arrayList, it);
                }
            } else {
                arrayList = null;
            }
            A0N.AAe("merchant_ids", arrayList);
            if (r3 != null) {
                String A05 = r3.A05("hashtag_id");
                if (A05 != null) {
                    try {
                        A0N.A9F("hashtag_id", AnonymousClass7TE.A10(A05));
                    } catch (NumberFormatException e) {
                        0KC.A0G("DiscoveryImpressionHelper", "Failed to convert hashtag id to long", e);
                    }
                }
                C51971G9r.A18(A0N, r3, "hashtag_name");
                C51971G9r.A18(A0N, r3, "hashtag_follow_status");
                String A052 = r3.A05("query_text");
                if (A052 != null) {
                    A0N.A7p("is_tag", Boolean.valueOf(C253063q9.A02(A052)));
                }
                String A053 = r3.A05(AnonymousClass000.A00(956));
                if (A053 != null) {
                    A0N.AAJ("tag_navigation_source", A053);
                }
                0bb r1 = new 0bb();
                C51971G9r.A18(A0N, r3, "search_session_id");
                C51971G9r.A18(A0N, r3, "rank_token");
                C51971G9r.A18(A0N, r3, "query_text");
                C51974G9v.A0w(r1, r3);
                A0N.AAK(r1, "search_context");
            }
            if (r6.BR7() == 1iA.A09) {
                C51965G9l.A1G(A0N, C254443sU.A06(r6, 0));
                A0N.AAJ("carousel_media_id", C254443sU.A0G(r6, 0));
                if (r6.A5D()) {
                    String id = r6.getId();
                    if (id != null) {
                        l = AnonymousClass7TE.A10(id);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    l = null;
                }
                A0N.A9F("carousel_container_media_id", l);
            }
            G9w.A17(A0N);
        }
        C17266VOt vOt = hzv.A04;
        if (vOt != null) {
            String id2 = r6.getId();
            if (id2 != null) {
                C15286UZq uZq = vOt.A00;
                Number A14 = C51966G9m.A14(id2, ((N4N) C67757MuC.A03(uZq.A07()).getValue()).A0J);
                if (A14 != null) {
                    int intValue = A14.intValue();
                    C18611Vv4 vv4 = uZq.A0D;
                    if (vv4 == null) {
                        0qQ.A0F("perfLogger");
                        throw AnonymousClass00P.createAndThrow();
                    } else {
                        vv4.A02(intValue);
                    }
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public C56524Hzv(AnonymousClass0iw r1, UserSession userSession, JPM jpm, C17266VOt vOt, String str) {
        AnonymousClass7TG.A1O(r1, userSession);
        this.A00 = r1;
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = jpm;
        this.A04 = vOt;
    }
}
