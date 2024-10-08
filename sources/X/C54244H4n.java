package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.H4n  reason: case insensitive filesystem */
public final class C54244H4n extends 1P0 {
    public 1P0 A00;
    public Integer A01;
    public final /* synthetic */ C54722HQb A02;

    public C54244H4n(1P0 r1, C54722HQb hQb, Integer num) {
        this.A02 = hQb;
        this.A01 = num;
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.1qK, java.lang.Object] */
    public final void onFail(C268654dm r6) {
        int i;
        int i2;
        String A002;
        int A03 = AnonymousClass0fD.A03(-1831987389);
        int intValue = this.A01.intValue();
        if (intValue == 1) {
            i = 2131969434;
            i2 = 3746;
            A002 = AnonymousClass000.A00(i2);
        } else if (intValue != 2) {
            i = -1;
            A002 = null;
        } else {
            i = 2131969435;
            i2 = 3747;
            A002 = AnonymousClass000.A00(i2);
        }
        UserSession userSession = this.A02.A01;
        C59689JTv.A0F(C51966G9m.A0P(userSession), A002, i);
        AnonymousClass1Nd.A00(userSession).A05(new Object());
        1P0 r0 = this.A00;
        if (r0 != null) {
            r0.onFail(r6);
        }
        AnonymousClass0fD.A0A(-1466891329, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1086634614);
        1P0 r0 = this.A00;
        if (r0 != null) {
            r0.onFinish();
        }
        AnonymousClass0fD.A0A(1561489557, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-552990491);
        1P0 r0 = this.A00;
        if (r0 != null) {
            r0.onStart();
        }
        AnonymousClass0fD.A0A(-882019329, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-656594333);
        int A032 = AnonymousClass0fD.A03(1728151657);
        1P0 r0 = this.A00;
        if (r0 != null) {
            r0.onSuccess(obj);
        }
        AnonymousClass0fD.A0A(1798090409, A032);
        AnonymousClass0fD.A0A(913823973, A03);
    }
}
