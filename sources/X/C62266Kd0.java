package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kd0  reason: case insensitive filesystem */
public final class C62266Kd0 extends C64856LjI {
    public final ViewGroup A00;
    public final C339317jP A01 = new Object();
    public final C339317jP A02 = new Object();

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.7jP] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.7jP] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62266Kd0(View view, AnonymousClass4DH r9, UserSession userSession, C313666go r11) {
        super(view, r9, userSession, r11, R.layout.iglive_broadcaster_buttons_container);
        0qQ.A0B(userSession, 2);
        this.A00 = DbX.A0I(view, R.id.iglive_reactions_layout);
    }

    public final void A04(Fragment fragment) {
        C62414KfP kfP;
        super.A04(fragment);
        C60255JiC jiC = (C60255JiC) this.A0I.getValue();
        if ((jiC instanceof C62414KfP) && (kfP = (C62414KfP) jiC) != null) {
            DbZ.A1C(fragment, MHB.A01(this, (AnonymousClass4D7) null, 16), kfP.A04);
        }
    }
}
