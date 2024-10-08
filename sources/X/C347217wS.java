package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7wS  reason: invalid class name and case insensitive filesystem */
public final class C347217wS extends 1P0 {
    public final /* synthetic */ UserSession A00;

    public C347217wS(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void onFail(C268654dm r3) {
        AnonymousClass0fD.A0A(748747959, AnonymousClass0fD.A03(721854072));
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(15426453);
        C347177wO.A01 = false;
        AnonymousClass0fD.A0A(-1567898650, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1653532446);
        C347187wP r6 = (C347187wP) obj;
        int A032 = AnonymousClass0fD.A03(-810460961);
        0qQ.A0B(r6, 0);
        C347177wO.A00 = true;
        Boolean bool = r6.A02;
        if (bool != null) {
            1Au.A00(this.A00).A1F(bool.booleanValue());
        }
        AnonymousClass0fD.A0A(-622503869, A032);
        AnonymousClass0fD.A0A(-2107179017, A03);
    }
}
