package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.70b  reason: invalid class name and case insensitive filesystem */
public final class C3248470b implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass70J A00;

    public C3248470b(AnonymousClass70J r1) {
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AnonymousClass70J r1 = this.A00;
        C46443Df5 df5 = C46443Df5.FOLLOWING;
        0qQ.A0A(motionEvent);
        return r1.A07(motionEvent, df5);
    }
}
