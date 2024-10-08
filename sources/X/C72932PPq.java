package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.PPq  reason: case insensitive filesystem */
public final class C72932PPq implements 0Jp {
    public final /* synthetic */ 2If A00;
    public final /* synthetic */ AtomicReference A01;

    public C72932PPq(2If r1, AtomicReference atomicReference) {
        this.A00 = r1;
        this.A01 = atomicReference;
    }

    public final void ATC(UserSession userSession, 0Jv r4) {
        this.A01.set(2J7.A00(userSession));
        r4.AId((Object) null);
    }
}
