package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Fcu  reason: case insensitive filesystem */
public final class C50508Fcu implements C66491MTu {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;

    public final void D1x(Context context) {
        Context context2 = context;
        0qQ.A0B(context, 0);
        List list = this.A06;
        if (list == null || list.isEmpty()) {
            List list2 = this.A05;
            if (list2 != null) {
                O36.A00(context2, this.A01, this.A02, this.A03, (String) null, list2);
                return;
            }
            return;
        }
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        C46474Dfc.A03(DbS.A0M(fragmentActivity, userSession), userSession, C46447Df9.A02(), C46548Dgp.A00(userSession, this.A04, this.A01.getModuleName()));
    }

    public final void onDismiss() {
    }

    public C50508Fcu(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, String str, String str2, List list, List list2) {
        this.A06 = list;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A04 = str;
        this.A01 = r2;
        this.A05 = list2;
        this.A03 = str2;
    }
}
