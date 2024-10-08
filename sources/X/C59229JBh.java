package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.JBh  reason: case insensitive filesystem */
public final class C59229JBh extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59229JBh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A00 = i3;
        this.A03 = obj;
        this.A06 = obj2;
        this.A05 = obj3;
        this.A08 = z;
        this.A0A = z2;
        this.A07 = obj4;
        this.A09 = z3;
        this.A04 = obj5;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        if (i != 0) {
            C288195bW r2 = (C288195bW) this.A05;
            boolean z = this.A08;
            boolean z2 = this.A0A;
            boolean z3 = this.A09;
            GQY.A0B(A0R, r2, (AnonymousClass9J6) this.A06, (ImageUrl) this.A03, (ImageUrl) this.A04, (0sP) this.A07, C51966G9m.A01(this.A01), this.A02, z, z2, z3);
        } else {
            boolean z4 = this.A08;
            boolean z5 = this.A0A;
            LineType lineType = (LineType) this.A07;
            boolean z6 = this.A09;
            I2N.A00(A0R, (Modifier) this.A04, (C278014w6) this.A03, lineType, (C62320sa) this.A06, (0sP) this.A05, C51966G9m.A01(this.A01), this.A02, z4, z5, z6);
        }
        return C60340gF.A00;
    }
}
