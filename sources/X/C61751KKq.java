package X;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import java.util.Iterator;

/* renamed from: X.KKq  reason: case insensitive filesystem */
public final class C61751KKq extends C353308Hc implements AnonymousClass8DG {
    public final C65012Llp A00;
    public final C387609mU A01;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9mU, X.8Hh] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61751KKq(Context context, AnonymousClass8AL r4, C65012Llp llp) {
        super(r4);
        0qQ.A0B(r4, 2);
        this.A00 = llp;
        ? r0 = new C353358Hh(context, this, this, false, true);
        this.A01 = r0;
        this.A00 = r0;
    }

    public final /* bridge */ /* synthetic */ void DBj(AnonymousClass518 r10, String str, int i, boolean z) {
        C347087wF r102 = (C347087wF) r10;
        0qQ.A0B(r102, 0);
        C65012Llp llp = this.A00;
        if (llp.A0D.CQ0(AnonymousClass80V.POST_CAPTURE_LAYOUT_EDIT)) {
            llp.A01 = r102;
            GridLayoutManager gridLayoutManager = llp.A04;
            gridLayoutManager.A1v(r102.A00);
            C320806sz r0 = llp.A01.A04;
            if (r0 == null) {
                r0 = new C320806sz();
            }
            gridLayoutManager.A01 = r0;
            C60440JlY jlY = llp.A0C;
            Iterator it = jlY.A05.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                int i3 = i2 + 1;
                C63810L7q l7q = (C63810L7q) it.next();
                C59943Jc9 jc9 = llp.A0B;
                C71492dQ A03 = jc9.A03(llp.A01, i2);
                if (A03 != null) {
                    l7q.A00 = A03;
                    C63809L7p A04 = jc9.A04(llp.A01, i2);
                    0qQ.A0B(A04, 0);
                    l7q.A01 = A04;
                    i2 = i3;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            jlY.notifyDataSetChanged();
        }
    }

    public final /* bridge */ /* synthetic */ void DMF(AnonymousClass518 r2, int i) {
        throw AnonymousClass00P.createAndThrow();
    }
}
