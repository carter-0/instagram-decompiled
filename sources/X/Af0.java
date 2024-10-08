package X;

import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.List;

public final class Af0 implements C349337zz {
    public int A00;
    public MusicOverlayStickerModel A01;
    public C40599Aen A02;
    public AnonymousClass6KJ A03;
    public boolean A04;

    public final void Edm(MusicOverlayStickerModel musicOverlayStickerModel) {
        0qQ.A0B(musicOverlayStickerModel, 0);
        this.A01 = musicOverlayStickerModel;
    }

    public final /* synthetic */ List B5h() {
        return 0sn.A00;
    }

    public final MusicOverlayStickerModel BUu() {
        MusicOverlayStickerModel musicOverlayStickerModel = this.A01;
        if (musicOverlayStickerModel != null) {
            return musicOverlayStickerModel;
        }
        0qQ.A0F("musicOverlayStickerModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final AnonymousClass6KJ BV4() {
        return this.A03;
    }

    public final C273914nO BkW() {
        C273914nO r3;
        List A1I;
        if (this.A04) {
            r3 = new C273914nO();
            r3.A01 = C273924nP.ANIMATED_STICKERS;
            AnonymousClass6KJ r0 = AnonymousClass6KJ.MUSIC_OVERLAY_SIMPLE;
            A1I = 0sr.A1P(new String[]{r0.A01(), r0.A01(), AnonymousClass6KJ.MUSIC_OVERLAY_ALBUM_ART.A01()});
        } else {
            r3 = new C273914nO();
            r3.A01 = C273924nP.ANIMATED_STICKERS;
            A1I = AnonymousClass7TE.A1I(this.A03.A01());
        }
        r3.A06 = A1I;
        return r3;
    }

    public final int BzW() {
        return this.A00;
    }

    public final Integer CAk() {
        return AnonymousClass05K.A0E;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Af0(MusicOverlayStickerModel musicOverlayStickerModel, C40599Aen aen, AnonymousClass6KJ r3, int i) {
        this();
        AnonymousClass7TG.A1O(r3, musicOverlayStickerModel);
        this.A03 = r3;
        this.A01 = musicOverlayStickerModel;
        this.A00 = i;
        this.A02 = aen;
    }

    public Af0() {
        this.A03 = AnonymousClass6KJ.UNKNOWN;
    }
}
