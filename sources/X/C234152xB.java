package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.2xB  reason: invalid class name and case insensitive filesystem */
public final class C234152xB implements 27S {
    public final /* synthetic */ C234042wt A00;

    public C234152xB(C234042wt r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        C234042wt r1 = this.A00;
        if (C234042wt.A02(r1) || C234042wt.A03(r1)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(1392011005);
        C240363Kp r7 = (C240363Kp) obj;
        int A032 = AnonymousClass0fD.A03(-218633502);
        0qQ.A0B(r7, 0);
        C238863Ds r1 = C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON;
        Integer valueOf = Integer.valueOf(r7.A00);
        AnonymousClass3W1 r15 = r7.A03;
        r15.A1A = valueOf;
        C234042wt r8 = this.A00;
        UserSession userSession = r8.A0B;
        C238833Dp.A00(userSession).A09(r7.A01, new C238873Dt(valueOf, r1, (String) null, (String) null), new String[0], 1);
        AnonymousClass4DU r3 = r8.A0S;
        C249763kK r2 = r8.A03;
        new C2360132b(userSession, r3, r8.A01, r8.A02, r2).A00((MotionEvent) null, (View) null, r8.A07, r7.A02, r15, 2EG.A1q, (String) null);
        AnonymousClass0fD.A0A(-2133713580, A032);
        AnonymousClass0fD.A0A(561626609, A03);
    }
}
