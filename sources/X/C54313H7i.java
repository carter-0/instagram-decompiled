package X;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioType;
import com.instagram.user.model.User;

/* renamed from: X.H7i  reason: case insensitive filesystem */
public final class C54313H7i extends AnonymousClass3NK {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C54313H7i(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final boolean Dqe(View view) {
        boolean z;
        C267324bN A022;
        User user;
        C59593JPn jPn;
        UserSession userSession;
        C2606046i r2;
        AudioType audioType;
        C263944Ny A002;
        OriginalAudioSubtype Ads;
        C54689HOu hOu;
        View view2 = view;
        switch (this.A00) {
            case 0:
                IO9 io9 = (IO9) this.A02;
                UserSession userSession2 = io9.A0R;
                GVT gvt = io9.A0V;
                if (((C55895HpG) this.A01).A0F) {
                    hOu = C54689HOu.A0X;
                } else {
                    hOu = C54689HOu.A0Y;
                }
                C52086GEg.A0P(hOu, gvt, userSession2, io9.A0c, io9.A0a, io9.A0b, io9.A0M);
                1Ze A003 = C55169HdL.A00();
                FragmentActivity requireActivity = gvt.requireActivity();
                HM8 hm8 = io9.A0T;
                if (hm8 == null) {
                    hm8 = HM8.AUDIO_PAGE;
                }
                A003.A01(requireActivity, (C67231sQ) null, userSession2, hm8, io9.A0X.A03);
                return true;
            case 1:
                IO9 io92 = (IO9) this.A02;
                String str = ((C55895HpG) this.A01).A06;
                if (str == null || str.length() == 0) {
                    C59689JTv.A07(io92.A0V.requireContext(), 2131967874);
                    return true;
                }
                C54191H2l.A01(io92.A0P, AnonymousClass000.A00(2655));
                UserSession userSession3 = io92.A0R;
                1a1 A023 = C46447Df9.A02();
                GVT gvt2 = io92.A0V;
                C51974G9v.A0f(gvt2.requireActivity(), A023.A01(userSession3, C46474Dfc.A01(userSession3, str, "audio_page_artist", "audio_page")), gvt2, userSession3);
                String str2 = null;
                String str3 = str;
                if (!0qQ.A0K(userSession3.A06, str)) {
                    str3 = null;
                }
                GVW A004 = C53044Ghc.A00(io92.A0X);
                if (A004 != null) {
                    r2 = A004.A03;
                } else {
                    r2 = null;
                }
                Long valueOf = Long.valueOf(io92.A0M);
                String str4 = io92.A0b;
                if (r2 != null) {
                    audioType = r2.Adv();
                } else {
                    audioType = null;
                }
                HOL A005 = C55059HbU.A00(audioType);
                if (!(r2 == null || (Ads = r2.Ads()) == null)) {
                    str2 = C55060HbV.A00(Ads);
                }
                C320506sU r5 = io92.A0Q;
                if (valueOf == null) {
                    return true;
                }
                C263944Ny r0 = null;
                Long A0n = 00y.A0n(10, str);
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(gvt2, userSession3), "instagram_organic_audio_page_owner_tapped");
                C51965G9l.A1M(A0e, "audio_page");
                C51965G9l.A1F(A0e, valueOf);
                G9t.A1G(A0e);
                C51965G9l.A1E(A0e, C51970G9q.A0i(str4));
                if (str3 == null) {
                    A002 = null;
                } else {
                    A002 = C263944Ny.A00(str3);
                }
                A0e.AAE(A002, "target_id");
                DbY.A1C(A0e);
                if (A0n != null) {
                    r0 = new C263944Ny(A0n);
                }
                A0e.AAE(r0, "audio_owner_id");
                A0e.A8M(A005, "audio_type");
                A0e.AAJ("audio_sub_type", str2);
                C51973G9u.A11(A0e, r5);
                A0e.Cgf();
                return true;
            case 2:
                IO8 io8 = (IO8) this.A02;
                AnonymousClass8A1.A01(io8.A0H).A0J(C279294yP.CLIPS.toString());
                MusicAttributionConfig musicAttributionConfig = ((GVY) this.A01).A01;
                if (io8.A00 > System.currentTimeMillis() - 500) {
                    return true;
                }
                io8.A00 = System.currentTimeMillis();
                C53044Ghc ghc = io8.A0K;
                C51975G9x.A1E(musicAttributionConfig, ghc, C51975G9x.A0R(ghc, musicAttributionConfig), 49);
                return true;
            case 3:
                H1F h1f = (H1F) this.A02;
                UserSession A0l = AnonymousClass7TE.A0l(h1f.A0O);
                C54676HOh hOh = C54676HOh.STORE_LINK_CLICK;
                HOM hom = h1f.A04;
                String str5 = h1f.A0D;
                String str6 = h1f.A0E;
                0qQ.A0B(A0l, 0);
                0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(A0l), "ig_wearables_pivot_page");
                A0e2.A8M(hOh, "pivot_page_event_name");
                C51974G9v.A0k(hom, A0e2, str5, str6, (String) null);
                String string = h1f.requireArguments().getString("cta_url_override");
                if (string == null || string.equals("")) {
                    string = ((JV7) this.A01).A02;
                }
                Uri A03 = 0cp.A03(string);
                if (00l.A0d(DbT.A10(A03), "instagram://profile_shop?", false)) {
                    Intent A04 = AnonymousClass14B.A03.A00().A04(h1f.requireContext(), A03);
                    A04.putExtra(C66579MXk.A00(3), true);
                    0kR.A0B(h1f.requireContext(), A04);
                    return true;
                }
                0kR.A0F(h1f.requireContext(), A03);
                return true;
            case 4:
                z = false;
                0qQ.A0B(view2, 0);
                GDB gdb = (GDB) this.A02;
                A022 = gdb.A0M.A02();
                if (A022 == null) {
                    return false;
                }
                user = (User) this.A01;
                jPn = (C59593JPn) gdb.A0J.A1c.getValue();
                if (jPn != null) {
                    userSession = gdb.A0G;
                    break;
                } else {
                    return true;
                }
            default:
                z = false;
                0qQ.A0B(view2, 0);
                HKA hka = (HKA) this.A02;
                A022 = hka.A0A.A02();
                if (A022 == null) {
                    return false;
                }
                user = (User) this.A01;
                jPn = hka.A09;
                if (jPn != null) {
                    userSession = hka.A07;
                    break;
                } else {
                    return true;
                }
        }
        jPn.Da6((View) null, A022, C52057GDd.A01(A022, userSession, 1sd.A00(userSession), (AnonymousClass3W1) null, (C52054GDa) null), AnonymousClass3ZC.A01(A022), user, (Boolean) null, (Boolean) null, (Float) null, (Float) null, (Float) null, (Float) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) null, (String) null, (C62320sa) null, z, z);
        return true;
    }
}
