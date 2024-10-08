package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7eG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C336217eG implements C336227eH {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C336217eG(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }

    public final 1OC AMt(String str) {
        return FGQ.A04(this.A00, "users/search/", str, this.A01, (String) null);
    }
}
