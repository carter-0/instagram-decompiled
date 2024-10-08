package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7Hh  reason: invalid class name and case insensitive filesystem */
public final class C329027Hh implements C332827Wn, AnonymousClass7X5 {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final UserSession A01;
    public final AnonymousClass0eK A02;

    public final C70440O6r Cg8(C74403PuJ puJ, String str) {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        UserSession userSession = this.A01;
        AnonymousClass0eM r0 = C71105Ocj.A05;
        C69851NtF.A00(userSession).A03(new C71879OsN(this, puJ, atomicBoolean), str);
        return new C70440O6r(atomicBoolean);
    }

    public final C70762OKi CgK(C74328Pt4 pt4, String str) {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        C70465O7q CgJ = ((C333517Zg) this.A02.get()).AvL().CgJ(new C70607ODe(this, pt4, atomicBoolean), str);
        if (CgJ != null) {
            return new C70762OKi(this, CgJ, atomicBoolean);
        }
        return null;
    }

    public C329027Hh(UserSession userSession, AnonymousClass0eK r4) {
        this.A01 = userSession;
        this.A02 = r4;
    }
}
