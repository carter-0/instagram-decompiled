package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.30v  reason: invalid class name and case insensitive filesystem */
public final class C2356930v implements AnonymousClass0eK {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;

    public C2356930v(Fragment fragment, AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = fragment;
        this.A02 = userSession;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        Fragment fragment = this.A00;
        UserSession userSession = this.A02;
        AnonymousClass0iw r2 = this.A01;
        if ((fragment instanceof AnonymousClass4DH) || (fragment instanceof AnonymousClass32G)) {
            return C229382nI.A02(fragment, r2, userSession, (2el) null);
        }
        throw new IllegalArgumentException("fragment type not supported");
    }
}
