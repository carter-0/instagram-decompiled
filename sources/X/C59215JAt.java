package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.JAt  reason: case insensitive filesystem */
public final class C59215JAt extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ SimpleImageUrl A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ 0sP A07;
    public final /* synthetic */ YCQ A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59215JAt(Modifier modifier, SimpleImageUrl simpleImageUrl, String str, 0sP r5, YCQ ycq, int i, int i2, int i3, long j, boolean z) {
        super(2);
        this.A04 = modifier;
        this.A05 = simpleImageUrl;
        this.A02 = i;
        this.A03 = j;
        this.A06 = str;
        this.A08 = ycq;
        this.A09 = z;
        this.A07 = r5;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        Modifier modifier = this.A04;
        SimpleImageUrl simpleImageUrl = this.A05;
        int i = this.A02;
        long j = this.A03;
        I7C.A06(A0R, modifier, simpleImageUrl, this.A06, this.A07, this.A08, i, C51966G9m.A01(this.A00), this.A01, j, this.A09);
        return C60340gF.A00;
    }
}
