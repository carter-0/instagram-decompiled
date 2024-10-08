package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.87S  reason: invalid class name */
public final /* synthetic */ class AnonymousClass87S implements AnonymousClass0eK {
    public final /* synthetic */ C3509386y A00;

    public /* synthetic */ AnonymousClass87S(C3509386y r1) {
        this.A00 = r1;
    }

    public final Object get() {
        C19475WaN waN;
        AnonymousClass8YF r0;
        C3509386y r02 = this.A00;
        AnonymousClass87H r5 = r02.A0G;
        Context context = r02.A06;
        UserSession userSession = r02.A0C;
        View view = r02.A07;
        AnonymousClass4DH r3 = r02.A0A;
        AnonymousClass80U r6 = r02.A0K;
        AnonymousClass87G r03 = r02.A00;
        if (r03 == null || (r0 = r03.A08) == null) {
            waN = null;
        } else {
            waN = new C19475WaN(r0);
        }
        return new C387459mF(context, view, r3, userSession, r5, r6, waN);
    }
}
