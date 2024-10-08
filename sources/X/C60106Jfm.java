package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.consideration.FanClubCustomizedBenefitsRepository;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Jfm  reason: case insensitive filesystem */
public final class C60106Jfm extends C361478gI {
    public static final List A0A;
    public List A00;
    public final UserSession A01;
    public final FanClubCustomizedBenefitsRepository A02;
    public final AnonymousClass0r6 A03;
    public final 05G A04;
    public final 05G A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;
    public final C273004lm A08;
    public final String A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60106Jfm(Application application, UserSession userSession, C273004lm r6, FanClubCustomizedBenefitsRepository fanClubCustomizedBenefitsRepository, String str, List list) {
        super(application);
        0qQ.A0B(application, 1);
        C51974G9v.A1S(userSession, str, list, fanClubCustomizedBenefitsRepository, r6);
        this.A01 = userSession;
        this.A09 = str;
        this.A00 = list;
        this.A02 = fanClubCustomizedBenefitsRepository;
        this.A08 = r6;
        02z A012 = 106.A01(KRW.A00);
        this.A04 = A012;
        this.A07 = A012;
        02z A1J = JTO.A1J();
        this.A05 = A1J;
        02z A10 = C51970G9q.A10(false);
        this.A06 = A10;
        this.A03 = new MC0(3, this, new AnonymousClass0r6[]{A1J, A10});
        String str2 = userSession.A06;
        0Aj A0e = AnonymousClass7TE.A0e(r6.A00, "ig_fan_club_customized_benefits_selection_screen_impression");
        DbS.A1O(A0e, "fan_club_custom_benefits_selection");
        DbY.A1G(A0e, str2);
        A0e.AAJ("origin", str);
        A0e.Cgf();
    }

    public static final void A00(C60106Jfm jfm, int i) {
        for (C61165JyH jyH : 00k.A0c(JTO.A0x(jfm.A05), 1)) {
            if (!jyH.A01) {
                jyH.A00 = AnonymousClass7TF.A1T(i, 8);
            }
        }
    }

    public final List A0E(List list) {
        List<C61165JyH> list2 = A0A;
        ArrayList A0r = AnonymousClass7TG.A0r(list2);
        for (C61165JyH jyH : list2) {
            Application A0D = A0D();
            int i = jyH.A03;
            A0r.add(new C61165JyH(i, jyH.A02, list.contains(A0D.getString(i)), jyH.A00));
        }
        return A0r;
    }

    public final void A0F() {
        C273004lm r1 = this.A08;
        String str = this.A01.A06;
        String str2 = this.A09;
        0Aj A0e = AnonymousClass7TE.A0e(r1.A00, "ig_fan_club_customized_benefits_selection_screen_save_button_tap");
        DbS.A1O(A0e, "fan_club_custom_benefits_selection");
        DbY.A1G(A0e, str);
        A0e.AAJ("origin", str2);
        A0e.Cgf();
        AnonymousClass7TE.A1Z(new C66182MGt((Object) this, (AnonymousClass4D7) null, 40), C318116oQ.A00(this));
    }

    static {
        C61165JyH jyH = new C61165JyH(2131957257, 2131957258, true, false);
        C61165JyH jyH2 = new C61165JyH(2131957241, 2131957242, true, true);
        C61165JyH jyH3 = new C61165JyH(2131957255, 2131957256, true, true);
        C61165JyH jyH4 = new C61165JyH(2131957231, 2131957232, false, true);
        C61165JyH jyH5 = new C61165JyH(2131957229, 2131957230, false, true);
        C61165JyH jyH6 = new C61165JyH(2131957239, 2131957240, false, true);
        C61165JyH jyH7 = new C61165JyH(2131957245, 2131957246, false, true);
        C61165JyH jyH8 = new C61165JyH(2131957253, 2131957254, false, true);
        C61165JyH jyH9 = new C61165JyH(2131957243, 2131957244, false, true);
        C61165JyH jyH10 = new C61165JyH(2131957237, 2131957238, false, true);
        C61165JyH jyH11 = new C61165JyH(2131957251, 2131957252, false, true);
        C61165JyH jyH12 = new C61165JyH(2131957235, 2131957236, false, true);
        C61165JyH jyH13 = jyH9;
        C61165JyH jyH14 = jyH10;
        C61165JyH jyH15 = jyH11;
        C61165JyH jyH16 = jyH12;
        C61165JyH jyH17 = jyH5;
        C61165JyH jyH18 = jyH6;
        C61165JyH jyH19 = jyH7;
        C61165JyH jyH20 = jyH8;
        C61165JyH jyH21 = jyH2;
        C61165JyH jyH22 = jyH3;
        C61165JyH jyH23 = jyH4;
        A0A = 0sr.A1P(new C61165JyH[]{jyH, jyH21, jyH22, jyH23, jyH17, jyH18, jyH19, jyH20, jyH13, jyH14, jyH15, jyH16, new C61165JyH(2131957249, 2131957250, false, true), new C61165JyH(2131957233, 2131957234, false, true), new C61165JyH(2131957247, 2131957248, false, true), new C61165JyH(2131957259, 2131957260, false, true)});
    }
}
