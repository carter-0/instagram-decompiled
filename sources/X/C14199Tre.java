package X;

import java.util.List;

/* renamed from: X.Tre  reason: case insensitive filesystem */
public class C14199Tre {
    public int A00;
    public int A01;
    public final C14201Trg A02 = new C14201Trg();
    public final boolean A03;

    public final void A04(Integer num, Object obj) {
        C14201Trg trg = this.A02;
        List list = trg.A00;
        if (!list.contains(obj)) {
            list.add(obj);
            trg.A01.add((Object) null);
        }
        this.A00++;
        if (num.intValue() == 0) {
            this.A01++;
        }
    }

    public static void A00(C14199Tre tre, Object obj) {
        tre.A05(AnonymousClass05K.A0C, obj, new Object());
    }

    public final C14198Trd A01() {
        C14201Trg trg = this.A02;
        List list = trg.A00;
        int size = list.size();
        List list2 = trg.A01;
        if (size == list2.size()) {
            return new C14198Trd(list, list2);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void A02(C66966Mfz mfz, Object obj) {
        C14201Trg trg = this.A02;
        mfz.A00 = this.A00;
        mfz.A01 = this.A01;
        mfz.A0J = this.A03;
        C66967Mg0 mg0 = new C66967Mg0(mfz);
        List list = trg.A00;
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Any");
        list.add(obj);
        trg.A01.add(mg0);
        this.A00++;
        this.A01++;
    }

    public final void A03(C66966Mfz mfz, Object obj) {
        C14201Trg trg = this.A02;
        mfz.A00 = this.A00;
        mfz.A01 = this.A01;
        mfz.A0J = this.A03;
        C66967Mg0 mg0 = new C66967Mg0(mfz);
        List list = trg.A00;
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Any");
        if (!list.contains(obj)) {
            0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Any");
            list.add(obj);
            trg.A01.add(mg0);
        }
        this.A00++;
        this.A01++;
    }

    public final void A05(Integer num, Object obj, Object obj2) {
        int i;
        C14201Trg trg = this.A02;
        List list = trg.A00;
        if (!list.contains(obj)) {
            list.add(obj);
            trg.A01.add(obj2);
        }
        this.A00++;
        int intValue = num.intValue();
        if (intValue == 0) {
            i = this.A01 + 1;
        } else if (intValue != 1) {
            i = 0;
        } else {
            return;
        }
        this.A01 = i;
    }

    public C14199Tre(boolean z) {
        this.A03 = z;
    }
}
