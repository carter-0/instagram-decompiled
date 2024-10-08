package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class PUG implements C3032668b {
    public final C70415O5s A00;

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        boolean z;
        int i;
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length == 6) {
            C70415O5s o5s = this.A00;
            Object obj2 = objArr[1];
            Object obj3 = objArr[2];
            Object obj4 = objArr[3];
            Object obj5 = objArr[4];
            Object obj6 = objArr[5];
            O7X o7x = o5s.A00;
            List<2PM> list = (List) obj2;
            int A0M = AnonymousClass7TE.A0M(obj3);
            boolean A1a = AnonymousClass7TE.A1a(obj4);
            boolean A1a2 = AnonymousClass7TE.A1a(obj5);
            2EM r9 = (2EM) obj6;
            0qQ.A0B(list, 1);
            0qQ.A0B(r9, 5);
            C67102MiM miM = o7x.A00;
            ArrayList A0m = C51970G9q.A0m(list);
            UserSession userSession = miM.A02;
            Map map = 2J7.A00(userSession).A02;
            for (2PM r1 : list) {
                String A002 = C66786McX.A00(miM.A00, userSession, r1.A00());
                if (0qQ.A0K(r1.A00(), AnonymousClass43I.A00)) {
                    i = A0M;
                    z = A1a;
                } else {
                    Number A14 = C51966G9m.A14(r1.A00(), map);
                    z = false;
                    if (A14 != null) {
                        i = A14.intValue();
                        if (i > 20) {
                            z = true;
                        }
                    } else {
                        i = 0;
                    }
                }
                A0m.add(new C66787McY(r1.A00(), A002, i, z));
            }
            return new C66788McZ(r9, A0m, A1a2);
        }
        throw DbW.A0a("Array of size 6 expected but got ", length);
    }

    public PUG(C70415O5s o5s) {
        this.A00 = o5s;
    }
}
