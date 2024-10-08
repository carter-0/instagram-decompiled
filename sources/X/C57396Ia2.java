package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.DexOptimization;

/* renamed from: X.Ia2  reason: case insensitive filesystem */
public final class C57396Ia2 implements C332277Ui {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C46327Dbv A01;
    public final /* synthetic */ C46498Dg1 A02;
    public final /* synthetic */ LSk A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public final void D9a() {
    }

    public C57396Ia2(FragmentActivity fragmentActivity, C46327Dbv dbv, C46498Dg1 dg1, LSk lSk, String str, String str2) {
        this.A03 = lSk;
        this.A04 = str;
        this.A05 = str2;
        this.A01 = dbv;
        this.A02 = dg1;
        this.A00 = fragmentActivity;
    }

    public final void D9V() {
        LSk.A02(LSk.A01(this.A01, this.A05), this.A03, DexOptimization.OPT_KEY_CLIENT, AnonymousClass000.A00(739), "impression", this.A04);
        new C49945FFy(this.A02).A03(this.A00);
    }
}
