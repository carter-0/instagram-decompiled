package X;

import java.util.List;

/* renamed from: X.Jk5  reason: case insensitive filesystem */
public final class C60357Jk5 extends C232322tW {
    public final List A00;
    public final List A01;
    public final /* synthetic */ KKL A02;

    public C60357Jk5(KKL kkl, List list, List list2) {
        0qQ.A0B(list, 2);
        this.A02 = kkl;
        this.A01 = list;
        this.A00 = list2;
    }

    public final int A02() {
        return this.A00.size();
    }

    public final int A03() {
        return this.A01.size();
    }

    public final boolean A04(int i, int i2) {
        return 0qQ.A0K(this.A01.get(i), this.A00.get(i2));
    }

    public final boolean A05(int i, int i2) {
        C61080JwI jwI = (C61080JwI) this.A00.get(i2);
        C357268Xf r1 = (C357268Xf) ((C61080JwI) this.A01.get(i)).A00;
        if (!r1.getName().equals(jwI) || r1.BEU() != ((C357268Xf) jwI.A00).BEU()) {
            return false;
        }
        return true;
    }
}
