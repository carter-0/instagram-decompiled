package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.common.session.UserSession;

/* renamed from: X.7L4  reason: invalid class name */
public final class AnonymousClass7L4 implements C332187Tz {
    public final UserSession A00;
    public final C333517Zg A01;
    public final AnonymousClass0eK A02;

    public final boolean CXh() {
        return C308556Us.A08(this.A00, this.A01.C6l().C6Q());
    }

    public final boolean CXi() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A02.get();
        if (linearLayoutManager == null) {
            return false;
        }
        return this.A01.BSN().CRR(linearLayoutManager.A1a(), linearLayoutManager.A1b());
    }

    public final boolean CdC() {
        AnonymousClass7S7 C6l = this.A01.C6l();
        C254783t2 C6c = C6l.C6c();
        0qQ.A07(C6c);
        boolean z = C6c instanceof C254773t1;
        AnonymousClass7SD C6Q = C6l.C6Q();
        UserSession userSession = this.A00;
        0qQ.A0A(C6Q);
        return C308556Us.A0B(userSession, C6Q, z);
    }

    public AnonymousClass7L4(UserSession userSession, C333517Zg r2, AnonymousClass0eK r3) {
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = r3;
    }
}
