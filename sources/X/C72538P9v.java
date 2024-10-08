package X;

import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel;

/* renamed from: X.P9v  reason: case insensitive filesystem */
public final class C72538P9v implements AnonymousClass7ST {
    public final /* synthetic */ C68493NKm A00;

    public final void Eun(C74501Pvv pvv, MessageActionsViewModel messageActionsViewModel) {
        Bundle bundle;
        C68493NKm nKm = this.A00;
        if (nKm.isResumed() && (bundle = nKm.mArguments) != null) {
            int i = bundle.getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CURRENT_THEME_ID", 0);
            UserSession A0l = AnonymousClass7TE.A0l(nKm.A0I);
            C254743sy r8 = nKm.A08;
            if (r8 == null) {
                0qQ.A0F("unifiedThreadKey");
                throw AnonymousClass00P.createAndThrow();
            }
            NIE A01 = NIE.A01(A0l, messageActionsViewModel, (C254783t2) null, r8, i, false, false, false, false);
            nKm.A06 = A01;
            A01.A0N(pvv);
            0s1 A0C = DbW.A0C(nKm);
            A0C.A0C(A01, nKm.A0E, R.id.card_gallery_fragment);
            A0C.A00();
        }
    }

    public C72538P9v(C68493NKm nKm) {
        this.A00 = nKm;
    }
}
