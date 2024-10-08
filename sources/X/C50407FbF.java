package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.FbF  reason: case insensitive filesystem */
public final class C50407FbF implements C74405PuL {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C333517Zg A03;

    public final boolean isEnabled() {
        return this.A03.C6l().COb();
    }

    public C50407FbF(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, C333517Zg r4) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = r4;
        this.A01 = r2;
    }

    public final List getItems() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        C333517Zg r3 = this.A03;
        AnonymousClass0iw r2 = this.A01;
        C50403FbB fbB = new C50403FbB(fragmentActivity, r2, userSession, r3);
        if (fbB.isEnabled()) {
            A1C.add(fbB);
        }
        C50404FbC fbC = new C50404FbC(fragmentActivity, r2, userSession, r3);
        if (fbC.isEnabled()) {
            A1C.add(fbC);
        }
        return A1C;
    }
}
