package X;

import java.util.ArrayList;

/* renamed from: X.IcB  reason: case insensitive filesystem */
public final class C57523IcB implements JQQ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C275464qK A01;
    public final /* synthetic */ C56526Hzx A02;
    public final /* synthetic */ ArrayList A03;

    public C57523IcB(C275464qK r1, C56526Hzx hzx, ArrayList arrayList, int i) {
        this.A02 = hzx;
        this.A01 = r1;
        this.A00 = i;
        this.A03 = arrayList;
    }

    public final /* bridge */ /* synthetic */ C254253sB B3L() {
        return null;
    }

    public final /* bridge */ /* synthetic */ C254253sB B3M() {
        C56526Hzx hzx = this.A02;
        C275464qK r3 = this.A01;
        int i = this.A00;
        ArrayList arrayList = this.A03;
        C254523sc A002 = C56526Hzx.A00(r3, hzx, i);
        0qQ.A0B(arrayList, 0);
        A002.A7V = arrayList;
        A002.A14 = Boolean.valueOf(C51971G9r.A0j(hzx.A00).A03(r3.getId()));
        return new C254563sg(A002);
    }

    public final /* bridge */ /* synthetic */ C254253sB BqR() {
        return null;
    }
}
