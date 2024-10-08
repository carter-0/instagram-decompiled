package X;

import java.util.Map;

public final class GC5 {
    public final C231002qi A00;
    public final C52232GJx A01;

    public GC5(C231002qi r1, C52232GJx gJx) {
        AnonymousClass7TG.A1O(gJx, r1);
        this.A01 = gJx;
        this.A00 = r1;
    }

    public final void A00(AnonymousClass4UE r5, Integer num) {
        boolean A1Z = AnonymousClass7TG.A1Z(r5, num);
        this.A00.DbI(r5, num, (Map) null);
        if (num == AnonymousClass05K.A0N) {
            C52232GJx gJx = this.A01;
            C267324bN r1 = (C267324bN) gJx.A02.get(r5);
            if (r1 != null) {
                GD6.A01(gJx.A03).A0T(r1, A1Z);
            }
        }
    }
}
