package X;

import com.facebook.react.modules.dialog.DialogModule;
import instagram.features.clips.edit.ClipsEditMetadataController;

public final class KAY extends 1P0 {
    public final /* synthetic */ ClipsEditMetadataController A00;

    public KAY(ClipsEditMetadataController clipsEditMetadataController) {
        this.A00 = clipsEditMetadataController;
    }

    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(-1886805198);
        0f9 AEf = 0wj.A01.AEf("ClipsEditMetadataController", 817902720);
        AEf.ABQ(DialogModule.KEY_MESSAGE, "failed to load media");
        AEf.report();
        AnonymousClass0fD.A0A(744345110, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-1053333433);
        ClipsEditMetadataController.A0G(this.A00, false);
        AnonymousClass0fD.A0A(1363010306, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(1123043908);
        ClipsEditMetadataController.A0G(this.A00, true);
        AnonymousClass0fD.A0A(-456847576, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(2067836507);
        1XO r6 = (1XO) obj;
        int A032 = AnonymousClass0fD.A03(-924139173);
        0qQ.A0B(r6, 0);
        1Xj A0T = DbZ.A0T(r6.A06, 0);
        if (A0T != null) {
            ClipsEditMetadataController clipsEditMetadataController = this.A00;
            1E7.A00(clipsEditMetadataController.A0s).A03(A0T);
            ClipsEditMetadataController.A04(A0T, clipsEditMetadataController);
        }
        AnonymousClass0fD.A0A(1832935880, A032);
        AnonymousClass0fD.A0A(1760612513, A03);
    }
}
