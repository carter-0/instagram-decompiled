package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.model.direct.threadkey.util.ThreadIdParcelable;

public abstract class OXL {
    public static final void A02(Bundle bundle, C254793t3 r2, String str) {
        0qQ.A0B(r2, 2);
        bundle.putParcelable(str, new ThreadIdParcelable(r2));
    }

    public static void A01(Bundle bundle, Parcelable parcelable, C254793t3 r3) {
        bundle.putParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES", parcelable);
        A02(bundle, r3, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
    }

    public static final C254793t3 A00(Bundle bundle, String str) {
        ThreadIdParcelable threadIdParcelable = (ThreadIdParcelable) bundle.getParcelable(str);
        if (threadIdParcelable != null) {
            return threadIdParcelable.A00;
        }
        return null;
    }
}
