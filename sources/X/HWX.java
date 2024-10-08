package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

public abstract class HWX {
    public static final void A00(Context context, C334367b9 r6, IgLinearLayout igLinearLayout, CharSequence charSequence, Integer num) {
        ComposerAutoCompleteTextView Ae1;
        boolean A1Y = C51970G9q.A1Y(igLinearLayout);
        igLinearLayout.setVisibility(8);
        igLinearLayout.setOnTouchListener(C56808IDf.A00);
        View A0G = AnonymousClass7TF.A0G(igLinearLayout, R.id.carousel_comment_tooltip_banner);
        ImageView A0J = DbX.A0J(A0G, R.id.banner_icon);
        if (num == null) {
            A0J.setVisibility(8);
        } else {
            A0J.setVisibility(A1Y ? 1 : 0);
            DbU.A13(context, A0J, num.intValue());
        }
        AnonymousClass7TG.A0R(A0G, R.id.banner_body).setText(charSequence);
        ID2.A02(AnonymousClass7TF.A0G(A0G, R.id.banner_close), 3, igLinearLayout, context);
        if (r6 != null && (Ae1 = r6.Ae1()) != null) {
            Ae1.A04 = new C57418IaO(igLinearLayout);
        }
    }
}
