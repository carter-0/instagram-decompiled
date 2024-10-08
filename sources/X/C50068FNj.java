package X;

import android.content.DialogInterface;
import android.view.View;

/* renamed from: X.FNj  reason: case insensitive filesystem */
public final class C50068FNj implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DialogInterface.OnClickListener A01;
    public final /* synthetic */ FF8 A02;

    public C50068FNj(DialogInterface.OnClickListener onClickListener, FF8 ff8, int i) {
        this.A02 = ff8;
        this.A01 = onClickListener;
        this.A00 = i;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-652198130);
        DialogInterface.OnClickListener onClickListener = this.A01;
        C46659Dig dig = this.A02.A0D;
        onClickListener.onClick(dig, this.A00);
        dig.dismiss();
        AnonymousClass0fD.A0C(-1123481642, A05);
    }
}
