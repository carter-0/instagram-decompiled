package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;

/* renamed from: X.6j9  reason: invalid class name and case insensitive filesystem */
public final class C314976j9 {
    public Runnable A00;
    public boolean A01;
    public final Activity A02;
    public final Context A03;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final UserSession A05;
    public final C314996jB A06;
    public final C273384mU A07;

    public C314976j9(Activity activity, Context context, UserSession userSession, C273384mU r6) {
        this.A02 = activity;
        this.A03 = context;
        this.A05 = userSession;
        this.A07 = r6;
        this.A06 = C314986jA.A00(userSession);
    }
}
