package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gg5  reason: case insensitive filesystem */
public final class C52952Gg5 extends 04T implements AnonymousClass03Q {
    public boolean A00;
    public final View A01;
    public final C49726F3q A02;
    public final /* synthetic */ C56140HtS A03;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        r2 = r2.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.04a r5) {
        /*
            r4 = this;
            r0 = 1
            r4.A00 = r0
            X.HtS r0 = r4.A03
            X.HjY r1 = r0.A03
            r0 = 0
            X.C245983dn.A02(r0)
            java.util.Set r0 = r1.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x0011:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r2 = r3.next()
            X.HjW r2 = (X.C55550HjW) r2
            X.04Z r0 = r5.A00
            int r1 = r0.A06()
            r0 = 8
            if (r1 != r0) goto L_0x0011
            X.Ho1 r2 = r2.A00
            boolean r1 = r2.A01
            r0 = r1 ^ 1
            if (r1 == r0) goto L_0x0011
            r2.A01 = r0
            X.05G r1 = r2.A04
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.FIA(r0)
            goto L_0x0011
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52952Gg5.A03(X.04a):void");
    }

    public final void A04(04a r5) {
        0qQ.A0B(r5, 0);
        View view = this.A01;
        C56140HtS htS = this.A03;
        view.post(new C57762Ig3(htS));
        C55552HjY hjY = htS.A03;
        C245983dn.A02((String) null);
        Iterator it = hjY.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
        G9A g9a = this.A02.A00;
        if (g9a != null) {
            g9a.Eae(false);
        }
        this.A00 = false;
    }

    public final 04k Cvn(View view, 04k r3) {
        0qQ.A0B(r3, 1);
        if (!this.A00) {
            A00(r3);
        }
        return r3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52952Gg5(View view, C49726F3q f3q, C56140HtS htS) {
        super(1);
        this.A03 = htS;
        this.A01 = view;
        this.A02 = f3q;
    }

    private final void A00(04k r5) {
        04h r1 = r5.A00;
        int i = r1.A05(8).A00 - r1.A05(2).A00;
        if (i < 0) {
            i = 0;
        }
        View view = this.A01;
        if (view.getPaddingBottom() != i) {
            view.setPadding(0, 0, 0, i);
        }
    }

    public final AnonymousClass04S A01(AnonymousClass04S r3, 04a r4) {
        boolean A1Z = AnonymousClass7TG.A1Z(r4, r3);
        G9A g9a = this.A02.A00;
        if (g9a != null) {
            g9a.Eae(A1Z);
        }
        C55552HjY hjY = this.A03.A03;
        C245983dn.A02((String) null);
        Iterator it = hjY.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return r3;
    }

    public final 04k A02(04k r4, List list) {
        AnonymousClass7TG.A1N(r4, list);
        A00(r4);
        C56140HtS htS = this.A03;
        htS.A01 = r4.A00.A0I(8);
        C55552HjY hjY = htS.A03;
        C245983dn.A02((String) null);
        Iterator it = hjY.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return r4;
    }
}
