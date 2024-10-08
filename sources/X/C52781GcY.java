package X;

import android.app.Dialog;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;

/* renamed from: X.GcY  reason: case insensitive filesystem */
public final class C52781GcY extends Dialog {
    public final /* synthetic */ C55437Hhh A00;
    public final /* synthetic */ C3034368u A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ C62320sa A03;

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Window window;
        View decorView;
        C276544tV r2;
        0qQ.A0B(motionEvent, 0);
        C277014uI r3 = this.A02;
        if (r3 == null || motionEvent.getAction() != 0 || (window = getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return true;
        }
        if (motionEvent.getX() >= 0.0f && motionEvent.getX() < AnonymousClass7TE.A02(decorView) && motionEvent.getY() >= 0.0f && motionEvent.getY() < AnonymousClass7TE.A03(decorView)) {
            return true;
        }
        C3034368u r0 = this.A01;
        if (r0 != null) {
            r2 = r0.A02;
        } else {
            r2 = null;
        }
        C307886Rw.A03((C307786Rm) this.A03.invoke(), r2, AnonymousClass6Tm.A01, r3);
        this.A00.A00.A07();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52781GcY(Context context, C55437Hhh hhh, C3034368u r3, C277014uI r4, C62320sa r5) {
        super(context);
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = hhh;
    }
}
