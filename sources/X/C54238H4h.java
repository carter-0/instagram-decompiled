package X;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.H4h  reason: case insensitive filesystem */
public final class C54238H4h extends 1P0 {
    public final /* synthetic */ C53039GhV A00;

    public C54238H4h(C53039GhV ghV) {
        this.A00 = ghV;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object value;
        GMQ gmq;
        int A03 = AnonymousClass0fD.A03(1935765184);
        1XO r1 = (1XO) obj;
        int A032 = AnonymousClass0fD.A03(-1255575899);
        0qQ.A0B(r1, 0);
        1Xj A0T = DbZ.A0T(r1.A06, 0);
        if (A0T != null) {
            C53039GhV ghV = this.A00;
            1E7.A00(ghV.A01).A03(A0T);
            ghV.A00 += C51967G9n.A04(C263014Gw.A00(A0T), 0);
            05G r3 = ghV.A04;
            do {
                value = r3.getValue();
                gmq = (GMQ) value;
            } while (!r3.AIY(value, GMQ.A00(gmq, A0T, (C54662HMt) null, (Integer) null, 00k.A0T(ITM.A00, (Collection) gmq.A02), (List) null, (List) null, (Map) null, 124)));
        }
        AnonymousClass0fD.A0A(1598450533, A032);
        AnonymousClass0fD.A0A(-564125300, A03);
    }

    public final void onFail(C268654dm r3) {
        AnonymousClass0fD.A0A(75816988, AnonymousClass0fD.A03(1573874556));
    }

    public final void onFinish() {
        AnonymousClass0fD.A0A(332682148, AnonymousClass0fD.A03(397985629));
    }

    public final void onStart() {
        AnonymousClass0fD.A0A(-1840703689, AnonymousClass0fD.A03(-1774090054));
    }
}
