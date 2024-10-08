package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6Os  reason: invalid class name and case insensitive filesystem */
public final class C307076Os implements C316076l4, C309476Yk, C309486Yl {
    public C309426Yf A00;
    public final LinearLayout A01;
    public final C252063oV A02;
    public final C252063oV A03;
    public final C252063oV A04;
    public final C316146lB A05;
    public final C307126Ox A06;
    public final C307136Oy A07;
    public final AnonymousClass6P8 A08;
    public final C307146Oz A09;
    public final C307086Ot A0A;
    public final AnonymousClass0eM A0B = AnonymousClass0eN.A01(new AnonymousClass9L1(this, 3));
    public final AnonymousClass0eM A0C = AnonymousClass0eN.A01(new AnonymousClass9L1(this, 4));
    public final AnonymousClass0eM A0D = AnonymousClass0eN.A01(new AnonymousClass9L1(this, 5));

    public C307076Os(LinearLayout linearLayout, UserSession userSession) {
        int i;
        0qQ.A0B(linearLayout, 1);
        this.A01 = linearLayout;
        this.A03 = 2b1.A01(linearLayout.requireViewById(R.id.toolbar_reshare_button_stub), false, false);
        this.A02 = 2b1.A01(linearLayout.requireViewById(R.id.toolbar_like_button_stub), false, false);
        this.A04 = 2b1.A01(linearLayout.requireViewById(R.id.toolbar_save_button_stub), false, false);
        View requireViewById = linearLayout.requireViewById(R.id.cta_button_container);
        0qQ.A07(requireViewById);
        this.A05 = new C316146lB(requireViewById, userSession);
        this.A0A = new C307086Ot(userSession, 2b1.A01(linearLayout.requireViewById(R.id.reel_swipe_up_guidance_stub), false, false));
        View requireViewById2 = linearLayout.requireViewById(R.id.reel_bottom_ad_banner_stub);
        0qQ.A07(requireViewById2);
        this.A06 = new C307126Ox((ViewStub) requireViewById2);
        View requireViewById3 = linearLayout.requireViewById(R.id.reel_item_action_button_container);
        0qQ.A07(requireViewById3);
        this.A07 = new C307136Oy(requireViewById3, userSession);
        View requireViewById4 = linearLayout.requireViewById(R.id.toolbar_more_info_container);
        0qQ.A07(requireViewById4);
        this.A09 = new C307146Oz(requireViewById4);
        Context context = linearLayout.getContext();
        0qQ.A07(context);
        if (!C316216lI.A0B(context)) {
            i = R.id.delayed_skip_ad_short_device_stub;
        } else {
            boolean A062 = 182.A06(0Tu.A06, userSession, 36324840528425375L);
            i = R.id.delayed_skip_ad_timer_stub;
            if (A062) {
                i = R.id.delayed_skip_ad_timer_redesign_stub;
            }
        }
        this.A08 = new AnonymousClass6P8(context, 2b1.A01(linearLayout.requireViewById(i), false, false));
    }

    public final C305966Kg AYM() {
        AnonymousClass0eM r2 = this.A0B;
        ((C305966Kg) r2.getValue()).A00 = this.A00;
        return (C305966Kg) r2.getValue();
    }

    public final C74500Pvu AjF() {
        AnonymousClass0eM r2 = this.A0D;
        ((C74500Pvu) r2.getValue()).Ehz(this.A00);
        return (C74500Pvu) r2.getValue();
    }

    public final C305946Ke C3Z() {
        AnonymousClass0eM r2 = this.A0C;
        ((C305946Ke) r2.getValue()).A00 = this.A00;
        return (C305946Ke) r2.getValue();
    }
}
