package X;

import com.instagram.api.schemas.BizUserInboxState;

/* renamed from: X.Mj1  reason: case insensitive filesystem */
public final class C67143Mj1 implements 1wn {
    public final /* synthetic */ C66633Ma2 A00;

    public C67143Mj1(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-394291131);
        C71886OsU osU = (C71886OsU) obj;
        int A032 = AnonymousClass0fD.A03(576561610);
        0qQ.A0B(osU, 0);
        C66736Mbh A0U = C66581MXm.A0U(this.A00);
        BizUserInboxState bizUserInboxState = osU.A00;
        0qQ.A0B(bizUserInboxState, 0);
        C67141Miz miz = A0U.A0E;
        if (miz.A01 != bizUserInboxState) {
            miz.A01 = bizUserInboxState;
            C67220MkG A002 = C67118Mic.A00(bizUserInboxState, A0U.A01);
            A0U.A01 = A002;
            miz.A08 = C66736Mbh.A00(A0U, A002);
            C66736Mbh.A04(A0U);
            AnonymousClass4kA A003 = AnonymousClass4k9.A00(A0U.A0B);
            int i = A0U.A01.A02;
            A003.A0G.Epx(A003, Integer.valueOf(i), AnonymousClass4kA.A0c[10]);
        }
        AnonymousClass0fD.A0A(-641876687, A032);
        AnonymousClass0fD.A0A(642473258, A03);
    }
}
