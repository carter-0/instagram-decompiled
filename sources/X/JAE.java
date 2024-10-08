package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

public final class JAE extends 0Yg implements 0sL {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Alignment A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ C288195bW A05;
    public final /* synthetic */ AnonymousClass2DO A06;
    public final /* synthetic */ C288095bM A07;
    public final /* synthetic */ String A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JAE(Alignment alignment, Modifier modifier, C288195bW r4, AnonymousClass2DO r5, C288095bM r6, String str, float f, int i, int i2) {
        super(2);
        this.A06 = r5;
        this.A08 = str;
        this.A04 = modifier;
        this.A03 = alignment;
        this.A07 = r6;
        this.A00 = f;
        this.A05 = r4;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        AnonymousClass2DO r5 = this.A06;
        String str = this.A08;
        Modifier modifier = this.A04;
        AnonymousClass6G3.A00(A0R, this.A03, modifier, this.A05, r5, this.A07, str, this.A00, C51966G9m.A01(this.A01), this.A02);
        return C60340gF.A00;
    }
}
