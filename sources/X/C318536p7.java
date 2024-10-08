package X;

import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;

/* renamed from: X.6p7  reason: invalid class name and case insensitive filesystem */
public final class C318536p7 extends C48196Eac {
    public final AvatarCoinFlipConfig A00;
    public final String A01 = "";
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C318536p7) {
                C318536p7 r5 = (C318536p7) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        AvatarCoinFlipConfig avatarCoinFlipConfig = this.A00;
        return ((hashCode + (avatarCoinFlipConfig == null ? 0 : avatarCoinFlipConfig.hashCode())) * 31) + this.A02.hashCode();
    }

    public C318536p7(AvatarCoinFlipConfig avatarCoinFlipConfig, String str) {
        this.A00 = avatarCoinFlipConfig;
        this.A02 = str;
    }
}
