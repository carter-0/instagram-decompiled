package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.SbY  reason: case insensitive filesystem */
public final class C11511SbY implements ViewTreeObserver.OnDrawListener {
    public final View A00;
    public final C62320sa A01;
    public final /* synthetic */ C12229Spj A02;

    public C11511SbY(View view, C12229Spj spj, C62320sa r3) {
        this.A02 = spj;
        this.A00 = view;
        this.A01 = r3;
    }

    public final void onDraw() {
        C12229Spj spj = this.A02;
        if (!spj.A00) {
            spj.A00 = true;
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                new Handler(myLooper).postAtFrontOfQueue(new TBU(this));
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        this.A00.post(new TBV(this));
    }
}
