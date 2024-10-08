package X;

import java.util.List;

public final class AW4 implements C365558nJ {
    public final /* synthetic */ C365608nO A00;

    public AW4(C365608nO r1) {
        this.A00 = r1;
    }

    public final void D59(AnonymousClass9GD r6) {
        if (r6.A0E()) {
            List list = (List) r6.A06();
            2JF r3 = this.A00.A00;
            for (int i = 0; i < list.size(); i++) {
                2JF.A02(r3, (C10893Rzt) list.get(i), false);
            }
        }
        2JF r1 = this.A00.A00;
        synchronized (r1) {
            r1.A07 = true;
            r1.A02 = false;
            r1.A05 = false;
        }
        2JF.A01(r1);
    }
}
