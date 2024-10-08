package X;

import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.avatars.common.AvatarInfo;
import java.util.UUID;

/* renamed from: X.73C  reason: invalid class name */
public final class AnonymousClass73C {
    public boolean A00;
    public AvatarCoinFlipConfig A01;
    public boolean A02;
    public final 02m A03;
    public final String A04;

    public final void A02(AvatarCoinFlipConfig avatarCoinFlipConfig, String str, boolean z) {
        this.A01 = avatarCoinFlipConfig;
        if (!this.A00) {
            02m r3 = this.A03;
            r3.markerStart(129898941);
            r3.markerAnnotate(129898941, "surface", "COIN_FLIP");
            r3.markerAnnotate(129898941, "avatar_session_id", this.A04);
            r3.markerAnnotate(129898941, "is_auto_swivel", z);
            r3.markerAnnotate(129898941, "coin_flip_surface", str);
            this.A00 = true;
        }
        if (this.A02) {
            A01();
        }
    }

    public final void A00() {
        if (this.A00) {
            AvatarCoinFlipConfig avatarCoinFlipConfig = this.A01;
            if (avatarCoinFlipConfig != null) {
                this.A03.markerAnnotate(129898941, "sticker_pack_id", avatarCoinFlipConfig.A07);
            }
            this.A03.markerEnd(129898941, 4);
            this.A00 = false;
        }
    }

    public final void A01() {
        String str;
        String str2;
        String str3;
        String str4;
        AvatarInfo avatarInfo;
        AvatarInfo avatarInfo2;
        AvatarInfo avatarInfo3;
        AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse;
        if (this.A00) {
            02m r4 = this.A03;
            AvatarCoinFlipConfig avatarCoinFlipConfig = this.A01;
            String str5 = null;
            if (avatarCoinFlipConfig != null) {
                str = avatarCoinFlipConfig.A07;
            } else {
                str = null;
            }
            r4.markerAnnotate(129898941, "sticker_pack_id", str);
            AvatarCoinFlipConfig avatarCoinFlipConfig2 = this.A01;
            if (avatarCoinFlipConfig2 == null || (avatarCoinFlipBackgroundOptionResponse = avatarCoinFlipConfig2.A04) == null) {
                str2 = null;
            } else {
                str2 = avatarCoinFlipBackgroundOptionResponse.A02;
            }
            r4.markerAnnotate(129898941, "background_id", str2);
            AvatarCoinFlipConfig avatarCoinFlipConfig3 = this.A01;
            if (avatarCoinFlipConfig3 == null || (avatarInfo3 = avatarCoinFlipConfig3.A01) == null) {
                str3 = null;
            } else {
                str3 = avatarInfo3.A01;
            }
            r4.markerAnnotate(129898941, "avatar_revision_id", str3);
            AvatarCoinFlipConfig avatarCoinFlipConfig4 = this.A01;
            if (avatarCoinFlipConfig4 == null || (avatarInfo2 = avatarCoinFlipConfig4.A01) == null) {
                str4 = null;
            } else {
                str4 = avatarInfo2.A02;
            }
            r4.markerAnnotate(129898941, "avatar_style_id", str4);
            AvatarCoinFlipConfig avatarCoinFlipConfig5 = this.A01;
            if (!(avatarCoinFlipConfig5 == null || (avatarInfo = avatarCoinFlipConfig5.A01) == null)) {
                str5 = avatarInfo.A00;
            }
            r4.markerAnnotate(129898941, "avatar_id", str5);
            r4.markerEnd(129898941, 2);
            this.A00 = false;
        }
        this.A02 = true;
    }

    public AnonymousClass73C(02m r2) {
        this.A03 = r2;
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        this.A04 = obj;
    }
}
