package X;

import android.content.Context;
import com.facebook.litho.ComponentHost;

public final class WJs implements 2Ue {
    public final 2Ud A00;

    public final boolean ECR(Object obj) {
        2Ud r1 = this.A00;
        if (r1 == null || ((ComponentHost) obj).A0E) {
            return false;
        }
        return r1.ECR(obj);
    }

    public final Object A7B(C251273mq r2) {
        2Ud r0 = this.A00;
        if (r0 != null) {
            return r0.A7B(r2);
        }
        return null;
    }

    public final boolean Cn6(Context context, C251273mq r3) {
        2Ud r0 = this.A00;
        if (r0 != null) {
            return r0.Cn6(context, r3);
        }
        return false;
    }

    public WJs(int i, boolean z) {
        2Ud r0;
        if (z) {
            r0 = new 2Ud(ComponentHost.class, i);
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }
}
