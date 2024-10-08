package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.instagram.modal.ModalActivity;

public final class RBX extends C2806552w {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ C270254gR A02;
    public final /* synthetic */ C11265SHz A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RBX(Activity activity, Bundle bundle, C270254gR r3, C11265SHz sHz, Integer num, boolean z) {
        super(num);
        this.A04 = z;
        this.A00 = activity;
        this.A03 = sHz;
        this.A01 = bundle;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("is_payment_enabled", this.A04);
        A0a.putBoolean("is_reconsent_enabled", true);
        AnonymousClass6W8.A06(this.A00, A0a, ModalActivity.class, "save_autofill_learn_more");
        C11265SHz sHz = this.A03;
        if (sHz != null) {
            SUR.A0A(this.A01, this.A02, sHz);
        }
    }
}
