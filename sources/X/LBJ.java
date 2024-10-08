package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

public final class LBJ {
    public final Context A00;
    public final View A01;
    public final C62666KkS A02;
    public final UserSession A03;
    public final IgSimpleImageView A04;
    public final IgSimpleImageView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public LBJ(Context context, View view, C62666KkS kkS, UserSession userSession, String str, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TG.A1O(view, userSession);
        0qQ.A0B(str, 5);
        this.A01 = view;
        this.A03 = userSession;
        this.A00 = context;
        this.A0A = z;
        this.A08 = str;
        this.A09 = z2;
        this.A02 = kkS;
        this.A0B = z3;
        this.A07 = DbX.A0Z(view, R.id.sell_product_title_label);
        this.A06 = DbX.A0Z(view, R.id.sell_product_input_summary);
        this.A04 = DbX.A0Y(view, R.id.chevron_icon);
        this.A05 = DbX.A0Y(view, R.id.remove_icon);
        this.A0C = 182.A06(0Tu.A05, userSession, 36317358692242511L);
    }
}
