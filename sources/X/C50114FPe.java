package X;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.FPe  reason: case insensitive filesystem */
public final class C50114FPe implements View.OnTouchListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C317116mk A02;
    public final /* synthetic */ String A03;

    public C50114FPe(View view, UserSession userSession, C317116mk r3, String str) {
        this.A00 = view;
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = str;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            View view2 = this.A00;
            Context A0S = AnonymousClass7TE.A0S(view2);
            UserSession userSession = this.A01;
            C317116mk r3 = this.A02;
            AnonymousClass5Gt r1 = new AnonymousClass5Gt((Activity) A0S, new C47900ELu(A0S, this.A03));
            r1.A04(view2, x, y, false);
            r1.A02();
            r1.A0B = true;
            r1.A0G = false;
            C47898ELs.A00(r1, r3, 14).A07(userSession);
        }
        return true;
    }
}
