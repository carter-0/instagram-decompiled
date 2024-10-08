package X;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* renamed from: X.Ape  reason: case insensitive filesystem */
public final class C41180Ape implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C255783ui A01;
    public final /* synthetic */ C316866mL A02;

    public C41180Ape(C255783ui r1, C316866mL r2, float f) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = f;
    }

    public final void run() {
        C316866mL r0 = this.A02;
        C255783ui r3 = this.A01;
        float f = this.A00;
        FrameLayout frameLayout = r0.A00;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if (parent != null) {
                View view = (View) parent;
                C306406Ma.A04(frameLayout, r3, f, view.getWidth(), view.getHeight(), false);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
