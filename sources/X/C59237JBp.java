package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;

/* renamed from: X.JBp  reason: case insensitive filesystem */
public final class C59237JBp extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59237JBp(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A00 = i3;
        this.A06 = obj;
        this.A0A = z;
        this.A07 = str;
        this.A04 = obj2;
        this.A05 = obj3;
        this.A09 = z2;
        this.A08 = z3;
        this.A03 = obj4;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                String str = this.A07;
                boolean z = this.A0A;
                C54839HUv.A00(A0R, (Modifier) this.A03, (LineType) this.A06, str, (0sP) this.A04, (0sP) this.A05, C51966G9m.A01(this.A01), this.A02, z, this.A09, this.A08);
                break;
            case 1:
                boolean z2 = this.A0A;
                boolean z3 = this.A09;
                boolean z4 = this.A08;
                HV0.A00(A0R, (Modifier) this.A03, (LineType) this.A06, this.A07, (C62320sa) this.A04, (C62320sa) this.A05, C51966G9m.A01(this.A01), this.A02, z2, z3, z4);
                break;
            default:
                String str2 = this.A07;
                boolean z5 = this.A09;
                Modifier modifier = (Modifier) this.A05;
                boolean z6 = this.A08;
                boolean z7 = this.A0A;
                I7P.A07(A0R, modifier, (C59485JLj) this.A06, (Integer) this.A04, str2, (0sL) this.A03, this.A02, C51966G9m.A01(this.A01), z5, z6, z7);
                break;
        }
        return C60340gF.A00;
    }
}
