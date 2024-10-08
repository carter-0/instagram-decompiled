package X;

import android.content.Context;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.search.MusicOverlayResultsListController;

public final class MJG extends 0Yg implements C62320sa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C66569MWx A01;
    public final /* synthetic */ MusicOverlayResultsListController A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJG(C66569MWx mWx, MusicOverlayResultsListController musicOverlayResultsListController, String str, int i, boolean z, boolean z2) {
        super(0);
        this.A05 = z;
        this.A03 = str;
        this.A00 = i;
        this.A02 = musicOverlayResultsListController;
        this.A01 = mWx;
        this.A04 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        if (this.A05) {
            String str2 = this.A03;
            if (str2.length() == 0) {
                str2 = "unknown";
            }
            int i = this.A00;
            MusicOverlayResultsListController musicOverlayResultsListController = this.A02;
            String str3 = musicOverlayResultsListController.A0I;
            0qQ.A0B(str3, 5);
            UserSession userSession = musicOverlayResultsListController.A0B;
            C66569MWx mWx = this.A01;
            String A002 = musicOverlayResultsListController.A04.A00();
            String str4 = musicOverlayResultsListController.A04.A06;
            String str5 = musicOverlayResultsListController.A0J;
            C59725JVj jVj = musicOverlayResultsListController.A08;
            MusicProduct musicProduct = musicOverlayResultsListController.A09;
            boolean z = this.A04;
            String str6 = musicOverlayResultsListController.A0G.A04;
            0qQ.A0B(userSession, 0);
            0qQ.A0B(str5, 5);
            C51972G9s.A1E(jVj, musicProduct);
            AnonymousClass29e r5 = 27p.A01(userSession).A0I;
            if (str4 == null) {
                str4 = "";
            }
            if (str6 == null || str6.length() == 0) {
                str = "not_search";
            } else {
                str = 27p.A01(userSession).A03.A07;
            }
            0qQ.A0B(str, 8);
            0Aj A0e = AnonymousClass7TE.A0e(r5.A01, "ig_camera_ui_tool_save");
            if (A0e.isSampled()) {
                JTO.A1O(AnonymousClass80P.MUSIC_SELECTOR, A0e);
                JTO.A1T(A0e, "IG_CAMERA_MUSIC_BROWSE_SONG_SAVE");
                AnonymousClass283 r7 = r5.A04;
                JTO.A1S(A0e, JTP.A0p(r7));
                AnonymousClass7TE.A1V(A0e, r7);
                C51973G9u.A14(A0e, "module", 27x.A08.getModuleName());
                C66569MWx.A03(A0e, mWx);
                A0e.A9F("audio_asset_id", C51971G9r.A0n(0, mWx.getId()));
                A0e.A9F("audio_index", JTT.A0l(A0e, 2AL.A08(mWx.getAudioClusterId()), "audio_cluster_id", i));
                C66569MWx.A00(A0e, mWx);
                JTQ.A12(A0e, r5);
                A0e.AAJ("category", A002);
                A0e.AAJ("subcategory", str4);
                AnonymousClass7TE.A1W(A0e, "event_type", 2);
                A0e.AAJ("browse_session_id", str5);
                A0e.AAJ("section_name", str2);
                Long A0m = C51971G9r.A0m();
                A0e.A9F("section_index", A0m);
                A0e.AAJ(AnonymousClass000.A00(3910), "swipe");
                A0e.AAJ("audio_browser_surface", str3);
                A0e.AAJ("audio_type", mWx.CAc().A00);
                AnonymousClass7TE.A1W(A0e, "camera_position", JTR.A0D(r7));
                A0e.A9F("capture_format_index", A0m);
                C51965G9l.A1A(jVj, A0e);
                JTP.A1J(A0e, r7);
                A0e.A7p("is_bookmarked", Boolean.valueOf(z));
                JTS.A1A(A0e, r5);
                A0e.AAJ("search_session_id", str);
                A0e.Cgf();
            }
        }
        MusicOverlayResultsListController musicOverlayResultsListController2 = this.A02;
        UserSession userSession2 = musicOverlayResultsListController2.A0B;
        if (182.A06(AnonymousClass7TF.A0H(userSession2), userSession2, 36325806892397812L)) {
            C60329JjY jjY = musicOverlayResultsListController2.A0H;
            Context requireContext = musicOverlayResultsListController2.A0A.requireContext();
            boolean z2 = !this.A04;
            ImageUrl As5 = this.A01.As5();
            MIX mix = new MIX(musicOverlayResultsListController2, 12);
            Dc2 dc2 = jjY.A00;
            if (dc2 != null) {
                DbX.A1R(dc2);
            }
            Dc2 A012 = AnonymousClass3ZJ.A01(requireContext, userSession2, As5, new C58679Ivo(new C55514Hiw(mix), 30), z2);
            jjY.A00 = A012;
            DbX.A1S(A012);
        }
        return C60340gF.A00;
    }
}
