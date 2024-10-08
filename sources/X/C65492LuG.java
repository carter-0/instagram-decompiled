package X;

import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.LuG  reason: case insensitive filesystem */
public final class C65492LuG implements C2606146j {
    public final String A00;
    public final /* synthetic */ MusicOverlayStickerModel A01;

    public C65492LuG(MusicOverlayStickerModel musicOverlayStickerModel) {
        this.A01 = musicOverlayStickerModel;
        this.A00 = musicOverlayStickerModel.A0j;
    }

    public final boolean Esc() {
        return this.A01.A0t;
    }

    public final String getShouldMuteAudioReason() {
        return this.A00;
    }
}
