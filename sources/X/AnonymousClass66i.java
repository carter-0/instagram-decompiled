package X;

import com.facebook.msys.mci.AccountSession;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.66i  reason: invalid class name */
public final class AnonymousClass66i implements 0lm {
    public AccountSession A00;
    public C74333Pt9 A01;
    public final Set A02 = new LinkedHashSet();

    public final void onUserSessionWillEnd(boolean z) {
        MYY.A01("AccountSessionInvalidator.onUserSessionWillEnd").execute(new C73224PZ2(this, z));
    }
}
