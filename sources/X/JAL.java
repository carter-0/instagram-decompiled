package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import com.instagram.common.typedurl.ImageUrl;

public final class JAL extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ LineType A03;
    public final /* synthetic */ ImageUrl A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ C62320sa A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JAL(Modifier modifier, LineType lineType, ImageUrl imageUrl, String str, String str2, C62320sa r7, int i, int i2, boolean z) {
        super(2);
        this.A06 = str;
        this.A05 = str2;
        this.A04 = imageUrl;
        this.A03 = lineType;
        this.A08 = z;
        this.A02 = modifier;
        this.A07 = r7;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        String str = this.A06;
        String str2 = this.A05;
        ImageUrl imageUrl = this.A04;
        I2L.A00(A0R, this.A02, this.A03, imageUrl, str, str2, this.A07, C51966G9m.A01(this.A00), this.A01, this.A08);
        return C60340gF.A00;
    }
}
