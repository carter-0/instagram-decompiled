package X;

/* renamed from: X.ECj  reason: case insensitive filesystem */
public final class C47675ECj extends 1P0 {
    public final /* synthetic */ EEU A00;

    public C47675ECj(EEU eeu) {
        this.A00 = eeu;
    }

    public final void onFail(C268654dm r7) {
        int A03 = AnonymousClass0fD.A03(22635944);
        EEU eeu = this.A00;
        C320106rm r2 = eeu.A00;
        if (r2 != null) {
            r2.A0E("fetch_request_fail");
            C320106rm r0 = eeu.A00;
            if (r0 != null) {
                r0.A00.A01();
                Dbc.A10(eeu, 16919357);
                eeu.A02 = false;
                C59689JTv.A01(eeu.A06.requireContext(), "tabbed_explore_people_fail", 2131974929, 0);
                AnonymousClass0fD.A0A(-991865754, A03);
                return;
            }
        }
        0qQ.A0F("perfLogger");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-594656781);
        EEU eeu = this.A00;
        eeu.A03 = false;
        if (!eeu.A04) {
            C46445Df7.A01(eeu.A06, false);
        }
        AnonymousClass3AD r0 = eeu.A01;
        if (r0 == null) {
            0qQ.A0F("pullToRefresh");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.setIsLoading(false);
        eeu.A04 = false;
        AnonymousClass0fD.A0A(-1770450846, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-777418519);
        EEU eeu = this.A00;
        eeu.A03 = true;
        if (!eeu.A04) {
            C46445Df7.A01(eeu.A06, true);
        }
        AnonymousClass0fD.A0A(-152877945, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-173332821);
        1XR r8 = (1XR) obj;
        int A032 = AnonymousClass0fD.A03(-783258769);
        0qQ.A0B(r8, 0);
        EEU eeu = this.A00;
        C320106rm r2 = eeu.A00;
        if (r2 != null) {
            r2.A0E("fetch_request_end");
            C320106rm r0 = eeu.A00;
            if (r0 != null) {
                C46329Dbx.A00(r0);
                Dbc.A10(eeu, 16911974);
                eeu.A02 = false;
                eeu.A07.DFN(r8);
                AnonymousClass0fD.A0A(2058128094, A032);
                AnonymousClass0fD.A0A(2115520126, A03);
                return;
            }
        }
        0qQ.A0F("perfLogger");
        throw AnonymousClass00P.createAndThrow();
    }
}
