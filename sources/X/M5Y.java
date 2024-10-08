package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import instagram.features.clips.edit.ClipsEditMetadataController;
import java.io.File;

public final class M5Y implements Runnable {
    public final /* synthetic */ ClipsEditMetadataController A00;

    public M5Y(ClipsEditMetadataController clipsEditMetadataController) {
        this.A00 = clipsEditMetadataController;
    }

    public final void run() {
        ClipsEditMetadataController clipsEditMetadataController = this.A00;
        if (!clipsEditMetadataController.A0S) {
            File file = clipsEditMetadataController.A0L;
            if (file != null) {
                1Xj r0 = clipsEditMetadataController.A0D;
                if (r0 != null) {
                    String A2U = r0.A2U();
                    UserSession userSession = clipsEditMetadataController.A0s;
                    boolean z = false;
                    0qQ.A0B(userSession, 3);
                    if (A2U == null || C59730JVo.A07(userSession, file, A2U, -1) == null) {
                        0f9 AEf = 0wj.A01.AEf("ClipsEditMetadataController", 817902720);
                        AEf.ABQ(DialogModule.KEY_MESSAGE, "Attempt to download failed. Could not find cache or file.");
                        AEf.report();
                    } else {
                        z = true;
                    }
                    clipsEditMetadataController.A0S = z;
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        AnonymousClass7TF.A0D().post(new M5X(clipsEditMetadataController));
    }
}
