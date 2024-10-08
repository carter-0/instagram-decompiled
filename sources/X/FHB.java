package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.url.DeepLinkUtil$handlePromoteFlowDeepLink$1;
import com.instagram.url.DeepLinkUtil$handlePromoteFlowDeepLinkWithClientSpecOverride$1;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;

public abstract class FHB {
    public static final 0bY A00 = DbW.A0G();

    public static final Uri A00(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        if (!bundle.containsKey("destination_id") || !bundle.containsKey("encoded_query")) {
            return null;
        }
        Uri.Builder encodedQuery = DbW.A07(002.A0R("ig://", bundle.getString("destination_id"))).encodedQuery(bundle.getString("encoded_query"));
        encodedQuery.appendQueryParameter("dummy_param_random_uuid", AnonymousClass7TF.A0b());
        return encodedQuery.build();
    }

    public static final void A03(Activity activity, Bundle bundle) {
        0qQ.A0B(activity, 0);
        Intent A08 = DbX.A08(activity);
        Uri A002 = A00(bundle);
        if (A002 != null) {
            A08.setData(A002);
        }
        0kR.A0B(activity, A08);
        activity.finish();
    }

    public static final void A04(Activity activity, 0lg r5, 2EG r6, String str, String str2) {
        0lg r2 = r5;
        Activity activity2 = activity;
        AnonymousClass7TF.A1H(activity, r2);
        if (r2 instanceof UserSession) {
            SUL sul = new SUL(activity2, (UserSession) r2, r6, str, false);
            sul.A0S = str2;
            sul.A0A();
        }
    }

    public static final void A0C(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1T(userSession, fragmentActivity, bundle);
        String string = bundle.getString("media_id");
        if (string != null) {
            String A0l = DbS.A0l(bundle);
            if (A0l == null) {
                A0l = "eligiblity_awareness_megaphone_channel";
            }
            1Yh A002 = C18138VmE.A00();
            FUT fut = new FUT();
            A002.A00 = new C57016ILi(fragmentActivity, 4);
            AnonymousClass7TE.A1Z(new MGS(userSession2, fragmentActivity2, fut, A002, string, A0l, (AnonymousClass4D7) null, 0), DbW.A0E(fragmentActivity));
        }
    }

    public static final void A0E(FragmentActivity fragmentActivity, 0lg r12, HashMap hashMap) {
        FragmentActivity fragmentActivity2;
        FragmentActivity fragmentActivity3;
        AnonymousClass2ZQ A002 = C71172bH.A00();
        if (A002 != null) {
            A002.Eng(1QK.A0E);
        }
        0eE r0 = AnonymousClass0t1.A01;
        0lg r7 = r12;
        DbS.A1Z(r12);
        UserSession userSession = (UserSession) r7;
        User A01 = r0.A01(userSession);
        if (2Ek.A00(A01) || 2Ek.A01(A01)) {
            0qQ.A0B(r12, 0);
            02m.A0p.markerStart(962537714);
            AnonymousClass7TF.A0D().postDelayed(new C51169Fpf(r12), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
            FUU fuu = new FUU();
            HashMap hashMap2 = hashMap;
            if (182.A06(0Tu.A05, userSession, 36321005118956553L)) {
                hashMap.put("origin", 002.A0R((String) hashMap.getOrDefault("origin", ""), "_monarch"));
                C46649DiU A04 = C46649DiU.A04(AnonymousClass000.A00(4617), hashMap);
                if (A002 == null) {
                    fragmentActivity3 = fragmentActivity;
                } else {
                    fragmentActivity3 = (Context) A002;
                }
                IgBloksScreenConfig A0N = DbS.A0N(r12);
                DbS.A18(fragmentActivity, A0N, 2131969884);
                C46649DiU.A07(fragmentActivity3, A0N, A04);
            } else {
                if (A002 == null) {
                    fragmentActivity2 = fragmentActivity;
                } else {
                    fragmentActivity2 = (FragmentActivity) A002;
                }
                A0D(fragmentActivity2, fuu, r7, "com.instagram.pro_home.action", "ProfessionalDashboard", hashMap2);
            }
            if (A002 == null) {
                0hq A0F = DbT.A0F(fragmentActivity);
                A0F.A0s(new FQk(2, fragmentActivity, A0F));
                return;
            }
        }
        fragmentActivity.finish();
    }

    public static final void A0F(FragmentActivity fragmentActivity, 0lg r4, boolean z) {
        0qQ.A0B(fragmentActivity, 0);
        DbY.A0s();
        C46447Df9.A03();
        E71 e71 = new E71();
        e71.setArguments(DbX.A0B("quick_promotion"));
        C309516Yo A0M = DbV.A0M(e71, fragmentActivity, r4);
        if (!z) {
            A0M.A0D = false;
        }
        A0M.A04();
    }

    public static final C20581Wuz A01() {
        C269474fB r3 = C269474fB.A00;
        C268194cw r2 = new C268194cw(r3);
        r2.A0E("entrypoint", "ad_topics_settings_phase_1");
        r2.A0E("node_identifier", "ad_topics");
        return new C20581Wuz(DbX.A0L(r2, r3), 4);
    }

    public static final void A06(Bundle bundle, FragmentActivity fragmentActivity, 0lg r4) {
        if (r4 instanceof UserSession) {
            DbU.A1D(bundle, (UserSession) r4);
            C227232is r1 = new C227232is();
            boolean z = bundle.getBoolean("InstagramUrlLaunchConstants.EXTRA_SHOULD_INCLUDE_BACK_STACK");
            C309516Yo A0P = DbU.A0P(bundle, r1, fragmentActivity, r4);
            if (!z) {
                A0P.A0D = false;
            }
            A0P.A04();
            return;
        }
        FFQ.A01(fragmentActivity, bundle, r4);
    }

    public static final void A08(Bundle bundle, FragmentActivity fragmentActivity, 0lg r4) {
        if (r4 instanceof UserSession) {
            C54174H1u h1u = new C54174H1u();
            DbU.A1D(bundle, (UserSession) r4);
            h1u.setArguments(bundle);
            boolean z = bundle.getBoolean("InstagramUrlLaunchConstants.EXTRA_SHOULD_INCLUDE_BACK_STACK");
            C309516Yo A0M = DbV.A0M(h1u, fragmentActivity, r4);
            if (!z) {
                A0M.A0D = false;
            }
            A0M.A04();
            return;
        }
        FFQ.A01(fragmentActivity, bundle, r4);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.0rm, java.lang.Object] */
    public static final void A09(Bundle bundle, FragmentActivity fragmentActivity, 0lg r29) {
        String A0l;
        AnonymousClass0xx A0E;
        0sL deepLinkUtil$handlePromoteFlowDeepLink$1;
        String str;
        int i;
        int i2;
        Bundle bundle2 = bundle;
        0lg r17 = r29;
        AnonymousClass7TG.A1O(fragmentActivity, bundle2);
        String string = bundle2.getString("media_id");
        boolean z = bundle2.getBoolean("is_client_spec_override");
        DbS.A1Z(r17);
        UserSession userSession = (UserSession) r17;
        UserSession userSession2 = userSession;
        if (z) {
            if (string != null) {
                String string2 = bundle2.getString("objective");
                String string3 = bundle2.getString(TraceFieldType.Duration);
                String string4 = bundle2.getString("budget");
                ? obj = new Object();
                String A0l2 = DbS.A0l(bundle2);
                obj.A00 = A0l2;
                if (A0l2 == null || A0l2.length() == 0) {
                    obj.A00 = "DEEP_LINK_UNKNOWN";
                }
                if (string4 != null) {
                    i = Integer.parseInt(string4);
                } else {
                    i = 0;
                }
                if (string3 != null) {
                    i2 = Integer.parseInt(string3);
                } else {
                    i2 = 0;
                }
                A0E = DbW.A0E(fragmentActivity);
                FragmentActivity fragmentActivity2 = fragmentActivity;
                deepLinkUtil$handlePromoteFlowDeepLink$1 = new DeepLinkUtil$handlePromoteFlowDeepLinkWithClientSpecOverride$1(fragmentActivity2, userSession2, string, string2, (AnonymousClass4D7) null, obj, i, i2);
            }
            0qQ.A0B(userSession, 0);
            String string5 = bundle2.getString("coupon_offer_id");
            boolean z2 = bundle2.getBoolean(AnonymousClass000.A00(81), false);
            boolean z3 = bundle2.getBoolean(AnonymousClass000.A00(672), false);
            boolean z4 = bundle2.getBoolean("is_cta_ctwa_aymt", false);
            A0l = DbS.A0l(bundle2);
            if (A0l == null || A0l.length() == 0) {
                A0l = "DEEP_LINK_UNKNOWN";
            }
            boolean z5 = bundle2.getBoolean("has_relaunched_from_main_activity", false);
            if ((fragmentActivity instanceof AnonymousClass2ZQ) || !z5) {
                C18138VmE.A00().A0A(fragmentActivity, userSession2, A0l, string5, z2, z3, z4);
                return;
            }
            fragmentActivity.finish();
            return;
        }
        if (string != null) {
            String string6 = bundle2.getString("coupon_offer_id");
            String string7 = bundle2.getString("objective");
            boolean z6 = bundle2.getBoolean("is_cta_ctwa_aymt");
            String A002 = AnonymousClass000.A00(672);
            boolean z7 = bundle2.getBoolean(A002);
            boolean z8 = bundle2.getBoolean("is_cta_lead_ads_aymt");
            String string8 = bundle2.getString("aymt_channel");
            ? obj2 = new Object();
            obj2.A00 = bundle2.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            String string9 = bundle2.getString("referral_code");
            CharSequence charSequence = (CharSequence) obj2.A00;
            if (charSequence == null || charSequence.length() == 0) {
                if (string9 == null || string9.length() == 0) {
                    str = "DEEP_LINK_UNKNOWN";
                } else {
                    str = AnonymousClass000.A00(4516);
                }
                obj2.A00 = str;
            }
            boolean z9 = bundle2.getBoolean("has_relaunched_from_main_activity", false);
            if (fragmentActivity instanceof AnonymousClass2ZQ) {
                A0E = DbW.A0E(fragmentActivity);
                FragmentActivity fragmentActivity3 = fragmentActivity;
                deepLinkUtil$handlePromoteFlowDeepLink$1 = new DeepLinkUtil$handlePromoteFlowDeepLink$1(fragmentActivity3, userSession2, string, string6, string7, string8, string9, (AnonymousClass4D7) null, obj2, z7, z8, z6);
            } else {
                if (!z9) {
                    Uri.Builder authority = new Uri.Builder().scheme("instagram").authority("promote");
                    authority.appendQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, (String) obj2.A00);
                    authority.appendQueryParameter("media_id", string);
                    if (string6 != null) {
                        authority.appendQueryParameter("coupon_offer_id", string6);
                    }
                    if (string7 != null) {
                        authority.appendQueryParameter("objective", string7);
                    }
                    String str2 = "false";
                    String str3 = str2;
                    if (z6) {
                        str3 = "true";
                    }
                    authority.appendQueryParameter("is_cta_ctwa_aymt", str3);
                    if (z7) {
                        str2 = "true";
                    }
                    authority.appendQueryParameter(A002, str2);
                    if (string8 != null) {
                        authority.appendQueryParameter("aymt_channel", string8);
                    }
                    if (string9 != null) {
                        authority.appendQueryParameter("referral_code", string9);
                    }
                    authority.appendQueryParameter("has_relaunched_from_main_activity", "true");
                    Dbc.A0I(fragmentActivity, authority);
                }
                fragmentActivity.finish();
                return;
            }
        }
        0qQ.A0B(userSession, 0);
        String string52 = bundle2.getString("coupon_offer_id");
        boolean z22 = bundle2.getBoolean(AnonymousClass000.A00(81), false);
        boolean z32 = bundle2.getBoolean(AnonymousClass000.A00(672), false);
        boolean z42 = bundle2.getBoolean("is_cta_ctwa_aymt", false);
        A0l = DbS.A0l(bundle2);
        A0l = "DEEP_LINK_UNKNOWN";
        boolean z52 = bundle2.getBoolean("has_relaunched_from_main_activity", false);
        C18138VmE.A00().A0A(fragmentActivity, userSession2, A0l, string52, z22, z32, z42);
        return;
        AnonymousClass7TE.A1Z(deepLinkUtil$handlePromoteFlowDeepLink$1, A0E);
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x01a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0A(android.os.Bundle r22, androidx.fragment.app.FragmentActivity r23, X.0lg r24) {
        /*
            r21 = 0
            r20 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            r5 = r23
            r4 = r24
            boolean r10 = X.AnonymousClass7TF.A1U(r7, r4, r5)
            r11 = 2
            X.Dc1 r3 = X.GAH.A00(r4)
            java.lang.String r2 = "destination"
            java.lang.String r1 = "profile"
            X.0qQ.A0B(r1, r10)
            X.Dc0 r0 = r3.A00
            r0.A0J(r2, r1)
            java.lang.String r1 = "original_url"
            r6 = r22
            boolean r0 = r6.containsKey(r1)
            if (r0 == 0) goto L_0x01ef
            java.lang.String r14 = r6.getString(r1)
            if (r14 == 0) goto L_0x01f0
            X.0bY r0 = A00
            r1 = 1
            android.net.Uri r2 = X.0cp.A01(r0, r14)
            if (r2 == 0) goto L_0x01f0
            java.lang.String r0 = "utm_source"
            java.lang.String r12 = r2.getQueryParameter(r0)
            java.lang.String r0 = "qr"
            boolean r15 = r0.equals(r12)
            java.lang.String r0 = "upcoming_event_id"
            java.lang.String r13 = r2.getQueryParameter(r0)
            r19 = 0
            r0 = 0
            if (r13 == 0) goto L_0x0074
            java.lang.String r8 = "upcoming_event_name"
            java.lang.String r9 = r2.getQueryParameter(r8)
            java.lang.String r8 = "upcoming_event_start_time"
            java.lang.String r8 = r2.getQueryParameter(r8)
            if (r8 == 0) goto L_0x01ec
            java.lang.Long r8 = X.AnonymousClass7TE.A10(r8)
        L_0x0062:
            java.lang.String r12 = "upcoming_event_end_time"
            java.lang.String r12 = r2.getQueryParameter(r12)
            if (r12 == 0) goto L_0x006e
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r12)
        L_0x006e:
            r20 = r13
            r21 = r0
            r19 = 1
        L_0x0074:
            java.lang.String r12 = "extra"
            java.lang.String r13 = r2.getQueryParameter(r12)
            java.lang.String r0 = "subscribe"
            boolean r13 = r0.equals(r13)
            java.lang.String r12 = r2.getQueryParameter(r12)
            java.lang.String r0 = "show_follow_dialog"
            boolean r18 = r0.equals(r12)
            java.lang.String r0 = "follow_dialog_type"
            java.lang.String r17 = r2.getQueryParameter(r0)
            int r0 = X.DbV.A03(r2)
            if (r0 < r11) goto L_0x00a6
            java.util.List r0 = r2.getPathSegments()
            java.lang.Object r11 = r0.get(r10)
            java.lang.String r0 = "profilecard"
            boolean r0 = X.0qQ.A0K(r11, r0)
            if (r0 != 0) goto L_0x00bc
        L_0x00a6:
            int r0 = X.DbV.A03(r2)
            if (r0 < r10) goto L_0x01e9
            java.util.List r0 = r2.getPathSegments()
            java.lang.Object r2 = r0.get(r7)
            java.lang.String r0 = "myprofilecard"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x01e9
        L_0x00bc:
            boolean r0 = r4 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x01fb
            r3 = r4
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.String r2 = "InstagramUrlLaunchConstants.EXTRA_AUTO_LAUNCH_REEL_PARAMS"
            boolean r0 = r6.containsKey(r2)
            if (r0 == 0) goto L_0x01e6
            android.os.Parcelable r12 = r6.getParcelable(r2)
            com.instagram.profile.intf.AutoLaunchReelParams r12 = (com.instagram.profile.intf.AutoLaunchReelParams) r12
        L_0x00d1:
            java.lang.String r0 = "InstagramUrlLaunchConstants.EXTRA_STARTING_TAB"
            java.lang.String r10 = r6.getString(r0)
            java.lang.String r0 = "InstagramUrlLaunchConstants.EXTRA_USER_OPEN_CREATION_SHEET"
            boolean r16 = r6.getBoolean(r0, r7)
            java.lang.String r0 = "InstagramUrlLaunchConstants.EXTRA_USER_NAME"
            boolean r2 = r6.containsKey(r0)
            java.lang.String r11 = "deep_link"
            if (r2 == 0) goto L_0x01af
            java.lang.String r2 = r6.getString(r0)
            X.C320236s2.A03(r6, r2, r0)
            java.lang.String r0 = "deep_link_util"
            X.Dfc r2 = X.C46548Dgp.A02(r3, r2, r11, r0)
            r2.A02 = r12
            r2.A0d = r15
            r0 = r16
            r2.A0f = r0
            r2.A0h = r13
            r2.A0g = r1
            if (r1 == 0) goto L_0x0111
            X.0Tu r12 = X.DbS.A0J(r3, r7)
            r0 = 36327426095135143(0x810f9a000139a7, double:3.0369487691426403E-306)
            boolean r0 = X.182.A06(r12, r3, r0)
            if (r0 != 0) goto L_0x0112
        L_0x0111:
            r14 = 0
        L_0x0112:
            r2.A0F = r14
            if (r13 == 0) goto L_0x01ac
            java.util.Set r0 = X.C49280EsP.A00
        L_0x0118:
            r2.A0C = r11
            r0 = r18
            r2.A0k = r0
            r0 = r17
            r2.A0I = r0
        L_0x0122:
            if (r10 == 0) goto L_0x0126
            r2.A0O = r10
        L_0x0126:
            if (r19 == 0) goto L_0x0134
            r0 = r20
            r2.A0P = r0
            r2.A0Q = r9
            r2.A07 = r8
            r0 = r21
            r2.A06 = r0
        L_0x0134:
            r0 = 33
            java.lang.String r0 = X.Pxd.A00(r0)
            android.os.Parcelable r9 = r6.getParcelable(r0)
            android.content.Intent r9 = (android.content.Intent) r9
            X.0cS r1 = new X.0cS
            r1.<init>()
            java.util.Set r0 = X.AnonymousClass0PK.A0f
            X.0Pj r0 = X.0cQ.A02(r0)
            r1.A01 = r0
            X.0cT r1 = r1.A00()
            r0 = 0
            boolean r0 = r1.A03(r5, r9, r0)
            if (r0 == 0) goto L_0x018c
            if (r9 == 0) goto L_0x018c
            java.lang.String r8 = "CrossAppFollowUtils.EXTRA_AUTO_FOLLOW"
            boolean r0 = r9.hasExtra(r8)
            if (r0 == 0) goto L_0x018c
            boolean r0 = r9.getBooleanExtra(r8, r7)
            if (r0 == 0) goto L_0x018c
            java.lang.String r0 = "xar_cross_app_auto_follow"
            r2.A0B = r0
            r1 = 0
            boolean r0 = r9.hasExtra(r8)
            if (r0 == 0) goto L_0x0177
            boolean r1 = r9.getBooleanExtra(r8, r7)
        L_0x0177:
            r2.A0e = r1
            java.lang.String r8 = ""
            java.lang.String r1 = "CrossAppFollowUtils.EXTRA_AUTO_FOLLOW_ATTRIBUTION_POST_ID"
            boolean r0 = r9.hasExtra(r1)
            if (r0 == 0) goto L_0x018a
            java.lang.String r0 = r9.getStringExtra(r1)
            if (r0 == 0) goto L_0x018a
            r8 = r0
        L_0x018a:
            r2.A0A = r8
        L_0x018c:
            androidx.fragment.app.Fragment r2 = X.C46447Df9.A00(r3, r2)
            android.os.Bundle r0 = X.DbY.A08(r2)
            X.DbU.A1D(r0, r3)
            r2.setArguments(r0)
            java.lang.String r0 = "InstagramUrlLaunchConstants.EXTRA_SHOULD_INCLUDE_BACK_STACK"
            boolean r1 = r6.getBoolean(r0)
            X.6Yo r0 = X.DbV.A0M(r2, r5, r4)
            if (r1 != 0) goto L_0x01a8
            r0.A0D = r7
        L_0x01a8:
            r0.A04()
            return
        L_0x01ac:
            r11 = 0
            goto L_0x0118
        L_0x01af:
            java.lang.String r1 = "InstagramUrlLaunchConstants.EXTRA_USER_ID"
            boolean r0 = r6.containsKey(r1)
            if (r0 == 0) goto L_0x01cd
            java.lang.String r1 = r6.getString(r1)
            java.lang.String r0 = "deep_link_util"
            X.Dfc r2 = X.C46548Dgp.A01(r3, r1, r11, r0)
            r2.A02 = r12
            r2.A0l = r7
            r2.A0d = r15
            r0 = r16
            r2.A0f = r0
            goto L_0x0122
        L_0x01cd:
            java.lang.String r0 = "deep_link_util"
            X.Dfc r2 = X.C46548Dgp.A00(r3, r11, r0)
            if (r10 == 0) goto L_0x01d7
            r2.A0O = r10
        L_0x01d7:
            if (r19 == 0) goto L_0x018c
            r0 = r20
            r2.A0P = r0
            r2.A0Q = r9
            r2.A07 = r8
            r0 = r21
            r2.A06 = r0
            goto L_0x018c
        L_0x01e6:
            r12 = 0
            goto L_0x00d1
        L_0x01e9:
            r1 = 0
            goto L_0x00bc
        L_0x01ec:
            r8 = r0
            goto L_0x0062
        L_0x01ef:
            r14 = 0
        L_0x01f0:
            r1 = 0
            r15 = 0
            r19 = 0
            r18 = 0
            r13 = 0
            r17 = 0
            goto L_0x00bc
        L_0x01fb:
            java.lang.String r0 = "signed out"
            r3.A02(r0)
            X.FFQ.A01(r5, r6, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FHB.A0A(android.os.Bundle, androidx.fragment.app.FragmentActivity, X.0lg):void");
    }

    public static final void A02(Activity activity, Uri uri, 0lg r4, String str) {
        AnonymousClass7TG.A1N(activity, r4);
        Intent makeMainSelectorActivity = Intent.makeMainSelectorActivity(AnonymousClass000.A00(129), "android.intent.category.APP_BROWSER");
        makeMainSelectorActivity.setData(uri);
        if (!0kR.A0D(activity, makeMainSelectorActivity)) {
            A04(activity, r4, 2EG.A1S, uri.toString(), str);
        }
    }

    public static final void A05(Context context, String str) {
        boolean A1Z = AnonymousClass7TG.A1Z(context, str);
        Intent A04 = DbT.A0e().A04(context, DbT.A09(str));
        A04.putExtra(C66579MXk.A00(3), A1Z);
        0kR.A0B(context, A04);
    }

    public static final void A07(Bundle bundle, FragmentActivity fragmentActivity, 0lg r13) {
        String str;
        AnonymousClass7TG.A1T(r13, fragmentActivity, bundle);
        String string = bundle.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        String string2 = bundle.getString("dummy_param_random_uuid");
        boolean z = bundle.getBoolean("should_show_promotion_content");
        String string3 = bundle.getString("media_id");
        if (string == null || string.length() == 0) {
            string = "deep_link";
        }
        C322576w3.A00().A01();
        Bundle A0C = DbV.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, string);
        A0C.putString("media_id", string3);
        A0C.putBoolean("should_show_promotion_content", z);
        C47482E4h e4h = new C47482E4h();
        e4h.setArguments(A0C);
        DbU.A1D(e4h.requireArguments(), (UserSession) r13);
        if (fragmentActivity instanceof AnonymousClass2ZQ) {
            ((AnonymousClass2ZQ) fragmentActivity).Eng(1QK.A0E);
            DbY.A14(e4h, fragmentActivity, r13);
            return;
        }
        if (string2 == null) {
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("instagram").authority("pro_inspiration").appendQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, string);
            if (z) {
                str = "true";
            } else {
                str = "false";
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("should_show_promotion_content", str);
            if (string3 != null) {
                appendQueryParameter2.appendQueryParameter("media_id", string3);
            }
            appendQueryParameter2.appendQueryParameter("dummy_param_random_uuid", AnonymousClass7TF.A0b());
            Dbc.A0I(fragmentActivity, appendQueryParameter2);
        }
        fragmentActivity.finish();
    }

    public static final void A0B(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession) {
        AnonymousClass7TG.A1T(fragmentActivity, userSession, bundle);
        String string = bundle.getString("media_id");
        if (string != null) {
            C322576w3.A00().A01();
            K54 k54 = new K54();
            k54.setArguments(DbV.A0C("media_id", string));
            DbY.A14(k54, fragmentActivity, userSession);
        }
    }

    public static final void A0D(FragmentActivity fragmentActivity, AnonymousClass0iw r2, 0lg r3, String str, String str2, Map map) {
        AnonymousClass7TG.A1N(fragmentActivity, r3);
        0qQ.A0B(str2, 5);
        A0G(DbT.A0N(fragmentActivity, r2, r3), r3, str, str2, map);
    }

    public static final void A0G(C229382nI r2, 0lg r3, String str, String str2, Map map) {
        C360678ey A05 = C359988do.A05(r3, str, map);
        A05.A00(new C47560E7y(r2, r3, str, str2, map));
        1ES.A03(A05);
    }
}
