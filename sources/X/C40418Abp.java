package X;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: X.Abp  reason: case insensitive filesystem */
public final class C40418Abp implements B25 {
    public final /* synthetic */ AnonymousClass8S4 A00;
    public final /* synthetic */ C349327zy A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;

    public final void Cxj(C39889ADn aDn, C349307zv r2) {
    }

    public C40418Abp(AnonymousClass8S4 r1, C349327zy r2, List list, List list2, List list3) {
        this.A00 = r1;
        this.A03 = list;
        this.A04 = list2;
        this.A02 = list3;
        this.A01 = r2;
    }

    public final void Cxh(C39889ADn aDn, C352218Cl r13) {
        AnonymousClass8S4 r3 = this.A00;
        AnonymousClass8BA r6 = r3.A03;
        r6.A0O = r13;
        AnonymousClass802 A012 = aDn.A01();
        aDn.A0C = true;
        AnonymousClass802 A013 = aDn.A01();
        C365798nh r4 = null;
        for (C39740A7g a7g : this.A03) {
            C349307zv r2 = a7g.A04;
            if (r2 != null) {
                r2.A0U = r13.A0I;
                Bitmap bitmap = a7g.A01;
                String str = a7g.A05;
                if (bitmap == null) {
                    r4 = new C365798nh(r2, str);
                }
                this.A04.add(A013);
            } else {
                C352218Cl r9 = a7g.A03;
                if (r9 != null) {
                    r4 = new C365798nh(a7g.A02, r9, a7g.A05, false);
                } else {
                    Bitmap bitmap2 = a7g.A02;
                    if (bitmap2 != null && a7g.A00 != null) {
                        r4 = new C365798nh(bitmap2, r13, a7g.A05, false);
                    } else if (a7g.A00 != null) {
                        r4 = new C365798nh((Bitmap) null, r13, a7g.A05, false);
                    } else if (r4 == null) {
                        r6.A02 = a7g.A00;
                    }
                }
                this.A04.add(A012);
            }
            this.A02.add(r4);
            r6.A02 = a7g.A00;
        }
        r6.A0B = A012;
        r6.A0C = A013;
        r6.A09 = this.A01;
        r3.A05.A02.A08(AnonymousClass05K.A00);
        r3.A06.E3H(new AnonymousClass8SP(this.A02, this.A04));
    }
}
