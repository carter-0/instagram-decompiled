package X;

import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto;

/* renamed from: X.NFq  reason: case insensitive filesystem */
public final class C68409NFq extends R4O implements C13662TeT {
    public C68409NFq() {
        super(StaticPhoto.DEFAULT_INSTANCE);
    }

    public final void A06(int i) {
        StaticPhoto staticPhoto = (StaticPhoto) C66580MXl.A0L(this);
        int i2 = StaticPhoto.HEIGHT_FIELD_NUMBER;
        staticPhoto.bitField0_ |= 2;
        staticPhoto.height_ = i;
    }

    public final void A07(int i) {
        StaticPhoto staticPhoto = (StaticPhoto) C66580MXl.A0L(this);
        int i2 = StaticPhoto.HEIGHT_FIELD_NUMBER;
        staticPhoto.bitField0_ |= 4;
        staticPhoto.width_ = i;
    }

    public final void A08(CommonMediaTransport commonMediaTransport) {
        StaticPhoto staticPhoto = (StaticPhoto) C66580MXl.A0L(this);
        int i = StaticPhoto.HEIGHT_FIELD_NUMBER;
        commonMediaTransport.getClass();
        staticPhoto.mediaTransport_ = commonMediaTransport;
        staticPhoto.bitField0_ |= 1;
    }
}
