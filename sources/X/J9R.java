package X;

import com.instagram.common.typedurl.ImageUrl;

public final class J9R extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J9R(Object obj, Object obj2, String str, String str2, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = obj;
        this.A06 = z;
        this.A03 = obj2;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        if (i != 0) {
            boolean z = this.A06;
            I7T.A09(A0R, this.A05, this.A04, (C62320sa) this.A03, (C62320sa) this.A02, C51966G9m.A01(this.A01), z);
        } else {
            C54976Ha9.A00(A0R, (ImageUrl) this.A02, this.A04, this.A05, (C62320sa) this.A03, C51966G9m.A01(this.A01), this.A06);
        }
        return C60340gF.A00;
    }
}
