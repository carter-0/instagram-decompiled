package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.9WB  reason: invalid class name */
public final class AnonymousClass9WB {
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;

    public final C41823B2e A00(C282775Er r3) {
        AnonymousClass0eM r0;
        0qQ.A0B(r3, 0);
        int ordinal = r3.ordinal();
        if (ordinal == 0) {
            r0 = this.A01;
        } else if (ordinal == 1 || ordinal == 3) {
            r0 = this.A00;
        } else if (ordinal == 2) {
            r0 = this.A02;
        } else {
            throw new UnsupportedOperationException();
        }
        return (C41823B2e) r0.getValue();
    }

    public AnonymousClass9WB(Context context, UserSession userSession, A91 a91, int i) {
        this.A01 = AnonymousClass0eN.A01(new GL8(i, 36, userSession, context));
        this.A00 = AnonymousClass0eN.A01(new GL8(i, 35, userSession, context));
        this.A02 = AnonymousClass0eN.A01(new GL8(i, 37, userSession, a91));
    }
}
