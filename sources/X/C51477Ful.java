package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ful  reason: case insensitive filesystem */
public final class C51477Ful implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 1Av A01;
    public final /* synthetic */ C49593EzC A02;

    public C51477Ful(UserSession userSession, 1Av r2, C49593EzC ezC) {
        this.A01 = r2;
        this.A00 = userSession;
        this.A02 = ezC;
    }

    public final void run() {
        0xa r8 = this.A01.A01;
        if (r8.getBoolean("show_business_onboarding_check_list_tooltip", false)) {
            int i = 2131963060;
            if (2Ek.A01(DbT.A0j(this.A00))) {
                i = 2131963061;
            }
            View view = this.A02.A01;
            Context context = view.getContext();
            Activity activity = (Activity) 0mE.A00(context, Activity.class);
            if (activity != null) {
                int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material);
                AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(activity, i);
                A0e.A01();
                A0e.A04(view, 0, dimensionPixelOffset, true);
                DbU.A1T(A0e);
            }
            DbX.A1V(r8, "show_business_onboarding_check_list_tooltip", false);
        }
        this.A02.A00 = null;
    }
}
