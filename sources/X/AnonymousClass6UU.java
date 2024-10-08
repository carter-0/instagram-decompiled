package X;

import android.view.View;
import com.instagram.model.effect.AttributedAREffect;

/* renamed from: X.6UU  reason: invalid class name */
public final class AnonymousClass6UU implements View.OnClickListener {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ C250973mM A02;
    public final /* synthetic */ C317116mk A03;

    public AnonymousClass6UU(1Xj r1, C255773uh r2, C250973mM r3, C317116mk r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        int i;
        1Xj r0;
        int A05 = AnonymousClass0fD.A05(-82724583);
        C255773uh r5 = this.A01;
        AttributedAREffect attributedAREffect = r5.A05;
        if (!r5.A12() || attributedAREffect == null) {
            if (!r5.CWu() || (r0 = this.A00) == null || !r0.A4y()) {
                C317116mk r2 = this.A03;
                C250973mM r1 = this.A02;
                r2.Df3(r5, r1.A0H.A0P, r1, (String) null);
            } else {
                this.A03.DQz(r5);
            }
            i = -1004187054;
        } else if (!attributedAREffect.A0D()) {
            i = -176135150;
        } else {
            C317116mk r4 = this.A03;
            String str = attributedAREffect.A09;
            0qQ.A07(str);
            String A052 = attributedAREffect.A05();
            0qQ.A07(A052);
            r4.Djg(attributedAREffect.A01(), attributedAREffect.A04, str, A052, attributedAREffect.A03(), attributedAREffect.A0B);
            i = -1004187054;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
