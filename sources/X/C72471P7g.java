package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.P7g  reason: case insensitive filesystem */
public final class C72471P7g implements C328347El {
    public final AnonymousClass0eM A00;

    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r28, C331837So r29, AnonymousClass7L2 r30, 17i r31, boolean z) {
        Context context2 = context;
        AnonymousClass7LQ A0Y = C66581MXm.A0Y(r29, context2);
        UserSession userSession2 = userSession;
        AnonymousClass7L2 r5 = r30;
        17i r4 = r31;
        C51974G9v.A1P(userSession2, r4, r5, A0Y);
        AnonymousClass9HC r6 = r28;
        boolean A1S = C66582MXn.A1S(userSession2, r6, z);
        C254703su r9 = A0Y.A0e;
        String A0u = C66582MXn.A0u(r9, A1S ? 1 : 0);
        0qQ.A0A(A0u);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        AnonymousClass0eM r10 = this.A00;
        0qQ.A0B(r10, 3);
        Object obj = r9.A1T;
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.user.model.User");
        User user = (User) obj;
        String fullName = user.getFullName();
        ImageUrl Bh3 = user.Bh3();
        MessagingUser A002 = MessagingUser.A00(user);
        List A0s = r9.A0s();
        return new N6M(AnonymousClass7FX.A03(context2, userSession2, r6, A0Y, r5, r4), new NYZ(Bh3, C66580MXl.A0Y(context2, userSession2, r6, A0Y, r9), AnonymousClass7FD.A04(userSession2, r6, A0Y, r5, r9.A10, r10), A002, fullName, (String) C66801Mcn.A00(user.getUsername(), "", "User#getUsername"), A0s), A0u);
    }

    public C72471P7g(AnonymousClass0eM r1) {
        this.A00 = r1;
    }
}
