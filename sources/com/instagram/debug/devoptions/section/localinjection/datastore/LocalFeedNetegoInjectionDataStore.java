package com.instagram.debug.devoptions.section.localinjection.datastore;

import X.002;
import X.0Yv;
import X.0sr;
import X.AnonymousClass00P;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13991Tnr;
import X.Dba;
import android.content.Context;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalInjectionUnit;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionDataStoreManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class LocalFeedNetegoInjectionDataStore implements LocalMediaInjectionDataStoreManager {
    public /* synthetic */ List getInjectedJSONStrings(Context context, Set set) {
        return LocalMediaInjectionDataStoreManager.CC.$default$getInjectedJSONStrings(this, context, set);
    }

    public Map getInjectionDataStore() {
        LocalInjectionUnit.Item item = new LocalInjectionUnit.Item("Feed Ad vs Feed Organic Bakeoff", "feed_ad_vs_organic_bakeoff.json", (String) null);
        int i = 0;
        LocalInjectionUnit.Item item2 = new LocalInjectionUnit.Item("Mlex Survey", "feed_mlex_survey.json", (String) null);
        LocalInjectionUnit.Item item3 = new LocalInjectionUnit.Item("Mlex Survey 2", "feed_mlex_survey_2.json", (String) null);
        LocalInjectionUnit.Item item4 = new LocalInjectionUnit.Item("ASQ Survey", "feed_asq_survey.json", (String) null);
        LocalInjectionUnit.Item item5 = new LocalInjectionUnit.Item("Inline Survey (IG-WYT)", "feed_inline_survey.json", (String) null);
        LocalInjectionUnit.Item item6 = new LocalInjectionUnit.Item("Ad Likeness Survey", "feed_ad_likeness_survey.json", (String) null);
        LocalInjectionUnit.Item item7 = new LocalInjectionUnit.Item("Feed Organic vs Feed Organic Bakeoff", "feed_organic_vs_organic_bakeoff.json", (String) null);
        LocalInjectionUnit.Item item8 = new LocalInjectionUnit.Item("Story Sentiment Survey", "feed_story_sentiment_survey.json", (String) null);
        LocalInjectionUnit.Item item9 = new LocalInjectionUnit.Item("ACQS (Story Ads User Sentiment) Survey", "feed_acqs_survey.json", (String) null);
        LocalInjectionUnit.Item item10 = new LocalInjectionUnit.Item("Suggested Users", "feed_su.json", (String) null);
        LocalInjectionUnit.Item item11 = new LocalInjectionUnit.Item("Clips Netego", "feed_clips_netego.json", (String) null);
        LocalInjectionUnit.Item item12 = item8;
        LocalInjectionUnit.Item item13 = item9;
        LocalInjectionUnit.Item item14 = item10;
        LocalInjectionUnit.Item item15 = item11;
        LocalInjectionUnit.Item item16 = item4;
        LocalInjectionUnit.Item item17 = item5;
        LocalInjectionUnit.Item item18 = item6;
        LocalInjectionUnit.Item item19 = item7;
        LocalInjectionUnit.Item item20 = item2;
        LocalInjectionUnit.Item item21 = item3;
        List A1P = 0sr.A1P(new LocalInjectionUnit.Item[]{item, item20, item21, item16, item17, item18, item19, item12, item13, item14, item15, new LocalInjectionUnit.Item("Ad4ad", "ad4ad.json", (String) null), new LocalInjectionUnit.Item("Follow Requests", "follow_requests.json", (String) null), new LocalInjectionUnit.Item("Follow Requests (updated social context", "follow_requests_updated_social_context.json", (String) null), new LocalInjectionUnit.Item("Take A Break Nudge (uses Ad4Ad layout)", "take_a_break.json", (String) null)});
        ArrayList A0p = AnonymousClass7TF.A0p(A1P);
        for (Object next : A1P) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            LocalInjectionUnit.Item item22 = (LocalInjectionUnit.Item) next;
            String str = item22.id;
            if (str == null) {
                str = 002.A0O("feed_netego_", i);
            }
            A0p.add(new LocalInjectionUnit(str, 002.A0R("feed_netego/", item22.filename), item22.name, LocalInjectionUnit.InjectionUnitType.FEED_NETEGO));
            i = i2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(0Yv.A1E(A0p, 10)));
        Iterator it = A0p.iterator();
        while (it.hasNext()) {
            C13991Tnr.A1T(it, linkedHashMap);
        }
        return linkedHashMap;
    }

    public /* synthetic */ List getAllInjectionItems() {
        return Dba.A0e(getInjectionDataStore());
    }
}
