package X;

import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.util.Map;

/* renamed from: X.P1p  reason: case insensitive filesystem */
public final class C72324P1p implements C74389Pu5 {
    public final /* synthetic */ OHJ A00;

    public C72324P1p(OHJ ohj) {
        this.A00 = ohj;
    }

    public final AnonymousClass7L0 AuX() {
        return this.A00.A03.A0A;
    }

    public final void DCY() {
        C70983OUx oUx = this.A00.A03.A0J.A00.A00;
        if (oUx != null) {
            O6V o6v = oUx.A00.A07;
            o6v.getClass();
            C68464NJc nJc = o6v.A00;
            0s1 A0C = DbW.A0C(nJc);
            A0C.A0I((String) null);
            UserSession A0J = JTS.A0J(nJc.A0G);
            AnonymousClass80X r9 = AnonymousClass80X.UNINITIALIZED;
            String A0j = AnonymousClass7TG.A0j();
            MusicProduct musicProduct = MusicProduct.MUSIC_STICKER_SEND;
            ImmutableList of = ImmutableList.of(AudioTrackType.ORIGINAL, AudioTrackType.REACTIVE);
            0qQ.A07(of);
            A0C.A0A(LJS.A01((C3515589i) null, of, musicProduct, A0J, (MusicOverlaySearchTab) null, r9, A0j, (Map) null), R.id.fragment_container);
            A0C.A00();
        }
    }
}
