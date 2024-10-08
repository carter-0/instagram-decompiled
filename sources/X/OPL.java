package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public abstract class OPL {
    public static final void A00(Context context, View view, FragmentActivity fragmentActivity, AnonymousClass0iw r18, UserSession userSession, C314466iJ r20, 2Er r21, boolean z) {
        String str;
        View view2 = view;
        View findViewById = view2.findViewById(R.id.nux_banner);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            findViewById.setVisibility(8);
            TextView A0d = AnonymousClass7TE.A0d(findViewById, R.id.title);
            int i = 2131957201;
            boolean z2 = z;
            if (z) {
                i = 2131957202;
            }
            Context context2 = context;
            C66581MXm.A15(context, A0d, i);
            C51967G9n.A0x(findViewById, R.id.message, 8);
            View findViewById2 = findViewById.findViewById(R.id.action_button_container);
            TextView A0d2 = AnonymousClass7TE.A0d(findViewById, R.id.left_button);
            C66581MXm.A15(context, A0d2, 2131957198);
            A0d2.setTextAppearance(context, R.style.IgPrimaryButton);
            A0d2.setBackgroundResource(R.drawable.primary_button_selector_panavision_soft_update);
            A0d2.setTypeface((Typeface) null, 1);
            AnonymousClass0iw r8 = r18;
            UserSession userSession2 = userSession;
            2Er r11 = r21;
            AnonymousClass0fU.A00(new C71373OjW(0, view, fragmentActivity, r18, userSession, r20, r21, z), A0d2);
            TextView textView = (TextView) findViewById.findViewById(R.id.right_button);
            C66581MXm.A15(context2, textView, 2131957199);
            AnonymousClass0fU.A00(new FOZ(context2, view2, fragmentActivity, r8, userSession2, r20, r11, 0, z2), textView);
            findViewById2.setVisibility(0);
            findViewById.setVisibility(0);
            String C6C = r11.C6C();
            if (z) {
                str = "thread_ctd_upsell_single_create_messaging_ads_banner_impression";
            } else {
                str = "thread_ctd_upsell_second_banner_impression";
            }
            C48805EkT.A00(r8, userSession2, str, C6C);
        }
    }

    public static final void A01(View view, C314466iJ r2) {
        View findViewById = view.findViewById(R.id.nux_banner);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            C48827Ekp.A00(findViewById);
            r2.DUr();
        }
    }
}
