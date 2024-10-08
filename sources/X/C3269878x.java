package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.78x  reason: invalid class name and case insensitive filesystem */
public final class C3269878x {
    public static final C3269878x A00 = new Object();

    public final void A00(Context context, View view, UserSession userSession, AnonymousClass7L0 r16, 2Er r17) {
        View findViewById;
        0qQ.A0B(view, 4);
        2Er r10 = r17;
        if (r17 != null && r10.C6C() != null && (findViewById = view.findViewById(R.id.nux_banner)) != null) {
            boolean z = true;
            if (!AnonymousClass48O.A02(r10.C6a())) {
                z = false;
            }
            UserSession userSession2 = userSession;
            boolean A0j = 00p.A0j(r10.AsX(), userSession.A06, false);
            if (!z || !A0j || !182.A06(0Tu.A05, userSession, 36328542786633124L)) {
                findViewById.setVisibility(8);
                return;
            }
            findViewById.setVisibility(0);
            View findViewById2 = view.findViewById(R.id.nux_banner);
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
            }
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.pills_container);
            viewGroup.removeAllViewsInLayout();
            C69872Nta.A00(context, viewGroup, userSession2, r16, r10, 0sr.A1P(new C69251NiD[]{C69251NiD.A0F, C69251NiD.A0G, C69251NiD.A0C, C69251NiD.A06, C69251NiD.A0I, C69251NiD.A0H, C69251NiD.A08}));
            ((TextView) view.findViewById(R.id.title)).setText(context.getString(2131974619));
        }
    }
}
