package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.sponsored.analytics.SourceModelInfoParams;

/* renamed from: X.2wx  reason: invalid class name and case insensitive filesystem */
public final class C234082wx implements 27S {
    public final /* synthetic */ C234042wt A00;

    public C234082wx(C234042wt r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        C240303Kj r4 = (C240303Kj) obj;
        0qQ.A0B(r4, 0);
        C234042wt r2 = this.A00;
        if (C234042wt.A01(r4.A02, r2, r4.A04) || C234042wt.A03(r2)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(263472007);
        C240303Kj r15 = (C240303Kj) obj;
        int A032 = AnonymousClass0fD.A03(-2021979387);
        0qQ.A0B(r15, 0);
        1Xj r9 = r15.A02;
        String str = r15.A03;
        boolean z = r15.A04;
        C234042wt r5 = this.A00;
        UserSession userSession = r5.A0B;
        AnonymousClass4DU r10 = r5.A0S;
        I6Q.A04(userSession, r9, r10, str, z);
        I6Q.A05(r9, r5.A00, C301155ye.A00(), r5.A02, C233162v9.TAG_CLICK);
        Fragment fragment = r5.A07;
        I6Q.A00(fragment, userSession, r9);
        1Xj A1e = r9.A1e(userSession);
        C231292rN r0 = r5.A00;
        if (r0 != null) {
            i = r0.BQr(A1e).A03;
        } else {
            i = 0;
        }
        C46474Dfc A02 = C46548Dgp.A02(userSession, str, AnonymousClass000.A00(3575), r10.getModuleName());
        A02.A0L = r5.A05;
        String id = A1e.getId();
        if (id != null) {
            A02.A04 = new SourceModelInfoParams(id, -1, i);
        }
        if (r5.A06) {
            FragmentActivity requireActivity = fragment.requireActivity();
            AnonymousClass6W8 r8 = new AnonymousClass6W8(requireActivity, C46447Df9.A03().A01.A01(userSession, A02.A04()), userSession, ModalActivity.class, "profile");
            r8.A08();
            r8.A0C(requireActivity);
        } else {
            C234042wt.A00(C46447Df9.A03().A01.A02(userSession, A02.A04()), userSession, r5, AnonymousClass000.A00(4175));
        }
        AnonymousClass0fD.A0A(542881157, A032);
        AnonymousClass0fD.A0A(1948586577, A03);
    }
}
