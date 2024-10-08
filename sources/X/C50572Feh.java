package X;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Feh  reason: case insensitive filesystem */
public final class C50572Feh implements C51959G9f {
    public RectF A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final 0hq A03;
    public final C227812jx A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final AnonymousClass4DU A07;
    public final C51959G9f A08;
    public final 1a0 A09;

    public final void A73(JV7 jv7, C283155Gi r2, User user, int i) {
    }

    public final void CyR(C47179Dru dru, C283155Gi r2, String str, String str2, int i) {
    }

    public final void D0k(C283155Gi r1, int i) {
    }

    public final void D2V(Hashtag hashtag) {
    }

    public final void D2Y(FollowStatus followStatus, User user) {
    }

    public final void D2p(User user) {
    }

    public final void D2x(Reel reel, AnonymousClass3N3 r2) {
    }

    public final void D3G(Hashtag hashtag) {
    }

    public final void D4m(C47179Dru dru, C283155Gi r2, int i) {
    }

    public final void D4p(C47179Dru dru, C283155Gi r2, int i) {
    }

    public final void D6M(C47179Dru dru, C283155Gi r2, int i) {
    }

    public final void D8G(JV7 jv7, C283155Gi r2, int i, boolean z) {
    }

    public final void D8v(C47179Dru dru, C283155Gi r2, int i, boolean z) {
    }

    public final void DGO(User user) {
    }

    public final void DGP(User user) {
    }

    public final void DGQ(C267064at r1) {
    }

    public final void DGR(EWA ewa, User user) {
    }

    public final void DGV(C47179Dru dru, C283155Gi r2, int i) {
    }

    public final void DGb(Hashtag hashtag, C283155Gi r2, int i) {
    }

    public final void DIQ(C47179Dru dru, C283155Gi r2, int i) {
    }

    public final void DIg(C47179Dru dru, C283155Gi r2, String str, int i) {
    }

    public final void DKj(C47179Dru dru, C283155Gi r2, int i) {
    }

    public final void DNT(C283155Gi r1, int i, boolean z) {
    }

    public final void DNW(C47179Dru dru, C283155Gi r2, String str, int i) {
    }

    public final void DNt(C47179Dru dru, C283155Gi r2, String str, int i) {
    }

    public final void DOj(C47179Dru dru, C283155Gi r2, String str, int i) {
    }

    public final void DQW(C283155Gi r1, int i, int i2) {
    }

    public final void DRD(C47179Dru dru, C283155Gi r2, String str, int i) {
    }

    public final void DZS(C283155Gi r1, String str) {
    }

    public final void DcN(RectF rectF, C47179Dru dru, C283155Gi r3, int i) {
    }

    public final void Ddw(C47179Dru dru, C283155Gi r2, int i) {
    }

    public final void DgD(C47179Dru dru, C283155Gi r21, int i) {
        String str;
        String str2;
        C309516Yo A0Q;
        boolean z;
        Object obj;
        List A18;
        HashMap A0e;
        String str3;
        Object obj2;
        List A182;
        UserSession userSession;
        AnonymousClass3M3 A012;
        FragmentActivity fragmentActivity;
        UserSession userSession2;
        C283155Gi r1 = r21;
        0qQ.A0B(r1, 0);
        C46518DgL A032 = r1.A03();
        if (A032 != null) {
            str = A032.A00;
        } else {
            str = null;
        }
        String A072 = r1.A07();
        C47179Dru dru2 = dru;
        int i2 = i;
        if (str != null) {
            boolean z2 = false;
            if (00p.A0k(str, "igtv_insights", false)) {
                String A092 = r1.A09("media_id");
                UserSession userSession3 = this.A06;
                C270634h3 r4 = new C270634h3(ClipsViewerSource.MONETIZATION_INBOX, userSession3);
                r4.A1C = A092;
                r4.A1S = true;
                r4.A1m = true;
                C250563lf.A0Y(this.A02, r4.A00(), userSession3);
            } else if (00p.A0k(str, "product_eligibility", false)) {
                UserMonetizationProductType A002 = C272504kq.A00(r1.A09("product"));
                if (A002.ordinal() == 0) {
                    userSession2 = this.A06;
                    if (182.A06(0Tu.A05, userSession2, 36327658023303777L)) {
                        fragmentActivity = this.A02;
                    }
                } else {
                    fragmentActivity = this.A02;
                    userSession2 = this.A06;
                }
                C309516Yo A0M = DbS.A0M(fragmentActivity, userSession2);
                A0M.A0B((Bundle) null, F6R.A00().A00(A002, userSession2, (String) null, false));
                A0M.A04();
            } else if (00p.A0k(str, "branded_content_ad_access_permission", false)) {
                FragmentActivity fragmentActivity2 = this.A02;
                UserSession userSession4 = this.A06;
                String str4 = r1.A04.A0Z;
                if (str4 == null) {
                    str4 = null;
                }
                C49950FGf.A04(fragmentActivity2, userSession4, "bc_inbox", str4, false);
                return;
            } else if (00p.A0k(str, "ad_partner_promotion", false)) {
                FragmentActivity fragmentActivity3 = this.A02;
                UserSession userSession5 = this.A06;
                if (A072 != null) {
                    C49950FGf.A03(fragmentActivity3, userSession5, A072, r1.A00);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (00p.A0k(str, "branded_content_ad", false)) {
                C49950FGf.A04(this.A02, this.A06, "bc_inbox", (String) null, false);
                return;
            } else if (str.equals("profile_shop")) {
                C283165Gj r42 = r1.A04;
                String str5 = r42.A0f;
                if (str5 == null) {
                    str5 = DbT.A11("merchant_id", (Map) r42.A1E.getValue());
                }
                if (str5 != null) {
                    C249713kF r9 = C249713kF.A00;
                    FragmentActivity fragmentActivity4 = this.A02;
                    UserSession userSession6 = this.A06;
                    AnonymousClass4DU r5 = this.A07;
                    String A093 = r1.A09("merchant_username");
                    if (A093 != null) {
                        r9.A0N(fragmentActivity4, 16m.A00(r1.A09("seller_shoppable_feed_type")), userSession6, r5, (String) null, (String) null, "branded_content_notification", str5, A093).A05();
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
            } else {
                if (str.equals("branded_content_settings_approval")) {
                    UserSession userSession7 = this.A06;
                    Dba.A1I(DbX.A0O(this.A05, userSession7), "ig_branded_content_tag_approval_request_notification_tapped");
                    A0Q = C49892FBu.A00(this.A02, userSession7);
                    C61448K8c k8c = new C61448K8c();
                    DbZ.A1B(k8c, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "bc_inbox");
                    A0Q.A0B((Bundle) null, k8c);
                } else if (str.equals("request_brand_approval_screen")) {
                    A0Q = C49892FBu.A00(this.A02, this.A06);
                    A0Q.A0B((Bundle) null, new C61447K8b());
                } else if (str.equals("branded_content_pending_approval")) {
                    C283165Gj r43 = r1.A04;
                    String str6 = r43.A0h;
                    String str7 = r43.A0f;
                    if (!(str6 == null || str7 == null || A072 == null)) {
                        A0Q = C49892FBu.A00(this.A02, this.A06);
                        A0Q.A0B((Bundle) null, LSU.A02(str6, str7, A072, "bc_inbox_push_notification"));
                    }
                } else if (str.equals(PublicKeyCredentialControllerUtility.JSON_KEY_USER)) {
                    String A094 = r1.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    if (A094 != null) {
                        String A095 = r1.A09("entry_trigger");
                        String A096 = r1.A09(AnonymousClass000.A00(545));
                        if (A096 == null || Integer.parseInt(A096) == 1) {
                            z2 = true;
                        }
                        UserSession userSession8 = this.A06;
                        if (A095 == null) {
                            A095 = "feed_story_header";
                        }
                        C46474Dfc A013 = C46548Dgp.A01(userSession8, A094, A095, this.A05.getModuleName());
                        String A097 = r1.A09("merchant_id");
                        String A098 = r1.A09("merchant_username");
                        A013.A0J = A097;
                        A013.A0K = A098;
                        A013.A0W = z2;
                        A0Q = DbU.A0Q(this.A02, userSession8);
                        A0Q.A0B((Bundle) null, C46474Dfc.A00(userSession8, this.A09.A01, A013));
                    }
                } else if (str.equals("featured_product_media")) {
                    A04(r1);
                } else if (str.equals("profile_tagged_posts")) {
                    A01();
                } else if (str.equals("pending_tagged_posts")) {
                    A00();
                } else if (str.equals("igtv_ads_creator_onboarding")) {
                    A02(UserMonetizationProductType.IGTV_REVSHARE, r1.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID), (String) null);
                } else if (str.equals("reels_overlay_ads_onboarding")) {
                    A02(UserMonetizationProductType.REELS_OVERLAY_ADS, (String) null, (String) null);
                } else if (str.equals("user_pay_creator_onboarding")) {
                    A02(UserMonetizationProductType.USER_PAY, r1.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID), (String) null);
                } else if (str.equals("user_pay_badges_incentives_onboarding")) {
                    A02(UserMonetizationProductType.BADGES_INCENTIVES, r1.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID), (String) null);
                } else if (str.equals("incentive_platform_management")) {
                    A02(UserMonetizationProductType.INCENTIVE_PLATFORM, r1.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID), r1.A09("program"));
                } else if (str.equals("resume_payout_onboarding")) {
                    String A099 = r1.A09("product");
                    String A0910 = r1.A09("origin");
                    if (A0910 == null) {
                        A0910 = "MONETIZATION_INBOX";
                    }
                    F6T.A01((Fragment) null, this.A02, C272504kq.A00(A099), this.A06, this.A05.getModuleName(), A0910, r1.A09("created_deal_id"), r1.A09("fe_id"), (String) null);
                } else if (str.equals("incentive_platform_progress_tracking")) {
                    String A0911 = r1.A09("fbid_of_incentive");
                    FragmentActivity fragmentActivity5 = this.A02;
                    UserSession userSession9 = this.A06;
                    A0Q = DbU.A0Q(fragmentActivity5, userSession9);
                    A0Q.A0A = "MONETIZATION_INBOX";
                    A0Q.A0B((Bundle) null, F9Y.A00().A02(userSession9, "MONETIZATION_INBOX", A0911));
                } else if (str.equals("incentive_platform_available_bonus")) {
                    String A0912 = r1.A09("deal_template_id");
                    if (A0912 == null) {
                        F9Y.A00();
                        userSession = this.A06;
                        A012 = C46649DiU.A02(userSession, "com.instagram.incentive_platform.screens.deal_information", DbY.A0m(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, DbY.A0j("MONETIZATION_INBOX")));
                    } else {
                        C49884FBk A003 = F9Y.A00();
                        userSession = this.A06;
                        A012 = A003.A01(userSession, A0912, "MONETIZATION_INBOX");
                    }
                    A0Q = DbU.A0Q(this.A02, userSession);
                    A0Q.A0A = "MONETIZATION_INBOX";
                    A0Q.A0B((Bundle) null, A012);
                } else if (str.equals("incentive_platform_xar_upsell")) {
                    String A0913 = r1.A09("fbid_of_incentive");
                    FragmentActivity fragmentActivity6 = this.A02;
                    UserSession userSession10 = this.A06;
                    A0Q = DbU.A0Q(fragmentActivity6, userSession10);
                    A0Q.A0A = "MONETIZATION_INBOX";
                    A0Q.A0B((Bundle) null, F9Y.A00().A04(fragmentActivity6, this.A05, userSession10, A0913, "MONETIZATION_INBOX"));
                } else if (str.equals("creator_payout")) {
                    String A0914 = r1.A09("financial_entity_id");
                    A0Q = DbS.A0M(this.A02, this.A06);
                    A0Q.A0B((Bundle) null, C48892Els.A00((UserMonetizationProductType) null, EWG.MONETIZATION_INBOX, A0914, (String) null));
                } else if (str.equals("broadcast")) {
                    String A0915 = r1.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    if (A0915 != null) {
                        C239403Gi.A01(this.A04.requireContext(), this.A06).A08(A0915, r1.A09("comment_id"));
                    }
                } else {
                    boolean equals = str.equals("branded_content_live_insights");
                    String A004 = C66579MXk.A00(1);
                    if (equals) {
                        String A0916 = r1.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        if (A0916 == null || (A182 = DbV.A18(A0916, "_")) == null || (obj2 = 00k.A0O(A182, 0)) == null) {
                            obj2 = "";
                        }
                        A0e = Dbb.A0e("origin", "branded_content_brand_notification", AnonymousClass7TE.A1L("target_id", obj2));
                        str3 = C273654mx.A00(622);
                    } else if (str.equals("branded_content_brand_tag_request")) {
                        String A0917 = r1.A09("media_id");
                        if (A0917 == null) {
                            A0917 = "";
                        }
                        String A0918 = r1.A09("suspected_sponsor");
                        if (A0918 == null) {
                            A0918 = "";
                        }
                        A0e = Dbb.A0e("suspected_sponsor", A0918, AnonymousClass7TE.A1L("media_id", A0917));
                        str3 = "com.instagram.branded_content.screens.single_media_with_request_view";
                    } else {
                        boolean equals2 = str.equals("branded_content_expired_story_insights");
                        String A005 = C273654mx.A00(72);
                        if (equals2) {
                            if (A072 == null || (A18 = DbV.A18(A072, "_")) == null || (obj = 00k.A0O(A18, 0)) == null) {
                                obj = "";
                            }
                            C46649DiU A042 = C46649DiU.A04(A005, Dbb.A0e("origin", "branded_content_brand_notification", AnonymousClass7TE.A1L("target_id", obj)));
                            FragmentActivity fragmentActivity7 = this.A02;
                            0qQ.A0C(fragmentActivity7, A004);
                            IgBloksScreenConfig A0N = DbS.A0N(this.A06);
                            DbS.A18(this.A01, A0N, 2131974440);
                            A042.A0D(fragmentActivity7, A0N);
                        } else if (str.equals("creator_suspected_bc_review")) {
                            A03(dru2, r1);
                            C46518DgL A033 = r1.A03();
                            if (A033 != null) {
                                if (0qQ.A0K(A033.A00, "branded_content_review_policies")) {
                                    C227812jx r44 = this.A04;
                                    DbW.A1J(r44, new SUL(DbT.A03(r44), this.A06, 2EG.A0e, C273654mx.A00(14), false));
                                } else {
                                    Bundle A0a = AnonymousClass7TE.A0a();
                                    UserSession userSession11 = this.A06;
                                    AnonymousClass0Dg.A00(A0a, userSession11);
                                    A0a.putString("com.instagram.brandedcontent.violation.ARGUMENT_EXTRA_VIOLATION_MEDIA_ID", r1.A07());
                                    A0a.putString("com.instagram.brandedcontent.violation.ARGUMENT_EXTRA_NOTIF_ID", r1.A09);
                                    A0a.putString("com.instagram.brandedcontent.violation.ARGUMENT_EXTRA_NOTIF_TUUID", r1.A04.A0s);
                                    String A0919 = r1.A09("notif_source");
                                    if (A0919 == null) {
                                        A0919 = "";
                                    }
                                    A0a.putString("com.instagram.brandedcontent.violation.ARGUMENT_EXTRA_NOTIF_SOURCE", A0919);
                                    DbW.A0y(A0a, new C47487E4r(), C49892FBu.A00(this.A02, userSession11));
                                }
                            }
                        } else if (str.equals("user_pay_demonetization")) {
                            String str8 = r1.A04.A0o;
                            if (str8 != null) {
                                z = 00l.A0d(str8, "24", false);
                            } else {
                                z = false;
                            }
                            FragmentActivity fragmentActivity8 = this.A02;
                            UserSession userSession12 = this.A06;
                            A0Q = DbS.A0M(fragmentActivity8, userSession12);
                            A0Q.A0B((Bundle) null, F6R.A00().A00(UserMonetizationProductType.USER_PAY, userSession12, "not_eligible", z));
                        } else if (str.equals("igtv_content_library")) {
                            FG2.A01(this.A02, this.A06);
                        } else if (str.equals("active_promotions")) {
                            FragmentActivity fragmentActivity9 = this.A02;
                            UserSession userSession13 = this.A06;
                            String str9 = r1.A04.A0f;
                            if (str9 != null) {
                                C49950FGf.A05(fragmentActivity9, userSession13, "bc_inbox", str9, false);
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else if (str.equals("content_appreciation_management")) {
                            String A0920 = r1.A09("origin");
                            if (A0920 != null) {
                                str2 = AnonymousClass7TF.A0k(A0920);
                            } else {
                                str2 = "NOTIFICATION";
                            }
                            FragmentActivity fragmentActivity10 = this.A02;
                            UserSession userSession14 = this.A06;
                            A0Q = DbU.A0Q(fragmentActivity10, userSession14);
                            A0Q.A0B((Bundle) null, AnonymousClass2BF.A00().A02().A00(userSession14, str2, (String) null, (String) null, false));
                            A0Q.A0A = str2;
                        } else if (str.equals("subscriptions_story_sticker")) {
                            C46649DiU A043 = C46649DiU.A04(A005, Dbb.A0e("origin", "subscriptions_story_sticker", AnonymousClass7TE.A1L("target_id", r1.A0B("media_id"))));
                            FragmentActivity fragmentActivity11 = this.A02;
                            0qQ.A0C(fragmentActivity11, A004);
                            IgBloksScreenConfig A0N2 = DbS.A0N(this.A06);
                            DbS.A18(this.A01, A0N2, 2131974440);
                            A043.A0D(fragmentActivity11, A0N2);
                        } else {
                            this.A08.DgD(dru2, r1, i2);
                        }
                    }
                    C46649DiU A044 = C46649DiU.A04(str3, A0e);
                    FragmentActivity fragmentActivity12 = this.A02;
                    0qQ.A0C(fragmentActivity12, A004);
                    C46649DiU.A09(fragmentActivity12, A044, this.A06);
                }
                A0Q.A04();
            }
            A03(dru2, r1);
        } else if (A072 != null) {
            DPt(dru2, r1, A072, i2);
        }
    }

    public final boolean DgH(JV7 jv7, C283155Gi r3, int i) {
        return false;
    }

    public final void DgM(C283155Gi r12, int i) {
        C283155Gi r6 = r12;
        0qQ.A0B(r12, 0);
        UserSession userSession = this.A06;
        Dd0 A012 = C46354Dcy.A01(userSession);
        0qQ.A07(A012);
        String str = r12.A04.A0s;
        if (str == null || !A012.A01.contains(str)) {
            A012.A0H((JV7) null, this.A05, r6, userSession.A06, (String) null, (String) null, i);
        }
    }

    public final void Dw6(C47179Dru dru, C283155Gi r7, String str, int i) {
        0qQ.A0B(str, 0);
        int i2 = r7.A00;
        if (i2 == 386 || i2 == 388) {
            FragmentActivity fragmentActivity = this.A02;
            UserSession userSession = this.A06;
            C46474Dfc.A03(DbS.A0M(fragmentActivity, userSession), userSession, this.A09.A01, C46548Dgp.A01(userSession, str, "branded_content_ad_sponsor", this.A05.getModuleName()));
        } else if (i2 != 583) {
            this.A08.Dw6(dru, r7, str, i);
            return;
        } else {
            FragmentActivity fragmentActivity2 = this.A02;
            UserSession userSession2 = this.A06;
            String str2 = r7.A04.A0Z;
            if (str2 == null) {
                str2 = null;
            }
            C49950FGf.A04(fragmentActivity2, userSession2, "bc_inbox", str2, false);
        }
        A03(dru, r7);
    }

    public final void DwF(C47179Dru dru, C283155Gi r2, int i) {
    }

    public final void Dwg(C47179Dru dru, C283155Gi r2, String str, int i) {
    }

    public final void DzH(JV7 jv7, C283155Gi r2, int i) {
    }

    public final void Ecc(C283155Gi r1, String str, int i) {
    }

    private final void A00() {
        FragmentActivity fragmentActivity = this.A02;
        UserSession userSession = this.A06;
        C309516Yo A0M = DbS.A0M(fragmentActivity, userSession);
        A0M.A0D(this.A09.A01.A07(EVG.PENDING, AnonymousClass05K.A00, userSession.A06, AnonymousClass7TF.A0Q(userSession).getUsername(), true));
        A0M.A04();
    }

    private final void A01() {
        FragmentActivity fragmentActivity = this.A02;
        UserSession userSession = this.A06;
        C309516Yo A0M = DbS.A0M(fragmentActivity, userSession);
        1a1 r3 = this.A09.A01;
        C46474Dfc A012 = C46548Dgp.A01(userSession, userSession.A06, "branded_content_activity_notification", this.A05.getModuleName());
        A012.A0O = C273654mx.A00(51);
        C46474Dfc.A03(A0M, userSession, r3, A012);
    }

    private final void A02(UserMonetizationProductType userMonetizationProductType, String str, String str2) {
        UserMonetizationProductType userMonetizationProductType2 = userMonetizationProductType;
        String str3 = str;
        if (userMonetizationProductType2 == UserMonetizationProductType.BADGES_INCENTIVES) {
            C49904FEc fEc = C49283EsS.A00;
            FragmentActivity fragmentActivity = this.A02;
            UserSession userSession = this.A06;
            fEc.A02((Fragment) null, fragmentActivity, userMonetizationProductType2, userSession, F6S.A00(userSession, AnonymousClass7TE.A1E()), this.A05.getModuleName(), "MONETIZATION_INBOX", AnonymousClass7TE.A16(this.A01, 2131976253), str3, (String) null, "MONETIZATION_INBOX");
            return;
        }
        FragmentActivity fragmentActivity2 = this.A02;
        UserSession userSession2 = this.A06;
        C309516Yo A0Q = DbU.A0Q(fragmentActivity2, userSession2);
        A0Q.A0A = "MONETIZATION_INBOX";
        A0Q.A0B((Bundle) null, C49904FEc.A01(userMonetizationProductType2, userSession2, "MONETIZATION_INBOX", str3, str2));
        A0Q.A04();
    }

    private final void A03(C47179Dru dru, C283155Gi r14) {
        UserSession userSession = this.A06;
        C46354Dcy.A01(userSession).A0I(this.A05, dru, r14, userSession.A06, (String) null, (String) null, (String) null, (String) null);
        r14.A0E();
        String str = r14.A04.A0s;
        if (str != null) {
            String str2 = r14.A09;
            0qQ.A07(str2);
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0A("business/branded_content/news/log/");
            A0a.A9m("action", "click");
            A0a.A9m("pk", str2);
            DbX.A1M(A0a, "tuuid", str);
            1ES.A03(A0a.A0M());
        }
    }

    private final void A04(C283155Gi r16) {
        C283155Gi r0 = r16;
        String A092 = r0.A09("media_id");
        String A093 = r0.A09("permission_id");
        if (A092 != null && A092.length() != 0) {
            Bundle A0C = DbV.A0C("media_id", A092);
            A0C.putString("permission_id", A093);
            A0C.putBoolean(AnonymousClass000.A00(785), false);
            C249713kF r3 = C249713kF.A00;
            UserSession userSession = this.A06;
            FragmentActivity fragmentActivity = this.A02;
            r3.A0i(A0C, fragmentActivity, userSession, C16509Uw6.FEATURED_PRODUCTS, (Integer) null, (String) null, fragmentActivity.getString(2131969659), A092, (String) null, (String) null, (String) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0049, code lost:
        if (r0 != null) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DPt(X.C47179Dru r25, X.C283155Gi r26, java.lang.String r27, int r28) {
        /*
            r24 = this;
            r8 = r28
            r5 = 0
            r9 = r27
            X.0qQ.A0B(r9, r5)
            r6 = 1
            r3 = r26
            int r2 = r3.A00
            java.lang.String r12 = "Required value was null."
            r14 = 0
            java.lang.String r7 = "bc_inbox"
            r4 = r24
            switch(r2) {
                case 195: goto L_0x01a5;
                case 198: goto L_0x0196;
                case 277: goto L_0x018d;
                case 281: goto L_0x018d;
                case 283: goto L_0x018d;
                case 432: goto L_0x0137;
                case 433: goto L_0x0137;
                case 436: goto L_0x01a5;
                case 526: goto L_0x0196;
                case 534: goto L_0x0196;
                case 537: goto L_0x01a5;
                case 558: goto L_0x012f;
                case 938: goto L_0x018d;
                default: goto L_0x0017;
            }
        L_0x0017:
            com.instagram.common.session.UserSession r13 = r4.A06
            X.G27 r1 = X.G27.A00
            java.lang.Class<X.FYY> r0 = X.FYY.class
            java.lang.Object r0 = r13.A01(r0, r1)
            X.FYY r0 = (X.FYY) r0
            java.util.Set r0 = r0.A00
            r0.add(r9)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.5Gj r0 = r3.A04
            java.lang.Boolean r0 = r0.A0O
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0167
            java.lang.String r2 = X.AnonymousClass3VO.A03(r9)
            X.5Gj r0 = r3.A04
            java.lang.String r1 = r0.A0i
            if (r1 == 0) goto L_0x004b
            java.lang.String r0 = "_"
            java.lang.String[] r1 = r1.split(r0)
            int r0 = r1.length
            if (r0 <= r6) goto L_0x004b
            r0 = r1[r6]
            if (r0 != 0) goto L_0x004c
        L_0x004b:
            r0 = r2
        L_0x004c:
            java.lang.String r1 = r3.A07()
            X.1OP r2 = X.1OP.$redex_init_class
            com.instagram.reels.store.ReelStore r2 = com.instagram.reels.store.ReelStore.A03(r13)
            X.0qQ.A07(r2)
            com.instagram.model.reels.Reel r2 = r2.A0M(r0)
            if (r2 == 0) goto L_0x00f0
            java.util.List r11 = r2.A0O(r13)
            X.0qQ.A07(r11)
            int r10 = r11.size()
            r9 = 0
        L_0x006b:
            if (r9 >= r10) goto L_0x00f0
            java.lang.Object r7 = r11.get(r9)
            X.3uh r7 = (X.C255773uh) r7
            java.lang.String r7 = r7.A0j
            boolean r7 = X.0qQ.A0K(r1, r7)
            if (r7 == 0) goto L_0x00ec
            X.2jx r9 = r4.A04
            androidx.recyclerview.widget.RecyclerView r0 = r9.getRecyclerView()
            X.3pI r7 = r0.A0D
            r0 = 7
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r7, r0)
            androidx.recyclerview.widget.LinearLayoutManager r7 = (androidx.recyclerview.widget.LinearLayoutManager) r7
            int r0 = r7.A1a()
            if (r8 < r0) goto L_0x00e6
            int r0 = r7.A1b()
            if (r8 > r0) goto L_0x00e6
            java.util.HashSet r5 = X.AnonymousClass7TE.A1F()
            r5.add(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r9.getRecyclerView()
            int r0 = r7.A1a()
            int r8 = r28 - r0
            android.view.View r1 = r1.getChildAt(r8)
            r0 = 2131440281(0x7f0b3299, float:1.850254E38)
            android.view.View r1 = X.AnonymousClass7TE.A0b(r1, r0)
            android.graphics.RectF r0 = X.0nA.A01
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            X.0nA.A0L(r0, r1)
            r4.A00 = r0
            androidx.fragment.app.FragmentActivity r0 = r4.A02
            X.3K2 r13 = X.1OP.A07(r0, r13)
            android.graphics.RectF r15 = r4.A00
            if (r15 == 0) goto L_0x01b4
            r0 = 2
            X.FkR r1 = new X.FkR
            r1.<init>(r0, r4, r2, r5)
            X.3BQ r18 = X.AnonymousClass3BQ.BRANDED_CONTENT
            X.0iw r0 = r4.A05
            r22 = -1
            r20 = r14
            r21 = r14
            r23 = r6
            r17 = r2
            r19 = r1
            r16 = r0
            r13.A0U(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x00e6:
            r0 = r25
            r4.A03(r0, r3)
            return
        L_0x00ec:
            int r9 = r9 + 1
            goto L_0x006b
        L_0x00f0:
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.HashSet r2 = X.C281945Ae.A01(r6)
            java.util.Collections.addAll(r2, r0)
            boolean r0 = r2.contains(r14)
            if (r0 != 0) goto L_0x00e6
            X.4DU r0 = r4.A07     // Catch:{ IOException -> 0x0122 }
            java.lang.String r1 = r0.getModuleName()     // Catch:{ IOException -> 0x0122 }
            r0 = 3
            X.0qQ.A0B(r1, r0)     // Catch:{ IOException -> 0x0122 }
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r5)     // Catch:{ IOException -> 0x0119 }
            r16 = r1
            r17 = r14
            r18 = r2
            X.1NP.A07(r13, r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x0119 }
            goto L_0x00e6
        L_0x0119:
            r2 = move-exception
            java.lang.String r1 = "ReelsPluginImpl"
            java.lang.String r0 = "Failed to run createSingleReelRequestTask()"
            X.0KC.A0G(r1, r0, r2)     // Catch:{ IOException -> 0x0122 }
            goto L_0x00e6
        L_0x0122:
            r2 = move-exception
            java.lang.String r1 = "MonetizationInboxRowDelegate"
            r0 = 98
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0KC.A0G(r1, r0, r2)
            goto L_0x00e6
        L_0x012f:
            androidx.fragment.app.FragmentActivity r1 = r4.A02
            com.instagram.common.session.UserSession r0 = r4.A06
            X.C49950FGf.A06(r1, r0, r7, r5)
            goto L_0x00e6
        L_0x0137:
            androidx.fragment.app.FragmentActivity r1 = r4.A02
            com.instagram.common.session.UserSession r0 = r4.A06
            X.6Yo r5 = X.DbS.A0M(r1, r0)
            com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            X.F3W r2 = new X.F3W
            r2.<init>()
            r2.A0B = r9
            r2.A0M = r6
            X.4DU r0 = r4.A07
            java.lang.String r0 = r0.getModuleName()
            r2.A0E = r0
            X.1sy r0 = X.1sy.A0W
            r2.A02 = r0
            X.2jx r0 = r4.A04
            android.content.Context r1 = r0.requireContext()
            r0 = 2131954192(0x7f130a10, float:1.9544876E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0I = r0
            goto L_0x0181
        L_0x0167:
            androidx.fragment.app.FragmentActivity r0 = r4.A02
            X.6Yo r5 = X.DbS.A0M(r0, r13)
            com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            X.F3W r2 = new X.F3W
            r2.<init>()
            r2.A0B = r9
            r2.A0M = r6
            X.4DU r0 = r4.A07
            java.lang.String r0 = r0.getModuleName()
            r2.A0E = r0
        L_0x0181:
            X.32F r0 = r2.A01()
            r5.A0B(r14, r0)
            r5.A04()
            goto L_0x00e6
        L_0x018d:
            androidx.fragment.app.FragmentActivity r1 = r4.A02
            com.instagram.common.session.UserSession r0 = r4.A06
            X.C49950FGf.A03(r1, r0, r9, r2)
            goto L_0x00e6
        L_0x0196:
            androidx.fragment.app.FragmentActivity r2 = r4.A02
            com.instagram.common.session.UserSession r1 = r4.A06
            X.5Gj r0 = r3.A04
            java.lang.String r0 = r0.A0f
            if (r0 == 0) goto L_0x01b9
            X.C49950FGf.A05(r2, r1, r7, r0, r6)
            goto L_0x00e6
        L_0x01a5:
            androidx.fragment.app.FragmentActivity r2 = r4.A02
            com.instagram.common.session.UserSession r1 = r4.A06
            X.5Gj r0 = r3.A04
            java.lang.String r0 = r0.A0f
            if (r0 == 0) goto L_0x01be
            X.C49950FGf.A05(r2, r1, r7, r0, r5)
            goto L_0x00e6
        L_0x01b4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x01b9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x01be:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50572Feh.DPt(X.Dru, X.5Gi, java.lang.String, int):void");
    }

    public final void Da5(RectF rectF, C47179Dru dru, C283155Gi r4, int i) {
        this.A08.Da5(rectF, dru, r4, i);
    }

    public /* synthetic */ C50572Feh(Context context, FragmentActivity fragmentActivity, C227812jx r22, AnonymousClass0iw r23, UserSession userSession, AnonymousClass4DU r25) {
        1a0 A032 = C46447Df9.A03();
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 3);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        this.A02 = fragmentActivity2;
        C227812jx r6 = r22;
        this.A04 = r6;
        this.A06 = userSession2;
        this.A01 = context;
        AnonymousClass0iw r7 = r23;
        this.A05 = r7;
        AnonymousClass4DU r9 = r25;
        this.A07 = r9;
        this.A09 = A032;
        0hq parentFragmentManager = r6.getParentFragmentManager();
        this.A03 = parentFragmentManager;
        C50584Fet fet = new C50584Fet();
        int i = C46521DgO.A0A;
        0wc A012 = AnonymousClass0kN.A01(r7, userSession2);
        C50582Fer fer = C50582Fer.A00;
        this.A08 = new Dd4(fragmentActivity2, parentFragmentManager, r6, r7, userSession2, r9, (G5x) null, fer, new C46521DgO(r6, r7, A012, userSession2, fer, fet), (C46522DgP) null);
    }

    public final void D4k(C47179Dru dru, C283155Gi r3, int i) {
        String A072 = r3.A07();
        if (A072 != null) {
            DPt(dru, r3, A072, i);
        }
    }

    public final void DPx(C47179Dru dru, C283155Gi r4, int i) {
        String str;
        C46518DgL A032 = r4.A03();
        if (A032 != null && (str = A032.A00) != null) {
            if (str.equals("featured_product_media")) {
                A04(r4);
                A03(dru, r4);
            } else if (str.equals("profile_tagged_posts")) {
                A01();
            } else if (str.equals("pending_tagged_posts")) {
                A00();
            }
        }
    }
}
