package com.instagram.urlhandlers.collabcollections;

import X.0eP;
import X.0qQ;
import X.0sn;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.DbS;
import X.DbT;
import X.DbX;
import X.Dbb;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.messagethread.collections.model.DirectCollectionArguments;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectThreadKey;

public final class NewCollabCollectionUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        String A0m;
        int A00 = AnonymousClass0fD.A00(43657314);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (!(A0A == null || (A0m = DbS.A0m(A0A)) == null)) {
            AnonymousClass0wW A0S = DbS.A0S(this);
            if (!(A0S instanceof UserSession)) {
                FFQ.A00().A00(this, A0A, A0S);
            } else if (0qQ.A0K(DbT.A09(A0m).getHost(), "new_collab_collection")) {
                0eP A1L = AnonymousClass7TE.A1L(AnonymousClass000.A00(434), 3);
                Dbb.A0i(this, AnonymousClass7TG.A0P(AnonymousClass000.A00(280), new DirectCollectionArguments((ImageUrl) null, (DirectThreadKey) null, (Boolean) null, AnonymousClass05K.A0C, "deep_link", (String) null, (String) null, (String) null, (String) null, (String) null, 0sn.A00, false), A1L), A0S, ModalActivity.class, "direct_new_collection");
            }
            AnonymousClass0fD.A07(79614365, A00);
        }
        finish();
        AnonymousClass0fD.A07(79614365, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
