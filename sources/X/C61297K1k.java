package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.K1k  reason: case insensitive filesystem */
public final class C61297K1k extends C272124k8 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MSL A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61297K1k(UserSession userSession, MSL msl, String str, String str2, String str3, int i) {
        super(userSession);
        this.A02 = str;
        this.A04 = str2;
        this.A00 = i;
        this.A03 = str3;
        this.A01 = msl;
    }

    public final void A05(C268654dm r5, UserSession userSession) {
        int A032 = AnonymousClass0fD.A03(878323910);
        AnonymousClass7TG.A1N(userSession, r5);
        super.A05(r5, userSession);
        LPX.A01(r5, userSession, this.A02, this.A04, this.A00);
        AnonymousClass0fD.A0A(-86636963, A032);
    }

    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A032 = AnonymousClass0fD.A03(-560380543);
        int A033 = AnonymousClass0fD.A03(543761838);
        AnonymousClass7TG.A1N(userSession, obj);
        super.A06(userSession, obj);
        LPX.A01((C268654dm) null, userSession, this.A02, this.A04, this.A00);
        C69875Ntd.A00(userSession, this.A03);
        MSL msl = this.A01;
        if (msl != null) {
            msl.onSuccess();
        }
        AnonymousClass0fD.A0A(-1714793275, A033);
        AnonymousClass0fD.A0A(-1420109687, A032);
    }
}
