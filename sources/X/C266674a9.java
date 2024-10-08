package X;

import com.instagram.api.schemas.ACRType;
import java.io.IOException;

/* renamed from: X.4a9  reason: invalid class name and case insensitive filesystem */
public abstract class C266674a9 {
    public static C266684aA parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C266684aA r0 = new C266684aA();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("recording_speed".equals(A0q)) {
                    r0.A03 = r5.A1D();
                } else if ("index".equals(A0q)) {
                    r0.A02 = r5.A1D();
                } else {
                    String str = null;
                    if ("face_effect_id".equals(A0q)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        r0.A0B = str;
                    } else if ("source_type".equals(A0q)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        r0.A0H = str;
                    } else if ("duration_in_ms".equals(A0q)) {
                        r0.A01 = r5.A1D();
                    } else if ("audio_type".equals(A0q)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        r0.A0A = str;
                    } else if ("is_from_drafts".equals(A0q)) {
                        r0.A0K = r5.A0d();
                    } else if ("file_path".equals(A0q)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        r0.A0C = str;
                    } else if ("source_photo_file_path".equals(A0q)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        r0.A0G = str;
                    } else if ("camera_position".equals(A0q)) {
                        r0.A00 = r5.A1D();
                    } else if ("media_folder".equals(A0q)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        r0.A0D = str;
                    } else if ("can_share_to_facebook".equals(A0q)) {
                        r0.A0I = r5.A0d();
                    } else if ("can_share_to_facebook_expansion".equals(A0q)) {
                        r0.A07 = Boolean.valueOf(r5.A0d());
                    } else if ("is_non_transcoded_prefill_video".equals(A0q)) {
                        r0.A0L = r5.A0d();
                    } else if ("auto_created_reels_metadata".equals(A0q)) {
                        r0.A05 = C266704aC.parseFromJson(r5);
                    } else if ("original_media_type".equals(A0q)) {
                        1iA A00 = 1i9.A00(Integer.valueOf(r5.A1D()));
                        0qQ.A0B(A00, 0);
                        r0.A06 = A00;
                    } else if ("trimmed_start_time_ms".equals(A0q)) {
                        r0.A04 = r5.A1D();
                    } else if ("original_segment_hash".equals(A0q)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        r0.A0F = str;
                    } else if ("is_remix".equals(A0q)) {
                        r0.A0M = r5.A0d();
                    } else if ("metagallery_media_id".equals(A0q)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        r0.A0E = str;
                    } else if ("has_reusable_template_asset".equals(A0q)) {
                        r0.A0J = r5.A0d();
                    } else if ("reusable_template_media_asset_start_time_ms".equals(A0q)) {
                        r0.A09 = Integer.valueOf(r5.A1D());
                    } else if ("reusable_template_media_asset_end_time_ms".equals(A0q)) {
                        r0.A08 = Integer.valueOf(r5.A1D());
                    }
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r4, C266684aA r5) {
        r4.A0c();
        r4.A0P("recording_speed", r5.A03);
        r4.A0P("index", r5.A02);
        String str = r5.A0B;
        if (str != null) {
            r4.A0R("face_effect_id", str);
        }
        String str2 = r5.A0H;
        if (str2 != null) {
            r4.A0R("source_type", str2);
        }
        r4.A0P("duration_in_ms", r5.A01);
        String str3 = r5.A0A;
        if (str3 != null) {
            r4.A0R("audio_type", str3);
        }
        r4.A0S("is_from_drafts", r5.A0K);
        String str4 = r5.A0C;
        if (str4 != null) {
            r4.A0R("file_path", str4);
        }
        String str5 = r5.A0G;
        if (str5 != null) {
            r4.A0R("source_photo_file_path", str5);
        }
        r4.A0P("camera_position", r5.A00);
        String str6 = r5.A0D;
        if (str6 != null) {
            r4.A0R("media_folder", str6);
        }
        r4.A0S("can_share_to_facebook", r5.A0I);
        Boolean bool = r5.A07;
        if (bool != null) {
            r4.A0S("can_share_to_facebook_expansion", bool.booleanValue());
        }
        r4.A0S("is_non_transcoded_prefill_video", r5.A0L);
        if (r5.A05 != null) {
            r4.A0q("auto_created_reels_metadata");
            AnonymousClass9JE r3 = r5.A05;
            r4.A0c();
            String str7 = r3.A03;
            if (str7 != null) {
                r4.A0R("source_media_collection_id", str7);
            }
            Number number = (Number) r3.A01;
            if (number != null) {
                r4.A0Q("source_media_id", number.longValue());
            }
            Number number2 = (Number) r3.A02;
            if (number2 != null) {
                r4.A0Q("source_medium_id", number2.longValue());
            }
            ACRType aCRType = (ACRType) r3.A00;
            if (aCRType != null) {
                r4.A0R("acr_type", aCRType.A00);
            }
            String str8 = r3.A04;
            if (str8 != null) {
                r4.A0R("template_clips_media_id", str8);
            }
            r4.A0Z();
        }
        1iA r0 = r5.A06;
        if (r0 != null) {
            r4.A0P("original_media_type", r0.A00);
        }
        r4.A0P("trimmed_start_time_ms", r5.A04);
        String str9 = r5.A0F;
        if (str9 != null) {
            r4.A0R("original_segment_hash", str9);
        }
        r4.A0S("is_remix", r5.A0M);
        String str10 = r5.A0E;
        if (str10 != null) {
            r4.A0R("metagallery_media_id", str10);
        }
        r4.A0S("has_reusable_template_asset", r5.A0J);
        Integer num = r5.A09;
        if (num != null) {
            r4.A0P("reusable_template_media_asset_start_time_ms", num.intValue());
        }
        Integer num2 = r5.A08;
        if (num2 != null) {
            r4.A0P("reusable_template_media_asset_end_time_ms", num2.intValue());
        }
        r4.A0Z();
    }
}
