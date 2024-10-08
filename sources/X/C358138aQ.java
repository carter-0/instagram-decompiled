package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.8aQ  reason: invalid class name and case insensitive filesystem */
public abstract class C358138aQ {
    public final C358148aR A00;
    public final C358128aP A01;
    public final 1Av A02;
    public final Activity A03;
    public final UserSession A04;

    public C358138aQ(Activity activity, AnonymousClass0iw r3, UserSession userSession, C358128aP r5) {
        0qQ.A0B(r3, 2);
        this.A04 = userSession;
        this.A03 = activity;
        this.A01 = r5;
        this.A02 = 1Au.A00(userSession);
        this.A00 = new C358148aR(r3, userSession);
    }

    public final void A00() {
        boolean A06 = 182.A06(0Tu.A05, this.A04, 36323547739598079L);
        Context context = this.A03;
        if (A06) {
            context = 2Yn.A01(context);
        }
        C358248ab r5 = new C358248ab(context);
        r5.A08 = true;
        C226462gr r2 = (C226462gr) r5.A0Q.getDrawable(R.drawable.ig_reels_cutout_sticker_cutout_sticker_icon_scissors_animation);
        IgdsHeadline igdsHeadline = r5.A0Z;
        0qQ.A0A(r2);
        igdsHeadline.setCircularImageDrawable(r2);
        igdsHeadline.setVisibility(0);
        r2.EFJ(Integer.MAX_VALUE);
        r5.A03 = r2;
        r5.A09(2131957319);
        r5.A08(2131957316);
        r5.A0I(new C39921AJn(this), 2131957318);
        r5.A0G(new C39922AJo(this), 2131957317);
        r5.A0s(true);
        r5.A0g(new AL4(this));
        r5.A0B(new C39909AJa(this));
        AnonymousClass0fN.A00(r5.A02());
    }
}
