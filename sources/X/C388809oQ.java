package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.9oQ  reason: invalid class name and case insensitive filesystem */
public final class C388809oQ extends AE5 {
    public ViewStub A00;
    public C70824OMw A01;
    public final Activity A02;
    public final Context A03;
    public final View A04;
    public final Animation A05;
    public final Animation A06;
    public final IE5 A07;
    public final UserSession A08;
    public final C262224Cq A09 = 19E.A02(AnonymousClass12T.A00.A04);
    public final boolean A0A;

    public C388809oQ(Activity activity, Context context, View view, UserSession userSession, boolean z) {
        super(context, view, userSession, z);
        this.A03 = context;
        this.A08 = userSession;
        this.A02 = activity;
        this.A04 = view;
        this.A0A = z;
        this.A05 = AnimationUtils.loadAnimation(context, R.anim.broadcast_chat_hide_cta_button_animation);
        this.A06 = AnimationUtils.loadAnimation(context, R.anim.broadcast_chat_show_disabled_composer_animation);
        this.A07 = new IE5(this, 2);
    }

    public final void A07(AnonymousClass7L0 r2) {
        super.A07(r2);
        C70824OMw oMw = this.A01;
        if (oMw == null) {
            0qQ.A0F("dailyPromptsPersistentBannerHelper");
            throw AnonymousClass00P.createAndThrow();
        } else {
            oMw.A00(r2);
        }
    }
}
