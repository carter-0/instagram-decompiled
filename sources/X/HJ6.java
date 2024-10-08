package X;

import com.instagram.clips.audio.model.AudioPageAssetModel;

public final class HJ6 extends HQB {
    public final AudioPageAssetModel A00;
    public final boolean A01;
    public final String A02;

    public HJ6(AudioPageAssetModel audioPageAssetModel, String str, boolean z) {
        0qQ.A0B(str, 2);
        this.A01 = z;
        this.A02 = str;
        this.A00 = audioPageAssetModel;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HJ6) {
                HJ6 hj6 = (HJ6) obj;
                if (this.A01 != hj6.A01 || !0qQ.A0K(this.A02, hj6.A02) || !0qQ.A0K(this.A00, hj6.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A08(this.A02, C51965G9l.A05(this.A01)));
    }
}
