package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Fdl  reason: case insensitive filesystem */
public final class C50525Fdl implements C13675Tek {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public final /* bridge */ /* synthetic */ void D5D(Object obj) {
        Object obj2 = obj;
        if (this.A00 != 0) {
            C51879G5r g5r = (C51879G5r) obj2;
            C46632DiC.A00 = g5r;
            AnonymousClass0aP r3 = (AnonymousClass0aP) this.A04;
            ((G85) this.A01).CIv((Fragment) this.A02, (C252243on) this.A03, r3, g5r, (C46634DiE) this.A05);
            return;
        }
        C51879G5r g5r2 = (C51879G5r) obj2;
        C46632DiC.A00 = g5r2;
        AnonymousClass0aP r32 = (AnonymousClass0aP) this.A04;
        ((G85) this.A01).CJF((Fragment) this.A02, (C252243on) this.A03, r32, g5r2, (C46634DiE) this.A05);
    }

    public C50525Fdl(Fragment fragment, C252243on r2, AnonymousClass0aP r3, G85 g85, C46634DiE diE, int i) {
        this.A00 = i;
        this.A01 = g85;
        this.A02 = fragment;
        this.A05 = diE;
        this.A04 = r3;
        this.A03 = r2;
    }
}
