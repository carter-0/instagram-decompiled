package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import com.instagram.common.typedurl.ImageUrl;

public final class JCU extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ LineType A04;
    public final /* synthetic */ ImageUrl A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ C62320sa A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JCU(Modifier modifier, LineType lineType, ImageUrl imageUrl, String str, String str2, String str3, C62320sa r8, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2);
        this.A04 = lineType;
        this.A0D = z;
        this.A0B = z2;
        this.A0A = z3;
        this.A08 = str;
        this.A05 = imageUrl;
        this.A0C = z4;
        this.A09 = r8;
        this.A07 = str2;
        this.A06 = str3;
        this.A03 = modifier;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        LineType lineType = this.A04;
        boolean z = this.A0D;
        boolean z2 = this.A0B;
        boolean z3 = this.A0A;
        String str = this.A08;
        ImageUrl imageUrl = this.A05;
        boolean z4 = this.A0C;
        C62320sa r13 = this.A09;
        String str2 = this.A07;
        String str3 = this.A06;
        boolean z5 = z2;
        boolean z6 = z;
        int i = this.A02;
        C54836HUs.A00(A0R, this.A03, lineType, imageUrl, str, str2, str3, r13, C51966G9m.A01(this.A00), C301445zH.A00(this.A01), i, z6, z5, z3, z4);
        return C60340gF.A00;
    }
}
