package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.FmT  reason: case insensitive filesystem */
public final class C50980FmT implements C332277Ui {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Fragment A02;
    public final /* synthetic */ 0xF A03;
    public final /* synthetic */ AnonymousClass37F A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ boolean A06;

    public C50980FmT(Fragment fragment, 0xF r2, AnonymousClass37F r3, Integer num, int i, int i2, boolean z) {
        this.A04 = r3;
        this.A02 = fragment;
        this.A01 = i;
        this.A00 = i2;
        this.A06 = z;
        this.A05 = num;
        this.A03 = r2;
    }

    public final void D9V() {
        AnonymousClass37F r0 = this.A04;
        Fragment fragment = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        boolean z = this.A06;
        r0.A0L(fragment, this.A03, this.A05, i, i2, z);
    }

    public final void D9a() {
        C332277Ui r0 = this.A04.A0H;
        if (r0 != null) {
            r0.D9a();
        }
    }
}
