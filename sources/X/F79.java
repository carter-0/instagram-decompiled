package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

public abstract class F79 {
    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, String str, boolean z) {
        if (AnonymousClass7TF.A1V(C66571pQ.A02)) {
            FC6.A01();
            Bundle A0B = DbX.A0B(str);
            C47526E6m e6m = new C47526E6m();
            e6m.setArguments(A0B);
            if (z) {
                DbU.A0w(fragmentActivity, e6m.mArguments, userSession, ModalActivity.class, "account_discovery");
            } else if (fragmentActivity != null) {
                DbY.A14(e6m, fragmentActivity, userSession);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public static final void A00(Fragment fragment, UserSession userSession, String str, String str2, boolean z) {
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, fragment);
        if (AnonymousClass7TF.A1V(C66571pQ.A02)) {
            E3O A00 = FC6.A00().A00().A00(Boolean.valueOf(A1Z), str, fragment.getString(2131960850), str2, (String) null, (String) null, (String) null);
            if (z) {
                Bundle bundle = A00.mArguments;
                DbT.A1M(fragment, DbS.A0b(fragment.getActivity(), bundle, userSession, ModalActivity.class, C273654mx.A00(2284)));
                return;
            }
            Dbb.A0o((Bundle) null, A00, fragment.requireActivity(), userSession);
        }
    }
}
