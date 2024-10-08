package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.direct.view.ReshareTogglePickerView;

/* renamed from: X.AXe  reason: case insensitive filesystem */
public final class C40240AXe implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "DirectViewReshareTogglePickerController";
    public ReshareTogglePickerView A00;
    public Integer A01;
    public final UserSession A02;
    public final Context A03;

    public final String getModuleName() {
        return "direct_view_reshare_toggle_picker";
    }

    public C40240AXe(Context context, UserSession userSession, ReshareTogglePickerView reshareTogglePickerView, Integer num) {
        this.A03 = context;
        this.A02 = userSession;
        this.A00 = reshareTogglePickerView;
        this.A01 = num;
        reshareTogglePickerView.getLayoutParams().height = context.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
        AOX.A00(this.A00, 5, this);
        this.A00.A00(this.A01);
    }
}
