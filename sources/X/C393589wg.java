package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9wg  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C393589wg {
    public static Map A00(StoryTemplateMusicAssetInfoDictIntf storyTemplateMusicAssetInfoDictIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (storyTemplateMusicAssetInfoDictIntf.getCoverArtworkThumbnailUri() != null) {
            A1H.put(AnonymousClass000.A00(573), storyTemplateMusicAssetInfoDictIntf.getCoverArtworkThumbnailUri());
        }
        if (storyTemplateMusicAssetInfoDictIntf.getCoverArtworkUri() != null) {
            A1H.put("cover_artwork_uri", storyTemplateMusicAssetInfoDictIntf.getCoverArtworkUri());
        }
        if (storyTemplateMusicAssetInfoDictIntf.AzJ() != null) {
            A1H.put("duration_in_ms", storyTemplateMusicAssetInfoDictIntf.AzJ());
        }
        if (storyTemplateMusicAssetInfoDictIntf.BBW() != null) {
            A1H.put("has_lyrics", storyTemplateMusicAssetInfoDictIntf.BBW());
        }
        if (storyTemplateMusicAssetInfoDictIntf.CSt() != null) {
            A1H.put("is_explicit", storyTemplateMusicAssetInfoDictIntf.CSt());
        }
        if (storyTemplateMusicAssetInfoDictIntf.getProgressiveDownloadUrl() != null) {
            A1H.put("progressive_download_url", storyTemplateMusicAssetInfoDictIntf.getProgressiveDownloadUrl());
        }
        if (storyTemplateMusicAssetInfoDictIntf.getTitle() != null) {
            A1H.put(DialogModule.KEY_TITLE, storyTemplateMusicAssetInfoDictIntf.getTitle());
        }
        return 0Yt.A0B(A1H);
    }
}
