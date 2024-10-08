package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8C7  reason: invalid class name */
public final class AnonymousClass8C7 implements C336227eH {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass8C7(UserSession userSession, String str, boolean z) {
        this.A00 = userSession;
        this.A01 = str;
        this.A02 = z;
    }

    public final 1OC AMt(String str) {
        return FGQ.A05(this.A00, "users/search/", str, this.A01, (String) null, (String) null, (String) null, false, false, false, false, this.A02);
    }
}
