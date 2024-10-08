package X;

import com.facebookpay.otc.models.OtcInput;
import com.google.common.collect.ImmutableList;

public final class S4L {
    public final C11281SIz A00 = new C11281SIz();
    public final C10900S0a A01 = new C10900S0a();

    public final AnonymousClass2gB A00(SJK sjk) {
        ImmutableList of = ImmutableList.of("TERMS");
        0qQ.A0B(of, 0);
        sjk.A01 = of;
        C7422QCn A03 = SSC.A03(new C8275QnH(AnonymousClass2E0.A06(), this, sjk, 0));
        String str = sjk.A0C;
        OtcInput otcInput = sjk.A04;
        SJ1 sj1 = new SJ1(otcInput, str);
        C11281SIz sIz = this.A00;
        AnonymousClass2gB A012 = sIz.A01(SUj.A08((Object) null), sj1);
        0qQ.A0C(A012, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.expresscheckout.api.TermsComponent>>");
        0qQ.A0A(A03);
        SQB.A02(A03, A012, new C11648Sdq(12, (Object) A012, (Object) sjk));
        return sIz.A01(SUj.A08((Object) null), new SJ1(otcInput, str));
    }

    public final void A01(SJ1 sj1) {
        C11281SIz.A00(this.A00, sj1.A00, sj1);
    }
}
