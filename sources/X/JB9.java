package X;

import com.instagram.common.typedurl.ImageUrl;

public final class JB9 extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ HMM A03;
    public final /* synthetic */ C54623HLg A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ 0sP A07;
    public final /* synthetic */ 0sK A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JB9(ImageUrl imageUrl, HMM hmm, C54623HLg hLg, String str, String str2, 0sP r7, 0sK r8, int i, int i2, boolean z) {
        super(2);
        this.A05 = str;
        this.A06 = str2;
        this.A02 = imageUrl;
        this.A04 = hLg;
        this.A03 = hmm;
        this.A09 = z;
        this.A07 = r7;
        this.A08 = r8;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        String str = this.A05;
        String str2 = this.A06;
        ImageUrl imageUrl = this.A02;
        C54623HLg hLg = this.A04;
        C55196Hdm.A00(A0R, imageUrl, this.A03, hLg, str, str2, this.A07, this.A08, C51966G9m.A01(this.A00), this.A01, this.A09);
        return C60340gF.A00;
    }
}
