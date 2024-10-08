package X;

import android.content.Context;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.Vjd  reason: case insensitive filesystem */
public abstract class C18001Vjd {
    public final float A00;
    public final C18604Vux A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public final ExtendedImageUrl A00(Context context) {
        C18604Vux vux = this.A01;
        if (vux == null) {
            return null;
        }
        ExtendedImageUrl extendedImageUrl = vux.A00;
        if (extendedImageUrl != null) {
            return extendedImageUrl;
        }
        ExtendedImageUrl extendedImageUrl2 = (ExtendedImageUrl) vux.A02.invoke(context);
        vux.A00 = extendedImageUrl2;
        return extendedImageUrl2;
    }

    public final String A01() {
        if (this instanceof C16275Urc) {
            return ((C16275Urc) this).A02;
        }
        if (this instanceof C16274Urb) {
            return ((C16274Urb) this).A02;
        }
        if (this instanceof C16271UrY) {
            return ((C16271UrY) this).A01;
        }
        if (this instanceof C16273Ura) {
            return ((C16273Ura) this).A01;
        }
        if (this instanceof C16272UrZ) {
            return ((C16272UrZ) this).A02;
        }
        if (this instanceof C16276Urd) {
            return ((C16276Urd) this).A02;
        }
        return this.A04;
    }

    public C18001Vjd(C18604Vux vux, Integer num, String str, String str2, float f) {
        this.A04 = str;
        this.A02 = num;
        this.A03 = str2;
        this.A00 = f;
        this.A01 = vux;
    }
}
