package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

public final class JG5 extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JG5(Modifier modifier, String str, String str2, int i, int i2) {
        super(2);
        this.A00 = i2;
        if (2 - i2 != 0) {
            this.A03 = str;
            this.A04 = str2;
        } else {
            this.A04 = str;
            this.A03 = str2;
        }
        this.A02 = modifier;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                I64.A02(A0R, (ImageUrl) this.A02, this.A04, this.A03, C51966G9m.A01(this.A01));
                break;
            case 1:
                C56630I5j.A03(A0R, this.A04, this.A03, (C62320sa) this.A02, C51966G9m.A01(this.A01));
                break;
            case 2:
                C56630I5j.A01(A0R, (Modifier) this.A02, this.A04, this.A03, C51966G9m.A01(this.A01));
                break;
            default:
                C56239Hv6.A01(A0R, (Modifier) this.A02, this.A03, this.A04, C51966G9m.A01(this.A01));
                break;
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JG5(Object obj, String str, String str2, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = obj;
        this.A01 = i;
    }
}
