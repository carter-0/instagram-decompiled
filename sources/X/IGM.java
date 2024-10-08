package X;

import androidx.compose.ui.unit.Constraints;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class IGM implements AnonymousClass5RD {
    public final /* synthetic */ C270284gU A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public IGM(C270284gU r1, Integer num, boolean z, boolean z2) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = num;
        this.A03 = z2;
    }

    public final /* synthetic */ int CmW(C268014cc r2, List list, int i) {
        return C52407GRi.A00(r2, this, list, i);
    }

    public final /* synthetic */ int CmZ(C268014cc r2, List list, int i) {
        return C52407GRi.A01(r2, this, list, i);
    }

    public final C289145d6 Cnx(C268004cb r24, List list, long j) {
        String A002;
        C268074ci r11;
        C267974cY r15;
        Object obj;
        C268004cb r6 = r24;
        List<C268074ci> list2 = list;
        AnonymousClass7TF.A1H(r6, list2);
        int A012 = Constraints.A01(j);
        int A003 = Constraints.A00(j);
        long A04 = Constraints.A04(0, A012, 0, A003);
        int EJS = r6.EJS(8.0f);
        int EJS2 = r6.EJS(6.0f);
        int EJS3 = r6.EJS(8.0f);
        int i = -EJS3;
        int i2 = i - EJS;
        long A06 = AnonymousClass5SF.A06(A04, 0, i2);
        Iterator it = list2.iterator();
        do {
            boolean hasNext = it.hasNext();
            A002 = AnonymousClass000.A00(3);
            if (hasNext) {
                r11 = (C268074ci) it.next();
            } else {
                throw new NoSuchElementException(A002);
            }
        } while (!0qQ.A0K(HRU.A00(r11), "Label"));
        C267974cY Cnz = r11.Cnz(A06);
        int AWx = Cnz.AWx(C292185iX.A01);
        if (AWx == Integer.MIN_VALUE) {
            AWx = Cnz.A00;
        }
        int A013 = AnonymousClass1GB.A01(((float) AWx) * 0.75f);
        int A032 = Constraints.A03(j);
        long A062 = AnonymousClass5SF.A06(Constraints.A04(A032, A012, 0, A003), 0, ((i - EJS2) - A013) - EJS);
        for (C268074ci r14 : list2) {
            if (0qQ.A0K(HRU.A00(r14), "TextField")) {
                C267974cY Cnz2 = r14.Cnz(A062);
                int max = Math.max(Cnz2.A01, Math.max(Cnz.A01, A032));
                int max2 = Math.max(A013 + EJS + EJS2 + Cnz2.A00 + EJS3, Constraints.A02(j));
                long A063 = AnonymousClass5SF.A06(A04, 0, i2);
                Iterator it2 = list2.iterator();
                while (true) {
                    r15 = null;
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (0qQ.A0K(HRU.A00((C268074ci) obj), "CharacterCount")) {
                        break;
                    }
                }
                C268074ci r8 = (C268074ci) obj;
                if (r8 != null) {
                    r15 = r8.Cnz(A063);
                }
                return C51969G9p.A0a(r6, new C58829IyE(this.A00, Cnz2, Cnz, r15, this.A01, max2, EJS3, EJS, max, this.A02, this.A03), max, max2);
            }
        }
        throw new NoSuchElementException(A002);
    }

    public final /* synthetic */ int CoP(C268014cc r2, List list, int i) {
        return C52407GRi.A02(r2, this, list, i);
    }

    public final /* synthetic */ int CoS(C268014cc r2, List list, int i) {
        return C52407GRi.A03(r2, this, list, i);
    }
}
