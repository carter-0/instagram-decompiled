package com.instagram.debug.devoptions.section.localinjection.datastore;

import X.002;
import X.0Yv;
import X.0sr;
import X.AnonymousClass00P;
import X.AnonymousClass7TF;
import X.C13991Tnr;
import X.DbY;
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

public final class LocalStoriesNetegoInjectionDataStore implements LocalMediaInjectionDataStoreManager {
    public /* synthetic */ List getInjectedJSONStrings(Context context, Set set) {
        return LocalMediaInjectionDataStoreManager.CC.$default$getInjectedJSONStrings(this, context, set);
    }

    public Map getInjectionDataStore() {
        LocalInjectionUnit.Item item = new LocalInjectionUnit.Item("Bakeoff", "bakeoff.json", (String) null);
        int i = 0;
        LocalInjectionUnit.Item item2 = new LocalInjectionUnit.Item("Ad4Ad Image", "ad4ad_image.json", (String) null);
        LocalInjectionUnit.Item item3 = new LocalInjectionUnit.Item("Ad4Ad Video", "ad4ad_video.json", (String) null);
        LocalInjectionUnit.Item item4 = new LocalInjectionUnit.Item("Suggested Users", "suggested_users_shuffle.json", (String) null);
        LocalInjectionUnit.Item item5 = new LocalInjectionUnit.Item("Quality Survey", "netego_quality_survey.json", (String) null);
        LocalInjectionUnit.Item item6 = new LocalInjectionUnit.Item("Story Creation Upsell", "story_creation_upsell.json", (String) null);
        LocalInjectionUnit.Item item7 = new LocalInjectionUnit.Item("Suggested Clips", "suggested_clips.json", (String) null);
        LocalInjectionUnit.Item item8 = new LocalInjectionUnit.Item("Products For You", "products_for_you.json", (String) null);
        LocalInjectionUnit.Item item9 = new LocalInjectionUnit.Item("Affiliate Top Brands", "affiliate_top_brands.json", (String) null);
        LocalInjectionUnit.Item item10 = new LocalInjectionUnit.Item("Shops You Might Like", "shops_you_might_like.json", (String) null);
        LocalInjectionUnit.Item item11 = new LocalInjectionUnit.Item("Ads Consent Growth", "ig_ads_consent_growth.json", (String) null);
        LocalInjectionUnit.Item item12 = item7;
        LocalInjectionUnit.Item item13 = item8;
        LocalInjectionUnit.Item item14 = item9;
        LocalInjectionUnit.Item item15 = item10;
        LocalInjectionUnit.Item item16 = item11;
        LocalInjectionUnit.Item item17 = item2;
        LocalInjectionUnit.Item item18 = item3;
        LocalInjectionUnit.Item item19 = item4;
        LocalInjectionUnit.Item item20 = item5;
        LocalInjectionUnit.Item item21 = item6;
        List A1P = 0sr.A1P(new LocalInjectionUnit.Item[]{item, item17, item18, item19, item20, item21, item12, item13, item14, item15, item16, new LocalInjectionUnit.Item("Insights Stories", "ig_insights.json", (String) null), new LocalInjectionUnit.Item("Share Comment to Story - Reel", "share_comment_to_story_reel.json", (String) null), new LocalInjectionUnit.Item("Share Comment to Story - Feed", "share_comment_to_story_feed.json", (String) null), new LocalInjectionUnit.Item("Meta Gallery Stories Netego", "meta_gallery_stories_netego.json", (String) null), new LocalInjectionUnit.Item("Trending Add Yours", "trending_add_yours_midcard.json", (String) null)});
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
                str = 002.A0O("stories_netego_", i);
            }
            A0p.add(new LocalInjectionUnit(str, 002.A0R("stories_netego/", item22.filename), item22.name, LocalInjectionUnit.InjectionUnitType.STORIES_NETEGO));
            i = i2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(DbY.A00(0Yv.A1E(A0p, 10)));
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
