package X;

import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Dra  reason: case insensitive filesystem */
public final class C47159Dra extends AnonymousClass0T0 {
    public int A00;
    public Integer A01;
    public boolean A02;
    public boolean A03 = false;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final DirectShareTarget A07;

    public C47159Dra(DirectShareTarget directShareTarget, Integer num, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass7TF.A1F(directShareTarget, 1, num);
        this.A07 = directShareTarget;
        this.A04 = z;
        this.A02 = z2;
        this.A05 = z3;
        this.A06 = z4;
        this.A00 = i;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47159Dra)) {
            return false;
        }
        return 0qQ.A0K(this.A07, ((C47159Dra) obj).A07);
    }

    public final int hashCode() {
        return this.A07.hashCode();
    }
}
