package X;

import android.content.DialogInterface;

/* renamed from: X.LTw  reason: case insensitive filesystem */
public final class C64206LTw implements DialogInterface.OnCancelListener {
    public final /* synthetic */ LPH A00;

    public C64206LTw(LPH lph) {
        this.A00 = lph;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        LPH lph = this.A00;
        if (lph != null) {
            lph.A08(AnonymousClass05K.A0H, AnonymousClass05K.A0Y);
        }
    }
}
