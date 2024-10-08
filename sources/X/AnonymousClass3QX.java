package X;

import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import java.io.IOException;

/* renamed from: X.3QX  reason: invalid class name */
public abstract class AnonymousClass3QX {
    public static MediaUploadMetadata parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            MediaUploadMetadata mediaUploadMetadata = new MediaUploadMetadata();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                String str = null;
                if ("app_attribution_namespace".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    mediaUploadMetadata.A03 = str;
                } else if ("app_attribution_id".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    mediaUploadMetadata.A02 = str;
                } else if ("upload_media_source".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    mediaUploadMetadata.A09 = str;
                } else if ("album_name".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    mediaUploadMetadata.A01 = str;
                } else if ("metagallery_media_id".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    mediaUploadMetadata.A08 = str;
                } else if ("wearables_media_id".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    mediaUploadMetadata.A0A = str;
                } else if ("attributed_device_name".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    mediaUploadMetadata.A05 = str;
                } else if ("app_attribution_raw_namespace".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    mediaUploadMetadata.A04 = str;
                } else if ("is_meta_gallery".equals(A0q)) {
                    mediaUploadMetadata.A0B = r4.A0d();
                } else if ("external_share_app_namespace".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    mediaUploadMetadata.A06 = str;
                } else if (AnonymousClass000.A00(1415).equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    mediaUploadMetadata.A07 = str;
                } else if (AnonymousClass000.A00(646).equals(A0q)) {
                    mediaUploadMetadata.A00 = C393939xH.parseFromJson(r4);
                }
                r4.A0z();
            }
            return mediaUploadMetadata;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, MediaUploadMetadata mediaUploadMetadata) {
        r3.A0c();
        String str = mediaUploadMetadata.A03;
        if (str != null) {
            r3.A0R("app_attribution_namespace", str);
        }
        String str2 = mediaUploadMetadata.A02;
        if (str2 != null) {
            r3.A0R("app_attribution_id", str2);
        }
        String str3 = mediaUploadMetadata.A09;
        if (str3 != null) {
            r3.A0R("upload_media_source", str3);
        }
        String str4 = mediaUploadMetadata.A01;
        if (str4 != null) {
            r3.A0R("album_name", str4);
        }
        String str5 = mediaUploadMetadata.A08;
        if (str5 != null) {
            r3.A0R("metagallery_media_id", str5);
        }
        String str6 = mediaUploadMetadata.A0A;
        if (str6 != null) {
            r3.A0R("wearables_media_id", str6);
        }
        String str7 = mediaUploadMetadata.A05;
        if (str7 != null) {
            r3.A0R("attributed_device_name", str7);
        }
        String str8 = mediaUploadMetadata.A04;
        if (str8 != null) {
            r3.A0R("app_attribution_raw_namespace", str8);
        }
        r3.A0S("is_meta_gallery", mediaUploadMetadata.A0B);
        String str9 = mediaUploadMetadata.A06;
        if (str9 != null) {
            r3.A0R("external_share_app_namespace", str9);
        }
        String str10 = mediaUploadMetadata.A07;
        if (str10 != null) {
            r3.A0R(AnonymousClass000.A00(1415), str10);
        }
        if (mediaUploadMetadata.A00 != null) {
            r3.A0q(AnonymousClass000.A00(646));
            ImmersiveMediaFields immersiveMediaFields = mediaUploadMetadata.A00;
            r3.A0c();
            String str11 = immersiveMediaFields.A00;
            if (str11 != null) {
                r3.A0R("glbUrl", str11);
            }
            r3.A0S(AnonymousClass000.A00(3407), immersiveMediaFields.A01);
            r3.A0Z();
        }
        r3.A0Z();
    }
}
