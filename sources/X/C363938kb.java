package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.8kb  reason: invalid class name and case insensitive filesystem */
public abstract class C363938kb {
    public static C352218Cl parseFromJson(16F r71) {
        String A1P;
        String A1P2;
        String A1P3;
        0qQ.A0B(r71, 0);
        try {
            if (r71.A11() != 16L.A0D) {
                r71.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            0v6 r68 = null;
            Integer num = null;
            Integer num2 = null;
            String str3 = null;
            Integer num3 = null;
            Integer num4 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Long l = null;
            Long l2 = null;
            Integer num5 = null;
            Integer num6 = null;
            Integer num7 = null;
            Integer num8 = null;
            String str4 = null;
            CameraAREffect cameraAREffect = null;
            String str5 = null;
            String str6 = null;
            AnonymousClass8GK r49 = null;
            Integer num9 = null;
            String str7 = null;
            String str8 = null;
            Boolean bool7 = null;
            Medium medium = null;
            0v6 r43 = null;
            Integer num10 = null;
            Boolean bool8 = null;
            String str9 = null;
            Integer num11 = null;
            MusicOverlayStickerModel musicOverlayStickerModel = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str10 = null;
            Long l3 = null;
            Integer num12 = null;
            Float f = null;
            Integer num13 = null;
            Float f2 = null;
            Integer num14 = null;
            Boolean bool12 = null;
            Boolean bool13 = null;
            Integer num15 = null;
            Integer num16 = null;
            MediaUploadMetadata mediaUploadMetadata = null;
            String str11 = null;
            Boolean bool14 = null;
            String str12 = null;
            C352218Cl r22 = null;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            C352218Cl r21 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            HashSet hashSet = null;
            while (r71.A1J() != 16L.A09) {
                String A0q = r71.A0q();
                r71.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r71.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r71.A1P();
                    }
                } else if ("file_path".equals(A0q)) {
                    if (r71.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r71.A1P();
                    }
                } else if ("is_place_holder".equals(A0q)) {
                    bool = Boolean.valueOf(r71.A0d());
                } else if ("should_background_cover_media".equals(A0q)) {
                    bool2 = Boolean.valueOf(r71.A0d());
                } else if ("original_background_gradient".equals(A0q)) {
                    r68 = C61660oX.parseFromJson(r71);
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    num = Integer.valueOf(r71.A1D());
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    num2 = Integer.valueOf(r71.A1D());
                } else if ("original_media_path".equals(A0q)) {
                    if (r71.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r71.A1P();
                    }
                } else if ("color_transfer".equals(A0q)) {
                    num3 = Integer.valueOf(r71.A1D());
                } else if ("rotation".equals(A0q)) {
                    num4 = Integer.valueOf(r71.A1D());
                } else if ("mirrored".equals(A0q)) {
                    bool3 = Boolean.valueOf(r71.A0d());
                } else if ("imported".equals(A0q)) {
                    bool4 = Boolean.valueOf(r71.A0d());
                } else if ("is_rollcall_v2".equals(A0q)) {
                    bool5 = Boolean.valueOf(r71.A0d());
                } else if ("is_music_first_story".equals(A0q)) {
                    bool6 = Boolean.valueOf(r71.A0d());
                } else if ("date_added".equals(A0q)) {
                    l = Long.valueOf(r71.A0y());
                } else if ("date_taken".equals(A0q)) {
                    l2 = Long.valueOf(r71.A0y());
                } else if ("story_gated_feature".equals(A0q)) {
                    if (r71.A11() == 16L.A0C) {
                        hashSet = new HashSet();
                        while (r71.A1J() != 16L.A08) {
                            if (!(r71.A11() == 16L.A0G || (A1P3 = r71.A1P()) == null)) {
                                hashSet.add(A1P3);
                            }
                        }
                    } else {
                        hashSet = null;
                    }
                } else if ("crop_rect_left".equals(A0q)) {
                    num5 = Integer.valueOf(r71.A1D());
                } else if ("crop_rect_top".equals(A0q)) {
                    num6 = Integer.valueOf(r71.A1D());
                } else if ("crop_rect_right".equals(A0q)) {
                    num7 = Integer.valueOf(r71.A1D());
                } else if ("crop_rect_bottom".equals(A0q)) {
                    num8 = Integer.valueOf(r71.A1D());
                } else if ("ar_effect_id".equals(A0q)) {
                    if (r71.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r71.A1P();
                    }
                } else if ("ar_effect".equals(A0q)) {
                    cameraAREffect = AnonymousClass515.parseFromJson(r71);
                } else if ("capture_type".equals(A0q)) {
                    if (r71.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r71.A1P();
                    }
                } else if ("effect_persisted_metadata".equals(A0q)) {
                    if (r71.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r71.A1P();
                    }
                } else if ("product_info".equals(A0q)) {
                    r49 = AB6.parseFromJson(r71);
                } else if ("source_type".equals(A0q)) {
                    num9 = Integer.valueOf(r71.A1D());
                } else if ("reshare_source".equals(A0q)) {
                    if (r71.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r71.A1P();
                    }
                } else if ("archived_media_id".equals(A0q)) {
                    if (r71.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r71.A1P();
                    }
                } else if ("is_captured_in_video_chat".equals(A0q)) {
                    bool7 = Boolean.valueOf(r71.A0d());
                } else if ("medium".equals(A0q)) {
                    medium = C353258Gx.parseFromJson(r71);
                } else if ("text_mode_gradient_colors".equals(A0q)) {
                    r43 = C61660oX.parseFromJson(r71);
                } else if ("dominant_color".equals(A0q)) {
                    num10 = Integer.valueOf(r71.A1D());
                } else if ("is_capture_screenshot".equals(A0q)) {
                    bool8 = Boolean.valueOf(r71.A0d());
                } else if ("camera_position".equals(A0q)) {
                    if (r71.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r71.A1P();
                    }
                } else if ("camera_id".equals(A0q)) {
                    num11 = Integer.valueOf(r71.A1D());
                } else if ("music_overlay_sticker_model".equals(A0q)) {
                    musicOverlayStickerModel = C255673uX.parseFromJson(r71);
                } else if ("is_saved_instagram_story".equals(A0q)) {
                    bool9 = Boolean.valueOf(r71.A0d());
                } else if ("is_captured_draft".equals(A0q)) {
                    bool10 = Boolean.valueOf(r71.A0d());
                } else if ("from_story_drafts".equals(A0q)) {
                    bool11 = Boolean.valueOf(r71.A0d());
                } else if ("sub_media_source".equals(A0q)) {
                    if (r71.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r71.A1J() != 16L.A08) {
                            if (!(r71.A11() == 16L.A0G || (A1P2 = r71.A1P()) == null)) {
                                arrayList.add(A1P2);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("ar_effect_list".equals(A0q)) {
                    if (r71.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r71.A1J() != 16L.A08) {
                            if (!(r71.A11() == 16L.A0G || (A1P = r71.A1P()) == null)) {
                                arrayList2.add(A1P);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("format_variant".equals(A0q)) {
                    if (r71.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r71.A1P();
                    }
                } else if ("exposure_time".equals(A0q)) {
                    l3 = Long.valueOf(r71.A0y());
                } else if ("iso_sensitivity".equals(A0q)) {
                    num12 = Integer.valueOf(r71.A1D());
                } else if ("aperture".equals(A0q)) {
                    f = new Float(r71.A0U());
                } else if ("awb_mode".equals(A0q)) {
                    num13 = Integer.valueOf(r71.A1D());
                } else if ("focal_length".equals(A0q)) {
                    f2 = new Float(r71.A0U());
                } else if ("flash_mode".equals(A0q)) {
                    num14 = Integer.valueOf(r71.A1D());
                } else if ("flash_on".equals(A0q)) {
                    bool12 = Boolean.valueOf(r71.A0d());
                } else if ("did_flash_fire".equals(A0q)) {
                    bool13 = Boolean.valueOf(r71.A0d());
                } else if ("zoom_level".equals(A0q)) {
                    num15 = Integer.valueOf(r71.A1D());
                } else if ("scene_mode".equals(A0q)) {
                    num16 = Integer.valueOf(r71.A1D());
                } else if ("media_upload_metadata".equals(A0q)) {
                    mediaUploadMetadata = AnonymousClass3QX.parseFromJson(r71);
                } else if ("attribution_content_url".equals(A0q)) {
                    if (r71.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r71.A1P();
                    }
                } else if ("is_upload_resize_step_enabled".equals(A0q)) {
                    bool14 = Boolean.valueOf(r71.A0d());
                } else if ("maker_note".equals(A0q)) {
                    if (r71.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r71.A1P();
                    }
                } else if ("concurrent_photo".equals(A0q)) {
                    r22 = parseFromJson(r71);
                } else if ("last_crop_rect".equals(A0q)) {
                    if (r71.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r71.A1J() != 16L.A08) {
                            Long valueOf = Long.valueOf(r71.A0y());
                            if (valueOf != null) {
                                arrayList3.add(valueOf);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("smart_crop_rect".equals(A0q)) {
                    if (r71.A11() == 16L.A0C) {
                        arrayList4 = new ArrayList();
                        while (r71.A1J() != 16L.A08) {
                            Long valueOf2 = Long.valueOf(r71.A0y());
                            if (valueOf2 != null) {
                                arrayList4.add(valueOf2);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("magic_mod_tool_data".equals(A0q)) {
                    if (r71.A11() == 16L.A0C) {
                        arrayList5 = new ArrayList();
                        while (r71.A1J() != 16L.A08) {
                            LMH parseFromJson = LIX.parseFromJson(r71);
                            if (parseFromJson != null) {
                                arrayList5.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if ("magic_mod_original_photo".equals(A0q)) {
                    r21 = parseFromJson(r71);
                } else if ("magic_mod_gen_ai_request_id".equals(A0q)) {
                    if (r71.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r71.A1P();
                    }
                } else if ("magic_mod_gen_ai_response_id".equals(A0q)) {
                    if (r71.A11() == 16L.A0G) {
                        str14 = null;
                    } else {
                        str14 = r71.A1P();
                    }
                } else if ("magic_mod_gen_ai_content_id".equals(A0q)) {
                    if (r71.A11() == 16L.A0G) {
                        str15 = null;
                    } else {
                        str15 = r71.A1P();
                    }
                } else if ("prompt_summary_gen_ai_request_id".equals(A0q)) {
                    if (r71.A11() == 16L.A0G) {
                        str16 = null;
                    } else {
                        str16 = r71.A1P();
                    }
                } else if ("prompt_summary_gen_ai_response_id".equals(A0q)) {
                    if (r71.A11() == 16L.A0G) {
                        str17 = null;
                    } else {
                        str17 = r71.A1P();
                    }
                } else if ("imagine_creation_type".equals(A0q)) {
                    if (r71.A11() == 16L.A0G) {
                        str18 = null;
                    } else {
                        str18 = r71.A1P();
                    }
                }
                r71.A0z();
            }
            C352218Cl r13 = new C352218Cl();
            if (str != null) {
                r13.A0h = str;
            }
            if (str2 != null) {
                r13.A0D(str2);
            }
            if (bool != null) {
                r13.A15 = bool.booleanValue();
            }
            if (bool2 != null) {
                r13.A19 = bool2.booleanValue();
            }
            if (r68 != null) {
                r13.A0H = r68;
            }
            if (num != null) {
                r13.A09 = num.intValue();
            }
            if (num2 != null) {
                r13.A06 = num2.intValue();
            }
            if (str3 != null) {
                r13.A0k = str3;
            }
            if (num3 != null) {
                r13.A01 = num3.intValue();
            }
            if (num4 != null) {
                r13.A07 = num4.intValue();
            }
            if (bool3 != null) {
                r13.A13 = bool3.booleanValue();
            }
            if (bool4 != null) {
                r13.A12 = bool4.booleanValue();
            }
            if (bool5 != null) {
                r13.A16 = bool5.booleanValue();
            }
            if (bool6 != null) {
                r13.A14 = bool6.booleanValue();
            }
            if (l != null) {
                r13.A0A = l.longValue();
            }
            if (l2 != null) {
                r13.A0B = l2.longValue();
            }
            if (hashSet != null) {
                r13.A0t = hashSet;
            }
            if (num5 != null) {
                r13.A03 = num5.intValue();
            }
            if (num6 != null) {
                r13.A05 = num6.intValue();
            }
            if (num7 != null) {
                r13.A04 = num7.intValue();
            }
            if (num8 != null) {
                r13.A02 = num8.intValue();
            }
            if (str4 != null) {
                r13.A0X = str4;
            }
            if (cameraAREffect != null) {
                r13.A0E = cameraAREffect;
            }
            if (str5 != null) {
                r13.A0b = str5;
            }
            if (str6 != null) {
                r13.A0c = str6;
            }
            if (r49 != null) {
                r13.A0K = r49;
            }
            if (num9 != null) {
                r13.A08 = num9.intValue();
            }
            if (str7 != null) {
                r13.A0n = str7;
            }
            if (str8 != null) {
                r13.A0Y = str8;
            }
            if (bool7 != null) {
                r13.A0w = bool7.booleanValue();
            }
            if (medium != null) {
                r13.A0F = medium;
            }
            if (r43 != null) {
                r13.A0I = r43;
            }
            if (num10 != null) {
                r13.A0R = num10;
            }
            if (bool8 != null) {
                r13.A0v = bool8.booleanValue();
            }
            if (str9 != null) {
                r13.A0a = str9;
            }
            if (num11 != null) {
                r13.A00 = num11.intValue();
            }
            if (musicOverlayStickerModel != null) {
                r13.A0J = musicOverlayStickerModel;
            }
            if (bool9 != null) {
                r13.A17 = bool9.booleanValue();
            }
            if (bool10 != null) {
                r13.A0x = bool10.booleanValue();
            }
            if (bool11 != null) {
                r13.A11 = bool11.booleanValue();
            }
            if (arrayList != null) {
                r13.A0s = arrayList;
            }
            if (arrayList2 != null) {
                r13.A0o = arrayList2;
            }
            if (str10 != null) {
                r13.A0d = str10;
            }
            if (l3 != null) {
                r13.A0W = l3;
            }
            if (num12 != null) {
                r13.A0T = num12;
            }
            if (f != null) {
                r13.A0O = f;
            }
            if (num13 != null) {
                r13.A0Q = num13;
            }
            if (f2 != null) {
                r13.A0P = f2;
            }
            if (num14 != null) {
                r13.A0S = num14;
            }
            if (bool12 != null) {
                r13.A10 = bool12.booleanValue();
            }
            if (bool13 != null) {
                r13.A0N = bool13;
            }
            if (num15 != null) {
                r13.A0V = num15;
            }
            if (num16 != null) {
                r13.A0U = num16;
            }
            if (mediaUploadMetadata != null) {
                r13.A0G = mediaUploadMetadata;
            }
            if (str11 != null) {
                r13.A0Z = str11;
            }
            if (bool14 != null) {
                r13.A18 = bool14.booleanValue();
            }
            if (str12 != null) {
                r13.A0j = str12;
            }
            if (r22 != null) {
                r13.A0L = r22;
            }
            if (arrayList3 != null) {
                r13.A0q = arrayList3;
            }
            if (arrayList4 != null) {
                r13.A0r = arrayList4;
            }
            if (arrayList5 != null) {
                r13.A0p = arrayList5;
            }
            if (r21 != null) {
                r13.A0M = r21;
            }
            if (str13 != null) {
                r13.A0f = str13;
            }
            if (str14 != null) {
                r13.A0g = str14;
            }
            if (str15 != null) {
                r13.A0e = str15;
            }
            if (str16 != null) {
                r13.A0l = str16;
            }
            if (str17 != null) {
                r13.A0m = str17;
            }
            if (str18 != null) {
                r13.A0i = str18;
            }
            return r13;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r7, C352218Cl r8) {
        Medium medium;
        r7.A0c();
        r7.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r8.A0h);
        if (r8.A06() != null) {
            r7.A0R("file_path", r8.A06());
        }
        r7.A0S("is_place_holder", r8.A15);
        r7.A0S("should_background_cover_media", r8.A19);
        if (r8.A0H != null) {
            r7.A0q("original_background_gradient");
            C61660oX.A00(r7, r8.A0H);
        }
        r7.A0P(IgReactMediaPickerNativeModule.WIDTH, r8.A09);
        r7.A0P(IgReactMediaPickerNativeModule.HEIGHT, r8.A06);
        if (r8.A07() != null) {
            r7.A0R("original_media_path", r8.A07());
        }
        r7.A0P("color_transfer", r8.A01);
        r7.A0P("rotation", r8.A07);
        r7.A0S("mirrored", r8.A13);
        r7.A0S("imported", r8.A12);
        r7.A0S("is_rollcall_v2", r8.A16);
        r7.A0S("is_music_first_story", r8.A14);
        r7.A0Q("date_added", r8.A0A);
        long j = r8.A0B;
        if (j <= 0) {
            j = r8.A0A;
        }
        r7.A0Q("date_taken", j);
        16P.A03(r7, "story_gated_feature");
        for (String str : r8.A0t) {
            if (str != null) {
                r7.A0t(str);
            }
        }
        r7.A0Y();
        r7.A0P("crop_rect_left", r8.A03);
        r7.A0P("crop_rect_top", r8.A05);
        r7.A0P("crop_rect_right", r8.A04);
        r7.A0P("crop_rect_bottom", r8.A02);
        String A05 = r8.A05();
        if (A05 != null) {
            r7.A0R("ar_effect_id", A05);
        }
        if (r8.A0E != null) {
            r7.A0q("ar_effect");
            AnonymousClass515.A00(r7, r8.A0E);
        }
        String str2 = r8.A0b;
        if (str2 != null) {
            r7.A0R("capture_type", str2);
        }
        String str3 = r8.A0c;
        if (str3 != null) {
            r7.A0R("effect_persisted_metadata", str3);
        }
        if (r8.A0K != null) {
            r7.A0q("product_info");
            AB6.A00(r7, r8.A0K);
        }
        r7.A0P("source_type", r8.A08);
        String str4 = r8.A0n;
        if (str4 != null) {
            r7.A0R("reshare_source", str4);
        }
        String str5 = r8.A0Y;
        if (str5 != null) {
            r7.A0R("archived_media_id", str5);
        }
        r7.A0S("is_captured_in_video_chat", r8.A0w);
        if (r8.A0F != null) {
            r7.A0q("medium");
            C353258Gx.A00(r7, r8.A0F);
        }
        if (r8.A0I != null) {
            r7.A0q("text_mode_gradient_colors");
            C61660oX.A00(r7, r8.A0I);
        }
        Integer num = r8.A0R;
        if (num != null) {
            r7.A0P("dominant_color", num.intValue());
        }
        r7.A0S("is_capture_screenshot", r8.A0v);
        String str6 = r8.A0a;
        if (str6 != null) {
            r7.A0R("camera_position", str6);
        }
        r7.A0P("camera_id", r8.A00);
        if (r8.A0J != null) {
            r7.A0q("music_overlay_sticker_model");
            C255673uX.A00(r7, r8.A0J, true);
        }
        r7.A0S("is_saved_instagram_story", r8.A17);
        r7.A0S("is_captured_draft", r8.A0x);
        r7.A0S("from_story_drafts", r8.A11);
        if (r8.A0s != null) {
            16P.A03(r7, "sub_media_source");
            for (String str7 : r8.A0s) {
                if (str7 != null) {
                    r7.A0t(str7);
                }
            }
            r7.A0Y();
        }
        if (r8.A0o != null) {
            16P.A03(r7, "ar_effect_list");
            for (String str8 : r8.A0o) {
                if (str8 != null) {
                    r7.A0t(str8);
                }
            }
            r7.A0Y();
        }
        String str9 = r8.A0d;
        if (str9 != null) {
            r7.A0R("format_variant", str9);
        }
        Long l = r8.A0W;
        if (l != null) {
            r7.A0Q("exposure_time", l.longValue());
        }
        Integer num2 = r8.A0T;
        if (num2 != null) {
            r7.A0P("iso_sensitivity", num2.intValue());
        }
        Float f = r8.A0O;
        if (f != null) {
            r7.A0O("aperture", f.floatValue());
        }
        Integer num3 = r8.A0Q;
        if (num3 != null) {
            r7.A0P("awb_mode", num3.intValue());
        }
        Float f2 = r8.A0P;
        if (f2 != null) {
            r7.A0O("focal_length", f2.floatValue());
        }
        Integer num4 = r8.A0S;
        if (num4 != null) {
            r7.A0P("flash_mode", num4.intValue());
        }
        r7.A0S("flash_on", r8.A10);
        Boolean bool = r8.A0N;
        if (bool != null) {
            r7.A0S("did_flash_fire", bool.booleanValue());
        }
        Integer num5 = r8.A0V;
        if (num5 != null) {
            r7.A0P("zoom_level", num5.intValue());
        }
        Integer num6 = r8.A0U;
        if (num6 != null) {
            r7.A0P("scene_mode", num6.intValue());
        }
        r8.A01();
        r7.A0q("media_upload_metadata");
        AnonymousClass3QX.A00(r7, r8.A01());
        String str10 = r8.A0Z;
        if (!(str10 == null && ((medium = r8.A0F) == null || (str10 = medium.A0N) == null))) {
            r7.A0R("attribution_content_url", str10);
        }
        r7.A0S("is_upload_resize_step_enabled", r8.A18);
        r7.A0R("maker_note", r8.A0j);
        if (r8.A0L != null) {
            r7.A0q("concurrent_photo");
            A00(r7, r8.A0L);
        }
        if (r8.A0q != null) {
            16P.A03(r7, "last_crop_rect");
            for (Number number : r8.A0q) {
                if (number != null) {
                    r7.A0h(number.longValue());
                }
            }
            r7.A0Y();
        }
        if (r8.A0r != null) {
            16P.A03(r7, "smart_crop_rect");
            for (Number number2 : r8.A0r) {
                if (number2 != null) {
                    r7.A0h(number2.longValue());
                }
            }
            r7.A0Y();
        }
        if (r8.A0p != null) {
            16P.A03(r7, "magic_mod_tool_data");
            for (LMH lmh : r8.A0p) {
                if (lmh != null) {
                    LIX.A00(r7, lmh);
                }
            }
            r7.A0Y();
        }
        if (r8.A0M != null) {
            r7.A0q("magic_mod_original_photo");
            A00(r7, r8.A0M);
        }
        String str11 = r8.A0f;
        if (str11 != null) {
            r7.A0R("magic_mod_gen_ai_request_id", str11);
        }
        String str12 = r8.A0g;
        if (str12 != null) {
            r7.A0R("magic_mod_gen_ai_response_id", str12);
        }
        String str13 = r8.A0e;
        if (str13 != null) {
            r7.A0R("magic_mod_gen_ai_content_id", str13);
        }
        String str14 = r8.A0l;
        if (str14 != null) {
            r7.A0R("prompt_summary_gen_ai_request_id", str14);
        }
        String str15 = r8.A0m;
        if (str15 != null) {
            r7.A0R("prompt_summary_gen_ai_response_id", str15);
        }
        String str16 = r8.A0i;
        if (str16 != null) {
            r7.A0R("imagine_creation_type", str16);
        }
        r7.A0Z();
    }
}
