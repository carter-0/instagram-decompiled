package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.JAo  reason: case insensitive filesystem */
public final class C59210JAo extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final String A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59210JAo(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A02 = i;
        this.A08 = str;
        this.A07 = str2;
        this.A03 = obj;
        this.A04 = obj2;
        this.A06 = obj3;
        this.A05 = obj4;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                String str = this.A08;
                C52739Gbr.A01(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, (C52738Gbq) this.A05, str, this.A07, (C62320sa) this.A06, (AnonymousClass62P) this.A03, C51966G9m.A01(this.A01), this.A02);
                break;
            case 1:
                Modifier modifier = (Modifier) this.A04;
                String str2 = this.A07;
                AnonymousClass2DO r4 = (AnonymousClass2DO) this.A06;
                C52751Gc3.A00((C287605aT) this.A03, C51966G9m.A0R(obj, obj2), modifier, r4, this.A08, str2, (0sP) this.A05, C51966G9m.A01(this.A01), this.A02);
                break;
            default:
                C286575Wy A0R = C51966G9m.A0R(obj, obj2);
                int i = this.A02;
                C53295Glh glh = (C53295Glh) this.A06;
                HZF.A00(A0R, (C53373Gn3) this.A05, glh, this.A08, this.A07, (0sL) this.A03, (0sL) this.A04, i, C51966G9m.A01(this.A01));
                break;
        }
        return C60340gF.A00;
    }
}
