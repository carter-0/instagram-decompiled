package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;

/* renamed from: X.6hz  reason: invalid class name and case insensitive filesystem */
public final class C314306hz {
    public AnonymousClass5Gv A00;
    public C234222xL A01;
    public final Context A02;
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public final UserSession A04;
    public final 1Av A05;
    public final Runnable A06 = new C314316i0(this);

    public C314306hz(Context context, UserSession userSession) {
        this.A02 = context;
        this.A04 = userSession;
        this.A05 = 1Au.A00(userSession);
    }
}
