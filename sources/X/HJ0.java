package X;

import com.instagram.api.schemas.ClipChainType;
import com.instagram.music.common.model.AudioType;

public final class HJ0 extends HQA {
    public final ClipChainType A00;
    public final AudioType A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HJ0) {
                HJ0 hj0 = (HJ0) obj;
                if (!0qQ.A0K(this.A02, hj0.A02) || this.A01 != hj0.A01 || !0qQ.A0K(this.A05, hj0.A05) || !0qQ.A0K(this.A03, hj0.A03) || !0qQ.A0K(this.A04, hj0.A04) || this.A00 != hj0.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0O(this.A02))) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public HJ0(ClipChainType clipChainType, AudioType audioType, String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1U(str, audioType, str2);
        this.A02 = str;
        this.A01 = audioType;
        this.A05 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = clipChainType;
    }
}
