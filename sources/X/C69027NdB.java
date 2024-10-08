package X;

import com.instagram.common.session.UserSession;
import com.instagram.friendmap.data.FriendMapRepository;
import com.instagram.friendmap.data.MapText;
import com.instagram.model.direct.DirectShareTarget;
import java.util.Iterator;

/* renamed from: X.NdB  reason: case insensitive filesystem */
public final class C69027NdB extends MYL {
    public final UserSession A00;
    public final FriendMapRepository A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69027NdB(UserSession userSession, FriendMapRepository friendMapRepository, String str) {
        super(new C68279N8q((N4t) null, "", false, false));
        Object obj;
        AnonymousClass7TG.A1U(userSession, str, friendMapRepository);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = friendMapRepository;
        Iterator it = ((Iterable) friendMapRepository.A0M.getValue()).iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
        } while (!0qQ.A0K(((N3Q) obj).A09, this.A02));
        N3Q n3q = (N3Q) obj;
        if (n3q != null) {
            A0R(new C59100J6i(C71130OdT.A02(n3q), 39));
        } else {
            A0P(C72699PGd.A00);
        }
    }

    public static final void A00(C319736r8 r7, C69027NdB ndB, String str) {
        DirectShareTarget A002;
        N4t n4t = ((C68279N8q) ndB.A0O()).A00;
        if (n4t != null && (A002 = OSM.A00(r7, ndB.A00, n4t, str)) != null) {
            ndB.A0P(new C72698PGc(n4t.A06.Bh3(), new MapText.Res(2131962760, new String[0]), new MapText.Res(2131962761, new String[0]), DbS.A0c(A002)));
        }
    }
}
