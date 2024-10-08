package X;

import android.util.SparseArray;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import java.util.LinkedList;

/* renamed from: X.L0o  reason: case insensitive filesystem */
public final class C63626L0o {
    public final SparseArray A00 = new SparseArray();

    public C63626L0o(UserSession userSession, CreationSession creationSession) {
        LinkedList<C63805L7l> A002 = C63125Krt.A00(userSession);
        C64938Lkd lkd = new C64938Lkd(userSession, creationSession);
        for (C63805L7l l7l : A002) {
            this.A00.append(l7l.A00, new C61715KJg(userSession, l7l, lkd));
        }
    }
}
