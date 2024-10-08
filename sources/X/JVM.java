package X;

import com.instagram.music.common.model.MusicAssetModel;

public final class JVM extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final MusicAssetModel A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JVM) {
                JVM jvm = (JVM) obj;
                if (this.A01 != jvm.A01 || this.A00 != jvm.A00 || !0qQ.A0K(this.A02, jvm.A02) || !0qQ.A0K(this.A03, jvm.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, ((this.A01 * 31) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A03);
    }

    public JVM(MusicAssetModel musicAssetModel, String str, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = musicAssetModel;
        this.A03 = str;
    }
}
