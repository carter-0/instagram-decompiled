package X;

import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.modal.ModalActivity;

public final class P24 implements C74319Psv {
    public final UserSession A00;
    public final P9G A01;

    public P24(UserSession userSession, P9G p9g) {
        0qQ.A0B(p9g, 1);
        this.A01 = p9g;
        this.A00 = userSession;
    }

    public final boolean Cmw(Uri uri, N3I n3i) {
        AnonymousClass3U9 r1;
        Uri uri2 = uri;
        N3I n3i2 = n3i;
        boolean A1U = AnonymousClass7TF.A1U(0, uri2, n3i2);
        if (!"direct_prompt_questions_response".equalsIgnoreCase(uri2.getHost())) {
            return false;
        }
        String queryParameter = uri2.getQueryParameter("collection_type");
        if (queryParameter != null) {
            C69870NtY.A00(this.A00, AnonymousClass79B.A01(queryParameter));
        }
        P9G p9g = this.A01;
        String queryParameter2 = uri2.getQueryParameter("collection_type");
        String queryParameter3 = uri2.getQueryParameter("collection_id");
        String queryParameter4 = uri2.getQueryParameter(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        String queryParameter5 = uri2.getQueryParameter("subtitle_text");
        String queryParameter6 = uri2.getQueryParameter("seed_message_sender_id");
        String str = n3i2.A08;
        String str2 = n3i2.A07;
        String str3 = n3i2.A09;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("surface", queryParameter2);
        A0a.putString("collection_id", queryParameter3);
        A0a.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, queryParameter4);
        A0a.putString("seed_message_sender_id", queryParameter6);
        A0a.putString("message_id", str);
        A0a.putString("client_context", str2);
        A0a.putString("card_gallery_sender_id", str3);
        A0a.putString("card_gallery_collection_title", queryParameter5);
        C67002Mga.A01(A0a, (C254743sy) C66580MXl.A0s(p9g.A0C), "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        A0a.putString("DirectFragment.ENTRY_POINT", "XMA");
        UserSession userSession = p9g.A03;
        2Dm A002 = 1bJ.A00(userSession);
        if (queryParameter4 != null) {
            r1 = C66580MXl.A0d(A002, queryParameter4);
        } else {
            r1 = null;
        }
        if (0qQ.A0K(queryParameter2, "questions") && r1 != null) {
            AnonymousClass7IP.A00(p9g.A02, userSession).A05(AnonymousClass79B.A01(queryParameter2), r1.C6C(), r1.C6k(), r1.C6a(), r1.AdN());
        }
        Dbb.A0i(p9g.A00, A0a, userSession, ModalActivity.class, C273654mx.A00(661));
        return A1U;
    }
}
