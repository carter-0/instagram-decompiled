package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IbH  reason: case insensitive filesystem */
public final class C57473IbH implements C74489Pvj {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ 0sP A02;

    public final /* synthetic */ void Cyb(boolean z) {
    }

    public final /* synthetic */ void De7() {
    }

    public final /* synthetic */ void DeA(String str) {
    }

    public final /* synthetic */ void Do0(String str, String str2, String str3) {
    }

    public C57473IbH(UserSession userSession, String str, 0sP r3) {
        this.A00 = userSession;
        this.A01 = str;
        this.A02 = r3;
    }

    public final void Do1(String str) {
        UserSession userSession = this.A00;
        String str2 = this.A01;
        1Xj A0U = DbV.A0U(userSession, str2);
        if (A0U != null) {
            1sd.A00(userSession).A02(A0U, true);
        }
        0sP r0 = this.A02;
        if (r0 != null) {
            r0.invoke(str2);
        }
    }
}
