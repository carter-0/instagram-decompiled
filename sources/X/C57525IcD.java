package X;

import java.util.Map;

/* renamed from: X.IcD  reason: case insensitive filesystem */
public final class C57525IcD implements JQQ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ C55783HnI A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C57525IcD(1Xj r1, C55783HnI hnI, String str, String str2, int i) {
        this.A02 = hnI;
        this.A03 = str;
        this.A01 = r1;
        this.A00 = i;
        this.A04 = str2;
    }

    public final /* bridge */ /* synthetic */ C254253sB B3L() {
        AnonymousClass4DU r5 = this.A02.A01;
        C254523sc A0n = C51965G9l.A0n(r5, "IMPRESSION");
        String str = this.A03;
        1Xj r3 = this.A01;
        int i = this.A00;
        String str2 = this.A04;
        A0n.A4N = str;
        A0n.A4W = C51973G9u.A0k(r3);
        A0n.A0N(r3.BR7());
        A0n.A1e = DbT.A0l(r3.CcK());
        A0n.A5u = r3.getId();
        A0n.A09(i);
        A0n.A4s = r5.getModuleName();
        A0n.A7J = str2;
        return new C254563sg(A0n);
    }

    public final /* bridge */ /* synthetic */ C254253sB B3M() {
        return null;
    }

    public final /* bridge */ /* synthetic */ C254253sB BqR() {
        String str;
        boolean z;
        1Xj r1 = this.A01;
        Integer num = null;
        if (!r1.CcK()) {
            return null;
        }
        C46298DUb BUS = r1.A0C.BUS();
        if (BUS == null || !C231122qu.A0O(this.A02.A00, r1)) {
            BUS = null;
        }
        Map A0w = AnonymousClass7TF.A0w("qe_universe", "ig4a_views_impression_metric_merlin_lac");
        String str2 = this.A04;
        if (BUS != null) {
            str = BUS.BUa();
            z = true;
            num = Integer.valueOf(BUS.BUX());
        } else {
            str = null;
            z = false;
        }
        return new C57529IcH(num, str2, "story_ads", str, A0w, z);
    }
}
