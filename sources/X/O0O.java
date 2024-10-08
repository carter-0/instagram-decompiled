package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public abstract class O0O {
    public static final void A00(UserSession userSession, OEF oef) {
        Context context;
        TextView textView;
        0qQ.A0B(oef, 0);
        if (oef.A00 == null) {
            View inflate = oef.A02.inflate();
            C66580MXl.A1R(inflate);
            ViewGroup viewGroup = (ViewGroup) inflate;
            oef.A00 = viewGroup;
            if (viewGroup != null) {
                textView = DbU.A0G(viewGroup, R.id.direct_story_reply_original_media_attribution_text);
            } else {
                textView = null;
            }
            oef.A01 = textView;
        }
        ViewGroup viewGroup2 = oef.A00;
        if (viewGroup2 != null && (context = viewGroup2.getContext()) != null) {
            TextView textView2 = oef.A01;
            if (textView2 != null) {
                textView2.setText(C250563lf.A0F(context, userSession, 2131959797));
            }
            ViewGroup viewGroup3 = oef.A00;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(0);
            }
        }
    }
}
