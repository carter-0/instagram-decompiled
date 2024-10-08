package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.JBz  reason: case insensitive filesystem */
public final class C59247JBz extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ C335867df A03;
    public final /* synthetic */ ImageUrl A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ 0sP A07;
    public final /* synthetic */ 0sP A08;
    public final /* synthetic */ 0sJ A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59247JBz(Modifier modifier, C335867df r3, ImageUrl imageUrl, String str, String str2, 0sP r7, 0sP r8, 0sJ r9, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A06 = str;
        this.A05 = str2;
        this.A0A = z;
        this.A04 = imageUrl;
        this.A08 = r7;
        this.A0B = z2;
        this.A07 = r8;
        this.A09 = r9;
        this.A03 = r3;
        this.A02 = modifier;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        String str = this.A06;
        String str2 = this.A05;
        boolean z = this.A0A;
        ImageUrl imageUrl = this.A04;
        0sP r7 = this.A08;
        boolean z2 = this.A0B;
        0sP r8 = this.A07;
        0sJ r9 = this.A09;
        C54874HWh.A00(A0R, this.A02, this.A03, imageUrl, str, str2, r7, r8, r9, C51966G9m.A01(this.A00), this.A01, z, z2);
        return C60340gF.A00;
    }
}
