package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;
import java.util.concurrent.Executor;

/* renamed from: X.7Af  reason: invalid class name and case insensitive filesystem */
public final class C327297Af implements C327287Ae {
    public final C327287Ae A00;
    public final Executor A01;
    public final Executor A02;

    public final void AOa(C13919TlL tlL, String str) {
        this.A02.execute(new C20273WoO(tlL, this, str));
    }

    public final void AYi(C18983WFk wFk, String str) {
        this.A02.execute(new C20271WoM(wFk, this, str));
    }

    public final void AYj(C13920TlM tlM) {
        this.A02.execute(new C20134Wlu(tlM, this));
    }

    public final void FMb(C13919TlL tlL, LiveLocationSession liveLocationSession) {
        this.A02.execute(new C20272WoN(tlL, this, liveLocationSession));
    }

    public C327297Af(C327287Ae r1, Executor executor, Executor executor2) {
        this.A00 = r1;
        this.A02 = executor;
        this.A01 = executor2;
    }
}
