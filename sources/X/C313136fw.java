package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.instagram.common.session.UserSession;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.6fw  reason: invalid class name and case insensitive filesystem */
public final class C313136fw implements ComponentCallbacks2 {
    public static C313136fw A09;
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final C61250m8 A05;
    public final Queue A06;
    public final Queue A07 = new LinkedList();
    public final Queue A08 = new LinkedList();

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void A00() {
        this.A08.clear();
        this.A07.clear();
        this.A06.clear();
        this.A00 = false;
        this.A01 = false;
        this.A02 = false;
    }

    public final void onTrimMemory(int i) {
        if (i >= 20) {
            A00();
        }
    }

    public C313136fw(Context context, UserSession userSession) {
        this.A05 = new C61250m8(context, 0);
        UserSession A002 = AnonymousClass624.A00(AnonymousClass624.A03.A00(userSession));
        0Tu r3 = 0Tu.A05;
        this.A04 = (int) 182.A01(r3, A002, 36592253781148031L);
        this.A06 = new LinkedList();
        this.A03 = (int) 182.A01(r3, userSession, 36594207988909711L);
    }

    public final void onLowMemory() {
        A00();
    }
}
