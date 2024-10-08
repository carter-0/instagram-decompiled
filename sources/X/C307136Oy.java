package X;

import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6Oy  reason: invalid class name and case insensitive filesystem */
public final class C307136Oy {
    public int A00;
    public int A01;
    public TransitionDrawable A02;
    public final long A03;
    public final View A04;
    public final C252063oV A05;
    public final boolean A06;

    public final void A00() {
        ((TextView) this.A05.getView()).setTextColor(this.A01);
        TransitionDrawable transitionDrawable = this.A02;
        if (transitionDrawable != null) {
            transitionDrawable.resetTransition();
        }
    }

    public C307136Oy(View view, UserSession userSession) {
        this.A04 = view;
        0Tu r2 = 0Tu.A05;
        this.A06 = 182.A06(r2, userSession, 36317813958317623L);
        this.A03 = 182.A01(r2, userSession, 36599288935091680L);
        this.A05 = 2b1.A01(view.requireViewById(R.id.reel_item_action_button_stub), false, false);
        Context context = view.getContext();
        this.A01 = context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text_on_media));
        this.A00 = context.getColor(2Yu.A0H(context, R.attr.igds_color_text_on_white));
    }
}
