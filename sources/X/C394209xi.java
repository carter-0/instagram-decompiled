package X;

import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel;
import java.io.IOException;

/* renamed from: X.9xi  reason: invalid class name and case insensitive filesystem */
public abstract class C394209xi {
    public static SharePlatformStickerClientModel parseFromJson(16F r5) {
        C391049sG r0;
        String A1P;
        0qQ.A0B(r5, 0);
        try {
            SharePlatformStickerClientModel sharePlatformStickerClientModel = new SharePlatformStickerClientModel();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("media_upload_metadata".equals(A17)) {
                    MediaUploadMetadata parseFromJson = AnonymousClass3QX.parseFromJson(r5);
                    0qQ.A0B(parseFromJson, 0);
                    sharePlatformStickerClientModel.A07 = parseFromJson;
                } else if (AnonymousClass000.A00(4492).equals(A17)) {
                    sharePlatformStickerClientModel.A09 = AnonymousClass7TG.A0l(r5);
                } else if (C273654mx.A00(749).equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    sharePlatformStickerClientModel.A0A = A0l;
                } else if ("image_width".equals(A17)) {
                    sharePlatformStickerClientModel.A03 = r5.A1D();
                } else if ("image_height".equals(A17)) {
                    sharePlatformStickerClientModel.A02 = r5.A1D();
                } else if ("rotation".equals(A17)) {
                    sharePlatformStickerClientModel.A04 = r5.A1D();
                } else if ("sticker_width".equals(A17)) {
                    sharePlatformStickerClientModel.A06 = r5.A1D();
                } else if ("sticker_height".equals(A17)) {
                    sharePlatformStickerClientModel.A05 = r5.A1D();
                } else if ("should_keep_on_screen".equals(A17)) {
                    sharePlatformStickerClientModel.A0B = r5.A0d();
                } else if ("share_platform_type".equals(A17)) {
                    if (r5.A11() == 16L.A0G || (A1P = r5.A1P()) == null || (r0 = (C391049sG) C391049sG.A01.get(A1P)) == null) {
                        r0 = C391049sG.UNKNOWN;
                    }
                    sharePlatformStickerClientModel.A08 = r0;
                } else if ("start_time_ms".equals(A17)) {
                    sharePlatformStickerClientModel.A01 = (float) r5.A0U();
                } else if ("end_time_ms".equals(A17)) {
                    sharePlatformStickerClientModel.A00 = (float) r5.A0U();
                }
                r5.A0z();
            }
            return sharePlatformStickerClientModel;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
