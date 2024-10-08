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

public final class LocalStoriesAdsInjectionDataStore implements LocalMediaInjectionDataStoreManager {
    public /* synthetic */ List getInjectedJSONStrings(Context context, Set set) {
        return LocalMediaInjectionDataStoreManager.CC.$default$getInjectedJSONStrings(this, context, set);
    }

    public Map getInjectionDataStore() {
        LocalInjectionUnit.Item[] itemArr = new LocalInjectionUnit.Item[88];
        LocalInjectionUnit.Item item = new LocalInjectionUnit.Item("Click To Messenger Ad", "click_to_messenger_ad.json", (String) null);
        LocalInjectionUnit.Item item2 = new LocalInjectionUnit.Item("Click To Instagram Direct Single Image Ad", "story_ad_ctd_single_image.json", (String) null);
        LocalInjectionUnit.Item item3 = new LocalInjectionUnit.Item("Click To Instagram Direct Carousel Ad", "story_ad_ctd_carousel.json", (String) null);
        LocalInjectionUnit.Item item4 = new LocalInjectionUnit.Item("Click To Instagram Direct Video Ad", "story_ad_ctd_video.json", (String) null);
        LocalInjectionUnit.Item item5 = new LocalInjectionUnit.Item("Click to WhatsApp Ad", "stories_click_to_whatsapp_ad.json", (String) null);
        LocalInjectionUnit.Item item6 = new LocalInjectionUnit.Item("Click to Map (Get Directions) Ad", "open_map_cta_story_ad.json", (String) null);
        LocalInjectionUnit.Item item7 = new LocalInjectionUnit.Item("Visit IG Profile Ad", "ig_profile_visit_ad.json", (String) null);
        LocalInjectionUnit.Item item8 = new LocalInjectionUnit.Item("Mobile App Install (MAI) Ad", "mai_story_ad.json", (String) null);
        LocalInjectionUnit.Item item9 = new LocalInjectionUnit.Item("Canvas Ad", "canvas_ad.json", (String) null);
        LocalInjectionUnit.Item item10 = item;
        LocalInjectionUnit.Item item11 = item2;
        LocalInjectionUnit.Item item12 = item3;
        LocalInjectionUnit.Item item13 = item4;
        LocalInjectionUnit.Item item14 = item5;
        LocalInjectionUnit.Item item15 = item6;
        LocalInjectionUnit.Item item16 = item7;
        LocalInjectionUnit.Item item17 = item8;
        LocalInjectionUnit.Item item18 = item9;
        System.arraycopy(new LocalInjectionUnit.Item[]{item10, item11, item12, item13, item14, item15, item16, item17, item18, new LocalInjectionUnit.Item("Lead Ad", "lead_ad.json", (String) null), new LocalInjectionUnit.Item("No CTA Ad", "no_cta.json", (String) null), new LocalInjectionUnit.Item("Long Video (>= 16s) Ad", "longform_video.json", (String) null), new LocalInjectionUnit.Item("Branded Content (Paid Partnership) Ad", "branded_content_ad.json", (String) null), new LocalInjectionUnit.Item("Branded Content Long Video Ad", "branded_content_longform_video.json", (String) null), new LocalInjectionUnit.Item("Branded Content Opt-In Carousel Ad", "branded_content_expandable_carousel.json", (String) null), new LocalInjectionUnit.Item("Branded Content Long Video and Opt-In Carousel Ad", "branded_content_with_longform_video_and_expandable_carousel.json", (String) null), new LocalInjectionUnit.Item("Political Ad", "political_ad.json", (String) null), new LocalInjectionUnit.Item("Sensitive Vertical Ad", "sensitive_ad.json", (String) null), new LocalInjectionUnit.Item("Disclaimer Text Ad", "reel_disclaimer_text_page_ad.json", (String) null), new LocalInjectionUnit.Item("Disclaimer URL Ad", "reel_disclaimer_web_page_ad.json", (String) null), new LocalInjectionUnit.Item("Video Ad with Subtitles", "video_ad_with_subtitles.json", (String) null), new LocalInjectionUnit.Item("Polling Sticker Ad", "polling_sticker_ad.json", (String) null), new LocalInjectionUnit.Item("Mention Sticker Ad", "story_ad_with_mention_sticker_and_branded_content.json", (String) null), new LocalInjectionUnit.Item("Hashtag Sticker Ad", "story_ad_with_hashtag_sticker_and_branded_content.json", (String) null), new LocalInjectionUnit.Item("Location Sticker Ad", "story_ad_with_location_sticker_and_branded_content.json", (String) null), new LocalInjectionUnit.Item("Long CTA Text Ad", "long_cta_text_ad.json", (String) null), new LocalInjectionUnit.Item("9:16 Single Image Ad", "single_media_916_image.json", (String) null)}, 0, itemArr, 0, 27);
        LocalInjectionUnit.Item item19 = new LocalInjectionUnit.Item("9:16 Carousel Image Ad", "three_part_mps_916.json", (String) null);
        LocalInjectionUnit.Item item20 = new LocalInjectionUnit.Item("Landscape Ad (Square Image)", "landscape_square_image_ad.json", (String) null);
        LocalInjectionUnit.Item item21 = new LocalInjectionUnit.Item("Landscape Ad (Landscape Image)", "landscape_landscape_image_ad.json", (String) null);
        LocalInjectionUnit.Item item22 = new LocalInjectionUnit.Item("Landscape Ad (Portrait Image)", "landscape_portrait_image_ad.json", (String) null);
        LocalInjectionUnit.Item item23 = new LocalInjectionUnit.Item("Landscape Ad (Video)", "landscape_video_ad.json", (String) null);
        LocalInjectionUnit.Item item24 = new LocalInjectionUnit.Item("Landscape Ad with Headline", "landscape_ad_with_headline.json", (String) null);
        LocalInjectionUnit.Item item25 = new LocalInjectionUnit.Item("Landscape Strong Font Caption Ad", "landscape_strong_font_caption.json", (String) null);
        LocalInjectionUnit.Item item26 = new LocalInjectionUnit.Item("Landscape Max 3 Lines Caption Ad", "landscape_max_3_lines_caption.json", (String) null);
        LocalInjectionUnit.Item item27 = new LocalInjectionUnit.Item("Landscape First Sentence Caption Ad", "landscape_first_sentence_caption_ad.json", (String) null);
        LocalInjectionUnit.Item item28 = item19;
        LocalInjectionUnit.Item item29 = item20;
        LocalInjectionUnit.Item item30 = item21;
        LocalInjectionUnit.Item item31 = item22;
        LocalInjectionUnit.Item item32 = item23;
        LocalInjectionUnit.Item item33 = item24;
        LocalInjectionUnit.Item item34 = item25;
        LocalInjectionUnit.Item item35 = item26;
        LocalInjectionUnit.Item item36 = item27;
        System.arraycopy(new LocalInjectionUnit.Item[]{item28, item29, item30, item31, item32, item33, item34, item35, item36, new LocalInjectionUnit.Item("Landscape Multi Products Tag Ad", "story_ad_with_multi_products_tag.json", (String) null), new LocalInjectionUnit.Item("Landscape With Keyword Highlight Ad", "landscape_keyword_highlight_caption.json", (String) null), new LocalInjectionUnit.Item("Landscape With Center Text Alignment Ad", "landscape_center_text_alignment_caption.json", (String) null), new LocalInjectionUnit.Item("Showreel Native Single Image Ad", "showreel_native_ad.json", (String) null), new LocalInjectionUnit.Item("Showreel Native Single Image with Hashtag & Mention Ad", "showreel_native_caption_with_hashtag_and_mention.json", (String) null), new LocalInjectionUnit.Item("Showreel Native Single Image with Non-English Hashtag Ad", "showreel_native_non_english_hashtag.json", (String) null), new LocalInjectionUnit.Item("Showreel Native Long Caption Ad", "showreel_native_ad_with_more_caption.json", (String) null), new LocalInjectionUnit.Item("Showreel Native Animated Ad", "showreel_native_animated_ad.json", (String) null), new LocalInjectionUnit.Item("Showreel Native Animated with Hashtag & Mention Ad", "showreel_native_animated_with_hashtag_and_mention.json", (String) null), new LocalInjectionUnit.Item("Showreel Native Carousel Image Ad", "showreel_native_carousel_ad.json", (String) null), new LocalInjectionUnit.Item("Showreel Native DPA (Tesla) Ad", "showreel_native_dpa_tesla_template_ad.json", (String) null), new LocalInjectionUnit.Item("Showreel Native DPA (Nicola) Ad", "showreel_native_dpa_nicolas_template_ad.json", (String) null), new LocalInjectionUnit.Item("Showreel Composition Carousel Image Ad", "showreel_composition_carousel_ad.json", (String) null), new LocalInjectionUnit.Item("Showreel Composition Image Ad", "showreel_composition_image_ad.json", (String) null), new LocalInjectionUnit.Item("DPA Ad non 9:16", "dynamic_ad.json", (String) null), new LocalInjectionUnit.Item("DPA Ad Smart Opt-In Carousel (3 cards)", "smarter_expandable_carousel_pos_3.json", (String) null), new LocalInjectionUnit.Item("DPA Ad 9:16", "dpa_916_ad.json", (String) null), new LocalInjectionUnit.Item("DPA Showcase Ad (Showreel Native)", "showreel_native_dpa_showcase_template_ad.json", (String) null)}, 0, itemArr, 27, 27);
        LocalInjectionUnit.Item item37 = new LocalInjectionUnit.Item("Collection Ad with Square Image", "collection_ad_square_image.json", (String) null);
        LocalInjectionUnit.Item item38 = new LocalInjectionUnit.Item("Collection Ad with Landscape Image", "collection_ad_landscape_image.json", (String) null);
        LocalInjectionUnit.Item item39 = new LocalInjectionUnit.Item("Collection Ad with Square Video", "collection_ad_square_video.json", (String) null);
        LocalInjectionUnit.Item item40 = new LocalInjectionUnit.Item("Collection Ad with Landscape Video", "collection_ad_landscape_video.json", (String) null);
        LocalInjectionUnit.Item item41 = new LocalInjectionUnit.Item("Collection Ad with List Template Canvas", "collection_ad_list_template.json", (String) null);
        LocalInjectionUnit.Item item42 = new LocalInjectionUnit.Item("Caption Card Landscape Image with Short Caption", "caption_card_no_crop_hashtag_and_mention.json", (String) null);
        LocalInjectionUnit.Item item43 = new LocalInjectionUnit.Item("Caption Card Landscape Image with Long Caption", "caption_card_no_crop_scrollable_text.json", (String) null);
        LocalInjectionUnit.Item item44 = new LocalInjectionUnit.Item("Caption Card 9:16 Image with Short Caption", "caption_card_cropped_hashtag_and_mention.json", (String) null);
        LocalInjectionUnit.Item item45 = new LocalInjectionUnit.Item("Caption Card Landscape Video", "caption_card_non916_video_hashtag_and_mention.json", (String) null);
        LocalInjectionUnit.Item item46 = item37;
        LocalInjectionUnit.Item item47 = item38;
        LocalInjectionUnit.Item item48 = item39;
        LocalInjectionUnit.Item item49 = item40;
        LocalInjectionUnit.Item item50 = item41;
        LocalInjectionUnit.Item item51 = item42;
        LocalInjectionUnit.Item item52 = item43;
        LocalInjectionUnit.Item item53 = item44;
        LocalInjectionUnit.Item item54 = item45;
        System.arraycopy(new LocalInjectionUnit.Item[]{item46, item47, item48, item49, item50, item51, item52, item53, item54, new LocalInjectionUnit.Item("Caption Card 9:16 Video", "caption_card_916_video_hashtag_and_mention.json", (String) null), new LocalInjectionUnit.Item("Video to Carousel (V2C) 3 Cards Ad", "video_to_carousel_ad.json", (String) null), new LocalInjectionUnit.Item("Video to Carousel (V2C) 2 Cards Ad", "video_to_carousel_with_2cards.json", (String) null), new LocalInjectionUnit.Item("Video to Carousel (V2C) Last Segment Long Video Ad", "video_to_carousel_last_segment_long_video.json", (String) null), new LocalInjectionUnit.Item("End Scene Single Image Ad", "end_scene_image_ad.json", (String) null), new LocalInjectionUnit.Item("End Scene Short (<16s) Video Ad", "end_scene_short_video_ad.json", (String) null), new LocalInjectionUnit.Item("End Scene 1m Video Ad", "end_scene_60s_video_ad.json", (String) null), new LocalInjectionUnit.Item("End Scene 1m Video to Carousel (V2C) 2 Card Ad", "video_to_carousel_with_2cards_end_scene.json", (String) null), new LocalInjectionUnit.Item("Dynamic Duration Single Image Ad", "dynamic_duration_image_ad.json", (String) null), new LocalInjectionUnit.Item("Dynamic Duration Carousel Image Ad", "dynamic_duration_carousel_image_ad.json", (String) null), new LocalInjectionUnit.Item("Dynamic Duration Long Video Ad", "dynamic_duration_long_video_ad.json", (String) null), new LocalInjectionUnit.Item("Dynamic Duration Long Video to Carousel Ad", "dynamic_duration_long_video_v2c_ad.json", (String) null), new LocalInjectionUnit.Item("Generic Profile Card Combo Signals", "generic_profile_card_combo_signals.json", (String) null), new LocalInjectionUnit.Item("Lead Gen Card Non 9:16 Gradient Background Small Sticker", "lead_gen_card_non9by16_gradient_small.json", (String) null), new LocalInjectionUnit.Item("Auto Cropped Image Ad", "autocropped_landscape_ad_no_caption.json", (String) null), new LocalInjectionUnit.Item("Auto Cropped Image Ad with Smart Caption", "autocropped_landscape_ad_with_smart_caption.json", (String) null), new LocalInjectionUnit.Item("Auto Cropped Image Ad with First Sentence Caption", "autocropped_landscape_ad_with_first_caption.json", (String) null), new LocalInjectionUnit.Item("9:16 Caption Ad", "9by16_ad_with_caption_area.json", (String) null)}, 0, itemArr, 54, 27);
        System.arraycopy(new LocalInjectionUnit.Item[]{new LocalInjectionUnit.Item("Retail Ad with Single ARTS (Square)", "retail_ad_with_single_arts_square_image.json", "retail_ad_with_single_arts_square_image"), new LocalInjectionUnit.Item("Multi Author Carousel Ad", "multi_author_carousel_ad.json", (String) null), new LocalInjectionUnit.Item("Popularity Proof Ad", "popularity_proof_single_image.json", (String) null), new LocalInjectionUnit.Item("Popularity Proof Ad - No Icon", "popularity_proof_single_image_no_icon.json", (String) null), new LocalInjectionUnit.Item("Popularity Proof - Long Form Video and Expandable Carousel", "popularity_proof_longform_video_and_expandable_carousel.json", (String) null), new LocalInjectionUnit.Item("Social Context Ad", "social_context_single_image.json", (String) null), new LocalInjectionUnit.Item("Dynamic CTA Sticker", "dynamic_cta_sticker_single_image.json", (String) null)}, 0, itemArr, 81, 7);
        List<LocalInjectionUnit.Item> A1P = 0sr.A1P(itemArr);
        ArrayList A0p = AnonymousClass7TF.A0p(A1P);
        for (LocalInjectionUnit.Item item55 : A1P) {
            A0p.add(new LocalInjectionUnit(C13992Tns.A0L(item55), 002.A0R("stories_ads/", item55.filename), item55.name, LocalInjectionUnit.InjectionUnitType.STORIES_ADS));
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
