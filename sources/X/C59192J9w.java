package X;

import android.view.View;
import androidx.compose.ui.Modifier;

/* renamed from: X.J9w  reason: case insensitive filesystem */
public final class C59192J9w extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59192J9w(Object obj, Object obj2, Object obj3, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A00 = i3;
        this.A05 = obj;
        this.A04 = obj2;
        this.A07 = z;
        this.A06 = z2;
        this.A03 = obj3;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                boolean z = this.A07;
                Modifier modifier = (Modifier) this.A03;
                boolean z2 = this.A06;
                HXJ.A00(C51966G9m.A0R(obj, obj2), modifier, (HLW) this.A05, (0sP) this.A04, C51966G9m.A01(this.A01), this.A02, z, z2);
                break;
            case 1:
                C286575Wy A0R = C51966G9m.A0R(obj, obj2);
                boolean z3 = this.A07;
                Modifier modifier2 = (Modifier) this.A04;
                boolean z4 = this.A06;
                HXQ.A00((C287605aT) this.A03, A0R, modifier2, (C62320sa) this.A05, C51966G9m.A01(this.A01), this.A02, z3, z4);
                break;
            case 2:
                C56650I6f.A02((C287605aT) this.A04, C51966G9m.A0R(obj, obj2), (Modifier) this.A05, (0sK) this.A03, C51966G9m.A01(this.A01), this.A02, this.A07, this.A06);
                break;
            default:
                HZZ.A00((View) this.A05, C51966G9m.A0R(obj, obj2), (Modifier) this.A03, (AnonymousClass62P) this.A04, C51966G9m.A01(this.A01), this.A02, this.A06, this.A07);
                break;
        }
        return C60340gF.A00;
    }
}
