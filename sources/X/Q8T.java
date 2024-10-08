package X;

import android.content.Context;
import android.view.OrientationEventListener;

public final class Q8T extends OrientationEventListener {
    public final /* synthetic */ C12166SoH A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q8T(Context context, C12166SoH soH) {
        super(context, 2);
        this.A00 = soH;
    }

    public final void onOrientationChanged(int i) {
        this.A00.A00 = i;
    }
}
