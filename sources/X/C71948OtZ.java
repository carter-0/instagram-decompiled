package X;

/* renamed from: X.OtZ  reason: case insensitive filesystem */
public final class C71948OtZ implements C232302tS {
    public final /* synthetic */ E3U A00;

    public C71948OtZ(E3U e3u) {
        this.A00 = e3u;
    }

    public final void Dyk(C249703kE r9) {
        String str;
        C69493Nmb nmb;
        E3U e3u = this.A00;
        C254793t3 r2 = e3u.A01;
        if (r2 != null) {
            AnonymousClass3U9 C5z = 2L2.A00(AnonymousClass7TE.A0l(e3u.A07)).C5z(C327647Bq.A00(C300965yF.A01(r2)));
            C313756gx A0R = DbZ.A0R(e3u.A06);
            String str2 = null;
            if (C5z != null) {
                str = C5z.C6C();
                str2 = C5z.C6k();
            } else {
                str = null;
            }
            int i = e3u.A00;
            boolean A1W = AnonymousClass7TF.A1W(e3u.A05.getValue(), C69270NiW.ACTIVATION_NUX);
            1Ln A0J = DbT.A0J(A0R);
            if (DbT.A1Y(A0J)) {
                DbW.A17(A0J, A0R);
                C66581MXm.A1I(A0J, "learn_more_sheet_rendered");
                A0J.A0p("learn_more_sheet");
                DbZ.A1L(A0J, "thread_view", i);
                if (A1W) {
                    nmb = C69493Nmb.NEW_CHANNEL_FIRST_MESSAGE;
                } else {
                    nmb = C69493Nmb.EXISTING_CHANNEL_FIRST_EXPOSURE;
                }
                A0J.A0M(nmb, "entrypoint");
                A0J.A0s(str);
                C66582MXn.A1C(A0J, A0R, DbZ.A0d(str2));
            }
        }
    }
}
