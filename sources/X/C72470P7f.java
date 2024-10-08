package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.P7f  reason: case insensitive filesystem */
public final class C72470P7f implements C328347El {
    public final Map A00;

    public C72470P7f(Map map) {
        0qQ.A0B(map, 1);
        this.A00 = map;
    }

    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r18, C331837So r19, AnonymousClass7L2 r20, 17i r21, boolean z) {
        Context context2 = context;
        AnonymousClass7LQ A0Y = C66581MXm.A0Y(r19, context2);
        UserSession userSession2 = userSession;
        AnonymousClass7L2 r8 = r20;
        17i r14 = r21;
        C51974G9v.A1P(userSession2, r14, r8, A0Y);
        AnonymousClass9HC r6 = r18;
        String A0i = C66583MXo.A0i(userSession2, A0Y, r6, z);
        0qQ.A0A(A0i);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new OuJ(AnonymousClass7FX.A03(context2, userSession2, r6, A0Y, r8, r14), C70008Nvm.A00(context2, userSession2, r6, A0Y, r8, this.A00), A0i);
    }
}
