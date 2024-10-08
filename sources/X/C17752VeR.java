package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.VeR  reason: case insensitive filesystem */
public final class C17752VeR {
    public final void A00(C14539Txz txz, C15168UTt uTt) {
        String A0F;
        0qQ.A0B(txz, 1);
        String str = ((C19210WPq) C13988Tno.A0V(uTt.A01, uTt.A02)).A03;
        List list = txz.A02;
        0qQ.A06(list);
        if (str.length() != 0) {
            Locale locale = Locale.US;
            0qQ.A08(locale);
            String lowerCase = str.toLowerCase(locale);
            ArrayList A15 = DbV.A15(lowerCase);
            for (Object next : list) {
                C276544tV A07 = ((C14538Txy) next).A01.A07(132);
                if (!(A07 == null || (A0F = A07.A0F()) == null || !00l.A0d(DbT.A12(locale, A0F), lowerCase, false))) {
                    A15.add(next);
                }
            }
            list = A15;
        }
        uTt.A00.A02(new C14539Txz(list, txz.A01, txz.A00));
    }
}
