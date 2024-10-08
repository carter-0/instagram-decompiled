package X;

import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.pendingmedia.model.ClipInfo;
import java.io.IOException;

/* renamed from: X.3QW  reason: invalid class name */
public abstract class AnonymousClass3QW {
    public static ClipInfo parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ClipInfo clipInfo = new ClipInfo();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                String str = null;
                if ("clipFilePath".equals(A0q)) {
                    if (r5.A11() != 16L.A0G) {
                        str = r5.A1P();
                    }
                    clipInfo.A0F = str;
                } else if ("photoFilePath".equals(A0q)) {
                    if (r5.A11() != 16L.A0G) {
                        str = r5.A1P();
                    }
                    clipInfo.A0D = str;
                } else if ("camera_id".equals(A0q)) {
                    clipInfo.A03 = r5.A1D();
                } else if ("pan".equals(A0q)) {
                    clipInfo.A02 = (float) r5.A0U();
                } else if ("rotation".equals(A0q)) {
                    clipInfo.A0C = Integer.valueOf(r5.A1D());
                } else if ("colorTransfer".equals(A0q)) {
                    clipInfo.A04 = r5.A1D();
                } else if ("aspectPostCrop".equals(A0q)) {
                    clipInfo.A00 = (float) r5.A0U();
                } else if ("startMS".equals(A0q)) {
                    clipInfo.A07 = r5.A1D();
                } else if ("endMS".equals(A0q)) {
                    clipInfo.A05 = r5.A1D();
                } else if ("isTrimmed".equals(A0q)) {
                    clipInfo.A0H = r5.A0d();
                } else if ("trimScroll".equals(A0q)) {
                    clipInfo.A08 = r5.A1D();
                } else if ("videoWidth".equals(A0q)) {
                    clipInfo.A09 = r5.A1D();
                } else if ("videoHeight".equals(A0q)) {
                    clipInfo.A06 = r5.A1D();
                } else if ("software".equals(A0q)) {
                    if (r5.A11() != 16L.A0G) {
                        str = r5.A1P();
                    }
                    clipInfo.A0E = str;
                } else if ("h_flip".equals(A0q)) {
                    clipInfo.A0L = r5.A0d();
                } else if ("is_boomerang".equals(A0q)) {
                    clipInfo.A0J = r5.A0d();
                } else if ("is_clips_horizontal_remix".equals(A0q)) {
                    clipInfo.A0K = r5.A0d();
                } else if ("is_square_crop".equals(A0q)) {
                    clipInfo.A0N = r5.A0d();
                } else if ("original_duration_ms".equals(A0q)) {
                    clipInfo.A0A = r5.A0y();
                } else if ("is_pending_photo_to_video".equals(A0q)) {
                    clipInfo.A0M = r5.A0d();
                } else if ("media_upload_metadata".equals(A0q)) {
                    MediaUploadMetadata parseFromJson = AnonymousClass3QX.parseFromJson(r5);
                    0qQ.A0B(parseFromJson, 0);
                    clipInfo.A0B = parseFromJson;
                } else if ("is_virtual".equals(A0q)) {
                    clipInfo.A0O = r5.A0d();
                } else if ("is_audio_muted".equals(A0q)) {
                    clipInfo.A0I = r5.A0d();
                } else if ("frameRate".equals(A0q)) {
                    clipInfo.A01 = (float) r5.A0U();
                }
                r5.A0z();
            }
            return clipInfo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, ClipInfo clipInfo) {
        r3.A0c();
        String str = clipInfo.A0F;
        if (str != null) {
            r3.A0R("clipFilePath", str);
        }
        String str2 = clipInfo.A0D;
        if (str2 != null) {
            r3.A0R("photoFilePath", str2);
        }
        r3.A0P("camera_id", clipInfo.A03);
        r3.A0O("pan", clipInfo.A02);
        Integer num = clipInfo.A0C;
        if (num != null) {
            r3.A0P("rotation", num.intValue());
        }
        r3.A0P("colorTransfer", clipInfo.A04);
        r3.A0O("aspectPostCrop", clipInfo.A00);
        r3.A0P("startMS", clipInfo.A07);
        r3.A0P("endMS", clipInfo.A05);
        r3.A0S("isTrimmed", clipInfo.A0H);
        r3.A0P("trimScroll", clipInfo.A08);
        r3.A0P("videoWidth", clipInfo.A09);
        r3.A0P("videoHeight", clipInfo.A06);
        String str3 = clipInfo.A0E;
        if (str3 != null) {
            r3.A0R("software", str3);
        }
        r3.A0S("h_flip", clipInfo.A0L);
        r3.A0S("is_boomerang", clipInfo.A0J);
        r3.A0S("is_clips_horizontal_remix", clipInfo.A0K);
        r3.A0S("is_square_crop", clipInfo.A0N);
        r3.A0Q("original_duration_ms", clipInfo.A0A);
        r3.A0S("is_pending_photo_to_video", clipInfo.A0M);
        if (clipInfo.A0B != null) {
            r3.A0q("media_upload_metadata");
            AnonymousClass3QX.A00(r3, clipInfo.A0B);
        }
        r3.A0S("is_virtual", clipInfo.A0O);
        r3.A0S("is_audio_muted", clipInfo.A0I);
        r3.A0O("frameRate", clipInfo.A01);
        r3.A0Z();
    }
}
