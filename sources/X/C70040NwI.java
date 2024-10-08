package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.NwI  reason: case insensitive filesystem */
public abstract class C70040NwI {
    /* JADX WARNING: type inference failed for: r0v5, types: [X.7Da, X.NY4] */
    public static final NY4 A00(Context context, AnonymousClass0iw r13, UserSession userSession, C3256673q r15, AnonymousClass7Bn r16, AnonymousClass7X0 r17, AnonymousClass9HC r18) {
        AnonymousClass7X0 r7 = r17;
        P8E p8e = new P8E(userSession, (AnonymousClass7X1) r7);
        AnonymousClass7XR r2 = (AnonymousClass7XR) r7;
        AnonymousClass9HC r3 = r18;
        C3266077l A01 = C3259074q.A01(p8e, r2, r3);
        C3266077l A012 = C3259074q.A01(P8M.A00, r2, r3);
        AnonymousClass7DZ r10 = new AnonymousClass7DZ(AnonymousClass7TE.A1I(A01));
        return new C327997Da(r16, new C72563PAu(context, r13, userSession, r15, r7, p8e, (AnonymousClass7ZF) userSession.A01(AnonymousClass7ZF.class, AnonymousClass7ZE.A00), r10, A012));
    }
}
