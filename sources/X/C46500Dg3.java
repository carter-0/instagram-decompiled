package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

/* renamed from: X.Dg3  reason: case insensitive filesystem */
public final class C46500Dg3 implements C232262tL {
    public final int A00;
    public final DirectShareTarget A01;
    public final String A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C46500Dg3(DirectShareTarget directShareTarget, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        0qQ.A0B(directShareTarget, 1);
        String A082 = directShareTarget.A08();
        if (A082 == null) {
            A082 = directShareTarget.A09();
            0qQ.A07(A082);
        }
        this.A02 = A082;
        this.A01 = directShareTarget;
        this.A00 = i;
        this.A08 = z;
        this.A05 = z2;
        this.A03 = list;
        this.A04 = z3;
        this.A06 = z4;
        this.A07 = z5;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C46500Dg3 dg3 = (C46500Dg3) obj;
        0qQ.A0B(dg3, 0);
        return 0qQ.A0K(this.A01, dg3.A01);
    }
}
