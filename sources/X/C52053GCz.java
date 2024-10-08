package X;

import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.GCz  reason: case insensitive filesystem */
public final class C52053GCz implements C233022up {
    public C52170GHm A00 = null;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new MMH(this, 39));

    public C52053GCz(UserSession userSession) {
        this.A01 = userSession;
    }

    public final String B4s() {
        return "reels_iaa";
    }

    public final void CJE(C376459Ib r20, List list) {
        AnonymousClass3DY r6;
        Integer num;
        double d;
        Map map;
        Integer num2;
        int intValue;
        String Br2;
        String A002;
        Object obj;
        C376459Ib r62 = r20;
        List list2 = list;
        boolean A1U = AnonymousClass7TF.A1U(0, r62, list2);
        UserSession userSession = this.A01;
        0Tu r2 = 0Tu.A06;
        if (182.A06(r2, userSession, 36319239887592477L) && Bsw().contains(r62) && list2.size() == A1U) {
            AnonymousClass9J4 r1 = (AnonymousClass9J4) ((AnonymousClass9IV) list2.get(0)).A01;
            switch (((C233162v9) r1.A04).ordinal()) {
                case 0:
                    r6 = AnonymousClass3DY.CAPTION_CLICK;
                    break;
                case 1:
                    r6 = AnonymousClass3DY.COMMENT_BUTTON;
                    break;
                case 2:
                    r6 = AnonymousClass3DY.CTA_CLICK;
                    break;
                case 7:
                    r6 = AnonymousClass3DY.PROFILE_TAP;
                    break;
                case 11:
                    r6 = AnonymousClass3DY.SHARE_BUTTON;
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                    r6 = AnonymousClass3DY.LONG_DWELL;
                    break;
                case 30:
                    r6 = AnonymousClass3DY.CTA_SWIPE_LEFT;
                    break;
                default:
                    return;
            }
            C52170GHm gHm = this.A00;
            if (gHm != null) {
                String str = ((AnonymousClass9JO) r1.A02).A04;
                0qQ.A0B(str, 0);
                UserSession userSession2 = gHm.A06;
                1Xj A0U = DbV.A0U(userSession2, str);
                if (A0U != null) {
                    String A07 = C231122qu.A07(userSession2, A0U);
                    if (A07 != null) {
                        String A0F = C231122qu.A0F(userSession2, A0U);
                        if (A0F != null) {
                            C54575HJk hJk = gHm.A09;
                            int A0C = hJk.A0C(A0U);
                            Integer valueOf = Integer.valueOf(A0C);
                            if (A0C != -1 && valueOf != null) {
                                int A0C2 = hJk.A0C(A0U);
                                Integer valueOf2 = Integer.valueOf(A0C2);
                                if (A0C2 == -1) {
                                    valueOf2 = null;
                                }
                                String str2 = null;
                                if (valueOf2 != null) {
                                    Iterator it = 00k.A0c(hJk.A0I(), valueOf2.intValue() + 1).iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj = it.next();
                                            if (GDZ.A00((C267324bN) obj)) {
                                            }
                                        } else {
                                            obj = null;
                                        }
                                    }
                                    C267324bN r12 = (C267324bN) obj;
                                    if (r12 != null) {
                                        str2 = C231122qu.A06(userSession2, r12.A06());
                                    }
                                }
                                boolean A0O = C231122qu.A0O(userSession2, A0U);
                                String A003 = gHm.A05.A00();
                                if (!182.A06(0Tu.A05, userSession2, 2342155883961124147L)) {
                                    num = AnonymousClass05K.A0Y;
                                } else if (!A0O) {
                                    num = AnonymousClass05K.A00;
                                } else if (C52170GHm.A0B) {
                                    num = AnonymousClass05K.A0C;
                                } else {
                                    Integer num3 = gHm.A01;
                                    num = AnonymousClass05K.A01;
                                    if (num3 == num) {
                                        num = AnonymousClass05K.A0N;
                                    } else {
                                        List A0I = hJk.A0I();
                                        ArrayList A1C = AnonymousClass7TE.A1C();
                                        Iterator it2 = A0I.iterator();
                                        while (it2.hasNext()) {
                                            IntentAwareAdsInfoIntf A004 = C51966G9m.A0m(it2).A00();
                                            if (!(A004 == null || (Br2 = A004.Br2()) == null)) {
                                                A1C.add(Br2);
                                            }
                                        }
                                        if (A1C.contains(A07)) {
                                            num = AnonymousClass05K.A0j;
                                        } else {
                                            List A0I2 = hJk.A0I();
                                            ArrayList A1C2 = AnonymousClass7TE.A1C();
                                            for (Object next : A0I2) {
                                                IntentAwareAdsInfoIntf A005 = ((C267324bN) next).A00();
                                                if (A005 != null) {
                                                    num2 = A005.BUY();
                                                } else {
                                                    num2 = null;
                                                }
                                                Integer A006 = AnonymousClass4I5.A00(num2);
                                                if (A006 != null && ((intValue = A006.intValue()) == 7 || intValue == 11)) {
                                                    A1C2.add(next);
                                                }
                                            }
                                            if (A1C2.size() < DbS.A04(r2, userSession2, 36600714864431068L)) {
                                                if (r6.ordinal() == 12) {
                                                    d = ((double) 182.A01(r2, userSession2, 36600714868232159L)) / 100.0d;
                                                } else {
                                                    d = 1.0d;
                                                }
                                                if (d < Math.random()) {
                                                    num = AnonymousClass05K.A0u;
                                                } else {
                                                    Context context = gHm.A03;
                                                    String moduleName = gHm.A07.getModuleName();
                                                    Map AUH = gHm.A04.AUH("ads/async_ads/");
                                                    C233072uu r0 = gHm.A00;
                                                    if (r0 != null) {
                                                        map = r0.Bk0();
                                                    } else {
                                                        map = null;
                                                    }
                                                    0qQ.A0B(moduleName, 7);
                                                    1NY A0M = DbU.A0M(userSession2);
                                                    A0M.A08(num);
                                                    A0M.A0A("ads/intent_aware_ads/reels/");
                                                    A0M.A0O((15p) null, C43803CDv.class, C45583Cyv.class, false);
                                                    C51965G9l.A1S(A0M, moduleName);
                                                    A0M.A9m("seed_ad_id", A07);
                                                    A0M.A9m("seed_ad_token", A0F);
                                                    A0M.A0G(C273654mx.A00(839), str2);
                                                    A0M.A0C("position", A0C);
                                                    A0M.A9m("trigger_type", r6.A00);
                                                    A0M.A0G("client_view_state_media_list", A003);
                                                    if (AUH != null) {
                                                        Iterator A0u = AnonymousClass7TF.A0u(AUH);
                                                        while (A0u.hasNext()) {
                                                            C51974G9v.A1C(A0M, A0u);
                                                        }
                                                    }
                                                    if (map != null) {
                                                        A0M.AA0("ad_and_netego_request_information", AnonymousClass4LV.A00(map));
                                                    }
                                                    A0M.A0R = A1U;
                                                    C51968G9o.A1C(context, A0M, userSession2);
                                                    1OC A0M2 = A0M.A0M();
                                                    int i = A0C;
                                                    A0M2.A00 = new XPN(r6, gHm, A07, A0F, i, A0O);
                                                    1ES.A05(A0M2, 1272817059, 2, A1U, A1U);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                                C51984GAh gAh = gHm.A08;
                                0Aj A0e = AnonymousClass7TE.A0e(gAh.A01, C273654mx.A00(756));
                                if (A0e.isSampled()) {
                                    C51984GAh.A00(A0e, gAh, 0);
                                    C51969G9p.A1A(A0e, gAh.A00);
                                    A0e.AAJ("trigger_type", r6.A00);
                                    A0e.A9F("multi_ads_type_number", 9L);
                                    switch (num.intValue()) {
                                        case 0:
                                            A002 = "seed_ad_not_multi_ads_eligible";
                                            break;
                                        case 1:
                                            A002 = AnonymousClass000.A00(339);
                                            break;
                                        case 2:
                                            A002 = AnonymousClass000.A00(2797);
                                            break;
                                        case 3:
                                            A002 = "clips_iaa_fetch_in_progress";
                                            break;
                                        case 4:
                                            A002 = "clips_iaa_litho_disabled";
                                            break;
                                        case 5:
                                            A002 = AnonymousClass000.A00(636);
                                            break;
                                        default:
                                            A002 = "coin_flip_failed";
                                            break;
                                    }
                                    A0e.AAJ("invalidation_reason", A002);
                                    A0e.A9F("hscroll_seed_ad_id", AnonymousClass7TE.A10(A07));
                                    A0e.A9F("hscroll_seed_ad_position", DbS.A0j(A0C));
                                    A0e.AAJ("hscroll_seed_ad_tracking_token", A0F);
                                    A0e.A7p("is_seed_ad_multi_ads_eligible", Boolean.valueOf(A0O));
                                    A0e.Cgf();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
        }
    }

    public final Set Bsw() {
        return (Set) this.A02.getValue();
    }
}
