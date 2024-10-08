package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.K1j  reason: case insensitive filesystem */
public final class C61296K1j extends C272124k8 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61296K1j(1P0 r1, UserSession userSession, String str, String str2, int i, int i2) {
        super(userSession);
        this.A00 = i2;
        this.A01 = i;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = r1;
    }

    public final void A05(C268654dm r6, UserSession userSession) {
        int A032;
        int i;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(-456102754);
            AnonymousClass7TG.A1N(userSession, r6);
            super.A05(r6, userSession);
            C313746gw.A00(userSession).A0D(r6, this.A03, this.A04, this.A01);
            ((1P0) this.A02).onFail(r6);
            i = -649439300;
        } else {
            A032 = AnonymousClass0fD.A03(-1598647015);
            AnonymousClass7TG.A1N(userSession, r6);
            super.A05(r6, userSession);
            C313746gw.A00(userSession).A0C(r6, this.A03, this.A04, this.A01);
            ((1P0) this.A02).onFail(r6);
            i = 515247561;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A032;
        int i;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(229050439);
            int A033 = AnonymousClass0fD.A03(1328784042);
            AnonymousClass7TG.A1N(userSession, obj);
            super.A06(userSession, obj);
            C313746gw.A00(userSession).A0D((C268654dm) null, this.A03, this.A04, this.A01);
            ((1P0) this.A02).onSuccess(obj);
            AnonymousClass0fD.A0A(-87641602, A033);
            i = 1178609202;
        } else {
            A032 = AnonymousClass0fD.A03(-1029131522);
            int A034 = AnonymousClass0fD.A03(86612377);
            AnonymousClass7TG.A1N(userSession, obj);
            super.A06(userSession, obj);
            C313746gw.A00(userSession).A0C((C268654dm) null, this.A03, this.A04, this.A01);
            ((1P0) this.A02).onSuccess(obj);
            AnonymousClass0fD.A0A(1506789740, A034);
            i = 937321660;
        }
        AnonymousClass0fD.A0A(i, A032);
    }
}
