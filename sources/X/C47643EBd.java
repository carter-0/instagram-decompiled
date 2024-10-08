package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EBd  reason: case insensitive filesystem */
public final class C47643EBd extends 1P0 {
    public final UserSession A00;
    public final C46768Dkv A01;

    public C47643EBd(UserSession userSession, C46768Dkv dkv) {
        0qQ.A0B(userSession, 2);
        this.A01 = dkv;
        this.A00 = userSession;
    }

    public final void onFail(C268654dm r5) {
        int A0D = AnonymousClass7TG.A0D(r5, 1473617175);
        C47643EBd.super.onFail(r5);
        this.A01.A00(this.A00, (String) null);
        AnonymousClass0fD.A0A(99698242, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1875883995);
        int A0D = AnonymousClass7TG.A0D(obj, -858777060);
        C47643EBd.super.onSuccess(obj);
        this.A01.A00(this.A00, (String) null);
        AnonymousClass0fD.A0A(-1170103581, A0D);
        AnonymousClass0fD.A0A(1237373394, A03);
    }
}
