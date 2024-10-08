package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Fvr  reason: case insensitive filesystem */
public final class C51545Fvr implements Runnable {
    public final /* synthetic */ 0SM A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C51946G8p A02;
    public final /* synthetic */ C3034368u A03;
    public final /* synthetic */ C359628dE A04;
    public final /* synthetic */ C14578Tyi A05;
    public final /* synthetic */ String A06;

    public C51545Fvr(0SM r1, FragmentActivity fragmentActivity, C51946G8p g8p, C3034368u r4, C359628dE r5, C14578Tyi tyi, String str) {
        this.A00 = r1;
        this.A01 = fragmentActivity;
        this.A06 = str;
        this.A02 = g8p;
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = tyi;
    }

    public final void run() {
        G9A g9a = this.A00;
        X5M Bcw = g9a.Bcw(C16501Uvx.Bloks);
        0qQ.A0C(Bcw, "null cannot be cast to non-null type com.bloks.foa.cds.bottomsheet.intf.CdsBloksBottomSheetBehavior");
        FragmentActivity fragmentActivity = this.A01;
        String str = this.A06;
        g9a.E0j(C49954FGj.A01(fragmentActivity, this.A02, (C46601Dhh) Bcw, this.A03, this.A04, str), this.A05);
    }
}
