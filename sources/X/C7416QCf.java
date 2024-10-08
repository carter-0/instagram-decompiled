package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.QCf  reason: case insensitive filesystem */
public final class C7416QCf extends 06N {
    public final /* synthetic */ C227682jk A00;

    public final void A02(Bundle bundle, Fragment fragment, 0hq r8) {
        C227682jk r4 = this.A00;
        int i = C227682jk.A0A;
        Fragment fragment2 = r4.A00;
        if (fragment2 != null) {
            if (fragment.equals(fragment2)) {
                r4.A03 = true;
                r4.getChildFragmentManager().A0q(this);
                0sP r1 = r4.A01;
                if (r1 != null) {
                    Fragment fragment3 = r4.A00;
                    if (fragment3 != null) {
                        r1.invoke(fragment3);
                        r4.A01 = null;
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("wrappedFragment");
        throw AnonymousClass00P.createAndThrow();
    }

    public C7416QCf(C227682jk r1) {
        this.A00 = r1;
    }
}
