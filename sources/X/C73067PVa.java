package X;

/* renamed from: X.PVa  reason: case insensitive filesystem */
public final class C73067PVa implements Runnable {
    public final /* synthetic */ C67180Mjc A00;

    public C73067PVa(C67180Mjc mjc) {
        this.A00 = mjc;
    }

    public final void run() {
        C66633Ma2 ma2 = this.A00.A00.A00;
        ((C311496cm) ma2.A1i.getValue()).A03((Integer) null, ma2.A1J.getModuleName(), false);
        C66736Mbh A0U = C66581MXm.A0U(ma2);
        0xa A0q = AnonymousClass7TE.A0q(A0U.A0B);
        AnonymousClass7TG.A0g(A0q, "num_times_dismissed_ci_direct_follow_list").apply();
        long currentTimeMillis = System.currentTimeMillis();
        0xY AR4 = A0q.AR4();
        AR4.E5c("last_time_dismissed_ci_direct_follow_list", currentTimeMillis);
        AR4.apply();
        A0U.A0E.A06 = null;
        C66736Mbh.A03(A0U);
    }
}
