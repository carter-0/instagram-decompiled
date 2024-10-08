package X;

import java.util.List;

/* renamed from: X.Ijc  reason: case insensitive filesystem */
public final class C57983Ijc implements Runnable {
    public final /* synthetic */ AnonymousClass6LO A00;
    public final /* synthetic */ AnonymousClass6L7 A01;
    public final /* synthetic */ AnonymousClass59O A02;
    public final /* synthetic */ AnonymousClass59R A03;
    public final /* synthetic */ AnonymousClass62H A04;
    public final /* synthetic */ Object A05;
    public final /* synthetic */ List A06;

    public C57983Ijc(AnonymousClass6LO r1, AnonymousClass6L7 r2, AnonymousClass59O r3, AnonymousClass59R r4, AnonymousClass62H r5, Object obj, List list) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A06 = list;
        this.A05 = obj;
        this.A03 = r4;
    }

    public final void run() {
        try {
            AnonymousClass59O r4 = this.A02;
            AnonymousClass6L7 r3 = this.A01;
            AnonymousClass6LO r2 = this.A00;
            r4.AUx(r2, r3, (String) null, true);
            AnonymousClass62H r6 = this.A04;
            List list = this.A06;
            11Z.A02(new C57709IfC(new C57982Ijb(r2, r3, r4, this.A03, r6, this.A05, list)));
        } catch (C242623Vf e) {
            11Z.A02(new C57709IfC(new C57893IiA(this.A01, e, this.A02)));
        }
    }
}
