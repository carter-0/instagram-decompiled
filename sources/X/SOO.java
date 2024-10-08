package X;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public final class SOO {
    public static final Integer A0A = C51967G9n.A0k();
    public long A00;
    public AnonymousClass5Q8 A01;
    public HashMap A02;
    public HashMap A03;
    public HashMap A04;
    public boolean A05;
    public final C268024cd A06;
    public final Sd4 A07;
    public final List A08;
    public final Set A09;

    public SOO(C268024cd r4) {
        this();
        this.A06 = r4;
        this.A00 = AnonymousClass5SF.A05(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        this.A08 = AnonymousClass7TE.A1C();
        this.A05 = true;
        this.A09 = DbS.A0y();
    }

    public final Sd4 A00(Object obj) {
        HashMap hashMap = this.A03;
        C13504TbV tbV = (C13504TbV) hashMap.get(obj);
        Sd4 sd4 = tbV;
        if (tbV == null) {
            Sd4 sd42 = new Sd4(this);
            hashMap.put(obj, sd42);
            sd42.A0K = obj;
            sd4 = sd42;
        }
        if (sd4 instanceof Sd4) {
            return (Sd4) sd4;
        }
        return null;
    }

    public SOO() {
        HashMap A1E = AnonymousClass7TE.A1E();
        this.A03 = A1E;
        this.A02 = AnonymousClass7TE.A1E();
        this.A04 = AnonymousClass7TE.A1E();
        Sd4 sd4 = new Sd4(this);
        this.A07 = sd4;
        A1E.put(A0A, sd4);
    }
}
