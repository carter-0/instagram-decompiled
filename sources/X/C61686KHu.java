package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.music.common.model.MusicSearchPlaylist;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.List;

/* renamed from: X.KHu  reason: case insensitive filesystem */
public final class C61686KHu extends AnonymousClass3NK {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C61686KHu(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public static void A00(AnonymousClass3NG r1, Object obj, Object obj2, int i) {
        r1.A04 = new C61686KHu(i, obj, obj2);
        r1.A00();
    }

    public final void DP5(View view) {
        if (1 - this.A00 != 0) {
            super.DP5(view);
            return;
        }
        0qQ.A0B(view, 0);
        view.performHapticFeedback(0);
        if (182.A06(0Tu.A05, ((C61651KGb) this.A02).A01, 2342162725842591305L)) {
            C61162JyE jyE = (C61162JyE) this.A01;
            jyE.A01.Csq(view, jyE.A02, jyE.A03);
        }
    }

    /* JADX WARNING: type inference failed for: r0v38, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView] */
    public final boolean Dqe(View view) {
        Medium medium;
        C2606246k r0;
        C358248ab r5;
        List A1C;
        String A0d;
        String quantityString;
        int i;
        switch (this.A00) {
            case 0:
                C61176JyS jyS = (C61176JyS) this.A01;
                jyS.A03.invoke(jyS.A01, jyS.A00);
                return true;
            case 1:
                27r A012 = 27p.A01(((C61651KGb) this.A02).A01);
                C61162JyE jyE = (C61162JyE) this.A01;
                C317966o8 r52 = jyE.A02;
                String str = r52.A0S;
                Long A0j = DbS.A0j(jyE.A00);
                String str2 = jyE.A03;
                0Aj A0e = AnonymousClass7TE.A0e(A012.A01, AnonymousClass000.A00(3290));
                AnonymousClass283 r8 = A012.A04;
                String str3 = r8.A0U;
                String str4 = r8.A0L;
                if (!(!A0e.isSampled() || str4 == null || str3 == null)) {
                    JTO.A1S(A0e, str4);
                    A0e.A8M(C279294yP.STORY, "camera_destination");
                    JTS.A14(r8.A09, A0e);
                    AnonymousClass7TH.A0U(A0e);
                    A0e.AAJ("sticker_id", str);
                    AnonymousClass7TE.A1W(A0e, "sticker_source", 8);
                    A0e.AAJ("sticker_tray_session_id", str3);
                    JTS.A19(A0e, r8);
                    C51965G9l.A1A(r8.A0C, A0e);
                    A0e.A8M(C391619tN.A02, "sticker_type");
                    AnonymousClass7TE.A1W(A0e, "camera_position", JTR.A0C(r8));
                    DbY.A1C(A0e);
                    JTS.A1A(A0e, A012);
                    A0e.AAJ("browse_session_id", str2);
                    A0e.A9F("position", A0j);
                    A0e.Cgf();
                }
                29Z r7 = A012.A0F;
                0qQ.A0B(str, 0);
                0Aj A0d2 = JTR.A0d(r7);
                AnonymousClass283 r82 = r7.A04;
                String str5 = r82.A0U;
                if (A0d2.isSampled() && str5 != null) {
                    JTO.A1O(AnonymousClass80P.STICKER, A0d2);
                    JTO.A1T(A0d2, AnonymousClass000.A00(2302));
                    JTO.A1S(A0d2, JTP.A0p(r82));
                    A0d2.A8M(C279294yP.STORY, "camera_destination");
                    JTS.A14(r82.A09, A0d2);
                    AnonymousClass7TH.A0U(A0d2);
                    A0d2.AAJ("sticker_id", str);
                    AnonymousClass7TE.A1W(A0d2, "sticker_source", 8);
                    A0d2.AAJ("sticker_tray_session_id", str5);
                    JTS.A19(A0d2, r82);
                    C51965G9l.A1A(r82.A0C, A0d2);
                    A0d2.A8M(C391619tN.A02, "sticker_type");
                    AnonymousClass7TE.A1W(A0d2, "camera_position", JTR.A0C(r82));
                    DbY.A1C(A0d2);
                    JTS.A1A(A0d2, r7);
                    A0d2.AAJ("browse_session_id", str2);
                    A0d2.A9F("position", A0j);
                    A0d2.Cgf();
                }
                jyE.A01.Cut(r52, str2);
                return true;
            case 2:
                C60702Jpn jpn = (C60702Jpn) this.A02;
                if (!(jpn.A04.getDrawable() instanceof C59985Jcu) || (medium = jpn.A02) == null) {
                    return true;
                }
                ((C66440MRu) this.A01).DMQ(medium);
                return true;
            case 3:
                C380479Yi r02 = (C380479Yi) this.A02;
                ((MS2) this.A01).DId(r02.A00, r02.getBindingAdapterPosition());
                return true;
            case 4:
                ((C351978Be) this.A01).A04();
                C3018660j.A01((UserSession) this.A02).A0C(C69506Nmo.A09);
                return true;
            case 5:
                ((KG3) this.A02).A02.CxP(((C61175JyR) this.A01).A00);
                return true;
            case 6:
                C65505LuT luT = (C65505LuT) this.A02;
                if (!C65505LuT.A03(luT)) {
                    C65505LuT.A00(luT);
                    return true;
                }
                C234502xy r1 = luT.A0B;
                if (!r1.CKF() && (r0 = luT.A00) != null) {
                    MusicDataSource BUq = r0.BUq();
                    if (BUq != null) {
                        r1.ETw(BUq, luT, (String) null, 0, -1, -1, false, false);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                if (!r1.isPlaying()) {
                    C65505LuT.A01(luT, AnonymousClass8ZH.LOADING);
                    r1.seekTo(luT.A07.getProgress());
                    r1.E2p();
                    ((C66495MTy) this.A01).DT9();
                    return true;
                }
                r1.pause();
                return true;
            case 7:
                K72 k72 = (K72) this.A02;
                if (k72.A0B == null) {
                    return true;
                }
                C63978LGs.A01(k72, AnonymousClass7TE.A0l(k72.A0E), k72.A09, k72.A0D, AnonymousClass000.A00(2655), k72.A0C, (String) null);
                User user = (User) this.A01;
                if (user == null) {
                    C59689JTv.A07(k72.getContext(), 2131967874);
                    return true;
                }
                L53 l53 = k72.A0B;
                if (l53 == null) {
                    return true;
                }
                l53.A00.A08.CHz(user, C66579MXk.A00(361));
                return true;
            case 8:
                MVC mvc = (MVC) this.A01;
                if (mvc instanceof MusicSearchPlaylist) {
                    int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                    ((KVL) this.A02).A04.DXs((MusicSearchPlaylist) mvc);
                    return true;
                } else if (!(mvc instanceof C65493LuH)) {
                    return false;
                } else {
                    int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                    ((KVL) this.A02).A04.D1I((C65493LuH) mvc);
                    return true;
                }
            case 9:
                MVC mvc2 = (MVC) this.A01;
                if (mvc2 instanceof MusicSearchPlaylist) {
                    int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                    ((KVN) this.A02).A03.DXs((MusicSearchPlaylist) mvc2);
                    return true;
                } else if (!(mvc2 instanceof C65493LuH)) {
                    return false;
                } else {
                    int i5 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                    ((KVN) this.A02).A03.D1I((C65493LuH) mvc2);
                    return true;
                }
            case 10:
                Fragment fragment = (Fragment) this.A02;
                C255773uh r03 = ((C63895LAy) this.A01).A00;
                if (r03 != null) {
                    DUA A05 = r03.A05();
                    if (A05 == null || A05.Arm() == null) {
                        A1C = AnonymousClass7TE.A1C();
                    } else {
                        A1C = A05.Arm();
                    }
                    r5 = DbW.A0U(fragment);
                    r5.A05 = fragment.getString(2131952520, AnonymousClass7TF.A1b(A1C.size()));
                    r5.A0q(new C239023El("\n").A02(A1C));
                    r5.A06();
                    r5.A0r(true);
                    r5.A0s(true);
                    break;
                } else {
                    return true;
                }
            case 11:
                ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A02;
                C255773uh r53 = ((C63895LAy) this.A01).A00;
                if (r53 != null) {
                    int A002 = C64020LJh.A00(reelDashboardFragment.A06, r53);
                    boolean A1J = r53.A1J();
                    Resources A052 = DbV.A05(reelDashboardFragment);
                    if (A1J) {
                        Integer valueOf = Integer.valueOf(A002);
                        A0d = DbV.A0v(A052, valueOf, R.plurals.remove_videos_from_highlight_dialog_title, A002);
                        quantityString = DbV.A0v(DbV.A05(reelDashboardFragment), valueOf, R.plurals.remove_videos_from_highlight_dialog_message, A002);
                        i = 2131971974;
                    } else {
                        A0d = DbY.A0d(A052, A002, R.plurals.delete_videos_dialog_title);
                        quantityString = DbV.A05(reelDashboardFragment).getQuantityString(R.plurals.delete_videos_dialog_message, A002);
                        i = 2131957531;
                    }
                    Context requireContext = reelDashboardFragment.requireContext();
                    LV0 A003 = LV0.A00(reelDashboardFragment, r53, 58);
                    r5 = DbS.A0Y(requireContext);
                    r5.A05 = A0d;
                    r5.A0q(quantityString);
                    r5.A0I(A003, i);
                    r5.A05();
                    break;
                } else {
                    return true;
                }
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                FH7.A03(DbT.A08(this.A02), "https://help.instagram.com/1445818549016877");
                return true;
            case 13:
                ((C61177JyT) this.A01).A08.invoke(this.A02);
                return true;
            default:
                return super.Dqe(view);
        }
        DbT.A1V(r5);
        return true;
    }
}
