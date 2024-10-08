package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.FBu  reason: case insensitive filesystem */
public abstract class C49892FBu {
    public static C309516Yo A00(FragmentActivity fragmentActivity, 0lg r2) {
        C309516Yo r0 = new C309516Yo(fragmentActivity, r2);
        A02();
        return r0;
    }

    public static final void A02() {
        if (AnonymousClass1Ww.A00 == null) {
            DbS.A15();
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static E47 A01() {
        A02();
        E47 e47 = new E47();
        e47.setArguments(new Bundle());
        return e47;
    }
}
