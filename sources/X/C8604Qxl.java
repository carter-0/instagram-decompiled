package X;

import android.content.Context;

/* renamed from: X.Qxl  reason: case insensitive filesystem */
public final class C8604Qxl extends QAL {
    public final /* synthetic */ C8607Qxo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8604Qxl(Context context, C8607Qxo qxo, int i) {
        super(context, i);
        this.A00 = qxo;
    }

    public final void onBackPressed() {
        if (!this.A00.A0H()) {
            super.onBackPressed();
        }
    }
}
