package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;

/* renamed from: X.JWe  reason: case insensitive filesystem */
public final class C59745JWe {
    public AnonymousClass5Gv A00;
    public Runnable A01;
    public boolean A02;
    public final Handler A03;
    public final UserSession A04;

    public final synchronized void A00(AnonymousClass5Gv r5) {
        this.A02 = true;
        this.A00 = r5;
        M6J m6j = new M6J(this, r5);
        this.A03.postDelayed(m6j, 500);
        this.A01 = m6j;
    }

    public C59745JWe(Handler handler, UserSession userSession) {
        this.A04 = userSession;
        this.A03 = handler;
    }
}
