package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;

/* renamed from: X.JBx  reason: case insensitive filesystem */
public final class C59245JBx extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ LineType A03;
    public final /* synthetic */ C299495vH A04;
    public final /* synthetic */ HML A05;
    public final /* synthetic */ 0sP A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59245JBx(Modifier modifier, LineType lineType, C299495vH r4, HML hml, 0sP r6, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(2);
        this.A06 = r6;
        this.A05 = hml;
        this.A04 = r4;
        this.A03 = lineType;
        this.A0B = z;
        this.A07 = z2;
        this.A09 = z3;
        this.A02 = modifier;
        this.A0A = z4;
        this.A08 = z5;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        0sP r6 = this.A06;
        HML hml = this.A05;
        C299495vH r4 = this.A04;
        LineType lineType = this.A03;
        boolean z = this.A0B;
        boolean z2 = this.A07;
        boolean z3 = this.A09;
        C56630I5j.A00(A0R, this.A02, lineType, r4, hml, r6, C51966G9m.A01(this.A00), this.A01, z, z2, z3, this.A0A, this.A08);
        return C60340gF.A00;
    }
}
