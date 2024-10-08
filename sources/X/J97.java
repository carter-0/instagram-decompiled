package X;

import androidx.compose.ui.Modifier;

public final class J97 extends 0Yg implements 0sL {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final Object A05;
    public final Object A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J97(Object obj, Object obj2, float f, int i, int i2, int i3, long j) {
        super(2);
        this.A01 = i3;
        this.A06 = obj;
        this.A00 = f;
        this.A04 = j;
        this.A05 = obj2;
        this.A02 = i;
        this.A03 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A01;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        if (i != 0) {
            C56224Hur.A01(A0R, (Modifier) this.A06, (AnonymousClass62P) this.A05, this.A00, C51966G9m.A01(this.A02), this.A03, this.A04);
        } else {
            C56224Hur.A00(A0R, (Modifier) this.A05, (AnonymousClass62P) this.A06, this.A00, C51966G9m.A01(this.A02), this.A03, this.A04);
        }
        return C60340gF.A00;
    }
}
