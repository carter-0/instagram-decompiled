package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.WOs  reason: case insensitive filesystem */
public final class C19186WOs implements X6U {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass07i A01;
    public final /* synthetic */ VMZ A02;
    public final /* synthetic */ X6S A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;

    public C19186WOs(Context context, AnonymousClass07i r2, VMZ vmz, X6S x6s, UserSession userSession, String str) {
        this.A03 = x6s;
        this.A05 = str;
        this.A00 = context;
        this.A01 = r2;
        this.A04 = userSession;
        this.A02 = vmz;
    }

    public final void DED() {
        this.A03.Dv1();
    }

    public final void Dol(boolean z) {
        if (z) {
            this.A03.E4Q(this.A05);
            return;
        }
        C18794W2b.A00(this.A00, this.A01, new C19179WOl(3, this.A02, this.A03), this.A04);
    }
}
