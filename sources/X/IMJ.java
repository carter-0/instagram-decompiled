package X;

import android.content.Context;
import com.instagram.api.schemas.ClipChainType;
import com.instagram.common.session.UserSession;

public final class IMJ implements C270754hF {
    public ClipChainType A00;
    public final String A01;

    public final 1OC BCc(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        ClipChainType clipChainType = this.A00;
        String str = this.A01;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("clips/audio_page_chain_clips/");
        A0a.A9m("current_clip_chain_type", clipChainType.A00);
        G9w.A1I(A0a, "music_canonical_id", str, (String) null);
        C51972G9s.A18(A0a, userSession, AnonymousClass93W.class);
        return A0a.A0M();
    }

    public final 1OC C42(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        ClipChainType clipChainType = this.A00;
        String str2 = this.A01;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("clips/audio_page_chain_clips/");
        A0a.A9m("current_clip_chain_type", clipChainType.A00);
        G9w.A1I(A0a, "music_canonical_id", str2, str);
        C51972G9s.A18(A0a, userSession, AnonymousClass93W.class);
        return A0a.A0M();
    }

    public final /* synthetic */ void ES0(GEP gep) {
    }

    public final /* synthetic */ void ESn(Context context) {
    }

    public final /* synthetic */ void EiB(String str) {
    }

    public final /* synthetic */ void Elk(C290515fR r1) {
    }

    public IMJ(ClipChainType clipChainType, String str) {
        this.A01 = str;
        this.A00 = clipChainType;
    }

    public final /* synthetic */ boolean CTp(boolean z) {
        return false;
    }
}
