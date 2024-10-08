package X;

import com.instagram.clips.audio.model.AudioPageAssetModel;
import com.instagram.music.common.config.MusicAttributionConfig;

public final class HJ5 extends HQB {
    public final AudioPageAssetModel A00;
    public final MusicAttributionConfig A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HJ5) {
                HJ5 hj5 = (HJ5) obj;
                if (!0qQ.A0K(this.A01, hj5.A01) || !0qQ.A0K(this.A00, hj5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public HJ5(AudioPageAssetModel audioPageAssetModel, MusicAttributionConfig musicAttributionConfig) {
        this.A01 = musicAttributionConfig;
        this.A00 = audioPageAssetModel;
    }
}
