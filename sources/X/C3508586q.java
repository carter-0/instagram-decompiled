package X;

import com.instagram.model.shopping.ProductItemWithAR;

/* renamed from: X.86q  reason: invalid class name and case insensitive filesystem */
public final class C3508586q implements C3508686r {
    public final /* synthetic */ AnonymousClass86m A00;

    public final void DBi(AnonymousClass87G r1, String str, int i, boolean z) {
    }

    public final void DBk(AnonymousClass87G r2, int i, boolean z) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DMG(AnonymousClass87G r3, int i) {
        0qQ.A0B(r3, 0);
        boolean A04 = r3.A04();
        AnonymousClass86m r1 = this.A00;
        if (A04) {
            AnonymousClass86m.A04(r3, r1);
        } else if (r1.A0W.A03) {
            ProductItemWithAR productItemWithAR = r3.A06;
            if (productItemWithAR != null) {
                r1.Egp(C14502TxO.A00(productItemWithAR.A01));
            }
        } else {
            r1.ETd(r3.A0G);
        }
        r1.FK5();
    }

    public C3508586q(AnonymousClass86m r1) {
        this.A00 = r1;
    }
}
