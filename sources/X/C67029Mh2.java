package X;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: X.Mh2  reason: case insensitive filesystem */
public final class C67029Mh2 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ WeakReference A00;

    public C67029Mh2(WeakReference weakReference) {
        this.A00 = weakReference;
    }

    public final void onDraw() {
        C67260Mku mku = (C67260Mku) this.A00.get();
        if (mku != null) {
            AnonymousClass0eM r1 = mku.A08;
            if (((2Dm) r1.getValue()).A0H.A0F) {
                ((C252423p5) mku.A07.getValue()).A0J("iris_sequence_id", String.valueOf(((2Dm) r1.getValue()).A0C.A08()));
            }
            AnonymousClass0eM r12 = mku.A07;
            ((AnonymousClass9HT) r12.getValue()).A08.A00();
            Mi9 mi9 = (Mi9) r12.getValue();
            int i = mi9.A01;
            if (i <= mi9.A02) {
                mi9.A0E(002.A0O("on_will_render_", i));
                mi9.A01++;
            }
        }
    }
}
