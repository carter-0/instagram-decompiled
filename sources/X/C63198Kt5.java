package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.Kt5  reason: case insensitive filesystem */
public abstract class C63198Kt5 {
    public static final LFA A00(AudioOverlayTrack audioOverlayTrack) {
        C66569MWx A01;
        int i;
        0qQ.A0B(audioOverlayTrack, 0);
        MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
        boolean z = true;
        if (musicAssetModel == null || !musicAssetModel.A0U) {
            z = false;
        }
        if (z) {
            if (musicAssetModel != null) {
                A01 = JVW.A02(musicAssetModel);
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else if (musicAssetModel != null) {
            A01 = JVW.A01(musicAssetModel);
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        C66569MWx mWx = A01;
        Integer num = AnonymousClass05K.A01;
        int i2 = audioOverlayTrack.A03;
        MusicAssetModel musicAssetModel2 = audioOverlayTrack.A08;
        if (musicAssetModel2 != null) {
            i = musicAssetModel2.A00;
        } else {
            i = audioOverlayTrack.A02;
        }
        return new LFA(mWx, num, i2, i);
    }
}
