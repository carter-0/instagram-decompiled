package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.E8y  reason: case insensitive filesystem */
public final class C47586E8y extends C331047Ph implements C337237fw {
    public final EAI A00;
    public final int A01;
    public final UserSession A02;
    public final C46437Dez A03;
    public final EAC A04;
    public final TwD A05 = new TwD();
    public final C17962Viv A06 = new Object();
    public final String A07;
    public final String A08;

    public final void Dam(C337257fy r6) {
        0qQ.A0B(r6, 0);
        A06();
        List list = (List) r6.Bo1();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User A0k = DbT.A0k(it);
            if (!2R8.A04(this.A02, A0k)) {
                A09(this.A00, A0k, Boolean.valueOf(A0k.isRestricted()));
            }
        }
        String BiY = r6.BiY();
        if (r6.isLoading()) {
            TwD twD = this.A05;
            String str = this.A07;
            int i = this.A01;
            twD.A01 = str;
            twD.A00 = i;
            C17962Viv viv = this.A06;
            viv.A00 = true;
            A09(this.A04, twD, viv);
        } else if (!(BiY == null || BiY.length() == 0 || !list.isEmpty())) {
            A08(this.A03, this.A08);
        }
        A07();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Viv, java.lang.Object] */
    public C47586E8y(Context context, UserSession userSession, G7T g7t, boolean z) {
        AnonymousClass7TG.A1O(context, userSession);
        this.A02 = userSession;
        EAI eai = new EAI(g7t, z);
        this.A00 = eai;
        C46437Dez dez = new C46437Dez(context);
        this.A03 = dez;
        EAC eac = new EAC(context, (G6V) null);
        this.A04 = eac;
        this.A08 = AnonymousClass7TE.A16(context, 2131968486);
        this.A07 = AnonymousClass7TE.A16(context, 2131972868);
        this.A01 = context.getColor(R.color.grey_5);
        A0B(eai, dez, eac);
    }
}
