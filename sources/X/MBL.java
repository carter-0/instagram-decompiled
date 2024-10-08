package X;

import java.util.List;

public final class MBL implements AnonymousClass0eL, 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public MBL(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 2:
                DbS.A1U(this.A02);
                return null;
            case 3:
                ((0sP) this.A02).invoke(DbW.A0e((AnonymousClass6Tm) obj));
                return null;
            case 4:
                return C63274KuJ.A00((C64086LMe) this.A01, (List) this.A02, (AnonymousClass4D7) obj);
            default:
                List list = ((AnonymousClass6Tm) obj).A00;
                ((0sI) this.A02).invoke(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4));
                return null;
        }
    }
}
