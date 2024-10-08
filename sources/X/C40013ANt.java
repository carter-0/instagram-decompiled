package X;

import android.content.DialogInterface;
import android.view.View;

/* renamed from: X.ANt  reason: case insensitive filesystem */
public final class C40013ANt implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C358248ab A01;

    public C40013ANt(C358248ab r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1880970710);
        C358248ab r3 = this.A01;
        DialogInterface.OnClickListener onClickListener = r3.A00;
        if (onClickListener != null) {
            onClickListener.onClick(r3.A0P, this.A00);
        }
        r3.A0P.dismiss();
        AnonymousClass0fD.A0C(-1584490602, A05);
    }
}
