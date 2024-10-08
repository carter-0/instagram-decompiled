package X;

/* renamed from: X.UfX  reason: case insensitive filesystem */
public final class C15605UfX extends 1P0 {
    public final /* synthetic */ C323426xT A00;
    public final /* synthetic */ String A01;

    public C15605UfX(C323426xT r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void onFail(C268654dm r14) {
        int A03 = AnonymousClass0fD.A03(814877658);
        1XQ r0 = (1XQ) r14.A00();
        if (r0 != null) {
            int i = r0.mStatusCode;
            if (i == 400) {
                C323426xT r1 = this.A00;
                C323486xZ r02 = r1.A07;
                String str = this.A01;
                C16508Uw5 uw5 = C16508Uw5.FAILED;
                r02.A0E(uw5, str);
                AnonymousClass1Nd.A00(r1.A06).A00(new C323966yO(uw5, (C18622VvF) null, str, (String) null, (String) null, false));
            } else if (C370788x4.A00(i)) {
                C323426xT r3 = this.A00;
                C323486xZ r03 = r3.A07;
                String str2 = this.A01;
                C16508Uw5 uw52 = C16508Uw5.LOADED;
                r03.A0E(uw52, str2);
                C323426xT.A01((C18071Vky) null, r3, uw52, str2, false);
            }
            AnonymousClass0fD.A0A(-219714197, A03);
        }
        C323426xT r4 = this.A00;
        C323486xZ r04 = r4.A07;
        String str3 = this.A01;
        C16508Uw5 uw53 = C16508Uw5.FAILED;
        r04.A0E(uw53, str3);
        C323426xT.A01(r04.A06(str3), r4, uw53, str3, false);
        AnonymousClass0fD.A0A(-219714197, A03);
    }

    public final void onFinish() {
        AnonymousClass0fD.A0A(266913843, AnonymousClass0fD.A03(-1974786399));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1639091236);
        CG8 cg8 = (CG8) obj;
        int A032 = AnonymousClass0fD.A03(273899341);
        C323426xT r6 = this.A00;
        C323486xZ r5 = r6.A07;
        String str = this.A01;
        C16508Uw5 uw5 = C16508Uw5.LOADED;
        r5.A0E(uw5, str);
        0qQ.A0B(cg8, 0);
        C323486xZ.A03(r5, cg8.A02, cg8.A01);
        r6.A00 = cg8.A00;
        C323426xT.A01(r5.A06(str), r6, uw5, str, false);
        AnonymousClass0fD.A0A(2099519507, A032);
        AnonymousClass0fD.A0A(770097391, A03);
    }
}
