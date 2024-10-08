package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NHm  reason: case insensitive filesystem */
public final class C68427NHm extends C272124k8 {
    public final /* synthetic */ C272124k8 A00;
    public final /* synthetic */ 1hV A01;
    public final /* synthetic */ AnonymousClass1hT A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68427NHm(C272124k8 r1, UserSession userSession, 1hV r3, AnonymousClass1hT r4) {
        super(userSession);
        this.A01 = r3;
        this.A00 = r1;
        this.A02 = r4;
    }

    public final void onFail(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(-1437448800);
        this.A00.onFail(r3);
        AnonymousClass0fD.A0A(788562295, A03);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.1qK, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1011122463);
        int A032 = AnonymousClass0fD.A03(-2105591324);
        this.A00.onSuccess(obj);
        UserSession userSession = this.A01.A00;
        if (182.A06(0Tu.A05, userSession, 36326214914684515L)) {
            1Ng A002 = AnonymousClass1Nd.A00(userSession);
            this.A02.C6K();
            A002.A00(new Object());
        }
        AnonymousClass0fD.A0A(-626033911, A032);
        AnonymousClass0fD.A0A(-1854917797, A03);
    }
}
