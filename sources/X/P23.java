package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.modal.ModalActivity;

public final class P23 implements C74319Psv {
    public final UserSession A00;
    public final P9G A01;

    public P23(UserSession userSession, P9G p9g) {
        0qQ.A0B(p9g, 1);
        this.A01 = p9g;
        this.A00 = userSession;
    }

    public final boolean Cmw(Uri uri, N3I n3i) {
        0qQ.A0B(uri, 0);
        if (!"direct_daily_prompt_submissions".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        P9G p9g = this.A01;
        String queryParameter = uri.getQueryParameter("collection_id");
        String queryParameter2 = uri.getQueryParameter(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        String queryParameter3 = uri.getQueryParameter("subtitle_text");
        Bundle A0C = DbV.A0C("collection_id", queryParameter);
        A0C.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, queryParameter2);
        A0C.putString("card_gallery_collection_title", queryParameter3);
        C67002Mga.A01(A0C, (C254743sy) C66580MXl.A0s(p9g.A0C), "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        AnonymousClass0eK r2 = p9g.A08;
        AnonymousClass7S7 A0d = C66582MXn.A0d(r2);
        FragmentActivity fragmentActivity = p9g.A00;
        A0C.putParcelable("DirectThreadSharedMediaFragment.DIRECT_SHARED_MEDID_SHARED_TARGET", 0B0.A00(A0d.C6Z(fragmentActivity)));
        C242243Te BiC = C66582MXn.A0d(r2).BiC();
        int i = C66582MXn.A0X(r2).A08;
        UserSession userSession = p9g.A03;
        A0C.putString("channel_user_type", C329997La.A00(BiC, userSession.A06, i));
        A0C.putString("card_gallery_entry_point", "channel_daily_prompt_xma");
        AnonymousClass6W8 A0b = DbS.A0b(fragmentActivity, A0C, userSession, ModalActivity.class, "direct_daily_prompts_add_response");
        A0b.A00 = 1;
        C66581MXm.A16(fragmentActivity, A0b);
        return true;
    }
}
