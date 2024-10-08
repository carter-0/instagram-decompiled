package X;

import android.content.Context;
import android.util.Pair;
import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo;
import java.util.List;
import java.util.Map;

public final class LRh {
    public String A00;
    public final Context A01;
    public final C360948fP A02;
    public final C279294yP A03;
    public final C59725JVj A04;
    public final AnonymousClass0iw A05;
    public final 0wc A06;
    public final UserSession A07;
    public final String A08 = DbS.A0k();

    public static final Long A00(String str) {
        if (str == null) {
            return null;
        }
        try {
            return AnonymousClass7TE.A10(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final String A01(28D r6, LRh lRh, Long l, String str, Map map) {
        if (str == null) {
            str = AnonymousClass7TG.A0j();
        }
        C59728JVm A002 = AnonymousClass9PJ.A00(lRh.A07);
        C279294yP r3 = lRh.A03;
        A002.A06(r3, r6);
        0wc r2 = lRh.A06;
        String A003 = AnonymousClass000.A00(3289);
        0kJ r4 = r2.A00;
        0Aj A004 = r2.A00(r4, A003);
        if (A004.isSampled()) {
            A004.A9F("ar_core_version", C51971G9r.A0m());
            A004.A9F("media_id", l);
            JTO.A1S(A004, str);
            A004.A8M(r3, "camera_destination");
            DbS.A1F(r6, A004);
            AnonymousClass7TG.A1D(A004, "nav_chain", lRh.A08);
        }
        0Aj A005 = r2.A00(r4, "ig_camera_start_capture_format_session");
        if (A005.isSampled()) {
            AnonymousClass7TE.A1W(A005, "camera_position", 3);
            JTO.A1S(A005, str);
            A005.A8M(r3, "camera_destination");
            JTS.A16(A005);
            A005.A8M(C360948fP.NORMAL, "capture_type");
            JTS.A14(r6, A005);
            JTO.A1P(28t.A04, A005);
            DbW.A15(A005, lRh.A05);
            C51965G9l.A1A(lRh.A04, A005);
            AnonymousClass7TG.A1D(A005, "nav_chain", lRh.A08);
        }
        0Aj A006 = r2.A00(r4, AnonymousClass000.A00(3286));
        if (A006.isSampled()) {
            AnonymousClass7TE.A1W(A006, "event_type", 2);
            DbW.A15(A006, lRh.A05);
            A006.A8M(r3, "camera_destination");
            JTO.A1S(A006, str);
            AnonymousClass7TE.A1W(A006, "exit_point", 15);
            DbS.A1F(r6, A006);
            AnonymousClass7TE.A1W(A006, "camera_position", 3);
            JTS.A16(A006);
            A006.AAJ("discovery_session_id", "");
            A006.AAJ("search_session_id", "");
            A006.A8M(lRh.A02, "capture_type");
            C51965G9l.A1K(A006, lRh.A08);
            A006.Cgf();
        }
        0Aj A007 = r2.A00(r4, "ig_camera_end_capture_format_session");
        if (A007.isSampled()) {
            A007.A8M(r3, "camera_destination");
            AnonymousClass7TE.A1W(A007, "camera_position", 3);
            JTO.A1S(A007, str);
            0sn r1 = 0sn.A00;
            A007.AAe("camera_tools", r1);
            A007.AAe("camera_tools_struct", r1);
            A007.A8M(lRh.A02, "capture_type");
            JTS.A14(r6, A007);
            DbW.A15(A007, lRh.A05);
            C51965G9l.A1A(lRh.A04, A007);
            AnonymousClass7TG.A1D(A007, "nav_chain", lRh.A08);
        }
        1Ln A0U = C51965G9l.A0U(r2.A00(r4, AnonymousClass000.A00(3288)), 200);
        if (DbT.A1Y(A0U)) {
            A0U.A0a(r3);
            A0U.A0V(3);
            JTU.A13(A0U, str);
            A0U.A0M(lRh.A02, "capture_type");
            JTU.A0u(r6, A0U);
            A0U.A0c(28t.A04);
            A0U.A0n(lRh.A05.getModuleName());
            A0U.A0S(AnonymousClass000.A00(3968), AnonymousClass7TE.A1I(C62668KkU.FEED));
            A0U.A0M(lRh.A04, "surface");
            A0U.A0N(new 0bb(), "input_metadata");
            A0U.A0R("product", AnonymousClass000.A00(1438));
            A0U.A0u(lRh.A08);
            A0U.A00.A9H("open_carousel_review_page_selected_filter", map);
            A0U.Cgf();
        }
        1Ln A09 = 1Ln.A09(r2);
        if (DbT.A1Y(A09)) {
            A09.A0a(r3);
            A09.A0V(3);
            JTU.A13(A09, str);
            A09.A0M(lRh.A02, "capture_type");
            JTU.A0u(r6, A09);
            A09.A0c(28t.A04);
            AnonymousClass0iw r32 = lRh.A05;
            A09.A0n(r32.getModuleName());
            A09.A0M(C62668KkU.FEED, "share_destination");
            A09.A0M(lRh.A04, "surface");
            A09.A0N(new 0bb(), "input_metadata");
            A09.A0R("product", r32.getModuleName());
            A09.A0u(lRh.A08);
            A09.A00.A9H("open_carousel_review_page_selected_filter", map);
            A09.Cgf();
        }
        return str;
    }

    public final void A02() {
        UserSession userSession = this.A07;
        27p.A01(userSession).A0Y();
        A03();
        27p.A01(userSession).A0W();
        27p.A02(userSession);
    }

    public final void A03() {
        JTO.A0c(this.A07).A0c(C363138jC.A00);
    }

    public final void A04(C54689HOu hOu, String str) {
        UserSession userSession = this.A07;
        AnonymousClass0iw r2 = this.A05;
        0Aj A0S = C51975G9x.A0S(r2, userSession);
        if (A0S.isSampled()) {
            A0S.A8M(hOu, "action_source");
            DbW.A16(A0S, r2);
            C51965G9l.A1K(A0S, this.A08);
            JTQ.A13(A0S, A00(str));
        }
    }

    public final void A06(boolean z) {
        UserSession userSession = this.A07;
        AnonymousClass0iw r3 = this.A05;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "ig_camera_notification_impression");
        if (A0e.isSampled()) {
            int i = 43;
            if (z) {
                i = 44;
            }
            JTP.A1H(A0e);
            JTO.A1S(A0e, AnonymousClass7TF.A0b());
            AnonymousClass7TE.A1W(A0e, "entity_type", i);
            DbW.A15(A0e, r3);
            C51965G9l.A1K(A0e, this.A08);
            A0e.Cgf();
        }
    }

    public final void A07(boolean z, String str) {
        UserSession userSession = this.A07;
        27r A012 = 27p.A01(userSession);
        if (z) {
            A012.A0z(C279294yP.FEED, 28t.A04, (String) null);
        } else {
            A012.A0Y();
        }
        String str2 = str;
        if (str != null) {
            A012.A04.A0R = str2;
        }
        A03();
        29f r3 = A012.A0A;
        C59793JYm jYm = C59793JYm.OTHER;
        28t r6 = 28t.A04;
        0sn r24 = 0sn.A00;
        C363138jC r10 = C363138jC.A00;
        0sm A0E = 0Yt.A0E();
        C59725JVj jVj = this.A04;
        AnonymousClass0iw r0 = this.A05;
        String moduleName = r0.getModuleName();
        C62668KkU kkU = C62668KkU.FEED;
        29f r36 = r3;
        C59793JYm jYm2 = jYm;
        28t r39 = r6;
        C59725JVj jVj2 = jVj;
        r36.A0V((Pair) null, jYm2, r39, jVj2, new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false), r10, (Boolean) null, moduleName, (String) null, (String) null, r24, r24, r24, r24, AnonymousClass7TE.A1I(kkU), A0E, 1, 0, false);
        r3.A0U((Pair) null, jYm, r6, (C358178aU) null, kkU, jVj, r10, (MediaTransformation) null, (GallerySuggestionsInfo) null, false, (Integer) null, (String) null, (String) null, (String) null, r0.getModuleName(), (String) null, (String) null, (String) null, (String) null, (String) null, r24, r24, r24, r24, (List) null, (List) null, (List) null, (List) null, 0Yt.A0E(), -1, 1, 0, 0, 0, false, false, false, false);
        27p.A01(userSession).A0W();
        27p.A02(userSession);
    }

    public LRh(UserSession userSession, Context context) {
        AnonymousClass7TG.A1O(userSession, context);
        this.A07 = userSession;
        this.A01 = context;
        0xG A0O = DbS.A0O(AnonymousClass000.A00(1438));
        this.A05 = A0O;
        this.A06 = AnonymousClass0kN.A01(A0O, userSession);
        this.A04 = C59725JVj.OPEN_CAROUSEL;
        this.A03 = C279294yP.FEED;
        this.A02 = C360948fP.NORMAL;
    }

    public final void A05(C54689HOu hOu, String str) {
        Long A002 = A00(str);
        UserSession userSession = this.A07;
        AnonymousClass0iw r2 = this.A05;
        0Aj A0S = C51975G9x.A0S(r2, userSession);
        if (A0S.isSampled()) {
            A0S.A8M(hOu, "action_source");
            DbW.A16(A0S, r2);
            C51965G9l.A1K(A0S, this.A08);
            C51965G9l.A1O(A0S, this.A00);
            JTQ.A13(A0S, A002);
        }
    }
}
