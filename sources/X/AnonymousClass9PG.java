package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.9PG  reason: invalid class name */
public final class AnonymousClass9PG implements C258373yu {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ B1W A01;

    public final /* synthetic */ void Czo(MotionEvent motionEvent, C254073rt r2, 1Xj r3, AnonymousClass3W1 r4, 2EG r5) {
    }

    public final void EBS(View view, 1Xj r9, AnonymousClass3W1 r10) {
        0qQ.A0B(r10, 1);
        r10.A2x = true;
        1Av A002 = 1Au.A00(this.A00);
        0s0 r2 = A002.A6d;
        AnonymousClass0YZ[] r5 = 1Av.A8a;
        r2.Epx(A002, Integer.valueOf(AnonymousClass7TE.A0M(r2.CDM(A002, r5[90])) + 1), r5[90]);
        long currentTimeMillis = System.currentTimeMillis();
        A002.A6c.Epx(A002, Long.valueOf(currentTimeMillis), r5[91]);
    }

    public AnonymousClass9PG(UserSession userSession, B1W b1w) {
        this.A01 = b1w;
        this.A00 = userSession;
    }

    public final void Czn(MotionEvent motionEvent, C254073rt r3, 1Xj r4, AnonymousClass3W1 r5) {
        AnonymousClass7TG.A1N(r4, r5);
        this.A01.DVI(r4, r5);
    }
}
