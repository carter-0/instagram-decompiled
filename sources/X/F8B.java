package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

public abstract class F8B {
    public static final View A00(ViewGroup viewGroup) {
        View A09 = DbU.A09(DbV.A0D(viewGroup), viewGroup, R.layout.selectable_user_row, false);
        A09.setTag(new C46974DoS(A09));
        return A09;
    }

    public static final void A01(Context context, AnonymousClass0iw r13, G82 g82, C46974DoS doS, F06 f06, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(doS, 0);
        F06 f062 = f06;
        AnonymousClass7TF.A1B(f062, 1, g82);
        AnonymousClass0iw r7 = r13;
        0qQ.A0B(r13, 7);
        if (z2 && context != null) {
            F03 f03 = doS.A02;
            DbT.A1B(context.getResources(), f03.A00.getLayoutParams(), R.dimen.action_button_min_width);
            GradientSpinnerAvatarView gradientSpinnerAvatarView = f03.A01;
            DbT.A1B(context.getResources(), gradientSpinnerAvatarView.getLayoutParams(), R.dimen.action_button_settings_height);
            gradientSpinnerAvatarView.getLayoutParams().width = AnonymousClass7TF.A02(context, R.dimen.action_button_settings_height);
            gradientSpinnerAvatarView.A0B(AnonymousClass7TF.A02(context, R.dimen.action_button_settings_height), 0);
            gradientSpinnerAvatarView.A06();
        }
        F03 f032 = doS.A02;
        User user = f062.A01;
        C49181Eqm.A00(r7, user.Bh3(), f032, f062.A02, f062.A03, f062.A04, user.isVerified());
        if (z3) {
            f062.A00 = true;
        }
        ((CompoundButton) doS.A01.A01()).setChecked(f062.A00);
        ViewGroup viewGroup = f032.A00;
        FPH.A00(viewGroup, g82, f062, doS, 67);
        C71662eb r0 = doS.A00;
        View A01 = r0.A01();
        if (z) {
            A01.setVisibility(0);
            FP7.A00(r0.A01(), 23, g82, f062);
        } else {
            A01.setVisibility(8);
        }
        float f = 0.3f;
        if (g82.CbR(user)) {
            f = 1.0f;
        }
        viewGroup.setAlpha(f);
    }
}
