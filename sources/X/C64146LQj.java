package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.LQj  reason: case insensitive filesystem */
public final class C64146LQj {
    public C60388Jkh A00;
    public List A01;
    public boolean A02;
    public final UserSession A03;
    public final L97 A04;
    public final 1vn A05;
    public final Set A06 = DbS.A0y();
    public final C62320sa A07;
    public final C62320sa A08;
    public final Context A09;
    public final C62320sa A0A;

    public static final void A01(C64146LQj lQj, C63628L0q l0q, List list) {
        lQj.A06.addAll(list);
        List A002 = A00(lQj);
        if (A002 == null || A002.isEmpty()) {
            lQj.A07.invoke();
        }
        List A003 = A00(lQj);
        L97 l97 = lQj.A04;
        if (l97.A00.getVisibility() == 0 && A003 != null && !A003.isEmpty()) {
            l97.A01.setVisibility(0);
            RecyclerView recyclerView = l97.A03;
            DbU.A15(lQj.A09, recyclerView, 1, false);
            C60388Jkh jkh = new C60388Jkh(l0q, A003);
            lQj.A00 = jkh;
            recyclerView.setAdapter(jkh);
            recyclerView.setVisibility(0);
            lQj.A0A.invoke();
        }
    }

    public static final List A00(C64146LQj lQj) {
        List list = lQj.A01;
        if (list == null) {
            return null;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            DbV.A1U(next, A1C, 00k.A0u(lQj.A06, ((Hashtag) next).getName()) ? 1 : 0);
        }
        return 00k.A0a(00k.A0k(A1C));
    }

    public C64146LQj(Context context, UserSession userSession, L97 l97, C62320sa r5, C62320sa r6, C62320sa r7) {
        AnonymousClass7TG.A1Q(userSession, l97);
        this.A09 = context;
        this.A03 = userSession;
        this.A04 = l97;
        this.A07 = r5;
        this.A08 = r6;
        this.A0A = r7;
        this.A05 = 1vm.A01(userSession);
    }
}
