package X;

import com.instagram.common.typedurl.ImageUrl;

public final class JBL extends 0Yg implements 0sL {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ ImageUrl A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ C62320sa A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JBL(ImageUrl imageUrl, String str, String str2, String str3, String str4, C62320sa r7, float f, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A03 = imageUrl;
        this.A07 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A0A = z;
        this.A08 = r7;
        this.A00 = f;
        this.A09 = z2;
        this.A04 = str4;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        ImageUrl imageUrl = this.A03;
        String str = this.A07;
        String str2 = this.A05;
        String str3 = this.A06;
        boolean z = this.A0A;
        C54792HSz.A00(A0R, imageUrl, str, str2, str3, this.A04, this.A08, this.A00, C51966G9m.A01(this.A01), this.A02, z, this.A09);
        return C60340gF.A00;
    }
}
