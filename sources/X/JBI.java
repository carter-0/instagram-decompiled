package X;

import android.graphics.Bitmap;
import com.instagram.common.typedurl.ImageUrl;

public final class JBI extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final String A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JBI(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, String str, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A08 = obj;
        this.A09 = str;
        this.A02 = obj2;
        this.A06 = obj3;
        this.A07 = obj4;
        this.A05 = obj5;
        this.A04 = obj6;
        this.A03 = obj7;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A00 != 0) {
            C286575Wy A0R = C51966G9m.A0R(obj, obj2);
            String str = this.A09;
            AnonymousClass5S2 r3 = (AnonymousClass5S2) this.A04;
            C56267Hvb.A00((Bitmap) this.A03, A0R, r3, (ImageUrl) this.A02, str, (C62320sa) this.A06, (C62320sa) this.A08, (C62320sa) this.A05, (C62320sa) this.A07, C51966G9m.A01(this.A01));
        } else {
            C56647I6c.A02(C51966G9m.A0R(obj, obj2), (C61040Jve) this.A08, (LRW) this.A02, this.A09, (C62320sa) this.A05, (C62320sa) this.A03, (0sP) this.A06, (0sP) this.A07, (0sL) this.A04, C51966G9m.A01(this.A01));
        }
        return C60340gF.A00;
    }
}
