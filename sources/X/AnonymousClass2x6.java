package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.intf.UserPayFanclubUpsellParams;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import com.instagram.user.model.User;

/* renamed from: X.2x6  reason: invalid class name */
public final class AnonymousClass2x6 implements 27S {
    public final /* synthetic */ C234042wt A00;

    public AnonymousClass2x6(C234042wt r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        C234042wt r1 = this.A00;
        if (C234042wt.A02(r1) || C234042wt.A03(r1)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        HLF hlf;
        String str;
        16V r0;
        UserPayFanclubUpsellParams userPayFanclubUpsellParams;
        UserDetailLaunchConfig A04;
        int i;
        String str2;
        int A03 = AnonymousClass0fD.A03(-1638393306);
        C240253Ke r7 = (C240253Ke) obj;
        int A032 = AnonymousClass0fD.A03(-1785018239);
        0qQ.A0B(r7, 0);
        1Xj r8 = r7.A00;
        C234042wt r6 = this.A00;
        UserSession userSession = r6.A0B;
        1Xj A1e = r8.A1e(userSession);
        User A2A = r8.A2A(userSession);
        User user = r7.A01;
        User user2 = user;
        boolean equals = user.equals(A2A);
        IT6 it6 = new IT6(A1e, r8, r6, r7);
        int A15 = r8.A15(userSession);
        if (A15 == -1) {
            A15 = 0;
        }
        if (!equals) {
            hlf = HLF.USER;
        } else if (r8.A4z()) {
            hlf = HLF.INFLUENCER;
        } else {
            hlf = HLF.BRAND;
        }
        AnonymousClass4DU r24 = r6.A0S;
        boolean A2Q = user2.A2Q();
        Integer valueOf = Integer.valueOf(A15);
        String str3 = null;
        if (HLF.INFLUENCER == hlf) {
            str = "influencer_in_comments";
        } else {
            str = null;
        }
        C233822wX.A0K(userSession, it6, hlf, A1e, r24, r6.A03, valueOf, str, A2Q);
        C266514Zg r12 = r6.A07;
        I6Q.A00(r12, userSession, r8);
        16V A0J = user2.A0J();
        C231292rN r15 = r6.A00;
        C228232l0 r13 = r6.A02;
        C233162v9 r11 = C233162v9.PROFILE_TAP;
        if (A0J == null) {
            r0 = 16V.A08;
        } else {
            r0 = A0J;
        }
        I6Q.A05(r8, r15, new C301165yf((C376459Ib) null, (C53251Gkz) null, "", r0.A02), r13, r11);
        if (!r8.CcK()) {
            r6.A0R.A06(r8.BpP());
        }
        C231292rN r02 = r6.A00;
        if (r02 != null) {
            r02.BQr(r8);
        }
        W07 w07 = VKH.A00;
        if (w07.A03(userSession, r8) || w07.A02(userSession, r8)) {
            Context context = r12.getContext();
            if (context != null) {
                AnonymousClass3KE.A00();
                AnonymousClass3KD.A00(context, userSession, r8, new C19564Wbo(r8, r6), "profile_username_caption");
            }
        } else {
            C231292rN r132 = r6.A00;
            C228232l0 r112 = r6.A02;
            C233162v9 r9 = C233162v9.PROFILE_USERNAME_CAPTION_TAP;
            if (A0J == null) {
                A0J = 16V.A08;
            }
            I6Q.A05(r8, r132, new C301165yf((C376459Ib) null, (C53251Gkz) null, "", A0J.A02), r112, r9);
        }
        if (!r7.A04 || A2A == null || A2A.A03.B3v() == null) {
            userPayFanclubUpsellParams = null;
        } else {
            userPayFanclubUpsellParams = FGM.A00(userSession, A2A);
        }
        if (r8.A1t() == AnonymousClass3QO.OPAL && C318996ps.A01()) {
            C247733gp A1T = r8.A1T();
            if (A1T != null) {
                str2 = A1T.A0G;
            } else {
                str2 = null;
            }
            if (0qQ.A0K(str2, r7.A03) && C318996ps.A00().A04(userSession)) {
                C318996ps.A00().A01().A04(r12.requireActivity(), userSession, (Integer) null, user2.getId(), "profile_picture", true, false);
                i = -1808416887;
                AnonymousClass0fD.A0A(i, A032);
                AnonymousClass0fD.A0A(-970844229, A03);
            }
        }
        boolean CcK = A1e.CcK();
        String A002 = AnonymousClass000.A00(3583);
        if (!CcK || !1sx.A0Q(r8, A15) || !equals) {
            C46474Dfc A01 = C46548Dgp.A01(userSession, user2.getId(), A002, r24.getModuleName());
            A01.A0L = r6.A05;
            A01.A0N = r7.A03;
            A01.A00 = userPayFanclubUpsellParams;
            Hashtag B6n = r8.A0C.B6n();
            if (r12 instanceof C266514Zg) {
                String A003 = AnonymousClass000.A00(719);
                0qQ.A0C(r12, A003);
                C266514Zg r1 = r12;
                if (r1.BCW() != null) {
                    0qQ.A0C(r12, A003);
                    B6n = r1.BCW();
                }
            }
            if (B6n != null) {
                A01.A03 = C49077Eov.A00(B6n);
            }
            if (equals) {
                A01.A04 = new SourceModelInfoParams(r8.BpP(), -1, A15);
                if (A1e.A5G() && !A1e.CcK()) {
                    A01.A0O = "profile_clips";
                    A04 = A01.A04();
                }
            }
            if (new C324736zo(userSession).A01(A1e.getId(), user2.getId()) && A1e.CcK()) {
                A01.A0O = "profile_products";
            }
            A04 = A01.A04();
        } else {
            C46474Dfc A012 = C46548Dgp.A01(userSession, user2.getId(), A002, r24.getModuleName());
            A012.A0L = r6.A05;
            A012.A0N = r7.A03;
            A012.A00 = userPayFanclubUpsellParams;
            String id = A1e.getId();
            if (id != null) {
                A012.A04 = new SourceModelInfoParams(id, -1, A15);
            }
            if (new C324736zo(userSession).A01(A1e.getId(), user2.getId())) {
                A012.A0O = "profile_products";
            }
            A04 = A012.A04();
            str3 = r7.A02;
        }
        C234042wt.A00(C46447Df9.A03().A01.A02(userSession, A04), userSession, r6, str3);
        i = -2106908738;
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-970844229, A03);
    }
}
