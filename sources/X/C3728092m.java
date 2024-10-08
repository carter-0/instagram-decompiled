package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.92m  reason: invalid class name and case insensitive filesystem */
public final class C3728092m extends 1P0 {
    public final /* synthetic */ UserSession A00;

    public C3728092m(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void onFail(C268654dm r4) {
        String str;
        C268674do r42;
        1XP r0;
        int A03 = AnonymousClass0fD.A03(-443839853);
        0qQ.A0B(r4, 0);
        if (!(r4 instanceof C268674do) || (r42 = (C268674do) r4) == null || (r0 = (1XP) r42.A00) == null || (str = r0.getErrorMessage()) == null) {
            str = "";
        }
        0wb.A03("CreatorInfoFetcher", 002.A0R(C273654mx.A00(1224), str));
        AnonymousClass0fD.A0A(1974752848, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(326246039);
        int A032 = AnonymousClass0fD.A03(-2027229651);
        AnonymousClass16x AsZ = AnonymousClass0t1.A01.A01(this.A00).A03.AsZ();
        if (AsZ != null) {
            AsZ.Ase();
        }
        AnonymousClass0fD.A0A(-1097275565, A032);
        AnonymousClass0fD.A0A(-776127372, A03);
    }
}
