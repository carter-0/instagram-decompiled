package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;

public final class JD1 extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;
    public final Object A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JD1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, String str, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        super(2);
        this.A00 = i4;
        this.A0D = str;
        this.A09 = obj;
        this.A0B = obj2;
        this.A05 = obj3;
        this.A0E = z;
        this.A08 = obj4;
        this.A0C = obj5;
        this.A07 = obj6;
        this.A0F = z2;
        this.A06 = obj7;
        this.A0A = obj8;
        this.A04 = obj9;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        String str = this.A0D;
        Modifier modifier = (Modifier) this.A09;
        LazyListState lazyListState = (LazyListState) this.A0B;
        C304836Fk r6 = (C304836Fk) this.A05;
        boolean z = this.A0E;
        if (i != 0) {
            AnonymousClass6HS r4 = (AnonymousClass6HS) this.A07;
            boolean z2 = this.A0F;
            HXE.A00(r4, (C287295Zu) this.A08, r6, lazyListState, A0R, (C287245Zp) this.A0C, modifier, (HLV) this.A06, str, (0sP) this.A04, (0sL) this.A0A, C51966G9m.A01(this.A01), C301445zH.A00(this.A02), this.A03, z, z2);
        } else {
            AnonymousClass6HS r42 = (AnonymousClass6HS) this.A07;
            boolean z3 = this.A0F;
            C56260HvU.A00(r42, (C287325Zx) this.A0C, r6, lazyListState, A0R, (C287265Zr) this.A08, modifier, (HLV) this.A06, str, (0sP) this.A04, (0sL) this.A0A, C51966G9m.A01(this.A01), C301445zH.A00(this.A02), this.A03, z, z3);
        }
        return C60340gF.A00;
    }
}
