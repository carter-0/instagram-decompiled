package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;

/* renamed from: X.FrV  reason: case insensitive filesystem */
public final class C51276FrV implements Runnable {
    public final /* synthetic */ UserSession A00;

    public C51276FrV(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void run() {
        ReelStore.A03(this.A00).A0c(AnonymousClass000.A00(596));
    }
}
