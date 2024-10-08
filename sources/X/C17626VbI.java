package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.Deque;
import java.util.LinkedList;

/* renamed from: X.VbI  reason: case insensitive filesystem */
public final class C17626VbI {
    public boolean A00;
    public final Handler A01 = new C14697U1x(Looper.getMainLooper(), this, 8);
    public final UserSession A02;
    public final AnonymousClass4D6 A03;
    public final C17896Vhn A04;
    public final C18062Vko A05;
    public final Deque A06 = new LinkedList();

    public C17626VbI(UserSession userSession, AnonymousClass4D6 r5, C17896Vhn vhn, C18062Vko vko) {
        C51974G9v.A1P(userSession, r5, vhn, vko);
        this.A02 = userSession;
        this.A03 = r5;
        this.A04 = vhn;
        this.A05 = vko;
    }
}
