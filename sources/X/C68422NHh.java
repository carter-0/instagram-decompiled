package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NHh  reason: case insensitive filesystem */
public final class C68422NHh extends C272124k8 {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68422NHh(1P0 r1, UserSession userSession, int i) {
        super(userSession);
        this.A00 = i;
        this.A01 = r1;
    }

    public final void A05(C268654dm r3, UserSession userSession) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(-1373279597);
                AnonymousClass7TG.A1N(userSession, r3);
                super.A05(r3, userSession);
                ((1P0) this.A01).onFail(r3);
                i = -1003363423;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(1506413376);
                AnonymousClass7TG.A1N(userSession, r3);
                super.A05(r3, userSession);
                ((1P0) this.A01).onFail(r3);
                i = -359982297;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(-1595446302);
                AnonymousClass7TG.A1N(userSession, r3);
                super.A05(r3, userSession);
                ((1P0) this.A01).onFail(r3);
                i = 1737077392;
                break;
            default:
                A03 = AnonymousClass0fD.A03(1807463604);
                AnonymousClass7TG.A1N(userSession, r3);
                super.A05(r3, userSession);
                ((1P0) this.A01).onFail(r3);
                i = -1375312045;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(15179063);
                int A032 = AnonymousClass0fD.A03(-1489206496);
                AnonymousClass7TG.A1N(userSession, obj);
                super.A06(userSession, obj);
                ((1P0) this.A01).onSuccess(obj);
                AnonymousClass0fD.A0A(546038165, A032);
                i = -519689730;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(-1356724220);
                int A033 = AnonymousClass0fD.A03(1827114313);
                AnonymousClass7TG.A1N(userSession, obj);
                super.A06(userSession, obj);
                ((1P0) this.A01).onSuccess(obj);
                AnonymousClass0fD.A0A(304731674, A033);
                i = 1924465549;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(444850588);
                int A034 = AnonymousClass0fD.A03(1354077165);
                AnonymousClass7TG.A1N(userSession, obj);
                super.A06(userSession, obj);
                ((1P0) this.A01).onSuccess(obj);
                AnonymousClass0fD.A0A(-751886126, A034);
                i = -425604895;
                break;
            default:
                A03 = AnonymousClass0fD.A03(2038219066);
                int A035 = AnonymousClass0fD.A03(-489153996);
                AnonymousClass7TG.A1N(userSession, obj);
                super.A06(userSession, obj);
                ((1P0) this.A01).onSuccess(obj);
                AnonymousClass0fD.A0A(-1795067474, A035);
                i = 559802536;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}
