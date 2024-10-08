package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.H6g  reason: case insensitive filesystem */
public final class C54289H6g extends C228042kh {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final Set A03;
    public final Set A04;

    public final /* bridge */ /* synthetic */ 2YL create() {
        String str = this.A02;
        return new C53022GhD(C56508Hze.A02.A00(this.A00, str), str, this.A01, this.A04, this.A03);
    }

    public C54289H6g(UserSession userSession, String str, String str2, Set set, Set set2) {
        AnonymousClass7TG.A1U(userSession, str, str2);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = str2;
        this.A04 = set;
        this.A03 = set2;
    }
}
