package X;

import com.instagram.common.typedurl.ImageUrl;

public final class J8H extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ImageUrl A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J8H(ImageUrl imageUrl, String str, String str2, int i, boolean z, boolean z2) {
        super(2);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = imageUrl;
        this.A05 = z;
        this.A04 = z2;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        String str = this.A02;
        String str2 = this.A03;
        C55106HcF.A00(A0R, this.A01, str, str2, C51966G9m.A01(this.A00), this.A05, this.A04);
        return C60340gF.A00;
    }
}
