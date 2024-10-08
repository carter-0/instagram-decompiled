package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lvo  reason: case insensitive filesystem */
public final class C65564Lvo implements G6H {
    public final Context A00;
    public final AnonymousClass07i A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;

    public final void CI0(Uri uri, Bundle bundle) {
        UserSession userSession = this.A03;
        String string = W3U.A02(userSession, W3U.A00).getString(AnonymousClass000.A00(3492), (String) null);
        C63951LEt A0V = C249713kF.A00.A0V(userSession);
        0qQ.A07(A0V);
        Context context = this.A00;
        AnonymousClass0iw r6 = this.A02;
        AnonymousClass07i r3 = this.A01;
        A0V.A00(context, r3, r6, string, true);
        if (string != null) {
            0qQ.A0B(r3, 3);
            C66279MLo mLo = C66279MLo.A00;
            C66280MLp mLp = C66280MLp.A00;
            AnonymousClass7TG.A1R(mLo, mLp);
            A0V.A01(context, r3, mLp, new C58811Ixw(context, A0V, r3, mLp, mLo, r6, string, 1));
        }
    }

    public C65564Lvo(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession) {
        0gy A002 = AnonymousClass07i.A00(fragmentActivity);
        this.A00 = fragmentActivity;
        this.A02 = r3;
        this.A03 = userSession;
        this.A01 = A002;
    }
}
