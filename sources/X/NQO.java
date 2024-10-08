package X;

import com.instagram.banyan.BanyanCoordinator;
import com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class NQO extends 2Cn {
    public final int A00;
    public final String A01;

    public NQO(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.A00) {
            case 0:
                C290645fe r5 = (C290645fe) obj;
                0qQ.A0B(r5, 0);
                r5.A06(this.A01);
                return;
            case 1:
                C290645fe r52 = (C290645fe) obj;
                0qQ.A0B(r52, 0);
                String str = this.A01;
                if (!AnonymousClass7TF.A1Q(str.length())) {
                    List list = r52.A01("direct_ibc_inbox_invitations").A02;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (0qQ.A0K(DbT.A0f(it).A08(), str)) {
                            }
                        }
                        return;
                    }
                    return;
                }
                r52.A08(C66581MXm.A0z("direct_ibc_inbox_invitations"));
                return;
            case 2:
                C290645fe r53 = (C290645fe) obj;
                0qQ.A0B(r53, 0);
                String str2 = this.A01;
                BanyanCoordinator banyanCoordinator = r53.A00;
                1OC A002 = AudienceListsApiUtil.A00(banyanCoordinator.A0I, str2);
                A002.A00 = new C47697EDg(banyanCoordinator, 3);
                AnonymousClass1HI.A00().schedule(A002);
                return;
            default:
                NQO.super.onSuccess(obj);
                return;
        }
    }
}
