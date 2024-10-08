package X;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

public abstract class F5X {
    public static final void A00(LinearLayout linearLayout, UserSession userSession, IgImageView igImageView) {
        Context context;
        float A04;
        AnonymousClass7TF.A1B(linearLayout, 1, igImageView);
        if (182.A06(0Tu.A05, userSession, 36318234865506325L)) {
            linearLayout.setGravity(49);
            context = igImageView.getContext();
            0qQ.A07(context);
            A04 = 0nA.A04(context, 3);
        } else {
            linearLayout.setGravity(17);
            context = igImageView.getContext();
            0qQ.A07(context);
            A04 = 0nA.A04(context, 1);
        }
        igImageView.setPadding(AnonymousClass7TG.A04(context), (int) A04, 0, 0);
    }

    public static final void A01(TextView textView, UserSession userSession, IgImageView igImageView) {
        AnonymousClass7TF.A1B(textView, 1, igImageView);
        if (182.A06(0Tu.A05, userSession, 36318234865571862L)) {
            textView.setTypeface((Typeface) null, 1);
            Context A0S = AnonymousClass7TE.A0S(igImageView);
            igImageView.setPadding(AnonymousClass7TG.A04(A0S), DbS.A02(A0S, 4), 0, 0);
        }
    }
}
