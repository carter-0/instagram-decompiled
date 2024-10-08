package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.2ge  reason: invalid class name */
public abstract class AnonymousClass2ge implements View.OnTouchListener {
    public final GestureDetector A00;

    public boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        this.A00.onTouchEvent(motionEvent);
        return false;
    }

    public void A00() {
        boolean z;
        if (this instanceof C226342gd) {
            C226342gd r7 = (C226342gd) this;
            C226392gj r6 = r7.A01;
            if (r6 != null && r7.A02.A01) {
                1P2 A002 = 1P1.A00(r6.A01);
                long j = r6.A00;
                String A003 = C273654mx.A00(686);
                synchronized (A002) {
                    if (A002.A0A(A003)) {
                        z = true;
                    } else {
                        z = A002.A03(A003, j, true);
                    }
                }
                if (!z) {
                    r6.A00(r7.A00);
                    return;
                }
                return;
            }
            return;
        }
        AnonymousClass2iT r2 = (AnonymousClass2iT) this;
        AnonymousClass2iS r0 = r2.A03;
        UserSession userSession = r0.A00;
        if (r0.A01) {
            C3727392e.A00(userSession).A08(r2.A01, AnonymousClass0t1.A01.A01(userSession).getId(), true, false);
        }
    }

    public AnonymousClass2ge(Context context) {
        this.A00 = new GestureDetector(context, new C226372gh(new C226362gg(new C226352gf(this))));
    }
}
