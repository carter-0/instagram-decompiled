package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Idm  reason: case insensitive filesystem */
public final class C57621Idm implements C59595JPp {
    public final C267324bN A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final void Ckn(Integer num, int i, int i2) {
        1Xj r5;
        List list;
        String str;
        0qQ.A0B(num, 2);
        C267324bN r3 = this.A00;
        if (r3.A0E() && (r5 = r3.A02) != null && (list = r3.A0R) != null) {
            UserSession userSession = this.A02;
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this.A01, userSession), "instagram_ad_carousel_swipe");
            if (num.intValue() != 0) {
                str = "user_swipe";
            } else {
                str = "auto_advance";
            }
            Long A0p = DbV.A0p(A0e, "source_of_swipe", str, i);
            A0e.A9F("from_index", A0p);
            A0e.A9F(AnonymousClass000.A00(4117), DbS.A0j(i2));
            C51965G9l.A1G(A0e, A0p);
            A0e.A9F("carousel_size", DbS.A0j(list.size()));
            C51965G9l.A1L(A0e, r3.A06().A0j);
            1Xj r0 = r3.A02;
            String str2 = null;
            A0e.AAJ("carousel_media_id", C51969G9p.A0u(r0));
            1Xj r02 = (1Xj) 00k.A0J(list);
            if (r02 != null) {
                str2 = r02.getId();
            }
            C51972G9s.A16(A0e, r5, "carousel_cover_media_id", str2);
            A0e.A9F("a_pk_long", Long.valueOf(C294185m0.A00(userSession, r5)));
            User A2A = r5.A2A(userSession);
            0qQ.A0A(A2A);
            A0e.AAJ("a_pk", Long.valueOf(Long.parseLong(A2A.getId())).toString());
            A0e.Cgf();
        }
    }

    public final void Ckt(AdFormatType adFormatType) {
        1Xj r5;
        String A0m;
        C267324bN r3 = this.A00;
        if (r3.A0E() && (r5 = r3.A02) != null) {
            UserSession userSession = this.A02;
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this.A01, userSession), "instagram_ad_thumbnail_swipe");
            C51970G9q.A17(A0e, Long.parseLong(C51966G9m.A1B(r3)));
            if (adFormatType != null) {
                int ordinal = adFormatType.ordinal();
                if (ordinal == 2) {
                    A0m = "hscroll";
                } else if (ordinal == 6) {
                    A0m = "slide_scrubber";
                }
                A0e.AAJ("format", A0m);
                C51972G9s.A16(A0e, r5, "tracking_token", r3.A06().A0j);
                User A2A = r5.A2A(userSession);
                0qQ.A0A(A2A);
                A0e.AAJ("a_pk", Long.valueOf(Long.parseLong(A2A.getId())).toString());
                A0e.AAJ("carousel_media_id", G9t.A1A(r3));
                A0e.Cgf();
            }
            A0m = AnonymousClass7TG.A0m(adFormatType, "Invalid format type: ", AnonymousClass7TE.A1A());
            A0e.AAJ("format", A0m);
            C51972G9s.A16(A0e, r5, "tracking_token", r3.A06().A0j);
            User A2A2 = r5.A2A(userSession);
            0qQ.A0A(A2A2);
            A0e.AAJ("a_pk", Long.valueOf(Long.parseLong(A2A2.getId())).toString());
            A0e.AAJ("carousel_media_id", G9t.A1A(r3));
            A0e.Cgf();
        }
    }

    public C57621Idm(C267324bN r1, AnonymousClass0iw r2, UserSession userSession) {
        AnonymousClass7TG.A1U(r1, userSession, r2);
        this.A00 = r1;
        this.A02 = userSession;
        this.A01 = r2;
    }
}
