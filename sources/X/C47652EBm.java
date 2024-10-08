package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.EBm  reason: case insensitive filesystem */
public final class C47652EBm extends 1P0 {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final String A02;

    public C47652EBm(AnonymousClass0iw r1, UserSession userSession, String str) {
        AnonymousClass7TG.A1Q(r1, str);
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void onFailInBackground(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(-1608736339);
        AnonymousClass3FH.A02(AnonymousClass05K.A01);
        AnonymousClass0fD.A0A(723728638, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        String str;
        int A03 = AnonymousClass0fD.A03(-368562983);
        DvX dvX = (DvX) obj;
        int A032 = AnonymousClass0fD.A03(1545869228);
        0qQ.A0B(dvX, 0);
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        C249803kO it = DbU.A0K(dvX.A01).iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            EM4 em4 = ((C48228Eb9) it.next()).A01;
            DbU.A1V(em4.A00, linkedList);
            linkedList2.add(em4.A00.getUsername());
        }
        LinkedList linkedList3 = new LinkedList();
        LinkedList linkedList4 = new LinkedList();
        C249803kO it2 = DbU.A0K(dvX.A00).iterator();
        0qQ.A07(it2);
        while (it2.hasNext()) {
            C49537ExJ exJ = (C49537ExJ) it2.next();
            DbU.A1V(exJ.A00.A01, linkedList3);
            linkedList4.add(exJ.A00.A01.getUsername());
        }
        UserSession userSession = this.A01;
        AnonymousClass0iw r0 = this.A00;
        String str2 = this.A02;
        0qQ.A0B(userSession, 0);
        if (r0 != null) {
            str = r0.getModuleName();
        } else {
            str = null;
        }
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ig_one_login_response_received");
        A0e.AAJ("waterfall_id", str2);
        A0e.AAF("array_newly_logged_in_child_account_ids", F42.A00(linkedList));
        A0e.AAF("array_newly_login_deferred_child_account_ids", F42.A00(linkedList3));
        A0e.AAJ("containermodule", str);
        A0e.Cgf();
        ImmutableList A0K = DbU.A0K(dvX.A01);
        LinkedList linkedList5 = new LinkedList();
        Iterator it3 = A0K.iterator();
        while (it3.hasNext()) {
            C48228Eb9 eb9 = (C48228Eb9) it3.next();
            User user = eb9.A01.A00;
            0qQ.A07(user);
            DbU.A1V(user, linkedList5);
            AnonymousClass0BO.A00(userSession).A02.A08(user);
            String str3 = eb9.A00.A00.A00;
            0qQ.A07(str3);
            1CU A002 = AnonymousClass1CT.A00(userSession);
            String id = user.getId();
            if (!id.equals(A002.A02)) {
                DbX.A1U(A002.A00, id, str3);
            } else {
                throw AnonymousClass7TE.A0w(AnonymousClass000.A00(26));
            }
        }
        List list = ((AnonymousClass9EC) userSession.A01(AnonymousClass9EC.class, new AnonymousClass9ED())).A00;
        list.clear();
        list.addAll(linkedList5);
        0tB A003 = AnonymousClass0BO.A00(userSession);
        A003.A02.A08(AnonymousClass7TF.A0Q(userSession));
        AnonymousClass3FH.A02(AnonymousClass05K.A01);
        ImmutableList A0K2 = DbU.A0K(dvX.A00);
        Iterator it4 = A0K2.iterator();
        while (it4.hasNext()) {
            ((C49537ExJ) it4.next()).A01 = userSession.A06;
        }
        AnonymousClass3EO.A00(userSession).A04(A0K2);
        AnonymousClass9BE.A00(userSession).A01();
        AnonymousClass1Nd.A00(userSession).A00(new 2Cy(AnonymousClass7TF.A0Q(userSession)));
        AnonymousClass1Nd.A00(userSession).A00(new AnonymousClass3EL(AnonymousClass7TF.A0Q(userSession), linkedList2, linkedList4, linkedList, linkedList3));
        AnonymousClass0fD.A0A(-1836382614, A032);
        AnonymousClass0fD.A0A(467315173, A03);
    }
}
