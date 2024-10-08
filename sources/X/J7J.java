package X;

import android.graphics.Bitmap;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

public final class J7J extends 0Yg implements 0sL {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J7J(Object obj, float f, int i, int i2) {
        super(2);
        this.A01 = i2;
        this.A00 = f;
        this.A03 = obj;
        this.A02 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A01;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                I53.A01(A0R, (Modifier) this.A03, this.A00, C51966G9m.A01(this.A02));
                break;
            case 1:
                C56357Hx8.A00((Bitmap) this.A03, A0R, this.A00, C51966G9m.A01(this.A02));
                break;
            default:
                C56357Hx8.A01(A0R, (ImageUrl) this.A03, this.A00, C51966G9m.A01(this.A02));
                break;
        }
        return C60340gF.A00;
    }
}
