package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9ma  reason: invalid class name and case insensitive filesystem */
public final class C387669ma extends C353308Hc implements AnonymousClass8DG {
    public final C387589mS A00;
    public final AnonymousClass8HI A01;
    public final boolean A02;
    public final AnonymousClass8HT A03;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9mS, X.8Hh] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C387669ma(Context context, AnonymousClass8HT r4, AnonymousClass8HI r5, AnonymousClass8AL r6, boolean z) {
        super(r6);
        AnonymousClass7TG.A1U(context, r6, r5);
        0qQ.A0B(r4, 4);
        this.A01 = r5;
        this.A03 = r4;
        this.A02 = z;
        ? r0 = new C353358Hh(context, this, this, false, true);
        this.A00 = r0;
        this.A00 = r0;
    }

    public final void A03(AnonymousClass8HJ r9) {
        String str;
        0qQ.A0B(r9, 0);
        C387589mS r6 = this.A00;
        List list = r6.A02;
        int size = Collections.unmodifiableList(list).size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            AXL axl = (AXL) Collections.unmodifiableList(list).get(i);
            String str2 = r9.A00;
            if (axl != null) {
                str = axl.A01;
            } else {
                str = null;
            }
            if (!0qQ.A0K(str2, str)) {
                i++;
            } else if (i != -1) {
                r6.A03(i);
                11Z.A03(new C41138Aoy(this, i, false));
                AnonymousClass8HT r0 = this.A03;
                0qQ.A06(str2);
                r0.A01(str2);
                return;
            }
        }
        AnonymousClass8HT r02 = this.A03;
        r02.A03.A07("could not find selected mode", "", 518927814, r02.A00);
    }

    public final void A04(List list) {
        C387589mS r4 = this.A00;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(new AXL((AnonymousClass8HJ) it.next()));
        }
        r4.A05(A0r);
        list.size();
        AnonymousClass8AL r2 = this.A01;
        0nA.A0t(r2.A0P, new C41318Ary(this, 3));
    }

    public final /* bridge */ /* synthetic */ void DBj(AnonymousClass518 r3, String str, int i, boolean z) {
        AXL axl = (AXL) r3;
        0qQ.A0B(axl, 0);
        if (!this.A02 || this.A01.A0P.getScrollState() == 0) {
            this.A01.DSE(axl.A00);
        }
    }

    public final void A02(List list) {
        AnonymousClass8HJ r2;
        super.A02(list);
        if (this.A02) {
            C387589mS r22 = this.A00;
            int i = r22.A00;
            if (r22.A06(i)) {
                AXL axl = (AXL) r22.A01(i);
                if (axl != null) {
                    r2 = axl.A00;
                } else {
                    r2 = null;
                }
                AnonymousClass8HI r1 = this.A01;
                AnonymousClass8HJ AuE = r1.AuE();
                if (r2 != null && r2 != AuE) {
                    r1.DSE(r2);
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ void DMF(AnonymousClass518 r2, int i) {
        throw AnonymousClass00P.createAndThrow();
    }
}
