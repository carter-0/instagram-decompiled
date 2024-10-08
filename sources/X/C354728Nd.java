package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Nd  reason: invalid class name and case insensitive filesystem */
public final class C354728Nd implements AnonymousClass0eK {
    public final /* synthetic */ AnonymousClass8ME A00;

    public C354728Nd(AnonymousClass8ME r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        AnonymousClass8ME r5 = this.A00;
        FragmentActivity requireActivity = r5.A0l.requireActivity();
        UserSession userSession = r5.A0r;
        return new C65048LmS(requireActivity, r5.A0h, userSession, r5.A1B, r5, r5.A1m);
    }
}
