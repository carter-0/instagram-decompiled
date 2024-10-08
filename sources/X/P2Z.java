package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class P2Z implements C74394PuA {
    public final UserSession A00;
    public final O7D A01;
    public final N4P A02;
    public final Context A03;
    public final FragmentActivity A04;

    public P2Z(Context context, FragmentActivity fragmentActivity, UserSession userSession, O7D o7d, N4P n4p) {
        0qQ.A0B(userSession, 3);
        this.A03 = context;
        this.A04 = fragmentActivity;
        this.A00 = userSession;
        this.A02 = n4p;
        this.A01 = o7d;
    }

    public final List getItems() {
        Context context = this.A03;
        C46448DfA dfA = new C46448DfA((CharSequence) context.getString(2131958717));
        String A16 = AnonymousClass7TE.A16(context, 2131958719);
        C69349Njo njo = C69349Njo.TYPE_SWITCH;
        N4P n4p = this.A02;
        OIM oim = new OIM((View.OnClickListener) null, (View.OnClickListener) null, (View.OnClickListener) null, new C72739PHt(this, 11), njo, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, A16, (String) null, (String) null, n4p.A0y, true);
        FGF fgf = new FGF((CharSequence) context.getString(2131958718));
        C313756gx A002 = C313746gw.A00(this.A00);
        int A06 = n4p.A06();
        String A032 = N4P.A03(n4p);
        String str = n4p.A0Q;
        1Ln A0J = DbT.A0J(A002);
        if (DbT.A1Y(A0J)) {
            DbW.A17(A0J, A002);
            C66581MXm.A1I(A0J, "translation_section_rendered");
            A0J.A0p("thread_channel_controls");
            C66582MXn.A1C(A0J, A002, DbZ.A0b(A0J, "thread_details", A032, str, A06));
        }
        return 0sr.A1P(new Object[]{dfA, oim, fgf, new C70944OSr(true)});
    }

    public final boolean isEnabled() {
        boolean z;
        C242243Te r1;
        List list;
        List list2;
        N4P n4p = this.A02;
        UserSession userSession = this.A00;
        if (!N4P.A04(userSession, n4p) || ((r1 = n4p.A0E) != null && (((list = r1.A0D) != null && !list.isEmpty()) || ((list2 = r1.A0E) != null && !list2.isEmpty())))) {
            z = true;
        } else {
            z = false;
        }
        if (!182.A06(0Tu.A05, userSession, 36319407392234791L) || !z) {
            return false;
        }
        return true;
    }
}
