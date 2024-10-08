package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class IRL implements JO6 {
    public final /* synthetic */ AnonymousClass32L A00;

    public IRL(AnonymousClass32L r1) {
        this.A00 = r1;
    }

    public final void DBB(List list, String str) {
        AnonymousClass32L r4 = this.A00;
        UserSession A03 = r4.getSession();
        ArrayList A0q = AnonymousClass7TF.A0q(A03, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C51971G9r.A1M(C51966G9m.A0t(it), A0q);
        }
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, A03), "explore_grid_trimmed");
        A0e.A9F("num_trimmed", DbS.A0j(A0q.size()));
        A0e.AAe("duplicate_media_ids", A0q);
        A0e.AAJ("explore_page", str);
        A0e.Cgf();
    }
}
