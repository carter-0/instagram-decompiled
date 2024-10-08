package X;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Nbl  reason: case insensitive filesystem */
public final class C68959Nbl extends AnonymousClass7BP {
    public C68961Nbn A00;
    public final List A01;
    public final /* synthetic */ 1bO A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68959Nbl(C74340PtG ptG, 1bO r2, List list) {
        super(ptG, r2);
        this.A02 = r2;
        this.A01 = list;
    }

    public final void A00() {
        Object obj;
        1bO r1 = this.A02;
        Charset charset = 1bO.A0w;
        AnonymousClass43N r7 = r1.A0N;
        List list = this.A01;
        Long valueOf = Long.valueOf(r1.A01);
        List list2 = r7.A0B;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list2) {
            if (next instanceof C68961Nbn) {
                A1C.add(next);
            }
        }
        Iterator it = A1C.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((C68961Nbn) obj).A00, list)) {
                break;
            }
        }
        C68961Nbn nbn = (C68961Nbn) obj;
        if (nbn == null) {
            nbn = new C68961Nbn(r7, valueOf, list);
            list2.add(nbn);
            r7.A08();
        }
        this.A00 = nbn;
        nbn.A06.add(this);
    }

    public final void A01() {
        C68961Nbn nbn = this.A00;
        if (nbn != null) {
            nbn.A06(this);
            this.A00 = null;
        }
    }
}
