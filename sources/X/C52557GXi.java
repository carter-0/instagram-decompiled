package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.GXi  reason: case insensitive filesystem */
public final class C52557GXi {
    public final int A00;
    public final int A01;
    public final UserSession A02;
    public final C52558GXj A03;
    public final AnonymousClass93F A04;

    public /* synthetic */ C52557GXi(UserSession userSession) {
        AnonymousClass93C r5 = AnonymousClass93C.A05;
        AnonymousClass93F A002 = AnonymousClass93D.A00(userSession, r5);
        AnonymousClass7TG.A1O(userSession, A002);
        this.A02 = userSession;
        this.A04 = A002;
        C52558GXj gXj = new C52558GXj();
        this.A03 = gXj;
        0Tu r2 = 0Tu.A05;
        this.A00 = DbS.A04(r2, userSession, 36594542996162305L);
        this.A01 = DbS.A04(r2, userSession, 36594542996227842L);
        A002.EBM(r5, AnonymousClass7TE.A1I(gXj));
    }

    public static final C297005r0 A00(List list) {
        if (list.size() == 3) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C296985qy r1 = new C296985qy(C296895qp.A02(1, 1), (C295795ov) null, (1Xj) list.get(i));
                C296995qz r0 = new C296995qz(0, i);
                A1C.add(r1);
                A1H.put(r1, r0);
            }
            return new C297005r0((C295795ov) null, A1C, A1H, 1);
        }
        throw DbT.A0m();
    }
}
