package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.common.model.MusicSearchPlaylistType;
import java.util.List;
import java.util.Set;

/* renamed from: X.LRc  reason: case insensitive filesystem */
public final class C64161LRc {
    public C66569MWx A00;
    public C63863L9s A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final Set A03 = AnonymousClass7TE.A1F();
    public final Set A04 = AnonymousClass7TE.A1F();

    public static final void A00(C59725JVj jVj, MusicProduct musicProduct, UserSession userSession, C66569MWx mWx, String str, String str2, String str3, String str4, int i) {
        AnonymousClass7TF.A1C(userSession, 0, str2);
        C51974G9v.A1N(str3, str4, musicProduct);
        0qQ.A0B(jVj, 8);
        27r A012 = 27p.A01(userSession);
        0Aj A0e = AnonymousClass7TE.A0e(A012.A01, AnonymousClass000.A00(158));
        if (A0e.isSampled()) {
            A0e.A9F("audio_asset_id", DbV.A0q(mWx.getId()));
            AnonymousClass7TH.A0W(A0e, A012);
            C66569MWx.A03(A0e, mWx);
            A0e.AAJ("audio_type", mWx.CAc().A00);
            C66569MWx.A00(A0e, mWx);
            JTQ.A12(A0e, A012);
            A0e.AAJ("category", "artist_spotlight");
            A0e.AAJ("subcategory", (String) null);
            AnonymousClass283 r2 = A012.A04;
            AnonymousClass7TE.A1V(A0e, r2);
            JTP.A1I(A0e, r2);
            AnonymousClass7TE.A1W(A0e, "event_type", 2);
            C66569MWx.A02(A0e, mWx);
            DbS.A1K(A0e, str3);
            C51965G9l.A1A(jVj, A0e);
            C66569MWx.A04(A0e, mWx, "browse_session_id", str4);
            JTR.A1J(A0e, musicProduct);
            Long A0m = C51971G9r.A0m();
            A0e.A9F("capture_format_index", A0m);
            A0e.A9F("section_id", 27x.A0F(str));
            A0e.A9F("section_index", A0m);
            A0e.A9F("audio_index", DbV.A0p(A0e, "section_name", str2, i));
            A0e.AAJ("audio_browser_surface", "preview");
            JTS.A19(A0e, r2);
            AnonymousClass7TH.A0V(A0e);
        }
    }

    public static final void A01(C59725JVj jVj, UserSession userSession, String str, String str2, String str3) {
        0qQ.A0B(userSession, 0);
        C51974G9v.A1M(str2, str3, jVj);
        29R A0b = JTO.A0b(userSession);
        1Ln A0N = JTO.A0N(A0b);
        if (DbT.A1Y(A0N)) {
            A0N.A0r("MUSIC_BROWSE_SEE_MORE");
            29R.A00(A0N, A0b);
            JTQ.A18(A0N, A0b);
            A0N.A0R("category", str);
            AnonymousClass283 r2 = A0b.A04;
            A0N.A0b(r2.A09);
            A0N.A0W(2);
            A0N.A0R("browse_session_id", str3);
            JTQ.A1A(A0N);
            A0N.A0R("section_name", str2);
            A0N.A0V(JTR.A0D(r2));
            A0N.A0Q("capture_format_index", C51971G9r.A0m());
            A0N.A0d(jVj);
            A0N.A0c(r2.A0A);
            JTS.A1E(A0N);
        }
    }

    public final void A04(C3515589i r12, C59725JVj jVj, MusicProduct musicProduct, UserSession userSession, C66569MWx mWx, MusicBrowseCategory musicBrowseCategory, C63863L9s l9s, String str, String str2, String str3) {
        String str4;
        MusicBrowseCategory musicBrowseCategory2 = musicBrowseCategory;
        AnonymousClass7TF.A1C(userSession, 0, musicBrowseCategory2);
        String str5 = str;
        String str6 = str2;
        C51974G9v.A1N(str5, musicProduct, str6);
        0qQ.A0B(jVj, 8);
        C66569MWx mWx2 = mWx;
        if (this.A04.add(mWx2.getId())) {
            27r A012 = 27p.A01(userSession);
            if (!"server_loaded".equals(musicBrowseCategory2.A00()) || (str4 = musicBrowseCategory2.A03) == null) {
                str4 = musicBrowseCategory2.A00();
            }
            0Aj A0e = AnonymousClass7TE.A0e(A012.A01, AnonymousClass000.A00(158));
            if (A0e.isSampled()) {
                Long A0m = C51971G9r.A0m();
                Long l = A0m;
                try {
                    A0m = Long.valueOf(Long.parseLong(mWx2.getId()));
                } catch (NumberFormatException unused) {
                }
                A0e.A9F("audio_asset_id", A0m);
                AnonymousClass7TH.A0W(A0e, A012);
                C66569MWx.A03(A0e, mWx2);
                C66569MWx.A01(A0e, mWx2);
                C66569MWx.A00(A0e, mWx2);
                JTQ.A12(A0e, A012);
                A0e.AAJ("category", str4);
                AnonymousClass283 r4 = A012.A04;
                AnonymousClass7TE.A1V(A0e, r4);
                JTP.A1I(A0e, r4);
                AnonymousClass7TE.A1W(A0e, "event_type", 2);
                C66569MWx.A02(A0e, mWx2);
                DbS.A1K(A0e, str6);
                C51965G9l.A1A(jVj, A0e);
                C66569MWx.A04(A0e, mWx2, "browse_session_id", str5);
                JTR.A1J(A0e, musicProduct);
                A0e.A9F("capture_format_index", l);
                C63863L9s l9s2 = l9s;
                A0e.AAJ("section_name", l9s2.A05);
                A0e.A9F("section_index", DbS.A0j(l9s2.A01));
                A0e.A9F("audio_index", DbS.A0j(l9s2.A00));
                A0e.AAJ("audio_browser_surface", l9s2.A03);
                A0e.A9F("section_id", 27x.A0F(l9s2.A04));
                JTS.A19(A0e, r4);
                A0e.AAJ("search_text", (String) null);
                DbY.A1C(A0e);
                A0e.A8M(r12, "music_browser_entry_point");
                JTQ.A13(A0e, 27x.A0F(str3));
            }
        }
    }

    public final void A03(C3515589i r21, C371088xY r22, C59725JVj jVj, MusicProduct musicProduct, UserSession userSession, C66569MWx mWx, MusicBrowseCategory musicBrowseCategory, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Long l;
        String A002;
        String str8 = str2;
        String str9 = str;
        UserSession userSession2 = userSession;
        String str10 = str3;
        DbW.A1N(userSession2, 0, str10);
        C59725JVj jVj2 = jVj;
        MusicProduct musicProduct2 = musicProduct;
        MusicBrowseCategory musicBrowseCategory2 = musicBrowseCategory;
        String str11 = str5;
        C51974G9v.A1Q(musicBrowseCategory2, str11, musicProduct2, jVj2);
        String str12 = str6;
        0qQ.A0B(str12, 12);
        String str13 = "";
        String str14 = str13;
        if (str == null) {
            str9 = str13;
        }
        if (str9.length() == 0) {
            str9 = musicBrowseCategory2.A04;
        }
        if (str8.length() == 0) {
            String str15 = musicBrowseCategory2.A06;
            if (str15 != null) {
                str13 = str15;
            }
            if (str13.length() == 0) {
                str13 = "unknown";
            }
            str8 = str13;
        }
        int A012 = DbX.A01(num);
        if (musicProduct2 == MusicProduct.CLIPS_CAMERA_FORMAT_V2) {
            l = Long.valueOf(AnonymousClass7TG.A0I());
        } else {
            l = null;
        }
        C63863L9s l9s = new C63863L9s(l, str9, str8, str10, 0, A012);
        C66569MWx mWx2 = mWx;
        this.A02.add(AnonymousClass7TE.A1L(mWx2, l9s));
        if (musicBrowseCategory2.A01 == MusicSearchPlaylistType.SPOTIFY) {
            A002 = "spotify_playlist";
        } else if (!"server_loaded".equals(musicBrowseCategory2.A00()) || (A002 = musicBrowseCategory2.A03) == null) {
            A002 = musicBrowseCategory2.A00();
        }
        27r A013 = 27p.A01(userSession2);
        String str16 = musicBrowseCategory2.A04;
        0Aj A0e = AnonymousClass7TE.A0e(A013.A01, "ig_camera_music_browse_song_select");
        if (A0e.isSampled()) {
            AnonymousClass283 r11 = A013.A04;
            if (r11.A0C != null) {
                C66569MWx.A03(A0e, mWx2);
                A0e.AAJ("browse_session_id", str11);
                AnonymousClass7TH.A0W(A0e, A013);
                JTP.A1I(A0e, r11);
                JTQ.A12(A0e, A013);
                A0e.AAJ("category", A002);
                AnonymousClass7TE.A1W(A0e, "event_type", 2);
                DbS.A1K(A0e, str12);
                C66569MWx.A04(A0e, mWx2, "song_name", mWx2.getTitle());
                A0e.A9F("audio_index", DbS.A0j(l9s.A00));
                A0e.A9F("audio_asset_id", DbV.A0q(mWx2.getId()));
                A0e.AAJ("audio_browser_surface", l9s.A03);
                C66569MWx.A01(A0e, mWx2);
                AnonymousClass7TE.A1W(A0e, "camera_position", JTR.A0D(r11));
                JTS.A16(A0e);
                AnonymousClass7TE.A1V(A0e, r11);
                A0e.AAJ("search_text", str4);
                C66569MWx.A02(A0e, mWx2);
                JTO.A1P(28t.A02, A0e);
                JTR.A1J(A0e, musicProduct2);
                A0e.AAJ("section_name", l9s.A05);
                A0e.A9F("section_id", 27x.A0F(l9s.A04));
                A0e.AAJ("subcategory", str16);
                C51965G9l.A1A(jVj2, A0e);
                A0e.A8M(r22, "surface_element");
                DbY.A1C(A0e);
                JTS.A1A(A0e, A013);
                A0e.A8M(r21, "music_browser_entry_point");
                JTQ.A13(A0e, 27x.A0F(str7));
                return;
            }
            if (r11.A0L == null) {
                str14 = "mCameraSession";
            }
            0kD.A01("IgCameraLoggerImpl", String.format("logMusicSelectTrack() %s %s null", new Object[]{str14, "mSurface"}));
        }
    }

    public final void A05(UserSession userSession, C66569MWx mWx, String str, String str2, int i) {
        AnonymousClass7TF.A1D(userSession, 0, str2);
        this.A00 = mWx;
        int i2 = i;
        this.A01 = new C63863L9s((Long) null, str, str2, "preview", 0, i2);
        0Aj A0e = AnonymousClass7TE.A0e(27p.A01(userSession).A01, AnonymousClass000.A00(162));
        if (A0e.isSampled()) {
            A0e.AAJ("containermodule", KVJ.__redex_internal_original_name);
            A0e.AAJ("media_compound_key", mWx.getId());
            A0e.A8M(C54689HOu.A05, "action_source");
            A0e.A9F("target_id", DbV.A0q(mWx.getId()));
            G9t.A1G(A0e);
            A0e.A9F("container_id", (Long) null);
            C51970G9q.A19(A0e, (long) i2);
            C51965G9l.A1O(A0e, (String) null);
            A0e.AAJ(AnonymousClass000.A00(392), (String) null);
            A0e.AAJ("mezql_token", (String) null);
            A0e.AAJ("ranking_info_token", (String) null);
            A0e.A9F(AnonymousClass000.A00(3466), (Long) null);
            A0e.AAJ(AnonymousClass000.A00(4505), (String) null);
            A0e.A9F(C66579MXk.A00(379), 27x.A0F(str));
            A0e.AAJ("playlist_name", str2);
            DbY.A1C(A0e);
            DbX.A1L(A0e);
        }
    }

    public final void A02(C62642Kk4 kk4, C3515589i r7, C371088xY r8, C59725JVj jVj, MusicProduct musicProduct, UserSession userSession, String str, String str2, String str3) {
        C279284yO r3;
        C51974G9v.A1O(userSession, str, str2, musicProduct);
        27r A012 = 27p.A01(userSession);
        if (jVj == C59725JVj.NO_CAMERA_SESSION) {
            int ordinal = musicProduct.ordinal();
            if (ordinal == 15) {
                r3 = C3494280i.A00;
            } else if (ordinal != 13) {
                r3 = null;
            } else {
                r3 = C363138jC.A00;
            }
            AnonymousClass283 r2 = A012.A04;
            r2.A0C = jVj;
            UserSession userSession2 = A012.A03;
            r2.A0L = C360918fM.A00(userSession2).A00();
            if (r3 != null) {
                AnonymousClass81O.A00(userSession2).A00 = r3;
                r2.A08 = r3.A00;
            }
        }
        29Z r1 = A012.A0F;
        0Aj A0d = JTR.A0d(r1);
        if (A0d.isSampled()) {
            JTO.A1O(AnonymousClass80P.MUSIC_BROWSER, A0d);
            JTO.A1T(A0d, "IG_CAMERA_MUSIC_BROWSE_OPEN");
            AnonymousClass283 r32 = r1.A04;
            JTO.A1S(A0d, JTP.A0p(r32));
            JTS.A15(r32.A09, A0d, 1);
            C51965G9l.A1A(jVj, A0d);
            A0d.A8M(r8, "surface_element");
            A0d.AAJ("browse_session_id", str2);
            DbS.A1K(A0d, str);
            JTP.A1J(A0d, r32);
            JTQ.A12(A0d, r1);
            JTR.A1J(A0d, musicProduct);
            AnonymousClass7TH.A0W(A0d, r1);
            A0d.A8M(r32.A0A, "composition_media_type");
            A0d.A8M(r7, "music_browser_entry_point");
            A0d.A8M(kk4, "audio_editor_entry_point");
            DbY.A1C(A0d);
            A0d.A7p("is_panavision", Boolean.valueOf(r32.A0W));
            JTQ.A13(A0d, 27x.A0F(str3));
        }
    }
}
