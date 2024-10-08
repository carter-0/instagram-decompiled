package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.DirectAREffectShare;
import java.util.List;
import java.util.Map;

public final class P7W implements C328347El {
    public final Map A00;

    public P7W(Map map) {
        0qQ.A0B(map, 1);
        this.A00 = map;
    }

    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r22, C331837So r23, AnonymousClass7L2 r24, 17i r25, boolean z) {
        List list;
        AnonymousClass7LQ r4 = (AnonymousClass7LQ) r23;
        Context context2 = context;
        0qQ.A0B(context2, 0);
        UserSession userSession2 = userSession;
        AnonymousClass7L2 r3 = r24;
        17i r1 = r25;
        C51974G9v.A1P(userSession2, r1, r3, r4);
        AnonymousClass9HC r5 = r22;
        boolean A1S = C66582MXn.A1S(userSession2, r5, z);
        C254703su r8 = r4.A0e;
        String A0u = C66582MXn.A0u(r8, A1S ? 1 : 0);
        0qQ.A0A(A0u);
        Object obj = r8.A1T;
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectAREffectShare");
        DirectAREffectShare directAREffectShare = (DirectAREffectShare) obj;
        this.A00.put(directAREffectShare.A02(), directAREffectShare);
        String A01 = directAREffectShare.A01();
        ImageUrl A002 = directAREffectShare.A00();
        String A02 = directAREffectShare.A02();
        String A03 = directAREffectShare.A03();
        0qQ.A07(A03);
        AnonymousClass3HX r0 = directAREffectShare.A03;
        ImageUrl imageUrl = null;
        if (r0 == null || (list = r0.A1j) == null || !AnonymousClass7TE.A1b(list) || (imageUrl = ((1Xj) list.get(0)).A1Q()) != null) {
            return new N69(new NYW(A002, imageUrl, C66580MXl.A0Y(context2, userSession2, r5, r4, r8), C66582MXn.A0U(userSession2, r5, r4, r3, r8), A01, A02, A03), AnonymousClass7FX.A03(context2, userSession2, r5, r4, r3, r1), A0u);
        }
        throw AnonymousClass7TE.A0y();
    }
}
