package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.8bQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C358758bQ implements AnonymousClass0eK {
    public final /* synthetic */ C252063oV A00;
    public final /* synthetic */ C358368an A01;

    public /* synthetic */ C358758bQ(C252063oV r1, C358368an r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final Object get() {
        C358368an r6 = this.A01;
        C252063oV r5 = this.A00;
        Context context = r6.A0q;
        UserSession userSession = r6.A1J;
        return new C348987zP(context, r6.A0s, r6.A1j, userSession, r5, r6);
    }
}
