package X;

import android.util.SparseArray;

public final class FZQ implements C250603lj {
    public final /* synthetic */ F02 A00;

    public FZQ(F02 f02) {
        this.A00 = f02;
    }

    public final void ATF(AnonymousClass30Y r6, C252093oY r7) {
        if (r6 != null) {
            F02 f02 = this.A00;
            if (r7 != null && r7.CEk(r6) == AnonymousClass05K.A00) {
                Object obj = r6.A03;
                C46467DfV dfV = (C46467DfV) obj;
                String str = dfV.A01;
                if (str != null && f02.A04.add(str)) {
                    F2S f2s = f02.A02;
                    0qQ.A06(obj);
                    SparseArray sparseArray = dfV.A00;
                    if (sparseArray != null) {
                        Object obj2 = sparseArray.get(1);
                        if (obj2 instanceof String) {
                            0Aj A0e = AnonymousClass7TE.A0e(f2s.A00, "suggestions_see_all_impression");
                            A0e.AAJ("view_module", (String) obj2);
                            A0e.Cgf();
                        }
                    }
                }
            }
        }
    }
}
