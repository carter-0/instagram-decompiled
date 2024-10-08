package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.Vwh  reason: case insensitive filesystem */
public abstract class C18683Vwh {
    public static void A00(AnonymousClass0iw r5, 0xF r6, UserSession userSession, Hashtag hashtag, Integer num, String str) {
        String str2;
        String str3;
        if (num == AnonymousClass05K.A00) {
            str2 = "create";
        } else {
            str2 = "destroy";
        }
        0xI A01 = 0xI.A01(C273654mx.A00(2386), r5.getModuleName());
        String A00 = AnonymousClass000.A00(90);
        A01.A0C(A00, str2);
        A01.A0C("entity_id", hashtag.getId());
        A01.A0C("entity_type", "hashtag");
        String A002 = C273654mx.A00(275);
        if (num.intValue() != 0) {
            str3 = AnonymousClass000.A00(3633);
        } else {
            str3 = "following";
        }
        A01.A0C(A002, str3);
        A01.A0C("click_point", str);
        A01.A0C("follow_status", str3);
        A01.A0C("hashtag_follow_status", str3);
        A01.A07(C298085sr.A02, hashtag.getId());
        A01.A07(C298085sr.A03, hashtag.getName());
        A01.A0C(A00, str2);
        if (r6 != null) {
            A01.A04(r6);
        }
        C18766W0k.A01(A01, userSession);
        DbU.A1R(A01, userSession);
    }

    public static void A02(AnonymousClass0iw r2, UserSession userSession, Hashtag hashtag, String str, Throwable th) {
        String message;
        0xI A01 = 0xI.A01("follow_button_tap_failure", r2.getModuleName());
        A01.A0C(AnonymousClass000.A00(90), str);
        if (th == null) {
            message = null;
        } else {
            message = th.getMessage();
        }
        if (message != null) {
            A01.A0C(TraceFieldType.Error, message);
        }
        W0l.A03(A01, hashtag);
        C18766W0k.A01(A01, userSession);
        DbU.A1R(A01, userSession);
    }

    public static void A01(AnonymousClass0iw r3, UserSession userSession, 1Xj r5, Hashtag hashtag, int i) {
        0xF r0;
        0xI A01 = 0xI.A01("report_irrelevant_hashtag_media", r3.getModuleName());
        A01.A0C("m_pk", r5.getId());
        A01.A08(Integer.valueOf(r5.BR7().A00), "m_t");
        if (r3 instanceof C232682uF) {
            r0 = ((C232682uF) r3).E4l(r5).A00();
        } else {
            r0 = new 0xF();
        }
        A01.A04(r0);
        A01.A08(Integer.valueOf(i), "m_ix");
        W0l.A03(A01, hashtag);
        C18766W0k.A01(A01, userSession);
        DbU.A1R(A01, userSession);
    }
}
