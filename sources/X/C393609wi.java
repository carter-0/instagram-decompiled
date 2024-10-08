package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.LyricsIntf;
import com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf;
import com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9wi  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C393609wi {
    public static Map A00(StoryTemplateMusicStickerDictIntf storyTemplateMusicStickerDictIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (storyTemplateMusicStickerDictIntf.Ad0() != null) {
            A1H.put("attribution", storyTemplateMusicStickerDictIntf.Ad0());
        }
        if (storyTemplateMusicStickerDictIntf.getAudioAssetId() != null) {
            A1H.put("audio_asset_id", storyTemplateMusicStickerDictIntf.getAudioAssetId());
        }
        storyTemplateMusicStickerDictIntf.getAudioAssetStartTimeInMs();
        A1H.put("audio_asset_start_time_in_ms", Integer.valueOf(storyTemplateMusicStickerDictIntf.getAudioAssetStartTimeInMs()));
        if (storyTemplateMusicStickerDictIntf.getAudioClusterId() != null) {
            A1H.put("audio_cluster_id", storyTemplateMusicStickerDictIntf.getAudioClusterId());
        }
        if (storyTemplateMusicStickerDictIntf.getColor() != null) {
            A1H.put("color", storyTemplateMusicStickerDictIntf.getColor());
        }
        storyTemplateMusicStickerDictIntf.AwP();
        A1H.put("derived_content_start_time_in_ms", Integer.valueOf(storyTemplateMusicStickerDictIntf.AwP()));
        if (storyTemplateMusicStickerDictIntf.AyE() != null) {
            A1H.put("display_type", storyTemplateMusicStickerDictIntf.AyE());
        }
        storyTemplateMusicStickerDictIntf.BCs();
        A1H.put(IgReactMediaPickerNativeModule.HEIGHT, AnonymousClass7TF.A0T(storyTemplateMusicStickerDictIntf.BCs()));
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (storyTemplateMusicStickerDictIntf.BOn() != null) {
            LyricsIntf BOn = storyTemplateMusicStickerDictIntf.BOn();
            if (BOn != null) {
                treeUpdaterJNI = BOn.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("lyrics", treeUpdaterJNI);
        }
        if (storyTemplateMusicStickerDictIntf.BUj() != null) {
            StoryTemplateMusicAssetInfoDictIntf BUj = storyTemplateMusicStickerDictIntf.BUj();
            if (BUj != null) {
                treeUpdaterJNI2 = BUj.FHC();
            }
            A1H.put("music_asset_info", treeUpdaterJNI2);
        }
        storyTemplateMusicStickerDictIntf.getOverlapDurationInMs();
        A1H.put("overlap_duration_in_ms", Integer.valueOf(storyTemplateMusicStickerDictIntf.getOverlapDurationInMs()));
        storyTemplateMusicStickerDictIntf.Bod();
        A1H.put("rotation", AnonymousClass7TF.A0T(storyTemplateMusicStickerDictIntf.Bod()));
        storyTemplateMusicStickerDictIntf.CGW();
        A1H.put(IgReactMediaPickerNativeModule.WIDTH, AnonymousClass7TF.A0T(storyTemplateMusicStickerDictIntf.CGW()));
        storyTemplateMusicStickerDictIntf.CGs();
        A1H.put("x", AnonymousClass7TF.A0T(storyTemplateMusicStickerDictIntf.CGs()));
        storyTemplateMusicStickerDictIntf.CHR();
        A1H.put("y", AnonymousClass7TF.A0T(storyTemplateMusicStickerDictIntf.CHR()));
        storyTemplateMusicStickerDictIntf.getZIndex();
        return AnonymousClass7TG.A0s(A1H, storyTemplateMusicStickerDictIntf.getZIndex());
    }
}
