package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.3zK  reason: invalid class name and case insensitive filesystem */
public final class C258593zK implements 2IR {
    public final /* synthetic */ 02m A00;
    public final /* synthetic */ C228352lS A01;
    public final /* synthetic */ AnonymousClass2lP A02;
    public final /* synthetic */ C233632w4 A03;
    public final /* synthetic */ C238523Ce A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        02m r3 = this.A00;
        String message = th.getMessage();
        if (message == null) {
            message = "future failed";
        }
        r3.markerAnnotate(424097382, TraceFieldType.FailureReason, message);
        C228352lS r2 = this.A01;
        String str = this.A05;
        String str2 = this.A06;
        Double valueOf = Double.valueOf(1.0d);
        C228352lS.A01(r2, this.A02, this.A03, this.A04, valueOf, str, str2, true);
    }

    public C258593zK(02m r1, C228352lS r2, AnonymousClass2lP r3, C233632w4 r4, C238523Ce r5, String str, String str2) {
        this.A01 = r2;
        this.A05 = str;
        this.A06 = str2;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        AnonymousClass40G r14 = (AnonymousClass40G) obj;
        if (r14 == null || !r14.A02) {
            02m r3 = this.A00;
            if (r14 != null) {
                str = r14.A01;
            } else {
                str = null;
            }
            r3.markerAnnotate(424097382, TraceFieldType.FailureReason, str);
            C228352lS r2 = this.A01;
            String str2 = this.A05;
            String str3 = this.A06;
            Double valueOf = Double.valueOf(1.0d);
            C228352lS.A01(r2, this.A02, this.A03, this.A04, valueOf, str2, str3, true);
            return;
        }
        double doubleValue = ((Number) r14.A00).doubleValue();
        C228352lS r5 = this.A01;
        boolean z = false;
        if (doubleValue >= C228352lS.A00(r5)) {
            z = true;
        }
        String str4 = this.A05;
        String str5 = this.A06;
        Double valueOf2 = Double.valueOf(doubleValue);
        C228352lS.A01(r5, this.A02, this.A03, this.A04, valueOf2, str4, str5, z);
    }
}
