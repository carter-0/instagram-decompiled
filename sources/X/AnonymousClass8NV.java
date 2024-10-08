package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.8NV  reason: invalid class name */
public final class AnonymousClass8NV implements AnonymousClass0eK {
    public final /* synthetic */ AnonymousClass8ME A00;

    public AnonymousClass8NV(AnonymousClass8ME r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        AnonymousClass8ME r7 = this.A00;
        UserSession userSession = r7.A0r;
        FragmentActivity requireActivity = r7.A0l.requireActivity();
        String moduleName = r7.A0o.getModuleName();
        return new C65049LmT(requireActivity, r7.A0h, userSession, r7.A0s, r7.A0z, r7.A1B, r7, moduleName);
    }
}
