package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.MeV  reason: case insensitive filesystem */
public final class C66890MeV extends AnonymousClass4AA {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final Integer A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C66890MeV meV = (C66890MeV) obj;
        if (meV.A03 == this.A03 && this.A01 == meV.A01 && this.A05.equals(meV.A05) && this.A04 == meV.A04 && this.A00 == meV.A00 && this.A08 == meV.A08 && this.A06 == meV.A06 && this.A07 == meV.A07 && this.A09 == meV.A09 && this.A02 == meV.A02 && this.A0A == meV.A0A) {
            return true;
        }
        return false;
    }

    public C66890MeV(MeX meX) {
        this.A03 = meX.A0A;
        this.A01 = meX.A01;
        this.A05 = Collections.unmodifiableList(meX.A04);
        this.A04 = meX.A03;
        this.A00 = meX.A00;
        this.A08 = meX.A07;
        this.A06 = meX.A05;
        this.A07 = meX.A06;
        this.A09 = meX.A08;
        this.A02 = meX.A02;
        this.A0A = meX.A09;
    }
}
