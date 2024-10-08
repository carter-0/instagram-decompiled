package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.H2p  reason: case insensitive filesystem */
public final class C54195H2p extends C298815u5 {
    public List A00;

    public final List Ao4() {
        List<C41938B7p> list = this.A00;
        if (list != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            for (C41938B7p A01 : list) {
                A0r.add(new C267324bN((C267334bO) new C52364GPk(C295365o2.AD_PREVIEW, A01.A01())));
            }
            return A0r;
        }
        0qQ.A0F("adPreviewMediaItems");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A01() {
        super.A00();
        ArrayList A1C = AnonymousClass7TE.A1C();
        List<C41938B7p> list = this.A00;
        if (list != null) {
            for (C41938B7p A01 : list) {
                A1C.add(new C267324bN((C267334bO) new C52364GPk(C295365o2.AD_PREVIEW, A01.A01())));
            }
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                C276014sL A002 = C295325ny.A00(C51966G9m.A0m(it));
                if (A002 != null) {
                    A1C2.add(A002);
                }
            }
            this.A0A = A1C2;
            return;
        }
        0qQ.A0F("adPreviewMediaItems");
        throw AnonymousClass00P.createAndThrow();
    }
}
