package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Gal  reason: case insensitive filesystem */
public final class C52673Gal {
    public final XSH A00;
    public final 0wc A01;
    public final String A02 = C51972G9s.A0n();

    public C52673Gal(XSH xsh, AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = xsh;
        this.A01 = AnonymousClass0kN.A01(r3, userSession);
    }

    public final void A03(UserSession userSession, 1Xj r7, Long l, String str, String str2) {
        long j;
        Long A10;
        0qQ.A0B(userSession, 4);
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "faqs_sticker_icebreaker_click");
        if (A0e.isSampled()) {
            if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            C51970G9q.A17(A0e, j);
            A01(A0e, userSession, r7, C51967G9n.A08(l, 0));
            A02(A0e, this, C21058XCk.A00(), this.A02, str2);
        }
    }

    public final void A06(Long l, String str, String str2, String str3, long j) {
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "on_feed_messages_send_button_click");
        if (A0e.isSampled()) {
            C51970G9q.A17(A0e, Long.parseLong(str));
            A0e.A9F("page_id", Long.valueOf(j));
            A0e.A9F("position", l);
            A0e.AAJ(AnonymousClass000.A00(1424), str2);
            A02(A0e, this, C21058XCk.A00(), this.A02, str3);
        }
    }

    public final void A08(String str, String str2, String str3, long j, long j2) {
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "icebreaker_click");
        if (A0e.isSampled()) {
            C51970G9q.A17(A0e, Long.parseLong(str));
            A0e.A9F("page_id", Long.valueOf(j));
            A0e.A9F("position", Long.valueOf(j2));
            A0e.AAJ(C21058XCk.A00(), this.A02);
            A02(A0e, this, AnonymousClass000.A00(1424), str2, str3);
        }
    }

    public final void A04(UserSession userSession, 1Xj r7, Long l, String str, String str2) {
        long j;
        Long A10;
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "faqs_sticker_send_button_click");
        if (A0e.isSampled()) {
            if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            C51970G9q.A17(A0e, j);
            A01(A0e, userSession, r7, C51967G9n.A08(l, 0));
            A02(A0e, this, C21058XCk.A00(), this.A02, str2);
        }
    }

    public final void A05(Long l, String str, String str2) {
        long j;
        Long A10;
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "faqs_sticker_impression");
        if (A0e.isSampled()) {
            if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            C51970G9q.A17(A0e, j);
            A0e.A9F("page_id", Long.valueOf(C51967G9n.A08(l, 0)));
            A02(A0e, this, C21058XCk.A00(), this.A02, str2);
        }
    }

    public final void A07(String str, long j, String str2) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "custom_message_click");
        if (A0e.isSampled()) {
            C51970G9q.A17(A0e, Long.parseLong(str));
            A0e.A9F("page_id", Long.valueOf(j));
            A02(A0e, this, C21058XCk.A00(), this.A02, str2);
        }
    }

    public static final String A00(UserSession userSession, 1Xj r1) {
        String A06 = C231122qu.A06(userSession, r1);
        if (A06 != null) {
            return A06;
        }
        if (r1 != null) {
            return r1.A0C.getOrganicTrackingToken();
        }
        return null;
    }

    public static void A01(0Aj r2, UserSession userSession, 1Xj r4, long j) {
        r2.A9F("page_id", Long.valueOf(j));
        r2.AAJ(C273654mx.A00(70), A00(userSession, r4));
    }

    public static void A02(0Aj r2, C52673Gal gal, String str, String str2, String str3) {
        r2.AAJ(str, str2);
        r2.A8M(gal.A00, C273654mx.A00(357));
        r2.AAJ(C273654mx.A00(341), str3);
        r2.Cgf();
    }
}
