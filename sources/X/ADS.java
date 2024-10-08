package X;

import com.instagram.api.schemas.AudioFilterInfo;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.List;

public final class ADS {
    public static final ADS A00 = new Object();

    public final MusicOverlayStickerModel A00(MusicProduct musicProduct, AudioOverlayTrack audioOverlayTrack, MusicAssetModel musicAssetModel, Integer num, String str, String str2) {
        int i;
        List list;
        MusicAssetModel musicAssetModel2 = musicAssetModel;
        0qQ.A0B(musicAssetModel, 1);
        if (num != null) {
            i = num.intValue();
        } else {
            i = audioOverlayTrack.A02;
        }
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(musicAssetModel.A05());
        Integer valueOf3 = Integer.valueOf(audioOverlayTrack.A03);
        Integer valueOf4 = Integer.valueOf(audioOverlayTrack.A04);
        AnonymousClass8IJ r0 = audioOverlayTrack.A05;
        if (r0 != null) {
            list = AnonymousClass7TE.A1I(new AudioFilterInfo(r0.A04));
        } else {
            list = null;
        }
        return C59670JTa.A02(musicProduct, musicAssetModel2, valueOf, valueOf2, valueOf3, valueOf4, str, str2, list);
    }
}
