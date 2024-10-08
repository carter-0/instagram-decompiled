package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.AOs  reason: case insensitive filesystem */
public final /* synthetic */ class C40036AOs implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass8LU A00;

    public /* synthetic */ C40036AOs(AnonymousClass8LU r1) {
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C331157Pu r0;
        C39903AIl aIl = this.A00.A0q.A01;
        if (aIl == null || (r0 = C39903AIl.A00(aIl).A00) == null) {
            return true;
        }
        r0.A07();
        return true;
    }
}
