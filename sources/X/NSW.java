package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class NSW extends 0ng {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass2HN A01;
    public final /* synthetic */ DirectThreadKey A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ Map A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NSW(UserSession userSession, AnonymousClass2HN r5, DirectThreadKey directThreadKey, String str, List list, Map map, boolean z) {
        super(1155983366, 3, false, false);
        this.A00 = userSession;
        this.A02 = directThreadKey;
        this.A04 = list;
        this.A05 = map;
        this.A01 = r5;
        this.A03 = str;
        this.A06 = z;
    }

    public final void run() {
        UserSession userSession = this.A00;
        2Dm A002 = 2L2.A00(userSession);
        DirectThreadKey directThreadKey = this.A02;
        AnonymousClass3U9 B33 = A002.B33(directThreadKey);
        if (B33 != null) {
            List list = this.A04;
            Map map = this.A05;
            AnonymousClass2HN r7 = this.A01;
            String str = this.A03;
            boolean z = this.A06;
            C370748x0.A00();
            List list2 = (List) C66843Mdb.A01(userSession).A09(new C331237Qc(B33), (String) null, "bulk_replace_messages", list, (List) null, 0, B33.C6I().longValue(), 182.A01(0Tu.A05, userSession, 36600366978109296L)).A00;
            list2.size();
            if (AnonymousClass7TE.A1b(list2)) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    C254703su A0a = C66580MXl.A0a(it);
                    A1C.add(A0a);
                    0sn r0 = (Collection) map.get(A0a.A0f());
                    if (r0 == null) {
                        r0 = 0sn.A00;
                    }
                    A1C.addAll(r0);
                }
                AnonymousClass7OQ.A01(userSession, r7, directThreadKey, str, A1C, z, false);
            }
        }
    }
}
