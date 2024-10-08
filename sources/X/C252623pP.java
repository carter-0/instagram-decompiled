package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.3pP  reason: invalid class name and case insensitive filesystem */
public final class C252623pP {
    public final C252643pR A00;
    public final AnonymousClass4EZ A01;

    public C252623pP(Context context, FragmentActivity fragmentActivity, UserSession userSession, C252593pM r22, AnonymousClass4DU r23, AnonymousClass4DV r24, C249763kK r25, String str, boolean z) {
        Context context2 = context;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        UserSession userSession2 = userSession;
        boolean z2 = z;
        AnonymousClass4EZ r1 = new AnonymousClass4EZ(context2, fragmentActivity2, r23, userSession2, r22.BRM(), r24, z2, true);
        C252643pR r9 = new C252643pR(context2, fragmentActivity2, userSession2, r22.BQE(), r25, str, false, z2);
        this.A01 = r1;
        this.A00 = r9;
    }
}
