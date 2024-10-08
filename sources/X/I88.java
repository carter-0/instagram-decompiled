package X;

import android.content.DialogInterface;

public final class I88 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C52971GgO A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public I88(C52971GgO ggO, String str, String str2, boolean z) {
        this.A00 = ggO;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.A00.A0C.A0D("unpin_dialog_cancel", this.A01, this.A02, this.A03);
    }
}
