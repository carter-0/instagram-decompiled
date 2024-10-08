package X;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
import android.view.Window;

public final class M8R implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C61519KAy A01;
    public final /* synthetic */ C295005nO A02;

    public M8R(View view, C61519KAy kAy, C295005nO r3) {
        this.A00 = view;
        this.A01 = kAy;
        this.A02 = r3;
    }

    public final void run() {
        View view = this.A00;
        C71392co r0 = C315596kB.A02;
        C294975nL A0c = JTP.A0c(view, 0);
        C61519KAy kAy = this.A01;
        RectF rectF = kAy.A05;
        if (rectF != null) {
            float width = rectF.width();
            float f = (float) kAy.A03;
            float f2 = width / f;
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            float f3 = f / 2.0f;
            float f4 = ((float) kAy.A02) / 2.0f;
            A0c.A0U(f2, 1.0f, f3);
            A0c.A0V(f2, 1.0f, f4);
            A0c.A0S(centerX - f3, 0.0f);
            A0c.A0T(centerY - f4, 0.0f);
            A0c.A04 = 0;
            C294975nL A0A = A0c.A0E(C59681JTn.A00).A0A();
            A0A.A05 = this.A02;
            A0A.A0H();
            Activity activity = kAy.A04;
            2db.A02(activity, 0);
            Window window = activity.getWindow();
            if (window != null) {
                2db.A07(window.getDecorView(), window, false);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
