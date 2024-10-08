package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;

/* renamed from: X.8af  reason: invalid class name and case insensitive filesystem */
public final class C358288af implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DialogInterface.OnClickListener A01;
    public final /* synthetic */ C358248ab A02;
    public final /* synthetic */ boolean A03;

    public C358288af(DialogInterface.OnClickListener onClickListener, C358248ab r2, int i, boolean z) {
        this.A01 = onClickListener;
        this.A02 = r2;
        this.A00 = i;
        this.A03 = z;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(775255881);
        DialogInterface.OnClickListener onClickListener = this.A01;
        if (onClickListener != null) {
            onClickListener.onClick(this.A02.A0P, this.A00);
        }
        if (this.A03) {
            Dialog dialog = this.A02.A0P;
            if (dialog.isShowing()) {
                try {
                    dialog.dismiss();
                } catch (Exception e) {
                    0wj r3 = 0wj.A01;
                    StringBuilder sb = new StringBuilder();
                    sb.append("NPE in Dismiss dialog=");
                    sb.append(dialog);
                    0f9 AEf = r3.AEf(sb.toString(), 245701013);
                    AEf.ERJ(e);
                    AEf.report();
                }
            }
        }
        AnonymousClass0fD.A0C(-671618541, A05);
    }
}
