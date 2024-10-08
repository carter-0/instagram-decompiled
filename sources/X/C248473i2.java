package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3i2  reason: invalid class name and case insensitive filesystem */
public final class C248473i2 extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248473i2(2Lk r7) {
        super("maybeFetchRemoteChannelsAssets", 795, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        C375449Dp r3 = C375439Do.A04;
        Context context = r1.A01;
        UserSession userSession = r1.A04;
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        C375439Do r5 = C375439Do.A03;
        if (r5 == null) {
            synchronized (r3) {
                r5 = C375439Do.A03;
                if (r5 == null) {
                    Context applicationContext = context.getApplicationContext();
                    0qQ.A07(applicationContext);
                    r5 = new C375439Do(applicationContext, userSession);
                    C375439Do.A03 = r5;
                }
            }
        }
        UserSession userSession2 = r5.A01;
        if (AnonymousClass5IJ.A00(userSession2) && 182.A06(0Tu.A06, userSession2, 36319072383933329L)) {
            for (C239973Ja r32 : C49311Esu.A01) {
                if (r32 != null) {
                    AnonymousClass9DH r12 = new AnonymousClass9DH(new AnonymousClass9DE(r5.A00, r32, AnonymousClass2h0.A00));
                    r12.A00();
                    r5.A02.put(r32, r12);
                }
            }
        }
        if (AnonymousClass5IJ.A00(userSession2) && 182.A06(0Tu.A06, userSession2, 36322727400909173L)) {
            for (C239973Ja r33 : C49311Esu.A00) {
                if (r33 != null) {
                    AnonymousClass9DH r13 = new AnonymousClass9DH(new AnonymousClass9DE(r5.A00, r33, AnonymousClass2h0.A00));
                    r13.A00();
                    r5.A02.put(r33, r13);
                }
            }
        }
    }
}
