package X;

import android.graphics.Bitmap;
import androidx.compose.ui.Modifier;

public final class J9B extends 0Yg implements 0sL {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J9B(Object obj, Object obj2, Object obj3, float f, int i, int i2, int i3) {
        super(2);
        this.A01 = i3;
        this.A04 = obj;
        this.A05 = obj2;
        this.A00 = f;
        this.A06 = obj3;
        this.A02 = i;
        this.A03 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A01) {
            case 0:
                I6K.A03(C51966G9m.A0R(obj, obj2), (Modifier) this.A05, (C59478JLc) this.A04, (0sL) this.A06, this.A00, C51966G9m.A01(this.A02), this.A03);
                break;
            case 1:
                C289555dn.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A06, (C289545dm) this.A04, (C289485df) this.A05, this.A00, C51966G9m.A01(this.A02), this.A03);
                break;
            default:
                C54906HXo.A00((Bitmap) this.A04, C51966G9m.A0R(obj, obj2), (AnonymousClass5S2) this.A05, (C62320sa) this.A06, this.A00, C51966G9m.A01(this.A02), this.A03);
                break;
        }
        return C60340gF.A00;
    }
}
