package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.WOq  reason: case insensitive filesystem */
public final class C19184WOq implements X6T {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass07i A01;
    public final /* synthetic */ X6S A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ boolean A04;

    public C19184WOq(Context context, AnonymousClass07i r2, X6S x6s, UserSession userSession, boolean z) {
        this.A00 = context;
        this.A01 = r2;
        this.A03 = userSession;
        this.A04 = z;
        this.A02 = x6s;
    }

    public final void DED() {
        this.A02.Dv1();
    }

    public final void Don(boolean z, boolean z2) {
        if (z || z2) {
            C18794W2b.A02(this.A00, this.A01, this.A02, this.A03, this.A04);
            return;
        }
        this.A02.Dv1();
    }
}
