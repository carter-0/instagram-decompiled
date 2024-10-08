package X;

import java.util.List;

/* renamed from: X.HQd  reason: case insensitive filesystem */
public abstract class C54724HQd {
    public final void A00(int i, int i2) {
        if (this instanceof C53059Ghr) {
            List list = ((C53059Ghr) this).A00;
            list.add(C51967G9n.A0k());
            G9w.A0x(i, list);
            G9w.A0x(i2, list);
            return;
        }
        C231452rh r1 = ((C53058Ghq) this).A00.A03;
        if (r1 != null) {
            r1.D1O(i, i2, (Object) null);
        } else {
            0qQ.A0F("updateCallback");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A01(int i, int i2) {
        if (this instanceof C53059Ghr) {
            List list = ((C53059Ghr) this).A00;
            G9w.A0x(1, list);
            G9w.A0x(i, list);
            G9w.A0x(i2, list);
            return;
        }
        C231452rh r0 = ((C53058Ghq) this).A00.A03;
        if (r0 != null) {
            r0.DKr(i, i2);
        } else {
            0qQ.A0F("updateCallback");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
