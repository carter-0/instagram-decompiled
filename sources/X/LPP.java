package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicBrowseCategory;

public abstract class LPP {
    public static final void A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        29R A0b = JTO.A0b(userSession);
        1Ln A0N = JTO.A0N(A0b);
        C279294yP A0J = A0b.A0J();
        AnonymousClass283 r3 = A0b.A04;
        String str = r3.A0L;
        if (DbT.A1Y(A0N) && A0J != null && str != null) {
            JTO.A1V(A0N);
            A0N.A0r("SUGGESTED_AUDIO_PILL_DISMISSED");
            29R.A00(A0N, A0b);
            A0N.A0a(A0J);
            A0N.A0b(r3.A09);
            A0N.A0U();
            A0N.A0M(C371088xY.SUGGESTED_AUDIO_PILL, "surface_element");
            JTO.A1U(A0N, str);
            JTQ.A1A(A0N);
            A0N.A0c(r3.A0A);
            AnonymousClass7TF.A18(A0N);
            A0N.A0R("composition_str_id", r3.A0M);
            A0N.A0M(r3.A0A, "composition_media_type");
            A0N.Cgf();
        }
    }

    public static final void A01(UserSession userSession, C66569MWx mWx, String str) {
        0qQ.A0B(userSession, 0);
        27r A01 = 27p.A01(userSession);
        C697329a r3 = A01.A0G;
        0Aj A0e = AnonymousClass7TE.A0e(r3.A01, "ig_camera_ui_tool_impression");
        if (A0e.isSampled()) {
            JTO.A1O(AnonymousClass80P.SUGGESTED_AUDIO_PILL, A0e);
            JTO.A1S(A0e, JTP.A0p(r3.A04));
            JTP.A1H(A0e);
            JTP.A1F(A0e);
            A0e.A8M(C371088xY.SUGGESTED_AUDIO_PILL, "surface_element");
            JTR.A1J(A0e, MusicProduct.MUSIC_IN_FEED);
            A0e.A8M(C3515589i.NO_MUSIC_BROWSER, "music_browser_entry_point");
            DbS.A1J(A0e, "CREATE");
            A0e.Cgf();
        }
        0Aj A0e2 = AnonymousClass7TE.A0e(A01.A01, AnonymousClass000.A00(158));
        if (A0e2.isSampled()) {
            Long A0m = C51971G9r.A0m();
            try {
                A0m = Long.valueOf(Long.parseLong(mWx.BfO()));
            } catch (NumberFormatException e) {
                0kD.A0H("IgCameraLoggerImpl", e);
            }
            A0e2.A9F("audio_asset_id", A0m);
            JTP.A1H(A0e2);
            C66569MWx.A03(A0e2, mWx);
            C66569MWx.A01(A0e2, mWx);
            C66569MWx.A00(A0e2, mWx);
            JTQ.A12(A0e2, A01);
            AnonymousClass283 r0 = A01.A04;
            AnonymousClass7TE.A1V(A0e2, r0);
            JTP.A1I(A0e2, r0);
            C66569MWx.A02(A0e2, mWx);
            C66569MWx.A04(A0e2, mWx, "browse_session_id", str);
            A0e2.A8M(C3515589i.NO_MUSIC_BROWSER, "music_browser_entry_point");
            C51973G9u.A14(A0e2, "product", C14245TsS.A00(MusicProduct.MUSIC_IN_FEED));
            JTP.A1F(A0e2);
            A0e2.A8M(C371088xY.SUGGESTED_AUDIO_PILL, "surface_element");
            A0e2.Cgf();
        }
    }

    public static final void A02(UserSession userSession, C66569MWx mWx, String str, String str2, boolean z) {
        UserSession userSession2 = userSession;
        String str3 = str;
        String str4 = str2;
        DbZ.A0t(0, userSession, str3, str4);
        C64161LRc lRc = new C64161LRc();
        MusicBrowseCategory A01 = C64181LSn.A01("feed_browse");
        MusicProduct musicProduct = MusicProduct.MUSIC_IN_FEED;
        C59725JVj jVj = C59725JVj.POST_CAPTURE;
        C371088xY r5 = C371088xY.SUGGESTED_AUDIO_PILL;
        C3515589i r4 = C3515589i.NO_MUSIC_BROWSER;
        lRc.A03(r4, r5, jVj, musicProduct, userSession2, mWx, A01, 0, "2282005535164995", "unknown", "preview", (String) null, str3, str4, (String) null);
        27r A012 = 27p.A01(userSession2);
        if (z) {
            29Y r3 = A012.A0E;
            1Ln A0A = 1Ln.A0A(r3.A01);
            if (DbT.A1Y(A0A)) {
                A0A.A0M(AnonymousClass80P.SUGGESTED_AUDIO_PILL_ADD, "tool_type");
                29Y.A00(A0A, r3);
                JTQ.A1B(A0A, r3.A04);
                A0A.A0d(jVj);
                A0A.A0M(r5, "surface_element");
                A0A.A0M(r4, "music_browser_entry_point");
                JTQ.A1A(A0A);
                A0A.A0a(C279294yP.FEED);
                JTS.A1E(A0A);
                return;
            }
            return;
        }
        29Z r1 = A012.A0F;
        0Aj A0d = JTR.A0d(r1);
        if (A0d.isSampled()) {
            JTO.A1O(AnonymousClass80P.SUGGESTED_AUDIO_PILL, A0d);
            AnonymousClass283 r12 = r1.A04;
            JTO.A1S(A0d, JTP.A0p(r12));
            AnonymousClass7TE.A1V(A0d, r12);
            DbS.A1J(A0d, "CREATE");
            AnonymousClass7TE.A1W(A0d, "event_type", 2);
            C51965G9l.A1A(jVj, A0d);
            A0d.A8M(r5, "surface_element");
            A0d.A8M(r4, "music_browser_entry_point");
            AnonymousClass7TH.A0U(A0d);
            JTP.A1H(A0d);
            AnonymousClass7TH.A0V(A0d);
        }
    }
}
