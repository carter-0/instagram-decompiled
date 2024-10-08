package X;

import android.widget.TextView;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

/* renamed from: X.Fmi  reason: case insensitive filesystem */
public final class C50995Fmi implements G86 {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ C254113rx A01;
    public final /* synthetic */ C231952sg A02;

    public final void Cvy() {
    }

    public final boolean DBR(int i) {
        if (i != 2) {
            return false;
        }
        TextView textView = this.A00;
        if (textView != null) {
            textView.performClick();
            return true;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DWw() {
    }

    public final void Dws() {
    }

    public C50995Fmi(TextView textView, C254113rx r2, C231952sg r3) {
        this.A00 = textView;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void DvR() {
        C49509Ewo A002;
        EditPhoneNumberView editPhoneNumberView = this.A01.A01;
        if (editPhoneNumberView != null && (A002 = Ep8.A00(this.A02.A00, editPhoneNumberView)) != null) {
            A002.A00 = true;
        }
    }
}
