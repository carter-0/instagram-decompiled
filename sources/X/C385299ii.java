package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9ii  reason: invalid class name and case insensitive filesystem */
public final class C385299ii extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;

    public C385299ii(UserSession userSession, int i) {
        this.A01 = userSession;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-278847370);
        int A032 = AnonymousClass0fD.A03(484811496);
        1Av A002 = 1Au.A00(this.A01);
        boolean z = true;
        if (this.A00 != 1) {
            z = false;
        }
        0xY A0p = AnonymousClass7TE.A0p(A002);
        int i = 2;
        if (z) {
            i = 1;
        }
        A0p.E5Z(AnonymousClass000.A00(325), i);
        A0p.apply();
        AnonymousClass0fD.A0A(-467030049, A032);
        AnonymousClass0fD.A0A(1161662301, A03);
    }
}
