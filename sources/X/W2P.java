package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.filters.intf.FilterConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class W2P {
    public Fragment A00;
    public RankingInfo A01;
    public FilterConfig A02;
    public 1Xj A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public ArrayList A0H;
    public List A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public SellerShoppableFeedType A0O;
    public final FragmentActivity A0P;
    public final UserSession A0Q;
    public final AnonymousClass4DU A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C17572VaQ A01() {
        /*
            r9 = this;
            r6 = 1
            android.os.Bundle r0 = r9.A00()
            java.lang.String r2 = X.C228022kf.A00(r0)
            androidx.fragment.app.FragmentActivity r0 = r9.A0P
            android.content.Context r0 = r0.getApplicationContext()
            X.VaQ r5 = new X.VaQ
            r5.<init>(r0)
            java.lang.String r1 = r9.A0T
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0139
            long r0 = java.lang.Long.parseLong(r1)
            java.util.Map r4 = r5.A05
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "merchant_igid"
            r4.put(r0, r1)
            java.util.BitSet r0 = r5.A02
            r3 = 0
            r0.set(r3)
            X.4DU r8 = r9.A0R
            java.lang.String r1 = r8.getModuleName()
            java.lang.String r0 = "prior_module"
            r4.put(r0, r1)
            java.lang.String r1 = r9.A0G
            java.lang.String r0 = "prior_submodule"
            r4.put(r0, r1)
            java.lang.String r0 = "shopping_session_id"
            r4.put(r0, r2)
            java.util.ArrayList r0 = r9.A0H
            if (r0 == 0) goto L_0x0069
            boolean r0 = X.DbT.A1b(r0)
            if (r0 != r6) goto L_0x0069
            java.util.ArrayList r1 = r9.A0H
            if (r1 == 0) goto L_0x0069
            r0 = 8
            java.util.List r1 = X.00k.A0d(r1, r0)
            if (r1 == 0) goto L_0x0069
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "pinned_product_ids"
            r4.put(r0, r1)
        L_0x0069:
            java.lang.String r1 = r9.A0D
            if (r1 == 0) goto L_0x0072
            java.lang.String r0 = "request_source"
            r4.put(r0, r1)
        L_0x0072:
            java.util.List r1 = r9.A0I
            if (r1 == 0) goto L_0x008b
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x008b
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x008b
            r0 = 1874(0x752, float:2.626E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.put(r0, r1)
        L_0x008b:
            X.1Xj r7 = r9.A03
            if (r7 == 0) goto L_0x0112
            java.lang.String r1 = r7.getId()
            java.lang.String r0 = "m_pk"
            r4.put(r0, r1)
            boolean r0 = r7.CcK()
            if (r0 == 0) goto L_0x00bb
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "is_direct_from_ads"
            r4.put(r0, r1)
            com.instagram.common.session.UserSession r0 = r9.A0Q
            java.lang.String r2 = X.C231122qu.A0F(r0, r7)
            java.lang.String r1 = r7.getId()
            java.lang.String r0 = "media_id"
            r4.put(r0, r1)
        L_0x00b6:
            java.lang.String r0 = "tracking_token"
            r4.put(r0, r2)
        L_0x00bb:
            boolean r0 = r9.A0J
            if (r0 == 0) goto L_0x00c8
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "disable_pull_to_refresh"
            r4.put(r0, r1)
        L_0x00c8:
            java.lang.String r1 = r9.A0C
            if (r1 == 0) goto L_0x00dd
            int r0 = r1.length()
            if (r0 != 0) goto L_0x010d
            r0 = 0
        L_0x00d4:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "profile_entry_igid"
            r4.put(r0, r1)
        L_0x00dd:
            java.lang.String r1 = r9.A0U
            java.lang.String r4 = ""
            if (r1 != 0) goto L_0x00e4
            r1 = r4
        L_0x00e4:
            java.util.Map r2 = r5.A04
            java.lang.String r0 = "merchant_name"
            r2.put(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "merchant_follow_status"
            r2.put(r0, r1)
            java.lang.String r0 = "merchant_verified"
            r2.put(r0, r1)
            java.lang.String r0 = "merchant_follower_count"
            r2.put(r0, r4)
            r0 = 674(0x2a2, float:9.44E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.put(r0, r4)
            java.lang.String r0 = "merchant_profile_url"
            r2.put(r0, r4)
            return r5
        L_0x010d:
            long r0 = java.lang.Long.parseLong(r1)
            goto L_0x00d4
        L_0x0112:
            java.lang.String r0 = r9.A0F
            if (r0 == 0) goto L_0x00bb
            java.lang.String r2 = r9.A0E
            java.lang.String r1 = r8.getModuleName()
            java.lang.String r0 = "profile"
            boolean r1 = X.0qQ.A0K(r1, r0)
            java.lang.String r0 = "m_pk"
            r4.put(r0, r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r0 = "is_direct_from_ads"
            r4.put(r0, r1)
            java.lang.String r0 = "media_id"
            r4.put(r0, r2)
            java.lang.String r2 = r9.A0F
            goto L_0x00b6
        L_0x0139:
            java.lang.String r1 = "Merchant ID is missing."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W2P.A01():X.VaQ");
    }

    private final void A02() {
        UserSession userSession = this.A0Q;
        0Tu r2 = 0Tu.A06;
        if (182.A06(r2, userSession, 36329431844929659L)) {
            r2 = 0Tu.A05;
        }
        if (C41845B3m.A14(Boolean.valueOf(182.A06(r2, userSession, 36329431844798586L)))) {
            AnonymousClass12T r3 = AnonymousClass12T.A00;
            AnonymousClass6RB A002 = C307516Qk.A00(C307496Qi.A00(userSession));
            1Eo.A05(r3.CO6(1759633843, 3), new C59842JaI(A002, this, "com.bloks.www.storefront.template.general", (AnonymousClass4D7) null, 23), AnonymousClass07a.A00(this.A0P));
        }
    }

    private final Bundle A00() {
        Bundle bundle = new Bundle();
        UserSession userSession = this.A0Q;
        DbU.A1D(bundle, userSession);
        bundle.putString("prior_module_name", this.A0R.getModuleName());
        DbS.A1B(bundle, this.A0S);
        bundle.putString("displayed_user_id", this.A0T);
        bundle.putString("displayed_username", this.A0U);
        bundle.putString("attribution_username", (String) null);
        bundle.putStringArrayList("pinned_product_ids", this.A0H);
        bundle.putString("shopping_session_id", this.A0W);
        bundle.putParcelable("filter_config", this.A02);
        bundle.putString(AnonymousClass000.A00(750), this.A0C);
        bundle.putBoolean("merchant_verified", false);
        bundle.putBoolean("merchant_follow_status", false);
        bundle.putString("merchant_profile_pic_url", (String) null);
        bundle.putString("merchant_follower_count", (String) null);
        bundle.putBoolean("preempt_empty_state_filter_button", false);
        1Xj r2 = this.A03;
        if (r2 != null && r2.A1e(userSession).CcK()) {
            bundle.putString("media_id", r2.getId());
        }
        return bundle;
    }

    private final void A03(String str, AnonymousClass0iw r15) {
        UserSession userSession = this.A0Q;
        String moduleName = this.A0R.getModuleName();
        String str2 = this.A0G;
        String str3 = this.A0T;
        String str4 = this.A08;
        String A0s = C51971G9r.A0s(this.A03);
        String str5 = this.A0C;
        boolean A1Y = DbW.A1Y(moduleName);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r15, userSession), "shops_mini_shop_storefront_entry");
        1Xj A0U2 = DbV.A0U(userSession, A0s);
        if (A0e.isSampled()) {
            DbS.A1O(A0e, "shops_mini_shop_storefront");
            AnonymousClass327 A0Q2 = C13989Tnp.A0Q(moduleName);
            A0Q2.A06("prior_submodule", str2);
            C13989Tnp.A1K(A0Q2, "shopping_session_id", str);
            C13988Tno.A17(A0e, A0Q2);
            C13988Tno.A1B(A0e, str3);
            String str6 = null;
            A0e.A9F("link_id", C51972G9s.A0j(str4));
            A0e.AAE((AnonymousClass0Ah) null, "marketer_igid");
            if (A0U2 != null) {
                if (A0U2.A5E() == A1Y) {
                    str6 = A0U2.A1e(userSession).C9L();
                } else {
                    str6 = A0U2.C9L();
                }
            }
            A0e.AAJ("ads_tracking_token", str6);
            if (str5 != null) {
                A0e.AAE(C263944Ny.A00(str5), "shop_linked_creator_id");
            }
            if (A0s != null) {
                0bb r2 = new 0bb();
                r2.A06("m_pk", A0s);
                r2.A06("tracking_token", C231122qu.A0I(userSession, A0s));
                A0e.AAK(r2, "ig_media_info");
            }
            A0e.Cgf();
        }
    }

    public final void A04() {
        long seconds = TimeUnit.MINUTES.toSeconds(10);
        AnonymousClass12T r3 = AnonymousClass12T.A00;
        C17572VaQ A012 = A01();
        1Eo.A05(r3.CO6(1759633843, 3), new C20589WvI(A012, this, (AnonymousClass4D7) null, 2, seconds), AnonymousClass07a.A00(this.A0P));
        A02();
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0194  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r30 = this;
            r1 = r30
            boolean r0 = r1.A0N
            if (r0 == 0) goto L_0x0012
            X.1Xj r0 = r1.A03
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "If m_pk is required make sure to set media in the navigator"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0012:
            r1.A02()
            java.lang.String r0 = r1.A08
            if (r0 == 0) goto L_0x00b8
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r0 = r1.A0U
            java.lang.String r8 = "product_feed_label"
            r9.putString(r8, r0)
            java.lang.String r3 = r1.A0T
            java.lang.String r0 = "displayed_user_id"
            r9.putString(r0, r3)
            r12 = 0
            java.lang.String r0 = "attribution_username"
            r9.putString(r0, r12)
            com.instagram.common.session.UserSession r11 = r1.A0Q
            X.DbU.A1D(r9, r11)
            com.instagram.api.schemas.SellerShoppableFeedType r6 = com.instagram.api.schemas.SellerShoppableFeedType.A05
            java.lang.String r7 = "seller_shoppable_feed_type"
            r9.putSerializable(r7, r6)
            java.lang.String r14 = "instagram_shopping_mini_shop_storefront"
            X.0xG r2 = new X.0xG
            r2.<init>(r14)
            android.os.Bundle r0 = r1.A00()
            java.lang.String r0 = X.C228022kf.A00(r0)
            r1.A03(r0, r2)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r2 = r1.A0V
            java.lang.String r0 = "prior_module"
            r4.put(r0, r2)
            java.lang.String r2 = r1.A0G
            java.lang.String r0 = "prior_submodule"
            r4.put(r0, r2)
            java.lang.String r2 = r1.A08
            java.lang.String r0 = "shop_page_link_id"
            r4.put(r0, r2)
            java.lang.String r5 = "bloks_params"
            r9.putSerializable(r5, r4)
            X.3kF r0 = X.C249713kF.A00
            r0.A0T()
            androidx.fragment.app.FragmentActivity r4 = r1.A0P
            java.lang.String r15 = r9.getString(r8)
            java.io.Serializable r2 = r9.getSerializable(r7)
            java.io.Serializable r1 = r9.getSerializable(r5)
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            if (r1 == 0) goto L_0x00b6
            java.lang.String r0 = "request_source"
            java.lang.Object r0 = r1.get(r0)
        L_0x008c:
            if (r2 != r6) goto L_0x00b2
            if (r0 != 0) goto L_0x00b2
            r16 = 2131627867(0x7f0e0f5b, float:1.888301E38)
        L_0x0093:
            X.WNr r10 = X.W3Y.A01(r9)
            java.lang.String r13 = "com.bloks.www.minishops.pagelink"
            X.3M3 r0 = X.W3Y.A00(r9, r10, r11, r12, r13, r14, r15, r16)
            X.6Yo r2 = X.Dba.A0B(r4, r11)
            r2.A08()
            r2.A0B(r12, r0)
            X.WNJ r0 = new X.WNJ
            r0.<init>(r3)
            r2.A07 = r0
        L_0x00ae:
            r2.A04()
            return
        L_0x00b2:
            r16 = 2131627866(0x7f0e0f5a, float:1.8883009E38)
            goto L_0x0093
        L_0x00b6:
            r0 = 0
            goto L_0x008c
        L_0x00b8:
            com.instagram.common.session.UserSession r4 = r1.A0Q
            X.0Tu r0 = X.0Tu.A05
            r2 = 36324509812273277(0x810cf30000307d, double:3.035104500117868E-306)
            boolean r0 = X.182.A06(r0, r4, r2)
            if (r0 == 0) goto L_0x01a7
            java.lang.String r0 = "instagram_shopping_mini_shop_storefront"
            X.0xG r5 = new X.0xG
            r5.<init>(r0)
            r13 = 1
            java.lang.String r0 = "storefront_ig_loading"
            r9 = 0
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.ArrayList r2 = X.0sr.A1M(r0)
            X.1Xj r0 = r1.A03
            if (r0 == 0) goto L_0x010d
            boolean r0 = X.C51968G9o.A1W(r4, r0)
            if (r0 != r13) goto L_0x010d
            X.1Xj r0 = r1.A03
            if (r0 == 0) goto L_0x010d
            java.lang.String r3 = X.C231122qu.A06(r4, r0)
        L_0x00ec:
            X.1E8 r6 = X.1E7.A00(r4)
            java.lang.String r0 = r1.A0E
            X.1Xj r0 = r6.A02(r0)
            java.lang.String r12 = ""
            if (r0 != 0) goto L_0x0110
            X.1Xj r0 = r1.A03
            if (r0 == 0) goto L_0x0118
            boolean r0 = X.C51968G9o.A1W(r4, r0)
            if (r0 != r13) goto L_0x0118
            X.1Xj r0 = r1.A03
            if (r0 != 0) goto L_0x0110
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x010d:
            java.lang.String r3 = r1.A0F
            goto L_0x00ec
        L_0x0110:
            java.lang.String r0 = X.C231122qu.A07(r4, r0)
            if (r0 == 0) goto L_0x0119
            r12 = r0
            goto L_0x0119
        L_0x0118:
            r12 = 0
        L_0x0119:
            if (r3 == 0) goto L_0x0382
            r0 = 2584(0xa18, float:3.621E-42)
            java.lang.String r14 = X.AnonymousClass000.A00(r0)
        L_0x0121:
            androidx.fragment.app.FragmentActivity r7 = r1.A0P
            r0 = 0
            X.2nI r6 = X.C229382nI.A01(r0, r7, r5, r4)
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r10 = 2
            java.util.BitSet r11 = new java.util.BitSet
            r11.<init>(r10)
            java.lang.String r0 = r1.A0T
            java.lang.Long r15 = X.DbV.A0q(r0)
            java.lang.String r0 = "merchant_igid"
            r8.put(r0, r15)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r13)
            java.lang.String r0 = "is_loading"
            java.util.Map r15 = X.AnonymousClass7TF.A0w(r0, r15)
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x015b
            java.lang.String r0 = "should_expose_experiment_dict"
            r8.put(r0, r15)
            r11.set(r13)
        L_0x015b:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r9)
            java.lang.String r0 = "is_dynamically_ranked"
            r8.put(r0, r13)
            java.lang.String r0 = "traffic_source"
            r8.put(r0, r14)
            java.lang.String r0 = "ad_id"
            r8.put(r0, r12)
            java.lang.String r0 = "ad_tracking_token"
            r8.put(r0, r3)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0181
            java.lang.String r0 = "components"
            r8.put(r0, r2)
            r11.set(r9)
        L_0x0181:
            java.lang.String r2 = "unknown"
            java.lang.String r0 = "tab_bar_state"
            r8.put(r0, r2)
            r0 = 3
            X.INE r3 = new X.INE
            r3.<init>(r0)
            int r0 = r11.nextClearBit(r9)
            if (r0 < r10) goto L_0x03c5
            java.lang.String r0 = "com.bloks.www.bloks.commerce.shox.storefront"
            X.FBO r2 = X.HX9.A00(r0)
            java.util.HashMap r0 = X.C359608dC.A01(r8)
            r2.A04 = r0
            r2.A03 = r5
            r2.A02 = r3
            r2.A01(r7, r6)
        L_0x01a7:
            X.1Xj r0 = r1.A03
            if (r0 == 0) goto L_0x033d
            r2 = 1
            boolean r0 = X.C51968G9o.A1W(r4, r0)
            if (r0 != r2) goto L_0x033d
            X.4DU r9 = r1.A0R
            java.lang.String r6 = r1.A0V
            X.1Xj r5 = r1.A03
            java.lang.String r7 = r1.A0T
            java.lang.String r3 = r1.A0S
            java.lang.String r2 = "tap_view_shop"
            java.lang.String r0 = "instagram_ad_"
            java.lang.String r0 = X.002.A0R(r0, r2)
            X.3sc r2 = new X.3sc
            r2.<init>(r9, r0)
            r2.A0G(r4, r5)
            r2.A6V = r7
            r2.A6S = r6
            r2.A5C = r3
            java.lang.String r0 = "shopping"
            r2.A4J = r0
            X.C18694Vws.A00(r4, r2, r5, r9)
        L_0x01d9:
            com.instagram.api.schemas.SellerShoppableFeedType r8 = r1.A0O
            java.lang.String r0 = "instagram_shopping_mini_shop_storefront"
            X.0xG r6 = new X.0xG
            r6.<init>(r0)
            android.os.Bundle r0 = r1.A00()
            java.lang.String r3 = X.C228022kf.A00(r0)
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>()
            X.VaQ r13 = r1.A01()
            r5 = 1
            android.os.Bundle r0 = r1.A00()
            java.lang.String r11 = X.C228022kf.A00(r0)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.lang.String r0 = "merchant_igid"
            r10.put(r0, r7)
            java.lang.String r2 = r9.getModuleName()
            java.lang.String r0 = "prior_module"
            r10.put(r0, r2)
            java.lang.String r2 = r1.A0G
            java.lang.String r0 = "prior_submodule"
            r10.put(r0, r2)
            java.lang.String r0 = "shopping_session_id"
            r10.put(r0, r11)
            java.util.ArrayList r0 = r1.A0H
            r2 = 0
            if (r0 == 0) goto L_0x0227
            boolean r0 = X.DbT.A1b(r0)
            if (r0 != r5) goto L_0x0227
            r2 = 1
        L_0x0227:
            java.lang.String r11 = ","
            if (r2 == 0) goto L_0x023e
            java.util.ArrayList r2 = r1.A0H
            if (r2 == 0) goto L_0x033a
            r0 = 8
            java.util.List r0 = X.00k.A0d(r2, r0)
        L_0x0235:
            java.lang.String r2 = X.0mp.A05(r11, r0)
            java.lang.String r0 = "pinned_product_ids"
            r10.put(r0, r2)
        L_0x023e:
            java.lang.String r2 = r1.A0D
            if (r2 == 0) goto L_0x0247
            java.lang.String r0 = "request_source"
            r10.put(r0, r2)
        L_0x0247:
            java.util.List r2 = r1.A0I
            if (r2 == 0) goto L_0x025e
            boolean r0 = X.AnonymousClass7TE.A1b(r2)
            if (r0 == 0) goto L_0x025e
            java.lang.String r2 = X.0mp.A05(r11, r2)
            r0 = 1874(0x752, float:2.626E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.put(r0, r2)
        L_0x025e:
            X.1Xj r12 = r1.A03
            if (r12 == 0) goto L_0x0298
            java.lang.String r2 = r12.getId()
            java.lang.String r0 = "m_pk"
            r10.put(r0, r2)
            boolean r0 = r12.CcK()
            java.lang.String r11 = "media_id"
            if (r0 == 0) goto L_0x0283
            java.lang.String r2 = X.C231122qu.A0F(r4, r12)
            java.lang.String r0 = r12.getId()
            r10.put(r11, r0)
            java.lang.String r0 = "tracking_token"
            r10.put(r0, r2)
        L_0x0283:
            java.lang.String r2 = r1.A0S
            r0 = 967(0x3c7, float:1.355E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0298
            java.lang.String r0 = r12.getId()
            r10.put(r11, r0)
        L_0x0298:
            boolean r0 = r1.A0J
            if (r0 == 0) goto L_0x02a3
            java.lang.String r2 = "disable_pull_to_refresh"
            java.lang.String r0 = "true"
            r10.put(r2, r0)
        L_0x02a3:
            java.lang.String r2 = r1.A0C
            if (r2 == 0) goto L_0x02ac
            java.lang.String r0 = "profile_entry_igid"
            r10.put(r0, r2)
        L_0x02ac:
            int r2 = X.C14615TzM.A00(r13)
            java.lang.String r0 = "mini_shop_request_builder"
            r14.putInt(r0, r2)
            java.lang.String r0 = "bloks_params"
            r14.putSerializable(r0, r10)
            java.lang.String r2 = r1.A0U
            java.lang.String r0 = "product_feed_label"
            r14.putString(r0, r2)
            java.lang.String r0 = "seller_shoppable_feed_type"
            r14.putSerializable(r0, r8)
            java.lang.String r0 = "displayed_user_id"
            r14.putString(r0, r7)
            r2 = 0
            java.lang.String r0 = "attribution_username"
            r14.putString(r0, r2)
            X.DbU.A1D(r14, r4)
            r1.A03(r3, r6)
            X.37E r0 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r13 = r1.A0P
            X.37D r2 = r0.A01(r13)
            boolean r0 = r1.A0J
            if (r0 == 0) goto L_0x030e
            java.lang.String r1 = "mini_shop_bloks"
            java.lang.String r0 = "content_fragment_type"
            r14.putString(r0, r1)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r16 = com.instagram.modal.TransparentModalActivity.class
            X.6W8 r12 = new X.6W8
            r17 = r1
            r15 = r4
            r12.<init>(r13, r14, r15, r16, r17)
            r2 = 2130772079(0x7f01006f, float:1.7147266E38)
            r1 = 2130772077(0x7f01006d, float:1.7147262E38)
            r0 = 2130772078(0x7f01006e, float:1.7147264E38)
            int[] r0 = new int[]{r2, r1, r1, r0}
            r12.A0J = r0
            X.WNJ r0 = new X.WNJ
            r0.<init>(r7)
            r12.A01 = r0
        L_0x030a:
            r12.A0C(r13)
            return
        L_0x030e:
            if (r2 == 0) goto L_0x0386
            X.37F r2 = (X.AnonymousClass37F) r2
            boolean r0 = r2.A0g
            if (r0 == 0) goto L_0x0386
            java.lang.Class<com.instagram.modal.ModalActivity> r16 = com.instagram.modal.ModalActivity.class
            java.lang.String r17 = "mini_shop_bloks"
            X.6W8 r12 = new X.6W8
            r15 = r4
            r12.<init>(r13, r14, r15, r16, r17)
            r12.A02 = r9
            X.WNJ r0 = new X.WNJ
            r0.<init>(r7)
            r12.A01 = r0
            boolean r0 = r1.A0L
            if (r0 != 0) goto L_0x0330
            r12.A08()
        L_0x0330:
            androidx.fragment.app.Fragment r1 = r1.A00
            if (r1 == 0) goto L_0x030a
            r0 = 12
            r12.A0D(r1, r0)
            return
        L_0x033a:
            r0 = 0
            goto L_0x0235
        L_0x033d:
            X.4DU r9 = r1.A0R
            java.lang.String r0 = r1.A0W
            r17 = r0
            java.lang.String r15 = r1.A0V
            X.1Xj r14 = r1.A03
            java.lang.String r7 = r1.A0T
            java.lang.String r13 = r1.A0C
            if (r13 != 0) goto L_0x034e
            r13 = r7
        L_0x034e:
            java.lang.String r12 = r1.A0G
            java.lang.String r11 = r1.A04
            java.lang.String r10 = r1.A0B
            java.lang.String r8 = r1.A05
            java.lang.String r6 = r1.A06
            java.lang.String r5 = r1.A07
            java.lang.String r3 = r1.A09
            java.lang.String r2 = r1.A0A
            com.instagram.api.schemas.RankingInfo r0 = r1.A01
            r16 = r9
            r18 = r15
            r19 = r7
            r20 = r13
            r21 = r12
            r22 = r12
            r23 = r11
            r24 = r10
            r25 = r8
            r26 = r6
            r27 = r5
            r28 = r3
            r29 = r2
            r15 = r14
            r14 = r4
            r13 = r0
            X.W3r.A03(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x01d9
        L_0x0382:
            java.lang.String r14 = "organic"
            goto L_0x0121
        L_0x0386:
            X.0Tu r0 = X.0Tu.A06
            r2 = 36319669384126006(0x81088c00001e36, double:3.032043393866694E-306)
            boolean r0 = X.182.A06(r0, r4, r2)
            r2 = r0 ^ 1
            java.lang.String r0 = "should_show_tab_bar"
            r14.putBoolean(r0, r2)
            X.6Yo r2 = new X.6Yo
            r2.<init>(r13, r4)
            boolean r0 = r1.A0M
            if (r0 == 0) goto L_0x03a4
            r0 = 0
            r2.A0D = r0
        L_0x03a4:
            X.3kF r0 = X.C249713kF.A00
            X.W3Y r0 = r0.A0T()
            androidx.fragment.app.Fragment r0 = r0.A09(r14, r4)
            r2.A0D(r0)
            X.WNJ r0 = new X.WNJ
            r0.<init>(r7)
            r2.A07 = r0
            boolean r0 = r1.A0K
            if (r0 == 0) goto L_0x03c0
            r2.A0E = r5
            goto L_0x00ae
        L_0x03c0:
            r2.A08()
            goto L_0x00ae
        L_0x03c5:
            java.lang.IllegalStateException r1 = X.DbU.A0i()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W2P.A05():void");
    }

    public final void A06(String str, String str2, String str3, String str4, String str5) {
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A09 = str4;
        this.A0A = str5;
    }

    public W2P(FragmentActivity fragmentActivity, SellerShoppableFeedType sellerShoppableFeedType, UserSession userSession, AnonymousClass4DU r4, String str, String str2, String str3, String str4, String str5) {
        this.A0P = fragmentActivity;
        this.A0Q = userSession;
        this.A0R = r4;
        this.A0W = str;
        this.A0V = str2;
        this.A0T = str4;
        this.A0U = str5;
        this.A0S = str3;
        this.A0G = str3;
        this.A0O = sellerShoppableFeedType == null ? SellerShoppableFeedType.A06 : sellerShoppableFeedType;
    }
}
