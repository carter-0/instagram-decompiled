package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.archive.fragment.ArchiveReelFragment;
import com.instagram.archive.fragment.InlineAddHighlightFragment;
import com.instagram.archive.intf.ArchivePendingUpload;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;

public abstract class LT8 {
    public static final LS7 A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        LS7 ls7 = (LS7) userSession.A01(LS7.class, new MBI(userSession, 2));
        0qQ.A07(ls7);
        return ls7;
    }

    public static final C15396Ubz A02(String str) {
        0qQ.A0B(str, 0);
        C15396Ubz ubz = new C15396Ubz();
        DbZ.A1B(ubz, "IgSessionManager.SESSION_TOKEN_KEY", str);
        return ubz;
    }

    public static final InlineAddHighlightFragment A03(ArchivePendingUpload archivePendingUpload, IngestSessionShim ingestSessionShim, String str) {
        Dba.A0j(1, str, archivePendingUpload);
        Fragment r1 = new C240373Kq();
        DbT.A1N(r1, new 0eP[]{AnonymousClass7TE.A1L("IgSessionManager.SESSION_TOKEN_KEY", str), AnonymousClass7TE.A1L("InlineAddHighlightFragment.ARG_CAPTURED_MEDIA_FILE_PATH", archivePendingUpload.A03), AnonymousClass7TE.A1L("InlineAddHighlightFragment.ARG_CAPTURED_MEDIA_IS_VIDEO", Boolean.valueOf(archivePendingUpload.A05)), AnonymousClass7TE.A1L("initial_selected_media_width", Integer.valueOf(archivePendingUpload.A02)), AnonymousClass7TE.A1L("initial_selected_media_height", Integer.valueOf(archivePendingUpload.A00)), AnonymousClass7TE.A1L("InlineAddHighlightsFragment.ARG_MEDIA_ROTATION_DEGREES", Integer.valueOf(archivePendingUpload.A01)), AnonymousClass7TE.A1L("InlineAddHighlightsFragment.ARG_IS_MEDIA_MIRRORED", Boolean.valueOf(archivePendingUpload.A04)), AnonymousClass7TE.A1L("is_in_story_creation_flow_tray", true), AnonymousClass7TE.A1L("InlineAddHighlightsFragment.ARG_INGEST_SESSION", ingestSessionShim), AnonymousClass7TE.A1L("should_request_highlight_tray", true), AnonymousClass7TE.A1L("default_new_highlight_title", (Object) null)});
        return r1;
    }

    public static final C54154H0y A05(String str) {
        0qQ.A0B(str, 0);
        C54154H0y h0y = new C54154H0y();
        DbZ.A1B(h0y, "IgSessionManager.SESSION_TOKEN_KEY", str);
        return h0y;
    }

    public static final void A06(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        LQZ A00 = LQZ.A00(userSession);
        synchronized (A00) {
            A00.A01 = null;
            A00.A02.clear();
            A00.A03.clear();
            A00.A04.clear();
            A00.A05.clear();
        }
    }

    public static final InlineAddHighlightFragment A04(ImageUrl imageUrl, AnonymousClass3BQ r6, String str, String str2) {
        Fragment r4 = new C240373Kq();
        DbT.A1N(r4, AnonymousClass7TH.A0h(AnonymousClass000.A00(1747), r6, AnonymousClass7TE.A1L("IgSessionManager.SESSION_TOKEN_KEY", str), AnonymousClass7TE.A1L("current_reel_item_media_id", str2), AnonymousClass7TE.A1L("initial_selected_media_url", imageUrl)));
        return r4;
    }

    public static final Fragment A00(Bundle bundle, UserSession userSession) {
        Fragment archiveReelFragment;
        if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36316869065577153L)) {
            archiveReelFragment = new K65();
        } else {
            archiveReelFragment = new ArchiveReelFragment();
        }
        Fragment fragment = archiveReelFragment;
        fragment.setArguments(bundle);
        return fragment;
    }
}
