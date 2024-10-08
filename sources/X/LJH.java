package X;

import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import java.io.IOException;

public abstract class LJH {
    public static C300925yB parseFromJson(16F r5) {
        AnonymousClass3Q2 r0;
        0qQ.A0B(r5, 0);
        try {
            C300925yB r1 = new C300925yB();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("mediaType".equals(A17)) {
                    r1.A01 = LJI.A00(r5);
                } else if ("file_name".equals(A17)) {
                    r1.A04 = AnonymousClass7TG.A0l(r5);
                } else if ("file_size".equals(A17)) {
                    r1.A05 = AnonymousClass7TG.A0l(r5);
                } else if ("photo_path".equals(A17)) {
                    r1.A07 = AnonymousClass7TG.A0l(r5);
                } else if ("video_path".equals(A17)) {
                    r1.A09 = AnonymousClass7TG.A0l(r5);
                } else if ("video_cover_frame_path".equals(A17)) {
                    r1.A08 = AnonymousClass7TG.A0l(r5);
                } else if ("aspectPostCrop".equals(A17)) {
                    r1.A03 = new Float(r5.A0U());
                } else if ("pending_media".equals(A17)) {
                    r1.A02 = AnonymousClass3Q1.parseFromJson(r5);
                } else if ("pending_media_key".equals(A17)) {
                    r1.A06 = AnonymousClass7TG.A0l(r5);
                } else if ("media_upload_metadata".equals(A17)) {
                    MediaUploadMetadata parseFromJson = AnonymousClass3QX.parseFromJson(r5);
                    0qQ.A0B(parseFromJson, 0);
                    r1.A00 = parseFromJson;
                } else if ("has_sticker".equals(A17)) {
                    r1.A0A = r5.A0d();
                } else if ("is_armadillo_express".equals(A17)) {
                    r1.A0B = r5.A0d();
                }
                r5.A0z();
            }
            if (r1.A06 == null && (r0 = r1.A02) != null) {
                r1.A06 = r0.A35;
            }
            r1.A02 = null;
            C300925yB.A00(r1);
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C300925yB r3) {
        r2.A0c();
        1iA r0 = r3.A01;
        if (r0 != null) {
            r2.A0R("mediaType", LJI.A01(r0));
        }
        String str = r3.A04;
        if (str != null) {
            r2.A0R("file_name", str);
        }
        String str2 = r3.A05;
        if (str2 != null) {
            r2.A0R("file_size", str2);
        }
        String str3 = r3.A07;
        if (str3 != null) {
            r2.A0R("photo_path", str3);
        }
        String str4 = r3.A09;
        if (str4 != null) {
            r2.A0R("video_path", str4);
        }
        String str5 = r3.A08;
        if (str5 != null) {
            r2.A0R("video_cover_frame_path", str5);
        }
        Float f = r3.A03;
        if (f != null) {
            r2.A0O("aspectPostCrop", f.floatValue());
        }
        if (r3.A02 != null) {
            r2.A0q("pending_media");
            AnonymousClass3Q1.A01(r2, r3.A02);
        }
        String str6 = r3.A06;
        if (str6 != null) {
            r2.A0R("pending_media_key", str6);
        }
        r2.A0q("media_upload_metadata");
        AnonymousClass3QX.A00(r2, r3.A00);
        r2.A0S("has_sticker", r3.A0A);
        r2.A0S("is_armadillo_express", r3.A0B);
        r2.A0Z();
    }
}
