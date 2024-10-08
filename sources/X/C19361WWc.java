package X;

import java.util.Iterator;

/* renamed from: X.WWc  reason: case insensitive filesystem */
public final class C19361WWc implements AnonymousClass0u1 {
    public final /* synthetic */ WT2 A00;

    public C19361WWc(WT2 wt2) {
        this.A00 = wt2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.Vjn] */
    public final void E0V(int i) {
        WT2 wt2 = this.A00;
        C17365VSs vSs = wt2.A01;
        if (vSs != null) {
            C17365VSs vSs2 = new C17365VSs();
            Iterator A0h = JTQ.A0h(vSs.A01);
            while (A0h.hasNext()) {
                C18011Vjn vjn = (C18011Vjn) A0h.next();
                ? obj = new Object();
                obj.A05 = vjn.A05;
                obj.A04 = vjn.A04;
                obj.A03 = vjn.A03;
                obj.A00 = vjn.A00;
                obj.A02 = vjn.A02;
                obj.A01 = vjn.A01;
                obj.A06 = vjn.A06;
                vSs2.A01.add(obj);
            }
            vSs2.A00 = wt2.A01.A00;
            wt2.A04.ATE(new C15865Ujp(vSs2, this));
        }
    }
}
