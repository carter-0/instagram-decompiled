package X;

/* renamed from: X.WQa  reason: case insensitive filesystem */
public final class C19220WQa implements 1wn {
    public final /* synthetic */ C313876hI A00;

    public C19220WQa(C313876hI r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(1543900549);
        C16372Utp utp = (C16372Utp) obj;
        int A0D = AnonymousClass7TG.A0D(utp, 1318168388);
        C313876hI r2 = this.A00;
        if (!utp.A03.equals(r2.A02)) {
            i = 1143678922;
        } else {
            C16669Uz5 uz5 = (C16669Uz5) C16669Uz5.A01.get(utp.A05);
            if (uz5 == null) {
                uz5 = C16669Uz5.UNKNOWN;
            }
            C18013Vjp vjp = r2.A01;
            if (vjp != null) {
                long j = utp.A00;
                long j2 = utp.A01;
                String str = utp.A04;
                0qQ.A06(str);
                C19832WgD wgD = new C19832WgD(utp.A02, uz5, str, j, j2);
                vjp.A01(new C19830WgB(new C19828Wg9(wgD), wgD));
            }
            i = 277982742;
        }
        AnonymousClass0fD.A0A(i, A0D);
        AnonymousClass0fD.A0A(79970717, A03);
    }
}
