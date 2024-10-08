package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

public final class J9T extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J9T(Object obj, Object obj2, String str, String str2, String str3, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = obj;
        this.A06 = str3;
        this.A03 = obj2;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        if (i != 0) {
            String str = this.A04;
            String str2 = this.A05;
            String str3 = this.A06;
            I2P.A02(A0R, (Modifier) this.A03, (ImageUrl) this.A02, str, str2, str3, C51966G9m.A01(this.A01));
        } else {
            String str4 = this.A06;
            String str5 = this.A05;
            String str6 = this.A04;
            C56630I5j.A02(A0R, (Modifier) this.A02, str4, str5, str6, (C62320sa) this.A03, C51966G9m.A01(this.A01));
        }
        return C60340gF.A00;
    }
}
