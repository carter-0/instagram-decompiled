package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.text.style.TextAppearanceSpan;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceEventType;
import com.instagram.android.R;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.CreatorShoppingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* renamed from: X.6zN  reason: invalid class name and case insensitive filesystem */
public abstract class C324476zN {
    public static final List A00 = 0sr.A1P(new String[]{"instagram_shopping_related_posts_grid", "rtc_call", "guide_add_items"});

    public static final int A00(Context context) {
        0qQ.A0B(context, 1);
        if ("".length() > 0) {
            return Color.parseColor("");
        }
        return context.getColor(R.color.default_cta_dominant_color);
    }

    public static final SpannableString A01(Context context, Product product, int i, int i2) {
        int ordinal;
        int i3;
        0qQ.A0B(context, 1);
        ProductReviewStatus productReviewStatus = product.A05;
        if (productReviewStatus == null) {
            ordinal = -1;
        } else {
            ordinal = productReviewStatus.ordinal();
        }
        String str = "";
        if (ordinal != 1) {
            if (ordinal == 4) {
                i3 = 2131969863;
            } else if (ordinal == 5) {
                i3 = 2131969864;
            }
            str = context.getString(i3);
            0qQ.A0A(str);
        }
        if (productReviewStatus != ProductReviewStatus.PENDING) {
            i = i2;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new TextAppearanceSpan(context, i), 0, spannableString.length(), 33);
        return spannableString;
    }

    public static final SpannableStringBuilder A02(Context context, UserSession userSession, String str, boolean z) {
        0qQ.A0B(userSession, 3);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append("(").append(str).append(")");
        spannableStringBuilder.setSpan(new TextAppearanceSpan(context, R.style.FullPriceSubtitleStyle), 0, spannableStringBuilder.length(), 33);
        if (z) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), 0, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.text.SpannableStringBuilder A04(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = 0
            int r1 = A00(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0076
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r7)
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            r2.<init>(r1)
            int r1 = r3.length()
            r0 = 33
            r3.setSpan(r2, r5, r1, r0)
        L_0x001e:
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r3)
            r0 = 2132018041(0x7f140379, float:1.9674377E38)
            android.text.style.TextAppearanceSpan r1 = new android.text.style.TextAppearanceSpan
            r1.<init>(r6, r0)
            int r0 = r4.length()
            r2 = 33
            r4.setSpan(r1, r5, r0, r2)
            r0 = 2132018145(0x7f1403e1, float:1.9674588E38)
            android.text.style.TextAppearanceSpan r1 = new android.text.style.TextAppearanceSpan
            r1.<init>(r6, r0)
            int r0 = r4.length()
            r4.setSpan(r1, r5, r0, r2)
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r8)
            android.text.style.StrikethroughSpan r1 = new android.text.style.StrikethroughSpan
            r1.<init>()
            int r0 = r3.length()
            r3.setSpan(r1, r5, r0, r2)
            r0 = 2132018209(0x7f140421, float:1.9674718E38)
            android.text.style.TextAppearanceSpan r1 = new android.text.style.TextAppearanceSpan
            r1.<init>(r6, r0)
            int r0 = r3.length()
            r3.setSpan(r1, r5, r0, r2)
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>()
            android.text.SpannableStringBuilder r1 = r2.append(r4)
            java.lang.String r0 = " "
            android.text.SpannableStringBuilder r0 = r1.append(r0)
            r0.append(r3)
            return r2
        L_0x0076:
            r3 = r7
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C324476zN.A04(android.content.Context, java.lang.String, java.lang.String):android.text.SpannableStringBuilder");
    }

    public static final User A07(UserSession userSession, User user) {
        List list;
        0qQ.A0B(userSession, 1);
        if (A0T(userSession, user)) {
            return null;
        }
        CreatorShoppingInfo Asf = user.A03.Asf();
        if (Asf != null) {
            list = Asf.BN1();
        } else {
            list = null;
        }
        Integer A0A = A0A(userSession, user);
        if (AnonymousClass05K.A00 == A0A || AnonymousClass05K.A0C == A0A) {
            return user;
        }
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        return (User) 00k.A0J(list);
    }

    public static final Integer A0A(UserSession userSession, User user) {
        List B0k;
        List BN1;
        0qQ.A0B(userSession, 1);
        if (!user.A1b()) {
            if (user.A1j()) {
                return AnonymousClass05K.A00;
            }
            CreatorShoppingInfo Asf = user.A03.Asf();
            if (Asf != null && (BN1 = Asf.BN1()) != null && (!BN1.isEmpty())) {
                return AnonymousClass05K.A01;
            }
            if (2R8.A04(userSession, user) && (B0k = 0eE.A00(userSession).A00().A03.B0k()) != null && B0k.contains("ADD_SHOP")) {
                return AnonymousClass05K.A0N;
            }
            if (2R8.A04(userSession, user) && user.CPm() && VH4.A00(userSession)) {
                return AnonymousClass05K.A0C;
            }
        }
        return AnonymousClass05K.A0Y;
    }

    public static final void A0B(Fragment fragment, UserSession userSession, EXF exf, String str, boolean z) {
        if ((fragment instanceof AnonymousClass36P) && fragment.getContext() != null) {
            Context context = fragment.getContext();
            AnonymousClass36P r3 = (AnonymousClass36P) fragment;
            0qQ.A0B(r3, 1);
            if (context != null) {
                AnonymousClass36R.A00(context, userSession, r3).Ewb(exf, AnonymousClass36W.FOLLOWERS_SHARE);
                if (z) {
                    AnonymousClass6SR.A01().A0X = true;
                }
                AnonymousClass6SR.A01().A0D = str;
            }
        }
    }

    public static final void A0C(FragmentActivity fragmentActivity, UserSession userSession, User user, String str, String str2, boolean z) {
        String str3;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        String str4 = str;
        0qQ.A0B(str, 2);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        0qQ.A0B(fragmentActivity, 4);
        User user2 = user;
        C270004g2 ApU = user.A03.ApU();
        if (ApU == null || (str3 = ApU.BVU()) == null) {
            str3 = "";
        }
        F1Y f1y = C49314Esx.A01;
        f1y.A00();
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        AnonymousClass0xN A002 = C60510iO.A00(userSession2);
        0xI A01 = 0xI.A01("instagram_shopping_cis_onboarding_click_entry_point", str4);
        String str5 = str2;
        A01.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        A01.A0C("waterfall_id", obj);
        A002.EFq(A01);
        if (z) {
            C249713kF.A00.A14(fragmentActivity2, userSession2, user2, str3, str4, str5, obj);
            return;
        }
        C309516Yo r3 = new C309516Yo(fragmentActivity2, userSession2);
        r3.A0F = true;
        C249713kF.A00.A0T();
        HashMap hashMap = new HashMap();
        hashMap.put("prior_module", str4);
        hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        f1y.A00();
        hashMap.put("waterfall_id", obj);
        hashMap.put("presentation_style", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        C46649DiU A04 = C46649DiU.A04("com.bloks.www.bloks.commerce.integrity.system.entrypoint", hashMap);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession2);
        igBloksScreenConfig.A0U = str3;
        r3.A0D(C49891FBs.A02(igBloksScreenConfig, A04));
        r3.A0A = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        r3.A04();
    }

    public static final void A0D(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        C309516Yo r3 = new C309516Yo(fragmentActivity, userSession);
        C46649DiU A04 = C46649DiU.A04("com.bloks.www.bloks.commerce.order_summary", hashMap);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
        igBloksScreenConfig.A0U = fragmentActivity.getString(2131953924);
        igBloksScreenConfig.A0l = true;
        r3.A0D(C49891FBs.A02(igBloksScreenConfig, A04));
        r3.A0D = false;
        r3.A04();
    }

    public static final void A0E(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        0qQ.A0B(fragmentActivity, 1);
        R8S A05 = A05(userSession, fragmentActivity.getString(2131964514), str);
        if (A05 != null) {
            C309516Yo r0 = new C309516Yo(fragmentActivity, userSession);
            r0.A0D(A05);
            r0.A04();
        }
    }

    public static final void A0F(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        0qQ.A0B(fragmentActivity, 1);
        Bundle bundle = new Bundle();
        bundle.putString("invoice_id", str);
        1WM.getInstance();
        T8B t8b = new T8B(userSession, "IgOrderReturnDetailsApp");
        t8b.A07 = fragmentActivity.getString(2131972374);
        t8b.A00(bundle);
        t8b.F08(fragmentActivity).A04();
    }

    public static final void A0G(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        C309516Yo r3 = new C309516Yo(fragmentActivity, userSession);
        C46649DiU A04 = C46649DiU.A04("com.bloks.www.bloks.commerce.checkout.update_payment_method", hashMap);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
        igBloksScreenConfig.A0U = fragmentActivity.getString(2131976068);
        igBloksScreenConfig.A0l = true;
        r3.A0D(C49891FBs.A02(igBloksScreenConfig, A04));
        r3.A0D = false;
        r3.A04();
    }

    public static final void A0H(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        0qQ.A0B(fragmentActivity, 3);
        C49314Esx.A01.A00();
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        if (userSession != null) {
            C309516Yo r3 = new C309516Yo(fragmentActivity, userSession);
            r3.A0F = true;
            C249713kF.A00.A0T();
            String string = fragmentActivity.getString(2131973752);
            0qQ.A07(string);
            C269474fB r5 = C269474fB.A00;
            C268194cw r2 = new C268194cw(r5);
            if (str == null) {
                str = "";
            }
            r2.A0E(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            r2.A0E("waterfall_id", obj);
            if (str2 == null) {
                str2 = "";
            }
            r2.A0E("prior_module", str2);
            C268194cw r1 = new C268194cw(r5);
            r1.A0B(r2, AnonymousClass000.A00(187));
            HashMap hashMap = new HashMap();
            hashMap.put("params", r1.toString());
            C46649DiU A04 = C46649DiU.A04("com.bloks.www.bloks.commerce.onboarding.adscredit.progress", hashMap);
            IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
            igBloksScreenConfig.A0U = string;
            r3.A0D(C49891FBs.A02(igBloksScreenConfig, A04));
            r3.A0A = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            r3.A04();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r15.length() == 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0K(androidx.fragment.app.FragmentActivity r13, com.instagram.common.session.UserSession r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            r0 = 0
            r3 = r14
            X.0qQ.A0B(r14, r0)
            r0 = 1
            X.0qQ.A0B(r13, r0)
            java.lang.String r4 = X.C2818159r.A01()
            r6 = r15
            if (r15 == 0) goto L_0x0017
            int r1 = r15.length()
            r0 = 0
            if (r1 != 0) goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            r12 = r0 ^ 1
            r7 = 0
            java.lang.String r5 = "orders_hub"
            r9 = r16
            r10 = r17
            r11 = r18
            r8 = r7
            X.C49147EqE.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r0 = "referrer_surface"
            r1.put(r0, r15)
            r0 = 14
            java.lang.String r0 = X.Pxd.A00(r0)
            r1.put(r0, r4)
            java.lang.String r0 = "additional_logging_data"
            r1.put(r0, r9)
            X.6Yo r2 = new X.6Yo
            r2.<init>(r13, r14)
            java.lang.String r0 = "com.bloks.www.fbpay.hub_landing"
            X.DiU r1 = X.C46649DiU.A04(r0, r1)
            r0 = 110176278(0x6912816, float:5.460184E-35)
            r1.A00 = r0
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r0.<init>((X.0lg) r14)
            X.3M3 r0 = X.C49891FBs.A02(r0, r1)
            r2.A0B(r7, r0)
            r0 = 0
            r2.A0D = r0
            r2.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C324476zN.A0K(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final void A0L(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        HashMap hashMap = new HashMap();
        hashMap.put("product_id", str);
        hashMap.put("merchant_id", str2);
        hashMap.put("seeded_star_index", str3);
        hashMap.put("survey_entry_point", str4);
        hashMap.put(AnonymousClass000.A00(3867), str5);
        C309516Yo r3 = new C309516Yo(fragmentActivity, userSession);
        C46649DiU A04 = C46649DiU.A04("com.bloks.www.bk.commerce.ratings_and_reviews.product.composer", hashMap);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
        igBloksScreenConfig.A0U = fragmentActivity.getString(2131953920);
        igBloksScreenConfig.A0l = false;
        igBloksScreenConfig.A0S = "shops_rr_product_composer";
        r3.A0D(C49891FBs.A02(igBloksScreenConfig, A04));
        r3.A0D = false;
        r3.A04();
    }

    public static final void A0M(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(fragmentActivity, 3);
        C49314Esx.A01.A00();
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        C309516Yo r2 = new C309516Yo(fragmentActivity, userSession);
        r2.A0F = true;
        C249713kF.A00.A0T();
        String string = fragmentActivity.getString(2131964217);
        0qQ.A07(string);
        HashMap hashMap = new HashMap();
        hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        hashMap.put("waterfall_id", obj);
        hashMap.put("prior_module", str);
        hashMap.put(C66579MXk.A00(109), str3);
        hashMap.put(AnonymousClass000.A00(2742), str4);
        hashMap.put("banhammer_state", str5);
        hashMap.put("banhammer_action_date", str6);
        C46649DiU A04 = C46649DiU.A04("com.instagram.shopping.screens.banhammer", hashMap);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
        igBloksScreenConfig.A0U = string;
        r2.A0D(C49891FBs.A02(igBloksScreenConfig, A04));
        r2.A0A = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        r2.A04();
    }

    public static final void A0N(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(fragmentActivity, 1);
        String A01 = C2818159r.A01();
        HashMap hashMap = new HashMap();
        String str7 = str;
        hashMap.put("order_id", str7);
        String str8 = str2;
        hashMap.put("referrer_surface", str8);
        String str9 = str3;
        hashMap.put("order_item_ids", str9);
        hashMap.put("orders_hub_session_id", A01);
        String str10 = str4;
        hashMap.put("additional_logging_data", str10);
        String str11 = str5;
        hashMap.put(AnonymousClass000.A00(4692), str11);
        boolean z = true;
        if (str2 == null || str8.length() == 0 || str == null || str7.length() == 0) {
            z = false;
        }
        C49147EqE.A00(userSession2, A01, "hub_order_details", str8, str7, str9, str10, str11, str6, z);
        C309516Yo r3 = new C309516Yo(fragmentActivity, userSession);
        C46649DiU A04 = C46649DiU.A04("com.bloks.www.orders_hub.order_details", hashMap);
        A04.A00 = 951391000;
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
        igBloksScreenConfig.A0l = false;
        r3.A0D(C49891FBs.A02(igBloksScreenConfig, A04));
        r3.A0D = false;
        r3.A04();
    }

    public static final void A0O(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        String str3;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(fragmentActivity, 3);
        C49314Esx.A01.A00();
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        C309516Yo r2 = new C309516Yo(fragmentActivity, userSession);
        r2.A0F = true;
        C249713kF.A00.A0T();
        String string = fragmentActivity.getString(2131973805);
        0qQ.A07(string);
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "";
        }
        hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        hashMap.put("waterfall_id", obj);
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("prior_module", str2);
        if (z) {
            str3 = "modal";
        } else {
            str3 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        }
        hashMap.put("presentation_style", str3);
        C46649DiU A04 = C46649DiU.A04("com.instagram.shopping.screens.seller_policy_migration", hashMap);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
        igBloksScreenConfig.A0U = string;
        r2.A0D(C49891FBs.A02(igBloksScreenConfig, A04));
        r2.A0A = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        r2.A04();
    }

    public static final void A0P(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        String str3;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str, 2);
        0qQ.A0B(fragmentActivity, 4);
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        if (z) {
            str3 = "modal";
        } else {
            str3 = TraceEventType.Push;
        }
        C309516Yo r2 = new C309516Yo(fragmentActivity, userSession);
        C249713kF.A00.A0T();
        Bundle bundle = new Bundle();
        bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        bundle.putString("waterfall_id", obj);
        bundle.putString("prior_module", str);
        bundle.putString("presentation_style", str3);
        AnonymousClass4DH r0 = new AnonymousClass4DH();
        r0.setArguments(bundle);
        r2.A0D(r0);
        r2.A0A = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        r2.A04();
    }

    public static final void A0R(UserSession userSession, Activity activity, String str) {
        0qQ.A0B(userSession, 1);
        if (0eE.A00(userSession).A00().A1R()) {
            W3U w3u = W3U.A00;
            if (!W3U.A02(userSession, w3u).getBoolean("has_seen_influencers_nux_dialog", false)) {
                C249713kF.A00.A0c(activity, userSession, str, true);
                0xY AR4 = W3U.A02(userSession, w3u).AR4();
                AR4.E5T("has_seen_influencers_nux_dialog", true);
                AR4.apply();
            }
        }
    }

    public static final boolean A0S(UserSession userSession, User user) {
        0qQ.A0B(userSession, 1);
        Integer A0A = A0A(userSession, user);
        if (AnonymousClass05K.A00 == A0A || AnonymousClass05K.A0C == A0A || AnonymousClass05K.A01 == A0A) {
            return true;
        }
        return false;
    }

    public static final boolean A0T(UserSession userSession, User user) {
        List list;
        CreatorShoppingInfo Asf = user.A03.Asf();
        if (Asf != null) {
            list = Asf.BN1();
        } else {
            list = null;
        }
        Integer A0A = A0A(userSession, user);
        if (AnonymousClass05K.A00 == A0A || AnonymousClass05K.A0C == A0A) {
            if (list == null || !(!list.isEmpty())) {
                return false;
            }
        } else if (list == null || list.size() <= 1) {
            return false;
        }
        return true;
    }

    public static final boolean A0U(UserSession userSession, String str) {
        0qQ.A0B(str, 0);
        0qQ.A0B(userSession, 1);
        if (str.equals("rtc_call")) {
            return !182.A06(0Tu.A05, userSession, 36314025797093748L);
        }
        return A00.contains(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.text.SpannableStringBuilder A03(android.content.Context r6, java.lang.Integer r7, java.lang.String r8, java.lang.String r9) {
        /*
            if (r7 == 0) goto L_0x0049
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r8)
            int r0 = r7.intValue()
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            r3.<init>(r0)
            r2 = 0
            int r1 = r5.length()
            r0 = 33
            r5.setSpan(r3, r2, r1, r0)
        L_0x001a:
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>(r5)
            java.lang.String r0 = " "
            r4.append(r0)
            int r3 = r4.length()
            r4.append(r9)
            android.text.style.StrikethroughSpan r1 = new android.text.style.StrikethroughSpan
            r1.<init>()
            int r0 = r4.length()
            r2 = 33
            r4.setSpan(r1, r3, r0, r2)
            r0 = 2132017748(0x7f140254, float:1.9673783E38)
            android.text.style.TextAppearanceSpan r1 = new android.text.style.TextAppearanceSpan
            r1.<init>(r6, r0)
            int r0 = r4.length()
            r4.setSpan(r1, r3, r0, r2)
            return r4
        L_0x0049:
            r5 = r8
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C324476zN.A03(android.content.Context, java.lang.Integer, java.lang.String, java.lang.String):android.text.SpannableStringBuilder");
    }

    public static final R8S A05(UserSession userSession, String str, String str2) {
        if (str2 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("itemID", str2);
        1WM.getInstance().getFragmentFactory();
        1WM.getInstance();
        T8B A01 = new T8B(userSession).A01("IgPaymentsItemDetailsRoute");
        A01.A07 = str;
        A01.A00(bundle);
        Bundle AEV = A01.AEV();
        R8S r8s = new R8S();
        r8s.setArguments(AEV);
        return r8s;
    }

    public static final R8S A06(UserSession userSession, String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString("receiptID", str2);
        bundle.putString("sessionID", str3);
        bundle.putString("transactionSource", str4);
        1WM.getInstance().getFragmentFactory();
        1WM.getInstance();
        T8B A01 = new T8B(userSession).A01("IgPaymentsReceiptRoute");
        A01.A07 = str;
        A01.A00(bundle);
        Bundle AEV = A01.AEV();
        R8S r8s = new R8S();
        r8s.setArguments(AEV);
        return r8s;
    }

    public static final CharSequence A08(Context context, Product product, Integer num, Integer num2) {
        String str = product.A0L;
        String str2 = product.A0G;
        if (!product.A05()) {
            return A09(context, str, num);
        }
        return A03(context, num2, str, str2);
    }

    public static final CharSequence A09(Context context, CharSequence charSequence, Integer num) {
        if (num == null) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(context, num.intValue()), 0, spannableString.length(), 33);
        return spannableString;
    }

    public static final void A0I(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        C49314Esx.A01.A00();
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        if (fragmentActivity != null) {
            C309516Yo r2 = new C309516Yo(fragmentActivity, userSession);
            r2.A0F = true;
            C249713kF.A00.A0T();
            Bundle bundle = new Bundle();
            bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            bundle.putString("waterfall_id", obj);
            bundle.putString("prior_module", str2);
            AnonymousClass4DH r0 = new AnonymousClass4DH();
            r0.setArguments(bundle);
            r2.A0D(r0);
            r2.A0A = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            r2.A04();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A0J(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3) {
        C309516Yo r1 = new C309516Yo(fragmentActivity, userSession);
        r1.A0D(A06(userSession, fragmentActivity.getString(2131969065), str, str2, str3));
        r1.A04();
    }

    public static final void A0Q(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        C49314Esx.A01.A00();
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        if (fragmentActivity != null) {
            C309516Yo r2 = new C309516Yo(fragmentActivity, userSession);
            r2.A0F = true;
            C249713kF.A00.A0T();
            Bundle bundle = new Bundle();
            bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            bundle.putString("waterfall_id", obj);
            bundle.putString("prior_module", str2);
            bundle.putBoolean("is_deferred_payout", z);
            AnonymousClass4DH r0 = new AnonymousClass4DH();
            r0.setArguments(bundle);
            r2.A0D(r0);
            r2.A0A = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            r2.A04();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
