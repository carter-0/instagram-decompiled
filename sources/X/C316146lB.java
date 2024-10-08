package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6lB  reason: invalid class name and case insensitive filesystem */
public final class C316146lB {
    public boolean A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final TextView A07;
    public final TextView A08;
    public final UserSession A09;
    public final C252063oV A0A;
    public final C252063oV A0B;
    public final C252063oV A0C;
    public final C252063oV A0D;
    public final C252063oV A0E;

    public final void A00() {
        CharSequence text = this.A08.getText();
        if (text != null && text.length() != 0) {
            View view = this.A04;
            view.setAlpha(1.0f);
            view.setTranslationY(0.0f);
            view.setVisibility(0);
            this.A01.setAlpha(1.0f);
            this.A02.setAlpha(0.0f);
        }
    }

    public C316146lB(View view, UserSession userSession) {
        this.A04 = view;
        this.A09 = userSession;
        View requireViewById = view.requireViewById(R.id.cta_button);
        0qQ.A07(requireViewById);
        this.A01 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.cta_button_text_container);
        0qQ.A07(requireViewById2);
        this.A05 = requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.cta_button_text);
        0qQ.A07(requireViewById3);
        this.A08 = (TextView) requireViewById3;
        this.A0C = 2b1.A01(view.requireViewById(R.id.cta_button_secondary_text_divider), false, false);
        this.A0B = 2b1.A01(view.requireViewById(R.id.cta_button_secondary_text), false, false);
        View requireViewById4 = view.requireViewById(R.id.cta_button_post_dwell);
        0qQ.A07(requireViewById4);
        this.A02 = requireViewById4;
        View requireViewById5 = view.requireViewById(R.id.cta_button_text_container_post_dwell);
        0qQ.A07(requireViewById5);
        this.A06 = requireViewById5;
        View requireViewById6 = view.requireViewById(R.id.cta_button_post_dwell_text);
        0qQ.A07(requireViewById6);
        this.A07 = (TextView) requireViewById6;
        this.A0D = 2b1.A01(view.requireViewById(R.id.cta_button_secondary_text_divider_post_dwell), false, false);
        this.A0E = 2b1.A01(view.requireViewById(R.id.cta_button_secondary_text_post_dwell), false, false);
        View requireViewById7 = view.requireViewById(R.id.cta_chevron);
        0qQ.A07(requireViewById7);
        this.A03 = requireViewById7;
        this.A0A = 2b1.A01(view.requireViewById(R.id.cta_button_icon_stub), !1NM.A00(userSession).A01(), false);
    }
}
