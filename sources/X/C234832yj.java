package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.2yj  reason: invalid class name and case insensitive filesystem */
public final class C234832yj {
    public int A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final UserSession A09;
    public final AnonymousClass4DU A0A;
    public final 1sy A0B;
    public final 0Pl A0C;
    public final HashMap A0D = new HashMap();
    public final boolean A0E;
    public final int A0F;

    public static void A00(Layout layout, C234832yj r4) {
        int lineBottom;
        if (r4.A00 == 0) {
            if (layout.getLineCount() == 1) {
                lineBottom = layout.getLineBottom(0);
            } else if (layout.getLineCount() > 1) {
                lineBottom = layout.getLineBottom(0) - r4.A0F;
            } else {
                return;
            }
            r4.A00 = lineBottom;
        }
    }

    public C234832yj(Context context, UserSession userSession, AnonymousClass4DU r6, 1sy r7, 0Pl r8) {
        this.A08 = context;
        this.A0C = r8;
        this.A0B = r7;
        this.A0E = AnonymousClass1A9.A00();
        this.A06 = context.getResources().getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height);
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding);
        this.A07 = context.getResources().getDimensionPixelSize(R.dimen.audience_selector_pill_layout_height);
        this.A04 = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        Resources resources = context.getResources();
        0qQ.A0B(resources, 0);
        this.A0F = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        Resources resources2 = context.getResources();
        0qQ.A0B(resources2, 0);
        this.A05 = resources2.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A01 = (float) 0nA.A09(context);
        this.A0A = r6;
        this.A09 = userSession;
    }
}
