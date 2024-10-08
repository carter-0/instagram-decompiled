package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.HashSet;

public final class OHU {
    public final RecyclerView A00;
    public final 2el A01;
    public final C3018760k A02;
    public final C71144Ody A03;
    public final C58045Ikd A04;
    public final HashSet A05 = AnonymousClass7TE.A1F();
    public final UserSession A06;

    public OHU(RecyclerView recyclerView, UserSession userSession, 2el r4, C71144Ody ody, C58045Ikd ikd) {
        DbW.A1N(userSession, 1, ody);
        this.A06 = userSession;
        this.A01 = r4;
        this.A04 = ikd;
        this.A00 = recyclerView;
        this.A03 = ody;
        this.A02 = C3018660j.A01(userSession);
    }
}
