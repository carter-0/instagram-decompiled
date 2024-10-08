package X;

import android.text.Editable;
import android.text.TextUtils;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

/* renamed from: X.ESz  reason: case insensitive filesystem */
public final class C48055ESz extends W7f {
    public final /* synthetic */ EVZ A00;
    public final /* synthetic */ G86 A01;
    public final /* synthetic */ EditPhoneNumberView A02;

    public C48055ESz(EVZ evz, G86 g86, EditPhoneNumberView editPhoneNumberView) {
        this.A02 = editPhoneNumberView;
        this.A00 = evz;
        this.A01 = g86;
    }

    public final void afterTextChanged(Editable editable) {
        EVZ evz = this.A00;
        if (evz == EVZ.ARGUMENT_EDIT_PROFILE_FLOW || evz == EVZ.ARGUMENT_TWOFAC_FLOW) {
            this.A02.A02.setVisibility(DbW.A00(TextUtils.isEmpty(editable.toString()) ? 1 : 0));
        }
        G86 g86 = this.A01;
        g86.DvR();
        g86.Dws();
    }
}
