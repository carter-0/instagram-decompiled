package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.prompts.DirectPromptTypes;
import java.util.List;

public final class P22 implements C74319Psv {
    public final UserSession A00;
    public final AnonymousClass7XT A01;

    public P22(UserSession userSession, AnonymousClass7XT r3) {
        0qQ.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = userSession;
    }

    public final boolean Cmw(Uri uri, N3I n3i) {
        Uri uri2 = uri;
        N3I n3i2 = n3i;
        boolean A1U = AnonymousClass7TF.A1U(0, uri2, n3i2);
        if (!"direct_media_collection".equalsIgnoreCase(uri2.getHost())) {
            return false;
        }
        String queryParameter = uri2.getQueryParameter("collection_type");
        String queryParameter2 = uri2.getQueryParameter("collection_id");
        String queryParameter3 = uri2.getQueryParameter(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        if (queryParameter != null) {
            DirectPromptTypes A012 = AnonymousClass79B.A01(queryParameter);
            DirectPromptTypes directPromptTypes = DirectPromptTypes.ROLL_CALL;
            UserSession userSession = this.A00;
            if (A012 == directPromptTypes) {
                1Ln A03 = 1Ln.A03(new C70846ONz(DbS.A0O("CardGalleryDeeplinkHandler"), userSession).A00);
                if (DbT.A1Y(A03)) {
                    A03.A0M(C69497Nmf.TAP, "action");
                    C66583MXo.A11(C69494Nmc.XMA, A03, queryParameter2, queryParameter3);
                }
            } else {
                C69870NtY.A00(userSession, A012);
            }
        }
        this.A01.CpM(uri2.getQueryParameter("collection_type"), queryParameter2, queryParameter3, uri2.getQueryParameter("seed_message_sender_id"), n3i2.A08, n3i2.A07, n3i2.A09, n3i2.A0C, (List) null, n3i2.A0B);
        return A1U;
    }
}
