package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;

public abstract class LEL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Context A03;
    public final View A04;
    public final View A05;
    public final ViewGroup A06;
    public final AnonymousClass0iw A07;
    public final 0wc A08;
    public final UserSession A09;
    public final 2Cn A0A;
    public final CirclePageIndicator A0B;
    public final boolean A0C;

    public final void A01() {
        View view = this.A05;
        int i = 4;
        if (view != null) {
            view.setVisibility(4);
        }
        CirclePageIndicator circlePageIndicator = this.A0B;
        if (circlePageIndicator != null) {
            circlePageIndicator.setVisibility(4);
        }
        View view2 = this.A04;
        if (view2 != null) {
            if (this.A0C) {
                i = 0;
            }
            view2.setVisibility(i);
        }
    }

    public LEL(Context context, ViewGroup viewGroup, AnonymousClass0iw r5, UserSession userSession, boolean z) {
        int i;
        this.A03 = context;
        this.A06 = viewGroup;
        this.A07 = r5;
        this.A09 = userSession;
        this.A0C = z;
        this.A08 = AnonymousClass0kN.A01(r5, userSession);
        this.A0B = (CirclePageIndicator) viewGroup.findViewById(R.id.page_indicator);
        View findViewById = viewGroup.findViewById(R.id.profile_share_card);
        this.A05 = findViewById;
        this.A04 = viewGroup.findViewById(R.id.background_image_view);
        int A042 = JTR.A04(context);
        this.A02 = A042;
        this.A01 = A042 * 2;
        if (findViewById != null) {
            i = findViewById.getHeight();
        } else {
            i = 0;
        }
        this.A00 = i;
        this.A0A = new KH1((Object) this, 2);
    }
}
