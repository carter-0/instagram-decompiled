package X;

import com.instagram.music.common.model.AudioType;

public final class H30 extends HPF {
    public final AudioType A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof H30) && this.A00 == ((H30) obj).A00);
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public H30(AudioType audioType) {
        this.A00 = audioType;
    }
}
