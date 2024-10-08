package X;

import com.instagram.reels.question.model.responsetype.QuestionResponseType;

/* renamed from: X.AeT  reason: case insensitive filesystem */
public final class C40581AeT implements AnonymousClass2sT {
    public final /* synthetic */ AnonymousClass8KO A00;

    public final void DaJ(AnonymousClass3Q2 r12) {
        0qQ.A0B(r12, 0);
        if (r12.A1f == AnonymousClass3QD.CONFIGURED) {
            r12.A0Z(this);
            C15023UKc uKc = r12.A1l;
            if (uKc != null) {
                1Ou.A01(this.A00.A02).A0A(new 1Or(uKc.A04, uKc.A05, uKc.A06, uKc.A03, uKc.A07, r12.A3t, QuestionResponseType.MEDIA.A00, r12.A1G.A00, uKc.A00));
                return;
            }
            throw new AssertionError();
        }
    }

    public C40581AeT(AnonymousClass8KO r1) {
        this.A00 = r1;
    }
}
