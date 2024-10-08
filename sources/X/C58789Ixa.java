package X;

import android.view.View;
import java.util.List;

/* renamed from: X.Ixa  reason: case insensitive filesystem */
public final class C58789Ixa extends 0Yg implements 0sP {
    public final long A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58789Ixa(Object obj, Object obj2, Object obj3, Object obj4, long j, boolean z) {
        super(1);
        this.A04 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
        this.A02 = obj4;
        this.A05 = z;
        this.A00 = j;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C305006Gb r13 = (C305006Gb) obj;
        0qQ.A0B(r13, 0);
        List list = (List) this.A01;
        C59014J2z j2z = C59014J2z.A00;
        J30 j30 = J30.A00;
        View view = (View) this.A03;
        boolean z = this.A05;
        long j = this.A00;
        int size = list.size();
        C51967G9n.A12(r13, new C59429JJe(view, (C304686Eu) this.A02, (Y43) this.A04, list, j, z), new C74185PqR(0, list, (0sP) j2z), new C74185PqR(1, list, (0sP) j30), size);
        return C60340gF.A00;
    }
}
