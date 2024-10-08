package X;

import android.view.Choreographer;
import android.view.View;
import com.instagram.react.views.inbox.ReactInboxManager;

/* renamed from: X.SaY  reason: case insensitive filesystem */
public final class C11470SaY implements Choreographer.FrameCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C11470SaY(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void doFrame(long j) {
        Object obj;
        if (this.A00 != 0) {
            View view = (View) this.A01;
            ((ReactInboxManager) this.A02).manuallyLayoutChildren(view);
            view.getViewTreeObserver().dispatchOnGlobalLayout();
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        AnonymousClass4D7 r2 = (AnonymousClass4D7) this.A01;
        C56863IFk iFk = C56863IFk.A01;
        try {
            obj = ((0sP) this.A02).invoke(Long.valueOf(j));
        } catch (Throwable th) {
            obj = JTO.A1B(th);
        }
        r2.resumeWith(obj);
    }
}
