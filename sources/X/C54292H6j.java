package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.H6j  reason: case insensitive filesystem */
public final class C54292H6j extends C228042kh {
    public final UserSession A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C53043Ghb(this.A00, this.A01, this.A02, this.A03, this.A04, this.A05);
    }

    public /* synthetic */ C54292H6j(UserSession userSession, String str, List list, boolean z, boolean z2) {
        List A0J = 03t.A0J(HMU.values());
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
        this.A04 = z;
        this.A05 = z2;
        this.A02 = list;
        this.A03 = A0J;
    }
}
