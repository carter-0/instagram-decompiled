package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.zero.cms.ZeroCmsTextView;

public abstract class ORY {
    public static void A00(UserSession userSession, C2813757h r9) {
        UserSession userSession2 = userSession;
        boolean z = !C238173Av.A01(userSession, 1Au.A00(userSession));
        TextView textView = r9.A04;
        if (textView != null) {
            int i = 2131977000;
            if (z) {
                i = 2131977001;
            }
            textView.setText(i);
        }
        LinearLayout linearLayout = r9.A03;
        C71406Ok5.A00(linearLayout, 18, userSession);
        ZeroCmsTextView zeroCmsTextView = r9.A06;
        if (zeroCmsTextView != null) {
            zeroCmsTextView.A00 = 2b4.A00(userSession);
            String str = zeroCmsTextView.A01;
            if (str != null) {
                zeroCmsTextView.setText(str, zeroCmsTextView.getText().toString());
            }
        }
        AnonymousClass1Nd.A00(userSession).A01(r9.A05, C71909Osr.class);
        if (C238173Av.A02(userSession, C273654mx.A00(2815))) {
            Context context = linearLayout.getContext();
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                String str2 = AnonymousClass1Qz.A00(userSession).C82().A06;
                if (TextUtils.isEmpty(str2)) {
                    str2 = activity.getString(2131976988);
                }
                String A0h = DbW.A0h(activity, str2, 2131977005);
                1Av A00 = 1Au.A00(userSession);
                if (A00.A01.getInt("zero_rating_video_setting_banner_tooltip", 0) < 1) {
                    linearLayout.postDelayed(new C73396Pbt(activity, linearLayout, userSession2, A00, A0h), 1000);
                }
            }
        }
    }

    public static void A01(UserSession userSession, C2813757h r3) {
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        AnonymousClass1Nd.A00(userSession).A02(r3.A05, C71909Osr.class);
    }
}
