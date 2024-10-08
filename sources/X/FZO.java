package X;

import java.util.HashSet;

public final class FZO implements C250603lj {
    public final /* synthetic */ C49624Ezh A00;

    public FZO(C49624Ezh ezh) {
        this.A00 = ezh;
    }

    public final void ATF(AnonymousClass30Y r9, C252093oY r10) {
        Integer num;
        if (r9 != null) {
            C49624Ezh ezh = this.A00;
            if (r10 != null) {
                num = r10.CEk(r9);
            } else {
                num = null;
            }
            if (num == AnonymousClass05K.A00) {
                0eP r7 = (0eP) r9.A03;
                C47173Dro dro = (C47173Dro) r9.A04;
                HashSet hashSet = ezh.A04;
                Object obj = r7.A00;
                if (hashSet.add(((AnonymousClass17B) obj).getId())) {
                    ezh.A02.A00((AnonymousClass3UM) obj, dro.A02, dro.A01);
                }
                AnonymousClass3UM r3 = (AnonymousClass3UM) r7.A01;
                if (r3 != null && hashSet.add(r3.getId())) {
                    ezh.A02.A00(r3, dro.A02, dro.A01 + 1);
                }
            }
        }
    }
}
