package X;

import android.view.View;

/* renamed from: X.Ngp  reason: case insensitive filesystem */
public final class C69191Ngp extends AnonymousClass7AK {
    public final /* synthetic */ C68467NJf A00;
    public final /* synthetic */ C68770NWf A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69191Ngp(C68467NJf nJf, C68770NWf nWf, int i, boolean z) {
        super(Integer.valueOf(i));
        this.A00 = nJf;
        this.A02 = z;
        this.A01 = nWf;
    }

    public final void onClick(View view) {
        C74499Pvt pvt;
        C68467NJf nJf = this.A00;
        if ((AnonymousClass4AJ.A07(AnonymousClass7TE.A0l(nJf.A0j)) || this.A02) && (pvt = nJf.A0P) != null) {
            pvt.Cqj(this.A01.A08);
        }
    }
}
