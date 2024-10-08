package X;

import android.view.View;

/* renamed from: X.WEy  reason: case insensitive filesystem */
public final class C18971WEy implements C20941X5k {
    public final /* synthetic */ C14554TyJ A00;
    public final /* synthetic */ 2Tb A01;

    public C18971WEy(C14554TyJ tyJ, 2Tb r2) {
        this.A00 = tyJ;
        this.A01 = r2;
    }

    public final void DYF(View view, int i) {
        C14554TyJ tyJ = this.A00;
        tyJ.requestLayout();
        tyJ.invalidate();
    }

    public final void DYK(View view, C70652Tj r3) {
        this.A01.A09.A0H.remove(this);
    }
}
