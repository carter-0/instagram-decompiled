package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.UEl  reason: case insensitive filesystem */
public class C14906UEl extends C249703kE implements AnonymousClass2xU {
    public C52435GSn A00;
    public final Context A01;
    public final View A02;
    public final RelativeLayout A03;
    public final TextView A04;
    public final TextView A05;
    public final IgFrameLayout A06;
    public final IgFrameLayout A07;
    public final IgFrameLayout A08;
    public final IgFrameLayout A09;
    public final IgLinearLayout A0A;
    public final IgTextView A0B;
    public final IgView A0C;
    public final IgView A0D;
    public final IgImageView A0E;
    public final C14332TuD A0F;
    public final IgImageButton A0G;
    public final Activity A0H;
    public final ViewGroup A0I;
    public final UserSession A0J;
    public final IgImageView A0K;

    public void DQp(AnonymousClass3W1 r5, int i) {
        C14332TuD tuD;
        0qQ.A0B(r5, 0);
        if (this.A00 == null || i != 5) {
            if (i == 50) {
                if (this instanceof C15943UlD) {
                    tuD = ((C15943UlD) this).A01;
                } else {
                    tuD = this.A0F;
                }
                if (tuD != null) {
                    tuD.DQp(r5, i);
                }
            }
        } else if (this.A06.getVisibility() == 0 && r5.A29) {
            C51972G9s.A0I(this.A0D).withEndAction(new C20020Wjg(this)).setDuration(200);
            this.A07.animate().alpha(1.0f).withEndAction(new C20021Wjh(this)).setDuration(200);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14906UEl(Activity activity, Context context, View view, UserSession userSession) {
        super(view);
        C14332TuD tuD;
        AnonymousClass7TG.A1Q(context, userSession);
        this.A02 = view;
        this.A01 = context;
        this.A0J = userSession;
        this.A0H = activity;
        this.A0G = (IgImageButton) AnonymousClass7TE.A0b(view, R.id.image_button);
        this.A03 = (RelativeLayout) AnonymousClass7TE.A0b(view, R.id.ad_overlay);
        this.A0C = (IgView) AnonymousClass7TE.A0b(view, R.id.top_legibility_gradient);
        this.A09 = (IgFrameLayout) AnonymousClass7TE.A0b(view, R.id.more_button_click_area);
        this.A0K = JTR.A0i(view, R.id.more_button);
        this.A0E = JTR.A0i(view, R.id.carousel_icon);
        this.A0I = (ViewGroup) AnonymousClass7TE.A0b(view, R.id.handle_sponsored_pill_container);
        this.A08 = (IgFrameLayout) AnonymousClass7TE.A0b(view, R.id.handle_sponsored_pill_click_area);
        this.A0A = (IgLinearLayout) AnonymousClass7TE.A0b(view, R.id.handle_sponsored_pill);
        this.A04 = DbW.A0B(view, R.id.handle_pill);
        this.A05 = DbW.A0B(view, R.id.label_pill);
        this.A0D = (IgView) AnonymousClass7TE.A0b(view, R.id.legibility_gradient_bottom);
        this.A0B = Dba.A0E(view, R.id.ad_cta_text_banner);
        this.A06 = (IgFrameLayout) AnonymousClass7TE.A0b(view, R.id.cta_button_banner);
        this.A07 = (IgFrameLayout) AnonymousClass7TE.A0b(view, R.id.cta_button_banner_color_fill);
        if (view instanceof ViewGroup) {
            tuD = new C14332TuD(activity, context, (ViewGroup) view, userSession);
        } else {
            tuD = null;
        }
        this.A0F = tuD;
    }
}
