package X;

import java.util.List;

/* renamed from: X.PSf  reason: case insensitive filesystem */
public final class C72996PSf implements 1aV {
    public final /* synthetic */ 1a8 A00;
    public final /* synthetic */ AnonymousClass7VU A01;
    public final /* synthetic */ C254773t1 A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ 0sP A04;
    public final /* synthetic */ boolean A05;

    public C72996PSf(1a8 r1, AnonymousClass7VU r2, C254773t1 r3, List list, 0sP r5, boolean z) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = list;
        this.A05 = z;
        this.A04 = r5;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Object A032;
        C74233PrM prM = (C74233PrM) obj;
        if (prM instanceof C66990MgO) {
            Object A022 = C66996MgU.A02(prM);
            0qQ.A07(A022);
            C257443xP r1 = (C257443xP) A022;
            if (r1.A06() && (A032 = r1.A03()) != null) {
                this.A04.invoke(A032);
                this.A00.A01();
            }
        }
        AnonymousClass7VU.A00(this.A01, this.A02, this.A03, this.A04, this.A05);
        this.A00.A01();
    }
}
