package X;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fn9  reason: case insensitive filesystem */
public final class C51017Fn9 implements C51920G7o {
    public final boolean EHn() {
        return false;
    }

    public static String A00(BaseBundle baseBundle, String str) {
        return baseBundle.getString(str) != null ? baseBundle.getString(str) : "deep_link";
    }

    public static void A01(FragmentActivity fragmentActivity, UserSession userSession, C51017Fn9 fn9, User user, String str) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        W2P A0N = C249713kF.A00.A0N(fragmentActivity2, user.A0B(), userSession, new C50455Fc2(fn9, "shop_url"), (String) null, str, "shop_url", user.getId(), user.getUsername());
        A0N.A0M = true;
        A0N.A05();
    }

    public final Bundle AFW(AnonymousClass0wW r2, String str) {
        return C249713kF.A00.A02(str);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008a, code lost:
        if (r11.equals(r6) == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0511, code lost:
        r2.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0514, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0544, code lost:
        r7.A0D(X.C46649DiU.A02(r1, r0, r6));
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0593, code lost:
        r7.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0596, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CI1(android.os.Bundle r22, androidx.fragment.app.FragmentActivity r23, X.AnonymousClass0wW r24) {
        /*
            r21 = this;
            java.lang.String r1 = "SHOPPING_URL_TYPE"
            r0 = r22
            java.lang.String r14 = r0.getString(r1)
            java.lang.String r8 = "prior_module"
            java.lang.String r1 = r0.getString(r8)
            java.lang.String r3 = "deep_link"
            if (r1 == 0) goto L_0x02d6
            java.lang.String r4 = r0.getString(r8)
        L_0x0016:
            r1 = r24
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r14.getClass()
            r17 = -1
            int r2 = r14.hashCode()
            java.lang.String r13 = "shopping_checkout_deferred_payout"
            switch(r2) {
                case -2094603089: goto L_0x01d8;
                case -2020484798: goto L_0x01e4;
                case -1836939617: goto L_0x01f0;
                case -1610081298: goto L_0x01fc;
                case -1607892931: goto L_0x0208;
                case -1310090308: goto L_0x0214;
                case -1289541294: goto L_0x0220;
                case -1186646514: goto L_0x022c;
                case -684708551: goto L_0x0238;
                case -199387366: goto L_0x0248;
                case -168466428: goto L_0x0254;
                case 3529462: goto L_0x025e;
                case 145160324: goto L_0x026a;
                case 433262174: goto L_0x0276;
                case 668603129: goto L_0x0282;
                case 736002880: goto L_0x028e;
                case 1086699981: goto L_0x029a;
                case 1223863244: goto L_0x02a6;
                case 1295913309: goto L_0x02b2;
                case 1521881635: goto L_0x02be;
                case 2037662320: goto L_0x02ca;
                default: goto L_0x0028;
            }
        L_0x0028:
            java.lang.String r15 = "pro_home"
            java.lang.String r16 = ""
            java.lang.String r12 = "destination"
            java.lang.String r7 = "merchant_id"
            java.lang.String r10 = "merchant_username"
            java.lang.String r6 = "link_id"
            java.lang.String r5 = "waterfall_id"
            java.lang.String r11 = "entry_point"
            r9 = r21
            r2 = r23
            switch(r17) {
                case 0: goto L_0x0040;
                case 1: goto L_0x02d9;
                case 2: goto L_0x030f;
                case 3: goto L_0x045e;
                case 4: goto L_0x037e;
                case 5: goto L_0x04b8;
                case 6: goto L_0x04cd;
                case 7: goto L_0x00db;
                case 8: goto L_0x04fe;
                case 9: goto L_0x03db;
                case 10: goto L_0x0425;
                case 11: goto L_0x0425;
                case 12: goto L_0x0431;
                case 13: goto L_0x0105;
                case 14: goto L_0x0515;
                case 15: goto L_0x013c;
                case 16: goto L_0x0443;
                case 17: goto L_0x044c;
                case 18: goto L_0x04eb;
                case 19: goto L_0x054d;
                default: goto L_0x003f;
            }
        L_0x003f:
            return
        L_0x0040:
            java.lang.String r4 = r0.getString(r11)
            if (r4 != 0) goto L_0x0047
            r4 = r3
        L_0x0047:
            java.lang.String r8 = r0.getString(r7)
            java.lang.String r1 = "merchant_name"
            java.lang.String r7 = r0.getString(r1)
            java.lang.String r1 = "product_id"
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r3 = "cpdp_disabled"
            java.lang.String r5 = r0.getString(r3)
            java.lang.String r3 = "1"
            boolean r5 = r3.equals(r5)
            com.instagram.common.session.UserSession r14 = X.0Gl.A01(r24)
            java.lang.String r3 = "deep_link_launch_mode"
            java.lang.String r11 = r0.getString(r3)
            if (r14 == 0) goto L_0x008c
            if (r11 == 0) goto L_0x008c
            X.VPQ r3 = X.C17091VHn.A00(r14)
            com.instagram.common.session.UserSession r3 = r3.A00
            X.ERE r10 = new X.ERE
            r10.<init>(r3)
            java.lang.String r6 = "pinned"
            boolean r3 = r11.equals(r6)
            if (r3 != 0) goto L_0x00ce
            java.lang.String r6 = "recent"
            boolean r3 = r11.equals(r6)
            if (r3 != 0) goto L_0x00ce
        L_0x008c:
            X.3kF r11 = X.C249713kF.A00
            com.instagram.api.schemas.ProductReviewStatus r13 = com.instagram.api.schemas.ProductReviewStatus.APPROVED
            X.Fc1 r10 = new X.Fc1
            r10.<init>(r0, r9)
            java.lang.String r6 = "shopping_session_id"
            java.lang.String r3 = r0.getString(r6)
            if (r3 == 0) goto L_0x00cb
            java.lang.String r20 = r0.getString(r6)
        L_0x00a1:
            r16 = r1
            r17 = r8
            r18 = r7
            r19 = r4
            r12 = r2
            r15 = r10
            X.WNN r3 = r11.A0K(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r1 = "featured_product_permission_id"
            java.lang.String r0 = r0.getString(r1)
            r3.A0J = r0
            r0 = 1
            r3.A0Z = r0
            r3.A0W = r5
            r3.A0T = r4
            X.1Xj r0 = r3.A04
            if (r0 != 0) goto L_0x04f9
            X.WNN.A01(r3)
            boolean r0 = r2 instanceof com.instagram.url.UrlHandlerActivity
            if (r0 == 0) goto L_0x003f
            goto L_0x0511
        L_0x00cb:
            r20 = 0
            goto L_0x00a1
        L_0x00ce:
            X.EyN r3 = X.ERE.A00(r10, r6)
            if (r3 == 0) goto L_0x008c
            java.lang.String r8 = r3.A00
            java.lang.String r7 = r3.A01
            java.lang.String r1 = r3.A02
            goto L_0x008c
        L_0x00db:
            java.lang.String r5 = r0.getString(r11)
            java.lang.String r0 = "push_notification"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x003f
            java.lang.String r0 = "push"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x003f
            X.0eE r0 = X.AnonymousClass0t1.A01
            r0.A01(r1)
            r3 = r5
            if (r5 != 0) goto L_0x00f9
            r3 = r16
        L_0x00f9:
            r0 = 1
            X.C324476zN.A0P(r2, r1, r4, r3, r0)
            boolean r0 = r15.equals(r5)
            if (r0 != 0) goto L_0x003f
            goto L_0x0511
        L_0x0105:
            java.lang.String r6 = "permission_settings"
            java.lang.String r3 = r0.getString(r12)
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x003f
            java.lang.String r3 = A00(r0, r11)
            X.AnonymousClass7TG.A1N(r1, r3)
            r0 = 3
            X.0qQ.A0B(r2, r0)
            X.F1Y r0 = X.C49314Esx.A01
            r0.A00()
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "entrypoint"
            r6.put(r0, r3)
            r6.put(r8, r4)
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            r6.put(r5, r0)
            X.6Yo r7 = X.DbS.A0M(r2, r1)
            java.lang.String r0 = "com.bloks.www.bloks.commerce.creators-as-sellers.manage-partner-permission"
            goto L_0x0544
        L_0x013c:
            java.lang.String r3 = r0.getString(r12)
            java.lang.String r10 = A00(r0, r11)
            java.lang.String r0 = "inventory_settings"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0188
            r9 = 0
            X.AnonymousClass7TF.A1C(r1, r9, r2)
            X.F1Y r14 = X.C49314Esx.A01
            r14.A00()
            java.lang.String r13 = X.AnonymousClass7TG.A0j()
            java.lang.String r12 = "1"
            X.6Yo r7 = X.DbS.A0M(r2, r1)
            X.3kF r0 = X.C249713kF.A00
            r0.A0T()
            r0 = 2131973802(0x7f1356aa, float:1.958465E38)
            java.lang.String r6 = X.AnonymousClass7TE.A16(r2, r0)
            java.util.HashMap r3 = X.Dba.A0f(r8, r4)
            r3.put(r11, r10)
            r14.A00()
            r3.put(r5, r13)
            java.lang.String r2 = "modal"
            java.lang.String r0 = "presentation_style"
            r3.put(r0, r2)
            java.lang.String r0 = "com.bloks.www.bloks.commerce.shop.inventory.settings"
            X.C46649DiU.A0A(r7, r1, r0, r6, r3)
            r7.A0A = r12
            goto L_0x0591
        L_0x0188:
            java.lang.String r0 = "ads_with_product_tags"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x019e
            X.1Yh r3 = X.C18138VmE.A00()
            r0 = 781(0x30d, float:1.094E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A09(r2, r1, r0)
            return
        L_0x019e:
            java.lang.String r0 = "recommendation_hub"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x003f
            r0 = 0
            X.AnonymousClass7TF.A1C(r1, r0, r2)
            X.F1Y r6 = X.C49314Esx.A01
            r6.A00()
            java.lang.String r3 = X.AnonymousClass7TG.A0j()
            X.6Yo r7 = X.DbU.A0Q(r2, r1)
            X.3kF r0 = X.C249713kF.A00
            r0.A0T()
            java.util.HashMap r2 = X.Dba.A0f(r8, r4)
            r2.put(r11, r10)
            r6.A00()
            r2.put(r5, r3)
            java.lang.String r0 = "com.instagram.shopping.screens.seller_activation_checklist.seller_activation_checklist.SellerActivationChecklistScreen"
            X.3M3 r0 = X.C46649DiU.A02(r1, r0, r2)
            r7.A0D(r0)
            java.lang.String r0 = "1"
            r7.A0A = r0
            goto L_0x0593
        L_0x01d8:
            java.lang.String r2 = "shopping_checkout_upsell"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0028
            r17 = 12
            goto L_0x0028
        L_0x01e4:
            java.lang.String r2 = "shopping_creator_shop_management"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0028
            r17 = 13
            goto L_0x0028
        L_0x01f0:
            java.lang.String r2 = "create_shopping_tagged_post"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0028
            r17 = 4
            goto L_0x0028
        L_0x01fc:
            java.lang.String r2 = "product_collection"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0028
            r17 = 3
            goto L_0x0028
        L_0x0208:
            java.lang.String r2 = "shop_manager_add_products"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0028
            r17 = 5
            goto L_0x0028
        L_0x0214:
            java.lang.String r2 = "product_details_page"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0028
            r17 = 0
            goto L_0x0028
        L_0x0220:
            java.lang.String r2 = "shopping_onboarding"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0028
            r17 = 7
            goto L_0x0028
        L_0x022c:
            java.lang.String r2 = "discovery_home"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0028
            r17 = 20
            goto L_0x0028
        L_0x0238:
            r2 = 781(0x30d, float:1.094E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0028
            r17 = 15
            goto L_0x0028
        L_0x0248:
            java.lang.String r2 = "shopping_creator_shop_onboarding"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0028
            r17 = 14
            goto L_0x0028
        L_0x0254:
            boolean r2 = r14.equals(r13)
            if (r2 == 0) goto L_0x0028
            r17 = 11
            goto L_0x0028
        L_0x025e:
            java.lang.String r2 = "shop"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0028
            r17 = 1
            goto L_0x0028
        L_0x026a:
            java.lang.String r2 = "shopping_cis_onboarding"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0028
            r17 = 8
            goto L_0x0028
        L_0x0276:
            java.lang.String r2 = "shop_manager_edit_products"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0028
            r17 = 6
            goto L_0x0028
        L_0x0282:
            java.lang.String r2 = "discounts_interstitial"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0028
            r17 = 19
            goto L_0x0028
        L_0x028e:
            java.lang.String r2 = "shopping_legacy_seller_migration_flow"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0028
            r17 = 16
            goto L_0x0028
        L_0x029a:
            java.lang.String r2 = "shopping_ads_credit_progress"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0028
            r17 = 17
            goto L_0x0028
        L_0x02a6:
            java.lang.String r2 = "profile_shop"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0028
            r17 = 2
            goto L_0x0028
        L_0x02b2:
            java.lang.String r2 = "shopping_checkout_onboarding"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0028
            r17 = 10
            goto L_0x0028
        L_0x02be:
            java.lang.String r2 = "community_content"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0028
            r17 = 18
            goto L_0x0028
        L_0x02ca:
            java.lang.String r2 = "product_composer"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0028
            r17 = 9
            goto L_0x0028
        L_0x02d6:
            r4 = r3
            goto L_0x0016
        L_0x02d9:
            java.lang.String r7 = X.DbU.A0l(r0, r10)
            X.17i r0 = X.17h.A00(r1)
            java.util.concurrent.ConcurrentMap r0 = r0.A02
            java.lang.Object r6 = r0.get(r7)
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            if (r6 == 0) goto L_0x02f7
            com.instagram.api.schemas.SellerShoppableFeedType r5 = r6.A0B()
            com.instagram.api.schemas.SellerShoppableFeedType r0 = com.instagram.api.schemas.SellerShoppableFeedType.A06
            if (r5 == r0) goto L_0x02f7
            A01(r2, r1, r9, r6, r4)
            return
        L_0x02f7:
            X.FnB r0 = new X.FnB
            r10 = r0
            r11 = r2
            r12 = r1
            r13 = r9
            r14 = r4
            r15 = r7
            r10.<init>(r11, r12, r13, r14, r15)
            X.F2K r4 = new X.F2K
            r4.<init>(r1, r0, r3)
            X.0gy r0 = X.AnonymousClass07i.A00(r2)
            r4.A00(r2, r0, r7)
            return
        L_0x030f:
            java.lang.String r5 = r0.getString(r6)
            if (r5 == 0) goto L_0x0347
            X.3kF r11 = X.C249713kF.A00
            X.Fc2 r5 = new X.Fc2
            r5.<init>(r9, r3)
            r13 = 0
            java.lang.String r19 = X.DbU.A0l(r0, r7)
            java.lang.String r20 = r0.getString(r10)
            r16 = r13
            r17 = r4
            r18 = r3
            r12 = r2
            r14 = r1
            r15 = r5
            X.W2P r2 = r11.A0N(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r1 = r0.getString(r6)
            r2.A08 = r1
        L_0x0338:
            java.lang.String r1 = "embedded_deep_link"
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto L_0x0343
            r0 = 1
            r2.A0M = r0
        L_0x0343:
            r2.A05()
            return
        L_0x0347:
            X.1E8 r6 = X.1E7.A00(r1)
            java.lang.String r5 = "media_id"
            java.lang.String r5 = r0.getString(r5)
            X.1Xj r8 = r6.A02(r5)
            X.3kF r11 = X.C249713kF.A00
            X.Fc2 r6 = new X.Fc2
            r6.<init>(r9, r3)
            r16 = 0
            java.lang.String r19 = X.DbU.A0l(r0, r7)
            java.lang.String r20 = X.DbU.A0l(r0, r10)
            java.lang.String r5 = "seller_shoppable_feed_type"
            java.lang.String r5 = r0.getString(r5)
            com.instagram.api.schemas.SellerShoppableFeedType r13 = X.16m.A00(r5)
            r17 = r4
            r18 = r3
            r12 = r2
            r14 = r1
            r15 = r6
            X.W2P r2 = r11.A0N(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r2.A03 = r8
            goto L_0x0338
        L_0x037e:
            java.lang.String r1 = "source"
            java.lang.String r3 = r0.getString(r1)
            java.util.Map r1 = X.EXF.A01
            java.lang.Object r5 = r1.get(r3)
            X.EXF r5 = (X.EXF) r5
            java.lang.String r1 = "show_product_row_tooltip"
            boolean r4 = X.DbT.A1X(r0, r1)
            boolean r1 = r2 instanceof X.AnonymousClass2ZW
            if (r1 == 0) goto L_0x03cc
            r1 = r2
            X.2ZW r1 = (X.AnonymousClass2ZW) r1
            X.36V r3 = r1.Alb()
            android.app.Activity r1 = r2.getParent()
            if (r1 == 0) goto L_0x03ad
            android.app.Activity r1 = r2.getParent()
        L_0x03a7:
            X.2ZW r1 = (X.AnonymousClass2ZW) r1
            X.36V r3 = r1.Alb()
        L_0x03ad:
            X.36W r1 = X.AnonymousClass36W.FOLLOWERS_SHARE
            if (r5 != 0) goto L_0x03b3
            X.EXF r5 = X.EXF.A0H
        L_0x03b3:
            r3.Ewb(r5, r1)
        L_0x03b6:
            if (r4 == 0) goto L_0x03bf
            X.6SR r2 = X.AnonymousClass6SR.A01()
            r1 = 1
            r2.A0X = r1
        L_0x03bf:
            X.6SR r2 = X.AnonymousClass6SR.A01()
            java.lang.String r1 = "product_row_tooltip_string_override"
            java.lang.String r0 = r0.getString(r1)
            r2.A0D = r0
            return
        L_0x03cc:
            boolean r1 = r2 instanceof com.instagram.modal.ModalActivity
            if (r1 == 0) goto L_0x03b6
            X.2ZQ r1 = X.C71172bH.A00()
            if (r1 == 0) goto L_0x03b6
            X.2ZQ r1 = X.C71172bH.A00()
            goto L_0x03a7
        L_0x03db:
            java.lang.String r3 = "catalog_id"
            java.lang.String r9 = r0.getString(r3)
            java.lang.String r3 = "item_id"
            java.lang.String r10 = r0.getString(r3)
            r3 = 783(0x30f, float:1.097E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r4 = 0
            boolean r11 = r0.getBoolean(r3, r4)
            r3 = 673(0x2a1, float:9.43E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            boolean r12 = r0.getBoolean(r3, r4)
            X.3kF r4 = X.C249713kF.A00
            java.lang.String r3 = r0.getString(r5)
            if (r3 == 0) goto L_0x0420
            java.lang.String r7 = r0.getString(r5)
        L_0x0408:
            java.lang.String r3 = r0.getString(r8)
            if (r3 == 0) goto L_0x0419
            java.lang.String r8 = r0.getString(r8)
        L_0x0412:
            r13 = 1
            r5 = r2
            r6 = r1
            r4.A1D(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0419:
            X.EWE r0 = X.EWE.SELLER_JOURNEY_PUSH_NOTIFICATION
            java.lang.String r8 = r0.toString()
            goto L_0x0412
        L_0x0420:
            java.lang.String r7 = X.AnonymousClass7TF.A0b()
            goto L_0x0408
        L_0x0425:
            boolean r3 = r13.equals(r14)
            java.lang.String r0 = A00(r0, r11)
            X.C324476zN.A0Q(r2, r1, r0, r4, r3)
            return
        L_0x0431:
            java.lang.String r4 = r0.getString(r11)
            if (r4 == 0) goto L_0x043b
            java.lang.String r3 = r0.getString(r11)
        L_0x043b:
            java.lang.String r0 = A00(r0, r8)
            X.C324476zN.A0I(r2, r1, r3, r0)
            return
        L_0x0443:
            java.lang.String r3 = A00(r0, r11)
            r0 = 1
            X.C324476zN.A0O(r2, r1, r3, r4, r0)
            return
        L_0x044c:
            java.lang.String r4 = r0.getString(r11)
            if (r4 == 0) goto L_0x0456
            java.lang.String r3 = r0.getString(r11)
        L_0x0456:
            java.lang.String r0 = A00(r0, r8)
            X.C324476zN.A0H(r2, r1, r3, r0)
            return
        L_0x045e:
            X.3kF r12 = X.C249713kF.A00
            r16 = 0
            X.UzB r15 = X.C16675UzB.PRODUCT_COLLECTION
            r13 = r2
            r14 = r1
            r17 = r3
            X.Vk1 r3 = r12.A0J(r13, r14, r15, r16, r17)
            java.lang.String r1 = r0.getString(r7)
            r3.A08 = r1
            java.lang.String r1 = "is_cam_shop"
            r0.getBoolean(r1)
            java.lang.String r1 = "title"
            java.lang.String r1 = r0.getString(r1)
            r3.A0D = r1
            java.lang.String r1 = r0.getString(r11)
            if (r1 == 0) goto L_0x048b
            java.lang.String r1 = X.DbU.A0l(r0, r11)
            r3.A0A = r1
        L_0x048b:
            java.lang.String r1 = r0.getString(r6)
            if (r1 == 0) goto L_0x04a4
            java.lang.String r1 = X.DbU.A0l(r0, r6)
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x049d
            r3.A06 = r1
        L_0x049d:
            r0 = 1
            r3.A0G = r0
            r3.A00()
            return
        L_0x04a4:
            java.lang.String r1 = "collection_id"
            java.lang.String r2 = X.DbU.A0l(r0, r1)
            java.lang.String r1 = "collection_type"
            java.lang.String r0 = r0.getString(r1)
            X.57K r0 = X.C17025VEz.A00(r0)
            r3.A01(r0, r2)
            goto L_0x049d
        L_0x04b8:
            X.3kF r6 = X.C249713kF.A00
            java.lang.String r3 = r0.getString(r5)
            if (r3 == 0) goto L_0x04c8
            java.lang.String r0 = r0.getString(r5)
        L_0x04c4:
            r6.A19(r2, r1, r0, r4)
            return
        L_0x04c8:
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            goto L_0x04c4
        L_0x04cd:
            X.3kF r6 = X.C249713kF.A00
            java.lang.String r3 = r0.getString(r5)
            if (r3 == 0) goto L_0x04e6
            java.lang.String r9 = r0.getString(r5)
        L_0x04d9:
            boolean r0 = r15.equals(r4)
            r11 = r0 ^ 1
            r7 = r2
            r8 = r1
            r10 = r4
            r6.A1E(r7, r8, r9, r10, r11)
            return
        L_0x04e6:
            java.lang.String r9 = X.AnonymousClass7TF.A0b()
            goto L_0x04d9
        L_0x04eb:
            X.3kF r3 = X.C249713kF.A00
            com.instagram.user.model.User r0 = X.DbT.A0j(r1)
            java.lang.String r0 = r0.getId()
            r3.A18(r2, r1, r0, r4)
            return
        L_0x04f9:
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        L_0x04fe:
            java.lang.String r9 = r0.getString(r11)
            com.instagram.user.model.User r7 = X.DbT.A0j(r1)
            if (r9 != 0) goto L_0x050a
            r9 = r16
        L_0x050a:
            r10 = 1
            r5 = r2
            r6 = r1
            r8 = r4
            X.C324476zN.A0C(r5, r6, r7, r8, r9, r10)
        L_0x0511:
            r2.finish()
            return
        L_0x0515:
            java.lang.String r7 = "enabler"
            java.lang.String r6 = X.DbU.A0l(r0, r7)
            java.lang.String r3 = A00(r0, r11)
            X.DbY.A1S(r1, r3)
            r0 = 4
            X.0qQ.A0B(r2, r0)
            X.F1Y r0 = X.C49314Esx.A01
            r0.A00()
            java.util.HashMap r6 = X.Dba.A0f(r7, r6)
            java.lang.String r0 = "entrypoint"
            r6.put(r0, r3)
            r6.put(r8, r4)
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            r6.put(r5, r0)
            X.6Yo r7 = X.DbS.A0M(r2, r1)
            java.lang.String r0 = "com.bloks.www.bloks.commerce.creator-shop.activation.info"
        L_0x0544:
            X.3M3 r0 = X.C46649DiU.A02(r1, r0, r6)
            r7.A0D(r0)
            r9 = 0
            goto L_0x0591
        L_0x054d:
            java.lang.String r4 = r0.getString(r11)
            if (r4 == 0) goto L_0x0557
            java.lang.String r3 = r0.getString(r11)
        L_0x0557:
            java.lang.String r6 = A00(r0, r8)
            r9 = 0
            X.0qQ.A0B(r1, r9)
            X.F1Y r0 = X.C49314Esx.A01
            r0.A00()
            java.lang.String r4 = X.AnonymousClass7TG.A0j()
            if (r23 == 0) goto L_0x0597
            X.6Yo r7 = X.DbS.A0M(r2, r1)
            X.3kF r0 = X.C249713kF.A00
            r0.A0T()
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            if (r3 != 0) goto L_0x057b
            r3 = r16
        L_0x057b:
            r2.put(r11, r3)
            r2.put(r5, r4)
            if (r6 != 0) goto L_0x0585
            r6 = r16
        L_0x0585:
            r2.put(r8, r6)
            java.lang.String r0 = "com.instagram.shopping.screens.seller_aymts.seller_funded_incentives"
            X.3M3 r0 = X.C46649DiU.A02(r1, r0, r2)
            r7.A0D(r0)
        L_0x0591:
            r7.A0D = r9
        L_0x0593:
            r7.A04()
            return
        L_0x0597:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51017Fn9.CI1(android.os.Bundle, androidx.fragment.app.FragmentActivity, X.0wW):void");
    }
}
