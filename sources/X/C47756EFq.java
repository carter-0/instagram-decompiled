package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.EFq  reason: case insensitive filesystem */
public final class C47756EFq extends C232222tE {
    public final UserSession A00;

    public C47756EFq(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r2, C249703kE r3) {
        C46908DnO dnO = (C46908DnO) r3;
        0qQ.A0B(dnO, 1);
        dnO.A00.A02();
    }

    public final Class modelClass() {
        return EGT.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int A1Z = AnonymousClass7TG.A1Z(viewGroup, layoutInflater);
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 2);
        View inflate = layoutInflater.inflate(R.layout.active_now_tray_shimmer_placeholder, viewGroup, false);
        0qQ.A0C(inflate, Pxd.A00(4));
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate;
        boolean A06 = 182.A06(0Tu.A05, userSession, 36314794596305705L);
        int i = R.dimen.abc_list_item_height_large_material;
        int i2 = R.layout.active_now_tray_user_item_shimmer;
        if (A06) {
            i = R.dimen.active_now_with_status_item_width;
            i2 = R.layout.active_now_tray_with_status_user_item_shimmer;
        }
        LinearLayout linearLayout = (LinearLayout) shimmerFrameLayout.requireViewById(R.id.container);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        Context A0S = AnonymousClass7TE.A0S(viewGroup);
        int ceil = (int) ((float) Math.ceil((double) (((float) 0nA.A09(A0S)) / DbU.A00(A0S, i))));
        int i3 = 1;
        if (A1Z <= ceil) {
            while (true) {
                linearLayout.addView(layoutInflater.inflate(i2, linearLayout, false));
                if (i3 == ceil) {
                    break;
                }
                i3++;
            }
        }
        return new C46908DnO(shimmerFrameLayout);
    }
}
