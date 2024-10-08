package X;

import android.view.MotionEvent;
import android.view.View;

public final /* synthetic */ class GMM implements C61910qF, C59553JNz {
    public final /* synthetic */ 0sK A00;

    public GMM(0sK r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return this.A00;
    }

    public final /* synthetic */ boolean DAa(MotionEvent motionEvent, View view, C59492JLq jLq) {
        return AnonymousClass7TE.A1a(this.A00.invoke(jLq, view, motionEvent));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C59553JNz) || !(obj instanceof C61910qF)) {
            return false;
        }
        return AnonymousClass7TG.A1Y(obj, this.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
