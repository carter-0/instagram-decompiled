package X;

import android.content.DialogInterface;
import java.util.Map;

/* renamed from: X.OfJ  reason: case insensitive filesystem */
public final class C71197OfJ implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public C71197OfJ(C74485Pvf pvf, C74421Pub pub, C71011OYj oYj, C254743sy r4, Map map, int i, int i2, int i3) {
        this.A00 = i3;
        this.A03 = oYj;
        this.A04 = r4;
        this.A01 = i;
        this.A05 = pvf;
        this.A06 = pub;
        this.A07 = map;
        this.A02 = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C71011OYj oYj = (C71011OYj) this.A03;
        C254743sy r5 = (C254743sy) this.A04;
        int i2 = this.A01;
        C74421Pub pub = (C74421Pub) this.A06;
        Map map = (Map) this.A07;
        int i3 = this.A02;
        ((C74485Pvf) this.A05).Dn4();
        if (i3 != 1) {
            C71011OYj.A01(oYj, r5, map, i2);
        }
        pub.Dn5(r5, i2);
    }
}
