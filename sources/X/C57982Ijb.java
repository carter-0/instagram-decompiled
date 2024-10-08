package X;

import java.util.List;

/* renamed from: X.Ijb  reason: case insensitive filesystem */
public final class C57982Ijb implements Runnable {
    public final /* synthetic */ AnonymousClass6LO A00;
    public final /* synthetic */ AnonymousClass6L7 A01;
    public final /* synthetic */ AnonymousClass59O A02;
    public final /* synthetic */ AnonymousClass59R A03;
    public final /* synthetic */ AnonymousClass62H A04;
    public final /* synthetic */ Object A05;
    public final /* synthetic */ List A06;

    public C57982Ijb(AnonymousClass6LO r1, AnonymousClass6L7 r2, AnonymousClass59O r3, AnonymousClass59R r4, AnonymousClass62H r5, Object obj, List list) {
        this.A04 = r5;
        this.A06 = list;
        this.A05 = obj;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final void run() {
        AnonymousClass62H r0 = this.A04;
        List list = this.A06;
        Object obj = this.A05;
        r0.A00(this.A00, this.A01, this.A02, this.A03, obj, list);
    }
}
