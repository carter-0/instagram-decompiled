package X;

import com.instagram.direct.armadilloexpress.transportpayload.AvatarSticker;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;

/* renamed from: X.NFt  reason: case insensitive filesystem */
public final class C68412NFt extends R4O implements C13662TeT {
    public C68412NFt() {
        super(AvatarSticker.DEFAULT_INSTANCE);
    }

    public final void A06(CommonMediaTransport commonMediaTransport) {
        AvatarSticker avatarSticker = (AvatarSticker) C66580MXl.A0L(this);
        commonMediaTransport.getClass();
        avatarSticker.mediaTransport_ = commonMediaTransport;
        avatarSticker.bitField0_ |= 1;
    }

    public final void A07(String str) {
        AvatarSticker avatarSticker = (AvatarSticker) C66580MXl.A0L(this);
        str.getClass();
        avatarSticker.bitField0_ |= 4;
        avatarSticker.stickerId_ = str;
    }

    public final void A08(String str) {
        AvatarSticker avatarSticker = (AvatarSticker) C66580MXl.A0L(this);
        str.getClass();
        avatarSticker.bitField0_ |= 8;
        avatarSticker.stickerTemplate_ = str;
    }

    public final void A09(boolean z) {
        AvatarSticker avatarSticker = (AvatarSticker) C66580MXl.A0L(this);
        avatarSticker.bitField0_ |= 2;
        avatarSticker.isAnimated_ = z;
    }
}
