package X;

import com.instagram.api.schemas.IntentAwareAdsInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.6Vi  reason: invalid class name and case insensitive filesystem */
public final class C308716Vi implements C233782wS {
    public final C310006aH A00;
    public final C249863kU A01;
    public final HashSet A02 = new HashSet();

    public C308716Vi(C310006aH r2, C249863kU r3) {
        0qQ.A0B(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void D1r() {
    }

    public final void Dwr(Collection collection, int i) {
        String str;
        0qQ.A0B(collection, 0);
        ArrayList arrayList = new ArrayList(0Yv.A1E(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C250973mM r3 = (C250973mM) it.next();
            C297785sK.A0l(r3);
            IntentAwareAdsInfo intentAwareAdsInfo = r3.A0H.A0B;
            C60340gF r7 = null;
            if (!(intentAwareAdsInfo == null || (str = intentAwareAdsInfo.A06) == null)) {
                Integer num = intentAwareAdsInfo.A02;
                if (num != null && num.intValue() == 12) {
                    HashSet hashSet = this.A02;
                    if (!hashSet.contains(str)) {
                        C310006aH r8 = this.A00;
                        List singletonList = Collections.singletonList(r3);
                        0qQ.A07(singletonList);
                        C310006aH.A01(intentAwareAdsInfo, (AnonymousClass3DY) null, r8, (Integer) null, (String) null, (String) null, singletonList);
                        hashSet.add(str);
                    }
                }
                r7 = C60340gF.A00;
            }
            arrayList.add(r7);
        }
    }

    public final /* bridge */ /* synthetic */ void D6A(Object obj, List list, int i) {
        Long l;
        Long l2;
        Long l3;
        C250973mM r9 = (C250973mM) obj;
        0qQ.A0B(r9, 0);
        0qQ.A0B(list, 2);
        IntentAwareAdsInfo intentAwareAdsInfo = r9.A0H.A0B;
        if (intentAwareAdsInfo != null) {
            C310006aH r3 = this.A00;
            C249863kU r6 = this.A01;
            0wc r2 = r3.A02;
            0Aj A002 = r2.A00(r2.A00, "instagram_ad_pivots_insertion_success");
            if (A002.isSampled()) {
                A002.A9F("chaining_position", Long.valueOf((long) i));
                C249763kK r22 = r3.A04;
                A002.AAJ("chaining_session_id", r22.getSessionId());
                A002.AAJ("client_session_id", r22.getSessionId());
                A002.AAJ("contextual_ads_category", "");
                A002.AAJ("container_module", "reel_feed_timeline");
                A002.AAJ("trigger_type", intentAwareAdsInfo.C9y());
                Integer BUY = intentAwareAdsInfo.BUY();
                String str = null;
                if (BUY != null) {
                    l = Long.valueOf((long) BUY.intValue());
                } else {
                    l = null;
                }
                A002.A9F("multi_ads_type_number", l);
                A002.AAJ("insertion_mechanism", intentAwareAdsInfo.BHg());
                String Br2 = intentAwareAdsInfo.Br2();
                if (Br2 != null) {
                    l2 = 00y.A0n(10, Br2);
                } else {
                    l2 = null;
                }
                A002.A9F("hscroll_seed_ad_id", l2);
                Integer Br3 = intentAwareAdsInfo.Br3();
                if (Br3 != null) {
                    l3 = Long.valueOf((long) Br3.intValue());
                } else {
                    l3 = null;
                }
                A002.A9F("hscroll_seed_ad_position", l3);
                A002.AAe("ad_ids", C310006aH.A00(r9));
                String BUa = intentAwareAdsInfo.BUa();
                A002.AAJ("multi_ads_id", BUa);
                A002.AAJ("multi_ads_unit_id", BUa);
                LinkedList linkedList = r6.A02;
                A002.A9F("num_ads_in_ad_pool", Long.valueOf((long) linkedList.size()));
                if (!linkedList.isEmpty()) {
                    List A0J = ((C250973mM) r6.A00().BTb()).A0H.A0J();
                    0qQ.A07(A0J);
                    AnonymousClass3OA r0 = (AnonymousClass3OA) 00k.A0J(A0J);
                    if (r0 != null) {
                        str = r0.A0S;
                    }
                }
                A002.AAJ("top_of_ad_pool_ad_id", str);
                A002.A7p("is_seed_ad_multi_ads_eligible", intentAwareAdsInfo.CbN());
                A002.AAJ("hscroll_seed_ad_tracking_token", intentAwareAdsInfo.Br4());
                A002.Cgf();
            }
        }
        if (list.contains("end_of_stories_did_meet") && !list.contains("highest_position_rule_did_meet") && !list.contains("highest_position_rule_and_consumed_media_gap_did_meet")) {
            C310006aH r4 = this.A00;
            0wc r23 = r4.A02;
            0Aj A003 = r23.A00(r23.A00, "instagram_ad_pivots_end_of_stories_insertion");
            if (A003.isSampled()) {
                A003.A9F("chaining_position", 0L);
                C249763kK r24 = r4.A04;
                A003.AAJ("chaining_session_id", r24.getSessionId());
                A003.AAJ("client_session_id", r24.getSessionId());
                A003.AAJ("contextual_ads_category", "");
                A003.AAJ("container_module", r4.A01.getModuleName());
                A003.AAe("ad_ids", C310006aH.A00(r9));
                A003.Cgf();
            }
        }
    }
}
