package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class P2Y implements C74394PuA {
    public final O7C A00;
    public final Context A01;
    public final UserSession A02;
    public final N4P A03;
    public final boolean A04;

    public P2Y(Context context, UserSession userSession, O7C o7c, N4P n4p, boolean z) {
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = n4p;
        this.A04 = z;
        this.A00 = o7c;
    }

    public final List getItems() {
        Context context = this.A01;
        String A16 = AnonymousClass7TE.A16(context, 2131959335);
        return 0sr.A1P(new Object[]{new C46448DfA((CharSequence) context.getString(2131959330)), new OIM((View.OnClickListener) null, (View.OnClickListener) null, (View.OnClickListener) null, new C72739PHt(this, 10), C69349Njo.TYPE_SWITCH, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, A16, (String) null, (String) null, this.A04, true), new FGF((CharSequence) context.getString(2131959329)), new C70944OSr(true)});
    }

    public final boolean isEnabled() {
        return AnonymousClass9HV.A00(this.A02).A00(this.A03.A0L, 45);
    }
}
