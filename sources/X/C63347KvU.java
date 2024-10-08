package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.KvU  reason: case insensitive filesystem */
public abstract class C63347KvU {
    public static final AudioOverlayTrack A00(C66569MWx mWx, int i) {
        MusicAssetModel A02 = MusicAssetModel.A02(mWx);
        return new AudioOverlayTrack(A02, C63349KvW.A00(A02.A00, i, A02.A0J), i);
    }
}
