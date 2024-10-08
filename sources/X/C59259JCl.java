package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.JCl  reason: case insensitive filesystem */
public final class C59259JCl extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ LineType A04;
    public final /* synthetic */ C53255Gl3 A05;
    public final /* synthetic */ ImageUrl A06;
    public final /* synthetic */ ImageUrl A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ C62320sa A0B;
    public final /* synthetic */ C62320sa A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59259JCl(Modifier modifier, LineType lineType, C53255Gl3 gl3, ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, String str3, C62320sa r10, C62320sa r11, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A08 = str;
        this.A06 = imageUrl;
        this.A07 = imageUrl2;
        this.A09 = str2;
        this.A0A = str3;
        this.A04 = lineType;
        this.A05 = gl3;
        this.A0D = z;
        this.A03 = modifier;
        this.A0B = r10;
        this.A0C = r11;
        this.A0E = z2;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        String str = this.A08;
        ImageUrl imageUrl = this.A06;
        ImageUrl imageUrl2 = this.A07;
        String str2 = this.A09;
        String str3 = this.A0A;
        LineType lineType = this.A04;
        C53255Gl3 gl3 = this.A05;
        boolean z = this.A0D;
        Modifier modifier = this.A03;
        C62320sa r13 = this.A0B;
        C62320sa r14 = this.A0C;
        boolean z2 = this.A0E;
        I2P.A01(A0R, modifier, lineType, gl3, imageUrl, imageUrl2, str, str2, str3, r13, r14, C51966G9m.A01(this.A00), C301445zH.A00(this.A01), this.A02, z, z2);
        return C60340gF.A00;
    }
}
