package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.75l  reason: invalid class name and case insensitive filesystem */
public final class C3261175l {
    public boolean A00;
    public final FragmentActivity A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final View A04;
    public final 0wc A05;
    public final C252063oV A06;

    public C3261175l(View view, FragmentActivity fragmentActivity, AnonymousClass0iw r5, UserSession userSession) {
        0qQ.A0B(r5, 4);
        this.A01 = fragmentActivity;
        this.A03 = userSession;
        this.A02 = r5;
        this.A06 = 2b1.A01(view.requireViewById(R.id.direct_thread_business_chat_action_bar), false, false);
        View requireViewById = view.requireViewById(R.id.direct_thread_content_below_action_bar);
        0qQ.A07(requireViewById);
        this.A04 = requireViewById;
        this.A05 = AnonymousClass0kN.A01(r5, userSession);
    }

    public final void A02(AnonymousClass2Ep r14) {
        UserSession userSession = this.A03;
        if (!C3261275m.A00(userSession, r14, true)) {
            this.A06.setVisibility(8);
            return;
        }
        C252063oV r8 = this.A06;
        if (r8.CFV() != 0) {
            r8.setVisibility(0);
            View view = this.A04;
            View view2 = r8.getView();
            view2.measure(-2, -2);
            int measuredHeight = view2.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + measuredHeight, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            view.setLayoutParams(marginLayoutParams);
        }
        if (!this.A00) {
            View view3 = r8.getView();
            User BZK = r14.BZK();
            if (BZK != null) {
                C69460Nm4 nm4 = C69460Nm4.VIEW_PROFILE;
                String str = userSession.A06;
                String id = BZK.getId();
                View requireViewById = view3.requireViewById(R.id.view_profile_button);
                0qQ.A07(requireViewById);
                AnonymousClass0fU.A00(new C71357OjC(nm4, this, BZK, str, id), requireViewById);
                A01(nm4, str, id);
            }
            String BZP = r14.BZP();
            if (BZP != null) {
                C69460Nm4 nm42 = C69460Nm4.APPOINTMENT_REQUEST;
                String str2 = userSession.A06;
                View requireViewById2 = view3.requireViewById(R.id.inquire_button);
                0qQ.A07(requireViewById2);
                AnonymousClass0fU.A00(new C71347Oix(nm42, this, str2, BZP), requireViewById2);
                A01(nm42, str2, BZP);
            }
            this.A00 = true;
        }
    }

    public static final void A00(C69460Nm4 nm4, C3261175l r4, String str, String str2) {
        0wc r2 = r4.A05;
        0Aj A002 = r2.A00(r2.A00, "p2b_diff_ig_consumer_actions_click");
        if (A002.isSampled()) {
            A002.A9F("user_igid", Long.valueOf(Long.parseLong(str)));
            A002.A9F("business_igid", Long.valueOf(Long.parseLong(str2)));
            A002.A8M(C391459t7.A02, "entrypoint");
            A002.A8M(nm4, "action_type");
            A002.Cgf();
        }
    }

    private final void A01(C69460Nm4 nm4, String str, String str2) {
        0wc r2 = this.A05;
        0Aj A002 = r2.A00(r2.A00, "p2b_diff_ig_consumer_actions_impression");
        if (A002.isSampled()) {
            A002.A9F("user_igid", Long.valueOf(Long.parseLong(str)));
            A002.A9F("business_igid", Long.valueOf(Long.parseLong(str2)));
            A002.A8M(C391459t7.A02, "entrypoint");
            A002.A8M(nm4, "action_type");
            A002.Cgf();
        }
    }
}
