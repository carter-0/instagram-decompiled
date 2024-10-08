package X;

import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.Eqa  reason: case insensitive filesystem */
public abstract class C49169Eqa {
    public static final void A00(Uri uri, FragmentActivity fragmentActivity, UserSession userSession) {
        0qQ.A0B(uri, 0);
        AnonymousClass7TF.A1B(fragmentActivity, 1, userSession);
        String queryParameter = uri.getQueryParameter("thread_igid");
        if (queryParameter != null) {
            String queryParameter2 = uri.getQueryParameter("invite_id");
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            String queryParameter3 = uri.getQueryParameter("fan_club_id");
            if (queryParameter3 != null) {
                String queryParameter4 = uri.getQueryParameter("origin");
                if (queryParameter2.length() > 0) {
                    Dbc.A0R(1as.A04.A02.A09((String) null, (String) null, false), fragmentActivity, userSession);
                }
                AnonymousClass6W8 A0b = DbS.A0b(fragmentActivity, Q21.A00(AnonymousClass7TE.A1L("bottom_sheet_content_fragment", AnonymousClass000.A00(3007)), AnonymousClass7TE.A1L(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, queryParameter), AnonymousClass7TE.A1L("invite_id", queryParameter2), AnonymousClass7TE.A1L("fan_club_id", queryParameter3), AnonymousClass7TE.A1L("origin", queryParameter4)), userSession, TransparentModalActivity.class, "bottom_sheet");
                A0b.A0G = true;
                A0b.A0C(fragmentActivity);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
