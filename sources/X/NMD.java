package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class NMD extends 1P0 {
    public final long A00;
    public final UserSession A01;
    public final C331237Qc A02;
    public final String A03;
    public final List A04;

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = AnonymousClass0fD.A03(682826046);
        C3265177b r4 = (C3265177b) obj;
        int A033 = AnonymousClass0fD.A03(-803768012);
        0qQ.A0B(r4, 0);
        String str = this.A03;
        1bc A002 = C370748x0.A00();
        UserSession userSession = this.A01;
        A002.A00(userSession);
        long j = this.A00;
        C331237Qc r9 = this.A02;
        List list = this.A04;
        DbZ.A0t(0, userSession, r9, list);
        0qQ.A0B(str, 5);
        if (!(j == -1 || r4.A00 == null)) {
            C370748x0.A00();
            C66840MdY A012 = C66843Mdb.A01(userSession);
            List list2 = r4.A00;
            ArrayList A15 = DbV.A15(list2);
            for (Object next : list2) {
                if (((C254703su) next).A10 == 2FW.A0n) {
                    A15.add(next);
                }
            }
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = A15.iterator();
            while (it.hasNext()) {
                String str2 = C66580MXl.A0a(it).A1Y;
                if (str2 != null) {
                    A1C.add(str2);
                }
            }
            r4.A00.addAll((Collection) A012.A09(r9, str, "intercept_message_response", list, A1C, 0, j, 1000).A00);
            List list3 = r4.A00;
            0qQ.A07(list3);
            if (list3.size() > 1) {
                C73429PcU.A01(12, list3);
            }
        }
        AnonymousClass0fD.A0A(300306610, A033);
        AnonymousClass0fD.A0A(1828736619, A032);
    }

    public NMD(UserSession userSession, C331237Qc r2, String str, List list, long j) {
        this.A01 = userSession;
        this.A00 = j;
        this.A04 = list;
        this.A02 = r2;
        this.A03 = str;
    }

    public final void onFailInBackground(C268654dm r3) {
        AnonymousClass0fD.A0A(-589932423, AnonymousClass0fD.A03(-1585069703));
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(555824184);
        this.A04.size();
        AnonymousClass0fD.A0A(-1451564944, A032);
    }
}
