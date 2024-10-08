package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6sG  reason: invalid class name and case insensitive filesystem */
public final class C320366sG implements 27S {
    public final /* synthetic */ C320296s9 A00;

    public C320366sG(C320296s9 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        C320766su r3 = (C320766su) obj;
        0qQ.A0B(r3, 0);
        return 2R8.A05((UserSession) this.A00.A0T.getValue(), r3.A00);
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String str;
        int A03 = AnonymousClass0fD.A03(1977258983);
        C320766su r6 = (C320766su) obj;
        int A032 = AnonymousClass0fD.A03(1000255409);
        0qQ.A0B(r6, 0);
        C320296s9 r2 = this.A00;
        C229352nF A002 = C229342nE.A00((UserSession) r2.A0T.getValue());
        String str2 = r2.A0A;
        if (str2 == null) {
            str = "gridKey";
        } else {
            C294885nC r1 = (C294885nC) A002.A01.get(str2);
            if (r1 != null) {
                r1.A07 = true;
            }
            if (r6.A01) {
                C320406sK r0 = r2.A08;
                if (r0 == null) {
                    str = "clipsProfileTabFetcher";
                } else {
                    r0.A01();
                }
            } else {
                r2.A0G = true;
            }
            AnonymousClass0fD.A0A(709465347, A032);
            AnonymousClass0fD.A0A(-1237371320, A03);
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
