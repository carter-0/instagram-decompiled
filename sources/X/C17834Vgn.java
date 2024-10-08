package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Vgn  reason: case insensitive filesystem */
public final class C17834Vgn {
    public final 1Av A00;
    public final List A01 = new CopyOnWriteArrayList();
    public final UserSession A02;

    public C17834Vgn(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = 1Au.A00(userSession);
    }

    public final void A00(boolean z) {
        1Av r3 = this.A00;
        if (r3.A1k() != z) {
            for (C14629Tzb A002 : this.A01) {
                A002.A00(this.A02, z);
            }
            AnonymousClass7TF.A1J(r3, r3.A0T, 1Av.A8a, 144, z);
        }
    }
}
