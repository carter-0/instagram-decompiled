package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.3B1  reason: invalid class name */
public abstract class AnonymousClass3B1 {
    public static final void A00(Context context, RecyclerView recyclerView, UserSession userSession) {
        int dimensionPixelSize;
        int i;
        AnonymousClass3B3 r1;
        recyclerView.setBackgroundColor(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_background)));
        if (1NN.A00(1NM.A00(userSession))) {
            r1 = new C60458Jlq(context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material));
        } else {
            1NN A00 = 1NM.A00(userSession);
            Resources resources = context.getResources();
            AnonymousClass0eM r12 = A00.A02;
            Object value = r12.getValue();
            0qQ.A07(value);
            if (((Boolean) value).booleanValue()) {
                i = R.dimen.abc_action_bar_elevation_material;
            } else {
                Object value2 = r12.getValue();
                0qQ.A07(value2);
                if (((Boolean) value2).booleanValue()) {
                    i = R.dimen.annotation_hidden_location_pill_nub_padding;
                } else {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
                    r1 = new AnonymousClass3B2(dimensionPixelSize);
                }
            }
            dimensionPixelSize = resources.getDimensionPixelSize(i);
            r1 = new AnonymousClass3B2(dimensionPixelSize);
        }
        recyclerView.A11(r1);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        linearLayoutManager.A0v(true);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
