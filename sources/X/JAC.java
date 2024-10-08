package X;

import com.instagram.common.typedurl.ImageUrl;

public final class JAC extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JAC(Object obj, Object obj2, Object obj3, String str, String str2, String str3, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A07 = str;
        this.A03 = obj;
        this.A06 = str2;
        this.A05 = str3;
        this.A02 = obj2;
        this.A04 = obj3;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        if (i != 0) {
            C54911HXt.A00(A0R, this.A07, this.A06, this.A05, (C62320sa) this.A03, (C62320sa) this.A02, (C62320sa) this.A04, C51966G9m.A01(this.A01));
        } else {
            String str = this.A07;
            String str2 = this.A06;
            String str3 = this.A05;
            I64.A01(A0R, (C54629HLm) this.A02, (ImageUrl) this.A03, str, str2, str3, (0sL) this.A04, C51966G9m.A01(this.A01));
        }
        return C60340gF.A00;
    }
}
