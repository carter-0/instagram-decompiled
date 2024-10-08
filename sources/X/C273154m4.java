package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.4m4  reason: invalid class name and case insensitive filesystem */
public final class C273154m4 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C242923Ws A02;
    public final /* synthetic */ C244213ap A03;

    public C273154m4(Activity activity, View view, C242923Ws r3, C244213ap r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = activity;
        this.A01 = view;
    }

    public final void run() {
        C315476jx r6;
        UserSession userSession;
        C61480nO r1;
        0ng r0;
        C242923Ws r4 = this.A02;
        C244213ap r02 = this.A03;
        Activity activity = this.A00;
        View view = this.A01;
        if (activity != null && view != null) {
            int ordinal = r02.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    userSession = r4.A00;
                    if (1Au.A00(userSession).A01.getInt("pin_reels_to_grid_for_feed_view_nux", 0) < 3 && !C242923Ws.A0E.getAndSet(true)) {
                        r6 = new C315476jx(2131969493);
                        r1 = 0nY.A00();
                        0qQ.A07(r1);
                        r0 = new C386589kq(r4);
                    } else {
                        return;
                    }
                } else if (ordinal == 2) {
                    userSession = r4.A00;
                    1Av A002 = 1Au.A00(userSession);
                    if (!((Boolean) A002.A7V.CDM(A002, 1Av.A8a[275])).booleanValue()) {
                        r6 = new C315476jx(2131969494);
                        r1 = 0nY.A00();
                        0qQ.A07(r1);
                        r0 = new C386599kr(r4);
                    } else {
                        return;
                    }
                } else if (ordinal == 3) {
                    userSession = r4.A00;
                    1Av A003 = 1Au.A00(userSession);
                    if (!((Boolean) A003.A7b.CDM(A003, 1Av.A8a[274])).booleanValue()) {
                        C61480nO A004 = 0nY.A00();
                        0qQ.A07(A004);
                        A004.ATE(new C386579kp(r4));
                        r6 = new C315476jx(2131973053);
                        AnonymousClass5Gt r12 = new AnonymousClass5Gt(activity, r6);
                        r12.A03(view);
                        r12.A06(C226262fy.BELOW_ANCHOR);
                        r12.A00 = 5000;
                        r12.A00().A07(userSession);
                        return;
                    }
                    return;
                } else if (ordinal != 4) {
                    throw new RuntimeException();
                } else {
                    return;
                }
                r1.ATE(r0);
                AnonymousClass5Gt r122 = new AnonymousClass5Gt(activity, r6);
                r122.A03(view);
                r122.A06(C226262fy.BELOW_ANCHOR);
                r122.A00 = 5000;
                r122.A00().A07(userSession);
                return;
            }
            C315476jx r2 = new C315476jx(2131961985);
            C61480nO A005 = 0nY.A00();
            0qQ.A07(A005);
            A005.ATE(new C386569ko(r4));
            AnonymousClass5Gt r13 = new AnonymousClass5Gt(activity, r2);
            r13.A03(view);
            r13.A01();
            r13.A00 = 5000;
            r13.A00().A07(r4.A00);
        }
    }
}
