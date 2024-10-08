package X;

import android.net.Uri;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.model.shopping.reels.InstagramShopLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.reels.fragment.model.ReelMoreOptionsModel;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;

/* renamed from: X.8vg  reason: invalid class name and case insensitive filesystem */
public abstract class C370008vg {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.8vh, java.lang.Object] */
    public static C370018vh parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("serialized_creative_edits".equals(A0q)) {
                    obj.A02 = C370028vi.parseFromJson(r3);
                } else if ("story_photo_edits".equals(A0q)) {
                    obj.A00 = AnonymousClass9SM.parseFromJson(r3);
                } else if ("story_video_edits".equals(A0q)) {
                    obj.A01 = C370148vu.parseFromJson(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r7, C370018vh r8) {
        r7.A0c();
        if (r8.A02 != null) {
            r7.A0q("serialized_creative_edits");
            C370038vj r2 = r8.A02;
            r7.A0c();
            if (r2.A04 != null) {
                r7.A0q("serialized_overlay_edits");
                C370058vl r3 = r2.A04;
                r7.A0c();
                if (r3.A03 != null) {
                    16P.A03(r7, "overlay_drawable_data");
                    for (A6D a6d : r3.A03) {
                        if (a6d != null) {
                            C379519Uf.A00(r7, a6d);
                        }
                    }
                    r7.A0Y();
                }
                if (r3.A02 != null) {
                    r7.A0q("overlay_asset_data");
                    C370068vm.A01(r3.A02.A00, r7);
                }
                if (r3.A01 != null) {
                    r7.A0q("karaoke_sticker_edits");
                    C366618pO r4 = r3.A01;
                    r7.A0c();
                    r7.A0P("sticker_index", r4.A02);
                    r7.A0P("sticker_color_index", r4.A01);
                    r7.A0P("sticker_color_id", r4.A00);
                    C306576Mr r0 = r4.A03;
                    if (r0 != null) {
                        r7.A0R("sticker_emphasis_status", r0.A00);
                    }
                    if (r4.A07 != null) {
                        16P.A03(r7, "edit_recycler_view_models");
                        for (C381919cn r5 : r4.A07) {
                            if (r5 != null) {
                                r7.A0c();
                                r7.A0P("index", r5.A00);
                                String str = r5.A01;
                                if (str != null) {
                                    r7.A0R("hint_word", str);
                                }
                                String str2 = r5.A02;
                                if (str2 != null) {
                                    r7.A0R("word", str2);
                                }
                                r7.A0S("is_editable", r5.A03);
                                r7.A0S("is_visible", r5.A04);
                                r7.A0Z();
                            }
                        }
                        r7.A0Y();
                    }
                    Integer num = r4.A04;
                    if (num != null) {
                        r7.A0P("edit_recycler_view_center_index", num.intValue());
                    }
                    if (r4.A08 != null) {
                        16P.A03(r7, "tokens");
                        for (C15092UOk uOk : r4.A08) {
                            if (uOk != null) {
                                C18191Vn5.A00(r7, uOk);
                            }
                        }
                        r7.A0Y();
                    }
                    Integer num2 = r4.A05;
                    if (num2 != null) {
                        r7.A0P("editing_token_index", num2.intValue());
                    }
                    String str3 = r4.A06;
                    if (str3 != null) {
                        r7.A0R("original_file_path", str3);
                    }
                    r7.A0Z();
                }
                r7.A0P("drawables_max_z", r3.A00);
                r7.A0Z();
            }
            if (r2.A03 != null) {
                r7.A0q("serialized_drawing_edits");
                C370098vp r1 = r2.A03;
                r7.A0c();
                if (r1.A00 != null) {
                    16P.A03(r7, "brush_strokes");
                    for (C17544VZx vZx : r1.A00) {
                        if (vZx != null) {
                            C18277Vos.A00(r7, vZx);
                        }
                    }
                    r7.A0Y();
                }
                r7.A0Z();
            }
            if (r2.A05 != null) {
                r7.A0q("text_mode_metadata");
                C39807AAe.A00(r7, r2.A05);
            }
            if (r2.A06 != null) {
                r7.A0q("story_caption_meta_data");
                C2802450w.A00(r7, r2.A06);
            }
            if (r2.A00 != null) {
                r7.A0q("reel_link_edits");
                AnonymousClass9IE r12 = r2.A00;
                r7.A0c();
                if (r12.A00 != null) {
                    r7.A0q("reel_more_options_model");
                    ReelMoreOptionsModel reelMoreOptionsModel = (ReelMoreOptionsModel) r12.A00;
                    r7.A0c();
                    AnonymousClass8CA r02 = reelMoreOptionsModel.A09;
                    if (r02 != null) {
                        r7.A0P("more_option_type", r02.A00);
                    }
                    String str4 = reelMoreOptionsModel.A0C;
                    if (str4 != null) {
                        r7.A0R("web_link_url", str4);
                    }
                    String str5 = reelMoreOptionsModel.A0B;
                    if (str5 != null) {
                        r7.A0R("igtv_media_id", str5);
                    }
                    String str6 = reelMoreOptionsModel.A0A;
                    if (str6 != null) {
                        r7.A0R("ar_effect_id", str6);
                    }
                    if (reelMoreOptionsModel.A06 != null) {
                        r7.A0q("profile_shop_link");
                        C45689D1o.A00(r7, reelMoreOptionsModel.A06);
                    }
                    if (reelMoreOptionsModel.A03 != null) {
                        r7.A0q("instagram_shop_link");
                        InstagramShopLink instagramShopLink = reelMoreOptionsModel.A03;
                        r7.A0c();
                        r7.A0S("is_enabled", instagramShopLink.A00);
                        r7.A0Z();
                    }
                    if (reelMoreOptionsModel.A04 != null) {
                        r7.A0q("incentive_product_collection_link");
                        C45686D1l.A00(r7, reelMoreOptionsModel.A04);
                    }
                    if (reelMoreOptionsModel.A05 != null) {
                        r7.A0q("product_collection_link");
                        C45686D1l.A00(r7, reelMoreOptionsModel.A05);
                    }
                    if (reelMoreOptionsModel.A08 != null) {
                        r7.A0q("product_link");
                        ReelProductLink reelProductLink = reelMoreOptionsModel.A08;
                        r7.A0c();
                        ProductDetailsProductItemDict productDetailsProductItemDict = reelProductLink.A00;
                        if (productDetailsProductItemDict != null) {
                            r7.A0q("product");
                            C275404q6.A00(r7, productDetailsProductItemDict);
                        }
                        r7.A0Z();
                    }
                    if (reelMoreOptionsModel.A07 != null) {
                        r7.A0q("products_link");
                        C45690D1p.A00(r7, reelMoreOptionsModel.A07);
                    }
                    if (reelMoreOptionsModel.A00 != null) {
                        r7.A0q("media_gating_info");
                        C45512Cxm.A00(r7, reelMoreOptionsModel.A00);
                    }
                    if (reelMoreOptionsModel.A0D != null) {
                        16P.A03(r7, "branded_content_tags");
                        for (BrandedContentTag brandedContentTag : reelMoreOptionsModel.A0D) {
                            if (brandedContentTag != null) {
                                LJX.A00(r7, brandedContentTag);
                            }
                        }
                        r7.A0Y();
                    }
                    if (reelMoreOptionsModel.A01 != null) {
                        r7.A0q("branded_content_project_metadata");
                        LGt.A00(r7, reelMoreOptionsModel.A01);
                    }
                    r7.A0S("is_paid_partnership_label", reelMoreOptionsModel.A0H);
                    r7.A0S("create_pa_boost_post_access_token", reelMoreOptionsModel.A0E);
                    r7.A0S("is_ads_mode", reelMoreOptionsModel.A0G);
                    r7.A0S("has_ads_mode_changed", reelMoreOptionsModel.A0F);
                    MediaGenAIDetectionMethod mediaGenAIDetectionMethod = reelMoreOptionsModel.A02;
                    if (mediaGenAIDetectionMethod != null) {
                        r7.A0R("gen_ai_detection_method", mediaGenAIDetectionMethod.A00);
                    }
                    r7.A0Z();
                }
                r7.A0Z();
            }
            if (r2.A02 != null) {
                r7.A0q("music_overlay_edits");
                C366628pP r32 = r2.A02;
                r7.A0c();
                String str7 = r32.A03;
                if (str7 != null) {
                    r7.A0R("music_sticker_tag", str7);
                }
                if (r32.A02 != null) {
                    r7.A0q("music_data_source");
                    MusicDataSource musicDataSource = r32.A02;
                    r7.A0c();
                    String str8 = musicDataSource.A05;
                    if (str8 != null) {
                        r7.A0R("progressive_download_url", str8);
                    }
                    String str9 = musicDataSource.A04;
                    if (str9 != null) {
                        r7.A0R("dash_manifest", str9);
                    }
                    Uri uri = musicDataSource.A00;
                    if (uri != null) {
                        r7.A0R("downloaded_track_uri", uri.toString());
                    }
                    String str10 = musicDataSource.A03;
                    if (str10 != null) {
                        r7.A0R("asset_id", str10);
                    }
                    String str11 = musicDataSource.A02;
                    if (str11 != null) {
                        r7.A0R("artist_id", str11);
                    }
                    r7.A0Z();
                }
                r7.A0P("start_time_ms", r32.A01);
                r7.A0P("duration_ms", r32.A00);
                r7.A0Z();
            }
            if (r2.A01 != null) {
                r7.A0q("immersive_photo_edits");
                r7.A0c();
                r7.A0Z();
            }
            r7.A0Z();
        }
        if (r8.A00 != null) {
            r7.A0q("story_photo_edits");
            C364758lx r22 = r8.A00;
            r7.A0c();
            C366668pT r03 = r22.A04;
            if (r03 != null) {
                C369448um.A00(r7, r03);
            }
            r7.A0P("filter_id", r22.A00);
            if (r22.A01 != null) {
                r7.A0q("post_capture_ar_effect");
                AnonymousClass515.A00(r7, r22.A01);
            }
            if (r22.A05 != null) {
                r7.A0q("visual_info");
                C370208w0.A00(r7, r22.A05);
            }
            if (r22.A09 != null) {
                16P.A03(r7, "transform_matrix_configs");
                for (TransformMatrixConfig transformMatrixConfig : r22.A09) {
                    if (transformMatrixConfig != null) {
                        C266614a0.A00(r7, transformMatrixConfig);
                    }
                }
                r7.A0Y();
            }
            if (r22.A03 != null) {
                r7.A0q("transform_matrix_config");
                C266614a0.A00(r7, r22.A03);
            }
            if (r22.A02 != null) {
                r7.A0q("crop_info");
                AnonymousClass9SO.A00(r7, r22.A02);
            }
            r7.A0S("should_render_drawables_in_unified_layer", r22.A0A);
            if (r22.A08 != null) {
                16P.A03(r7, "ai_filter_colors");
                for (Number number : r22.A08) {
                    if (number != null) {
                        r7.A0g(number.intValue());
                    }
                }
                r7.A0Y();
            }
            r7.A0Z();
        }
        if (r8.A01 != null) {
            r7.A0q("story_video_edits");
            C370148vu.A00(r7, r8.A01);
        }
        r7.A0Z();
    }
}
