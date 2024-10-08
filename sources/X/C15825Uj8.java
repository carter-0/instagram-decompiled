package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Uj8  reason: case insensitive filesystem */
public final class C15825Uj8 extends 2Cn {
    public final /* synthetic */ C14437TwL A00;

    public C15825Uj8(C14437TwL twL) {
        this.A00 = twL;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        DirectShareTarget directShareTarget;
        AnonymousClass9B2 r9 = (AnonymousClass9B2) obj;
        0qQ.A0B(r9, 0);
        C14437TwL twL = this.A00;
        twL.A00 = r9;
        FragmentActivity fragmentActivity = twL.A01;
        Context applicationContext = fragmentActivity.getApplicationContext();
        0qQ.A07(applicationContext);
        UserSession userSession = twL.A04;
        AnonymousClass9B2 r0 = twL.A00;
        if (r0 != null) {
            directShareTarget = r0.A00();
        } else {
            directShareTarget = null;
        }
        C49951FGg.A02(applicationContext, fragmentActivity, twL.A02, userSession, C69287Nin.IG_SEARCH, directShareTarget);
    }
}
