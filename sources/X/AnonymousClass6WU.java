package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.List;

/* renamed from: X.6WU  reason: invalid class name */
public abstract class AnonymousClass6WU {
    public static final void A00(UserSession userSession, C255773uh r14, C316876mM r15) {
        C255783ui r3;
        List Bkd = r14.Bkd(AnonymousClass3WT.MUSIC_OVERLAY);
        C316876mM r4 = r15;
        if (!(Bkd == null || (r3 = (C255783ui) 00k.A0J(Bkd)) == null || !0qQ.A0K(r3.A1g, AnonymousClass6KJ.MUSIC_VINYL.A02))) {
            UserSession userSession2 = userSession;
            if (182.A06(0Tu.A05, userSession, 36325201302663892L)) {
                MusicOverlayStickerModel musicOverlayStickerModel = r3.A0u;
                if (musicOverlayStickerModel != null) {
                    float A00 = r14.A00();
                    if (r15.A00 == null) {
                        View inflate = r15.A01.inflate();
                        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgSimpleImageView");
                        r15.A00 = (IgSimpleImageView) inflate;
                    }
                    Context context = r15.A01.getContext();
                    0qQ.A07(context);
                    AnonymousClass9Wo r5 = new AnonymousClass9Wo(context, userSession2, musicOverlayStickerModel.A04, AnonymousClass05K.A00, "", "", 0.0f, -1, false, true);
                    IgSimpleImageView igSimpleImageView = r4.A00;
                    if (igSimpleImageView != null) {
                        igSimpleImageView.setImageDrawable(r5);
                    }
                    IgSimpleImageView igSimpleImageView2 = r4.A00;
                    if (igSimpleImageView2 != null) {
                        igSimpleImageView2.setVisibility(0);
                    }
                    IgSimpleImageView igSimpleImageView3 = r4.A00;
                    if (igSimpleImageView3 != null) {
                        0nA.A0q(igSimpleImageView3, new C41181Apf(r3, r4, A00));
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
        IgSimpleImageView igSimpleImageView4 = r15.A00;
        if (igSimpleImageView4 != null) {
            igSimpleImageView4.setVisibility(8);
        }
    }
}
