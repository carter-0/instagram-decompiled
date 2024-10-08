package X;

import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

/* renamed from: X.Frm  reason: case insensitive filesystem */
public final class C51293Frm implements Runnable {
    public final /* synthetic */ EditPhoneNumberView A00;

    public C51293Frm(EditPhoneNumberView editPhoneNumberView) {
        this.A00 = editPhoneNumberView;
    }

    public final void run() {
        EditPhoneNumberView editPhoneNumberView = this.A00;
        if (editPhoneNumberView.A01.requestFocus()) {
            0nA.A0Q(editPhoneNumberView.A01);
        }
    }
}
