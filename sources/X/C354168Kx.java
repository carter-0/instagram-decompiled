package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.8Kx  reason: invalid class name and case insensitive filesystem */
public final class C354168Kx {
    public AnonymousClass9YA A00;
    public AnonymousClass84L A01;
    public final Context A02;
    public final UserSession A03;
    public final C351958Bc A04;
    public final AnonymousClass8B2 A05;
    public final Queue A06 = new LinkedList();
    public final 0sP A07;
    public final C262224Cq A08;
    public final boolean A09;

    public final void A00() {
        Runnable runnable;
        Queue queue = this.A06;
        if (!queue.isEmpty() && (runnable = (Runnable) queue.poll()) != null) {
            runnable.run();
        }
    }

    public C354168Kx(Context context, UserSession userSession, C351958Bc r6, AnonymousClass8B2 r7) {
        AnonymousClass19S A002 = AnonymousClass1HX.A00();
        0qQ.A0B(A002, 5);
        this.A03 = userSession;
        this.A02 = context;
        this.A04 = r6;
        this.A05 = r7;
        this.A08 = A002;
        0Tu r2 = 0Tu.A06;
        this.A09 = 182.A06(r2, userSession, 36329504859373730L);
        boolean A062 = 182.A06(r2, userSession, 36329504859439267L);
        if (r7 != null) {
            r7.A02 = A062;
        }
        this.A07 = C354178Ky.A00;
    }
}
