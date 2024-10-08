package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

public final class J7K extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J7K(long j, Object obj, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A03 = obj;
        this.A02 = j;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        Object obj3 = this.A03;
        if (i != 0) {
            C56616I4r.A00(A0R, (Modifier) obj3, C51966G9m.A01(this.A01), this.A02);
        } else {
            C56223Huq.A01(A0R, (ImageUrl) obj3, C51966G9m.A01(this.A01), this.A02);
        }
        return C60340gF.A00;
    }
}
