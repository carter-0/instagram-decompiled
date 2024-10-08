package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Pc5  reason: case insensitive filesystem */
public final class C73408Pc5 implements Runnable {
    public final /* synthetic */ PA3 A00;
    public final /* synthetic */ C69668Npq A01;
    public final /* synthetic */ C254743sy A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ 0sP A05;
    public final /* synthetic */ 0sL A06;

    public C73408Pc5(PA3 pa3, C69668Npq npq, C254743sy r3, Boolean bool, C62320sa r5, 0sP r6, 0sL r7) {
        this.A03 = bool;
        this.A01 = npq;
        this.A02 = r3;
        this.A06 = r7;
        this.A04 = r5;
        this.A00 = pa3;
        this.A05 = r6;
    }

    public final void run() {
        C254743sy r3;
        String valueOf;
        boolean z;
        String str;
        C254873tC r0;
        ImmutableList A012;
        AnonymousClass9JN r02;
        Boolean bool = this.A03;
        0qQ.A0A(bool);
        if (bool.booleanValue()) {
            C69668Npq npq = this.A01;
            boolean z2 = npq instanceof C68965Nbs;
            if (z2) {
                r3 = this.A02;
                valueOf = C66647MaG.A09(r3);
            } else if (npq instanceof C68964Nbr) {
                r3 = this.A02;
                valueOf = String.valueOf(C66647MaG.A00(r3));
            } else {
                throw AnonymousClass7TE.A1K();
            }
            this.A06.invoke(npq.A00(), valueOf);
            C254793t3 A08 = C66647MaG.A08(r3);
            if (A08 != null) {
                1Ng A002 = AnonymousClass1Nd.A00(this.A00.A01);
                String A003 = npq.A00();
                if (z2) {
                    ImmutableList A0H = ((C68965Nbs) npq).A00.A0H();
                    if (A0H == null || (r0 = (C254873tC) 00k.A0J(A0H)) == null || (A012 = r0.A01()) == null || (r02 = (AnonymousClass9JN) 00k.A0J(A012)) == null) {
                        str = null;
                    } else {
                        str = r02.A05;
                    }
                    z = 0qQ.A0K(str, "xma_igd_live_location_sharing");
                } else {
                    z = false;
                }
                A002.A00(new AnonymousClass7MN(A08, A003, z));
            }
            C62320sa r03 = this.A04;
            if (r03 != null) {
                r03.invoke();
                return;
            }
            return;
        }
        this.A00.A02.A00("direct_unknown_error");
        this.A05.invoke(this.A01.A00());
    }
}
