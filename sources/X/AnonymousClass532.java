package X;

import android.content.Context;
import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import java.util.List;

/* renamed from: X.532  reason: invalid class name */
public final class AnonymousClass532 extends AnonymousClass2ge {
    public final Context A00;
    public final UserSession A01;
    public final 1Xj A02;
    public final Integer A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass532(Context context, UserSession userSession, 1Xj r4, Integer num, String str) {
        super(context);
        0qQ.A0B(str, 2);
        this.A01 = userSession;
        this.A04 = str;
        this.A00 = context;
        this.A02 = r4;
        this.A03 = num;
    }

    public final void A00() {
        C67231sQ r4;
        CreativeConfigIntf AsO;
        List B02;
        EffectPreviewIntf effectPreviewIntf;
        String effectId;
        int intValue = this.A03.intValue();
        if (intValue == 0) {
            MusicPageTabType musicPageTabType = MusicPageTabType.CLIPS;
            1Xj r0 = this.A02;
            if (r0 != null) {
                r4 = r0.A0C.getClipsMetadata();
            } else {
                r4 = null;
            }
            UserSession userSession = this.A01;
            String str = this.A04;
            0qQ.A0B(userSession, 2);
            0qQ.A0B(str, 3);
            GLB.A00(musicPageTabType, userSession).A01(r4, userSession, "on_touch_down", str);
        } else if (intValue == 1) {
            1Xj r02 = this.A02;
            if (r02 != null && (AsO = r02.A0C.AsO()) != null && (B02 = AsO.B02()) != null && (effectPreviewIntf = (EffectPreviewIntf) 00k.A0O(B02, 0)) != null && (effectId = effectPreviewIntf.getEffectId()) != null) {
                UserSession userSession2 = this.A01;
                GGQ.A00(userSession2).A00(userSession2, "on_touch_down", effectId, this.A04);
            }
        } else {
            throw new RuntimeException();
        }
    }
}
