package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

public final class JCS extends 0Yg implements 0sL {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ Alignment A05;
    public final /* synthetic */ Modifier A06;
    public final /* synthetic */ C288195bW A07;
    public final /* synthetic */ C288095bM A08;
    public final /* synthetic */ ImageUrl A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ C62320sa A0B;
    public final /* synthetic */ C62320sa A0C;
    public final /* synthetic */ C62320sa A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JCS(Alignment alignment, Modifier modifier, C288195bW r4, C288095bM r5, ImageUrl imageUrl, String str, C62320sa r8, C62320sa r9, C62320sa r10, float f, int i, int i2, int i3, long j) {
        super(2);
        this.A09 = imageUrl;
        this.A0A = str;
        this.A06 = modifier;
        this.A0C = r8;
        this.A0D = r9;
        this.A0B = r10;
        this.A05 = alignment;
        this.A08 = r5;
        this.A00 = f;
        this.A07 = r4;
        this.A04 = j;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        ImageUrl imageUrl = this.A09;
        String str = this.A0A;
        Modifier modifier = this.A06;
        C62320sa r11 = this.A0C;
        C62320sa r12 = this.A0D;
        C62320sa r13 = this.A0B;
        Alignment alignment = this.A05;
        C288095bM r8 = this.A08;
        float f = this.A00;
        C288195bW r7 = this.A07;
        long j = this.A04;
        C304096Cd.A01(A0R, alignment, modifier, r7, r8, imageUrl, str, r11, r12, r13, f, C51966G9m.A01(this.A01), C301445zH.A00(this.A02), this.A03, j);
        return C60340gF.A00;
    }
}
