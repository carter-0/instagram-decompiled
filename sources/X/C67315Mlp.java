package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Mlp  reason: case insensitive filesystem */
public final class C67315Mlp extends 1P0 {
    public final UserSession A00;
    public final AnonymousClass7BV A01;
    public final String A02;

    public C67315Mlp(UserSession userSession, AnonymousClass7BV r2, String str) {
        AnonymousClass7TG.A1O(userSession, str);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = r2;
    }

    public final void onFailInBackground(C268654dm r3) {
        AnonymousClass0fD.A0A(623287613, AnonymousClass0fD.A03(-1617247969));
    }

    public final void onStart() {
        AnonymousClass0fD.A0A(-1750671202, AnonymousClass0fD.A03(937305433));
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-694250526);
        B72 b72 = (B72) obj;
        int A0D = AnonymousClass7TG.A0D(b72, 452874802);
        String str = this.A02;
        1bc A002 = C370748x0.A00();
        UserSession userSession = this.A00;
        A002.A00(userSession).A02(userSession, this.A01, b72, str);
        AnonymousClass0fD.A0A(1405059807, A0D);
        AnonymousClass0fD.A0A(-100078602, A03);
    }
}
