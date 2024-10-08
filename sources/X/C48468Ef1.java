package X;

import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ef1  reason: case insensitive filesystem */
public abstract class C48468Ef1 {
    /* JADX WARNING: type inference failed for: r0v11, types: [X.1qK, java.lang.Object] */
    public static final Object A00(C307896Rx r5, AnonymousClass6Tm r6) {
        BaseFragmentActivity baseFragmentActivity;
        Object A02 = r6.A02();
        if (!(A02 instanceof String)) {
            A02 = null;
        }
        if (0qQ.A0K(A02, AnonymousClass000.A00(744))) {
            Dbb.A0o((Bundle) null, new C16298UsI(), C308206Td.A04(r5), C308206Td.A0B(r5));
        } else if (0qQ.A0K(A02, AnonymousClass000.A00(351))) {
            UserSession A0Z = DbT.A0Z(r5);
            0hq parentFragmentManager = DbU.A0H(r5).getParentFragmentManager();
            while (parentFragmentManager.A0M() > 0) {
                06p A0T = parentFragmentManager.A0T(parentFragmentManager.A0M() - 1);
                0qQ.A07(A0T);
                if (0qQ.A0K(A0T.A09, "PromotePaymentsInterstitialFragment.BACK_STACK_NAME")) {
                    break;
                }
                parentFragmentManager.A13();
            }
            BaseFragmentActivity A04 = C308206Td.A04(r5);
            if (A04 instanceof BaseFragmentActivity) {
                baseFragmentActivity = A04;
            } else {
                baseFragmentActivity = null;
            }
            VAB.A00(baseFragmentActivity, A0Z, AnonymousClass000.A00(4795));
            return null;
        } else if (0qQ.A0K(A02, AnonymousClass000.A00(497))) {
            AnonymousClass1Nd.A00(C308206Td.A0B(r5)).A00(new Object());
            FBt.A00(C308206Td.A04(r5), DbU.A0H(r5).getParentFragmentManager());
            return null;
        }
        return null;
    }
}
