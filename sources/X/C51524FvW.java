package X;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.instagram.android.R;
import com.instagram.user.model.User;

/* renamed from: X.FvW  reason: case insensitive filesystem */
public final class C51524FvW implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View.OnClickListener A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C323606xm A03;

    public C51524FvW(Context context, View.OnClickListener onClickListener, View view, C323606xm r4) {
        this.A03 = r4;
        this.A02 = view;
        this.A00 = context;
        this.A01 = onClickListener;
    }

    public final void run() {
        User user;
        C323606xm r4 = this.A03;
        View view = this.A02;
        Context context = this.A00;
        View.OnClickListener onClickListener = this.A01;
        if (r4.A02 == C323616xn.TRIGGERED && (user = r4.A03) != null && r4.A03()) {
            View findViewById = view.findViewById(R.id.profile_upsell_container);
            0qQ.A0C(findViewById, AnonymousClass000.A00(0));
            findViewById.setOnClickListener((View.OnClickListener) null);
            DbX.A13(context, AnonymousClass7TE.A0d(findViewById, R.id.profile_upsell_header_text), user.B8Q(), 2131970078);
            if (user.A07() > 0) {
                AnonymousClass7TE.A0d(findViewById, R.id.profile_upsell_body_text).setText(2131970076);
            }
            findViewById.findViewById(R.id.profile_image_view).setUrl(user.Bh3(), r4.A05);
            FPH.A00(findViewById.findViewById(R.id.close_button_container), context, r4, view, 48);
            View findViewById2 = findViewById.findViewById(R.id.profile_upsell_follow_link);
            AnonymousClass0fU.A00(onClickListener, findViewById2);
            0qQ.A0A(findViewById2);
            DbT.A1G(findViewById2, r4.A06, user);
            if (findViewById.getVisibility() != 0) {
                Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.mention_conversion_popup_animation);
                0qQ.A07(loadAnimation);
                loadAnimation.setAnimationListener(new IE5(findViewById, 4));
                findViewById.setVisibility(0);
                findViewById.startAnimation(loadAnimation);
                1Av r0 = r4.A07;
                long currentTimeMillis = System.currentTimeMillis();
                0xY A0p = AnonymousClass7TE.A0p(r0);
                A0p.E5c("third_party_profile_upsell_last_seen_timestamp_ms", currentTimeMillis);
                A0p.apply();
                C323606xm.A00(r4, user, "impression_profile_upsell_banner", C273654mx.A00(900));
            }
            r4.A02 = C323616xn.SHOWING;
        }
    }
}
