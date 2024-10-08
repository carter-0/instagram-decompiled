package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class P7K implements C328347El {
    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r20, C331837So r21, AnonymousClass7L2 r22, 17i r23, boolean z) {
        AnonymousClass7LQ r8 = (AnonymousClass7LQ) r21;
        Context context2 = context;
        UserSession userSession2 = userSession;
        17i r4 = r23;
        AnonymousClass7TG.A1T(context2, userSession2, r4);
        AnonymousClass9HC r7 = r20;
        AnonymousClass7L2 r9 = r22;
        C51973G9u.A0r(3, r9, r8, r7);
        0t0 A01 = AnonymousClass0eN.A01(AnonymousClass7FC.A00);
        C254703su r2 = r8.A0e;
        C328667Fr A012 = new C3264276s((AnonymousClass773) null, (Map) null, (DefaultConstructorMarker) null, 3).A01(context2, userSession2, AnonymousClass7FD.A04(userSession2, r7, r8, r9, r2.A10, A01), r7, r8);
        String A0s = C66582MXn.A0s(userSession2, r2, z);
        0qQ.A0A(A0s);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0B(A012, 3);
        return new OuI(AnonymousClass7FX.A03(context2, userSession2, r7, r8, r9, r4), new NYJ(C66580MXl.A0Y(context2, userSession2, r7, r8, r2), A012), A0s);
    }
}
