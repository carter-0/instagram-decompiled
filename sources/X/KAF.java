package X;

import instagram.features.clips.edit.ClipsEditMetadataController;

public final class KAF extends 1P0 {
    public final /* synthetic */ ClipsEditMetadataController A00;

    public KAF(ClipsEditMetadataController clipsEditMetadataController) {
        this.A00 = clipsEditMetadataController;
    }

    public final void onFail(C268654dm r6) {
        int A03 = AnonymousClass0fD.A03(-1418780880);
        ClipsEditMetadataController clipsEditMetadataController = this.A00;
        if (clipsEditMetadataController.A0c) {
            C59689JTv.A0F(clipsEditMetadataController.A0q.getActivity(), "save_cover_photo_failed", 2131961521);
        }
        ClipsEditMetadataController.A0G(clipsEditMetadataController, false);
        AnonymousClass0fD.A0A(1677200169, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-973626599);
        int A032 = AnonymousClass0fD.A03(1005668262);
        ClipsEditMetadataController clipsEditMetadataController = this.A00;
        ClipsEditMetadataController.A0G(clipsEditMetadataController, false);
        ClipsEditMetadataController.A0A(clipsEditMetadataController);
        AnonymousClass0fD.A0A(371864285, A032);
        AnonymousClass0fD.A0A(-1651024330, A03);
    }
}
