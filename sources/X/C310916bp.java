package X;

import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6bp  reason: invalid class name and case insensitive filesystem */
public final class C310916bp extends C230372pW {
    public final C310006aH A00;

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.2n2] */
    public C310916bp(1Bk r2, C310006aH r3) {
        super(r2, new Object());
        this.A00 = r3;
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        long j;
        String str;
        Long l;
        String str2;
        ArrayList arrayList;
        String str3;
        Long l2;
        Boolean bool;
        String str4;
        Integer num;
        String str5;
        AnonymousClass3OA r1;
        Integer num2;
        C250973mM r8 = (C250973mM) obj;
        0qQ.A0B(r8, 0);
        C310006aH r4 = this.A00;
        if (r4 != null) {
            0wc r2 = r4.A02;
            0Aj A002 = r2.A00(r2.A00, "instagram_ad_pivots_impression");
            if (A002.isSampled()) {
                C270424gi r0 = r4.A00;
                if (r0 != null) {
                    j = (long) r0.CMI(r8);
                } else {
                    j = 0;
                }
                A002.A9F("chaining_position", Long.valueOf(j));
                C249763kK r3 = r4.A04;
                A002.AAJ("chaining_session_id", r3.getSessionId());
                A002.AAJ("client_session_id", r3.getSessionId());
                A002.AAJ("contextual_ads_category", "");
                A002.AAe("ad_ids", C310006aH.A00(r8));
                A002.A9F("first_hscroll_item_ad_id", (Long) C310006aH.A00(r8).get(0));
                A002.AAJ("container_module", r4.A01.getModuleName());
                Reel reel = r8.A0H;
                IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
                Long l3 = null;
                if (intentAwareAdsInfo != null) {
                    str = intentAwareAdsInfo.A09;
                } else {
                    str = null;
                }
                A002.AAJ("trigger_type", str);
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
                A002.AAJ("multi_ads_unit_id", str2);
                List<AnonymousClass3OA> A0J = reel.A0J();
                0qQ.A07(A0J);
                if (C297785sK.A0l(r8)) {
                    ArrayList arrayList2 = new ArrayList(0Yv.A1E(A0J, 10));
                    for (AnonymousClass3OA r02 : A0J) {
                        arrayList2.add(r02.A0j);
                    }
                    arrayList = arrayList2;
                } else {
                    String str6 = null;
                    if ((!A0J.isEmpty()) && (r1 = (AnonymousClass3OA) 00k.A0J(A0J)) != null) {
                        str6 = r1.A0j;
                    }
                    arrayList = 0sr.A1N(str6);
                }
                A002.AAe("tracking_tokens", arrayList);
                IntentAwareAdsInfo intentAwareAdsInfo4 = reel.A0B;
                if (intentAwareAdsInfo4 != null) {
                    str3 = intentAwareAdsInfo4.A04;
                } else {
                    str3 = null;
                }
                A002.AAJ("insertion_mechanism", str3);
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
    }
}
