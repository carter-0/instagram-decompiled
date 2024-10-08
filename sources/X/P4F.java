package X;

import android.view.View;
import java.util.List;

public final class P4F implements C74457PvC {
    public final /* synthetic */ C67968Mxs A00;
    public final /* synthetic */ C68593NOp A01;
    public final /* synthetic */ C68197N5m A02;

    public P4F(C67968Mxs mxs, C68593NOp nOp, C68197N5m n5m) {
        this.A01 = nOp;
        this.A00 = mxs;
        this.A02 = n5m;
    }

    public final void DGE(View view, boolean z) {
        C68197N5m n5m = this.A02;
        CharSequence charSequence = n5m.A00;
        if (charSequence == null || 00l.A0W(charSequence)) {
            this.A01.A00.A00(n5m);
        }
    }

    public final void DdN(View view) {
        this.A01.A00.A00(this.A02);
    }

    public final void Dr0(View view, CharSequence charSequence) {
        C68593NOp nOp = this.A01;
        OJe oJe = nOp.A00;
        C67968Mxs mxs = this.A00;
        int bindingAdapterPosition = mxs.getBindingAdapterPosition();
        C71067Oam oam = oJe.A00;
        int max = Math.max((bindingAdapterPosition - oam.A0C.size()) - 1, 0);
        List list = oam.A0B;
        ((C68197N5m) list.get(Math.min(max, C51966G9m.A06(list)))).A00 = charSequence;
        C68593NOp.A00(mxs, nOp, charSequence);
    }
}
