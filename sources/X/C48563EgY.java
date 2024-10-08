package X;

import java.util.Iterator;

/* renamed from: X.EgY  reason: case insensitive filesystem */
public abstract class C48563EgY {
    public static Object A00(C307896Rx r4, AnonymousClass6Tm r5) {
        C277014uI A0S = DbX.A0S(r5, 0);
        0lg A0B = C308206Td.A0B(r4);
        0qQ.A0B(A0B, 0);
        C50341FYy fYy = (C50341FYy) A0B.A01(C50341FYy.class, G2W.A00);
        Iterator A1G = AnonymousClass7TE.A1G(fYy.igBloksIdfaDialogList);
        while (A1G.hasNext()) {
            ((0SM) AnonymousClass7TF.A0a(A1G)).A08();
        }
        fYy.igBloksIdfaDialogList.clear();
        C308206Td.A05(r4).A0a();
        if (A0S == null) {
            return null;
        }
        DbS.A1Q(r4, A0S);
        return null;
    }
}
