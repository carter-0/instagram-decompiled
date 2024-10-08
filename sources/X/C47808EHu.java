package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.EHu  reason: case insensitive filesystem */
public final class C47808EHu extends 0ng {
    public final /* synthetic */ C46668Dix A00;
    public final /* synthetic */ List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47808EHu(C46668Dix dix, List list) {
        super(104, 3, false, false);
        this.A01 = list;
        this.A00 = dix;
    }

    public final void run() {
        List list = this.A01;
        C46668Dix dix = this.A00;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            1OO A0J = 1NK.A00().A0J(DbS.A0V(AnonymousClass7TE.A18(it)), "STORIES_AVATAR_DEFAULT_SEARCH");
            A0J.A02(dix);
            A0J.A01();
        }
    }
}
