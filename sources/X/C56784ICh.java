package X;

import android.content.Context;
import android.view.View;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl;
import com.instagram.trials.view.ClipsTrialBottomSheetFragment$openActionSheet$1$2$1;
import com.instagram.user.model.User;

/* renamed from: X.ICh  reason: case insensitive filesystem */
public final class C56784ICh implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;
    public final String A09;

    public C56784ICh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj5;
        this.A08 = str;
        this.A09 = str2;
        this.A04 = obj3;
        this.A05 = obj6;
        this.A06 = obj7;
        this.A07 = obj4;
        this.A02 = obj;
    }

    public final void onClick(View view) {
        int A052;
        int i;
        switch (this.A00) {
            case 0:
                A052 = AnonymousClass0fD.A05(-1247782637);
                I00 i00 = (I00) this.A05;
                I00.A00(i00, "remove");
                Context context = (Context) this.A02;
                C358248ab A0Y = DbS.A0Y(context);
                int A0M = AnonymousClass7TE.A0M(this.A01);
                int i2 = 2131973773;
                if (A0M != 0) {
                    i2 = 2131973767;
                }
                A0Y.A09(i2);
                int i3 = 2131973771;
                if (A0M != 0) {
                    i3 = 2131973765;
                }
                A0Y.A08(i3);
                int i4 = 2131973772;
                if (A0M != 0) {
                    i4 = 2131973766;
                }
                String A16 = AnonymousClass7TE.A16(context, i4);
                String str = this.A09;
                String str2 = this.A08;
                UserSession userSession = (UserSession) this.A07;
                AnonymousClass07i r7 = (AnonymousClass07i) this.A04;
                C59631JQz jQz = (C59631JQz) this.A03;
                A0Y.A0Y(new I8T(context, r7, userSession, (1Xj) this.A06, i00, jQz, str, str2), C358278ae.RED_BOLD, A16, true);
                A0Y.A03();
                A0Y.A0r(true);
                A0Y.A0s(true);
                if (jQz != null) {
                    A0Y.A0f(new I9B(jQz, 6));
                }
                DbT.A1V(A0Y);
                if (jQz != null) {
                    jQz.DdV();
                }
                i = 636527780;
                break;
            case 1:
                A052 = AnonymousClass0fD.A05(828058179);
                AnonymousClass0xx A002 = AnonymousClass07a.A00((ComponentActivity) this.A01);
                String str3 = this.A08;
                String str4 = this.A09;
                C46327Dbv dbv = (C46327Dbv) this.A04;
                UserSession userSession2 = (UserSession) this.A07;
                AnonymousClass7TE.A1Z(new ClipsTrialBottomSheetFragment$openActionSheet$1$2$1((Context) this.A02, dbv, userSession2, (LSk) this.A03, (ClipsTrialBottomSheetRepositoryImpl) this.A05, str3, str4, (AnonymousClass4D7) null, (C62320sa) this.A06), A002);
                i = 923398494;
                break;
            default:
                A052 = AnonymousClass0fD.A05(130695601);
                Object obj = this.A02;
                K8O k8o = (K8O) this.A07;
                Context requireContext = k8o.requireContext();
                User user = (User) this.A05;
                if (0qQ.A0K(obj, DbW.A0h(requireContext, user.getUsername(), 2131966693))) {
                    F3J f3j = (F3J) this.A04;
                    if (f3j != null) {
                        String str5 = this.A08;
                        f3j.A01(new M04((UserSession) this.A06, user, (LF6) this.A03, str5, this.A09), user, "LiveVideoViewerList", false, true);
                    }
                } else if (0qQ.A0K(obj, k8o.requireContext().getString(2131972018))) {
                    Context requireContext2 = k8o.requireContext();
                    FragmentActivity requireActivity = k8o.requireActivity();
                    UserSession userSession3 = (UserSession) this.A06;
                    C49174Eqf.A00(requireActivity, requireContext2, k8o, (AnonymousClass0iw) this.A01, userSession3, new M05(userSession3, user, (LF6) this.A03, k8o, this.A08, this.A09), user);
                }
                i = -2079905966;
                break;
        }
        AnonymousClass0fD.A0C(i, A052);
    }
}
