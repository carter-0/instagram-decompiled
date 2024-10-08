package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2fa  reason: invalid class name and case insensitive filesystem */
public final class C226072fa implements 27S {
    public final /* synthetic */ C226062fZ A00;

    public C226072fa(C226062fZ r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        AnonymousClass3EK r3 = (AnonymousClass3EK) obj;
        boolean equals = AnonymousClass000.A00(3628).equals(r3.A00);
        if (equals) {
            r3.A04 = "user in main tab";
        }
        return equals;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(62180385);
        int A032 = AnonymousClass0fD.A03(1168222393);
        UserSession userSession = this.A00.A07;
        if (userSession != null) {
            2aN.A00(userSession).A03();
        }
        AnonymousClass0fD.A0A(1542652593, A032);
        AnonymousClass0fD.A0A(-809568614, A03);
    }
}
