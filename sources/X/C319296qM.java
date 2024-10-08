package X;

import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;

/* renamed from: X.6qM  reason: invalid class name and case insensitive filesystem */
public final class C319296qM extends C48197Ead {
    public final AvatarCoinFlipConfig A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C319296qM(AvatarCoinFlipConfig avatarCoinFlipConfig, String str, String str2, boolean z) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = avatarCoinFlipConfig;
        this.A02 = str2;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C319296qM) {
                C319296qM r5 = (C319296qM) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A01.hashCode() * 31;
        AvatarCoinFlipConfig avatarCoinFlipConfig = this.A00;
        if (avatarCoinFlipConfig == null) {
            hashCode = 0;
        } else {
            hashCode = avatarCoinFlipConfig.hashCode();
        }
        int hashCode3 = (((hashCode2 + hashCode) * 31) + this.A02.hashCode()) * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return hashCode3 + i;
    }
}
