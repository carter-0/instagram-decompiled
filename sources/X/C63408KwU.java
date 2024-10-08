package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.KwU  reason: case insensitive filesystem */
public abstract class C63408KwU {
    public static final void A00(View view, AnonymousClass0iw r4, UserSession userSession, Reel reel, C230242pG r7, boolean z) {
        ImageUrl A06;
        float f;
        ImageUrl A062;
        IgImageView A0i = JTR.A0i(view, R.id.memory_badge_first_card);
        List A0O = reel.A0O(userSession);
        0qQ.A07(A0O);
        C255773uh r0 = (C255773uh) 00k.A0J(A0O);
        if (!(r0 == null || (A062 = r0.A06()) == null)) {
            A0i.setUrl(A062, r4);
        }
        IgImageView A0i2 = JTR.A0i(view, R.id.memory_badge_second_card);
        C255773uh r02 = (C255773uh) 00k.A0O(A0O, 1);
        if (r02 == null || (A06 = r02.A06()) == null) {
            A0i2.setVisibility(8);
        } else {
            A0i2.setUrl(A06, r4);
            if (z) {
                Context A0S = AnonymousClass7TE.A0S(A0i2);
                A0i2.setTranslationX(0nA.A00(A0S, -5.0f));
                A0i2.setTranslationY(0nA.A00(A0S, -4.0f));
                f = -7.0f;
            } else {
                f = 0.0f;
                A0i2.setTranslationX(0.0f);
                A0i2.setTranslationY(0.0f);
            }
            A0i2.setRotation(f);
        }
        C64273LXz.A00(view, 37, r7);
    }
}
