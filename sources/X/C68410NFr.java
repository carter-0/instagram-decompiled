package X;

import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.direct.armadilloexpress.transportpayload.Thumbnail;

/* renamed from: X.NFr  reason: case insensitive filesystem */
public final class C68410NFr extends R4O implements C13662TeT {
    public C68410NFr() {
        super(Thumbnail.DEFAULT_INSTANCE);
    }

    public final void A06(int i) {
        Thumbnail thumbnail = (Thumbnail) C66580MXl.A0L(this);
        thumbnail.bitField0_ |= 2;
        thumbnail.height_ = i;
    }

    public final void A07(int i) {
        Thumbnail thumbnail = (Thumbnail) C66580MXl.A0L(this);
        thumbnail.bitField0_ |= 4;
        thumbnail.width_ = i;
    }

    public final void A08(CommonMediaTransport commonMediaTransport) {
        Thumbnail thumbnail = (Thumbnail) C66580MXl.A0L(this);
        thumbnail.mediaTransport_ = commonMediaTransport;
        thumbnail.bitField0_ |= 1;
    }
}
