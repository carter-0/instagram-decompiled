package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Nc  reason: invalid class name and case insensitive filesystem */
public final class C354718Nc implements AnonymousClass0eK {
    public final /* synthetic */ AnonymousClass8ME A00;

    public C354718Nc(AnonymousClass8ME r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        AnonymousClass8ME r5 = this.A00;
        View view = r5.A0h;
        UserSession userSession = r5.A0r;
        String moduleName = r5.A0o.getModuleName();
        return new C40021AOd(view, userSession, r5.A0s, r5.A1B, r5, moduleName);
    }
}
