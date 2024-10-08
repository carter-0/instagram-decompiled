package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.modal.ModalActivity;

public final class RBV extends C2806552w {
    public final /* synthetic */ QKH A00;
    public final /* synthetic */ boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RBV(QKH qkh, Integer num, boolean z) {
        super(num);
        this.A00 = qkh;
        this.A01 = z;
    }

    public final void onClick(View view) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("is_payment_enabled", this.A01);
        A0a.putBoolean("is_reconsent_enabled", false);
        AnonymousClass6W8.A06(this.A00.requireActivity(), A0a, ModalActivity.class, "save_autofill_learn_more");
    }
}
