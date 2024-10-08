package X;

import android.view.View;
import com.instagram.common.ui.base.IgTextView;

public final class IC1 implements View.OnClickListener {
    public final /* synthetic */ C255783ui A00;
    public final /* synthetic */ C249693kD A01;
    public final /* synthetic */ C317606nX A02;
    public final /* synthetic */ C316836mI A03;

    public IC1(C255783ui r1, C249693kD r2, C317606nX r3, C316836mI r4) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(313380843);
        C317606nX r3 = this.A02;
        1Xj BPf = this.A01.BPf();
        if (BPf != null) {
            C316836mI r1 = this.A03;
            r3.DRq(BPf, r1, this.A00);
            IgTextView igTextView = r1.A02;
            if (igTextView != null) {
                if (igTextView.isHapticFeedbackEnabled()) {
                    IgTextView igTextView2 = r1.A02;
                    if (igTextView2 != null) {
                        igTextView2.performHapticFeedback(1);
                    }
                }
                AnonymousClass0fD.A0C(-2108833881, A05);
                return;
            }
            0qQ.A0F("buttonView");
            throw AnonymousClass00P.createAndThrow();
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0C(439326280, A05);
        throw A0y;
    }
}
