package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.widget.pdp.cta.CustomCTAButton;

/* renamed from: X.UiJ  reason: case insensitive filesystem */
public final class C15774UiJ extends C232222tE {
    public final UserSession A00;
    public final C18020Vjw A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i;
        0qQ.A0B(viewGroup, 0);
        boolean A06 = 182.A06(0Tu.A06, this.A00, 36313501811214368L);
        LayoutInflater from = LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup));
        if (A06) {
            i = R.layout.cta_section_swap_experiment;
        } else {
            i = R.layout.cta_section;
        }
        View A09 = DbU.A09(from, viewGroup, i, false);
        Object A0U = C13988Tno.A0U(A09, new UDV(A09));
        0qQ.A0C(A0U, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.cta.CheckoutCTASectionViewBinder.Holder");
        return (C249703kE) A0U;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r16, C249703kE r17) {
        WSB wsb = (WSB) r16;
        UDV udv = (UDV) r17;
        boolean A1Z = AnonymousClass7TG.A1Z(wsb, udv);
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 2);
        C15024UKd uKd = wsb.A00;
        C15030UKj uKj = uKd.A00;
        boolean z = uKd.A05;
        CustomCTAButton customCTAButton = udv.A02;
        customCTAButton.setLoading(uKj.A07);
        customCTAButton.setEnabled(uKj.A06);
        String str = uKj.A02;
        customCTAButton.setText(str);
        View view = udv.A00;
        C13989Tnp.A0z(view.getContext(), customCTAButton, str, 2131954409);
        customCTAButton.setStyle(uKj.A01);
        0nA.A0T(view, AnonymousClass7TE.A0B(view.getResources()));
        if (182.A06(0Tu.A05, userSession, 36314871905651563L)) {
            C238833Dp.A00(userSession).A05(customCTAButton, C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON);
        }
        AnonymousClass0fU.A00(new C244023aW(userSession, (String) null, C58506It1.A00, new C20705Wxc(uKj, 37), z), customCTAButton);
        C15030UKj uKj2 = uKd.A01;
        CustomCTAButton customCTAButton2 = udv.A03;
        if (uKj2 == null) {
            AnonymousClass7TH.A0R(customCTAButton2);
        } else if (customCTAButton2 != null) {
            customCTAButton2.setVisibility(0);
            customCTAButton2.setStyle(uKj2.A01);
            0nA.A0e(customCTAButton2, uKj2.A00);
            customCTAButton2.setText(uKj2.A02);
            customCTAButton2.setEnabled(uKj2.A06);
            WBC.A00(customCTAButton2, 35, uKj2);
        } else {
            throw AnonymousClass7TE.A0y();
        }
        TextView textView = udv.A01;
        if (textView != null) {
            CharSequence charSequence = uKd.A02;
            if (charSequence != null || (uKd.A07 && (charSequence = textView.getContext().getString(2131968771)) != null)) {
                textView.setVisibility(0);
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
            }
        }
        C18020Vjw vjw = this.A01;
        String str2 = uKj.A03;
        boolean A1S = DbW.A1S(A1Z ? 1 : 0, customCTAButton, str2);
        2el r4 = vjw.A02;
        C229932oe r1 = vjw.A03;
        C13988Tno.A14(customCTAButton, r4, r1, str2);
        if (uKj2 != null) {
            0qQ.A0A(customCTAButton2);
            String str3 = uKj2.A03;
            0qQ.A0B(customCTAButton2, A1S ? 1 : 0);
            0qQ.A0B(str3, A1Z);
            C13988Tno.A14(customCTAButton2, r4, r1, str3);
        }
    }

    public final Class modelClass() {
        return WSB.class;
    }

    public C15774UiJ(UserSession userSession, C18020Vjw vjw) {
        this.A00 = userSession;
        this.A01 = vjw;
    }
}
