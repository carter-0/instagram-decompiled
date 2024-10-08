package X;

import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.AeO  reason: case insensitive filesystem */
public final class C40576AeO implements AnonymousClass85q {
    public final /* synthetic */ MusicOverlayStickerModel A00;

    public final void Edn(int i) {
    }

    public C40576AeO(MusicOverlayStickerModel musicOverlayStickerModel) {
        this.A00 = musicOverlayStickerModel;
    }

    public final int BV1() {
        Integer num = this.A00.A0O;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue > 60000) {
                return 60000;
            }
            return intValue;
        }
        throw AnonymousClass7TE.A0y();
    }
}
