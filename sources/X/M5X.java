package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import instagram.features.clips.edit.ClipsEditMetadataController;

public final class M5X implements Runnable {
    public final /* synthetic */ ClipsEditMetadataController A00;

    public M5X(ClipsEditMetadataController clipsEditMetadataController) {
        this.A00 = clipsEditMetadataController;
    }

    public final void run() {
        ClipsEditMetadataController clipsEditMetadataController = this.A00;
        ClipsEditMetadataController.A0G(clipsEditMetadataController, false);
        IgImageView igImageView = clipsEditMetadataController.thumbnailImage;
        if (igImageView != null) {
            igImageView.setEnabled(true);
        }
        if (clipsEditMetadataController.A0S) {
            FragmentActivity requireActivity = clipsEditMetadataController.A0q.requireActivity();
            UserSession userSession = clipsEditMetadataController.A0s;
            C309516Yo A0M = DbS.A0M(requireActivity, userSession);
            A0M.A0G = true;
            A0M.A08();
            String str = clipsEditMetadataController.A13;
            String valueOf = String.valueOf(clipsEditMetadataController.A0L);
            0qQ.A0B(valueOf, 2);
            DbW.A0x(DbY.A0C(AnonymousClass000.A00(211), valueOf, AnonymousClass7TE.A1L("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05), AnonymousClass7TE.A1L(AnonymousClass000.A00(212), str)), new C61813KNc(), A0M);
            return;
        }
        C59689JTv.A0B(clipsEditMetadataController.A0n, "video_download_failed");
    }
}
