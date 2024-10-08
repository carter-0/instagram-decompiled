package com.instagram.debug.devoptions.section.localinjection.datastore;

import X.002;
import X.0Yv;
import X.0sr;
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

public final class LocalFeedAdsInjectionDataStore implements LocalMediaInjectionDataStoreManager {
    public /* synthetic */ List getInjectedJSONStrings(Context context, Set set) {
        return LocalMediaInjectionDataStoreManager.CC.$default$getInjectedJSONStrings(this, context, set);
    }

    public Map getInjectionDataStore() {
        LocalInjectionUnit.Item[] itemArr = new LocalInjectionUnit.Item[51];
        LocalInjectionUnit.Item item = new LocalInjectionUnit.Item("Carousel Ad", "feed_carousel_ad.json", (String) null);
        LocalInjectionUnit.Item item2 = new LocalInjectionUnit.Item("DPA Carousel Ad", "feed_dpa_carousel_ad.json", (String) null);
        LocalInjectionUnit.Item item3 = new LocalInjectionUnit.Item("Carousel Ad On-Demand Loading", "feed_carousel_ad_with_on_demand_loading.json", (String) null);
        LocalInjectionUnit.Item item4 = new LocalInjectionUnit.Item("App Install Ad", "feed_ad_with_app_install.json", (String) null);
        LocalInjectionUnit.Item item5 = new LocalInjectionUnit.Item("DeepLink Ad", "feed_ad_with_deep_link.json", (String) null);
        LocalInjectionUnit.Item item6 = new LocalInjectionUnit.Item("PBIA Ad", "feed_pbia_ad.json", (String) null);
        LocalInjectionUnit.Item item7 = new LocalInjectionUnit.Item("Single Image Ad", "feed_standard_ad.json", (String) null);
        LocalInjectionUnit.Item item8 = new LocalInjectionUnit.Item("Single Image Ad + IAB Screenshot [VPN]", "feed_standard_ad_with_iab_preview.json", (String) null);
        LocalInjectionUnit.Item item9 = new LocalInjectionUnit.Item("Single Video Ad", "feed_standard_video_ad.json", (String) null);
        LocalInjectionUnit.Item item10 = new LocalInjectionUnit.Item("Political Ad", "feed_political_ad.json", (String) null);
        LocalInjectionUnit.Item item11 = item2;
        LocalInjectionUnit.Item item12 = item3;
        LocalInjectionUnit.Item item13 = item4;
        LocalInjectionUnit.Item item14 = item5;
        LocalInjectionUnit.Item item15 = item6;
        LocalInjectionUnit.Item item16 = item7;
        LocalInjectionUnit.Item item17 = item8;
        LocalInjectionUnit.Item item18 = item9;
        LocalInjectionUnit.Item item19 = item10;
        System.arraycopy(new LocalInjectionUnit.Item[]{item, item11, item12, item13, item14, item15, item16, item17, item18, item19, new LocalInjectionUnit.Item("Lead Ad", "feed_lead_gen_ad.json", (String) null), new LocalInjectionUnit.Item("Canvas Ad", "feed_canvas_ad.json", (String) null), new LocalInjectionUnit.Item("Disclaimer Text Page Ad", "feed_disclaimer_text_page_ad.json", (String) null), new LocalInjectionUnit.Item("Disclaimer Web Page Ad", "feed_disclaimer_web_page_ad.json", (String) null), new LocalInjectionUnit.Item("Disclaimer Carousel Ad", "feed_disclaimer_carousel_ad.json", (String) null), new LocalInjectionUnit.Item("New Click to Messenger Flow Ad", "feed_ad_with_new_ctm_flow.json", (String) null), new LocalInjectionUnit.Item("New Click to WhatsApp Flow Ad", "feed_ad_with_new_ctwa_flow.json", (String) null), new LocalInjectionUnit.Item("New Click to Direct Flow Ad", "feed_ad_with_new_ctd_flow.json", (String) null), new LocalInjectionUnit.Item("Click To Instagram Direct Single Image Ad on Feed", "feed_ad_ctd_single_image.json", (String) null), new LocalInjectionUnit.Item("Click To Instagram Direct Carousel on Feed", "feed_ad_ctd_carousel.json", (String) null), new LocalInjectionUnit.Item("Click To Instagram Direct Video Ad on Feed", "feed_ad_ctd_video.json", (String) null), new LocalInjectionUnit.Item("Click To Join Single Image Ad on Feed", "feed_ad_ctj_single_image.json", (String) null), new LocalInjectionUnit.Item("Non-tall Video Ad", "feed_previewable_video_ad.json", (String) null), new LocalInjectionUnit.Item("Tall Video Ad", "feed_tall_video_ad.json", (String) null), new LocalInjectionUnit.Item("Branded Content Ad", "feed_ad_with_branded_content.json", (String) null), new LocalInjectionUnit.Item("Clips Video Internal Deeplink Ad", "feed_ad_with_clips_video_deeplink.json", (String) null), new LocalInjectionUnit.Item("Audio Page Deeplink Ad", "feed_ad_with_audio_page_internal_deeplink.json", (String) null)}, 0, itemArr, 0, 27);
        LocalInjectionUnit.Item item20 = new LocalInjectionUnit.Item("Showreel Composition Image Feed Ad", "showreel_composition_image_feed_ad.json", (String) null);
        LocalInjectionUnit.Item item21 = new LocalInjectionUnit.Item("Showreel Native Feed Ad", "showreel_native_feed_ad.json", (String) null);
        LocalInjectionUnit.Item item22 = new LocalInjectionUnit.Item("Feed Video Ads End Scene", "feed_ads_end_scene.json", (String) null);
        LocalInjectionUnit.Item item23 = new LocalInjectionUnit.Item("DA Auto Tagging Onsite CTA", "feed_da_auto_tag_onsite_cta.json", (String) null);
        LocalInjectionUnit.Item item24 = new LocalInjectionUnit.Item("DA Auto Tagging Offsite CTA", "feed_da_auto_tag_offsite_cta.json", (String) null);
        LocalInjectionUnit.Item item25 = new LocalInjectionUnit.Item("Tappable Shop Collection Ad", "feed_tappable_collection_ad.json", (String) null);
        LocalInjectionUnit.Item item26 = new LocalInjectionUnit.Item("Tappable Collection Ad", "feed_tappable_IX_collection_ad.json", (String) null);
        LocalInjectionUnit.Item item27 = new LocalInjectionUnit.Item("Tappable Collection Ad (Rounded Border)", "feed_tappable_IX_collection_rounded_border.json", (String) null);
        LocalInjectionUnit.Item item28 = new LocalInjectionUnit.Item("IG Feed Video post click Watch And Browse Ad", "feed_ad_watch_and_browse.json", (String) null);
        LocalInjectionUnit.Item item29 = new LocalInjectionUnit.Item("IG Feed Video post click Reels Browse Ad", "feed_ad_video_reels_browser.json", (String) null);
        LocalInjectionUnit.Item item30 = item20;
        LocalInjectionUnit.Item item31 = item21;
        LocalInjectionUnit.Item item32 = item22;
        LocalInjectionUnit.Item item33 = item23;
        LocalInjectionUnit.Item item34 = item24;
        LocalInjectionUnit.Item item35 = item25;
        LocalInjectionUnit.Item item36 = item26;
        LocalInjectionUnit.Item item37 = item27;
        LocalInjectionUnit.Item item38 = item28;
        LocalInjectionUnit.Item item39 = item29;
        System.arraycopy(new LocalInjectionUnit.Item[]{item30, item31, item32, item33, item34, item35, item36, item37, item38, item39, new LocalInjectionUnit.Item("Arts CTA Ad", "feed_arts_cta_ad.json", (String) null), new LocalInjectionUnit.Item("IX Collection Arts Ad", "feed_IX_collection_arts_ad.json", (String) null), new LocalInjectionUnit.Item("DSC Collection Arts Ad", "feed_DSC_collection_arts_ad.json", (String) null), new LocalInjectionUnit.Item("Standalone Multi Ads", "feed_ad_with_standalone_multi_ads.json", (String) null), new LocalInjectionUnit.Item("Post Engagement Multi ", "feed_ad_with_post_ad_engagement_multi_ads.json", (String) null), new LocalInjectionUnit.Item("Standalone Multi Ads 9x16 Template", "feed_ad_with_standalone_multi_ads_9x16_template.json", (String) null), new LocalInjectionUnit.Item("Standalone Multi Ads 4x15 Template", "feed_ad_with_standalone_multi_ads_4x5_template.json", (String) null), new LocalInjectionUnit.Item("Retail Ad with Single ARTS", "feed_retail_ad_with_single_arts.json", "feed_retail_ad_with_single_arts"), new LocalInjectionUnit.Item("Retail Ad with ARTS Motion", "feed_retail_ad_with_arts_motion.json", "feed_retail_ad_with_arts_motion"), new LocalInjectionUnit.Item("Popularity Proof Ad", "feed_single_image_popularity_proof_ad.json", "feed_single_image_popularity_proof_ad"), new LocalInjectionUnit.Item("Popularity Proof No Icon Ad", "feed_popularity_proof_no_icon_ad.json", "feed_popularity_proof_no_icon_ad"), new LocalInjectionUnit.Item("Popularity Proof Empty Ad", "feed_wrong_popularity_proof_ad.json", "feed_wrong_popularity_proof_ad"), new LocalInjectionUnit.Item("Popularity Proof Invalid Icon Ad", "feed_popularity_proof_invalid_icon_ad.json", "feed_popularity_proof_invalid_icon_ad"), new LocalInjectionUnit.Item("Retail Ad with Single AwPT", "feed_retail_ad_with_single_awpt.json", "feed_retail_ad_with_single_awpt")}, 0, itemArr, 27, 24);
        List<LocalInjectionUnit.Item> A1P = 0sr.A1P(itemArr);
        ArrayList A0p = AnonymousClass7TF.A0p(A1P);
        for (LocalInjectionUnit.Item item40 : A1P) {
            A0p.add(new LocalInjectionUnit(C13992Tns.A0L(item40), 002.A0R("feed_ads/", item40.filename), item40.name, LocalInjectionUnit.InjectionUnitType.FEED_ADS));
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
