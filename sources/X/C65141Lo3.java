package X;

import android.view.View;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import instagram.features.clips.edit.ClipsEditMetadataController;

/* renamed from: X.Lo3  reason: case insensitive filesystem */
public final class C65141Lo3 implements MSA {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ClipsEditMetadataController A01;

    public final void DtB(AudioOverlayTrack audioOverlayTrack) {
        MusicAssetModel musicAssetModel;
        MusicOverlayStickerModel musicOverlayStickerModel = null;
        if (audioOverlayTrack != null) {
            musicAssetModel = audioOverlayTrack.A08;
        } else {
            musicAssetModel = null;
        }
        ClipsEditMetadataController clipsEditMetadataController = this.A01;
        if (musicAssetModel != null) {
            musicOverlayStickerModel = C59670JTa.A01(MusicProduct.CLIPS_EDIT_METADATA, audioOverlayTrack, musicAssetModel, clipsEditMetadataController.A14);
        }
        clipsEditMetadataController.A0H = musicOverlayStickerModel;
        LFL lfl = clipsEditMetadataController.A0B;
        if (lfl != null) {
            lfl.A01(this.A00, false);
        }
        ClipsEditMetadataController.A0C(clipsEditMetadataController);
    }

    public C65141Lo3(View view, ClipsEditMetadataController clipsEditMetadataController) {
        this.A01 = clipsEditMetadataController;
        this.A00 = view;
    }
}
