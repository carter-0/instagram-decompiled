package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.P2o  reason: case insensitive filesystem */
public final class C72349P2o implements C74394PuA {
    public final FragmentActivity A00;
    public final 0wc A01;
    public final UserSession A02;
    public final C47167Dri A03;
    public final Context A04;
    public final Capabilities A05;
    public final boolean A06;

    public C72349P2o(Context context, FragmentActivity fragmentActivity, UserSession userSession, Capabilities capabilities, N4P n4p, boolean z) {
        0qQ.A0B(userSession, 2);
        this.A04 = context;
        this.A02 = userSession;
        this.A05 = capabilities;
        this.A00 = fragmentActivity;
        this.A06 = z;
        this.A03 = C71123OdH.A00(userSession, n4p);
        this.A01 = DbW.A0J(userSession, "MemberAddModeSection");
    }

    public final boolean isEnabled() {
        return false;
    }

    public final List getItems() {
        int i;
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (this.A06) {
            C46448DfA.A02(A1C, 2131963171);
        }
        Context context = this.A04;
        String A16 = AnonymousClass7TE.A16(context, 2131958569);
        int A022 = DbU.A02(this.A03.A05, 0);
        if (A022 == 2 || A022 == 0) {
            i = 2131958567;
        } else if (A022 == 1) {
            i = 2131958568;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        String string = context.getString(i);
        A1C.add(new OIM(new C71395Oju(this, 21), (View.OnClickListener) null, (View.OnClickListener) null, (C358618bC) null, C69349Njo.TYPE_CHEVRON, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, A16, string, (String) null, true, true));
        return A1C;
    }
}
