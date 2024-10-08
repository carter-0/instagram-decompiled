package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.Kt6  reason: case insensitive filesystem */
public abstract class C63199Kt6 {
    public static final AudioOverlayTrack A00(UserSession userSession, C3499682q r8, AnonymousClass3Q2 r9) {
        MusicAttributionConfig musicAttributionConfig;
        MusicAssetModel musicAssetModel;
        Integer num;
        0qQ.A0B(userSession, 1);
        if (r9 == null) {
            return null;
        }
        MediaCaptureConfig mediaCaptureConfig = ((JWE) r8).A01.A09;
        if (mediaCaptureConfig != null) {
            musicAttributionConfig = mediaCaptureConfig.A00;
            if (musicAttributionConfig != null) {
                musicAssetModel = musicAttributionConfig.A02;
            }
            musicAssetModel = null;
        } else {
            musicAttributionConfig = null;
            musicAssetModel = null;
        }
        MusicOverlayStickerModel musicOverlayStickerModel = r9.A1J;
        if (musicOverlayStickerModel == null && musicAssetModel != null) {
            MusicProduct musicProduct = MusicProduct.MUSIC_IN_FEED;
            String A01 = JZM.A01(userSession);
            if (musicAttributionConfig != null) {
                num = Integer.valueOf(musicAttributionConfig.A00);
            } else {
                num = null;
            }
            musicOverlayStickerModel = C59670JTa.A03(musicProduct, musicAssetModel, 30000, num, A01);
            r9.A1J = musicOverlayStickerModel;
        }
        if (musicOverlayStickerModel == null) {
            return null;
        }
        return new AudioOverlayTrack(MusicAssetModel.A03(musicOverlayStickerModel), AnonymousClass7TG.A0A(musicOverlayStickerModel.A0K), C51967G9n.A04(musicOverlayStickerModel.A0O, 30000));
    }
}
