package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public final class Af7 implements C336287eN {
    public final C363288jT A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    public final Object E5m(String str) {
        0qQ.A0B(str, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C363288jT r3 = this.A00;
        String str2 = this.A02;
        r3.A08((1UV) null, str2, str, linkedHashSet);
        List list = this.A04;
        if (list != null) {
            C336427eb.A00((1UV) null, str, list, linkedHashSet);
        }
        ArrayList A0U = 00k.A0U(linkedHashSet);
        r3.A09(str2, A0U);
        return new C39681A4x(A0U, linkedHashSet);
    }

    public Af7(UserSession userSession, String str, String str2, List list) {
        this.A01 = userSession;
        this.A02 = str;
        this.A04 = list;
        this.A03 = str2;
        C363288jT A002 = C363288jT.A00(userSession);
        0qQ.A07(A002);
        this.A00 = A002;
    }

    public final /* bridge */ /* synthetic */ Object AIL(Object obj, Object obj2) {
        List list = (List) obj2;
        UserSession userSession = this.A01;
        String str = this.A03;
        01N A1H = 0jo.A1H();
        if (list != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : list) {
                if ((next instanceof C381459bn) && next != null) {
                    A1C.add(next);
                }
            }
            A4R a4r = (A4R) userSession.A01(A4R.class, C41640Axs.A00);
            synchronized (a4r) {
                a4r.A00.put(str, A1C);
            }
            A1H.add(new C46448DfA(2131954802));
            A1H.add(new C61080JwI((List) A1C, 24));
        }
        if (obj != null && (obj instanceof C39681A4x)) {
            A1H.add(new C46448DfA(2131969339));
            A1H.addAll(((C39681A4x) obj).A00);
        }
        return 0jo.A1I(A1H);
    }

    public final /* bridge */ /* synthetic */ Object ARG() {
        return 0sn.A00;
    }
}
