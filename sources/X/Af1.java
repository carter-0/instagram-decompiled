package X;

import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.List;

public final class Af1 implements C349337zz {
    public int A00;
    public AnonymousClass9SE A01;
    public MusicOverlayStickerModel A02;
    public C40599Aen A03;
    public AnonymousClass6KJ A04;

    public final void Edm(MusicOverlayStickerModel musicOverlayStickerModel) {
        0qQ.A0B(musicOverlayStickerModel, 0);
        this.A02 = musicOverlayStickerModel;
    }

    public final C19498Wak A00() {
        AnonymousClass9SE r1 = this.A01;
        if (r1 != null) {
            return new C19498Wak(r1);
        }
        0qQ.A0F("musicAssetLyrics");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ List B5h() {
        return 0sn.A00;
    }

    public final MusicOverlayStickerModel BUu() {
        MusicOverlayStickerModel musicOverlayStickerModel = this.A02;
        if (musicOverlayStickerModel != null) {
            return musicOverlayStickerModel;
        }
        0qQ.A0F("musicOverlayStickerModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final AnonymousClass6KJ BV4() {
        AnonymousClass6KJ r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("musicStickerDisplayType");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C273914nO BkW() {
        C273914nO r1 = new C273914nO();
        r1.A01 = C273924nP.ANIMATED_STICKERS;
        r1.A06 = AnonymousClass7TE.A1I(BV4().A01());
        return r1;
    }

    public final int BzW() {
        return this.A00;
    }

    public final Integer CAk() {
        return AnonymousClass05K.A0A;
    }

    public Af1(AnonymousClass9SE r1, MusicOverlayStickerModel musicOverlayStickerModel, C40599Aen aen, AnonymousClass6KJ r4, int i) {
        AnonymousClass7TG.A1O(r4, musicOverlayStickerModel);
        this.A04 = r4;
        this.A02 = musicOverlayStickerModel;
        this.A01 = r1;
        this.A00 = i;
        this.A03 = aen;
    }

    public Af1() {
    }
}
