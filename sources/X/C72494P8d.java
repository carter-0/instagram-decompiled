package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.P8d  reason: case insensitive filesystem */
public final class C72494P8d implements C333167Xx {
    public final AnonymousClass7SM A00;
    public final Context A01;
    public final UserSession A02;
    public final OMC A03;

    public C72494P8d(Context context, UserSession userSession, AnonymousClass7SM r4) {
        0qQ.A0B(r4, 3);
        this.A01 = context;
        this.A02 = userSession;
        this.A00 = r4;
        this.A03 = new OMC(userSession);
    }

    public final void AN2(MessageIdentifier messageIdentifier) {
        0qQ.A0B(messageIdentifier, 0);
        C66582MXn.A1A(AnonymousClass7TE.A0e(this.A03.A00, "direct_shared_album_create_album"), "module", "direct_thread");
        ENY.A02.A00(this.A01, this.A02, new PIT(2, messageIdentifier, this), false);
    }
}
