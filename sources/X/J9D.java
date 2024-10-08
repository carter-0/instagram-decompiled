package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.google.common.collect.ImmutableList;

public final class J9D extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J9D(Object obj, Object obj2, Object obj3, int i, int i2, int i3, int i4) {
        super(2);
        this.A00 = i4;
        this.A05 = obj;
        this.A03 = i;
        this.A04 = obj2;
        this.A06 = obj3;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C56281Hvp.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A05, (ImmutableList) this.A04, (0sP) this.A06, this.A03, C51966G9m.A01(this.A01), this.A02);
                break;
            case 1:
                int i = this.A03;
                0sP r3 = (0sP) this.A05;
                HZ3.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, r3, (AnonymousClass62P) this.A06, i, C51966G9m.A01(this.A01), this.A02);
                break;
            case 2:
                C56639I5u.A03(C51966G9m.A0R(obj, obj2), (Integer) this.A05, (Integer) this.A06, (C62320sa) this.A04, this.A03, this.A02, C51966G9m.A01(this.A01));
                break;
            default:
                ((C54136H0f) this.A06).A05((LazyListState) this.A05, C51966G9m.A0R(obj, obj2), (C62320sa) this.A04, this.A03, C51966G9m.A01(this.A01), this.A02);
                break;
        }
        return C60340gF.A00;
    }
}
