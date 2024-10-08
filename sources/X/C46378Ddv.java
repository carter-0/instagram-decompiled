package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Ddv  reason: case insensitive filesystem */
public final /* synthetic */ class C46378Ddv implements AnonymousClass2gO {
    public final /* synthetic */ UserDetailFragment A00;

    public /* synthetic */ C46378Ddv(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void onChanged(Object obj) {
        UserDetailFragment userDetailFragment = this.A00;
        if (obj instanceof C324296z3) {
            FragmentActivity activity = userDetailFragment.getActivity();
            if (!(activity == null || activity.getSupportFragmentManager() == null)) {
                0hq A0I = DbV.A0I(userDetailFragment);
                boolean z = AnonymousClass36O.A0G;
                AnonymousClass36Q.A02(userDetailFragment, A0I);
            }
        } else if ((obj instanceof C324306z4) || (obj instanceof C324316z5)) {
            if (!(userDetailFragment.getActivity() == null || userDetailFragment.getContext() == null || userDetailFragment.getActivity().getSupportFragmentManager() == null)) {
                0hq A0I2 = DbV.A0I(userDetailFragment);
                boolean z2 = AnonymousClass36O.A0G;
                AnonymousClass36Q.A01(userDetailFragment, A0I2);
                DbX.A14(userDetailFragment.getContext(), AnonymousClass37D.A00);
            }
        } else if (obj instanceof C324326z6) {
            Context requireContext = userDetailFragment.requireContext();
            C310336ap A0a = DbS.A0a();
            DbS.A19(requireContext, A0a, 2131953447);
            A0a.A01 = -1;
            Dc2 A002 = A0a.A00();
            C48209Eap.A00 = A002;
            DbX.A1S(A002);
        } else if (obj instanceof C324336z7) {
            Context requireContext2 = userDetailFragment.requireContext();
            Dc2 dc2 = C48209Eap.A00;
            if (dc2 != null) {
                DbX.A1R(dc2);
            }
            C48209Eap.A00 = null;
            C310336ap A0a2 = DbS.A0a();
            DbS.A19(requireContext2, A0a2, 2131953446);
            DbY.A1N(A0a2);
        }
        DdZ ddZ = userDetailFragment.A0k;
        if (ddZ != null) {
            ddZ.A0C.Epw(C46545Dgm.A00);
        }
    }
}
