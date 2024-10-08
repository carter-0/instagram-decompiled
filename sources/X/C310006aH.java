package X;

import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6aH  reason: invalid class name and case insensitive filesystem */
public final class C310006aH {
    public C270424gi A00;
    public final AnonymousClass0iw A01;
    public final 0wc A02;
    public final UserSession A03;
    public final C249763kK A04;

    public C310006aH(AnonymousClass0iw r2, UserSession userSession, C249763kK r4) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = r4;
        this.A01 = r2;
        AnonymousClass0kM r0 = new AnonymousClass0kM(userSession);
        r0.A00 = r2;
        this.A02 = r0.A00();
    }

    public final void A02(AnonymousClass3DY r5, Integer num, String str, String str2, String str3, String str4, int i, int i2, boolean z) {
        0qQ.A0B(num, 3);
        0wc r2 = this.A02;
        0Aj A002 = r2.A00(r2.A00, "instagram_ad_pivots_fetch_skip");
        if (A002.isSampled()) {
            A002.A9F("chaining_position", 0L);
            C249763kK r3 = this.A04;
            A002.AAJ("chaining_session_id", r3.getSessionId());
            A002.AAJ("client_session_id", r3.getSessionId());
            A002.AAJ("contextual_ads_category", "");
            A002.AAJ("container_module", "reel_feed_timeline");
            A002.AAJ("trigger_type", r5.A00);
            A002.A9F("multi_ads_type_number", Long.valueOf((long) AnonymousClass59V.A00(num)));
            A002.AAJ("invalidation_reason", str3);
            A002.A9F("hscroll_seed_ad_id", 00y.A0n(10, str));
            A002.A9F("hscroll_seed_ad_position", Long.valueOf((long) i));
            A002.A9F("num_ads_in_ad_pool", Long.valueOf((long) i2));
            A002.AAJ("top_of_ad_pool_ad_id", str2);
            A002.A7p("is_seed_ad_multi_ads_eligible", Boolean.valueOf(z));
            A002.AAJ("hscroll_seed_ad_tracking_token", str4);
            A002.Cgf();
        }
    }

    public final void A03(C250973mM r6) {
        long j;
        String str;
        Long l;
        String str2;
        String str3;
        String str4;
        Long l2;
        Boolean bool;
        String str5;
        Integer num;
        String str6;
        Integer num2;
        0qQ.A0B(r6, 0);
        0wc r2 = this.A02;
        0Aj A002 = r2.A00(r2.A00, "instagram_ad_pivots_dismiss");
        if (A002.isSampled()) {
            C270424gi r0 = this.A00;
            if (r0 != null) {
                j = (long) r0.CMI(r6);
            } else {
                j = 0;
            }
            A002.A9F("chaining_position", Long.valueOf(j));
            C249763kK r3 = this.A04;
            A002.AAJ("chaining_session_id", r3.getSessionId());
            A002.AAJ("client_session_id", r3.getSessionId());
            A002.AAJ("contextual_ads_category", "");
            A002.AAe("ad_ids", A00(r6));
            A002.A9F("first_hscroll_item_ad_id", (Long) A00(r6).get(0));
            Reel reel = r6.A0H;
            IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
            Long l3 = null;
            if (intentAwareAdsInfo != null) {
                str = intentAwareAdsInfo.A09;
            } else {
                str = null;
            }
            A002.AAJ("trigger_type", str);
            A002.AAJ("container_module", this.A01.getModuleName());
            IntentAwareAdsInfo intentAwareAdsInfo2 = reel.A0B;
            if (intentAwareAdsInfo2 == null || (num2 = intentAwareAdsInfo2.A02) == null) {
                l = null;
            } else {
                l = Long.valueOf((long) num2.intValue());
            }
            A002.A9F("multi_ads_type_number", l);
            IntentAwareAdsInfo intentAwareAdsInfo3 = reel.A0B;
            if (intentAwareAdsInfo3 != null) {
                str2 = intentAwareAdsInfo3.A06;
            } else {
                str2 = null;
            }
            A002.AAJ("multi_ads_id", str2);
            IntentAwareAdsInfo intentAwareAdsInfo4 = reel.A0B;
            if (intentAwareAdsInfo4 != null) {
                str3 = intentAwareAdsInfo4.A06;
            } else {
                str3 = null;
            }
            A002.AAJ("multi_ads_unit_id", str3);
            IntentAwareAdsInfo intentAwareAdsInfo5 = reel.A0B;
            if (intentAwareAdsInfo5 != null) {
                str4 = intentAwareAdsInfo5.A04;
            } else {
                str4 = null;
            }
            A002.AAJ("insertion_mechanism", str4);
            IntentAwareAdsInfo intentAwareAdsInfo6 = reel.A0B;
            if (intentAwareAdsInfo6 == null || (str6 = intentAwareAdsInfo6.A07) == null) {
                l2 = null;
            } else {
                l2 = 00y.A0n(10, str6);
            }
            A002.A9F("hscroll_seed_ad_id", l2);
            IntentAwareAdsInfo intentAwareAdsInfo7 = reel.A0B;
            if (intentAwareAdsInfo7 != null) {
                bool = intentAwareAdsInfo7.A01;
            } else {
                bool = null;
            }
            A002.A7p("is_seed_ad_multi_ads_eligible", bool);
            IntentAwareAdsInfo intentAwareAdsInfo8 = reel.A0B;
            if (intentAwareAdsInfo8 != null) {
                str5 = intentAwareAdsInfo8.A08;
            } else {
                str5 = null;
            }
            A002.AAJ("hscroll_seed_ad_tracking_token", str5);
            IntentAwareAdsInfo intentAwareAdsInfo9 = reel.A0B;
            if (!(intentAwareAdsInfo9 == null || (num = intentAwareAdsInfo9.A03) == null)) {
                l3 = Long.valueOf((long) num.intValue());
            }
            A002.A9F("hscroll_seed_ad_position", l3);
            A002.Cgf();
        }
    }

    public final void A04(C250973mM r7, int i, int i2) {
        long j;
        Long l;
        String str;
        String str2;
        String str3;
        Long l2;
        Boolean bool;
        String str4;
        Integer num;
        String str5;
        Integer num2;
        0wc r2 = this.A02;
        0Aj A002 = r2.A00(r2.A00, "instagram_ad_pivots_scroll");
        if (A002.isSampled()) {
            C270424gi r0 = this.A00;
            if (r0 != null) {
                j = (long) r0.CMI(r7);
            } else {
                j = 0;
            }
            A002.A9F("chaining_position", Long.valueOf(j));
            C249763kK r3 = this.A04;
            A002.AAJ("chaining_session_id", r3.getSessionId());
            A002.AAJ("client_session_id", r3.getSessionId());
            A002.AAe("ad_ids", A00(r7));
            A002.A9F("first_hscroll_item_ad_id", (Long) A00(r7).get(0));
            A002.AAJ("container_module", this.A01.getModuleName());
            Reel reel = r7.A0H;
            IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
            Long l3 = null;
            if (intentAwareAdsInfo == null || (num2 = intentAwareAdsInfo.A02) == null) {
                l = null;
            } else {
                l = Long.valueOf((long) num2.intValue());
            }
            A002.A9F("multi_ads_type_number", l);
            IntentAwareAdsInfo intentAwareAdsInfo2 = reel.A0B;
            if (intentAwareAdsInfo2 != null) {
                str = intentAwareAdsInfo2.A06;
            } else {
                str = null;
            }
            A002.AAJ("multi_ads_id", str);
            IntentAwareAdsInfo intentAwareAdsInfo3 = reel.A0B;
            if (intentAwareAdsInfo3 != null) {
                str2 = intentAwareAdsInfo3.A06;
            } else {
                str2 = null;
            }
            A002.AAJ("multi_ads_unit_id", str2);
            IntentAwareAdsInfo intentAwareAdsInfo4 = reel.A0B;
            if (intentAwareAdsInfo4 != null) {
                str3 = intentAwareAdsInfo4.A04;
            } else {
                str3 = null;
            }
            A002.AAJ("insertion_mechanism", str3);
            A002.A9F("from_hscroll_position", Long.valueOf((long) i));
            A002.A9F("to_hscroll_position", Long.valueOf((long) i2));
            IntentAwareAdsInfo intentAwareAdsInfo5 = reel.A0B;
            if (intentAwareAdsInfo5 == null || (str5 = intentAwareAdsInfo5.A07) == null) {
                l2 = null;
            } else {
                l2 = 00y.A0n(10, str5);
            }
            A002.A9F("hscroll_seed_ad_id", l2);
            IntentAwareAdsInfo intentAwareAdsInfo6 = reel.A0B;
            if (intentAwareAdsInfo6 != null) {
                bool = intentAwareAdsInfo6.A01;
            } else {
                bool = null;
            }
            A002.A7p("is_seed_ad_multi_ads_eligible", bool);
            A002.A7p("is_auto_scroll", false);
            IntentAwareAdsInfo intentAwareAdsInfo7 = reel.A0B;
            if (intentAwareAdsInfo7 != null) {
                str4 = intentAwareAdsInfo7.A08;
            } else {
                str4 = null;
            }
            A002.AAJ("hscroll_seed_ad_tracking_token", str4);
            IntentAwareAdsInfo intentAwareAdsInfo8 = reel.A0B;
            if (!(intentAwareAdsInfo8 == null || (num = intentAwareAdsInfo8.A03) == null)) {
                l3 = Long.valueOf((long) num.intValue());
            }
            A002.A9F("hscroll_seed_ad_position", l3);
            A002.Cgf();
        }
    }

    public static final List A00(C250973mM r3) {
        AnonymousClass3OA r1;
        String str;
        List<AnonymousClass3OA> A0J = r3.A0H.A0J();
        0qQ.A07(A0J);
        if (C297785sK.A0l(r3)) {
            ArrayList arrayList = new ArrayList(0Yv.A1E(A0J, 10));
            for (AnonymousClass3OA r0 : A0J) {
                arrayList.add(Long.valueOf(Long.parseLong(r0.A0S)));
            }
            return arrayList;
        }
        Long l = null;
        if (!(!(!A0J.isEmpty()) || (r1 = (AnonymousClass3OA) 00k.A0J(A0J)) == null || (str = r1.A0S) == null)) {
            l = 00y.A0n(10, str);
        }
        return 0sr.A1N(l);
    }

    public static final void A01(IntentAwareAdsInfoIntf intentAwareAdsInfoIntf, AnonymousClass3DY r6, C310006aH r7, Integer num, String str, String str2, List list) {
        String str3;
        Long l;
        Long l2;
        Long l3;
        String str4;
        String str5;
        String str6;
        Integer BUY;
        0wc r2 = r7.A02;
        0Aj A002 = r2.A00(r2.A00, "instagram_ad_pivots_delivery");
        if (A002.isSampled()) {
            A002.A9F("chaining_position", 0L);
            C249763kK r3 = r7.A04;
            A002.AAJ("chaining_session_id", r3.getSessionId());
            A002.AAJ("client_session_id", r3.getSessionId());
            A002.AAJ("contextual_ads_category", "");
            A002.AAJ("container_module", "reel_feed_timeline");
            Boolean bool = null;
            if (r6 != null) {
                str3 = r6.A00;
            } else {
                str3 = null;
            }
            A002.AAJ("trigger_type", str3);
            if (intentAwareAdsInfoIntf == null || (BUY = intentAwareAdsInfoIntf.BUY()) == null) {
                l = null;
            } else {
                l = Long.valueOf((long) BUY.intValue());
            }
            A002.A9F("multi_ads_type_number", l);
            if (str != null) {
                l2 = 00y.A0n(10, str);
            } else {
                l2 = null;
            }
            A002.A9F("hscroll_seed_ad_id", l2);
            if (num != null) {
                l3 = Long.valueOf((long) num.intValue());
            } else {
                l3 = null;
            }
            A002.A9F("hscroll_seed_ad_position", l3);
            ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(A00((C250973mM) it.next()));
            }
            A002.AAe("ad_ids", 00k.A0W(0Yv.A1F(arrayList)));
            if (intentAwareAdsInfoIntf != null) {
                str4 = intentAwareAdsInfoIntf.BUa();
            } else {
                str4 = null;
            }
            A002.AAJ("multi_ads_id", str4);
            if (intentAwareAdsInfoIntf != null) {
                str5 = intentAwareAdsInfoIntf.BUa();
            } else {
                str5 = null;
            }
            A002.AAJ("multi_ads_unit_id", str5);
            if (intentAwareAdsInfoIntf != null) {
                str6 = intentAwareAdsInfoIntf.BHg();
            } else {
                str6 = null;
            }
            A002.AAJ("insertion_mechanism", str6);
            if (intentAwareAdsInfoIntf != null) {
                bool = intentAwareAdsInfoIntf.CbN();
            }
            A002.A7p("is_seed_ad_multi_ads_eligible", bool);
            A002.AAJ("hscroll_seed_ad_tracking_token", str2);
            A002.Cgf();
        }
    }
}
