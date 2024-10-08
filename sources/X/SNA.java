package X;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.common.models.ErrorDialogContent;

public final class SNA {
    public S3F A00;

    public static final ErrorDialogContent A00() {
        return new ErrorDialogContent(C8911RFe.A05, (C8911RFe) null, (C10576RuV) null, (C10576RuV) null, 2131961167, 2131961166, (Integer) null, (Integer) null, (String) null, (String) null);
    }

    public static final void A01(FragmentActivity fragmentActivity, ErrorDialogContent errorDialogContent, C62320sa r14) {
        String A05 = errorDialogContent.A05(fragmentActivity);
        String A02 = errorDialogContent.A02(fragmentActivity);
        String A03 = errorDialogContent.A03(fragmentActivity);
        C11351SOk A01 = SA0.A01((Drawable) null, errorDialogContent.A00(), (C8937RGf) null, (C13621Tdn) null, new TPW(r14), A05, A02, A03, (String) null, (String) null, (String) null, errorDialogContent.A06());
        AnonymousClass7TF.A1H(fragmentActivity, A01);
        SIG.A00(fragmentActivity, A01, AnonymousClass2E0.A0H());
    }
}
