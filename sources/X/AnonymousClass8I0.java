package X;

import android.content.res.Resources;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.8I0  reason: invalid class name */
public final class AnonymousClass8I0 {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass4DH A03;
    public final UserSession A04;
    public final AnonymousClass8E7 A05;

    public AnonymousClass8I0(Resources resources, AnonymousClass4DH r3, UserSession userSession, AnonymousClass8E7 r5) {
        this.A03 = r3;
        this.A04 = userSession;
        this.A05 = r5;
        this.A02 = resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        this.A01 = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
    }
}
