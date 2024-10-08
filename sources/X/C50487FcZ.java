package X;

import com.instagram.api.schemas.ACRType;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.FcZ  reason: case insensitive filesystem */
public final class C50487FcZ implements C367608rH {
    public final /* synthetic */ 28D A00;
    public final /* synthetic */ ACRType A01;
    public final /* synthetic */ C255773uh A02;
    public final /* synthetic */ AnonymousClass6Z5 A03;

    public C50487FcZ(28D r1, ACRType aCRType, C255773uh r3, AnonymousClass6Z5 r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = aCRType;
    }

    public final void onClick() {
        MusicOverlayStickerModel A04;
        AnonymousClass6Z5 r4 = this.A03;
        C255773uh r3 = this.A02;
        28D r2 = this.A00;
        ACRType aCRType = this.A01;
        if (r3.A1J()) {
            A04 = null;
        } else {
            A04 = C271404in.A04(r3);
        }
        AnonymousClass6Z5.A02(r2, aCRType, r3, A04, r4);
    }
}
