package X;

import java.util.ArrayList;
import java.util.List;

public final class IWH implements C228382la {
    public final AnonymousClass2rI A00;
    public final 1Ph A01;
    public final C228812mN A02;

    private final void A00() {
        1Pi r0;
        1Ph r5 = this.A01;
        List A08 = this.A00.A08();
        ArrayList A0r = AnonymousClass7TG.A0r(A08);
        for (Object next : A08) {
            C228812mN r1 = this.A02;
            if (r1.CVw(next)) {
                r0 = 1Pi.A02;
            } else if (r1.CVy(next) || r1.CVx(next)) {
                r0 = 1Pi.A04;
            } else {
                r0 = 1Pi.A03;
            }
            A0r.add(r0);
        }
        List list = r5.A01;
        list.clear();
        018.A16(A0r, list);
    }

    public IWH(AnonymousClass2rI r1, 1Ph r2, C228812mN r3) {
        AnonymousClass7TG.A1Q(r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ void DLo(Object obj, int i) {
        A00();
    }

    public final void DMI() {
        A00();
    }

    public final void DMW() {
        A00();
    }
}
