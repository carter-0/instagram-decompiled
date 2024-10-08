package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class FmB implements C273414mX {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public FmB(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public final void Cyc() {
        C47685ECu eCu;
        AnonymousClass4D6 r5;
        1OC A0K;
        Context context;
        FragmentActivity activity;
        C56541I0s A002;
        GJU gju;
        C62320sa r0;
        switch (this.A00) {
            case 0:
                C357058Wh r1 = (C357058Wh) this.A03;
                if (r1.A00) {
                    r0 = (C62320sa) this.A02;
                    break;
                } else {
                    27r A012 = 27p.A01(r1.A04);
                    ArrayList A1D = AnonymousClass7TE.A1D((Collection) this.A01);
                    29R r52 = A012.A09;
                    1Ln A08 = 1Ln.A08(r52.A01);
                    C279294yP A0J = r52.A0J();
                    if (DbT.A1Y(A08) && A0J != null) {
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        Iterator it = A1D.iterator();
                        while (it.hasNext()) {
                            A1C.add(Long.valueOf(AnonymousClass7TE.A18(it)));
                        }
                        A08.A0t("IG_CAMERA_ENTITY_TAP");
                        Dbc.A0i(A08, Dbc.A08(A08, A0J, r52, "ADS_MODE_ERROR_REVIEW_EXIT"));
                        A08.A0O("ads_mode_boost_story_enabled", AnonymousClass7TE.A0v());
                        A08.A0S("ads_mode_boost_story_error_codes", A1C);
                        A08.Cgf();
                        return;
                    }
                    return;
                }
            case 1:
                UserSession userSession = (UserSession) this.A03;
                Context context2 = (Context) this.A01;
                Long A003 = 2Cg.A00(userSession);
                if (A003 != null) {
                    long longValue = A003.longValue();
                    if (AnonymousClass3FV.A02(userSession) >= longValue) {
                        C310336ap A0a = DbS.A0a();
                        A0a.A0D = DbW.A0h(context2, C49927FFd.A02(AnonymousClass7TF.A0A(context2), longValue), 2131957358);
                        A0a.A06();
                        Dbb.A1Q(A0a);
                    }
                }
                2Aq.A03(userSession).A0R();
                C49431EvX evX = (C49431EvX) this.A02;
                if (evX != null) {
                    r0 = evX.A00;
                    break;
                } else {
                    return;
                }
            case 2:
                GCU gcu = (GCU) this.A03;
                gcu.EI8();
                C267324bN r6 = (C267324bN) this.A01;
                gcu.Cmm(r6);
                UserSession userSession2 = gcu.A01;
                AnonymousClass1Nd.A00(userSession2).A02(gcu.A00, AnonymousClass3KV.class);
                1Xj r12 = r6.A02;
                C52054GDa gDa = ((C52058GDe) this.A02).A0F;
                if (r12 == null || r12.A4Q() || !GQ3.A00(userSession2, gDa) || !182.A06(0Tu.A05, userSession2, 36320236320071801L)) {
                    1Xj r02 = r6.A02;
                    if (r02 != null && !r02.A4Q() && GQ3.A00(userSession2, gDa) && 182.A06(0Tu.A05, userSession2, 36320236320530560L)) {
                        gju = GJU.MID_SCENE;
                    } else {
                        return;
                    }
                } else {
                    gju = GJU.HIGHLIGHT_CTA;
                }
                if (gDa != null) {
                    C55259Heo.A00(r6, userSession2, gcu.A02, ((C55944Hq8) gDa.A04.getValue()).A00(gju), gDa, gju, "comment_sheet_dismissed", gcu.A03.CFD(), true);
                    return;
                }
                return;
            case 3:
                C51031FnN fnN = (C51031FnN) this.A03;
                Fragment fragment = fnN.A02;
                FragmentActivity activity2 = fragment.getActivity();
                C14631Tzd tzd = (C14631Tzd) this.A02;
                C247733gp r62 = tzd.A02;
                C48086EVe eVe = fnN.A01;
                if (eVe != null) {
                    if (eVe == C48086EVe.VIEW_PROFILE) {
                        User user = (User) this.A01;
                        0Aj A0G = DbZ.A0G(fnN.A06.A00, user, "view_profile_tapped");
                        A0G.A9F("entity_user_type", DbS.A0j(DbZ.A03(A0G, user)));
                        A0G.Cgf();
                        if (user.BIW() == 1) {
                            fnN.A03(user);
                        } else {
                            fnN.A05(user.getId());
                        }
                    } else if (eVe == C48086EVe.RESTRICT) {
                        User user2 = tzd.A0L;
                        if (!(user2 == null || (context = fragment.getContext()) == null || (activity = fragment.getActivity()) == null)) {
                            UserSession userSession3 = fnN.A04;
                            AnonymousClass0iw r4 = fnN.A03;
                            0wc A013 = AnonymousClass0kN.A01(r4, userSession3);
                            0gy A004 = AnonymousClass07i.A00(fragment);
                            boolean z = tzd.A0D;
                            String id = user2.getId();
                            if (z) {
                                AnonymousClass73V.A0G(A013, "click", "unrestrict_option", id);
                                1YZ r122 = 1YZ.A02;
                                if (r122 != null) {
                                    Context context3 = context;
                                    UserSession userSession4 = userSession3;
                                    r122.A02(context3, A004, userSession4, new C51092FoM(activity, A013, tzd, user2, fnN), user2.getId(), r4.getModuleName());
                                }
                            } else {
                                AnonymousClass73V.A0G(A013, "click", "restrict_option", id);
                                1YZ r2 = 1YZ.A02;
                                if (!(r2 == null || (A002 = r2.A00()) == null)) {
                                    String moduleName = r4.getModuleName();
                                    A002.A00(context, (C3263576k) null, (C69445Nlp) null, A013, userSession3, user2, new C51098FoS(1, user2, tzd, fnN), C48088EVg.STORY_VIEWERSHEET, new C51105FoZ(context, activity, A013, user2, fnN), moduleName, (String) null);
                                }
                            }
                        }
                    } else if (eVe == C48086EVe.BLOCK) {
                        fnN.A01(tzd);
                    } else if (eVe == C48086EVe.REPORT_COMMENT && activity2 != null && r62 != null) {
                        UserSession userSession5 = fnN.A04;
                        C71093OcF A014 = ORV.A01(activity2, fnN.A03, userSession5, C14068TpH.STORY_COMMENTS, C16677UzD.COMMENT, r62.A0G);
                        A014.A01 = (User) this.A01;
                        A014.A07(new C62429Kfe(7, fnN, tzd));
                        A014.A06();
                    } else if (eVe != C48086EVe.VIEW_LIKES) {
                        if (eVe == C48086EVe.NO_STORY_REPLIES) {
                            eCu = new C47685ECu(fnN, 7);
                            r5 = fnN.A05;
                            A0K = 1NP.A02(fnN.A04, AnonymousClass05K.A00);
                        } else if (eVe == C48086EVe.SWITCH_TO_PRIVATE) {
                            eCu = new C47685ECu(fnN, 8);
                            r5 = fnN.A05;
                            UserSession userSession6 = fnN.A04;
                            1NY A0a2 = AnonymousClass7TG.A0a(userSession6);
                            A0a2.A0A("accounts/set_private/");
                            Dbb.A1K(A0a2, new FVE(6), userSession6);
                            A0K = DbW.A0K(A0a2);
                        }
                        A0K.A00 = eCu;
                        r5.schedule(A0K);
                    } else if (!(r62 == null || !AnonymousClass06S.A01(fragment.mFragmentManager) || activity2 == null)) {
                        C309516Yo A0M = DbS.A0M(fragment.requireActivity(), fnN.A04);
                        String str = r62.A0G;
                        Bundle A0A = DbY.A0A(str);
                        A0A.putString(AnonymousClass000.A00(2624), str);
                        DbW.A0x(A0A, new C61370K4o(), A0M);
                    }
                    fnN.A01 = null;
                    return;
                }
                F35 f35 = fnN.A06;
                User user3 = (User) this.A01;
                0Aj A0G2 = DbZ.A0G(f35.A00, user3, "reel_viewer_dashboard_overflow_cancel");
                A0G2.AAJ("entity_user_type", String.valueOf(DbZ.A03(A0G2, user3)));
                A0G2.Cgf();
                return;
            default:
                return;
        }
        r0.invoke();
    }

    public final void Cyf() {
    }
}
