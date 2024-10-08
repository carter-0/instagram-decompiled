package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.9H6  reason: invalid class name */
public final class AnonymousClass9H6 {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final Capabilities A02;
    public final Integer A03;
    public final boolean A04;

    public static final FragmentActivity A00(AnonymousClass9H6 r0) {
        return r0.A00.requireActivity();
    }

    public AnonymousClass9H6(AnonymousClass4DH r1, UserSession userSession, Capabilities capabilities, Integer num, boolean z) {
        this.A00 = r1;
        this.A01 = userSession;
        this.A02 = capabilities;
        this.A03 = num;
        this.A04 = z;
    }
}
