package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.8iX  reason: invalid class name and case insensitive filesystem */
public final class C362818iX {
    public A5G A00;
    public final Activity A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C357638Yz A04;
    public final C362168hS A05;
    public final C362688iK A06;
    public final C361388g9 A07;
    public final C362808iW A08;
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A00(0eO.A02, new C377269Le(this, 6));
    public final boolean A0A;

    public C362818iX(Activity activity, AnonymousClass0iw r6, UserSession userSession, C357638Yz r8, C362168hS r9, C362688iK r10, C362808iW r11) {
        0qQ.A0B(r9, 4);
        0qQ.A0B(r10, 6);
        this.A01 = activity;
        this.A03 = userSession;
        this.A04 = r8;
        this.A05 = r9;
        this.A08 = r11;
        this.A06 = r10;
        this.A02 = r6;
        C361388g9 r3 = new C361388g9();
        this.A07 = r3;
        boolean A062 = 182.A06(0Tu.A05, userSession, 36318239160014874L);
        this.A0A = A062;
        if (A062) {
            A5G a5g = (A5G) userSession.A01(A5G.class, new MMQ(userSession, 17));
            this.A00 = a5g;
            if (a5g != null) {
                r3 = a5g.A00;
            } else {
                return;
            }
        }
        WeakReference weakReference = 1DL.A00;
        1DL.A00 = new WeakReference(r3);
    }
}
