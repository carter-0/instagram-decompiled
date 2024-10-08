package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

public final class JB0 extends 0Yg implements 0sL {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ C288095bM A04;
    public final /* synthetic */ ImageUrl A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ C62320sa A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JB0(Modifier modifier, C288095bM r3, ImageUrl imageUrl, String str, String str2, String str3, C62320sa r8, float f, int i, int i2) {
        super(2);
        this.A06 = str;
        this.A05 = imageUrl;
        this.A07 = str2;
        this.A08 = str3;
        this.A03 = modifier;
        this.A09 = r8;
        this.A00 = f;
        this.A04 = r3;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        String str = this.A06;
        ImageUrl imageUrl = this.A05;
        String str2 = this.A07;
        String str3 = this.A08;
        I2P.A00(A0R, this.A03, this.A04, imageUrl, str, str2, str3, this.A09, this.A00, C51966G9m.A01(this.A01), this.A02);
        return C60340gF.A00;
    }
}
