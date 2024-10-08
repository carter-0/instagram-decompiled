package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vgv  reason: case insensitive filesystem */
public final class C17842Vgv {
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;

    public C17842Vgv(Context context, UserSession userSession, X98 x98, A91 a91) {
        0qQ.A0B(x98, 3);
        this.A01 = AnonymousClass0eN.A01(new GL8(2, 33, userSession, x98));
        this.A00 = AnonymousClass0eN.A01(new GL8(2, 32, userSession, context));
        this.A02 = AnonymousClass0eN.A01(new GL8(2, 34, userSession, a91));
    }

    public final X85 A00(C282775Er r3) {
        AnonymousClass0eM r0;
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
        return (X85) r0.getValue();
    }
}
