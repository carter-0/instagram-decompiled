package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

public final class J9Q extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J9Q(Object obj, Object obj2, String str, String str2, int i, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A04 = obj;
        this.A05 = str;
        this.A06 = str2;
        this.A03 = obj2;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                C54789HSw.A00(A0R, (ImageUrl) this.A04, this.A06, this.A05, (C62320sa) this.A03, C51966G9m.A01(this.A01), this.A02);
                break;
            case 1:
                String str = this.A06;
                String str2 = this.A05;
                HUV.A00(A0R, (Modifier) this.A03, str, str2, (C62320sa) this.A04, C51966G9m.A01(this.A01), this.A02);
                break;
            case 2:
                String str3 = this.A06;
                String str4 = this.A05;
                I2L.A01(A0R, (Modifier) this.A03, (ImageUrl) this.A04, str3, str4, C51966G9m.A01(this.A01), this.A02);
                break;
            case 3:
                HV9.A00(A0R, (Modifier) this.A03, this.A06, this.A05, (C62320sa) this.A04, C51966G9m.A01(this.A01), this.A02);
                break;
            case 4:
                C56650I6f.A03(A0R, (AnonymousClass2DO) this.A03, (HL7) this.A04, this.A06, this.A05, C51966G9m.A01(this.A01), this.A02);
                break;
            case 5:
                C54934HYq.A00(A0R, (Modifier) this.A03, this.A05, this.A06, (0sP) this.A04, C51966G9m.A01(this.A01), this.A02);
                break;
            case 6:
                C54941HYx.A00(A0R, (Modifier) this.A03, this.A06, this.A05, (C62320sa) this.A04, C51966G9m.A01(this.A01), this.A02);
                break;
            case 7:
                int i2 = this.A02;
                HZG.A00(A0R, this.A05, this.A06, (0sG) this.A04, (AnonymousClass62P) this.A03, i2, C51966G9m.A01(this.A01));
                break;
            default:
                C56292Hw5.A01(A0R, (Modifier) this.A04, (ImageUrl) this.A03, this.A05, this.A06, C51966G9m.A01(this.A01), this.A02);
                break;
        }
        return C60340gF.A00;
    }
}
