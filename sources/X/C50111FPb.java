package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.FPb  reason: case insensitive filesystem */
public final class C50111FPb implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass70J A00;

    public C50111FPb(AnonymousClass70J r1) {
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AnonymousClass70J r1 = this.A00;
        C46443Df5 df5 = C46443Df5.FOLLOWERS;
        0qQ.A0A(motionEvent);
        return r1.A07(motionEvent, df5);
    }
}
