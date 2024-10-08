package X;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.ref.WeakReference;

/* renamed from: X.SdT  reason: case insensitive filesystem */
public final class C11625SdT implements AnonymousClass07Y {
    public final WeakReference A00;

    @OnLifecycleEvent(07T.ON_DESTROY)
    public void resetCallback() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((QDG) weakReference.get()).A04 = null;
        }
    }

    public C11625SdT(QDG qdg) {
        this.A00 = C51965G9l.A0v(qdg);
    }
}
