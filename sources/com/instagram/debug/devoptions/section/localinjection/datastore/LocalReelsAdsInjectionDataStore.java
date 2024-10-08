package com.instagram.debug.devoptions.section.localinjection.datastore;

import X.002;
import X.0Yv;
import X.0sr;
import X.AnonymousClass00P;
import X.AnonymousClass7TF;
import X.C13991Tnr;
import X.C13992Tns;
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

public final class LocalReelsAdsInjectionDataStore implements LocalMediaInjectionDataStoreManager {
    public /* synthetic */ List getInjectedJSONStrings(Context context, Set set) {
        return LocalMediaInjectionDataStoreManager.CC.$default$getInjectedJSONStrings(this, context, set);
    }

    public Map getInjectionDataStore() {
        LocalInjectionUnit.Item item = new LocalInjectionUnit.Item("Basic 9:16 Video Ad", "clips_916_ad.json", (String) null);
        LocalInjectionUnit.Item item2 = new LocalInjectionUnit.Item("Basic non 9:16 Video Ad", "clips_non_916_ad.json", (String) null);
        LocalInjectionUnit.Item item3 = new LocalInjectionUnit.Item("PBIA Ad", "clips_pbia_ad.json", (String) null);
        LocalInjectionUnit.Item item4 = new LocalInjectionUnit.Item("Showreel Composition Image Ad", "clips_showreel_composition_image_ad.json", (String) null);
        LocalInjectionUnit.Item item5 = new LocalInjectionUnit.Item("Showreel Native Ad", "clips_showreel_native_ad.json", (String) null);
        LocalInjectionUnit.Item item6 = new LocalInjectionUnit.Item("Basic Ad with Disclaimer URL", "clips_disclaimer_url_ad.json", (String) null);
        LocalInjectionUnit.Item item7 = new LocalInjectionUnit.Item("Basic Ad with Disclaimer Text", "clips_disclaimer_text_ad.json", (String) null);
        LocalInjectionUnit.Item item8 = new LocalInjectionUnit.Item("Mid-Scene V2 with Attached Module", "clips_mid_scene_v2_attached_module.json", (String) null);
        LocalInjectionUnit.Item item9 = new LocalInjectionUnit.Item("App install Ad with app metadata", "clips_mai_ad.json", (String) null);
        LocalInjectionUnit.Item item10 = new LocalInjectionUnit.Item("Carousel Ad", "clips_carousel_ad.json", (String) null);
        LocalInjectionUnit.Item item11 = new LocalInjectionUnit.Item("INI and Mid-Scene V2 with Attached Module 1", "clips_ini_mid_scene_v2_attached_module_1.json", (String) null);
        LocalInjectionUnit.Item item12 = new LocalInjectionUnit.Item("INI and Mid-Scene V2 with Attached Module 2", "clips_ini_mid_scene_v2_attached_module_2.json", (String) null);
        LocalInjectionUnit.Item item13 = item9;
        LocalInjectionUnit.Item item14 = item10;
        LocalInjectionUnit.Item item15 = item11;
        LocalInjectionUnit.Item item16 = item12;
        LocalInjectionUnit.Item item17 = item5;
        LocalInjectionUnit.Item item18 = item6;
        LocalInjectionUnit.Item item19 = item7;
        LocalInjectionUnit.Item item20 = item8;
        LocalInjectionUnit.Item item21 = item2;
        LocalInjectionUnit.Item item22 = item3;
        LocalInjectionUnit.Item item23 = item4;
        List A1P = 0sr.A1P(new LocalInjectionUnit.Item[]{item, item21, item22, item23, item17, item18, item19, item20, item13, item14, item15, item16, new LocalInjectionUnit.Item("Multi Ad Grid Format with All Image Aspect Ratios", "multi_ad_grid_format_image.json", (String) null), new LocalInjectionUnit.Item("Multi Ad Grid Format with All Video Aspect Ratios", "multi_ad_grid_format_video.json", (String) null), new LocalInjectionUnit.Item("Delayed Skip Ad", "clips_delayed_skip_ad.json", (String) null), new LocalInjectionUnit.Item("Ad with preview comment", "clips_ad_preview_comment.json", (String) null)});
        ArrayList A0p = AnonymousClass7TF.A0p(A1P);
        int i = 0;
        for (Object next : A1P) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            LocalInjectionUnit.Item item24 = (LocalInjectionUnit.Item) next;
            A0p.add(new LocalInjectionUnit(C13992Tns.A0L(item24), 002.A0R("reels_ads/", item24.filename), item24.name, LocalInjectionUnit.InjectionUnitType.REELS_ADS));
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
