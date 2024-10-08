package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

public final class IFJ implements AnonymousClass6J4 {
    public final int A00;
    public final C59663JSi A01;
    public final C305586Iq A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ LazyGridState A06;
    public final /* synthetic */ C305586Iq A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public final /* bridge */ /* synthetic */ AnonymousClass6JL AbW(int i, int i2, int i3, long j) {
        return A00(i, i2, i3, this.A00, j);
    }

    public IFJ(C59663JSi jSi, LazyGridState lazyGridState, C305586Iq r3, int i, int i2, int i3, long j, boolean z, boolean z2) {
        this.A07 = r3;
        this.A06 = lazyGridState;
        this.A08 = z;
        this.A09 = z2;
        this.A04 = i2;
        this.A03 = i3;
        this.A05 = j;
        this.A01 = jSi;
        this.A02 = r3;
        this.A00 = i;
    }

    public final IFG A00(int i, int i2, int i3, int i4, long j) {
        int A022;
        C59663JSi jSi = this.A01;
        int i5 = i;
        Object BK0 = jSi.BK0(i5);
        Object Aqn = jSi.Aqn(i5);
        long j2 = j;
        List Cnw = this.A02.Cnw(i5, j2);
        if (Constraints.A09(j2)) {
            A022 = Constraints.A03(j2);
        } else if (Constraints.A08(j2)) {
            A022 = Constraints.A02(j2);
        } else {
            throw AnonymousClass7TE.A0w("does not have fixed height");
        }
        AnonymousClass5Q8 layoutDirection = this.A07.getLayoutDirection();
        AnonymousClass6H4 r9 = this.A06.A0C;
        boolean z = this.A08;
        boolean z2 = this.A09;
        int i6 = this.A04;
        int i7 = this.A03;
        return new IFG(r9, layoutDirection, BK0, Aqn, Cnw, i5, A022, i4, i6, i7, i2, i3, this.A05, j2, z, z2);
    }
}
