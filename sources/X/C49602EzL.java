package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EzL  reason: case insensitive filesystem */
public final class C49602EzL {
    public boolean A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final ES8 A03;

    public C49602EzL(UserSession userSession, ES8 es8) {
        this.A03 = es8;
        this.A01 = es8.requireActivity();
        this.A02 = userSession;
    }
}
