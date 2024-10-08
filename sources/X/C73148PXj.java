package X;

import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;

/* renamed from: X.PXj  reason: case insensitive filesystem */
public final /* synthetic */ class C73148PXj implements Runnable {
    public final /* synthetic */ ConfirmationCodeEditText A00;

    public /* synthetic */ C73148PXj(ConfirmationCodeEditText confirmationCodeEditText) {
        this.A00 = confirmationCodeEditText;
    }

    public final void run() {
        ConfirmationCodeEditText confirmationCodeEditText = this.A00;
        confirmationCodeEditText.A08 = true;
        confirmationCodeEditText.postInvalidate();
    }
}
