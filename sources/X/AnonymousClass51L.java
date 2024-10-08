package X;

import com.facebook.location.platform.api.Location;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.feed.media.CameraToolInfo;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.51L  reason: invalid class name */
public abstract class AnonymousClass51L {
    public static AnonymousClass51M parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            AnonymousClass51M r3 = new AnonymousClass51M();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("source_video".equals(A0q)) {
                    AnonymousClass51R parseFromJson = AnonymousClass51T.parseFromJson(r5);
                    0qQ.A0B(parseFromJson, 0);
                    r3.A0F = parseFromJson;
                } else if ("recording_settings".equals(A0q)) {
                    AnonymousClass51S parseFromJson2 = AnonymousClass51U.parseFromJson(r5);
                    0qQ.A0B(parseFromJson2, 0);
                    r3.A0E = parseFromJson2;
                } else if ("recording_speed".equals(A0q)) {
                    r3.A00 = (float) r5.A0U();
                } else if ("trimmed_start_time_ms".equals(A0q)) {
                    r3.A09 = r5.A1D();
                } else if ("trimmed_end_time_ms".equals(A0q)) {
                    r3.A08 = r5.A1D();
                } else if ("is_from_draft".equals(A0q)) {
                    r3.A0Q = r5.A0d();
                } else if ("is_replaced".equals(A0q)) {
                    r3.A0S = r5.A0d();
                } else if ("text_mode_gradient_colors".equals(A0q)) {
                    r3.A0D = C61660oX.parseFromJson(r5);
                } else if ("fill_screen".equals(A0q)) {
                    r3.A0N = r5.A0d();
                } else if ("is_non_transcoded_prefill_video".equals(A0q)) {
                    r3.A0R = r5.A0d();
                } else if ("min_trim_time_ms".equals(A0q)) {
                    r3.A03 = r5.A1D();
                } else if ("max_trim_time_ms".equals(A0q)) {
                    r3.A02 = r5.A1D();
                } else if ("min_trim_start_time_ms".equals(A0q)) {
                    r3.A05 = r5.A1D();
                } else if ("is_transcoded".equals(A0q)) {
                    r3.A0T = r5.A0d();
                } else {
                    String str = null;
                    if ("complianceError".equals(A0q)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        r3.A0H = str;
                    } else if ("auto_created_reels_segment_info".equals(A0q)) {
                        r3.A0C = JVK.parseFromJson(r5);
                    } else if ("transition_in_effect".equals(A0q)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        r3.A0L = str;
                    } else if ("transition_out_effect".equals(A0q)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        r3.A0M = str;
                    } else if ("take_index".equals(A0q)) {
                        r3.A07 = r5.A1D();
                    } else if ("alternate_takes".equals(A0q)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        r3.A0K = str;
                    } else if ("segment_start_time_ms".equals(A0q)) {
                        r3.A06 = r5.A1D();
                    } else if ("segment_end_time_ms".equals(A0q)) {
                        r3.A04 = r5.A1D();
                    } else if ("import_id".equals(A0q)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        r3.A0I = str;
                    } else if ("video_split_meta_data".equals(A0q)) {
                        r3.A0B = GTS.parseFromJson(r5);
                    } else if ("has_video_slip".equals(A0q)) {
                        r3.A0P = r5.A0d();
                    } else if ("has_template_reusable_asset".equals(A0q)) {
                        r3.A0O = r5.A0d();
                    } else if ("prefilled_index".equals(A0q)) {
                        r3.A0G = Integer.valueOf(r5.A1D());
                    } else if ("layout_transform".equals(A0q)) {
                        r3.A0A = JVY.parseFromJson(r5);
                    } else if ("original_medium_id".equals(A0q)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        r3.A0J = str;
                    } else if ("volume".equals(A0q)) {
                        r3.A01 = (float) r5.A0U();
                    }
                }
                r5.A0z();
            }
            r3.A0F();
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r5, AnonymousClass51M r6) {
        r5.A0c();
        if (r6.A0F != null) {
            r5.A0q("source_video");
            AnonymousClass51R r2 = r6.A0F;
            r5.A0c();
            String str = r2.A0F;
            if (str != null) {
                r5.A0R("file_path", str);
            }
            String str2 = r2.A0G;
            if (str2 != null) {
                r5.A0R("original_file_path", str2);
            }
            String str3 = r2.A0E;
            if (str3 != null) {
                r5.A0R("cover_thumbnail_path", str3);
            }
            r5.A0Q("date_taken", r2.A0A);
            r5.A0P(IgReactMediaPickerNativeModule.WIDTH, r2.A09);
            r5.A0P(IgReactMediaPickerNativeModule.HEIGHT, r2.A05);
            r5.A0P("colorTransfer", r2.A01);
            r5.A0P("orientation", r2.A07);
            String str4 = r2.A0D;
            if (str4 != null) {
                r5.A0R("camera_position", str4);
            }
            r5.A0P("camera_id", r2.A00);
            r5.A0P("origin", r2.A08);
            r5.A0P("duration_ms", r2.A04);
            r5.A0P("trim_start_time_ms", r2.A03);
            r5.A0P("trim_end_time_ms", r2.A02);
            String str5 = r2.A0H;
            if (str5 != null) {
                r5.A0R("original_media_folder", str5);
            }
            r5.A0P("in_flight_video_calculated_duration_ms", r2.A06);
            if (r2.A0B != null) {
                r5.A0q("media_upload_metadata");
                AnonymousClass3QX.A00(r5, r2.A0B);
            }
            r5.A0S("was_photo", r2.A0K);
            String str6 = r2.A0I;
            if (str6 != null) {
                r5.A0R("source_photo_file_path", str6);
            }
            if (r2.A0J != null) {
                16P.A03(r5, "external_media_segment_info");
                for (AnonymousClass9JM r0 : r2.A0J) {
                    if (r0 != null) {
                        C39816AAn.A00(r0, r5);
                    }
                }
                r5.A0Y();
            }
            Boolean bool = r2.A0C;
            if (bool != null) {
                r5.A0S("is_remix", bool.booleanValue());
            }
            r5.A0Z();
        }
        if (r6.A0E != null) {
            r5.A0q("recording_settings");
            AnonymousClass51S r22 = r6.A0E;
            r5.A0c();
            r5.A0O(Location.SPEED, r22.A00);
            r5.A0P("timer_duration_ms", r22.A01);
            r5.A0S("ghost_mode_on", r22.A05);
            if (r22.A04 != null) {
                16P.A03(r5, "camera_tool");
                for (String str7 : r22.A04) {
                    if (str7 != null) {
                        r5.A0t(str7);
                    }
                }
                r5.A0Y();
            }
            if (r22.A02 != null) {
                16P.A03(r5, "camera_ar_effect_list");
                for (CameraAREffect cameraAREffect : r22.A02) {
                    if (cameraAREffect != null) {
                        AnonymousClass515.A00(r5, cameraAREffect);
                    }
                }
                r5.A0Y();
            }
            if (r22.A03 != null) {
                16P.A03(r5, "camera_tools_struct");
                for (CameraToolInfo cameraToolInfo : r22.A03) {
                    if (cameraToolInfo != null) {
                        AnonymousClass53j.A00(r5, cameraToolInfo);
                    }
                }
                r5.A0Y();
            }
            r5.A0Z();
        }
        r5.A0O("recording_speed", r6.A00);
        r5.A0P("trimmed_start_time_ms", r6.A09);
        r5.A0P("trimmed_end_time_ms", r6.A08);
        r5.A0S("is_from_draft", r6.A0Q);
        r5.A0S("is_replaced", r6.A0S);
        if (r6.A0D != null) {
            r5.A0q("text_mode_gradient_colors");
            C61660oX.A00(r5, r6.A0D);
        }
        r5.A0S("fill_screen", r6.A0N);
        r5.A0S("is_non_transcoded_prefill_video", r6.A0R);
        r5.A0P("min_trim_time_ms", r6.A03);
        r5.A0P("max_trim_time_ms", r6.A02);
        r5.A0P("min_trim_start_time_ms", r6.A05);
        r5.A0S("is_transcoded", r6.A0T);
        String str8 = r6.A0H;
        if (str8 != null) {
            r5.A0R("complianceError", str8);
        }
        if (r6.A0C != null) {
            r5.A0q("auto_created_reels_segment_info");
            JVK.A00(r6.A0C, r5);
        }
        String str9 = r6.A0L;
        if (str9 != null) {
            r5.A0R("transition_in_effect", str9);
        }
        String str10 = r6.A0M;
        if (str10 != null) {
            r5.A0R("transition_out_effect", str10);
        }
        r5.A0P("take_index", r6.A07);
        String str11 = r6.A0K;
        if (str11 != null) {
            r5.A0R("alternate_takes", str11);
        }
        r5.A0P("segment_start_time_ms", r6.A06);
        r5.A0P("segment_end_time_ms", r6.A04);
        String str12 = r6.A0I;
        if (str12 != null) {
            r5.A0R("import_id", str12);
        }
        if (r6.A0B != null) {
            r5.A0q("video_split_meta_data");
            GTT gtt = r6.A0B;
            r5.A0c();
            r5.A0P("split_time", gtt.A00);
            r5.A0S("is_split_point_at_start", gtt.A02);
            r5.A0P("trimmed_duration_after_split", gtt.A01);
            r5.A0Z();
        }
        r5.A0S("has_video_slip", r6.A0P);
        r5.A0S("has_template_reusable_asset", r6.A0O);
        Integer num = r6.A0G;
        if (num != null) {
            r5.A0P("prefilled_index", num.intValue());
        }
        if (r6.A0A != null) {
            r5.A0q("layout_transform");
            JVY.A00(r6.A0A, r5);
        }
        String str13 = r6.A0J;
        if (str13 != null) {
            r5.A0R("original_medium_id", str13);
        }
        r5.A0O("volume", r6.A01);
        r5.A0Z();
    }
}
